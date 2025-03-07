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
 * struct VkSemaphoreWaitInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphoreWaitFlags flags;
 *     uint32_t semaphoreCount;
 *     VkSemaphore const * pSemaphores;
 *     uint64_t const * pValues;
 * }}</pre>
 */
public class VkSemaphoreWaitInfo extends Struct<VkSemaphoreWaitInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SEMAPHORECOUNT,
        PSEMAPHORES,
        PVALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SEMAPHORECOUNT = layout.offsetof(3);
        PSEMAPHORES = layout.offsetof(4);
        PVALUES = layout.offsetof(5);
    }

    protected VkSemaphoreWaitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSemaphoreWaitInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSemaphoreWaitInfo(address, container);
    }

    /**
     * Creates a {@code VkSemaphoreWaitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreWaitInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkSemaphoreWaitFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code semaphoreCount} field. */
    @NativeType("uint32_t")
    public int semaphoreCount() { return nsemaphoreCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSemaphores} field. */
    @NativeType("VkSemaphore const *")
    public LongBuffer pSemaphores() { return npSemaphores(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pValues} field. */
    @NativeType("uint64_t const *")
    public LongBuffer pValues() { return npValues(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSemaphoreWaitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO} value to the {@code sType} field. */
    public VkSemaphoreWaitInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSemaphoreWaitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkSemaphoreWaitInfo flags(@NativeType("VkSemaphoreWaitFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code semaphoreCount} field. */
    public VkSemaphoreWaitInfo semaphoreCount(@NativeType("uint32_t") int value) { nsemaphoreCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSemaphores} field. */
    public VkSemaphoreWaitInfo pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) { npSemaphores(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pValues} field. */
    public VkSemaphoreWaitInfo pValues(@NativeType("uint64_t const *") LongBuffer value) { npValues(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreWaitInfo set(
        int sType,
        long pNext,
        int flags,
        int semaphoreCount,
        LongBuffer pSemaphores,
        LongBuffer pValues
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        semaphoreCount(semaphoreCount);
        pSemaphores(pSemaphores);
        pValues(pValues);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreWaitInfo set(VkSemaphoreWaitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreWaitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreWaitInfo malloc() {
        return new VkSemaphoreWaitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreWaitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreWaitInfo calloc() {
        return new VkSemaphoreWaitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreWaitInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreWaitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreWaitInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreWaitInfo} instance for the specified memory address. */
    public static VkSemaphoreWaitInfo create(long address) {
        return new VkSemaphoreWaitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSemaphoreWaitInfo createSafe(long address) {
        return address == NULL ? null : new VkSemaphoreWaitInfo(address, null);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSemaphoreWaitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSemaphoreWaitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreWaitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreWaitInfo malloc(MemoryStack stack) {
        return new VkSemaphoreWaitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSemaphoreWaitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreWaitInfo calloc(MemoryStack stack) {
        return new VkSemaphoreWaitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreWaitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreWaitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSemaphoreWaitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreWaitInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSemaphoreWaitInfo.FLAGS); }
    /** Unsafe version of {@link #semaphoreCount}. */
    public static int nsemaphoreCount(long struct) { return memGetInt(struct + VkSemaphoreWaitInfo.SEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSemaphores() pSemaphores}. */
    public static LongBuffer npSemaphores(long struct) { return memLongBuffer(memGetAddress(struct + VkSemaphoreWaitInfo.PSEMAPHORES), nsemaphoreCount(struct)); }
    /** Unsafe version of {@link #pValues() pValues}. */
    public static LongBuffer npValues(long struct) { return memLongBuffer(memGetAddress(struct + VkSemaphoreWaitInfo.PVALUES), nsemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSemaphoreWaitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreWaitInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSemaphoreWaitInfo.FLAGS, value); }
    /** Sets the specified value to the {@code semaphoreCount} field of the specified {@code struct}. */
    public static void nsemaphoreCount(long struct, int value) { memPutInt(struct + VkSemaphoreWaitInfo.SEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pSemaphores(LongBuffer) pSemaphores}. */
    public static void npSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkSemaphoreWaitInfo.PSEMAPHORES, memAddress(value)); }
    /** Unsafe version of {@link #pValues(LongBuffer) pValues}. */
    public static void npValues(long struct, LongBuffer value) { memPutAddress(struct + VkSemaphoreWaitInfo.PVALUES, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSemaphoreWaitInfo.PSEMAPHORES));
        check(memGetAddress(struct + VkSemaphoreWaitInfo.PVALUES));
    }

    // -----------------------------------

    /** An array of {@link VkSemaphoreWaitInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreWaitInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreWaitInfo ELEMENT_FACTORY = VkSemaphoreWaitInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreWaitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreWaitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSemaphoreWaitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreWaitInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreWaitInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkSemaphoreWaitFlags")
        public int flags() { return VkSemaphoreWaitInfo.nflags(address()); }
        /** @return the value of the {@code semaphoreCount} field. */
        @NativeType("uint32_t")
        public int semaphoreCount() { return VkSemaphoreWaitInfo.nsemaphoreCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSemaphores} field. */
        @NativeType("VkSemaphore const *")
        public LongBuffer pSemaphores() { return VkSemaphoreWaitInfo.npSemaphores(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pValues} field. */
        @NativeType("uint64_t const *")
        public LongBuffer pValues() { return VkSemaphoreWaitInfo.npValues(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSemaphoreWaitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreWaitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO} value to the {@code sType} field. */
        public VkSemaphoreWaitInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSemaphoreWaitInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreWaitInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkSemaphoreWaitInfo.Buffer flags(@NativeType("VkSemaphoreWaitFlags") int value) { VkSemaphoreWaitInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code semaphoreCount} field. */
        public VkSemaphoreWaitInfo.Buffer semaphoreCount(@NativeType("uint32_t") int value) { VkSemaphoreWaitInfo.nsemaphoreCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSemaphores} field. */
        public VkSemaphoreWaitInfo.Buffer pSemaphores(@NativeType("VkSemaphore const *") LongBuffer value) { VkSemaphoreWaitInfo.npSemaphores(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pValues} field. */
        public VkSemaphoreWaitInfo.Buffer pValues(@NativeType("uint64_t const *") LongBuffer value) { VkSemaphoreWaitInfo.npValues(address(), value); return this; }

    }

}