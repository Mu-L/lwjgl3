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
 * struct VkPhysicalDeviceVariablePointerFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 variablePointersStorageBuffer;
 *     VkBool32 variablePointers;
 * }}</pre>
 */
public class VkPhysicalDeviceVariablePointerFeaturesKHR extends VkPhysicalDeviceVariablePointersFeatures {

    protected VkPhysicalDeviceVariablePointerFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVariablePointerFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVariablePointerFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVariablePointerFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeaturesKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variablePointers} field. */
    @Override
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointers(@NativeType("VkBool32") boolean value) { nvariablePointers(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceVariablePointerFeaturesKHR set(
        int sType,
        long pNext,
        boolean variablePointersStorageBuffer,
        boolean variablePointers
    ) {
        sType(sType);
        pNext(pNext);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVariablePointerFeaturesKHR set(VkPhysicalDeviceVariablePointerFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR malloc() {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR calloc() {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVariablePointerFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVariablePointerFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVariablePointerFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointerFeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointerFeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointerFeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointerFeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVariablePointerFeaturesKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceVariablePointersFeatures.Buffer {

        private static final VkPhysicalDeviceVariablePointerFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVariablePointerFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVariablePointerFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVariablePointerFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVariablePointerFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVariablePointerFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointerFeaturesKHR.nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variablePointers} field. */
        @Override
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer variablePointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointerFeaturesKHR.nvariablePointers(address(), value ? 1 : 0); return this; }

    }

}