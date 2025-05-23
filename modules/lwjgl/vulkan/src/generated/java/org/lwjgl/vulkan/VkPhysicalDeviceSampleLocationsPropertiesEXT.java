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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkSampleCountFlags sampleLocationSampleCounts;
 *     {@link VkExtent2D VkExtent2D} maxSampleLocationGridSize;
 *     float sampleLocationCoordinateRange[2];
 *     uint32_t sampleLocationSubPixelBits;
 *     VkBool32 variableSampleLocations;
 * }}</pre>
 */
public class VkPhysicalDeviceSampleLocationsPropertiesEXT extends Struct<VkPhysicalDeviceSampleLocationsPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLELOCATIONSAMPLECOUNTS,
        MAXSAMPLELOCATIONGRIDSIZE,
        SAMPLELOCATIONCOORDINATERANGE,
        SAMPLELOCATIONSUBPIXELBITS,
        VARIABLESAMPLELOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __array(4, 2),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLELOCATIONSAMPLECOUNTS = layout.offsetof(2);
        MAXSAMPLELOCATIONGRIDSIZE = layout.offsetof(3);
        SAMPLELOCATIONCOORDINATERANGE = layout.offsetof(4);
        SAMPLELOCATIONSUBPIXELBITS = layout.offsetof(5);
        VARIABLESAMPLELOCATIONS = layout.offsetof(6);
    }

    protected VkPhysicalDeviceSampleLocationsPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceSampleLocationsPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code sampleLocationSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampleLocationSampleCounts() { return nsampleLocationSampleCounts(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxSampleLocationGridSize} field. */
    public VkExtent2D maxSampleLocationGridSize() { return nmaxSampleLocationGridSize(address()); }
    /** @return a {@link FloatBuffer} view of the {@code sampleLocationCoordinateRange} field. */
    @NativeType("float[2]")
    public FloatBuffer sampleLocationCoordinateRange() { return nsampleLocationCoordinateRange(address()); }
    /** @return the value at the specified index of the {@code sampleLocationCoordinateRange} field. */
    public float sampleLocationCoordinateRange(int index) { return nsampleLocationCoordinateRange(address(), index); }
    /** @return the value of the {@code sampleLocationSubPixelBits} field. */
    @NativeType("uint32_t")
    public int sampleLocationSubPixelBits() { return nsampleLocationSubPixelBits(address()); }
    /** @return the value of the {@code variableSampleLocations} field. */
    @NativeType("VkBool32")
    public boolean variableSampleLocations() { return nvariableSampleLocations(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(VkPhysicalDeviceSampleLocationsPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT malloc() {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT calloc() {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT create(long address) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceSampleLocationsPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceSampleLocationsPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #sampleLocationSampleCounts}. */
    public static int nsampleLocationSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONSAMPLECOUNTS); }
    /** Unsafe version of {@link #maxSampleLocationGridSize}. */
    public static VkExtent2D nmaxSampleLocationGridSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.MAXSAMPLELOCATIONGRIDSIZE); }
    /** Unsafe version of {@link #sampleLocationCoordinateRange}. */
    public static FloatBuffer nsampleLocationCoordinateRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONCOORDINATERANGE, 2); }
    /** Unsafe version of {@link #sampleLocationCoordinateRange(int) sampleLocationCoordinateRange}. */
    public static float nsampleLocationCoordinateRange(long struct, int index) {
        return memGetFloat(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONCOORDINATERANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #sampleLocationSubPixelBits}. */
    public static int nsampleLocationSubPixelBits(long struct) { return memGetInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONSUBPIXELBITS); }
    /** Unsafe version of {@link #variableSampleLocations}. */
    public static int nvariableSampleLocations(long struct) { return memGetInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.VARIABLESAMPLELOCATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSampleLocationsPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSampleLocationsPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceSampleLocationsPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceSampleLocationsPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code sampleLocationSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampleLocationSampleCounts() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationSampleCounts(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxSampleLocationGridSize} field. */
        public VkExtent2D maxSampleLocationGridSize() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nmaxSampleLocationGridSize(address()); }
        /** @return a {@link FloatBuffer} view of the {@code sampleLocationCoordinateRange} field. */
        @NativeType("float[2]")
        public FloatBuffer sampleLocationCoordinateRange() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationCoordinateRange(address()); }
        /** @return the value at the specified index of the {@code sampleLocationCoordinateRange} field. */
        public float sampleLocationCoordinateRange(int index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationCoordinateRange(address(), index); }
        /** @return the value of the {@code sampleLocationSubPixelBits} field. */
        @NativeType("uint32_t")
        public int sampleLocationSubPixelBits() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationSubPixelBits(address()); }
        /** @return the value of the {@code variableSampleLocations} field. */
        @NativeType("VkBool32")
        public boolean variableSampleLocations() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nvariableSampleLocations(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.npNext(address(), value); return this; }

    }

}