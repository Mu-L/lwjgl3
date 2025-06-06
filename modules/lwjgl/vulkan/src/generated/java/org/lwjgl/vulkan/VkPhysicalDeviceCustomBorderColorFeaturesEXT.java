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
 * struct VkPhysicalDeviceCustomBorderColorFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 customBorderColors;
 *     VkBool32 customBorderColorWithoutFormat;
 * }}</pre>
 */
public class VkPhysicalDeviceCustomBorderColorFeaturesEXT extends Struct<VkPhysicalDeviceCustomBorderColorFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CUSTOMBORDERCOLORS,
        CUSTOMBORDERCOLORWITHOUTFORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CUSTOMBORDERCOLORS = layout.offsetof(2);
        CUSTOMBORDERCOLORWITHOUTFORMAT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceCustomBorderColorFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCustomBorderColorFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code customBorderColors} field. */
    @NativeType("VkBool32")
    public boolean customBorderColors() { return ncustomBorderColors(address()) != 0; }
    /** @return the value of the {@code customBorderColorWithoutFormat} field. */
    @NativeType("VkBool32")
    public boolean customBorderColorWithoutFormat() { return ncustomBorderColorWithoutFormat(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT sType$Default() { return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code customBorderColors} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColors(@NativeType("VkBool32") boolean value) { ncustomBorderColors(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code customBorderColorWithoutFormat} field. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT customBorderColorWithoutFormat(@NativeType("VkBool32") boolean value) { ncustomBorderColorWithoutFormat(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT set(
        int sType,
        long pNext,
        boolean customBorderColors,
        boolean customBorderColorWithoutFormat
    ) {
        sType(sType);
        pNext(pNext);
        customBorderColors(customBorderColors);
        customBorderColorWithoutFormat(customBorderColorWithoutFormat);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCustomBorderColorFeaturesEXT set(VkPhysicalDeviceCustomBorderColorFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT malloc() {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT calloc() {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT create(long address) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCustomBorderColorFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCustomBorderColorFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCustomBorderColorFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #customBorderColors}. */
    public static int ncustomBorderColors(long struct) { return memGetInt(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.CUSTOMBORDERCOLORS); }
    /** Unsafe version of {@link #customBorderColorWithoutFormat}. */
    public static int ncustomBorderColorWithoutFormat(long struct) { return memGetInt(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.CUSTOMBORDERCOLORWITHOUTFORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #customBorderColors(boolean) customBorderColors}. */
    public static void ncustomBorderColors(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.CUSTOMBORDERCOLORS, value); }
    /** Unsafe version of {@link #customBorderColorWithoutFormat(boolean) customBorderColorWithoutFormat}. */
    public static void ncustomBorderColorWithoutFormat(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCustomBorderColorFeaturesEXT.CUSTOMBORDERCOLORWITHOUTFORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCustomBorderColorFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCustomBorderColorFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceCustomBorderColorFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCustomBorderColorFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCustomBorderColorFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code customBorderColors} field. */
        @NativeType("VkBool32")
        public boolean customBorderColors() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColors(address()) != 0; }
        /** @return the value of the {@code customBorderColorWithoutFormat} field. */
        @NativeType("VkBool32")
        public boolean customBorderColorWithoutFormat() { return VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColorWithoutFormat(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTCustomBorderColor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer sType$Default() { return sType(EXTCustomBorderColor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUSTOM_BORDER_COLOR_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code customBorderColors} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer customBorderColors(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColors(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code customBorderColorWithoutFormat} field. */
        public VkPhysicalDeviceCustomBorderColorFeaturesEXT.Buffer customBorderColorWithoutFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCustomBorderColorFeaturesEXT.ncustomBorderColorWithoutFormat(address(), value ? 1 : 0); return this; }

    }

}