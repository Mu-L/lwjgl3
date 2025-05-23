/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct stbtt_pack_range {
 *     float font_size;
 *     int first_unicode_codepoint_in_range;
 *     int * array_of_unicode_codepoints;
 *     int num_chars;
 *     {@link STBTTPackedchar stbtt_packedchar} * chardata_for_range;
 *     unsigned char h_oversample;
 *     unsigned char v_oversample;
 * }}</pre>
 */
@NativeType("struct stbtt_pack_range")
public class STBTTPackRange extends Struct<STBTTPackRange> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FONT_SIZE,
        FIRST_UNICODE_CODEPOINT_IN_RANGE,
        ARRAY_OF_UNICODE_CODEPOINTS,
        NUM_CHARS,
        CHARDATA_FOR_RANGE,
        H_OVERSAMPLE,
        V_OVERSAMPLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FONT_SIZE = layout.offsetof(0);
        FIRST_UNICODE_CODEPOINT_IN_RANGE = layout.offsetof(1);
        ARRAY_OF_UNICODE_CODEPOINTS = layout.offsetof(2);
        NUM_CHARS = layout.offsetof(3);
        CHARDATA_FOR_RANGE = layout.offsetof(4);
        H_OVERSAMPLE = layout.offsetof(5);
        V_OVERSAMPLE = layout.offsetof(6);
    }

    protected STBTTPackRange(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected STBTTPackRange create(long address, @Nullable ByteBuffer container) {
        return new STBTTPackRange(address, container);
    }

    /**
     * Creates a {@code STBTTPackRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTPackRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code font_size} field. */
    public float font_size() { return nfont_size(address()); }
    /** @return the value of the {@code first_unicode_codepoint_in_range} field. */
    public int first_unicode_codepoint_in_range() { return nfirst_unicode_codepoint_in_range(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code array_of_unicode_codepoints} field. */
    @NativeType("int *")
    public @Nullable IntBuffer array_of_unicode_codepoints() { return narray_of_unicode_codepoints(address()); }
    /** @return the value of the {@code num_chars} field. */
    public int num_chars() { return nnum_chars(address()); }
    /** @return a {@link STBTTPackedchar.Buffer} view of the struct array pointed to by the {@code chardata_for_range} field. */
    @NativeType("stbtt_packedchar *")
    public STBTTPackedchar.Buffer chardata_for_range() { return nchardata_for_range(address()); }
    /** @return the value of the {@code h_oversample} field. */
    @NativeType("unsigned char")
    public byte h_oversample() { return nh_oversample(address()); }
    /** @return the value of the {@code v_oversample} field. */
    @NativeType("unsigned char")
    public byte v_oversample() { return nv_oversample(address()); }

    /** Sets the specified value to the {@code font_size} field. */
    public STBTTPackRange font_size(float value) { nfont_size(address(), value); return this; }
    /** Sets the specified value to the {@code first_unicode_codepoint_in_range} field. */
    public STBTTPackRange first_unicode_codepoint_in_range(int value) { nfirst_unicode_codepoint_in_range(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code array_of_unicode_codepoints} field. */
    public STBTTPackRange array_of_unicode_codepoints(@Nullable @NativeType("int *") IntBuffer value) { narray_of_unicode_codepoints(address(), value); return this; }
    /** Sets the specified value to the {@code num_chars} field. */
    public STBTTPackRange num_chars(int value) { nnum_chars(address(), value); return this; }
    /** Sets the address of the specified {@link STBTTPackedchar.Buffer} to the {@code chardata_for_range} field. */
    public STBTTPackRange chardata_for_range(@NativeType("stbtt_packedchar *") STBTTPackedchar.Buffer value) { nchardata_for_range(address(), value); return this; }
    /** Sets the specified value to the {@code h_oversample} field. */
    public STBTTPackRange h_oversample(@NativeType("unsigned char") byte value) { nh_oversample(address(), value); return this; }
    /** Sets the specified value to the {@code v_oversample} field. */
    public STBTTPackRange v_oversample(@NativeType("unsigned char") byte value) { nv_oversample(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public STBTTPackRange set(
        float font_size,
        int first_unicode_codepoint_in_range,
        @Nullable IntBuffer array_of_unicode_codepoints,
        int num_chars,
        STBTTPackedchar.Buffer chardata_for_range,
        byte h_oversample,
        byte v_oversample
    ) {
        font_size(font_size);
        first_unicode_codepoint_in_range(first_unicode_codepoint_in_range);
        array_of_unicode_codepoints(array_of_unicode_codepoints);
        num_chars(num_chars);
        chardata_for_range(chardata_for_range);
        h_oversample(h_oversample);
        v_oversample(v_oversample);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public STBTTPackRange set(STBTTPackRange src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code STBTTPackRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTPackRange malloc() {
        return new STBTTPackRange(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code STBTTPackRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTPackRange calloc() {
        return new STBTTPackRange(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code STBTTPackRange} instance allocated with {@link BufferUtils}. */
    public static STBTTPackRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new STBTTPackRange(memAddress(container), container);
    }

    /** Returns a new {@code STBTTPackRange} instance for the specified memory address. */
    public static STBTTPackRange create(long address) {
        return new STBTTPackRange(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable STBTTPackRange createSafe(long address) {
        return address == NULL ? null : new STBTTPackRange(address, null);
    }

    /**
     * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackRange.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackRange.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTPackRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTPackRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link STBTTPackRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBTTPackRange.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static STBTTPackRange.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackRange mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackRange callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackRange mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static STBTTPackRange callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackRange.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackRange.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackRange.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static STBTTPackRange.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code STBTTPackRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTPackRange malloc(MemoryStack stack) {
        return new STBTTPackRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code STBTTPackRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTPackRange calloc(MemoryStack stack) {
        return new STBTTPackRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link STBTTPackRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTPackRange.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTPackRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTPackRange.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #font_size}. */
    public static float nfont_size(long struct) { return memGetFloat(struct + STBTTPackRange.FONT_SIZE); }
    /** Unsafe version of {@link #first_unicode_codepoint_in_range}. */
    public static int nfirst_unicode_codepoint_in_range(long struct) { return memGetInt(struct + STBTTPackRange.FIRST_UNICODE_CODEPOINT_IN_RANGE); }
    /** Unsafe version of {@link #array_of_unicode_codepoints() array_of_unicode_codepoints}. */
    public static @Nullable IntBuffer narray_of_unicode_codepoints(long struct) { return memIntBufferSafe(memGetAddress(struct + STBTTPackRange.ARRAY_OF_UNICODE_CODEPOINTS), nnum_chars(struct)); }
    /** Unsafe version of {@link #num_chars}. */
    public static int nnum_chars(long struct) { return memGetInt(struct + STBTTPackRange.NUM_CHARS); }
    /** Unsafe version of {@link #chardata_for_range}. */
    public static STBTTPackedchar.Buffer nchardata_for_range(long struct) { return STBTTPackedchar.create(memGetAddress(struct + STBTTPackRange.CHARDATA_FOR_RANGE), nnum_chars(struct)); }
    /** Unsafe version of {@link #h_oversample}. */
    public static byte nh_oversample(long struct) { return memGetByte(struct + STBTTPackRange.H_OVERSAMPLE); }
    /** Unsafe version of {@link #v_oversample}. */
    public static byte nv_oversample(long struct) { return memGetByte(struct + STBTTPackRange.V_OVERSAMPLE); }

    /** Unsafe version of {@link #font_size(float) font_size}. */
    public static void nfont_size(long struct, float value) { memPutFloat(struct + STBTTPackRange.FONT_SIZE, value); }
    /** Unsafe version of {@link #first_unicode_codepoint_in_range(int) first_unicode_codepoint_in_range}. */
    public static void nfirst_unicode_codepoint_in_range(long struct, int value) { memPutInt(struct + STBTTPackRange.FIRST_UNICODE_CODEPOINT_IN_RANGE, value); }
    /** Unsafe version of {@link #array_of_unicode_codepoints(IntBuffer) array_of_unicode_codepoints}. */
    public static void narray_of_unicode_codepoints(long struct, @Nullable IntBuffer value) { memPutAddress(struct + STBTTPackRange.ARRAY_OF_UNICODE_CODEPOINTS, memAddressSafe(value)); }
    /** Sets the specified value to the {@code num_chars} field of the specified {@code struct}. */
    public static void nnum_chars(long struct, int value) { memPutInt(struct + STBTTPackRange.NUM_CHARS, value); }
    /** Unsafe version of {@link #chardata_for_range(STBTTPackedchar.Buffer) chardata_for_range}. */
    public static void nchardata_for_range(long struct, STBTTPackedchar.Buffer value) { memPutAddress(struct + STBTTPackRange.CHARDATA_FOR_RANGE, value.address()); }
    /** Unsafe version of {@link #h_oversample(byte) h_oversample}. */
    public static void nh_oversample(long struct, byte value) { memPutByte(struct + STBTTPackRange.H_OVERSAMPLE, value); }
    /** Unsafe version of {@link #v_oversample(byte) v_oversample}. */
    public static void nv_oversample(long struct, byte value) { memPutByte(struct + STBTTPackRange.V_OVERSAMPLE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + STBTTPackRange.CHARDATA_FOR_RANGE));
    }

    // -----------------------------------

    /** An array of {@link STBTTPackRange} structs. */
    public static class Buffer extends StructBuffer<STBTTPackRange, Buffer> implements NativeResource {

        private static final STBTTPackRange ELEMENT_FACTORY = STBTTPackRange.create(-1L);

        /**
         * Creates a new {@code STBTTPackRange.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTPackRange#SIZEOF}, and its mark will be undefined.</p>
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
        protected STBTTPackRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code font_size} field. */
        public float font_size() { return STBTTPackRange.nfont_size(address()); }
        /** @return the value of the {@code first_unicode_codepoint_in_range} field. */
        public int first_unicode_codepoint_in_range() { return STBTTPackRange.nfirst_unicode_codepoint_in_range(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code array_of_unicode_codepoints} field. */
        @NativeType("int *")
        public @Nullable IntBuffer array_of_unicode_codepoints() { return STBTTPackRange.narray_of_unicode_codepoints(address()); }
        /** @return the value of the {@code num_chars} field. */
        public int num_chars() { return STBTTPackRange.nnum_chars(address()); }
        /** @return a {@link STBTTPackedchar.Buffer} view of the struct array pointed to by the {@code chardata_for_range} field. */
        @NativeType("stbtt_packedchar *")
        public STBTTPackedchar.Buffer chardata_for_range() { return STBTTPackRange.nchardata_for_range(address()); }
        /** @return the value of the {@code h_oversample} field. */
        @NativeType("unsigned char")
        public byte h_oversample() { return STBTTPackRange.nh_oversample(address()); }
        /** @return the value of the {@code v_oversample} field. */
        @NativeType("unsigned char")
        public byte v_oversample() { return STBTTPackRange.nv_oversample(address()); }

        /** Sets the specified value to the {@code font_size} field. */
        public STBTTPackRange.Buffer font_size(float value) { STBTTPackRange.nfont_size(address(), value); return this; }
        /** Sets the specified value to the {@code first_unicode_codepoint_in_range} field. */
        public STBTTPackRange.Buffer first_unicode_codepoint_in_range(int value) { STBTTPackRange.nfirst_unicode_codepoint_in_range(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code array_of_unicode_codepoints} field. */
        public STBTTPackRange.Buffer array_of_unicode_codepoints(@Nullable @NativeType("int *") IntBuffer value) { STBTTPackRange.narray_of_unicode_codepoints(address(), value); return this; }
        /** Sets the specified value to the {@code num_chars} field. */
        public STBTTPackRange.Buffer num_chars(int value) { STBTTPackRange.nnum_chars(address(), value); return this; }
        /** Sets the address of the specified {@link STBTTPackedchar.Buffer} to the {@code chardata_for_range} field. */
        public STBTTPackRange.Buffer chardata_for_range(@NativeType("stbtt_packedchar *") STBTTPackedchar.Buffer value) { STBTTPackRange.nchardata_for_range(address(), value); return this; }
        /** Sets the specified value to the {@code h_oversample} field. */
        public STBTTPackRange.Buffer h_oversample(@NativeType("unsigned char") byte value) { STBTTPackRange.nh_oversample(address(), value); return this; }
        /** Sets the specified value to the {@code v_oversample} field. */
        public STBTTPackRange.Buffer v_oversample(@NativeType("unsigned char") byte value) { STBTTPackRange.nv_oversample(address(), value); return this; }

    }

}