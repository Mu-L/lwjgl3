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
 * struct VkQueueFamilyCheckpointPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPipelineStageFlags checkpointExecutionStageMask;
 * }}</pre>
 */
public class VkQueueFamilyCheckpointPropertiesNV extends Struct<VkQueueFamilyCheckpointPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CHECKPOINTEXECUTIONSTAGEMASK;

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
        CHECKPOINTEXECUTIONSTAGEMASK = layout.offsetof(2);
    }

    protected VkQueueFamilyCheckpointPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyCheckpointPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyCheckpointPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyCheckpointPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyCheckpointPropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code checkpointExecutionStageMask} field. */
    @NativeType("VkPipelineStageFlags")
    public int checkpointExecutionStageMask() { return ncheckpointExecutionStageMask(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkQueueFamilyCheckpointPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceDiagnosticCheckpoints#VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV} value to the {@code sType} field. */
    public VkQueueFamilyCheckpointPropertiesNV sType$Default() { return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkQueueFamilyCheckpointPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyCheckpointPropertiesNV set(
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
    public VkQueueFamilyCheckpointPropertiesNV set(VkQueueFamilyCheckpointPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyCheckpointPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyCheckpointPropertiesNV malloc() {
        return new VkQueueFamilyCheckpointPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyCheckpointPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyCheckpointPropertiesNV calloc() {
        return new VkQueueFamilyCheckpointPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyCheckpointPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyCheckpointPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyCheckpointPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyCheckpointPropertiesNV} instance for the specified memory address. */
    public static VkQueueFamilyCheckpointPropertiesNV create(long address) {
        return new VkQueueFamilyCheckpointPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkQueueFamilyCheckpointPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyCheckpointPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyCheckpointPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyCheckpointPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyCheckpointPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyCheckpointPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyCheckpointPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyCheckpointPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyCheckpointPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyCheckpointPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkQueueFamilyCheckpointPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyCheckpointPropertiesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyCheckpointPropertiesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyCheckpointPropertiesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyCheckpointPropertiesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyCheckpointPropertiesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyCheckpointPropertiesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyCheckpointPropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyCheckpointPropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkQueueFamilyCheckpointPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyCheckpointPropertiesNV malloc(MemoryStack stack) {
        return new VkQueueFamilyCheckpointPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyCheckpointPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyCheckpointPropertiesNV calloc(MemoryStack stack) {
        return new VkQueueFamilyCheckpointPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyCheckpointPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyCheckpointPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyCheckpointPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyCheckpointPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkQueueFamilyCheckpointPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyCheckpointPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #checkpointExecutionStageMask}. */
    public static int ncheckpointExecutionStageMask(long struct) { return memGetInt(struct + VkQueueFamilyCheckpointPropertiesNV.CHECKPOINTEXECUTIONSTAGEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkQueueFamilyCheckpointPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyCheckpointPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyCheckpointPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyCheckpointPropertiesNV, Buffer> implements NativeResource {

        private static final VkQueueFamilyCheckpointPropertiesNV ELEMENT_FACTORY = VkQueueFamilyCheckpointPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyCheckpointPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyCheckpointPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyCheckpointPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyCheckpointPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyCheckpointPropertiesNV.npNext(address()); }
        /** @return the value of the {@code checkpointExecutionStageMask} field. */
        @NativeType("VkPipelineStageFlags")
        public int checkpointExecutionStageMask() { return VkQueueFamilyCheckpointPropertiesNV.ncheckpointExecutionStageMask(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkQueueFamilyCheckpointPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyCheckpointPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceDiagnosticCheckpoints#VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV} value to the {@code sType} field. */
        public VkQueueFamilyCheckpointPropertiesNV.Buffer sType$Default() { return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkQueueFamilyCheckpointPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyCheckpointPropertiesNV.npNext(address(), value); return this; }

    }

}