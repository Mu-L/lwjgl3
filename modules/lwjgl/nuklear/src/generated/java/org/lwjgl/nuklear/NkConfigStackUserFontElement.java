/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct nk_config_stack_user_font_element {
 *     {@link NkUserFont struct nk_user_font} ** pValues;
 *     {@link NkUserFont struct nk_user_font} * old_value;
 * }}</pre>
 */
@NativeType("struct nk_config_stack_user_font_element")
class NkConfigStackUserFontElement extends Struct<NkConfigStackUserFontElement> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PVALUES,
        OLD_VALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PVALUES = layout.offsetof(0);
        OLD_VALUE = layout.offsetof(1);
    }

    protected NkConfigStackUserFontElement(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkConfigStackUserFontElement create(long address, @Nullable ByteBuffer container) {
        return new NkConfigStackUserFontElement(address, container);
    }

    /**
     * Creates a {@code NkConfigStackUserFontElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    NkConfigStackUserFontElement(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pValues} field. */
    @NativeType("struct nk_user_font **")
    public PointerBuffer pValues(int capacity) { return npValues(address(), capacity); }
    /** @return a {@link NkUserFont} view of the struct pointed to by the {@code old_value} field. */
    @NativeType("struct nk_user_font *")
    public NkUserFont old_value() { return nold_value(address()); }

    // -----------------------------------

    /** Returns a new {@code NkConfigStackUserFontElement} instance for the specified memory address. */
    public static NkConfigStackUserFontElement create(long address) {
        return new NkConfigStackUserFontElement(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkConfigStackUserFontElement createSafe(long address) {
        return address == NULL ? null : new NkConfigStackUserFontElement(address, null);
    }

    /**
     * Create a {@link NkConfigStackUserFontElement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConfigStackUserFontElement.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkConfigStackUserFontElement.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pValues(int) pValues}. */
    public static PointerBuffer npValues(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + NkConfigStackUserFontElement.PVALUES), capacity); }
    /** Unsafe version of {@link #old_value}. */
    public static NkUserFont nold_value(long struct) { return NkUserFont.create(memGetAddress(struct + NkConfigStackUserFontElement.OLD_VALUE)); }

    // -----------------------------------

    /** An array of {@link NkConfigStackUserFontElement} structs. */
    public static class Buffer extends StructBuffer<NkConfigStackUserFontElement, Buffer> {

        private static final NkConfigStackUserFontElement ELEMENT_FACTORY = NkConfigStackUserFontElement.create(-1L);

        /**
         * Creates a new {@code NkConfigStackUserFontElement.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConfigStackUserFontElement#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkConfigStackUserFontElement getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code pValues} field. */
        @NativeType("struct nk_user_font **")
        public PointerBuffer pValues(int capacity) { return NkConfigStackUserFontElement.npValues(address(), capacity); }
        /** @return a {@link NkUserFont} view of the struct pointed to by the {@code old_value} field. */
        @NativeType("struct nk_user_font *")
        public NkUserFont old_value() { return NkConfigStackUserFontElement.nold_value(address()); }

    }

}