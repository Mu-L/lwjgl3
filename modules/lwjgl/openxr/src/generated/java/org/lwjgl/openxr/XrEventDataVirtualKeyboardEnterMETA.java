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
 * struct XrEventDataVirtualKeyboardEnterMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrVirtualKeyboardMETA keyboard;
 * }}</pre>
 */
public class XrEventDataVirtualKeyboardEnterMETA extends Struct<XrEventDataVirtualKeyboardEnterMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        KEYBOARD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        KEYBOARD = layout.offsetof(2);
    }

    protected XrEventDataVirtualKeyboardEnterMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataVirtualKeyboardEnterMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataVirtualKeyboardEnterMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataVirtualKeyboardEnterMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataVirtualKeyboardEnterMETA(ByteBuffer container) {
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
    /** @return the value of the {@code keyboard} field. */
    @NativeType("XrVirtualKeyboardMETA")
    public long keyboard() { return nkeyboard(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataVirtualKeyboardEnterMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META} value to the {@code type} field. */
    public XrEventDataVirtualKeyboardEnterMETA type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataVirtualKeyboardEnterMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code keyboard} field. */
    public XrEventDataVirtualKeyboardEnterMETA keyboard(XrVirtualKeyboardMETA value) { nkeyboard(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataVirtualKeyboardEnterMETA set(
        int type,
        long next,
        XrVirtualKeyboardMETA keyboard
    ) {
        type(type);
        next(next);
        keyboard(keyboard);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataVirtualKeyboardEnterMETA set(XrEventDataVirtualKeyboardEnterMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataVirtualKeyboardEnterMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataVirtualKeyboardEnterMETA malloc() {
        return new XrEventDataVirtualKeyboardEnterMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardEnterMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataVirtualKeyboardEnterMETA calloc() {
        return new XrEventDataVirtualKeyboardEnterMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardEnterMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataVirtualKeyboardEnterMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataVirtualKeyboardEnterMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataVirtualKeyboardEnterMETA} instance for the specified memory address. */
    public static XrEventDataVirtualKeyboardEnterMETA create(long address) {
        return new XrEventDataVirtualKeyboardEnterMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataVirtualKeyboardEnterMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataVirtualKeyboardEnterMETA(address, null);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardEnterMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardEnterMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardEnterMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardEnterMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardEnterMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardEnterMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataVirtualKeyboardEnterMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardEnterMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataVirtualKeyboardEnterMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEventDataVirtualKeyboardEnterMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVirtualKeyboardEnterMETA malloc(MemoryStack stack) {
        return new XrEventDataVirtualKeyboardEnterMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataVirtualKeyboardEnterMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataVirtualKeyboardEnterMETA calloc(MemoryStack stack) {
        return new XrEventDataVirtualKeyboardEnterMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardEnterMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardEnterMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataVirtualKeyboardEnterMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataVirtualKeyboardEnterMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataVirtualKeyboardEnterMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardEnterMETA.NEXT); }
    /** Unsafe version of {@link #keyboard}. */
    public static long nkeyboard(long struct) { return memGetAddress(struct + XrEventDataVirtualKeyboardEnterMETA.KEYBOARD); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataVirtualKeyboardEnterMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataVirtualKeyboardEnterMETA.NEXT, value); }
    /** Unsafe version of {@link #keyboard(XrVirtualKeyboardMETA) keyboard}. */
    public static void nkeyboard(long struct, XrVirtualKeyboardMETA value) { memPutAddress(struct + XrEventDataVirtualKeyboardEnterMETA.KEYBOARD, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEventDataVirtualKeyboardEnterMETA.KEYBOARD));
    }

    // -----------------------------------

    /** An array of {@link XrEventDataVirtualKeyboardEnterMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataVirtualKeyboardEnterMETA, Buffer> implements NativeResource {

        private static final XrEventDataVirtualKeyboardEnterMETA ELEMENT_FACTORY = XrEventDataVirtualKeyboardEnterMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataVirtualKeyboardEnterMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataVirtualKeyboardEnterMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataVirtualKeyboardEnterMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataVirtualKeyboardEnterMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataVirtualKeyboardEnterMETA.nnext(address()); }
        /** @return the value of the {@code keyboard} field. */
        @NativeType("XrVirtualKeyboardMETA")
        public long keyboard() { return XrEventDataVirtualKeyboardEnterMETA.nkeyboard(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataVirtualKeyboardEnterMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataVirtualKeyboardEnterMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAVirtualKeyboard#XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META} value to the {@code type} field. */
        public XrEventDataVirtualKeyboardEnterMETA.Buffer type$Default() { return type(METAVirtualKeyboard.XR_TYPE_EVENT_DATA_VIRTUAL_KEYBOARD_ENTER_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataVirtualKeyboardEnterMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataVirtualKeyboardEnterMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code keyboard} field. */
        public XrEventDataVirtualKeyboardEnterMETA.Buffer keyboard(XrVirtualKeyboardMETA value) { XrEventDataVirtualKeyboardEnterMETA.nkeyboard(address(), value); return this; }

    }

}