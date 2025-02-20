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
 * struct VkRenderPassSampleLocationsBeginInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t attachmentInitialSampleLocationsCount;
 *     {@link VkAttachmentSampleLocationsEXT VkAttachmentSampleLocationsEXT} const * pAttachmentInitialSampleLocations;
 *     uint32_t postSubpassSampleLocationsCount;
 *     {@link VkSubpassSampleLocationsEXT VkSubpassSampleLocationsEXT} const * pPostSubpassSampleLocations;
 * }}</pre>
 */
public class VkRenderPassSampleLocationsBeginInfoEXT extends Struct<VkRenderPassSampleLocationsBeginInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTINITIALSAMPLELOCATIONSCOUNT,
        PATTACHMENTINITIALSAMPLELOCATIONS,
        POSTSUBPASSSAMPLELOCATIONSCOUNT,
        PPOSTSUBPASSSAMPLELOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENTINITIALSAMPLELOCATIONSCOUNT = layout.offsetof(2);
        PATTACHMENTINITIALSAMPLELOCATIONS = layout.offsetof(3);
        POSTSUBPASSSAMPLELOCATIONSCOUNT = layout.offsetof(4);
        PPOSTSUBPASSSAMPLELOCATIONS = layout.offsetof(5);
    }

    protected VkRenderPassSampleLocationsBeginInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassSampleLocationsBeginInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkRenderPassSampleLocationsBeginInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassSampleLocationsBeginInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code attachmentInitialSampleLocationsCount} field. */
    @NativeType("uint32_t")
    public int attachmentInitialSampleLocationsCount() { return nattachmentInitialSampleLocationsCount(address()); }
    /** @return a {@link VkAttachmentSampleLocationsEXT.Buffer} view of the struct array pointed to by the {@code pAttachmentInitialSampleLocations} field. */
    @NativeType("VkAttachmentSampleLocationsEXT const *")
    public VkAttachmentSampleLocationsEXT.@Nullable Buffer pAttachmentInitialSampleLocations() { return npAttachmentInitialSampleLocations(address()); }
    /** @return the value of the {@code postSubpassSampleLocationsCount} field. */
    @NativeType("uint32_t")
    public int postSubpassSampleLocationsCount() { return npostSubpassSampleLocationsCount(address()); }
    /** @return a {@link VkSubpassSampleLocationsEXT.Buffer} view of the struct array pointed to by the {@code pPostSubpassSampleLocations} field. */
    @NativeType("VkSubpassSampleLocationsEXT const *")
    public VkSubpassSampleLocationsEXT.@Nullable Buffer pPostSubpassSampleLocations() { return npPostSubpassSampleLocations(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT} value to the {@code sType} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentSampleLocationsEXT.Buffer} to the {@code pAttachmentInitialSampleLocations} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocations(@NativeType("VkAttachmentSampleLocationsEXT const *") VkAttachmentSampleLocationsEXT.@Nullable Buffer value) { npAttachmentInitialSampleLocations(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassSampleLocationsEXT.Buffer} to the {@code pPostSubpassSampleLocations} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocations(@NativeType("VkSubpassSampleLocationsEXT const *") VkSubpassSampleLocationsEXT.@Nullable Buffer value) { npPostSubpassSampleLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassSampleLocationsBeginInfoEXT set(
        int sType,
        long pNext,
        VkAttachmentSampleLocationsEXT.@Nullable Buffer pAttachmentInitialSampleLocations,
        VkSubpassSampleLocationsEXT.@Nullable Buffer pPostSubpassSampleLocations
    ) {
        sType(sType);
        pNext(pNext);
        pAttachmentInitialSampleLocations(pAttachmentInitialSampleLocations);
        pPostSubpassSampleLocations(pPostSubpassSampleLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassSampleLocationsBeginInfoEXT set(VkRenderPassSampleLocationsBeginInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassSampleLocationsBeginInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassSampleLocationsBeginInfoEXT malloc() {
        return new VkRenderPassSampleLocationsBeginInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassSampleLocationsBeginInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassSampleLocationsBeginInfoEXT calloc() {
        return new VkRenderPassSampleLocationsBeginInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassSampleLocationsBeginInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassSampleLocationsBeginInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassSampleLocationsBeginInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassSampleLocationsBeginInfoEXT} instance for the specified memory address. */
    public static VkRenderPassSampleLocationsBeginInfoEXT create(long address) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassSampleLocationsBeginInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkRenderPassSampleLocationsBeginInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassSampleLocationsBeginInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassSampleLocationsBeginInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassSampleLocationsBeginInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassSampleLocationsBeginInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkRenderPassSampleLocationsBeginInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkRenderPassSampleLocationsBeginInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT malloc(MemoryStack stack) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassSampleLocationsBeginInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT calloc(MemoryStack stack) {
        return new VkRenderPassSampleLocationsBeginInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PNEXT); }
    /** Unsafe version of {@link #attachmentInitialSampleLocationsCount}. */
    public static int nattachmentInitialSampleLocationsCount(long struct) { return memGetInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.ATTACHMENTINITIALSAMPLELOCATIONSCOUNT); }
    /** Unsafe version of {@link #pAttachmentInitialSampleLocations}. */
    public static VkAttachmentSampleLocationsEXT.@Nullable Buffer npAttachmentInitialSampleLocations(long struct) { return VkAttachmentSampleLocationsEXT.createSafe(memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PATTACHMENTINITIALSAMPLELOCATIONS), nattachmentInitialSampleLocationsCount(struct)); }
    /** Unsafe version of {@link #postSubpassSampleLocationsCount}. */
    public static int npostSubpassSampleLocationsCount(long struct) { return memGetInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.POSTSUBPASSSAMPLELOCATIONSCOUNT); }
    /** Unsafe version of {@link #pPostSubpassSampleLocations}. */
    public static VkSubpassSampleLocationsEXT.@Nullable Buffer npPostSubpassSampleLocations(long struct) { return VkSubpassSampleLocationsEXT.createSafe(memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PPOSTSUBPASSSAMPLELOCATIONS), npostSubpassSampleLocationsCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code attachmentInitialSampleLocationsCount} field of the specified {@code struct}. */
    public static void nattachmentInitialSampleLocationsCount(long struct, int value) { memPutInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.ATTACHMENTINITIALSAMPLELOCATIONSCOUNT, value); }
    /** Unsafe version of {@link #pAttachmentInitialSampleLocations(VkAttachmentSampleLocationsEXT.Buffer) pAttachmentInitialSampleLocations}. */
    public static void npAttachmentInitialSampleLocations(long struct, VkAttachmentSampleLocationsEXT.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PATTACHMENTINITIALSAMPLELOCATIONS, memAddressSafe(value)); nattachmentInitialSampleLocationsCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code postSubpassSampleLocationsCount} field of the specified {@code struct}. */
    public static void npostSubpassSampleLocationsCount(long struct, int value) { memPutInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.POSTSUBPASSSAMPLELOCATIONSCOUNT, value); }
    /** Unsafe version of {@link #pPostSubpassSampleLocations(VkSubpassSampleLocationsEXT.Buffer) pPostSubpassSampleLocations}. */
    public static void npPostSubpassSampleLocations(long struct, VkSubpassSampleLocationsEXT.@Nullable Buffer value) { memPutAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PPOSTSUBPASSSAMPLELOCATIONS, memAddressSafe(value)); npostSubpassSampleLocationsCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int attachmentInitialSampleLocationsCount = nattachmentInitialSampleLocationsCount(struct);
        if (attachmentInitialSampleLocationsCount != 0) {
            long pAttachmentInitialSampleLocations = memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PATTACHMENTINITIALSAMPLELOCATIONS);
            check(pAttachmentInitialSampleLocations);
            validate(pAttachmentInitialSampleLocations, attachmentInitialSampleLocationsCount, VkAttachmentSampleLocationsEXT.SIZEOF, VkAttachmentSampleLocationsEXT::validate);
        }
        int postSubpassSampleLocationsCount = npostSubpassSampleLocationsCount(struct);
        if (postSubpassSampleLocationsCount != 0) {
            long pPostSubpassSampleLocations = memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PPOSTSUBPASSSAMPLELOCATIONS);
            check(pPostSubpassSampleLocations);
            validate(pPostSubpassSampleLocations, postSubpassSampleLocationsCount, VkSubpassSampleLocationsEXT.SIZEOF, VkSubpassSampleLocationsEXT::validate);
        }
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassSampleLocationsBeginInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassSampleLocationsBeginInfoEXT, Buffer> implements NativeResource {

        private static final VkRenderPassSampleLocationsBeginInfoEXT ELEMENT_FACTORY = VkRenderPassSampleLocationsBeginInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassSampleLocationsBeginInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassSampleLocationsBeginInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassSampleLocationsBeginInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassSampleLocationsBeginInfoEXT.npNext(address()); }
        /** @return the value of the {@code attachmentInitialSampleLocationsCount} field. */
        @NativeType("uint32_t")
        public int attachmentInitialSampleLocationsCount() { return VkRenderPassSampleLocationsBeginInfoEXT.nattachmentInitialSampleLocationsCount(address()); }
        /** @return a {@link VkAttachmentSampleLocationsEXT.Buffer} view of the struct array pointed to by the {@code pAttachmentInitialSampleLocations} field. */
        @NativeType("VkAttachmentSampleLocationsEXT const *")
        public VkAttachmentSampleLocationsEXT.@Nullable Buffer pAttachmentInitialSampleLocations() { return VkRenderPassSampleLocationsBeginInfoEXT.npAttachmentInitialSampleLocations(address()); }
        /** @return the value of the {@code postSubpassSampleLocationsCount} field. */
        @NativeType("uint32_t")
        public int postSubpassSampleLocationsCount() { return VkRenderPassSampleLocationsBeginInfoEXT.npostSubpassSampleLocationsCount(address()); }
        /** @return a {@link VkSubpassSampleLocationsEXT.Buffer} view of the struct array pointed to by the {@code pPostSubpassSampleLocations} field. */
        @NativeType("VkSubpassSampleLocationsEXT const *")
        public VkSubpassSampleLocationsEXT.@Nullable Buffer pPostSubpassSampleLocations() { return VkRenderPassSampleLocationsBeginInfoEXT.npPostSubpassSampleLocations(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassSampleLocationsBeginInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT} value to the {@code sType} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassSampleLocationsBeginInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentSampleLocationsEXT.Buffer} to the {@code pAttachmentInitialSampleLocations} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer pAttachmentInitialSampleLocations(@NativeType("VkAttachmentSampleLocationsEXT const *") VkAttachmentSampleLocationsEXT.@Nullable Buffer value) { VkRenderPassSampleLocationsBeginInfoEXT.npAttachmentInitialSampleLocations(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassSampleLocationsEXT.Buffer} to the {@code pPostSubpassSampleLocations} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer pPostSubpassSampleLocations(@NativeType("VkSubpassSampleLocationsEXT const *") VkSubpassSampleLocationsEXT.@Nullable Buffer value) { VkRenderPassSampleLocationsBeginInfoEXT.npPostSubpassSampleLocations(address(), value); return this; }

    }

}