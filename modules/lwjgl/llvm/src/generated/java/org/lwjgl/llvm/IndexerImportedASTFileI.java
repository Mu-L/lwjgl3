/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("CXIdxClientASTFile (*) (CXClientData, CXIdxImportedASTFileInfo const *)")
public interface IndexerImportedASTFileI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code CXIdxClientASTFile (*) (CXClientData client_data, CXIdxImportedASTFileInfo const * info)} */
    @NativeType("CXIdxClientASTFile") long invoke(@NativeType("CXClientData") long client_data, @NativeType("CXIdxImportedASTFileInfo const *") long info);

}