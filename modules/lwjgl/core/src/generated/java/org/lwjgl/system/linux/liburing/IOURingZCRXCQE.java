/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_uring_zcrx_cqe {
 *     __u64 off;
 *     __u64 __pad;
 * }}</pre>
 */
@NativeType("struct io_uring_zcrx_cqe")
public class IOURingZCRXCQE extends Struct<IOURingZCRXCQE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFF,
        __PAD;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFF = layout.offsetof(0);
        __PAD = layout.offsetof(1);
    }

    protected IOURingZCRXCQE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXCQE create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXCQE(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXCQE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXCQE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code off} field. */
    @NativeType("__u64")
    public long off() { return noff(address()); }

    /** Sets the specified value to the {@code off} field. */
    public IOURingZCRXCQE off(@NativeType("__u64") long value) { noff(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingZCRXCQE set(IOURingZCRXCQE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXCQE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingZCRXCQE malloc() {
        return new IOURingZCRXCQE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXCQE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingZCRXCQE calloc() {
        return new IOURingZCRXCQE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXCQE} instance allocated with {@link BufferUtils}. */
    public static IOURingZCRXCQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXCQE(memAddress(container), container);
    }

    /** Returns a new {@code IOURingZCRXCQE} instance for the specified memory address. */
    public static IOURingZCRXCQE create(long address) {
        return new IOURingZCRXCQE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXCQE createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXCQE(address, null);
    }

    /**
     * Returns a new {@link IOURingZCRXCQE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCQE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCQE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCQE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCQE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCQE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingZCRXCQE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCQE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXCQE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingZCRXCQE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXCQE malloc(MemoryStack stack) {
        return new IOURingZCRXCQE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingZCRXCQE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXCQE calloc(MemoryStack stack) {
        return new IOURingZCRXCQE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingZCRXCQE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCQE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXCQE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXCQE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #off}. */
    public static long noff(long struct) { return memGetLong(struct + IOURingZCRXCQE.OFF); }
    public static long n__pad(long struct) { return memGetLong(struct + IOURingZCRXCQE.__PAD); }

    /** Unsafe version of {@link #off(long) off}. */
    public static void noff(long struct, long value) { memPutLong(struct + IOURingZCRXCQE.OFF, value); }
    public static void n__pad(long struct, long value) { memPutLong(struct + IOURingZCRXCQE.__PAD, value); }

    // -----------------------------------

    /** An array of {@link IOURingZCRXCQE} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXCQE, Buffer> implements NativeResource {

        private static final IOURingZCRXCQE ELEMENT_FACTORY = IOURingZCRXCQE.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXCQE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXCQE#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingZCRXCQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code off} field. */
        @NativeType("__u64")
        public long off() { return IOURingZCRXCQE.noff(address()); }

        /** Sets the specified value to the {@code off} field. */
        public IOURingZCRXCQE.Buffer off(@NativeType("__u64") long value) { IOURingZCRXCQE.noff(address(), value); return this; }

    }

}