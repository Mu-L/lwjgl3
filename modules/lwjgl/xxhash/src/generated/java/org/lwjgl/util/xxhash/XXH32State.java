/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.xxhash;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XXH32_state_t {
 *     XXH32_hash_t total_len_32;
 *     XXH32_hash_t large_len;
 *     XXH32_hash_t acc[4];
 *     unsigned char buffer[16];
 *     XXH32_hash_t bufferedSize;
 *     XXH32_hash_t reserved;
 * }}</pre>
 */
@NativeType("struct XXH32_state_t")
public class XXH32State extends Struct<XXH32State> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TOTAL_LEN_32,
        LARGE_LEN,
        ACC,
        BUFFER,
        BUFFEREDSIZE,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(4, 4),
            __array(1, 16),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TOTAL_LEN_32 = layout.offsetof(0);
        LARGE_LEN = layout.offsetof(1);
        ACC = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        BUFFEREDSIZE = layout.offsetof(4);
        RESERVED = layout.offsetof(5);
    }

    protected XXH32State(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XXH32State create(long address, @Nullable ByteBuffer container) {
        return new XXH32State(address, container);
    }

    /**
     * Creates a {@code XXH32State} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XXH32State(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code total_len_32} field. */
    @NativeType("XXH32_hash_t")
    public int total_len_32() { return ntotal_len_32(address()); }
    /** @return the value of the {@code large_len} field. */
    @NativeType("XXH32_hash_t")
    public int large_len() { return nlarge_len(address()); }
    /** @return a {@link IntBuffer} view of the {@code acc} field. */
    @NativeType("XXH32_hash_t[4]")
    public IntBuffer acc() { return nacc(address()); }
    /** @return the value at the specified index of the {@code acc} field. */
    @NativeType("XXH32_hash_t")
    public int acc(int index) { return nacc(address(), index); }
    /** @return a {@link ByteBuffer} view of the {@code buffer} field. */
    @NativeType("unsigned char[16]")
    public ByteBuffer buffer() { return nbuffer(address()); }
    /** @return the value at the specified index of the {@code buffer} field. */
    @NativeType("unsigned char")
    public byte buffer(int index) { return nbuffer(address(), index); }
    /** @return the value of the {@code bufferedSize} field. */
    @NativeType("XXH32_hash_t")
    public int bufferedSize() { return nbufferedSize(address()); }
    /** @return the value of the {@code reserved} field. */
    @NativeType("XXH32_hash_t")
    public int reserved() { return nreserved(address()); }

    // -----------------------------------

    /** Returns a new {@code XXH32State} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XXH32State malloc() {
        return new XXH32State(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XXH32State} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XXH32State calloc() {
        return new XXH32State(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XXH32State} instance allocated with {@link BufferUtils}. */
    public static XXH32State create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XXH32State(memAddress(container), container);
    }

    /** Returns a new {@code XXH32State} instance for the specified memory address. */
    public static XXH32State create(long address) {
        return new XXH32State(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XXH32State createSafe(long address) {
        return address == NULL ? null : new XXH32State(address, null);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XXH32State.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XXH32State.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH32State mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH32State callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XXH32State mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XXH32State callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH32State.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH32State.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH32State.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XXH32State.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XXH32State} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH32State malloc(MemoryStack stack) {
        return new XXH32State(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XXH32State} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XXH32State calloc(MemoryStack stack) {
        return new XXH32State(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XXH32State.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XXH32State.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #total_len_32}. */
    public static int ntotal_len_32(long struct) { return memGetInt(struct + XXH32State.TOTAL_LEN_32); }
    /** Unsafe version of {@link #large_len}. */
    public static int nlarge_len(long struct) { return memGetInt(struct + XXH32State.LARGE_LEN); }
    /** Unsafe version of {@link #acc}. */
    public static IntBuffer nacc(long struct) { return memIntBuffer(struct + XXH32State.ACC, 4); }
    /** Unsafe version of {@link #acc(int) acc}. */
    public static int nacc(long struct, int index) {
        return memGetInt(struct + XXH32State.ACC + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(struct + XXH32State.BUFFER, 16); }
    /** Unsafe version of {@link #buffer(int) buffer}. */
    public static byte nbuffer(long struct, int index) {
        return memGetByte(struct + XXH32State.BUFFER + check(index, 16) * 1);
    }
    /** Unsafe version of {@link #bufferedSize}. */
    public static int nbufferedSize(long struct) { return memGetInt(struct + XXH32State.BUFFEREDSIZE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + XXH32State.RESERVED); }

    // -----------------------------------

    /** An array of {@link XXH32State} structs. */
    public static class Buffer extends StructBuffer<XXH32State, Buffer> implements NativeResource {

        private static final XXH32State ELEMENT_FACTORY = XXH32State.create(-1L);

        /**
         * Creates a new {@code XXH32State.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XXH32State#SIZEOF}, and its mark will be undefined.</p>
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
        protected XXH32State getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code total_len_32} field. */
        @NativeType("XXH32_hash_t")
        public int total_len_32() { return XXH32State.ntotal_len_32(address()); }
        /** @return the value of the {@code large_len} field. */
        @NativeType("XXH32_hash_t")
        public int large_len() { return XXH32State.nlarge_len(address()); }
        /** @return a {@link IntBuffer} view of the {@code acc} field. */
        @NativeType("XXH32_hash_t[4]")
        public IntBuffer acc() { return XXH32State.nacc(address()); }
        /** @return the value at the specified index of the {@code acc} field. */
        @NativeType("XXH32_hash_t")
        public int acc(int index) { return XXH32State.nacc(address(), index); }
        /** @return a {@link ByteBuffer} view of the {@code buffer} field. */
        @NativeType("unsigned char[16]")
        public ByteBuffer buffer() { return XXH32State.nbuffer(address()); }
        /** @return the value at the specified index of the {@code buffer} field. */
        @NativeType("unsigned char")
        public byte buffer(int index) { return XXH32State.nbuffer(address(), index); }
        /** @return the value of the {@code bufferedSize} field. */
        @NativeType("XXH32_hash_t")
        public int bufferedSize() { return XXH32State.nbufferedSize(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("XXH32_hash_t")
        public int reserved() { return XXH32State.nreserved(address()); }

    }

}