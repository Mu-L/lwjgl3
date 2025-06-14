/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

DISABLE_WARNINGS()
#define FFI_STATIC_BUILD
#include "ffi.h"
ENABLE_WARNINGS()
typedef void (*FFI_FN_TYPE)(void);
typedef void (*FFI_CLOSURE_FUN)(ffi_cif*, void*, void**, void*);

#ifndef HAS_FFI_WIN64
#define FFI_WIN64 -1
#endif
#ifndef HAS_FFI_GNUW64
#define FFI_GNUW64 -1
#endif
#ifndef HAS_FFI_UNIX64
#define FFI_UNIX64 -1
#endif
#ifndef HAS_FFI_EFI64
#define FFI_EFI64 -1
#endif
#ifndef HAS_FFI_SYSV
#define FFI_SYSV -1
#endif
#ifndef HAS_FFI_STDCALL
#define FFI_STDCALL -1
#endif
#ifndef HAS_FFI_THISCALL
#define FFI_THISCALL -1
#endif
#ifndef HAS_FFI_FASTCALL
#define FFI_FASTCALL -1
#endif
#ifndef HAS_FFI_MS_CDECL
#define FFI_MS_CDECL -1
#endif
#ifndef HAS_FFI_PASCAL
#define FFI_PASCAL -1
#endif
#ifndef HAS_FFI_REGISTER
#define FFI_REGISTER -1
#endif
#ifndef HAS_FFI_VFP
#define FFI_VFP -1
#endif

EXTERN_C_ENTER

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1TYPE_1DOUBLE(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)FFI_TYPE_DOUBLE;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1WIN64(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_WIN64;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1GNUW64(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_GNUW64;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1UNIX64(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_UNIX64;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1EFI64(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_EFI64;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1SYSV(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_SYSV;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1STDCALL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_STDCALL;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1THISCALL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_THISCALL;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1FASTCALL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_FASTCALL;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1MS_1CDECL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_MS_CDECL;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1PASCAL(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_PASCAL;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1REGISTER(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_REGISTER;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1VFP(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_VFP;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1FIRST_1ABI(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_FIRST_ABI;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1LAST_1ABI(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_LAST_ABI;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_FFI_1DEFAULT_1ABI(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)FFI_DEFAULT_ABI;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1void(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_void;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1uint8(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_uint8;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1sint8(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_sint8;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1uint16(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_uint16;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1sint16(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_sint16;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1uint32(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_uint32;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1sint32(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_sint32;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1uint64(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_uint64;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1sint64(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_sint64;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1uchar(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_uchar;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1schar(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_schar;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1ushort(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_ushort;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1sshort(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_sshort;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1uint(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_uint;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1sint(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_sint;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1ulong(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_ulong;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1slong(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_slong;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1float(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_float;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1double(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_double;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1longdouble(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_longdouble;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1type_1pointer(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)&ffi_type_pointer;
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1get_1version(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)ffi_get_version();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_ffi_1get_1version_1number(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ffi_get_version_number();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_ffi_1get_1default_1abi(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jint)ffi_get_default_abi();
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1prep_1cif(JNIEnv *__env, jclass clazz, jlong cifAddress, jint abi, jint nargs, jlong rtypeAddress, jlong atypesAddress) {
    ffi_cif *cif = (ffi_cif *)(uintptr_t)cifAddress;
    ffi_type *rtype = (ffi_type *)(uintptr_t)rtypeAddress;
    ffi_type **atypes = (ffi_type **)(uintptr_t)atypesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ffi_prep_cif(cif, (ffi_abi)abi, (unsigned int)nargs, rtype, atypes);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1prep_1cif_1var(JNIEnv *__env, jclass clazz, jlong cifAddress, jint abi, jint nfixedargs, jint ntotalargs, jlong rtypeAddress, jlong atypesAddress) {
    ffi_cif *cif = (ffi_cif *)(uintptr_t)cifAddress;
    ffi_type *rtype = (ffi_type *)(uintptr_t)rtypeAddress;
    ffi_type **atypes = (ffi_type **)(uintptr_t)atypesAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ffi_prep_cif_var(cif, (ffi_abi)abi, (unsigned int)nfixedargs, (unsigned int)ntotalargs, rtype, atypes);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1call(JNIEnv *__env, jclass clazz, jlong cifAddress, jlong fnAddress, jlong rvalueAddress, jlong avaluesAddress) {
    ffi_cif *cif = (ffi_cif *)(uintptr_t)cifAddress;
    FFI_FN_TYPE fn = (FFI_FN_TYPE)(uintptr_t)fnAddress;
    void *rvalue = (void *)(uintptr_t)rvalueAddress;
    void **avalues = (void **)(uintptr_t)avaluesAddress;
    UNUSED_PARAMS(__env, clazz)
    ffi_call(cif, fn, rvalue, avalues);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1get_1struct_1offsets(JNIEnv *__env, jclass clazz, jint abi, jlong struct_typeAddress, jlong offsetsAddress) {
    ffi_type *struct_type = (ffi_type *)(uintptr_t)struct_typeAddress;
    size_t *offsets = (size_t *)(uintptr_t)offsetsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ffi_get_struct_offsets((ffi_abi)abi, struct_type, offsets);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_ffi_1get_1closure_1size(JNIEnv *__env, jclass clazz) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)ffi_get_closure_size();
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1closure_1alloc(JNIEnv *__env, jclass clazz, jlong size, jlong codeAddress) {
    void **code = (void **)(uintptr_t)codeAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)ffi_closure_alloc((size_t)size, code);
}

JNIEXPORT void JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1closure_1free(JNIEnv *__env, jclass clazz, jlong writableAddress) {
    ffi_closure *writable = (ffi_closure *)(uintptr_t)writableAddress;
    UNUSED_PARAMS(__env, clazz)
    ffi_closure_free(writable);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_system_libffi_LibFFI_nffi_1prep_1closure_1loc(JNIEnv *__env, jclass clazz, jlong closureAddress, jlong cifAddress, jlong funAddress, jlong user_dataAddress, jlong codelocAddress) {
    ffi_closure *closure = (ffi_closure *)(uintptr_t)closureAddress;
    ffi_cif *cif = (ffi_cif *)(uintptr_t)cifAddress;
    FFI_CLOSURE_FUN fun = (FFI_CLOSURE_FUN)(uintptr_t)funAddress;
    void *user_data = (void *)(uintptr_t)user_dataAddress;
    void *codeloc = (void *)(uintptr_t)codelocAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)ffi_prep_closure_loc(closure, cif, fun, user_data, codeloc);
}

EXTERN_C_EXIT
