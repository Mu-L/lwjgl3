/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct HARDWAREINPUT {
 *     DWORD uMsg;
 *     WORD wParamL;
 *     WORD wParamH;
 * }}</pre>
 */
public class HARDWAREINPUT extends Struct<HARDWAREINPUT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UMSG,
        WPARAML,
        WPARAMH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UMSG = layout.offsetof(0);
        WPARAML = layout.offsetof(1);
        WPARAMH = layout.offsetof(2);
    }

    protected HARDWAREINPUT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected HARDWAREINPUT create(long address, @Nullable ByteBuffer container) {
        return new HARDWAREINPUT(address, container);
    }

    /**
     * Creates a {@code HARDWAREINPUT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public HARDWAREINPUT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code uMsg} field. */
    @NativeType("DWORD")
    public int uMsg() { return nuMsg(address()); }
    /** @return the value of the {@code wParamL} field. */
    @NativeType("WORD")
    public short wParamL() { return nwParamL(address()); }
    /** @return the value of the {@code wParamH} field. */
    @NativeType("WORD")
    public short wParamH() { return nwParamH(address()); }

    /** Sets the specified value to the {@code uMsg} field. */
    public HARDWAREINPUT uMsg(@NativeType("DWORD") int value) { nuMsg(address(), value); return this; }
    /** Sets the specified value to the {@code wParamL} field. */
    public HARDWAREINPUT wParamL(@NativeType("WORD") short value) { nwParamL(address(), value); return this; }
    /** Sets the specified value to the {@code wParamH} field. */
    public HARDWAREINPUT wParamH(@NativeType("WORD") short value) { nwParamH(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public HARDWAREINPUT set(
        int uMsg,
        short wParamL,
        short wParamH
    ) {
        uMsg(uMsg);
        wParamL(wParamL);
        wParamH(wParamH);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public HARDWAREINPUT set(HARDWAREINPUT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code HARDWAREINPUT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static HARDWAREINPUT malloc() {
        return new HARDWAREINPUT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code HARDWAREINPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static HARDWAREINPUT calloc() {
        return new HARDWAREINPUT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code HARDWAREINPUT} instance allocated with {@link BufferUtils}. */
    public static HARDWAREINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new HARDWAREINPUT(memAddress(container), container);
    }

    /** Returns a new {@code HARDWAREINPUT} instance for the specified memory address. */
    public static HARDWAREINPUT create(long address) {
        return new HARDWAREINPUT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable HARDWAREINPUT createSafe(long address) {
        return address == NULL ? null : new HARDWAREINPUT(address, null);
    }

    /**
     * Returns a new {@link HARDWAREINPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HARDWAREINPUT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link HARDWAREINPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static HARDWAREINPUT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HARDWAREINPUT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static HARDWAREINPUT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link HARDWAREINPUT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static HARDWAREINPUT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static HARDWAREINPUT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HARDWAREINPUT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HARDWAREINPUT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static HARDWAREINPUT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static HARDWAREINPUT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HARDWAREINPUT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HARDWAREINPUT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static HARDWAREINPUT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static HARDWAREINPUT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code HARDWAREINPUT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static HARDWAREINPUT malloc(MemoryStack stack) {
        return new HARDWAREINPUT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code HARDWAREINPUT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static HARDWAREINPUT calloc(MemoryStack stack) {
        return new HARDWAREINPUT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link HARDWAREINPUT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HARDWAREINPUT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link HARDWAREINPUT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static HARDWAREINPUT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #uMsg}. */
    public static int nuMsg(long struct) { return memGetInt(struct + HARDWAREINPUT.UMSG); }
    /** Unsafe version of {@link #wParamL}. */
    public static short nwParamL(long struct) { return memGetShort(struct + HARDWAREINPUT.WPARAML); }
    /** Unsafe version of {@link #wParamH}. */
    public static short nwParamH(long struct) { return memGetShort(struct + HARDWAREINPUT.WPARAMH); }

    /** Unsafe version of {@link #uMsg(int) uMsg}. */
    public static void nuMsg(long struct, int value) { memPutInt(struct + HARDWAREINPUT.UMSG, value); }
    /** Unsafe version of {@link #wParamL(short) wParamL}. */
    public static void nwParamL(long struct, short value) { memPutShort(struct + HARDWAREINPUT.WPARAML, value); }
    /** Unsafe version of {@link #wParamH(short) wParamH}. */
    public static void nwParamH(long struct, short value) { memPutShort(struct + HARDWAREINPUT.WPARAMH, value); }

    // -----------------------------------

    /** An array of {@link HARDWAREINPUT} structs. */
    public static class Buffer extends StructBuffer<HARDWAREINPUT, Buffer> implements NativeResource {

        private static final HARDWAREINPUT ELEMENT_FACTORY = HARDWAREINPUT.create(-1L);

        /**
         * Creates a new {@code HARDWAREINPUT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link HARDWAREINPUT#SIZEOF}, and its mark will be undefined.</p>
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
        protected HARDWAREINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code uMsg} field. */
        @NativeType("DWORD")
        public int uMsg() { return HARDWAREINPUT.nuMsg(address()); }
        /** @return the value of the {@code wParamL} field. */
        @NativeType("WORD")
        public short wParamL() { return HARDWAREINPUT.nwParamL(address()); }
        /** @return the value of the {@code wParamH} field. */
        @NativeType("WORD")
        public short wParamH() { return HARDWAREINPUT.nwParamH(address()); }

        /** Sets the specified value to the {@code uMsg} field. */
        public HARDWAREINPUT.Buffer uMsg(@NativeType("DWORD") int value) { HARDWAREINPUT.nuMsg(address(), value); return this; }
        /** Sets the specified value to the {@code wParamL} field. */
        public HARDWAREINPUT.Buffer wParamL(@NativeType("WORD") short value) { HARDWAREINPUT.nwParamL(address(), value); return this; }
        /** Sets the specified value to the {@code wParamH} field. */
        public HARDWAREINPUT.Buffer wParamH(@NativeType("WORD") short value) { HARDWAREINPUT.nwParamH(address(), value); return this; }

    }

}