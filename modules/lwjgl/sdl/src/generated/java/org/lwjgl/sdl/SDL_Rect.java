/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_Rect {
 *     int x;
 *     int y;
 *     int w;
 *     int h;
 * }}</pre>
 */
public class SDL_Rect extends Struct<SDL_Rect> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        W,
        H;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        W = layout.offsetof(2);
        H = layout.offsetof(3);
    }

    protected SDL_Rect(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_Rect create(long address, @Nullable ByteBuffer container) {
        return new SDL_Rect(address, container);
    }

    /**
     * Creates a {@code SDL_Rect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_Rect(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public int y() { return ny(address()); }
    /** @return the value of the {@code w} field. */
    public int w() { return nw(address()); }
    /** @return the value of the {@code h} field. */
    public int h() { return nh(address()); }

    /** Sets the specified value to the {@code x} field. */
    public SDL_Rect x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public SDL_Rect y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code w} field. */
    public SDL_Rect w(int value) { nw(address(), value); return this; }
    /** Sets the specified value to the {@code h} field. */
    public SDL_Rect h(int value) { nh(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_Rect set(
        int x,
        int y,
        int w,
        int h
    ) {
        x(x);
        y(y);
        w(w);
        h(h);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_Rect set(SDL_Rect src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_Rect} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_Rect malloc() {
        return new SDL_Rect(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_Rect} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_Rect calloc() {
        return new SDL_Rect(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_Rect} instance allocated with {@link BufferUtils}. */
    public static SDL_Rect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Rect(memAddress(container), container);
    }

    /** Returns a new {@code SDL_Rect} instance for the specified memory address. */
    public static SDL_Rect create(long address) {
        return new SDL_Rect(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_Rect createSafe(long address) {
        return address == NULL ? null : new SDL_Rect(address, null);
    }

    /**
     * Returns a new {@link SDL_Rect.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Rect.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_Rect.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Rect.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Rect.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_Rect.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_Rect.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_Rect.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_Rect.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_Rect} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Rect malloc(MemoryStack stack) {
        return new SDL_Rect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_Rect} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_Rect calloc(MemoryStack stack) {
        return new SDL_Rect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_Rect.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Rect.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_Rect.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_Rect.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return memGetInt(struct + SDL_Rect.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return memGetInt(struct + SDL_Rect.Y); }
    /** Unsafe version of {@link #w}. */
    public static int nw(long struct) { return memGetInt(struct + SDL_Rect.W); }
    /** Unsafe version of {@link #h}. */
    public static int nh(long struct) { return memGetInt(struct + SDL_Rect.H); }

    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { memPutInt(struct + SDL_Rect.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { memPutInt(struct + SDL_Rect.Y, value); }
    /** Unsafe version of {@link #w(int) w}. */
    public static void nw(long struct, int value) { memPutInt(struct + SDL_Rect.W, value); }
    /** Unsafe version of {@link #h(int) h}. */
    public static void nh(long struct, int value) { memPutInt(struct + SDL_Rect.H, value); }

    // -----------------------------------

    /** An array of {@link SDL_Rect} structs. */
    public static class Buffer extends StructBuffer<SDL_Rect, Buffer> implements NativeResource {

        private static final SDL_Rect ELEMENT_FACTORY = SDL_Rect.create(-1L);

        /**
         * Creates a new {@code SDL_Rect.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_Rect#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_Rect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code x} field. */
        public int x() { return SDL_Rect.nx(address()); }
        /** @return the value of the {@code y} field. */
        public int y() { return SDL_Rect.ny(address()); }
        /** @return the value of the {@code w} field. */
        public int w() { return SDL_Rect.nw(address()); }
        /** @return the value of the {@code h} field. */
        public int h() { return SDL_Rect.nh(address()); }

        /** Sets the specified value to the {@code x} field. */
        public SDL_Rect.Buffer x(int value) { SDL_Rect.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public SDL_Rect.Buffer y(int value) { SDL_Rect.ny(address(), value); return this; }
        /** Sets the specified value to the {@code w} field. */
        public SDL_Rect.Buffer w(int value) { SDL_Rect.nw(address(), value); return this; }
        /** Sets the specified value to the {@code h} field. */
        public SDL_Rect.Buffer h(int value) { SDL_Rect.nh(address(), value); return this; }

    }

}