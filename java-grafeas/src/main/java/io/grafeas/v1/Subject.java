/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/intoto_statement.proto

package io.grafeas.v1;

/** Protobuf type {@code grafeas.v1.Subject} */
public final class Subject extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.Subject)
    SubjectOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Subject.newBuilder() to construct.
  private Subject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Subject() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Subject();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.InTotoStatementProto.internal_static_grafeas_v1_Subject_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetDigest();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.InTotoStatementProto.internal_static_grafeas_v1_Subject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.Subject.class, io.grafeas.v1.Subject.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIGEST_FIELD_NUMBER = 2;

  private static final class DigestDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            io.grafeas.v1.InTotoStatementProto
                .internal_static_grafeas_v1_Subject_DigestEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> digest_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetDigest() {
    if (digest_ == null) {
      return com.google.protobuf.MapField.emptyMapField(DigestDefaultEntryHolder.defaultEntry);
    }
    return digest_;
  }

  public int getDigestCount() {
    return internalGetDigest().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */
  @java.lang.Override
  public boolean containsDigest(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetDigest().getMap().containsKey(key);
  }
  /** Use {@link #getDigestMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getDigest() {
    return getDigestMap();
  }
  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getDigestMap() {
    return internalGetDigest().getMap();
  }
  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getDigestOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetDigest().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getDigestOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetDigest().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetDigest(), DigestDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetDigest().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> digest__ =
          DigestDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, digest__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.grafeas.v1.Subject)) {
      return super.equals(obj);
    }
    io.grafeas.v1.Subject other = (io.grafeas.v1.Subject) obj;

    if (!getName().equals(other.getName())) return false;
    if (!internalGetDigest().equals(other.internalGetDigest())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetDigest().getMap().isEmpty()) {
      hash = (37 * hash) + DIGEST_FIELD_NUMBER;
      hash = (53 * hash) + internalGetDigest().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.Subject parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Subject parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Subject parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Subject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Subject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Subject parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Subject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Subject parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Subject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Subject parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Subject parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Subject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.grafeas.v1.Subject prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code grafeas.v1.Subject} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.Subject)
      io.grafeas.v1.SubjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.InTotoStatementProto.internal_static_grafeas_v1_Subject_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetDigest();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableDigest();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.InTotoStatementProto
          .internal_static_grafeas_v1_Subject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.Subject.class, io.grafeas.v1.Subject.Builder.class);
    }

    // Construct using io.grafeas.v1.Subject.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      internalGetMutableDigest().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.InTotoStatementProto.internal_static_grafeas_v1_Subject_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.Subject getDefaultInstanceForType() {
      return io.grafeas.v1.Subject.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.Subject build() {
      io.grafeas.v1.Subject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.Subject buildPartial() {
      io.grafeas.v1.Subject result = new io.grafeas.v1.Subject(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.Subject result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.digest_ = internalGetDigest();
        result.digest_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1.Subject) {
        return mergeFrom((io.grafeas.v1.Subject) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.Subject other) {
      if (other == io.grafeas.v1.Subject.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableDigest().mergeFrom(other.internalGetDigest());
      bitField0_ |= 0x00000002;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> digest__ =
                    input.readMessage(
                        DigestDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableDigest()
                    .getMutableMap()
                    .put(digest__.getKey(), digest__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> digest_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetDigest() {
      if (digest_ == null) {
        return com.google.protobuf.MapField.emptyMapField(DigestDefaultEntryHolder.defaultEntry);
      }
      return digest_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableDigest() {
      if (digest_ == null) {
        digest_ = com.google.protobuf.MapField.newMapField(DigestDefaultEntryHolder.defaultEntry);
      }
      if (!digest_.isMutable()) {
        digest_ = digest_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return digest_;
    }

    public int getDigestCount() {
      return internalGetDigest().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
     * Algorithms can be e.g. sha256, sha512
     * See
     * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * </pre>
     *
     * <code>map&lt;string, string&gt; digest = 2;</code>
     */
    @java.lang.Override
    public boolean containsDigest(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetDigest().getMap().containsKey(key);
    }
    /** Use {@link #getDigestMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getDigest() {
      return getDigestMap();
    }
    /**
     *
     *
     * <pre>
     * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
     * Algorithms can be e.g. sha256, sha512
     * See
     * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * </pre>
     *
     * <code>map&lt;string, string&gt; digest = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getDigestMap() {
      return internalGetDigest().getMap();
    }
    /**
     *
     *
     * <pre>
     * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
     * Algorithms can be e.g. sha256, sha512
     * See
     * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * </pre>
     *
     * <code>map&lt;string, string&gt; digest = 2;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getDigestOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetDigest().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
     * Algorithms can be e.g. sha256, sha512
     * See
     * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * </pre>
     *
     * <code>map&lt;string, string&gt; digest = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getDigestOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetDigest().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearDigest() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableDigest().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
     * Algorithms can be e.g. sha256, sha512
     * See
     * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * </pre>
     *
     * <code>map&lt;string, string&gt; digest = 2;</code>
     */
    public Builder removeDigest(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableDigest().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableDigest() {
      bitField0_ |= 0x00000002;
      return internalGetMutableDigest().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
     * Algorithms can be e.g. sha256, sha512
     * See
     * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * </pre>
     *
     * <code>map&lt;string, string&gt; digest = 2;</code>
     */
    public Builder putDigest(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableDigest().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
     * Algorithms can be e.g. sha256, sha512
     * See
     * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * </pre>
     *
     * <code>map&lt;string, string&gt; digest = 2;</code>
     */
    public Builder putAllDigest(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableDigest().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1.Subject)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.Subject)
  private static final io.grafeas.v1.Subject DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.Subject();
  }

  public static io.grafeas.v1.Subject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Subject> PARSER =
      new com.google.protobuf.AbstractParser<Subject>() {
        @java.lang.Override
        public Subject parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<Subject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Subject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.Subject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
