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
 * struct VkMemoryGetWin32HandleInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceMemory memory;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 * }}</pre>
 */
public class VkMemoryGetWin32HandleInfoKHR extends Struct<VkMemoryGetWin32HandleInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY,
        HANDLETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    protected VkMemoryGetWin32HandleInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryGetWin32HandleInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryGetWin32HandleInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkMemoryGetWin32HandleInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryGetWin32HandleInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** @return the value of the {@code handleType} field. */
    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() { return nhandleType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryGetWin32HandleInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR} value to the {@code sType} field. */
    public VkMemoryGetWin32HandleInfoKHR sType$Default() { return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryGetWin32HandleInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkMemoryGetWin32HandleInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    public VkMemoryGetWin32HandleInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryGetWin32HandleInfoKHR set(
        int sType,
        long pNext,
        long memory,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryGetWin32HandleInfoKHR set(VkMemoryGetWin32HandleInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryGetWin32HandleInfoKHR malloc() {
        return new VkMemoryGetWin32HandleInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryGetWin32HandleInfoKHR calloc() {
        return new VkMemoryGetWin32HandleInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryGetWin32HandleInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryGetWin32HandleInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance for the specified memory address. */
    public static VkMemoryGetWin32HandleInfoKHR create(long address) {
        return new VkMemoryGetWin32HandleInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryGetWin32HandleInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkMemoryGetWin32HandleInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryGetWin32HandleInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryGetWin32HandleInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetWin32HandleInfoKHR malloc(MemoryStack stack) {
        return new VkMemoryGetWin32HandleInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryGetWin32HandleInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryGetWin32HandleInfoKHR calloc(MemoryStack stack) {
        return new VkMemoryGetWin32HandleInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryGetWin32HandleInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryGetWin32HandleInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryGetWin32HandleInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryGetWin32HandleInfoKHR.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkMemoryGetWin32HandleInfoKHR.MEMORY); }
    /** Unsafe version of {@link #handleType}. */
    public static int nhandleType(long struct) { return memGetInt(struct + VkMemoryGetWin32HandleInfoKHR.HANDLETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryGetWin32HandleInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryGetWin32HandleInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkMemoryGetWin32HandleInfoKHR.MEMORY, value); }
    /** Unsafe version of {@link #handleType(int) handleType}. */
    public static void nhandleType(long struct, int value) { memPutInt(struct + VkMemoryGetWin32HandleInfoKHR.HANDLETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryGetWin32HandleInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryGetWin32HandleInfoKHR, Buffer> implements NativeResource {

        private static final VkMemoryGetWin32HandleInfoKHR ELEMENT_FACTORY = VkMemoryGetWin32HandleInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryGetWin32HandleInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryGetWin32HandleInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryGetWin32HandleInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryGetWin32HandleInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryGetWin32HandleInfoKHR.npNext(address()); }
        /** @return the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkMemoryGetWin32HandleInfoKHR.nmemory(address()); }
        /** @return the value of the {@code handleType} field. */
        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() { return VkMemoryGetWin32HandleInfoKHR.nhandleType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryGetWin32HandleInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExternalMemoryWin32#VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR} value to the {@code sType} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer sType$Default() { return sType(KHRExternalMemoryWin32.VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryGetWin32HandleInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkMemoryGetWin32HandleInfoKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        public VkMemoryGetWin32HandleInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkMemoryGetWin32HandleInfoKHR.nhandleType(address(), value); return this; }

    }

}