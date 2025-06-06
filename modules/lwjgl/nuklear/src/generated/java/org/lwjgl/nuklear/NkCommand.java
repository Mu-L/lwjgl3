/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct nk_command {
 *     enum nk_command_type type;
 *     nk_size next;
 *     {@link NkHandle nk_handle} userdata;
 * }}</pre>
 */
@NativeType("struct nk_command")
public class NkCommand extends Struct<NkCommand> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        USERDATA = layout.offsetof(2);
    }

    protected NkCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkCommand create(long address, @Nullable ByteBuffer container) {
        return new NkCommand(address, container);
    }

    /**
     * Creates a {@code NkCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("enum nk_command_type")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("nk_size")
    public long next() { return nnext(address()); }
    /** @return a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }

    // -----------------------------------

    /** Returns a new {@code NkCommand} instance for the specified memory address. */
    public static NkCommand create(long address) {
        return new NkCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkCommand createSafe(long address) {
        return address == NULL ? null : new NkCommand(address, null);
    }

    /**
     * Create a {@link NkCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkCommand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + NkCommand.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + NkCommand.NEXT); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkCommand.USERDATA); }

    // -----------------------------------

    /** An array of {@link NkCommand} structs. */
    public static class Buffer extends StructBuffer<NkCommand, Buffer> {

        private static final NkCommand ELEMENT_FACTORY = NkCommand.create(-1L);

        /**
         * Creates a new {@code NkCommand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkCommand#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("enum nk_command_type")
        public int type() { return NkCommand.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("nk_size")
        public long next() { return NkCommand.nnext(address()); }
        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkCommand.nuserdata(address()); }

    }

}