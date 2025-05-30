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
 * struct VkPhysicalDeviceShaderObjectFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderObject;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderObjectFeaturesEXT extends Struct<VkPhysicalDeviceShaderObjectFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADEROBJECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADEROBJECT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderObjectFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderObjectFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderObjectFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderObjectFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderObjectFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code shaderObject} field. */
    @NativeType("VkBool32")
    public boolean shaderObject() { return nshaderObject(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderObjectFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderObjectFeaturesEXT sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderObjectFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderObject} field. */
    public VkPhysicalDeviceShaderObjectFeaturesEXT shaderObject(@NativeType("VkBool32") boolean value) { nshaderObject(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderObjectFeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderObject
    ) {
        sType(sType);
        pNext(pNext);
        shaderObject(shaderObject);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderObjectFeaturesEXT set(VkPhysicalDeviceShaderObjectFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderObjectFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderObjectFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderObjectFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderObjectFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderObjectFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderObjectFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderObjectFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderObjectFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderObjectFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderObjectFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderObjectFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderObjectFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderObjectFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderObjectFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderObjectFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderObjectFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderObject}. */
    public static int nshaderObject(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderObjectFeaturesEXT.SHADEROBJECT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderObjectFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderObjectFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderObject(boolean) shaderObject}. */
    public static void nshaderObject(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderObjectFeaturesEXT.SHADEROBJECT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderObjectFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderObjectFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderObjectFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderObjectFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderObjectFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderObjectFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderObjectFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderObjectFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code shaderObject} field. */
        @NativeType("VkBool32")
        public boolean shaderObject() { return VkPhysicalDeviceShaderObjectFeaturesEXT.nshaderObject(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderObjectFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderObjectFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderObject} field. */
        public VkPhysicalDeviceShaderObjectFeaturesEXT.Buffer shaderObject(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderObjectFeaturesEXT.nshaderObject(address(), value ? 1 : 0); return this; }

    }

}