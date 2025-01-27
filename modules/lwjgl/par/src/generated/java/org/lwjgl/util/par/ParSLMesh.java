/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct parsl_mesh {
 *     uint32_t num_vertices;
 *     uint32_t num_triangles;
 *     uint32_t * triangle_indices;
 *     {@link ParSLPosition parsl_position} * positions;
 *     {@link ParSLAnnotation parsl_annotation} * annotations;
 *     float * spine_lengths;
 *     float * random_offsets;
 * }}</pre>
 */
@NativeType("struct parsl_mesh")
public class ParSLMesh extends Struct<ParSLMesh> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_VERTICES,
        NUM_TRIANGLES,
        TRIANGLE_INDICES,
        POSITIONS,
        ANNOTATIONS,
        SPINE_LENGTHS,
        RANDOM_OFFSETS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_VERTICES = layout.offsetof(0);
        NUM_TRIANGLES = layout.offsetof(1);
        TRIANGLE_INDICES = layout.offsetof(2);
        POSITIONS = layout.offsetof(3);
        ANNOTATIONS = layout.offsetof(4);
        SPINE_LENGTHS = layout.offsetof(5);
        RANDOM_OFFSETS = layout.offsetof(6);
    }

    protected ParSLMesh(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ParSLMesh create(long address, @Nullable ByteBuffer container) {
        return new ParSLMesh(address, container);
    }

    /**
     * Creates a {@code ParSLMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ParSLMesh(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_vertices} field. */
    @NativeType("uint32_t")
    public int num_vertices() { return nnum_vertices(address()); }
    /** @return the value of the {@code num_triangles} field. */
    @NativeType("uint32_t")
    public int num_triangles() { return nnum_triangles(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code triangle_indices} field. */
    @NativeType("uint32_t *")
    public IntBuffer triangle_indices(int capacity) { return ntriangle_indices(address(), capacity); }
    /** @return a {@link ParSLPosition.Buffer} view of the struct array pointed to by the {@code positions} field. */
    @NativeType("parsl_position *")
    public ParSLPosition.Buffer positions() { return npositions(address()); }
    /** @return a {@link ParSLAnnotation.Buffer} view of the struct array pointed to by the {@code annotations} field. */
    @NativeType("parsl_annotation *")
    public ParSLAnnotation.@Nullable Buffer annotations() { return nannotations(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code spine_lengths} field. */
    @NativeType("float *")
    public @Nullable FloatBuffer spine_lengths() { return nspine_lengths(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code random_offsets} field. */
    @NativeType("float *")
    public @Nullable FloatBuffer random_offsets() { return nrandom_offsets(address()); }

    // -----------------------------------

    /** Returns a new {@code ParSLMesh} instance for the specified memory address. */
    public static ParSLMesh create(long address) {
        return new ParSLMesh(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ParSLMesh createSafe(long address) {
        return address == NULL ? null : new ParSLMesh(address, null);
    }

    /**
     * Create a {@link ParSLMesh.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ParSLMesh.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static ParSLMesh.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_vertices}. */
    public static int nnum_vertices(long struct) { return memGetInt(struct + ParSLMesh.NUM_VERTICES); }
    /** Unsafe version of {@link #num_triangles}. */
    public static int nnum_triangles(long struct) { return memGetInt(struct + ParSLMesh.NUM_TRIANGLES); }
    /** Unsafe version of {@link #triangle_indices(int) triangle_indices}. */
    public static IntBuffer ntriangle_indices(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + ParSLMesh.TRIANGLE_INDICES), capacity); }
    /** Unsafe version of {@link #positions}. */
    public static ParSLPosition.Buffer npositions(long struct) { return ParSLPosition.create(memGetAddress(struct + ParSLMesh.POSITIONS), nnum_vertices(struct)); }
    /** Unsafe version of {@link #annotations}. */
    public static ParSLAnnotation.@Nullable Buffer nannotations(long struct) { return ParSLAnnotation.createSafe(memGetAddress(struct + ParSLMesh.ANNOTATIONS), nnum_vertices(struct)); }
    /** Unsafe version of {@link #spine_lengths() spine_lengths}. */
    public static @Nullable FloatBuffer nspine_lengths(long struct) { return memFloatBufferSafe(memGetAddress(struct + ParSLMesh.SPINE_LENGTHS), nnum_vertices(struct)); }
    /** Unsafe version of {@link #random_offsets() random_offsets}. */
    public static @Nullable FloatBuffer nrandom_offsets(long struct) { return memFloatBufferSafe(memGetAddress(struct + ParSLMesh.RANDOM_OFFSETS), nnum_vertices(struct)); }

    // -----------------------------------

    /** An array of {@link ParSLMesh} structs. */
    public static class Buffer extends StructBuffer<ParSLMesh, Buffer> {

        private static final ParSLMesh ELEMENT_FACTORY = ParSLMesh.create(-1L);

        /**
         * Creates a new {@code ParSLMesh.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ParSLMesh#SIZEOF}, and its mark will be undefined.</p>
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
        protected ParSLMesh getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_vertices} field. */
        @NativeType("uint32_t")
        public int num_vertices() { return ParSLMesh.nnum_vertices(address()); }
        /** @return the value of the {@code num_triangles} field. */
        @NativeType("uint32_t")
        public int num_triangles() { return ParSLMesh.nnum_triangles(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code triangle_indices} field. */
        @NativeType("uint32_t *")
        public IntBuffer triangle_indices(int capacity) { return ParSLMesh.ntriangle_indices(address(), capacity); }
        /** @return a {@link ParSLPosition.Buffer} view of the struct array pointed to by the {@code positions} field. */
        @NativeType("parsl_position *")
        public ParSLPosition.Buffer positions() { return ParSLMesh.npositions(address()); }
        /** @return a {@link ParSLAnnotation.Buffer} view of the struct array pointed to by the {@code annotations} field. */
        @NativeType("parsl_annotation *")
        public ParSLAnnotation.@Nullable Buffer annotations() { return ParSLMesh.nannotations(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code spine_lengths} field. */
        @NativeType("float *")
        public @Nullable FloatBuffer spine_lengths() { return ParSLMesh.nspine_lengths(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code random_offsets} field. */
        @NativeType("float *")
        public @Nullable FloatBuffer random_offsets() { return ParSLMesh.nrandom_offsets(address()); }

    }

}