/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Used for keyboard events.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_Keyboard_t {
 *     char {@link #cNewInput}[8];
 *     uint64_t {@link #uUserValue};
 *     uint64_t {@link #overlayHandle};
 * }</code></pre>
 */
@NativeType("struct VREvent_Keyboard_t")
public class VREventKeyboard extends Struct<VREventKeyboard> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CNEWINPUT,
        UUSERVALUE,
        OVERLAYHANDLE;

    static {
        Layout layout = __struct(
            __array(1, 8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CNEWINPUT = layout.offsetof(0);
        UUSERVALUE = layout.offsetof(1);
        OVERLAYHANDLE = layout.offsetof(2);
    }

    protected VREventKeyboard(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventKeyboard create(long address, @Nullable ByteBuffer container) {
        return new VREventKeyboard(address, container);
    }

    /**
     * Creates a {@code VREventKeyboard} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventKeyboard(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** 7 bytes of utf8 + null */
    @NativeType("char[8]")
    public ByteBuffer cNewInput() { return ncNewInput(address()); }
    /** 7 bytes of utf8 + null */
    @NativeType("char[8]")
    public String cNewInputString() { return ncNewInputString(address()); }
    /** caller specified opaque token */
    @NativeType("uint64_t")
    public long uUserValue() { return nuUserValue(address()); }
    /** {@code VROverlayHandle_t} */
    @NativeType("uint64_t")
    public long overlayHandle() { return noverlayHandle(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventKeyboard} instance for the specified memory address. */
    public static VREventKeyboard create(long address) {
        return new VREventKeyboard(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventKeyboard createSafe(long address) {
        return address == NULL ? null : new VREventKeyboard(address, null);
    }

    /**
     * Create a {@link VREventKeyboard.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventKeyboard.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventKeyboard.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cNewInput}. */
    public static ByteBuffer ncNewInput(long struct) { return memByteBuffer(struct + VREventKeyboard.CNEWINPUT, 8); }
    /** Unsafe version of {@link #cNewInputString}. */
    public static String ncNewInputString(long struct) { return memUTF8(struct + VREventKeyboard.CNEWINPUT); }
    /** Unsafe version of {@link #uUserValue}. */
    public static long nuUserValue(long struct) { return memGetLong(struct + VREventKeyboard.UUSERVALUE); }
    /** Unsafe version of {@link #overlayHandle}. */
    public static long noverlayHandle(long struct) { return memGetLong(struct + VREventKeyboard.OVERLAYHANDLE); }

    // -----------------------------------

    /** An array of {@link VREventKeyboard} structs. */
    public static class Buffer extends StructBuffer<VREventKeyboard, Buffer> {

        private static final VREventKeyboard ELEMENT_FACTORY = VREventKeyboard.create(-1L);

        /**
         * Creates a new {@code VREventKeyboard.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventKeyboard#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREventKeyboard getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link VREventKeyboard#cNewInput} field. */
        @NativeType("char[8]")
        public ByteBuffer cNewInput() { return VREventKeyboard.ncNewInput(address()); }
        /** @return the null-terminated string stored in the {@link VREventKeyboard#cNewInput} field. */
        @NativeType("char[8]")
        public String cNewInputString() { return VREventKeyboard.ncNewInputString(address()); }
        /** @return the value of the {@link VREventKeyboard#uUserValue} field. */
        @NativeType("uint64_t")
        public long uUserValue() { return VREventKeyboard.nuUserValue(address()); }
        /** @return the value of the {@link VREventKeyboard#overlayHandle} field. */
        @NativeType("uint64_t")
        public long overlayHandle() { return VREventKeyboard.noverlayHandle(address()); }

    }

}