/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct GLXStereoNotifyEventEXT {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     int extension;
 *     int evtype;
 *     GLXDrawable window;
 *     Bool stereo_tree;
 * }}</pre>
 */
public class GLXStereoNotifyEventEXT extends Struct<GLXStereoNotifyEventEXT> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        SERIAL,
        SEND_EVENT,
        DISPLAY,
        EXTENSION,
        EVTYPE,
        WINDOW,
        STEREO_TREE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        EXTENSION = layout.offsetof(4);
        EVTYPE = layout.offsetof(5);
        WINDOW = layout.offsetof(6);
        STEREO_TREE = layout.offsetof(7);
    }

    protected GLXStereoNotifyEventEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLXStereoNotifyEventEXT create(long address, @Nullable ByteBuffer container) {
        return new GLXStereoNotifyEventEXT(address, container);
    }

    /**
     * Creates a {@code GLXStereoNotifyEventEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLXStereoNotifyEventEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** @return the value of the {@code serial} field. */
    @NativeType("unsigned long")
    public long serial() { return nserial(address()); }
    /** @return the value of the {@code send_event} field. */
    @NativeType("Bool")
    public boolean send_event() { return nsend_event(address()) != 0; }
    /** @return the value of the {@code display} field. */
    @NativeType("Display *")
    public long display() { return ndisplay(address()); }
    /** @return the value of the {@code extension} field. */
    public int extension() { return nextension(address()); }
    /** @return the value of the {@code evtype} field. */
    public int evtype() { return nevtype(address()); }
    /** @return the value of the {@code window} field. */
    @NativeType("GLXDrawable")
    public long window() { return nwindow(address()); }
    /** @return the value of the {@code stereo_tree} field. */
    @NativeType("Bool")
    public boolean stereo_tree() { return nstereo_tree(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code GLXStereoNotifyEventEXT} instance for the specified memory address. */
    public static GLXStereoNotifyEventEXT create(long address) {
        return new GLXStereoNotifyEventEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLXStereoNotifyEventEXT createSafe(long address) {
        return address == NULL ? null : new GLXStereoNotifyEventEXT(address, null);
    }

    /**
     * Create a {@link GLXStereoNotifyEventEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLXStereoNotifyEventEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLXStereoNotifyEventEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + GLXStereoNotifyEventEXT.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + GLXStereoNotifyEventEXT.DISPLAY); }
    /** Unsafe version of {@link #extension}. */
    public static int nextension(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.EXTENSION); }
    /** Unsafe version of {@link #evtype}. */
    public static int nevtype(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.EVTYPE); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetAddress(struct + GLXStereoNotifyEventEXT.WINDOW); }
    /** Unsafe version of {@link #stereo_tree}. */
    public static int nstereo_tree(long struct) { return memGetInt(struct + GLXStereoNotifyEventEXT.STEREO_TREE); }

    // -----------------------------------

    /** An array of {@link GLXStereoNotifyEventEXT} structs. */
    public static class Buffer extends StructBuffer<GLXStereoNotifyEventEXT, Buffer> {

        private static final GLXStereoNotifyEventEXT ELEMENT_FACTORY = GLXStereoNotifyEventEXT.create(-1L);

        /**
         * Creates a new {@code GLXStereoNotifyEventEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLXStereoNotifyEventEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLXStereoNotifyEventEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return GLXStereoNotifyEventEXT.ntype(address()); }
        /** @return the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return GLXStereoNotifyEventEXT.nserial(address()); }
        /** @return the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return GLXStereoNotifyEventEXT.nsend_event(address()) != 0; }
        /** @return the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return GLXStereoNotifyEventEXT.ndisplay(address()); }
        /** @return the value of the {@code extension} field. */
        public int extension() { return GLXStereoNotifyEventEXT.nextension(address()); }
        /** @return the value of the {@code evtype} field. */
        public int evtype() { return GLXStereoNotifyEventEXT.nevtype(address()); }
        /** @return the value of the {@code window} field. */
        @NativeType("GLXDrawable")
        public long window() { return GLXStereoNotifyEventEXT.nwindow(address()); }
        /** @return the value of the {@code stereo_tree} field. */
        @NativeType("Bool")
        public boolean stereo_tree() { return GLXStereoNotifyEventEXT.nstereo_tree(address()) != 0; }

    }

}