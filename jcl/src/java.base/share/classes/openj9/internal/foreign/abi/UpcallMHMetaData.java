/*[INCLUDE-IF JAVA_SPEC_VERSION >= 20]*/
/*******************************************************************************
 * Copyright IBM Corp. and others 2022
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] https://openjdk.org/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0-only WITH Classpath-exception-2.0 OR GPL-2.0-only WITH OpenJDK-assembly-exception-1.0
 *******************************************************************************/
package openj9.internal.foreign.abi;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
/*[IF JAVA_SPEC_VERSION >= 21]*/
import java.util.Optional;
/*[ENDIF] JAVA_SPEC_VERSION >= 21 */

/*[IF JAVA_SPEC_VERSION >= 20]*/
/*[IF JAVA_SPEC_VERSION >= 21]*/
import java.lang.foreign.AddressLayout;
/*[ENDIF] JAVA_SPEC_VERSION >= 21 */
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/*[IF JAVA_SPEC_VERSION >= 21]*/
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment.Scope;
import jdk.internal.foreign.Utils;
import jdk.internal.foreign.abi.LinkerOptions;
/*[ELSE] JAVA_SPEC_VERSION >= 21 */
import java.lang.foreign.SegmentScope;
/*[ENDIF] JAVA_SPEC_VERSION >= 21 */
import jdk.internal.foreign.MemorySessionImpl;
/*[ELSE] JAVA_SPEC_VERSION >= 20 */
import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
/*[ENDIF] JAVA_SPEC_VERSION >= 20 */

/**
 * The meta data consists of the callee MH and a cache of 2 elements for MH resolution,
 * which are used to generate an upcall handler to the requested java method.
 */
@SuppressWarnings("nls")
final class UpcallMHMetaData {

	/* The target method handle intended for upcall which is placed on the java stack
	 * in native2InterpJavaUpcallImpl for call-in so as to invoke the method handle.
	 */
	private final MethodHandle calleeMH;
	/* The method type of the target method handle which is mainly used by
	 * MethodHandleResolver.upcallLinkCallerMethod() to populate
	 * the cache array as below.
	 */
	private final MethodType calleeType;
	/* The cache array store MemberName and appendix which are populated
	 * by MethodHandleResolver.upcallLinkCallerMethod().
	 */
	private Object[] invokeCache;
	/* The argument array stores the memory specific argument (struct/pointer) object
	 * being allocated in native for upcall to stop GC from updating the previously
	 * allocated argument reference when allocating the next argument.
	 */
	private Object[] nativeArgArray;

	/*[IF JAVA_SPEC_VERSION >= 21]*/
	private Scope scope;
	/*[ELSEIF JAVA_SPEC_VERSION == 20]*/
	private SegmentScope scope;
	/*[ELSE] JAVA_SPEC_VERSION >= 21 */
	private ResourceScope scope;
	/*[ENDIF] JAVA_SPEC_VERSION >= 21 */

	private static synchronized native void resolveUpcallDataInfo();

	static {
		/* Resolve the methods/fields (offset in the JCL constant pool of VM) related to the metadata
		 * given the generated macros from vmconstantpool.xml depend on their offsets to access the
		 * corresponding methods/fields in the process of the upcall.
		 */
		resolveUpcallDataInfo();
	}

	/*[IF JAVA_SPEC_VERSION >= 21]*/
	UpcallMHMetaData(MethodHandle targetHandle, int nativeArgCount, Scope scope, LinkerOptions options)
	/*[ELSEIF JAVA_SPEC_VERSION == 20]*/
	UpcallMHMetaData(MethodHandle targetHandle, int nativeArgCount, SegmentScope scope)
	/*[ELSE] JAVA_SPEC_VERSION >= 21 */
	UpcallMHMetaData(MethodHandle targetHandle, int nativeArgCount, ResourceScope scope)
	/*[ENDIF] JAVA_SPEC_VERSION >= 21 */
	{
		calleeMH = targetHandle;
		calleeType = targetHandle.type();
		nativeArgArray = new Object[nativeArgCount];
		/* Only hold the confined scope (owned by the current thread) or
		 * the global scope (created once and shared by any thread) will
		 * be used to construct a MemorySegment object for argument in
		 * the upcall dispatcher.
		 */
		/*[IF JAVA_SPEC_VERSION >= 21]*/
		this.scope = ((scope != null) && (((MemorySessionImpl)scope).ownerThread() != null)) ? scope : Arena.global().scope();
		/*[ELSEIF JAVA_SPEC_VERSION == 20]*/
		this.scope = ((scope != null) && (((MemorySessionImpl)scope).ownerThread() != null)) ? scope : SegmentScope.global();
		/*[ELSE] JAVA_SPEC_VERSION >= 21 */
		this.scope = ((scope != null) && (scope.ownerThread() != null)) ? scope : ResourceScope.globalScope();
		/*[ENDIF] JAVA_SPEC_VERSION >= 21 */
	}

	/*[IF JAVA_SPEC_VERSION >= 21]*/
	/* Determine whether or not the native address of the passed-in/returned pointer is aligned against
	 * its target layout's alignment and return its segment object if valid.
	 *
	 * Note:
	 * The method is shared in downcall and upcall.
	 */
	static MemorySegment getArgRetAlignedSegmentOfPtr(long addrValue, MemoryLayout layout) {
		AddressLayout addrLayout = (AddressLayout)layout;
		Optional<MemoryLayout> targetLayout = addrLayout.targetLayout();
		if (!targetLayout.isEmpty()
			&& !Utils.isAligned(addrValue, targetLayout.get().byteAlignment())
		) {
			throw new IllegalArgumentException("The alignment constraint for address (" + addrValue + ") is invalid.");
		}
		return MemorySegment.ofAddress(addrValue).reinterpret(Utils.pointeeByteSize(addrLayout));
	}
	/*[ENDIF] JAVA_SPEC_VERSION >= 21 */

	/* Determine whether the memory segment (JDK20+) or the memory address (JDK17)
	 * of the passed-in/returned pointer is allocated in the native memory or not.
	 *
	 * Note:
	 * The method is shared in downcall and upcall.
	 */
	/*[IF JAVA_SPEC_VERSION >= 20]*/
	static void validateNativeArgRetSegmentOfPtr(MemorySegment argRetSegmentOfPtr) {
		if (argRetSegmentOfPtr == null) {
			throw new NullPointerException("A null pointer is not allowed.");
		}
		if (!argRetSegmentOfPtr.isNative()) {
			throw new IllegalArgumentException("Heap segment not allowed: " + argRetSegmentOfPtr);
		}
	}
	/*[ELSE] JAVA_SPEC_VERSION >= 20 */
	static void validateNativeArgRetAddrOfPtr(MemoryAddress argRetAddrOfPtr) {
		if (argRetAddrOfPtr == null) {
			throw new NullPointerException("A null pointer is not allowed.");
		}
		if (!argRetAddrOfPtr.isNative()) {
			throw new IllegalArgumentException("A heap address is not allowed: " + argRetAddrOfPtr);
		}
	}
	/*[ENDIF] JAVA_SPEC_VERSION >= 20 */

	/* Determine whether the passed-in/returned segment is allocated in the native memory or not
	 * and return the segment if valid; otherwise, return the newly allocated native segment with
	 * all values copied from the heap segment.
	 *
	 * Note:
	 * The method is shared in downcall and upcall.
	 */
	static MemorySegment getNativeArgRetSegment(MemorySegment argRetSegment) {
		if (argRetSegment == null) {
			throw new NullPointerException("A null value is not allowed for struct.");
		}
		/*[IF JAVA_SPEC_VERSION >= 20]*/
		/* MemorySegment.NULL is introduced since JDK20+. */
		if (argRetSegment == MemorySegment.NULL) {
			throw new NullPointerException("A NULL memory segment is not allowed for struct.");
		}
		/*[ENDIF] JAVA_SPEC_VERSION >= 20 */
		MemorySegment nativeSegment = argRetSegment;

		/* Copy all values in the heap segment to a newly allocated native segment
		 * given a heap segment with a zero address can't be accessed in native.
		 */
		if (!argRetSegment.isNative()) {
			/*[IF JAVA_SPEC_VERSION >= 21]*/
			/* Use Arena.allocate() to allocate the native segment given
			 * MemorySegment.allocateNative() is removed since JDK21+.
			 */
			nativeSegment = Arena.global().allocate(argRetSegment.byteSize());
			/*[ELSEIF JAVA_SPEC_VERSION == 20]*/
			nativeSegment = MemorySegment.allocateNative(argRetSegment.byteSize(), SegmentScope.global());
			/*[ELSE] JAVA_SPEC_VERSION >= 21 */
			nativeSegment = MemorySegment.allocateNative(argRetSegment.byteSize(), ResourceScope.globalScope());
			/*[ENDIF] JAVA_SPEC_VERSION >= 21 */
			nativeSegment.copyFrom(argRetSegment);
		}

		return nativeSegment;
	}
}
