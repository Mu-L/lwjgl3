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
 * struct XrMarkerDetectorArucoInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     XrMarkerArucoDictML arucoDict;
 * }}</pre>
 */
public class XrMarkerDetectorArucoInfoML extends Struct<XrMarkerDetectorArucoInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ARUCODICT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ARUCODICT = layout.offsetof(2);
    }

    protected XrMarkerDetectorArucoInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrMarkerDetectorArucoInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrMarkerDetectorArucoInfoML(address, container);
    }

    /**
     * Creates a {@code XrMarkerDetectorArucoInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMarkerDetectorArucoInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code arucoDict} field. */
    @NativeType("XrMarkerArucoDictML")
    public int arucoDict() { return narucoDict(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrMarkerDetectorArucoInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_ARUCO_INFO_ML TYPE_MARKER_DETECTOR_ARUCO_INFO_ML} value to the {@code type} field. */
    public XrMarkerDetectorArucoInfoML type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_ARUCO_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrMarkerDetectorArucoInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code arucoDict} field. */
    public XrMarkerDetectorArucoInfoML arucoDict(@NativeType("XrMarkerArucoDictML") int value) { narucoDict(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrMarkerDetectorArucoInfoML set(
        int type,
        long next,
        int arucoDict
    ) {
        type(type);
        next(next);
        arucoDict(arucoDict);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMarkerDetectorArucoInfoML set(XrMarkerDetectorArucoInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMarkerDetectorArucoInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorArucoInfoML malloc() {
        return new XrMarkerDetectorArucoInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorArucoInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorArucoInfoML calloc() {
        return new XrMarkerDetectorArucoInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorArucoInfoML} instance allocated with {@link BufferUtils}. */
    public static XrMarkerDetectorArucoInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrMarkerDetectorArucoInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrMarkerDetectorArucoInfoML} instance for the specified memory address. */
    public static XrMarkerDetectorArucoInfoML create(long address) {
        return new XrMarkerDetectorArucoInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrMarkerDetectorArucoInfoML createSafe(long address) {
        return address == NULL ? null : new XrMarkerDetectorArucoInfoML(address, null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorArucoInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorArucoInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorArucoInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorArucoInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorArucoInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorArucoInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrMarkerDetectorArucoInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorArucoInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrMarkerDetectorArucoInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrMarkerDetectorArucoInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorArucoInfoML malloc(MemoryStack stack) {
        return new XrMarkerDetectorArucoInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrMarkerDetectorArucoInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorArucoInfoML calloc(MemoryStack stack) {
        return new XrMarkerDetectorArucoInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorArucoInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorArucoInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorArucoInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorArucoInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrMarkerDetectorArucoInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMarkerDetectorArucoInfoML.NEXT); }
    /** Unsafe version of {@link #arucoDict}. */
    public static int narucoDict(long struct) { return memGetInt(struct + XrMarkerDetectorArucoInfoML.ARUCODICT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrMarkerDetectorArucoInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMarkerDetectorArucoInfoML.NEXT, value); }
    /** Unsafe version of {@link #arucoDict(int) arucoDict}. */
    public static void narucoDict(long struct, int value) { memPutInt(struct + XrMarkerDetectorArucoInfoML.ARUCODICT, value); }

    // -----------------------------------

    /** An array of {@link XrMarkerDetectorArucoInfoML} structs. */
    public static class Buffer extends StructBuffer<XrMarkerDetectorArucoInfoML, Buffer> implements NativeResource {

        private static final XrMarkerDetectorArucoInfoML ELEMENT_FACTORY = XrMarkerDetectorArucoInfoML.create(-1L);

        /**
         * Creates a new {@code XrMarkerDetectorArucoInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMarkerDetectorArucoInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrMarkerDetectorArucoInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMarkerDetectorArucoInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrMarkerDetectorArucoInfoML.nnext(address()); }
        /** @return the value of the {@code arucoDict} field. */
        @NativeType("XrMarkerArucoDictML")
        public int arucoDict() { return XrMarkerDetectorArucoInfoML.narucoDict(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrMarkerDetectorArucoInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrMarkerDetectorArucoInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_ARUCO_INFO_ML TYPE_MARKER_DETECTOR_ARUCO_INFO_ML} value to the {@code type} field. */
        public XrMarkerDetectorArucoInfoML.Buffer type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_ARUCO_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrMarkerDetectorArucoInfoML.Buffer next(@NativeType("void const *") long value) { XrMarkerDetectorArucoInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code arucoDict} field. */
        public XrMarkerDetectorArucoInfoML.Buffer arucoDict(@NativeType("XrMarkerArucoDictML") int value) { XrMarkerDetectorArucoInfoML.narucoDict(address(), value); return this; }

    }

}