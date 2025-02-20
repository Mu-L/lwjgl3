/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkAccelerationStructureGeometryTrianglesDataKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormat vertexFormat;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} vertexData;
 *     VkDeviceSize vertexStride;
 *     uint32_t maxVertex;
 *     VkIndexType indexType;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} indexData;
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} transformData;
 * }}</pre>
 */
public class VkAccelerationStructureGeometryTrianglesDataKHR extends Struct<VkAccelerationStructureGeometryTrianglesDataKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXFORMAT,
        VERTEXDATA,
        VERTEXSTRIDE,
        MAXVERTEX,
        INDEXTYPE,
        INDEXDATA,
        TRANSFORMDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(4),
            __member(4),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXFORMAT = layout.offsetof(2);
        VERTEXDATA = layout.offsetof(3);
        VERTEXSTRIDE = layout.offsetof(4);
        MAXVERTEX = layout.offsetof(5);
        INDEXTYPE = layout.offsetof(6);
        INDEXDATA = layout.offsetof(7);
        TRANSFORMDATA = layout.offsetof(8);
    }

    protected VkAccelerationStructureGeometryTrianglesDataKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureGeometryTrianglesDataKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureGeometryTrianglesDataKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureGeometryTrianglesDataKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code vertexFormat} field. */
    @NativeType("VkFormat")
    public int vertexFormat() { return nvertexFormat(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code vertexData} field. */
    public VkDeviceOrHostAddressConstKHR vertexData() { return nvertexData(address()); }
    /** @return the value of the {@code vertexStride} field. */
    @NativeType("VkDeviceSize")
    public long vertexStride() { return nvertexStride(address()); }
    /** @return the value of the {@code maxVertex} field. */
    @NativeType("uint32_t")
    public int maxVertex() { return nmaxVertex(address()); }
    /** @return the value of the {@code indexType} field. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code indexData} field. */
    public VkDeviceOrHostAddressConstKHR indexData() { return nindexData(address()); }
    /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code transformData} field. */
    public VkDeviceOrHostAddressConstKHR transformData() { return ntransformData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR} value to the {@code sType} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAccelerationStructureGeometryMotionTrianglesDataNV} value to the {@code pNext} chain. */
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(VkAccelerationStructureGeometryMotionTrianglesDataNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkAccelerationStructureTrianglesDisplacementMicromapNV} value to the {@code pNext} chain. */
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(VkAccelerationStructureTrianglesDisplacementMicromapNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkAccelerationStructureTrianglesOpacityMicromapEXT} value to the {@code pNext} chain. */
    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(VkAccelerationStructureTrianglesOpacityMicromapEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code vertexFormat} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormat(@NativeType("VkFormat") int value) { nvertexFormat(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code vertexData} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(VkDeviceOrHostAddressConstKHR value) { nvertexData(address(), value); return this; }
    /** Passes the {@code vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }
    /** Sets the specified value to the {@code vertexStride} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStride(@NativeType("VkDeviceSize") long value) { nvertexStride(address(), value); return this; }
    /** Sets the specified value to the {@code maxVertex} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertex(@NativeType("uint32_t") int value) { nmaxVertex(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code indexData} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(VkDeviceOrHostAddressConstKHR value) { nindexData(address(), value); return this; }
    /** Passes the {@code indexData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexData()); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code transformData} field. */
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(VkDeviceOrHostAddressConstKHR value) { ntransformData(address(), value); return this; }
    /** Passes the {@code transformData} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(transformData()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureGeometryTrianglesDataKHR set(
        int sType,
        long pNext,
        int vertexFormat,
        VkDeviceOrHostAddressConstKHR vertexData,
        long vertexStride,
        int maxVertex,
        int indexType,
        VkDeviceOrHostAddressConstKHR indexData,
        VkDeviceOrHostAddressConstKHR transformData
    ) {
        sType(sType);
        pNext(pNext);
        vertexFormat(vertexFormat);
        vertexData(vertexData);
        vertexStride(vertexStride);
        maxVertex(maxVertex);
        indexType(indexType);
        indexData(indexData);
        transformData(transformData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureGeometryTrianglesDataKHR set(VkAccelerationStructureGeometryTrianglesDataKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureGeometryTrianglesDataKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryTrianglesDataKHR malloc() {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryTrianglesDataKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureGeometryTrianglesDataKHR calloc() {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryTrianglesDataKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureGeometryTrianglesDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryTrianglesDataKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureGeometryTrianglesDataKHR} instance for the specified memory address. */
    public static VkAccelerationStructureGeometryTrianglesDataKHR create(long address) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureGeometryTrianglesDataKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureGeometryTrianglesDataKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryTrianglesDataKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryTrianglesDataKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryTrianglesDataKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryTrianglesDataKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryTrianglesDataKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryTrianglesDataKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureGeometryTrianglesDataKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryTrianglesDataKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureGeometryTrianglesDataKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryTrianglesDataKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryTrianglesDataKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureGeometryTrianglesDataKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureGeometryTrianglesDataKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryTrianglesDataKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryTrianglesDataKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureGeometryTrianglesDataKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureGeometryTrianglesDataKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryTrianglesDataKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureGeometryTrianglesDataKHR.PNEXT); }
    /** Unsafe version of {@link #vertexFormat}. */
    public static int nvertexFormat(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXFORMAT); }
    /** Unsafe version of {@link #vertexData}. */
    public static VkDeviceOrHostAddressConstKHR nvertexData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXDATA); }
    /** Unsafe version of {@link #vertexStride}. */
    public static long nvertexStride(long struct) { return memGetLong(struct + VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXSTRIDE); }
    /** Unsafe version of {@link #maxVertex}. */
    public static int nmaxVertex(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryTrianglesDataKHR.MAXVERTEX); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return memGetInt(struct + VkAccelerationStructureGeometryTrianglesDataKHR.INDEXTYPE); }
    /** Unsafe version of {@link #indexData}. */
    public static VkDeviceOrHostAddressConstKHR nindexData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryTrianglesDataKHR.INDEXDATA); }
    /** Unsafe version of {@link #transformData}. */
    public static VkDeviceOrHostAddressConstKHR ntransformData(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkAccelerationStructureGeometryTrianglesDataKHR.TRANSFORMDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryTrianglesDataKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureGeometryTrianglesDataKHR.PNEXT, value); }
    /** Unsafe version of {@link #vertexFormat(int) vertexFormat}. */
    public static void nvertexFormat(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXFORMAT, value); }
    /** Unsafe version of {@link #vertexData(VkDeviceOrHostAddressConstKHR) vertexData}. */
    public static void nvertexData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #vertexStride(long) vertexStride}. */
    public static void nvertexStride(long struct, long value) { memPutLong(struct + VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXSTRIDE, value); }
    /** Unsafe version of {@link #maxVertex(int) maxVertex}. */
    public static void nmaxVertex(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryTrianglesDataKHR.MAXVERTEX, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { memPutInt(struct + VkAccelerationStructureGeometryTrianglesDataKHR.INDEXTYPE, value); }
    /** Unsafe version of {@link #indexData(VkDeviceOrHostAddressConstKHR) indexData}. */
    public static void nindexData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryTrianglesDataKHR.INDEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #transformData(VkDeviceOrHostAddressConstKHR) transformData}. */
    public static void ntransformData(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkAccelerationStructureGeometryTrianglesDataKHR.TRANSFORMDATA, VkDeviceOrHostAddressConstKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureGeometryTrianglesDataKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryTrianglesDataKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureGeometryTrianglesDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryTrianglesDataKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureGeometryTrianglesDataKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureGeometryTrianglesDataKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureGeometryTrianglesDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureGeometryTrianglesDataKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureGeometryTrianglesDataKHR.npNext(address()); }
        /** @return the value of the {@code vertexFormat} field. */
        @NativeType("VkFormat")
        public int vertexFormat() { return VkAccelerationStructureGeometryTrianglesDataKHR.nvertexFormat(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code vertexData} field. */
        public VkDeviceOrHostAddressConstKHR vertexData() { return VkAccelerationStructureGeometryTrianglesDataKHR.nvertexData(address()); }
        /** @return the value of the {@code vertexStride} field. */
        @NativeType("VkDeviceSize")
        public long vertexStride() { return VkAccelerationStructureGeometryTrianglesDataKHR.nvertexStride(address()); }
        /** @return the value of the {@code maxVertex} field. */
        @NativeType("uint32_t")
        public int maxVertex() { return VkAccelerationStructureGeometryTrianglesDataKHR.nmaxVertex(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkAccelerationStructureGeometryTrianglesDataKHR.nindexType(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code indexData} field. */
        public VkDeviceOrHostAddressConstKHR indexData() { return VkAccelerationStructureGeometryTrianglesDataKHR.nindexData(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@code transformData} field. */
        public VkDeviceOrHostAddressConstKHR transformData() { return VkAccelerationStructureGeometryTrianglesDataKHR.ntransformData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR} value to the {@code sType} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureGeometryTrianglesDataKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAccelerationStructureGeometryMotionTrianglesDataNV} value to the {@code pNext} chain. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer pNext(VkAccelerationStructureGeometryMotionTrianglesDataNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkAccelerationStructureTrianglesDisplacementMicromapNV} value to the {@code pNext} chain. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer pNext(VkAccelerationStructureTrianglesDisplacementMicromapNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkAccelerationStructureTrianglesOpacityMicromapEXT} value to the {@code pNext} chain. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer pNext(VkAccelerationStructureTrianglesOpacityMicromapEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code vertexFormat} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer vertexFormat(@NativeType("VkFormat") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.nvertexFormat(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code vertexData} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer vertexData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryTrianglesDataKHR.nvertexData(address(), value); return this; }
        /** Passes the {@code vertexData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer vertexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(vertexData()); return this; }
        /** Sets the specified value to the {@code vertexStride} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer vertexStride(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureGeometryTrianglesDataKHR.nvertexStride(address(), value); return this; }
        /** Sets the specified value to the {@code maxVertex} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer maxVertex(@NativeType("uint32_t") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.nmaxVertex(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer indexType(@NativeType("VkIndexType") int value) { VkAccelerationStructureGeometryTrianglesDataKHR.nindexType(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code indexData} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer indexData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryTrianglesDataKHR.nindexData(address(), value); return this; }
        /** Passes the {@code indexData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer indexData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(indexData()); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@code transformData} field. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer transformData(VkDeviceOrHostAddressConstKHR value) { VkAccelerationStructureGeometryTrianglesDataKHR.ntransformData(address(), value); return this; }
        /** Passes the {@code transformData} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureGeometryTrianglesDataKHR.Buffer transformData(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(transformData()); return this; }

    }

}