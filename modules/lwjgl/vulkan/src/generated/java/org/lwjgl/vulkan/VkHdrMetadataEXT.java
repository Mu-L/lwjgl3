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
 * struct VkHdrMetadataEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkXYColorEXT VkXYColorEXT} displayPrimaryRed;
 *     {@link VkXYColorEXT VkXYColorEXT} displayPrimaryGreen;
 *     {@link VkXYColorEXT VkXYColorEXT} displayPrimaryBlue;
 *     {@link VkXYColorEXT VkXYColorEXT} whitePoint;
 *     float maxLuminance;
 *     float minLuminance;
 *     float maxContentLightLevel;
 *     float maxFrameAverageLightLevel;
 * }}</pre>
 */
public class VkHdrMetadataEXT extends Struct<VkHdrMetadataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISPLAYPRIMARYRED,
        DISPLAYPRIMARYGREEN,
        DISPLAYPRIMARYBLUE,
        WHITEPOINT,
        MAXLUMINANCE,
        MINLUMINANCE,
        MAXCONTENTLIGHTLEVEL,
        MAXFRAMEAVERAGELIGHTLEVEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF),
            __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF),
            __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF),
            __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLAYPRIMARYRED = layout.offsetof(2);
        DISPLAYPRIMARYGREEN = layout.offsetof(3);
        DISPLAYPRIMARYBLUE = layout.offsetof(4);
        WHITEPOINT = layout.offsetof(5);
        MAXLUMINANCE = layout.offsetof(6);
        MINLUMINANCE = layout.offsetof(7);
        MAXCONTENTLIGHTLEVEL = layout.offsetof(8);
        MAXFRAMEAVERAGELIGHTLEVEL = layout.offsetof(9);
    }

    protected VkHdrMetadataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHdrMetadataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkHdrMetadataEXT(address, container);
    }

    /**
     * Creates a {@code VkHdrMetadataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHdrMetadataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link VkXYColorEXT} view of the {@code displayPrimaryRed} field. */
    public VkXYColorEXT displayPrimaryRed() { return ndisplayPrimaryRed(address()); }
    /** @return a {@link VkXYColorEXT} view of the {@code displayPrimaryGreen} field. */
    public VkXYColorEXT displayPrimaryGreen() { return ndisplayPrimaryGreen(address()); }
    /** @return a {@link VkXYColorEXT} view of the {@code displayPrimaryBlue} field. */
    public VkXYColorEXT displayPrimaryBlue() { return ndisplayPrimaryBlue(address()); }
    /** @return a {@link VkXYColorEXT} view of the {@code whitePoint} field. */
    public VkXYColorEXT whitePoint() { return nwhitePoint(address()); }
    /** @return the value of the {@code maxLuminance} field. */
    public float maxLuminance() { return nmaxLuminance(address()); }
    /** @return the value of the {@code minLuminance} field. */
    public float minLuminance() { return nminLuminance(address()); }
    /** @return the value of the {@code maxContentLightLevel} field. */
    public float maxContentLightLevel() { return nmaxContentLightLevel(address()); }
    /** @return the value of the {@code maxFrameAverageLightLevel} field. */
    public float maxFrameAverageLightLevel() { return nmaxFrameAverageLightLevel(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkHdrMetadataEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHdrMetadata#VK_STRUCTURE_TYPE_HDR_METADATA_EXT STRUCTURE_TYPE_HDR_METADATA_EXT} value to the {@code sType} field. */
    public VkHdrMetadataEXT sType$Default() { return sType(EXTHdrMetadata.VK_STRUCTURE_TYPE_HDR_METADATA_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkHdrMetadataEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkHdrVividDynamicMetadataHUAWEI} value to the {@code pNext} chain. */
    public VkHdrMetadataEXT pNext(VkHdrVividDynamicMetadataHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryRed} field. */
    public VkHdrMetadataEXT displayPrimaryRed(VkXYColorEXT value) { ndisplayPrimaryRed(address(), value); return this; }
    /** Passes the {@code displayPrimaryRed} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHdrMetadataEXT displayPrimaryRed(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryRed()); return this; }
    /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryGreen} field. */
    public VkHdrMetadataEXT displayPrimaryGreen(VkXYColorEXT value) { ndisplayPrimaryGreen(address(), value); return this; }
    /** Passes the {@code displayPrimaryGreen} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHdrMetadataEXT displayPrimaryGreen(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryGreen()); return this; }
    /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryBlue} field. */
    public VkHdrMetadataEXT displayPrimaryBlue(VkXYColorEXT value) { ndisplayPrimaryBlue(address(), value); return this; }
    /** Passes the {@code displayPrimaryBlue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHdrMetadataEXT displayPrimaryBlue(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryBlue()); return this; }
    /** Copies the specified {@link VkXYColorEXT} to the {@code whitePoint} field. */
    public VkHdrMetadataEXT whitePoint(VkXYColorEXT value) { nwhitePoint(address(), value); return this; }
    /** Passes the {@code whitePoint} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHdrMetadataEXT whitePoint(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(whitePoint()); return this; }
    /** Sets the specified value to the {@code maxLuminance} field. */
    public VkHdrMetadataEXT maxLuminance(float value) { nmaxLuminance(address(), value); return this; }
    /** Sets the specified value to the {@code minLuminance} field. */
    public VkHdrMetadataEXT minLuminance(float value) { nminLuminance(address(), value); return this; }
    /** Sets the specified value to the {@code maxContentLightLevel} field. */
    public VkHdrMetadataEXT maxContentLightLevel(float value) { nmaxContentLightLevel(address(), value); return this; }
    /** Sets the specified value to the {@code maxFrameAverageLightLevel} field. */
    public VkHdrMetadataEXT maxFrameAverageLightLevel(float value) { nmaxFrameAverageLightLevel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkHdrMetadataEXT set(
        int sType,
        long pNext,
        VkXYColorEXT displayPrimaryRed,
        VkXYColorEXT displayPrimaryGreen,
        VkXYColorEXT displayPrimaryBlue,
        VkXYColorEXT whitePoint,
        float maxLuminance,
        float minLuminance,
        float maxContentLightLevel,
        float maxFrameAverageLightLevel
    ) {
        sType(sType);
        pNext(pNext);
        displayPrimaryRed(displayPrimaryRed);
        displayPrimaryGreen(displayPrimaryGreen);
        displayPrimaryBlue(displayPrimaryBlue);
        whitePoint(whitePoint);
        maxLuminance(maxLuminance);
        minLuminance(minLuminance);
        maxContentLightLevel(maxContentLightLevel);
        maxFrameAverageLightLevel(maxFrameAverageLightLevel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHdrMetadataEXT set(VkHdrMetadataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHdrMetadataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHdrMetadataEXT malloc() {
        return new VkHdrMetadataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHdrMetadataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHdrMetadataEXT calloc() {
        return new VkHdrMetadataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHdrMetadataEXT} instance allocated with {@link BufferUtils}. */
    public static VkHdrMetadataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHdrMetadataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkHdrMetadataEXT} instance for the specified memory address. */
    public static VkHdrMetadataEXT create(long address) {
        return new VkHdrMetadataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkHdrMetadataEXT createSafe(long address) {
        return address == NULL ? null : new VkHdrMetadataEXT(address, null);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHdrMetadataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkHdrMetadataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkHdrMetadataEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkHdrMetadataEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkHdrMetadataEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkHdrMetadataEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkHdrMetadataEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkHdrMetadataEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkHdrMetadataEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkHdrMetadataEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkHdrMetadataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHdrMetadataEXT malloc(MemoryStack stack) {
        return new VkHdrMetadataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHdrMetadataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHdrMetadataEXT calloc(MemoryStack stack) {
        return new VkHdrMetadataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHdrMetadataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHdrMetadataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkHdrMetadataEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkHdrMetadataEXT.PNEXT); }
    /** Unsafe version of {@link #displayPrimaryRed}. */
    public static VkXYColorEXT ndisplayPrimaryRed(long struct) { return VkXYColorEXT.create(struct + VkHdrMetadataEXT.DISPLAYPRIMARYRED); }
    /** Unsafe version of {@link #displayPrimaryGreen}. */
    public static VkXYColorEXT ndisplayPrimaryGreen(long struct) { return VkXYColorEXT.create(struct + VkHdrMetadataEXT.DISPLAYPRIMARYGREEN); }
    /** Unsafe version of {@link #displayPrimaryBlue}. */
    public static VkXYColorEXT ndisplayPrimaryBlue(long struct) { return VkXYColorEXT.create(struct + VkHdrMetadataEXT.DISPLAYPRIMARYBLUE); }
    /** Unsafe version of {@link #whitePoint}. */
    public static VkXYColorEXT nwhitePoint(long struct) { return VkXYColorEXT.create(struct + VkHdrMetadataEXT.WHITEPOINT); }
    /** Unsafe version of {@link #maxLuminance}. */
    public static float nmaxLuminance(long struct) { return memGetFloat(struct + VkHdrMetadataEXT.MAXLUMINANCE); }
    /** Unsafe version of {@link #minLuminance}. */
    public static float nminLuminance(long struct) { return memGetFloat(struct + VkHdrMetadataEXT.MINLUMINANCE); }
    /** Unsafe version of {@link #maxContentLightLevel}. */
    public static float nmaxContentLightLevel(long struct) { return memGetFloat(struct + VkHdrMetadataEXT.MAXCONTENTLIGHTLEVEL); }
    /** Unsafe version of {@link #maxFrameAverageLightLevel}. */
    public static float nmaxFrameAverageLightLevel(long struct) { return memGetFloat(struct + VkHdrMetadataEXT.MAXFRAMEAVERAGELIGHTLEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkHdrMetadataEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkHdrMetadataEXT.PNEXT, value); }
    /** Unsafe version of {@link #displayPrimaryRed(VkXYColorEXT) displayPrimaryRed}. */
    public static void ndisplayPrimaryRed(long struct, VkXYColorEXT value) { memCopy(value.address(), struct + VkHdrMetadataEXT.DISPLAYPRIMARYRED, VkXYColorEXT.SIZEOF); }
    /** Unsafe version of {@link #displayPrimaryGreen(VkXYColorEXT) displayPrimaryGreen}. */
    public static void ndisplayPrimaryGreen(long struct, VkXYColorEXT value) { memCopy(value.address(), struct + VkHdrMetadataEXT.DISPLAYPRIMARYGREEN, VkXYColorEXT.SIZEOF); }
    /** Unsafe version of {@link #displayPrimaryBlue(VkXYColorEXT) displayPrimaryBlue}. */
    public static void ndisplayPrimaryBlue(long struct, VkXYColorEXT value) { memCopy(value.address(), struct + VkHdrMetadataEXT.DISPLAYPRIMARYBLUE, VkXYColorEXT.SIZEOF); }
    /** Unsafe version of {@link #whitePoint(VkXYColorEXT) whitePoint}. */
    public static void nwhitePoint(long struct, VkXYColorEXT value) { memCopy(value.address(), struct + VkHdrMetadataEXT.WHITEPOINT, VkXYColorEXT.SIZEOF); }
    /** Unsafe version of {@link #maxLuminance(float) maxLuminance}. */
    public static void nmaxLuminance(long struct, float value) { memPutFloat(struct + VkHdrMetadataEXT.MAXLUMINANCE, value); }
    /** Unsafe version of {@link #minLuminance(float) minLuminance}. */
    public static void nminLuminance(long struct, float value) { memPutFloat(struct + VkHdrMetadataEXT.MINLUMINANCE, value); }
    /** Unsafe version of {@link #maxContentLightLevel(float) maxContentLightLevel}. */
    public static void nmaxContentLightLevel(long struct, float value) { memPutFloat(struct + VkHdrMetadataEXT.MAXCONTENTLIGHTLEVEL, value); }
    /** Unsafe version of {@link #maxFrameAverageLightLevel(float) maxFrameAverageLightLevel}. */
    public static void nmaxFrameAverageLightLevel(long struct, float value) { memPutFloat(struct + VkHdrMetadataEXT.MAXFRAMEAVERAGELIGHTLEVEL, value); }

    // -----------------------------------

    /** An array of {@link VkHdrMetadataEXT} structs. */
    public static class Buffer extends StructBuffer<VkHdrMetadataEXT, Buffer> implements NativeResource {

        private static final VkHdrMetadataEXT ELEMENT_FACTORY = VkHdrMetadataEXT.create(-1L);

        /**
         * Creates a new {@code VkHdrMetadataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHdrMetadataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHdrMetadataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkHdrMetadataEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkHdrMetadataEXT.npNext(address()); }
        /** @return a {@link VkXYColorEXT} view of the {@code displayPrimaryRed} field. */
        public VkXYColorEXT displayPrimaryRed() { return VkHdrMetadataEXT.ndisplayPrimaryRed(address()); }
        /** @return a {@link VkXYColorEXT} view of the {@code displayPrimaryGreen} field. */
        public VkXYColorEXT displayPrimaryGreen() { return VkHdrMetadataEXT.ndisplayPrimaryGreen(address()); }
        /** @return a {@link VkXYColorEXT} view of the {@code displayPrimaryBlue} field. */
        public VkXYColorEXT displayPrimaryBlue() { return VkHdrMetadataEXT.ndisplayPrimaryBlue(address()); }
        /** @return a {@link VkXYColorEXT} view of the {@code whitePoint} field. */
        public VkXYColorEXT whitePoint() { return VkHdrMetadataEXT.nwhitePoint(address()); }
        /** @return the value of the {@code maxLuminance} field. */
        public float maxLuminance() { return VkHdrMetadataEXT.nmaxLuminance(address()); }
        /** @return the value of the {@code minLuminance} field. */
        public float minLuminance() { return VkHdrMetadataEXT.nminLuminance(address()); }
        /** @return the value of the {@code maxContentLightLevel} field. */
        public float maxContentLightLevel() { return VkHdrMetadataEXT.nmaxContentLightLevel(address()); }
        /** @return the value of the {@code maxFrameAverageLightLevel} field. */
        public float maxFrameAverageLightLevel() { return VkHdrMetadataEXT.nmaxFrameAverageLightLevel(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkHdrMetadataEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkHdrMetadataEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHdrMetadata#VK_STRUCTURE_TYPE_HDR_METADATA_EXT STRUCTURE_TYPE_HDR_METADATA_EXT} value to the {@code sType} field. */
        public VkHdrMetadataEXT.Buffer sType$Default() { return sType(EXTHdrMetadata.VK_STRUCTURE_TYPE_HDR_METADATA_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkHdrMetadataEXT.Buffer pNext(@NativeType("void const *") long value) { VkHdrMetadataEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkHdrVividDynamicMetadataHUAWEI} value to the {@code pNext} chain. */
        public VkHdrMetadataEXT.Buffer pNext(VkHdrVividDynamicMetadataHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryRed} field. */
        public VkHdrMetadataEXT.Buffer displayPrimaryRed(VkXYColorEXT value) { VkHdrMetadataEXT.ndisplayPrimaryRed(address(), value); return this; }
        /** Passes the {@code displayPrimaryRed} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHdrMetadataEXT.Buffer displayPrimaryRed(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryRed()); return this; }
        /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryGreen} field. */
        public VkHdrMetadataEXT.Buffer displayPrimaryGreen(VkXYColorEXT value) { VkHdrMetadataEXT.ndisplayPrimaryGreen(address(), value); return this; }
        /** Passes the {@code displayPrimaryGreen} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHdrMetadataEXT.Buffer displayPrimaryGreen(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryGreen()); return this; }
        /** Copies the specified {@link VkXYColorEXT} to the {@code displayPrimaryBlue} field. */
        public VkHdrMetadataEXT.Buffer displayPrimaryBlue(VkXYColorEXT value) { VkHdrMetadataEXT.ndisplayPrimaryBlue(address(), value); return this; }
        /** Passes the {@code displayPrimaryBlue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHdrMetadataEXT.Buffer displayPrimaryBlue(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(displayPrimaryBlue()); return this; }
        /** Copies the specified {@link VkXYColorEXT} to the {@code whitePoint} field. */
        public VkHdrMetadataEXT.Buffer whitePoint(VkXYColorEXT value) { VkHdrMetadataEXT.nwhitePoint(address(), value); return this; }
        /** Passes the {@code whitePoint} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHdrMetadataEXT.Buffer whitePoint(java.util.function.Consumer<VkXYColorEXT> consumer) { consumer.accept(whitePoint()); return this; }
        /** Sets the specified value to the {@code maxLuminance} field. */
        public VkHdrMetadataEXT.Buffer maxLuminance(float value) { VkHdrMetadataEXT.nmaxLuminance(address(), value); return this; }
        /** Sets the specified value to the {@code minLuminance} field. */
        public VkHdrMetadataEXT.Buffer minLuminance(float value) { VkHdrMetadataEXT.nminLuminance(address(), value); return this; }
        /** Sets the specified value to the {@code maxContentLightLevel} field. */
        public VkHdrMetadataEXT.Buffer maxContentLightLevel(float value) { VkHdrMetadataEXT.nmaxContentLightLevel(address(), value); return this; }
        /** Sets the specified value to the {@code maxFrameAverageLightLevel} field. */
        public VkHdrMetadataEXT.Buffer maxFrameAverageLightLevel(float value) { VkHdrMetadataEXT.nmaxFrameAverageLightLevel(address(), value); return this; }

    }

}