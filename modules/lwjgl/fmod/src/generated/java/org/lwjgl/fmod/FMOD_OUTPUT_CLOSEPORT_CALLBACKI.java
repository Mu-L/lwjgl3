/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FMOD_OUTPUT_CLOSEPORT_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_OUTPUT_CLOSEPORT_CALLBACK")
public interface FMOD_OUTPUT_CLOSEPORT_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_OUTPUT_CLOSEPORT_CALLBACK) (struct FMOD_OUTPUT_STATE * output_state, int portId)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_OUTPUT_STATE *") long output_state, int portId);

}