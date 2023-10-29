#!/bin/sh

#
# Copyright IBM Corp. and others 2023
#
# This program and the accompanying materials are made available under
# the terms of the Eclipse Public License 2.0 which accompanies this
# distribution and is available at https://www.eclipse.org/legal/epl-2.0/
# or the Apache License, Version 2.0 which accompanies this distribution and
# is available at https://www.apache.org/licenses/LICENSE-2.0.
#
# This Source Code may also be made available under the following
# Secondary Licenses when the conditions for such availability set
# forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
# General Public License, version 2 with the GNU Classpath
# Exception [1] and GNU General Public License, version 2 with the
# OpenJDK Assembly Exception [2].
#
# [1] https://www.gnu.org/software/classpath/license.html
# [2] https://openjdk.org/legal/assembly-exception.html
#
# SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0-only WITH Classpath-exception-2.0 OR GPL-2.0-only WITH OpenJDK-assembly-exception-1.0
#

echo "start running script";
# the expected arguments are:
# $1 is the VLOG_TO_CAT
# $2 is the CHECK_PREVIOUS_TEST_OUTPUT
# $3 is the DELETE_PREV_TEST_OUTPUT

cat_prev_output() {
    echo "Outputting previous test output"
    cat testOutput criuOutput
    echo ""
}

if [ -f "$1" ]; then
    echo "Outputting vlog $1"
    cat $1
    echo ""

    if [ "$2" == true ]; then
        cat_prev_output
    fi
else
    if [ "$2" == true ]; then
        echo "vlog $1 does not exist"
        echo ""

        cat_prev_output

        $(grep -q "Thread pid mismatch\|do not match expected\|Unable to create a thread:" testOutput criuOutput)
        if [ $? -eq 0 ]; then
            echo "CAT VLOG FORCE PASS"
        fi
    fi
fi

if [ "$3" == true ]; then
    rm -rf testOutput criuOutput
    echo "Removed test output files"
fi

echo "finished script";
