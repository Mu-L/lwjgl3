/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * union VkClearValue {
 *     {@link VkClearColorValue VkClearColorValue} color;
 *     {@link VkClearDepthStencilValue VkClearDepthStencilValue} depthStencil;
 * }}</pre>
 */
public class VkClearValue extends Struct<VkClearValue> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLOR,
        DEPTHSTENCIL;

    static {
        Layout layout = __union(
            __member(VkClearColorValue.SIZEOF, VkClearColorValue.ALIGNOF),
            __member(VkClearDepthStencilValue.SIZEOF, VkClearDepthStencilValue.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLOR = layout.offsetof(0);
        DEPTHSTENCIL = layout.offsetof(1);
    }

    protected VkClearValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClearValue create(long address, @Nullable ByteBuffer container) {
        return new VkClearValue(address, container);
    }

    /**
     * Creates a {@code VkClearValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClearValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkClearColorValue} view of the {@code color} field. */
    public VkClearColorValue color() { return ncolor(address()); }
    /** @return a {@link VkClearDepthStencilValue} view of the {@code depthStencil} field. */
    public VkClearDepthStencilValue depthStencil() { return ndepthStencil(address()); }

    /** Copies the specified {@link VkClearColorValue} to the {@code color} field. */
    public VkClearValue color(VkClearColorValue value) { ncolor(address(), value); return this; }
    /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClearValue color(java.util.function.Consumer<VkClearColorValue> consumer) { consumer.accept(color()); return this; }
    /** Copies the specified {@link VkClearDepthStencilValue} to the {@code depthStencil} field. */
    public VkClearValue depthStencil(VkClearDepthStencilValue value) { ndepthStencil(address(), value); return this; }
    /** Passes the {@code depthStencil} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClearValue depthStencil(java.util.function.Consumer<VkClearDepthStencilValue> consumer) { consumer.accept(depthStencil()); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClearValue set(VkClearValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClearValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClearValue malloc() {
        return new VkClearValue(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClearValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClearValue calloc() {
        return new VkClearValue(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClearValue} instance allocated with {@link BufferUtils}. */
    public static VkClearValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClearValue(memAddress(container), container);
    }

    /** Returns a new {@code VkClearValue} instance for the specified memory address. */
    public static VkClearValue create(long address) {
        return new VkClearValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClearValue createSafe(long address) {
        return address == NULL ? null : new VkClearValue(address, null);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClearValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClearValue.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkClearValue mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkClearValue callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkClearValue mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkClearValue callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearValue.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearValue.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearValue.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkClearValue.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkClearValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearValue malloc(MemoryStack stack) {
        return new VkClearValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClearValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClearValue calloc(MemoryStack stack) {
        return new VkClearValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClearValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClearValue.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #color}. */
    public static VkClearColorValue ncolor(long struct) { return VkClearColorValue.create(struct + VkClearValue.COLOR); }
    /** Unsafe version of {@link #depthStencil}. */
    public static VkClearDepthStencilValue ndepthStencil(long struct) { return VkClearDepthStencilValue.create(struct + VkClearValue.DEPTHSTENCIL); }

    /** Unsafe version of {@link #color(VkClearColorValue) color}. */
    public static void ncolor(long struct, VkClearColorValue value) { memCopy(value.address(), struct + VkClearValue.COLOR, VkClearColorValue.SIZEOF); }
    /** Unsafe version of {@link #depthStencil(VkClearDepthStencilValue) depthStencil}. */
    public static void ndepthStencil(long struct, VkClearDepthStencilValue value) { memCopy(value.address(), struct + VkClearValue.DEPTHSTENCIL, VkClearDepthStencilValue.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkClearValue} structs. */
    public static class Buffer extends StructBuffer<VkClearValue, Buffer> implements NativeResource {

        private static final VkClearValue ELEMENT_FACTORY = VkClearValue.create(-1L);

        /**
         * Creates a new {@code VkClearValue.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClearValue#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClearValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkClearColorValue} view of the {@code color} field. */
        public VkClearColorValue color() { return VkClearValue.ncolor(address()); }
        /** @return a {@link VkClearDepthStencilValue} view of the {@code depthStencil} field. */
        public VkClearDepthStencilValue depthStencil() { return VkClearValue.ndepthStencil(address()); }

        /** Copies the specified {@link VkClearColorValue} to the {@code color} field. */
        public VkClearValue.Buffer color(VkClearColorValue value) { VkClearValue.ncolor(address(), value); return this; }
        /** Passes the {@code color} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClearValue.Buffer color(java.util.function.Consumer<VkClearColorValue> consumer) { consumer.accept(color()); return this; }
        /** Copies the specified {@link VkClearDepthStencilValue} to the {@code depthStencil} field. */
        public VkClearValue.Buffer depthStencil(VkClearDepthStencilValue value) { VkClearValue.ndepthStencil(address(), value); return this; }
        /** Passes the {@code depthStencil} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClearValue.Buffer depthStencil(java.util.function.Consumer<VkClearDepthStencilValue> consumer) { consumer.accept(depthStencil()); return this; }

    }

}