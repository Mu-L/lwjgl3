/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct OpusTags {
 *     char ** user_comments;
 *     int * comment_lengths;
 *     int comments;
 *     char * vendor;
 * }}</pre>
 */
public class OpusTags extends Struct<OpusTags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USER_COMMENTS,
        COMMENT_LENGTHS,
        COMMENTS,
        VENDOR;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USER_COMMENTS = layout.offsetof(0);
        COMMENT_LENGTHS = layout.offsetof(1);
        COMMENTS = layout.offsetof(2);
        VENDOR = layout.offsetof(3);
    }

    protected OpusTags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected OpusTags create(long address, @Nullable ByteBuffer container) {
        return new OpusTags(address, container);
    }

    /**
     * Creates a {@code OpusTags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OpusTags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code user_comments} field. */
    @NativeType("char **")
    public PointerBuffer user_comments() { return nuser_comments(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code comment_lengths} field. */
    @NativeType("int *")
    public IntBuffer comment_lengths() { return ncomment_lengths(address()); }
    /** @return the value of the {@code comments} field. */
    public int comments() { return ncomments(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code vendor} field. */
    @NativeType("char *")
    public ByteBuffer vendor() { return nvendor(address()); }
    /** @return the null-terminated string pointed to by the {@code vendor} field. */
    @NativeType("char *")
    public String vendorString() { return nvendorString(address()); }

    // -----------------------------------

    /** Returns a new {@code OpusTags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpusTags malloc() {
        return new OpusTags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code OpusTags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpusTags calloc() {
        return new OpusTags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code OpusTags} instance allocated with {@link BufferUtils}. */
    public static OpusTags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new OpusTags(memAddress(container), container);
    }

    /** Returns a new {@code OpusTags} instance for the specified memory address. */
    public static OpusTags create(long address) {
        return new OpusTags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable OpusTags createSafe(long address) {
        return address == NULL ? null : new OpusTags(address, null);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link OpusTags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static OpusTags.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code OpusTags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusTags malloc(MemoryStack stack) {
        return new OpusTags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code OpusTags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusTags calloc(MemoryStack stack) {
        return new OpusTags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusTags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusTags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #user_comments() user_comments}. */
    public static PointerBuffer nuser_comments(long struct) { return memPointerBuffer(memGetAddress(struct + OpusTags.USER_COMMENTS), ncomments(struct)); }
    /** Unsafe version of {@link #comment_lengths() comment_lengths}. */
    public static IntBuffer ncomment_lengths(long struct) { return memIntBuffer(memGetAddress(struct + OpusTags.COMMENT_LENGTHS), ncomments(struct)); }
    /** Unsafe version of {@link #comments}. */
    public static int ncomments(long struct) { return memGetInt(struct + OpusTags.COMMENTS); }
    /** Unsafe version of {@link #vendor}. */
    public static ByteBuffer nvendor(long struct) { return memByteBufferNT1(memGetAddress(struct + OpusTags.VENDOR)); }
    /** Unsafe version of {@link #vendorString}. */
    public static String nvendorString(long struct) { return memUTF8(memGetAddress(struct + OpusTags.VENDOR)); }

    // -----------------------------------

    /** An array of {@link OpusTags} structs. */
    public static class Buffer extends StructBuffer<OpusTags, Buffer> implements NativeResource {

        private static final OpusTags ELEMENT_FACTORY = OpusTags.create(-1L);

        /**
         * Creates a new {@code OpusTags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpusTags#SIZEOF}, and its mark will be undefined.</p>
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
        protected OpusTags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code user_comments} field. */
        @NativeType("char **")
        public PointerBuffer user_comments() { return OpusTags.nuser_comments(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code comment_lengths} field. */
        @NativeType("int *")
        public IntBuffer comment_lengths() { return OpusTags.ncomment_lengths(address()); }
        /** @return the value of the {@code comments} field. */
        public int comments() { return OpusTags.ncomments(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code vendor} field. */
        @NativeType("char *")
        public ByteBuffer vendor() { return OpusTags.nvendor(address()); }
        /** @return the null-terminated string pointed to by the {@code vendor} field. */
        @NativeType("char *")
        public String vendorString() { return OpusTags.nvendorString(address()); }

    }

}