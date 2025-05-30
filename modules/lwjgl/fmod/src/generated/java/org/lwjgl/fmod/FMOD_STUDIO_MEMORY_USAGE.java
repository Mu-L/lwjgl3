/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct FMOD_STUDIO_MEMORY_USAGE {
 *     int exclusive;
 *     int inclusive;
 *     int sampledata;
 * }}</pre>
 */
public class FMOD_STUDIO_MEMORY_USAGE extends Struct<FMOD_STUDIO_MEMORY_USAGE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXCLUSIVE,
        INCLUSIVE,
        SAMPLEDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXCLUSIVE = layout.offsetof(0);
        INCLUSIVE = layout.offsetof(1);
        SAMPLEDATA = layout.offsetof(2);
    }

    protected FMOD_STUDIO_MEMORY_USAGE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_MEMORY_USAGE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_MEMORY_USAGE(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_MEMORY_USAGE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_MEMORY_USAGE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code exclusive} field. */
    public int exclusive() { return nexclusive(address()); }
    /** @return the value of the {@code inclusive} field. */
    public int inclusive() { return ninclusive(address()); }
    /** @return the value of the {@code sampledata} field. */
    public int sampledata() { return nsampledata(address()); }

    /** Sets the specified value to the {@code exclusive} field. */
    public FMOD_STUDIO_MEMORY_USAGE exclusive(int value) { nexclusive(address(), value); return this; }
    /** Sets the specified value to the {@code inclusive} field. */
    public FMOD_STUDIO_MEMORY_USAGE inclusive(int value) { ninclusive(address(), value); return this; }
    /** Sets the specified value to the {@code sampledata} field. */
    public FMOD_STUDIO_MEMORY_USAGE sampledata(int value) { nsampledata(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_MEMORY_USAGE set(
        int exclusive,
        int inclusive,
        int sampledata
    ) {
        exclusive(exclusive);
        inclusive(inclusive);
        sampledata(sampledata);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_MEMORY_USAGE set(FMOD_STUDIO_MEMORY_USAGE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_MEMORY_USAGE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_MEMORY_USAGE malloc() {
        return new FMOD_STUDIO_MEMORY_USAGE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_MEMORY_USAGE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_MEMORY_USAGE calloc() {
        return new FMOD_STUDIO_MEMORY_USAGE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_MEMORY_USAGE} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_MEMORY_USAGE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_MEMORY_USAGE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_MEMORY_USAGE} instance for the specified memory address. */
    public static FMOD_STUDIO_MEMORY_USAGE create(long address) {
        return new FMOD_STUDIO_MEMORY_USAGE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable FMOD_STUDIO_MEMORY_USAGE createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_MEMORY_USAGE(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_MEMORY_USAGE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_MEMORY_USAGE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_MEMORY_USAGE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_MEMORY_USAGE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_MEMORY_USAGE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_MEMORY_USAGE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_MEMORY_USAGE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_MEMORY_USAGE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static FMOD_STUDIO_MEMORY_USAGE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_MEMORY_USAGE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_MEMORY_USAGE malloc(MemoryStack stack) {
        return new FMOD_STUDIO_MEMORY_USAGE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_MEMORY_USAGE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_MEMORY_USAGE calloc(MemoryStack stack) {
        return new FMOD_STUDIO_MEMORY_USAGE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_MEMORY_USAGE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_MEMORY_USAGE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_MEMORY_USAGE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_MEMORY_USAGE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #exclusive}. */
    public static int nexclusive(long struct) { return memGetInt(struct + FMOD_STUDIO_MEMORY_USAGE.EXCLUSIVE); }
    /** Unsafe version of {@link #inclusive}. */
    public static int ninclusive(long struct) { return memGetInt(struct + FMOD_STUDIO_MEMORY_USAGE.INCLUSIVE); }
    /** Unsafe version of {@link #sampledata}. */
    public static int nsampledata(long struct) { return memGetInt(struct + FMOD_STUDIO_MEMORY_USAGE.SAMPLEDATA); }

    /** Unsafe version of {@link #exclusive(int) exclusive}. */
    public static void nexclusive(long struct, int value) { memPutInt(struct + FMOD_STUDIO_MEMORY_USAGE.EXCLUSIVE, value); }
    /** Unsafe version of {@link #inclusive(int) inclusive}. */
    public static void ninclusive(long struct, int value) { memPutInt(struct + FMOD_STUDIO_MEMORY_USAGE.INCLUSIVE, value); }
    /** Unsafe version of {@link #sampledata(int) sampledata}. */
    public static void nsampledata(long struct, int value) { memPutInt(struct + FMOD_STUDIO_MEMORY_USAGE.SAMPLEDATA, value); }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_MEMORY_USAGE} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_MEMORY_USAGE, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_MEMORY_USAGE ELEMENT_FACTORY = FMOD_STUDIO_MEMORY_USAGE.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_MEMORY_USAGE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_MEMORY_USAGE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_MEMORY_USAGE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code exclusive} field. */
        public int exclusive() { return FMOD_STUDIO_MEMORY_USAGE.nexclusive(address()); }
        /** @return the value of the {@code inclusive} field. */
        public int inclusive() { return FMOD_STUDIO_MEMORY_USAGE.ninclusive(address()); }
        /** @return the value of the {@code sampledata} field. */
        public int sampledata() { return FMOD_STUDIO_MEMORY_USAGE.nsampledata(address()); }

        /** Sets the specified value to the {@code exclusive} field. */
        public FMOD_STUDIO_MEMORY_USAGE.Buffer exclusive(int value) { FMOD_STUDIO_MEMORY_USAGE.nexclusive(address(), value); return this; }
        /** Sets the specified value to the {@code inclusive} field. */
        public FMOD_STUDIO_MEMORY_USAGE.Buffer inclusive(int value) { FMOD_STUDIO_MEMORY_USAGE.ninclusive(address(), value); return this; }
        /** Sets the specified value to the {@code sampledata} field. */
        public FMOD_STUDIO_MEMORY_USAGE.Buffer sampledata(int value) { FMOD_STUDIO_MEMORY_USAGE.nsampledata(address(), value); return this; }

    }

}