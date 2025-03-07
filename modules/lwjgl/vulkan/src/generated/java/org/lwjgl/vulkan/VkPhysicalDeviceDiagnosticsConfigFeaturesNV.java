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
 * struct VkPhysicalDeviceDiagnosticsConfigFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 diagnosticsConfig;
 * }}</pre>
 */
public class VkPhysicalDeviceDiagnosticsConfigFeaturesNV extends Struct<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DIAGNOSTICSCONFIG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DIAGNOSTICSCONFIG = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDiagnosticsConfigFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDiagnosticsConfigFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code diagnosticsConfig} field. */
    @NativeType("VkBool32")
    public boolean diagnosticsConfig() { return ndiagnosticsConfig(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceDiagnosticsConfig#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sType$Default() { return sType(NVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code diagnosticsConfig} field. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV diagnosticsConfig(@NativeType("VkBool32") boolean value) { ndiagnosticsConfig(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV set(
        int sType,
        long pNext,
        boolean diagnosticsConfig
    ) {
        sType(sType);
        pNext(pNext);
        diagnosticsConfig(diagnosticsConfig);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV set(VkPhysicalDeviceDiagnosticsConfigFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV malloc() {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV calloc() {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV create(long address) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDiagnosticsConfigFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #diagnosticsConfig}. */
    public static int ndiagnosticsConfig(long struct) { return memGetInt(struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.DIAGNOSTICSCONFIG); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #diagnosticsConfig(boolean) diagnosticsConfig}. */
    public static void ndiagnosticsConfig(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDiagnosticsConfigFeaturesNV.DIAGNOSTICSCONFIG, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDiagnosticsConfigFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDiagnosticsConfigFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDiagnosticsConfigFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDiagnosticsConfigFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDiagnosticsConfigFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.npNext(address()); }
        /** @return the value of the {@code diagnosticsConfig} field. */
        @NativeType("VkBool32")
        public boolean diagnosticsConfig() { return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.ndiagnosticsConfig(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDiagnosticsConfigFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceDiagnosticsConfig#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer sType$Default() { return sType(NVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDiagnosticsConfigFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code diagnosticsConfig} field. */
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV.Buffer diagnosticsConfig(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDiagnosticsConfigFeaturesNV.ndiagnosticsConfig(address(), value ? 1 : 0); return this; }

    }

}