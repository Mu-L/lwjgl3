/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct CXIdxObjCProtocolRefInfo {
 *     {@link CXIdxEntityInfo CXIdxEntityInfo} const * protocol;
 *     {@link CXCursor CXCursor} cursor;
 *     {@link CXIdxLoc CXIdxLoc} loc;
 * }}</pre>
 */
public class CXIdxObjCProtocolRefInfo extends Struct<CXIdxObjCProtocolRefInfo> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROTOCOL,
        CURSOR,
        LOC;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CXCursor.SIZEOF, CXCursor.ALIGNOF),
            __member(CXIdxLoc.SIZEOF, CXIdxLoc.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROTOCOL = layout.offsetof(0);
        CURSOR = layout.offsetof(1);
        LOC = layout.offsetof(2);
    }

    protected CXIdxObjCProtocolRefInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXIdxObjCProtocolRefInfo create(long address, @Nullable ByteBuffer container) {
        return new CXIdxObjCProtocolRefInfo(address, container);
    }

    /**
     * Creates a {@code CXIdxObjCProtocolRefInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxObjCProtocolRefInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code protocol} field. */
    @NativeType("CXIdxEntityInfo const *")
    public CXIdxEntityInfo protocol() { return nprotocol(address()); }
    /** @return a {@link CXCursor} view of the {@code cursor} field. */
    public CXCursor cursor() { return ncursor(address()); }
    /** @return a {@link CXIdxLoc} view of the {@code loc} field. */
    public CXIdxLoc loc() { return nloc(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxObjCProtocolRefInfo} instance for the specified memory address. */
    public static CXIdxObjCProtocolRefInfo create(long address) {
        return new CXIdxObjCProtocolRefInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CXIdxObjCProtocolRefInfo createSafe(long address) {
        return address == NULL ? null : new CXIdxObjCProtocolRefInfo(address, null);
    }

    /**
     * Create a {@link CXIdxObjCProtocolRefInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxObjCProtocolRefInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CXIdxObjCProtocolRefInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #protocol}. */
    public static CXIdxEntityInfo nprotocol(long struct) { return CXIdxEntityInfo.create(memGetAddress(struct + CXIdxObjCProtocolRefInfo.PROTOCOL)); }
    /** Unsafe version of {@link #cursor}. */
    public static CXCursor ncursor(long struct) { return CXCursor.create(struct + CXIdxObjCProtocolRefInfo.CURSOR); }
    /** Unsafe version of {@link #loc}. */
    public static CXIdxLoc nloc(long struct) { return CXIdxLoc.create(struct + CXIdxObjCProtocolRefInfo.LOC); }

    // -----------------------------------

    /** An array of {@link CXIdxObjCProtocolRefInfo} structs. */
    public static class Buffer extends StructBuffer<CXIdxObjCProtocolRefInfo, Buffer> {

        private static final CXIdxObjCProtocolRefInfo ELEMENT_FACTORY = CXIdxObjCProtocolRefInfo.create(-1L);

        /**
         * Creates a new {@code CXIdxObjCProtocolRefInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxObjCProtocolRefInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected CXIdxObjCProtocolRefInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXIdxEntityInfo} view of the struct pointed to by the {@code protocol} field. */
        @NativeType("CXIdxEntityInfo const *")
        public CXIdxEntityInfo protocol() { return CXIdxObjCProtocolRefInfo.nprotocol(address()); }
        /** @return a {@link CXCursor} view of the {@code cursor} field. */
        public CXCursor cursor() { return CXIdxObjCProtocolRefInfo.ncursor(address()); }
        /** @return a {@link CXIdxLoc} view of the {@code loc} field. */
        public CXIdxLoc loc() { return CXIdxObjCProtocolRefInfo.nloc(address()); }

    }

}