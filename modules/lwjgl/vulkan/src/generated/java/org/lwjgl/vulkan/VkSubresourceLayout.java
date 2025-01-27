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
 * struct VkSubresourceLayout {
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 *     VkDeviceSize rowPitch;
 *     VkDeviceSize arrayPitch;
 *     VkDeviceSize depthPitch;
 * }}</pre>
 */
public class VkSubresourceLayout extends Struct<VkSubresourceLayout> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        SIZE,
        ROWPITCH,
        ARRAYPITCH,
        DEPTHPITCH;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        ROWPITCH = layout.offsetof(2);
        ARRAYPITCH = layout.offsetof(3);
        DEPTHPITCH = layout.offsetof(4);
    }

    protected VkSubresourceLayout(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubresourceLayout create(long address, @Nullable ByteBuffer container) {
        return new VkSubresourceLayout(address, container);
    }

    /**
     * Creates a {@code VkSubresourceLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubresourceLayout(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code rowPitch} field. */
    @NativeType("VkDeviceSize")
    public long rowPitch() { return nrowPitch(address()); }
    /** @return the value of the {@code arrayPitch} field. */
    @NativeType("VkDeviceSize")
    public long arrayPitch() { return narrayPitch(address()); }
    /** @return the value of the {@code depthPitch} field. */
    @NativeType("VkDeviceSize")
    public long depthPitch() { return ndepthPitch(address()); }

    /** Sets the specified value to the {@code offset} field. */
    public VkSubresourceLayout offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkSubresourceLayout size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code rowPitch} field. */
    public VkSubresourceLayout rowPitch(@NativeType("VkDeviceSize") long value) { nrowPitch(address(), value); return this; }
    /** Sets the specified value to the {@code arrayPitch} field. */
    public VkSubresourceLayout arrayPitch(@NativeType("VkDeviceSize") long value) { narrayPitch(address(), value); return this; }
    /** Sets the specified value to the {@code depthPitch} field. */
    public VkSubresourceLayout depthPitch(@NativeType("VkDeviceSize") long value) { ndepthPitch(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubresourceLayout set(
        long offset,
        long size,
        long rowPitch,
        long arrayPitch,
        long depthPitch
    ) {
        offset(offset);
        size(size);
        rowPitch(rowPitch);
        arrayPitch(arrayPitch);
        depthPitch(depthPitch);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubresourceLayout set(VkSubresourceLayout src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubresourceLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout malloc() {
        return new VkSubresourceLayout(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubresourceLayout calloc() {
        return new VkSubresourceLayout(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubresourceLayout} instance allocated with {@link BufferUtils}. */
    public static VkSubresourceLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubresourceLayout(memAddress(container), container);
    }

    /** Returns a new {@code VkSubresourceLayout} instance for the specified memory address. */
    public static VkSubresourceLayout create(long address) {
        return new VkSubresourceLayout(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubresourceLayout createSafe(long address) {
        return address == NULL ? null : new VkSubresourceLayout(address, null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubresourceLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubresourceLayout.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSubresourceLayout.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSubresourceLayout} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout malloc(MemoryStack stack) {
        return new VkSubresourceLayout(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubresourceLayout} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubresourceLayout calloc(MemoryStack stack) {
        return new VkSubresourceLayout(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubresourceLayout.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubresourceLayout.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkSubresourceLayout.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkSubresourceLayout.SIZE); }
    /** Unsafe version of {@link #rowPitch}. */
    public static long nrowPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.ROWPITCH); }
    /** Unsafe version of {@link #arrayPitch}. */
    public static long narrayPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.ARRAYPITCH); }
    /** Unsafe version of {@link #depthPitch}. */
    public static long ndepthPitch(long struct) { return memGetLong(struct + VkSubresourceLayout.DEPTHPITCH); }

    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkSubresourceLayout.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkSubresourceLayout.SIZE, value); }
    /** Unsafe version of {@link #rowPitch(long) rowPitch}. */
    public static void nrowPitch(long struct, long value) { memPutLong(struct + VkSubresourceLayout.ROWPITCH, value); }
    /** Unsafe version of {@link #arrayPitch(long) arrayPitch}. */
    public static void narrayPitch(long struct, long value) { memPutLong(struct + VkSubresourceLayout.ARRAYPITCH, value); }
    /** Unsafe version of {@link #depthPitch(long) depthPitch}. */
    public static void ndepthPitch(long struct, long value) { memPutLong(struct + VkSubresourceLayout.DEPTHPITCH, value); }

    // -----------------------------------

    /** An array of {@link VkSubresourceLayout} structs. */
    public static class Buffer extends StructBuffer<VkSubresourceLayout, Buffer> implements NativeResource {

        private static final VkSubresourceLayout ELEMENT_FACTORY = VkSubresourceLayout.create(-1L);

        /**
         * Creates a new {@code VkSubresourceLayout.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubresourceLayout#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubresourceLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkSubresourceLayout.noffset(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkSubresourceLayout.nsize(address()); }
        /** @return the value of the {@code rowPitch} field. */
        @NativeType("VkDeviceSize")
        public long rowPitch() { return VkSubresourceLayout.nrowPitch(address()); }
        /** @return the value of the {@code arrayPitch} field. */
        @NativeType("VkDeviceSize")
        public long arrayPitch() { return VkSubresourceLayout.narrayPitch(address()); }
        /** @return the value of the {@code depthPitch} field. */
        @NativeType("VkDeviceSize")
        public long depthPitch() { return VkSubresourceLayout.ndepthPitch(address()); }

        /** Sets the specified value to the {@code offset} field. */
        public VkSubresourceLayout.Buffer offset(@NativeType("VkDeviceSize") long value) { VkSubresourceLayout.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkSubresourceLayout.Buffer size(@NativeType("VkDeviceSize") long value) { VkSubresourceLayout.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code rowPitch} field. */
        public VkSubresourceLayout.Buffer rowPitch(@NativeType("VkDeviceSize") long value) { VkSubresourceLayout.nrowPitch(address(), value); return this; }
        /** Sets the specified value to the {@code arrayPitch} field. */
        public VkSubresourceLayout.Buffer arrayPitch(@NativeType("VkDeviceSize") long value) { VkSubresourceLayout.narrayPitch(address(), value); return this; }
        /** Sets the specified value to the {@code depthPitch} field. */
        public VkSubresourceLayout.Buffer depthPitch(@NativeType("VkDeviceSize") long value) { VkSubresourceLayout.ndepthPitch(address(), value); return this; }

    }

}