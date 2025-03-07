/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSwapchainImageWaitInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrDuration timeout;
 * }}</pre>
 */
public class XrSwapchainImageWaitInfo extends Struct<XrSwapchainImageWaitInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIMEOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TIMEOUT = layout.offsetof(2);
    }

    protected XrSwapchainImageWaitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSwapchainImageWaitInfo create(long address, @Nullable ByteBuffer container) {
        return new XrSwapchainImageWaitInfo(address, container);
    }

    /**
     * Creates a {@code XrSwapchainImageWaitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageWaitInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code timeout} field. */
    @NativeType("XrDuration")
    public long timeout() { return ntimeout(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSwapchainImageWaitInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SWAPCHAIN_IMAGE_WAIT_INFO TYPE_SWAPCHAIN_IMAGE_WAIT_INFO} value to the {@code type} field. */
    public XrSwapchainImageWaitInfo type$Default() { return type(XR10.XR_TYPE_SWAPCHAIN_IMAGE_WAIT_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrSwapchainImageWaitInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code timeout} field. */
    public XrSwapchainImageWaitInfo timeout(@NativeType("XrDuration") long value) { ntimeout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageWaitInfo set(
        int type,
        long next,
        long timeout
    ) {
        type(type);
        next(next);
        timeout(timeout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainImageWaitInfo set(XrSwapchainImageWaitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageWaitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageWaitInfo malloc() {
        return new XrSwapchainImageWaitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageWaitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageWaitInfo calloc() {
        return new XrSwapchainImageWaitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageWaitInfo} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageWaitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSwapchainImageWaitInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageWaitInfo} instance for the specified memory address. */
    public static XrSwapchainImageWaitInfo create(long address) {
        return new XrSwapchainImageWaitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSwapchainImageWaitInfo createSafe(long address) {
        return address == NULL ? null : new XrSwapchainImageWaitInfo(address, null);
    }

    /**
     * Returns a new {@link XrSwapchainImageWaitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageWaitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageWaitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageWaitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageWaitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageWaitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSwapchainImageWaitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageWaitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSwapchainImageWaitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainImageWaitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageWaitInfo malloc(MemoryStack stack) {
        return new XrSwapchainImageWaitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSwapchainImageWaitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageWaitInfo calloc(MemoryStack stack) {
        return new XrSwapchainImageWaitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSwapchainImageWaitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageWaitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageWaitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageWaitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSwapchainImageWaitInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageWaitInfo.NEXT); }
    /** Unsafe version of {@link #timeout}. */
    public static long ntimeout(long struct) { return memGetLong(struct + XrSwapchainImageWaitInfo.TIMEOUT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSwapchainImageWaitInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageWaitInfo.NEXT, value); }
    /** Unsafe version of {@link #timeout(long) timeout}. */
    public static void ntimeout(long struct, long value) { memPutLong(struct + XrSwapchainImageWaitInfo.TIMEOUT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageWaitInfo} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageWaitInfo, Buffer> implements NativeResource {

        private static final XrSwapchainImageWaitInfo ELEMENT_FACTORY = XrSwapchainImageWaitInfo.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageWaitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageWaitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSwapchainImageWaitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageWaitInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSwapchainImageWaitInfo.nnext(address()); }
        /** @return the value of the {@code timeout} field. */
        @NativeType("XrDuration")
        public long timeout() { return XrSwapchainImageWaitInfo.ntimeout(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSwapchainImageWaitInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageWaitInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SWAPCHAIN_IMAGE_WAIT_INFO TYPE_SWAPCHAIN_IMAGE_WAIT_INFO} value to the {@code type} field. */
        public XrSwapchainImageWaitInfo.Buffer type$Default() { return type(XR10.XR_TYPE_SWAPCHAIN_IMAGE_WAIT_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrSwapchainImageWaitInfo.Buffer next(@NativeType("void const *") long value) { XrSwapchainImageWaitInfo.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code timeout} field. */
        public XrSwapchainImageWaitInfo.Buffer timeout(@NativeType("XrDuration") long value) { XrSwapchainImageWaitInfo.ntimeout(address(), value); return this; }

    }

}