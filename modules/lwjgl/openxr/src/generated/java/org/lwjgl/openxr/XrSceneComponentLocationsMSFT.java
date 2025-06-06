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
 * struct XrSceneComponentLocationsMSFT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t locationCount;
 *     {@link XrSceneComponentLocationMSFT XrSceneComponentLocationMSFT} * locations;
 * }}</pre>
 */
public class XrSceneComponentLocationsMSFT extends Struct<XrSceneComponentLocationsMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATIONCOUNT,
        LOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LOCATIONCOUNT = layout.offsetof(2);
        LOCATIONS = layout.offsetof(3);
    }

    protected XrSceneComponentLocationsMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSceneComponentLocationsMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSceneComponentLocationsMSFT(address, container);
    }

    /**
     * Creates a {@code XrSceneComponentLocationsMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSceneComponentLocationsMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code locationCount} field. */
    @NativeType("uint32_t")
    public int locationCount() { return nlocationCount(address()); }
    /** @return a {@link XrSceneComponentLocationMSFT.Buffer} view of the struct array pointed to by the {@code locations} field. */
    @NativeType("XrSceneComponentLocationMSFT *")
    public XrSceneComponentLocationMSFT.@Nullable Buffer locations() { return nlocations(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSceneComponentLocationsMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT TYPE_SCENE_COMPONENT_LOCATIONS_MSFT} value to the {@code type} field. */
    public XrSceneComponentLocationsMSFT type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSceneComponentLocationsMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code locationCount} field. */
    public XrSceneComponentLocationsMSFT locationCount(@NativeType("uint32_t") int value) { nlocationCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrSceneComponentLocationMSFT.Buffer} to the {@code locations} field. */
    public XrSceneComponentLocationsMSFT locations(@NativeType("XrSceneComponentLocationMSFT *") XrSceneComponentLocationMSFT.@Nullable Buffer value) { nlocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSceneComponentLocationsMSFT set(
        int type,
        long next,
        int locationCount,
        XrSceneComponentLocationMSFT.@Nullable Buffer locations
    ) {
        type(type);
        next(next);
        locationCount(locationCount);
        locations(locations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSceneComponentLocationsMSFT set(XrSceneComponentLocationsMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSceneComponentLocationsMSFT malloc() {
        return new XrSceneComponentLocationsMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSceneComponentLocationsMSFT calloc() {
        return new XrSceneComponentLocationsMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSceneComponentLocationsMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSceneComponentLocationsMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSceneComponentLocationsMSFT} instance for the specified memory address. */
    public static XrSceneComponentLocationsMSFT create(long address) {
        return new XrSceneComponentLocationsMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSceneComponentLocationsMSFT createSafe(long address) {
        return address == NULL ? null : new XrSceneComponentLocationsMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSceneComponentLocationsMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSceneComponentLocationsMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentLocationsMSFT malloc(MemoryStack stack) {
        return new XrSceneComponentLocationsMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSceneComponentLocationsMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSceneComponentLocationsMSFT calloc(MemoryStack stack) {
        return new XrSceneComponentLocationsMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSceneComponentLocationsMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSceneComponentLocationsMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSceneComponentLocationsMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSceneComponentLocationsMSFT.NEXT); }
    /** Unsafe version of {@link #locationCount}. */
    public static int nlocationCount(long struct) { return memGetInt(struct + XrSceneComponentLocationsMSFT.LOCATIONCOUNT); }
    /** Unsafe version of {@link #locations}. */
    public static XrSceneComponentLocationMSFT.@Nullable Buffer nlocations(long struct) { return XrSceneComponentLocationMSFT.createSafe(memGetAddress(struct + XrSceneComponentLocationsMSFT.LOCATIONS), nlocationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSceneComponentLocationsMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSceneComponentLocationsMSFT.NEXT, value); }
    /** Sets the specified value to the {@code locationCount} field of the specified {@code struct}. */
    public static void nlocationCount(long struct, int value) { memPutInt(struct + XrSceneComponentLocationsMSFT.LOCATIONCOUNT, value); }
    /** Unsafe version of {@link #locations(XrSceneComponentLocationMSFT.Buffer) locations}. */
    public static void nlocations(long struct, XrSceneComponentLocationMSFT.@Nullable Buffer value) { memPutAddress(struct + XrSceneComponentLocationsMSFT.LOCATIONS, memAddressSafe(value)); if (value != null) { nlocationCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSceneComponentLocationsMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSceneComponentLocationsMSFT, Buffer> implements NativeResource {

        private static final XrSceneComponentLocationsMSFT ELEMENT_FACTORY = XrSceneComponentLocationsMSFT.create(-1L);

        /**
         * Creates a new {@code XrSceneComponentLocationsMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSceneComponentLocationsMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSceneComponentLocationsMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSceneComponentLocationsMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSceneComponentLocationsMSFT.nnext(address()); }
        /** @return the value of the {@code locationCount} field. */
        @NativeType("uint32_t")
        public int locationCount() { return XrSceneComponentLocationsMSFT.nlocationCount(address()); }
        /** @return a {@link XrSceneComponentLocationMSFT.Buffer} view of the struct array pointed to by the {@code locations} field. */
        @NativeType("XrSceneComponentLocationMSFT *")
        public XrSceneComponentLocationMSFT.@Nullable Buffer locations() { return XrSceneComponentLocationsMSFT.nlocations(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSceneComponentLocationsMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSceneComponentLocationsMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSceneUnderstanding#XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT TYPE_SCENE_COMPONENT_LOCATIONS_MSFT} value to the {@code type} field. */
        public XrSceneComponentLocationsMSFT.Buffer type$Default() { return type(MSFTSceneUnderstanding.XR_TYPE_SCENE_COMPONENT_LOCATIONS_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSceneComponentLocationsMSFT.Buffer next(@NativeType("void *") long value) { XrSceneComponentLocationsMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code locationCount} field. */
        public XrSceneComponentLocationsMSFT.Buffer locationCount(@NativeType("uint32_t") int value) { XrSceneComponentLocationsMSFT.nlocationCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrSceneComponentLocationMSFT.Buffer} to the {@code locations} field. */
        public XrSceneComponentLocationsMSFT.Buffer locations(@NativeType("XrSceneComponentLocationMSFT *") XrSceneComponentLocationMSFT.@Nullable Buffer value) { XrSceneComponentLocationsMSFT.nlocations(address(), value); return this; }

    }

}