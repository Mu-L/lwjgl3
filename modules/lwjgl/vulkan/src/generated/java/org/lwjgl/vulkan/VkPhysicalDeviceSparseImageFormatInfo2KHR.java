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
 * struct VkPhysicalDeviceSparseImageFormatInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormat format;
 *     VkImageType type;
 *     VkSampleCountFlagBits samples;
 *     VkImageUsageFlags usage;
 *     VkImageTiling tiling;
 * }}</pre>
 */
public class VkPhysicalDeviceSparseImageFormatInfo2KHR extends VkPhysicalDeviceSparseImageFormatInfo2 {

    protected VkPhysicalDeviceSparseImageFormatInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSparseImageFormatInfo2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSparseImageFormatInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR type(@NativeType("VkImageType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code samples} field. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code tiling} field. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceSparseImageFormatInfo2KHR set(
        int sType,
        long pNext,
        int format,
        int type,
        int samples,
        int usage,
        int tiling
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        samples(samples);
        usage(usage);
        tiling(tiling);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSparseImageFormatInfo2KHR set(VkPhysicalDeviceSparseImageFormatInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR malloc() {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR calloc() {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2KHR} instance for the specified memory address. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR create(long address) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSparseImageFormatInfo2KHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSparseImageFormatInfo2KHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSparseImageFormatInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSparseImageFormatInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSparseImageFormatInfo2KHR} structs. */
    public static class Buffer extends VkPhysicalDeviceSparseImageFormatInfo2.Buffer {

        private static final VkPhysicalDeviceSparseImageFormatInfo2KHR ELEMENT_FACTORY = VkPhysicalDeviceSparseImageFormatInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSparseImageFormatInfo2KHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkPhysicalDeviceSparseImageFormatInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer format(@NativeType("VkFormat") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer type(@NativeType("VkImageType") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code samples} field. */
        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code tiling} field. */
        @Override
        public VkPhysicalDeviceSparseImageFormatInfo2KHR.Buffer tiling(@NativeType("VkImageTiling") int value) { VkPhysicalDeviceSparseImageFormatInfo2KHR.ntiling(address(), value); return this; }

    }

}