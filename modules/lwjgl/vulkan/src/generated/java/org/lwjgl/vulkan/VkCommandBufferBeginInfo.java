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
 * struct VkCommandBufferBeginInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkCommandBufferUsageFlags flags;
 *     {@link VkCommandBufferInheritanceInfo VkCommandBufferInheritanceInfo} const * pInheritanceInfo;
 * }}</pre>
 */
public class VkCommandBufferBeginInfo extends Struct<VkCommandBufferBeginInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PINHERITANCEINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PINHERITANCEINFO = layout.offsetof(3);
    }

    protected VkCommandBufferBeginInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCommandBufferBeginInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCommandBufferBeginInfo(address, container);
    }

    /**
     * Creates a {@code VkCommandBufferBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCommandBufferBeginInfo(ByteBuffer container) {
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
    @NativeType("VkCommandBufferUsageFlags")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkCommandBufferInheritanceInfo} view of the struct pointed to by the {@code pInheritanceInfo} field. */
    @NativeType("VkCommandBufferInheritanceInfo const *")
    public @Nullable VkCommandBufferInheritanceInfo pInheritanceInfo() { return npInheritanceInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCommandBufferBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO} value to the {@code sType} field. */
    public VkCommandBufferBeginInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCommandBufferBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupCommandBufferBeginInfo} value to the {@code pNext} chain. */
    public VkCommandBufferBeginInfo pNext(VkDeviceGroupCommandBufferBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDeviceGroupCommandBufferBeginInfoKHR} value to the {@code pNext} chain. */
    public VkCommandBufferBeginInfo pNext(VkDeviceGroupCommandBufferBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkCommandBufferBeginInfo flags(@NativeType("VkCommandBufferUsageFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkCommandBufferInheritanceInfo} to the {@code pInheritanceInfo} field. */
    public VkCommandBufferBeginInfo pInheritanceInfo(@Nullable @NativeType("VkCommandBufferInheritanceInfo const *") VkCommandBufferInheritanceInfo value) { npInheritanceInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCommandBufferBeginInfo set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkCommandBufferInheritanceInfo pInheritanceInfo
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pInheritanceInfo(pInheritanceInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCommandBufferBeginInfo set(VkCommandBufferBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCommandBufferBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCommandBufferBeginInfo malloc() {
        return new VkCommandBufferBeginInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCommandBufferBeginInfo calloc() {
        return new VkCommandBufferBeginInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCommandBufferBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkCommandBufferBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferBeginInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCommandBufferBeginInfo} instance for the specified memory address. */
    public static VkCommandBufferBeginInfo create(long address) {
        return new VkCommandBufferBeginInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCommandBufferBeginInfo createSafe(long address) {
        return address == NULL ? null : new VkCommandBufferBeginInfo(address, null);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCommandBufferBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCommandBufferBeginInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCommandBufferBeginInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCommandBufferBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferBeginInfo malloc(MemoryStack stack) {
        return new VkCommandBufferBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCommandBufferBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCommandBufferBeginInfo calloc(MemoryStack stack) {
        return new VkCommandBufferBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCommandBufferBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferBeginInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkCommandBufferBeginInfo.FLAGS); }
    /** Unsafe version of {@link #pInheritanceInfo}. */
    public static @Nullable VkCommandBufferInheritanceInfo npInheritanceInfo(long struct) { return VkCommandBufferInheritanceInfo.createSafe(memGetAddress(struct + VkCommandBufferBeginInfo.PINHERITANCEINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkCommandBufferBeginInfo.FLAGS, value); }
    /** Unsafe version of {@link #pInheritanceInfo(VkCommandBufferInheritanceInfo) pInheritanceInfo}. */
    public static void npInheritanceInfo(long struct, @Nullable VkCommandBufferInheritanceInfo value) { memPutAddress(struct + VkCommandBufferBeginInfo.PINHERITANCEINFO, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkCommandBufferBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkCommandBufferBeginInfo, Buffer> implements NativeResource {

        private static final VkCommandBufferBeginInfo ELEMENT_FACTORY = VkCommandBufferBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkCommandBufferBeginInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCommandBufferBeginInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCommandBufferBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCommandBufferBeginInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCommandBufferBeginInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkCommandBufferUsageFlags")
        public int flags() { return VkCommandBufferBeginInfo.nflags(address()); }
        /** @return a {@link VkCommandBufferInheritanceInfo} view of the struct pointed to by the {@code pInheritanceInfo} field. */
        @NativeType("VkCommandBufferInheritanceInfo const *")
        public @Nullable VkCommandBufferInheritanceInfo pInheritanceInfo() { return VkCommandBufferBeginInfo.npInheritanceInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCommandBufferBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCommandBufferBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO} value to the {@code sType} field. */
        public VkCommandBufferBeginInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCommandBufferBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkCommandBufferBeginInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupCommandBufferBeginInfo} value to the {@code pNext} chain. */
        public VkCommandBufferBeginInfo.Buffer pNext(VkDeviceGroupCommandBufferBeginInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDeviceGroupCommandBufferBeginInfoKHR} value to the {@code pNext} chain. */
        public VkCommandBufferBeginInfo.Buffer pNext(VkDeviceGroupCommandBufferBeginInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkCommandBufferBeginInfo.Buffer flags(@NativeType("VkCommandBufferUsageFlags") int value) { VkCommandBufferBeginInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkCommandBufferInheritanceInfo} to the {@code pInheritanceInfo} field. */
        public VkCommandBufferBeginInfo.Buffer pInheritanceInfo(@Nullable @NativeType("VkCommandBufferInheritanceInfo const *") VkCommandBufferInheritanceInfo value) { VkCommandBufferBeginInfo.npInheritanceInfo(address(), value); return this; }

    }

}