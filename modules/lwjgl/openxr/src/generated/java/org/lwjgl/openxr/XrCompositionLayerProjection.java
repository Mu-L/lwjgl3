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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrCompositionLayerProjection {
 *     XrStructureType type;
 *     void const * next;
 *     XrCompositionLayerFlags layerFlags;
 *     XrSpace space;
 *     uint32_t viewCount;
 *     {@link XrCompositionLayerProjectionView XrCompositionLayerProjectionView} const * views;
 * }}</pre>
 */
public class XrCompositionLayerProjection extends Struct<XrCompositionLayerProjection> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LAYERFLAGS,
        SPACE,
        VIEWCOUNT,
        VIEWS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        LAYERFLAGS = layout.offsetof(2);
        SPACE = layout.offsetof(3);
        VIEWCOUNT = layout.offsetof(4);
        VIEWS = layout.offsetof(5);
    }

    protected XrCompositionLayerProjection(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCompositionLayerProjection create(long address, @Nullable ByteBuffer container) {
        return new XrCompositionLayerProjection(address, container);
    }

    /**
     * Creates a {@code XrCompositionLayerProjection} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCompositionLayerProjection(ByteBuffer container) {
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
    /** @return the value of the {@code layerFlags} field. */
    @NativeType("XrCompositionLayerFlags")
    public long layerFlags() { return nlayerFlags(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code viewCount} field. */
    @NativeType("uint32_t")
    public int viewCount() { return nviewCount(address()); }
    /** @return a {@link XrCompositionLayerProjectionView.Buffer} view of the struct array pointed to by the {@code views} field. */
    @NativeType("XrCompositionLayerProjectionView const *")
    public XrCompositionLayerProjectionView.Buffer views() { return nviews(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCompositionLayerProjection type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION TYPE_COMPOSITION_LAYER_PROJECTION} value to the {@code type} field. */
    public XrCompositionLayerProjection type$Default() { return type(XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION); }
    /** Sets the specified value to the {@code next} field. */
    public XrCompositionLayerProjection next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrCompositionLayerDepthTestVARJO} value to the {@code next} chain. */
    public XrCompositionLayerProjection next(XrCompositionLayerDepthTestVARJO value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerReprojectionInfoMSFT} value to the {@code next} chain. */
    public XrCompositionLayerProjection next(XrCompositionLayerReprojectionInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrCompositionLayerReprojectionPlaneOverrideMSFT} value to the {@code next} chain. */
    public XrCompositionLayerProjection next(XrCompositionLayerReprojectionPlaneOverrideMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code layerFlags} field. */
    public XrCompositionLayerProjection layerFlags(@NativeType("XrCompositionLayerFlags") long value) { nlayerFlags(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrCompositionLayerProjection space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the address of the specified {@link XrCompositionLayerProjectionView.Buffer} to the {@code views} field. */
    public XrCompositionLayerProjection views(@NativeType("XrCompositionLayerProjectionView const *") XrCompositionLayerProjectionView.Buffer value) { nviews(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCompositionLayerProjection set(
        int type,
        long next,
        long layerFlags,
        XrSpace space,
        XrCompositionLayerProjectionView.Buffer views
    ) {
        type(type);
        next(next);
        layerFlags(layerFlags);
        space(space);
        views(views);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCompositionLayerProjection set(XrCompositionLayerProjection src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCompositionLayerProjection} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerProjection malloc() {
        return new XrCompositionLayerProjection(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerProjection} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCompositionLayerProjection calloc() {
        return new XrCompositionLayerProjection(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCompositionLayerProjection} instance allocated with {@link BufferUtils}. */
    public static XrCompositionLayerProjection create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCompositionLayerProjection(memAddress(container), container);
    }

    /** Returns a new {@code XrCompositionLayerProjection} instance for the specified memory address. */
    public static XrCompositionLayerProjection create(long address) {
        return new XrCompositionLayerProjection(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCompositionLayerProjection createSafe(long address) {
        return address == NULL ? null : new XrCompositionLayerProjection(address, null);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader} instance to {@code XrCompositionLayerProjection}. */
    public static XrCompositionLayerProjection create(XrCompositionLayerBaseHeader value) {
        return new XrCompositionLayerProjection(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCompositionLayerProjection.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCompositionLayerProjection.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrCompositionLayerBaseHeader.Buffer} instance to {@code XrCompositionLayerProjection.Buffer}. */
    public static XrCompositionLayerProjection.Buffer create(XrCompositionLayerBaseHeader.Buffer value) {
        return new XrCompositionLayerProjection.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCompositionLayerProjection} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerProjection malloc(MemoryStack stack) {
        return new XrCompositionLayerProjection(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCompositionLayerProjection} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCompositionLayerProjection calloc(MemoryStack stack) {
        return new XrCompositionLayerProjection(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCompositionLayerProjection.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCompositionLayerProjection.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCompositionLayerProjection.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCompositionLayerProjection.NEXT); }
    /** Unsafe version of {@link #layerFlags}. */
    public static long nlayerFlags(long struct) { return memGetLong(struct + XrCompositionLayerProjection.LAYERFLAGS); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrCompositionLayerProjection.SPACE); }
    /** Unsafe version of {@link #viewCount}. */
    public static int nviewCount(long struct) { return memGetInt(struct + XrCompositionLayerProjection.VIEWCOUNT); }
    /** Unsafe version of {@link #views}. */
    public static XrCompositionLayerProjectionView.Buffer nviews(long struct) { return XrCompositionLayerProjectionView.create(memGetAddress(struct + XrCompositionLayerProjection.VIEWS), nviewCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCompositionLayerProjection.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCompositionLayerProjection.NEXT, value); }
    /** Unsafe version of {@link #layerFlags(long) layerFlags}. */
    public static void nlayerFlags(long struct, long value) { memPutLong(struct + XrCompositionLayerProjection.LAYERFLAGS, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrCompositionLayerProjection.SPACE, value.address()); }
    /** Sets the specified value to the {@code viewCount} field of the specified {@code struct}. */
    public static void nviewCount(long struct, int value) { memPutInt(struct + XrCompositionLayerProjection.VIEWCOUNT, value); }
    /** Unsafe version of {@link #views(XrCompositionLayerProjectionView.Buffer) views}. */
    public static void nviews(long struct, XrCompositionLayerProjectionView.Buffer value) { memPutAddress(struct + XrCompositionLayerProjection.VIEWS, value.address()); nviewCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrCompositionLayerProjection.SPACE));
        int viewCount = nviewCount(struct);
        long views = memGetAddress(struct + XrCompositionLayerProjection.VIEWS);
        check(views);
        validate(views, viewCount, XrCompositionLayerProjectionView.SIZEOF, XrCompositionLayerProjectionView::validate);
    }

    // -----------------------------------

    /** An array of {@link XrCompositionLayerProjection} structs. */
    public static class Buffer extends StructBuffer<XrCompositionLayerProjection, Buffer> implements NativeResource {

        private static final XrCompositionLayerProjection ELEMENT_FACTORY = XrCompositionLayerProjection.create(-1L);

        /**
         * Creates a new {@code XrCompositionLayerProjection.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCompositionLayerProjection#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCompositionLayerProjection getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCompositionLayerProjection.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrCompositionLayerProjection.nnext(address()); }
        /** @return the value of the {@code layerFlags} field. */
        @NativeType("XrCompositionLayerFlags")
        public long layerFlags() { return XrCompositionLayerProjection.nlayerFlags(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrCompositionLayerProjection.nspace(address()); }
        /** @return the value of the {@code viewCount} field. */
        @NativeType("uint32_t")
        public int viewCount() { return XrCompositionLayerProjection.nviewCount(address()); }
        /** @return a {@link XrCompositionLayerProjectionView.Buffer} view of the struct array pointed to by the {@code views} field. */
        @NativeType("XrCompositionLayerProjectionView const *")
        public XrCompositionLayerProjectionView.Buffer views() { return XrCompositionLayerProjection.nviews(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCompositionLayerProjection.Buffer type(@NativeType("XrStructureType") int value) { XrCompositionLayerProjection.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_COMPOSITION_LAYER_PROJECTION TYPE_COMPOSITION_LAYER_PROJECTION} value to the {@code type} field. */
        public XrCompositionLayerProjection.Buffer type$Default() { return type(XR10.XR_TYPE_COMPOSITION_LAYER_PROJECTION); }
        /** Sets the specified value to the {@code next} field. */
        public XrCompositionLayerProjection.Buffer next(@NativeType("void const *") long value) { XrCompositionLayerProjection.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrCompositionLayerDepthTestVARJO} value to the {@code next} chain. */
        public XrCompositionLayerProjection.Buffer next(XrCompositionLayerDepthTestVARJO value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerReprojectionInfoMSFT} value to the {@code next} chain. */
        public XrCompositionLayerProjection.Buffer next(XrCompositionLayerReprojectionInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrCompositionLayerReprojectionPlaneOverrideMSFT} value to the {@code next} chain. */
        public XrCompositionLayerProjection.Buffer next(XrCompositionLayerReprojectionPlaneOverrideMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code layerFlags} field. */
        public XrCompositionLayerProjection.Buffer layerFlags(@NativeType("XrCompositionLayerFlags") long value) { XrCompositionLayerProjection.nlayerFlags(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrCompositionLayerProjection.Buffer space(XrSpace value) { XrCompositionLayerProjection.nspace(address(), value); return this; }
        /** Sets the address of the specified {@link XrCompositionLayerProjectionView.Buffer} to the {@code views} field. */
        public XrCompositionLayerProjection.Buffer views(@NativeType("XrCompositionLayerProjectionView const *") XrCompositionLayerProjectionView.Buffer value) { XrCompositionLayerProjection.nviews(address(), value); return this; }

    }

}