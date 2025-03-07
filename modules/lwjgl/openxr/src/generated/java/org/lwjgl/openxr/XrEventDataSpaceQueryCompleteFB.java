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
 * struct XrEventDataSpaceQueryCompleteFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB requestId;
 *     XrResult result;
 * }}</pre>
 */
public class XrEventDataSpaceQueryCompleteFB extends Struct<XrEventDataSpaceQueryCompleteFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTID,
        RESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
    }

    protected XrEventDataSpaceQueryCompleteFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpaceQueryCompleteFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpaceQueryCompleteFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpaceQueryCompleteFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpaceQueryCompleteFB(ByteBuffer container) {
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
    /** @return the value of the {@code requestId} field. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSpaceQueryCompleteFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB} value to the {@code type} field. */
    public XrEventDataSpaceQueryCompleteFB type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSpaceQueryCompleteFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpaceQueryCompleteFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataSpaceQueryCompleteFB set(XrEventDataSpaceQueryCompleteFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpaceQueryCompleteFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceQueryCompleteFB malloc() {
        return new XrEventDataSpaceQueryCompleteFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceQueryCompleteFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceQueryCompleteFB calloc() {
        return new XrEventDataSpaceQueryCompleteFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceQueryCompleteFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpaceQueryCompleteFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpaceQueryCompleteFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpaceQueryCompleteFB} instance for the specified memory address. */
    public static XrEventDataSpaceQueryCompleteFB create(long address) {
        return new XrEventDataSpaceQueryCompleteFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataSpaceQueryCompleteFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpaceQueryCompleteFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpaceQueryCompleteFB}. */
    public static XrEventDataSpaceQueryCompleteFB create(XrEventDataBaseHeader value) {
        return new XrEventDataSpaceQueryCompleteFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryCompleteFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryCompleteFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryCompleteFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryCompleteFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryCompleteFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpaceQueryCompleteFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryCompleteFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataSpaceQueryCompleteFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpaceQueryCompleteFB.Buffer}. */
    public static XrEventDataSpaceQueryCompleteFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpaceQueryCompleteFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpaceQueryCompleteFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceQueryCompleteFB malloc(MemoryStack stack) {
        return new XrEventDataSpaceQueryCompleteFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpaceQueryCompleteFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceQueryCompleteFB calloc(MemoryStack stack) {
        return new XrEventDataSpaceQueryCompleteFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryCompleteFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryCompleteFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryCompleteFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataSpaceQueryCompleteFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpaceQueryCompleteFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return memGetLong(struct + XrEventDataSpaceQueryCompleteFB.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataSpaceQueryCompleteFB.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataSpaceQueryCompleteFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpaceQueryCompleteFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpaceQueryCompleteFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpaceQueryCompleteFB, Buffer> implements NativeResource {

        private static final XrEventDataSpaceQueryCompleteFB ELEMENT_FACTORY = XrEventDataSpaceQueryCompleteFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpaceQueryCompleteFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpaceQueryCompleteFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSpaceQueryCompleteFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpaceQueryCompleteFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpaceQueryCompleteFB.nnext(address()); }
        /** @return the value of the {@code requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpaceQueryCompleteFB.nrequestId(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataSpaceQueryCompleteFB.nresult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSpaceQueryCompleteFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpaceQueryCompleteFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB} value to the {@code type} field. */
        public XrEventDataSpaceQueryCompleteFB.Buffer type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSpaceQueryCompleteFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSpaceQueryCompleteFB.nnext(address(), value); return this; }

    }

}