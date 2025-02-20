/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct JAWT_DrawingSurface {
 *     JNIEnv * env;
 *     jobject target;
 *     void * Lock;
 *     void * GetDrawingSurfaceInfo;
 *     void * FreeDrawingSurfaceInfo;
 *     void * Unlock;
 * }}</pre>
 */
@NativeType("struct JAWT_DrawingSurface")
public class JAWTDrawingSurface extends Struct<JAWTDrawingSurface> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ENV,
        TARGET,
        LOCK,
        GETDRAWINGSURFACEINFO,
        FREEDRAWINGSURFACEINFO,
        UNLOCK;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ENV = layout.offsetof(0);
        TARGET = layout.offsetof(1);
        LOCK = layout.offsetof(2);
        GETDRAWINGSURFACEINFO = layout.offsetof(3);
        FREEDRAWINGSURFACEINFO = layout.offsetof(4);
        UNLOCK = layout.offsetof(5);
    }

    protected JAWTDrawingSurface(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected JAWTDrawingSurface create(long address, @Nullable ByteBuffer container) {
        return new JAWTDrawingSurface(address, container);
    }

    /**
     * Creates a {@code JAWTDrawingSurface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JAWTDrawingSurface(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code env} field. */
    @NativeType("JNIEnv *")
    public long env() { return nenv(address()); }
    /** @return the value of the {@code target} field. */
    @NativeType("jobject")
    public long target() { return ntarget(address()); }
    /** @return the value of the {@code Lock} field. */
    @NativeType("void *")
    public long Lock() { return nLock(address()); }
    /** @return the value of the {@code GetDrawingSurfaceInfo} field. */
    @NativeType("void *")
    public long GetDrawingSurfaceInfo() { return nGetDrawingSurfaceInfo(address()); }
    /** @return the value of the {@code FreeDrawingSurfaceInfo} field. */
    @NativeType("void *")
    public long FreeDrawingSurfaceInfo() { return nFreeDrawingSurfaceInfo(address()); }
    /** @return the value of the {@code Unlock} field. */
    @NativeType("void *")
    public long Unlock() { return nUnlock(address()); }

    // -----------------------------------

    /** Returns a new {@code JAWTDrawingSurface} instance for the specified memory address. */
    public static JAWTDrawingSurface create(long address) {
        return new JAWTDrawingSurface(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable JAWTDrawingSurface createSafe(long address) {
        return address == NULL ? null : new JAWTDrawingSurface(address, null);
    }

    /**
     * Create a {@link JAWTDrawingSurface.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JAWTDrawingSurface.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static JAWTDrawingSurface.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #env}. */
    public static long nenv(long struct) { return memGetAddress(struct + JAWTDrawingSurface.ENV); }
    /** Unsafe version of {@link #target}. */
    public static long ntarget(long struct) { return memGetAddress(struct + JAWTDrawingSurface.TARGET); }
    /** Unsafe version of {@link #Lock}. */
    public static long nLock(long struct) { return memGetAddress(struct + JAWTDrawingSurface.LOCK); }
    /** Unsafe version of {@link #GetDrawingSurfaceInfo}. */
    public static long nGetDrawingSurfaceInfo(long struct) { return memGetAddress(struct + JAWTDrawingSurface.GETDRAWINGSURFACEINFO); }
    /** Unsafe version of {@link #FreeDrawingSurfaceInfo}. */
    public static long nFreeDrawingSurfaceInfo(long struct) { return memGetAddress(struct + JAWTDrawingSurface.FREEDRAWINGSURFACEINFO); }
    /** Unsafe version of {@link #Unlock}. */
    public static long nUnlock(long struct) { return memGetAddress(struct + JAWTDrawingSurface.UNLOCK); }

    // -----------------------------------

    /** An array of {@link JAWTDrawingSurface} structs. */
    public static class Buffer extends StructBuffer<JAWTDrawingSurface, Buffer> {

        private static final JAWTDrawingSurface ELEMENT_FACTORY = JAWTDrawingSurface.create(-1L);

        /**
         * Creates a new {@code JAWTDrawingSurface.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JAWTDrawingSurface#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected JAWTDrawingSurface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code env} field. */
        @NativeType("JNIEnv *")
        public long env() { return JAWTDrawingSurface.nenv(address()); }
        /** @return the value of the {@code target} field. */
        @NativeType("jobject")
        public long target() { return JAWTDrawingSurface.ntarget(address()); }
        /** @return the value of the {@code Lock} field. */
        @NativeType("void *")
        public long Lock() { return JAWTDrawingSurface.nLock(address()); }
        /** @return the value of the {@code GetDrawingSurfaceInfo} field. */
        @NativeType("void *")
        public long GetDrawingSurfaceInfo() { return JAWTDrawingSurface.nGetDrawingSurfaceInfo(address()); }
        /** @return the value of the {@code FreeDrawingSurfaceInfo} field. */
        @NativeType("void *")
        public long FreeDrawingSurfaceInfo() { return JAWTDrawingSurface.nFreeDrawingSurfaceInfo(address()); }
        /** @return the value of the {@code Unlock} field. */
        @NativeType("void *")
        public long Unlock() { return JAWTDrawingSurface.nUnlock(address()); }

    }

}