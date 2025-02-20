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
 * struct VkPhysicalDeviceVulkan12Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 samplerMirrorClampToEdge;
 *     VkBool32 drawIndirectCount;
 *     VkBool32 storageBuffer8BitAccess;
 *     VkBool32 uniformAndStorageBuffer8BitAccess;
 *     VkBool32 storagePushConstant8;
 *     VkBool32 shaderBufferInt64Atomics;
 *     VkBool32 shaderSharedInt64Atomics;
 *     VkBool32 shaderFloat16;
 *     VkBool32 shaderInt8;
 *     VkBool32 descriptorIndexing;
 *     VkBool32 shaderInputAttachmentArrayDynamicIndexing;
 *     VkBool32 shaderUniformTexelBufferArrayDynamicIndexing;
 *     VkBool32 shaderStorageTexelBufferArrayDynamicIndexing;
 *     VkBool32 shaderUniformBufferArrayNonUniformIndexing;
 *     VkBool32 shaderSampledImageArrayNonUniformIndexing;
 *     VkBool32 shaderStorageBufferArrayNonUniformIndexing;
 *     VkBool32 shaderStorageImageArrayNonUniformIndexing;
 *     VkBool32 shaderInputAttachmentArrayNonUniformIndexing;
 *     VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing;
 *     VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing;
 *     VkBool32 descriptorBindingUniformBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingSampledImageUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageImageUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind;
 *     VkBool32 descriptorBindingUpdateUnusedWhilePending;
 *     VkBool32 descriptorBindingPartiallyBound;
 *     VkBool32 descriptorBindingVariableDescriptorCount;
 *     VkBool32 runtimeDescriptorArray;
 *     VkBool32 samplerFilterMinmax;
 *     VkBool32 scalarBlockLayout;
 *     VkBool32 imagelessFramebuffer;
 *     VkBool32 uniformBufferStandardLayout;
 *     VkBool32 shaderSubgroupExtendedTypes;
 *     VkBool32 separateDepthStencilLayouts;
 *     VkBool32 hostQueryReset;
 *     VkBool32 timelineSemaphore;
 *     VkBool32 bufferDeviceAddress;
 *     VkBool32 bufferDeviceAddressCaptureReplay;
 *     VkBool32 bufferDeviceAddressMultiDevice;
 *     VkBool32 vulkanMemoryModel;
 *     VkBool32 vulkanMemoryModelDeviceScope;
 *     VkBool32 vulkanMemoryModelAvailabilityVisibilityChains;
 *     VkBool32 shaderOutputViewportIndex;
 *     VkBool32 shaderOutputLayer;
 *     VkBool32 subgroupBroadcastDynamicId;
 * }}</pre>
 */
public class VkPhysicalDeviceVulkan12Features extends Struct<VkPhysicalDeviceVulkan12Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLERMIRRORCLAMPTOEDGE,
        DRAWINDIRECTCOUNT,
        STORAGEBUFFER8BITACCESS,
        UNIFORMANDSTORAGEBUFFER8BITACCESS,
        STORAGEPUSHCONSTANT8,
        SHADERBUFFERINT64ATOMICS,
        SHADERSHAREDINT64ATOMICS,
        SHADERFLOAT16,
        SHADERINT8,
        DESCRIPTORINDEXING,
        SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING,
        SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING,
        SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING,
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING,
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING,
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING,
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING,
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING,
        SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING,
        SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING,
        DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND,
        DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND,
        DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND,
        DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND,
        DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND,
        DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND,
        DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING,
        DESCRIPTORBINDINGPARTIALLYBOUND,
        DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT,
        RUNTIMEDESCRIPTORARRAY,
        SAMPLERFILTERMINMAX,
        SCALARBLOCKLAYOUT,
        IMAGELESSFRAMEBUFFER,
        UNIFORMBUFFERSTANDARDLAYOUT,
        SHADERSUBGROUPEXTENDEDTYPES,
        SEPARATEDEPTHSTENCILLAYOUTS,
        HOSTQUERYRESET,
        TIMELINESEMAPHORE,
        BUFFERDEVICEADDRESS,
        BUFFERDEVICEADDRESSCAPTUREREPLAY,
        BUFFERDEVICEADDRESSMULTIDEVICE,
        VULKANMEMORYMODEL,
        VULKANMEMORYMODELDEVICESCOPE,
        VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS,
        SHADEROUTPUTVIEWPORTINDEX,
        SHADEROUTPUTLAYER,
        SUBGROUPBROADCASTDYNAMICID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLERMIRRORCLAMPTOEDGE = layout.offsetof(2);
        DRAWINDIRECTCOUNT = layout.offsetof(3);
        STORAGEBUFFER8BITACCESS = layout.offsetof(4);
        UNIFORMANDSTORAGEBUFFER8BITACCESS = layout.offsetof(5);
        STORAGEPUSHCONSTANT8 = layout.offsetof(6);
        SHADERBUFFERINT64ATOMICS = layout.offsetof(7);
        SHADERSHAREDINT64ATOMICS = layout.offsetof(8);
        SHADERFLOAT16 = layout.offsetof(9);
        SHADERINT8 = layout.offsetof(10);
        DESCRIPTORINDEXING = layout.offsetof(11);
        SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING = layout.offsetof(12);
        SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(13);
        SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING = layout.offsetof(14);
        SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(15);
        SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(16);
        SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(17);
        SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING = layout.offsetof(18);
        SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING = layout.offsetof(19);
        SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(20);
        SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING = layout.offsetof(21);
        DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND = layout.offsetof(22);
        DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND = layout.offsetof(23);
        DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND = layout.offsetof(24);
        DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND = layout.offsetof(25);
        DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND = layout.offsetof(26);
        DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND = layout.offsetof(27);
        DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING = layout.offsetof(28);
        DESCRIPTORBINDINGPARTIALLYBOUND = layout.offsetof(29);
        DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT = layout.offsetof(30);
        RUNTIMEDESCRIPTORARRAY = layout.offsetof(31);
        SAMPLERFILTERMINMAX = layout.offsetof(32);
        SCALARBLOCKLAYOUT = layout.offsetof(33);
        IMAGELESSFRAMEBUFFER = layout.offsetof(34);
        UNIFORMBUFFERSTANDARDLAYOUT = layout.offsetof(35);
        SHADERSUBGROUPEXTENDEDTYPES = layout.offsetof(36);
        SEPARATEDEPTHSTENCILLAYOUTS = layout.offsetof(37);
        HOSTQUERYRESET = layout.offsetof(38);
        TIMELINESEMAPHORE = layout.offsetof(39);
        BUFFERDEVICEADDRESS = layout.offsetof(40);
        BUFFERDEVICEADDRESSCAPTUREREPLAY = layout.offsetof(41);
        BUFFERDEVICEADDRESSMULTIDEVICE = layout.offsetof(42);
        VULKANMEMORYMODEL = layout.offsetof(43);
        VULKANMEMORYMODELDEVICESCOPE = layout.offsetof(44);
        VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS = layout.offsetof(45);
        SHADEROUTPUTVIEWPORTINDEX = layout.offsetof(46);
        SHADEROUTPUTLAYER = layout.offsetof(47);
        SUBGROUPBROADCASTDYNAMICID = layout.offsetof(48);
    }

    protected VkPhysicalDeviceVulkan12Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkan12Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkan12Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan12Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan12Features(ByteBuffer container) {
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
    /** @return the value of the {@code samplerMirrorClampToEdge} field. */
    @NativeType("VkBool32")
    public boolean samplerMirrorClampToEdge() { return nsamplerMirrorClampToEdge(address()) != 0; }
    /** @return the value of the {@code drawIndirectCount} field. */
    @NativeType("VkBool32")
    public boolean drawIndirectCount() { return ndrawIndirectCount(address()) != 0; }
    /** @return the value of the {@code storageBuffer8BitAccess} field. */
    @NativeType("VkBool32")
    public boolean storageBuffer8BitAccess() { return nstorageBuffer8BitAccess(address()) != 0; }
    /** @return the value of the {@code uniformAndStorageBuffer8BitAccess} field. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer8BitAccess() { return nuniformAndStorageBuffer8BitAccess(address()) != 0; }
    /** @return the value of the {@code storagePushConstant8} field. */
    @NativeType("VkBool32")
    public boolean storagePushConstant8() { return nstoragePushConstant8(address()) != 0; }
    /** @return the value of the {@code shaderBufferInt64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderBufferInt64Atomics() { return nshaderBufferInt64Atomics(address()) != 0; }
    /** @return the value of the {@code shaderSharedInt64Atomics} field. */
    @NativeType("VkBool32")
    public boolean shaderSharedInt64Atomics() { return nshaderSharedInt64Atomics(address()) != 0; }
    /** @return the value of the {@code shaderFloat16} field. */
    @NativeType("VkBool32")
    public boolean shaderFloat16() { return nshaderFloat16(address()) != 0; }
    /** @return the value of the {@code shaderInt8} field. */
    @NativeType("VkBool32")
    public boolean shaderInt8() { return nshaderInt8(address()) != 0; }
    /** @return the value of the {@code descriptorIndexing} field. */
    @NativeType("VkBool32")
    public boolean descriptorIndexing() { return ndescriptorIndexing(address()) != 0; }
    /** @return the value of the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayDynamicIndexing() { return nshaderInputAttachmentArrayDynamicIndexing(address()) != 0; }
    /** @return the value of the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayDynamicIndexing() { return nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0; }
    /** @return the value of the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayDynamicIndexing() { return nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0; }
    /** @return the value of the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexing() { return nshaderUniformBufferArrayNonUniformIndexing(address()) != 0; }
    /** @return the value of the {@code shaderSampledImageArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexing() { return nshaderSampledImageArrayNonUniformIndexing(address()) != 0; }
    /** @return the value of the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexing() { return nshaderStorageBufferArrayNonUniformIndexing(address()) != 0; }
    /** @return the value of the {@code shaderStorageImageArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexing() { return nshaderStorageImageArrayNonUniformIndexing(address()) != 0; }
    /** @return the value of the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexing() { return nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0; }
    /** @return the value of the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayNonUniformIndexing() { return nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0; }
    /** @return the value of the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayNonUniformIndexing() { return nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0; }
    /** @return the value of the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUniformBufferUpdateAfterBind() { return ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingSampledImageUpdateAfterBind() { return ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageImageUpdateAfterBind() { return ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageBufferUpdateAfterBind() { return ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() { return ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() { return ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code descriptorBindingUpdateUnusedWhilePending} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingUpdateUnusedWhilePending() { return ndescriptorBindingUpdateUnusedWhilePending(address()) != 0; }
    /** @return the value of the {@code descriptorBindingPartiallyBound} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingPartiallyBound() { return ndescriptorBindingPartiallyBound(address()) != 0; }
    /** @return the value of the {@code descriptorBindingVariableDescriptorCount} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingVariableDescriptorCount() { return ndescriptorBindingVariableDescriptorCount(address()) != 0; }
    /** @return the value of the {@code runtimeDescriptorArray} field. */
    @NativeType("VkBool32")
    public boolean runtimeDescriptorArray() { return nruntimeDescriptorArray(address()) != 0; }
    /** @return the value of the {@code samplerFilterMinmax} field. */
    @NativeType("VkBool32")
    public boolean samplerFilterMinmax() { return nsamplerFilterMinmax(address()) != 0; }
    /** @return the value of the {@code scalarBlockLayout} field. */
    @NativeType("VkBool32")
    public boolean scalarBlockLayout() { return nscalarBlockLayout(address()) != 0; }
    /** @return the value of the {@code imagelessFramebuffer} field. */
    @NativeType("VkBool32")
    public boolean imagelessFramebuffer() { return nimagelessFramebuffer(address()) != 0; }
    /** @return the value of the {@code uniformBufferStandardLayout} field. */
    @NativeType("VkBool32")
    public boolean uniformBufferStandardLayout() { return nuniformBufferStandardLayout(address()) != 0; }
    /** @return the value of the {@code shaderSubgroupExtendedTypes} field. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupExtendedTypes() { return nshaderSubgroupExtendedTypes(address()) != 0; }
    /** @return the value of the {@code separateDepthStencilLayouts} field. */
    @NativeType("VkBool32")
    public boolean separateDepthStencilLayouts() { return nseparateDepthStencilLayouts(address()) != 0; }
    /** @return the value of the {@code hostQueryReset} field. */
    @NativeType("VkBool32")
    public boolean hostQueryReset() { return nhostQueryReset(address()) != 0; }
    /** @return the value of the {@code timelineSemaphore} field. */
    @NativeType("VkBool32")
    public boolean timelineSemaphore() { return ntimelineSemaphore(address()) != 0; }
    /** @return the value of the {@code bufferDeviceAddress} field. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddress() { return nbufferDeviceAddress(address()) != 0; }
    /** @return the value of the {@code bufferDeviceAddressCaptureReplay} field. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddressCaptureReplay() { return nbufferDeviceAddressCaptureReplay(address()) != 0; }
    /** @return the value of the {@code bufferDeviceAddressMultiDevice} field. */
    @NativeType("VkBool32")
    public boolean bufferDeviceAddressMultiDevice() { return nbufferDeviceAddressMultiDevice(address()) != 0; }
    /** @return the value of the {@code vulkanMemoryModel} field. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModel() { return nvulkanMemoryModel(address()) != 0; }
    /** @return the value of the {@code vulkanMemoryModelDeviceScope} field. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelDeviceScope() { return nvulkanMemoryModelDeviceScope(address()) != 0; }
    /** @return the value of the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
    @NativeType("VkBool32")
    public boolean vulkanMemoryModelAvailabilityVisibilityChains() { return nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0; }
    /** @return the value of the {@code shaderOutputViewportIndex} field. */
    @NativeType("VkBool32")
    public boolean shaderOutputViewportIndex() { return nshaderOutputViewportIndex(address()) != 0; }
    /** @return the value of the {@code shaderOutputLayer} field. */
    @NativeType("VkBool32")
    public boolean shaderOutputLayer() { return nshaderOutputLayer(address()) != 0; }
    /** @return the value of the {@code subgroupBroadcastDynamicId} field. */
    @NativeType("VkBool32")
    public boolean subgroupBroadcastDynamicId() { return nsubgroupBroadcastDynamicId(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan12Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan12Features sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkan12Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code samplerMirrorClampToEdge} field. */
    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(@NativeType("VkBool32") boolean value) { nsamplerMirrorClampToEdge(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code drawIndirectCount} field. */
    public VkPhysicalDeviceVulkan12Features drawIndirectCount(@NativeType("VkBool32") boolean value) { ndrawIndirectCount(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storageBuffer8BitAccess} field. */
    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code uniformAndStorageBuffer8BitAccess} field. */
    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storagePushConstant8} field. */
    public VkPhysicalDeviceVulkan12Features storagePushConstant8(@NativeType("VkBool32") boolean value) { nstoragePushConstant8(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderBufferInt64Atomics} field. */
    public VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSharedInt64Atomics} field. */
    public VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderFloat16} field. */
    public VkPhysicalDeviceVulkan12Features shaderFloat16(@NativeType("VkBool32") boolean value) { nshaderFloat16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInt8} field. */
    public VkPhysicalDeviceVulkan12Features shaderInt8(@NativeType("VkBool32") boolean value) { nshaderInt8(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorIndexing} field. */
    public VkPhysicalDeviceVulkan12Features descriptorIndexing(@NativeType("VkBool32") boolean value) { ndescriptorIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSampledImageArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageImageArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingUpdateUnusedWhilePending} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingPartiallyBound} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingVariableDescriptorCount} field. */
    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code runtimeDescriptorArray} field. */
    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code samplerFilterMinmax} field. */
    public VkPhysicalDeviceVulkan12Features samplerFilterMinmax(@NativeType("VkBool32") boolean value) { nsamplerFilterMinmax(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code scalarBlockLayout} field. */
    public VkPhysicalDeviceVulkan12Features scalarBlockLayout(@NativeType("VkBool32") boolean value) { nscalarBlockLayout(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code imagelessFramebuffer} field. */
    public VkPhysicalDeviceVulkan12Features imagelessFramebuffer(@NativeType("VkBool32") boolean value) { nimagelessFramebuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code uniformBufferStandardLayout} field. */
    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderSubgroupExtendedTypes} field. */
    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code separateDepthStencilLayouts} field. */
    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) { nseparateDepthStencilLayouts(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code hostQueryReset} field. */
    public VkPhysicalDeviceVulkan12Features hostQueryReset(@NativeType("VkBool32") boolean value) { nhostQueryReset(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code timelineSemaphore} field. */
    public VkPhysicalDeviceVulkan12Features timelineSemaphore(@NativeType("VkBool32") boolean value) { ntimelineSemaphore(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddress} field. */
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddress(@NativeType("VkBool32") boolean value) { nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModel} field. */
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModel(@NativeType("VkBool32") boolean value) { nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModelDeviceScope} field. */
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderOutputViewportIndex} field. */
    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(@NativeType("VkBool32") boolean value) { nshaderOutputViewportIndex(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderOutputLayer} field. */
    public VkPhysicalDeviceVulkan12Features shaderOutputLayer(@NativeType("VkBool32") boolean value) { nshaderOutputLayer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code subgroupBroadcastDynamicId} field. */
    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(@NativeType("VkBool32") boolean value) { nsubgroupBroadcastDynamicId(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan12Features set(
        int sType,
        long pNext,
        boolean samplerMirrorClampToEdge,
        boolean drawIndirectCount,
        boolean storageBuffer8BitAccess,
        boolean uniformAndStorageBuffer8BitAccess,
        boolean storagePushConstant8,
        boolean shaderBufferInt64Atomics,
        boolean shaderSharedInt64Atomics,
        boolean shaderFloat16,
        boolean shaderInt8,
        boolean descriptorIndexing,
        boolean shaderInputAttachmentArrayDynamicIndexing,
        boolean shaderUniformTexelBufferArrayDynamicIndexing,
        boolean shaderStorageTexelBufferArrayDynamicIndexing,
        boolean shaderUniformBufferArrayNonUniformIndexing,
        boolean shaderSampledImageArrayNonUniformIndexing,
        boolean shaderStorageBufferArrayNonUniformIndexing,
        boolean shaderStorageImageArrayNonUniformIndexing,
        boolean shaderInputAttachmentArrayNonUniformIndexing,
        boolean shaderUniformTexelBufferArrayNonUniformIndexing,
        boolean shaderStorageTexelBufferArrayNonUniformIndexing,
        boolean descriptorBindingUniformBufferUpdateAfterBind,
        boolean descriptorBindingSampledImageUpdateAfterBind,
        boolean descriptorBindingStorageImageUpdateAfterBind,
        boolean descriptorBindingStorageBufferUpdateAfterBind,
        boolean descriptorBindingUniformTexelBufferUpdateAfterBind,
        boolean descriptorBindingStorageTexelBufferUpdateAfterBind,
        boolean descriptorBindingUpdateUnusedWhilePending,
        boolean descriptorBindingPartiallyBound,
        boolean descriptorBindingVariableDescriptorCount,
        boolean runtimeDescriptorArray,
        boolean samplerFilterMinmax,
        boolean scalarBlockLayout,
        boolean imagelessFramebuffer,
        boolean uniformBufferStandardLayout,
        boolean shaderSubgroupExtendedTypes,
        boolean separateDepthStencilLayouts,
        boolean hostQueryReset,
        boolean timelineSemaphore,
        boolean bufferDeviceAddress,
        boolean bufferDeviceAddressCaptureReplay,
        boolean bufferDeviceAddressMultiDevice,
        boolean vulkanMemoryModel,
        boolean vulkanMemoryModelDeviceScope,
        boolean vulkanMemoryModelAvailabilityVisibilityChains,
        boolean shaderOutputViewportIndex,
        boolean shaderOutputLayer,
        boolean subgroupBroadcastDynamicId
    ) {
        sType(sType);
        pNext(pNext);
        samplerMirrorClampToEdge(samplerMirrorClampToEdge);
        drawIndirectCount(drawIndirectCount);
        storageBuffer8BitAccess(storageBuffer8BitAccess);
        uniformAndStorageBuffer8BitAccess(uniformAndStorageBuffer8BitAccess);
        storagePushConstant8(storagePushConstant8);
        shaderBufferInt64Atomics(shaderBufferInt64Atomics);
        shaderSharedInt64Atomics(shaderSharedInt64Atomics);
        shaderFloat16(shaderFloat16);
        shaderInt8(shaderInt8);
        descriptorIndexing(descriptorIndexing);
        shaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing);
        shaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing);
        shaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing);
        shaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing);
        shaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing);
        shaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing);
        shaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing);
        shaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing);
        shaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing);
        shaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing);
        descriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind);
        descriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind);
        descriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind);
        descriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind);
        descriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind);
        descriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind);
        descriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending);
        descriptorBindingPartiallyBound(descriptorBindingPartiallyBound);
        descriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount);
        runtimeDescriptorArray(runtimeDescriptorArray);
        samplerFilterMinmax(samplerFilterMinmax);
        scalarBlockLayout(scalarBlockLayout);
        imagelessFramebuffer(imagelessFramebuffer);
        uniformBufferStandardLayout(uniformBufferStandardLayout);
        shaderSubgroupExtendedTypes(shaderSubgroupExtendedTypes);
        separateDepthStencilLayouts(separateDepthStencilLayouts);
        hostQueryReset(hostQueryReset);
        timelineSemaphore(timelineSemaphore);
        bufferDeviceAddress(bufferDeviceAddress);
        bufferDeviceAddressCaptureReplay(bufferDeviceAddressCaptureReplay);
        bufferDeviceAddressMultiDevice(bufferDeviceAddressMultiDevice);
        vulkanMemoryModel(vulkanMemoryModel);
        vulkanMemoryModelDeviceScope(vulkanMemoryModelDeviceScope);
        vulkanMemoryModelAvailabilityVisibilityChains(vulkanMemoryModelAvailabilityVisibilityChains);
        shaderOutputViewportIndex(shaderOutputViewportIndex);
        shaderOutputLayer(shaderOutputLayer);
        subgroupBroadcastDynamicId(subgroupBroadcastDynamicId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan12Features set(VkPhysicalDeviceVulkan12Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan12Features malloc() {
        return new VkPhysicalDeviceVulkan12Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan12Features calloc() {
        return new VkPhysicalDeviceVulkan12Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan12Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan12Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan12Features} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan12Features create(long address) {
        return new VkPhysicalDeviceVulkan12Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkan12Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkan12Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan12Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkan12Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan12Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan12Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan12Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan12Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan12Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan12Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan12Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan12Features.PNEXT); }
    /** Unsafe version of {@link #samplerMirrorClampToEdge}. */
    public static int nsamplerMirrorClampToEdge(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE); }
    /** Unsafe version of {@link #drawIndirectCount}. */
    public static int ndrawIndirectCount(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT); }
    /** Unsafe version of {@link #storageBuffer8BitAccess}. */
    public static int nstorageBuffer8BitAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess}. */
    public static int nuniformAndStorageBuffer8BitAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant8}. */
    public static int nstoragePushConstant8(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics}. */
    public static int nshaderBufferInt64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics}. */
    public static int nshaderSharedInt64Atomics(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS); }
    /** Unsafe version of {@link #shaderFloat16}. */
    public static int nshaderFloat16(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERFLOAT16); }
    /** Unsafe version of {@link #shaderInt8}. */
    public static int nshaderInt8(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERINT8); }
    /** Unsafe version of {@link #descriptorIndexing}. */
    public static int ndescriptorIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayDynamicIndexing}. */
    public static int nshaderInputAttachmentArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayDynamicIndexing}. */
    public static int nshaderUniformTexelBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayDynamicIndexing}. */
    public static int nshaderStorageTexelBufferArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexing}. */
    public static int nshaderUniformBufferArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexing}. */
    public static int nshaderSampledImageArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexing}. */
    public static int nshaderStorageBufferArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexing}. */
    public static int nshaderStorageImageArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexing}. */
    public static int nshaderInputAttachmentArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayNonUniformIndexing}. */
    public static int nshaderUniformTexelBufferArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayNonUniformIndexing}. */
    public static int nshaderStorageTexelBufferArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #descriptorBindingUniformBufferUpdateAfterBind}. */
    public static int ndescriptorBindingUniformBufferUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingSampledImageUpdateAfterBind}. */
    public static int ndescriptorBindingSampledImageUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageImageUpdateAfterBind}. */
    public static int ndescriptorBindingStorageImageUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageBufferUpdateAfterBind}. */
    public static int ndescriptorBindingStorageBufferUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingUniformTexelBufferUpdateAfterBind}. */
    public static int ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingStorageTexelBufferUpdateAfterBind}. */
    public static int ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND); }
    /** Unsafe version of {@link #descriptorBindingUpdateUnusedWhilePending}. */
    public static int ndescriptorBindingUpdateUnusedWhilePending(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING); }
    /** Unsafe version of {@link #descriptorBindingPartiallyBound}. */
    public static int ndescriptorBindingPartiallyBound(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND); }
    /** Unsafe version of {@link #descriptorBindingVariableDescriptorCount}. */
    public static int ndescriptorBindingVariableDescriptorCount(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT); }
    /** Unsafe version of {@link #runtimeDescriptorArray}. */
    public static int nruntimeDescriptorArray(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY); }
    /** Unsafe version of {@link #samplerFilterMinmax}. */
    public static int nsamplerFilterMinmax(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX); }
    /** Unsafe version of {@link #scalarBlockLayout}. */
    public static int nscalarBlockLayout(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT); }
    /** Unsafe version of {@link #imagelessFramebuffer}. */
    public static int nimagelessFramebuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER); }
    /** Unsafe version of {@link #uniformBufferStandardLayout}. */
    public static int nuniformBufferStandardLayout(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT); }
    /** Unsafe version of {@link #shaderSubgroupExtendedTypes}. */
    public static int nshaderSubgroupExtendedTypes(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES); }
    /** Unsafe version of {@link #separateDepthStencilLayouts}. */
    public static int nseparateDepthStencilLayouts(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS); }
    /** Unsafe version of {@link #hostQueryReset}. */
    public static int nhostQueryReset(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET); }
    /** Unsafe version of {@link #timelineSemaphore}. */
    public static int ntimelineSemaphore(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE); }
    /** Unsafe version of {@link #bufferDeviceAddress}. */
    public static int nbufferDeviceAddress(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay}. */
    public static int nbufferDeviceAddressCaptureReplay(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice}. */
    public static int nbufferDeviceAddressMultiDevice(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE); }
    /** Unsafe version of {@link #vulkanMemoryModel}. */
    public static int nvulkanMemoryModel(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope}. */
    public static int nvulkanMemoryModelDeviceScope(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE); }
    /** Unsafe version of {@link #vulkanMemoryModelAvailabilityVisibilityChains}. */
    public static int nvulkanMemoryModelAvailabilityVisibilityChains(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS); }
    /** Unsafe version of {@link #shaderOutputViewportIndex}. */
    public static int nshaderOutputViewportIndex(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX); }
    /** Unsafe version of {@link #shaderOutputLayer}. */
    public static int nshaderOutputLayer(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER); }
    /** Unsafe version of {@link #subgroupBroadcastDynamicId}. */
    public static int nsubgroupBroadcastDynamicId(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan12Features.PNEXT, value); }
    /** Unsafe version of {@link #samplerMirrorClampToEdge(boolean) samplerMirrorClampToEdge}. */
    public static void nsamplerMirrorClampToEdge(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE, value); }
    /** Unsafe version of {@link #drawIndirectCount(boolean) drawIndirectCount}. */
    public static void ndrawIndirectCount(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT, value); }
    /** Unsafe version of {@link #storageBuffer8BitAccess(boolean) storageBuffer8BitAccess}. */
    public static void nstorageBuffer8BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer8BitAccess(boolean) uniformAndStorageBuffer8BitAccess}. */
    public static void nuniformAndStorageBuffer8BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant8(boolean) storagePushConstant8}. */
    public static void nstoragePushConstant8(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8, value); }
    /** Unsafe version of {@link #shaderBufferInt64Atomics(boolean) shaderBufferInt64Atomics}. */
    public static void nshaderBufferInt64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderSharedInt64Atomics(boolean) shaderSharedInt64Atomics}. */
    public static void nshaderSharedInt64Atomics(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS, value); }
    /** Unsafe version of {@link #shaderFloat16(boolean) shaderFloat16}. */
    public static void nshaderFloat16(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERFLOAT16, value); }
    /** Unsafe version of {@link #shaderInt8(boolean) shaderInt8}. */
    public static void nshaderInt8(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERINT8, value); }
    /** Unsafe version of {@link #descriptorIndexing(boolean) descriptorIndexing}. */
    public static void ndescriptorIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING, value); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayDynamicIndexing(boolean) shaderInputAttachmentArrayDynamicIndexing}. */
    public static void nshaderInputAttachmentArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayDynamicIndexing(boolean) shaderUniformTexelBufferArrayDynamicIndexing}. */
    public static void nshaderUniformTexelBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayDynamicIndexing(boolean) shaderStorageTexelBufferArrayDynamicIndexing}. */
    public static void nshaderStorageTexelBufferArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformBufferArrayNonUniformIndexing(boolean) shaderUniformBufferArrayNonUniformIndexing}. */
    public static void nshaderUniformBufferArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderSampledImageArrayNonUniformIndexing(boolean) shaderSampledImageArrayNonUniformIndexing}. */
    public static void nshaderSampledImageArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageBufferArrayNonUniformIndexing(boolean) shaderStorageBufferArrayNonUniformIndexing}. */
    public static void nshaderStorageBufferArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageImageArrayNonUniformIndexing(boolean) shaderStorageImageArrayNonUniformIndexing}. */
    public static void nshaderStorageImageArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderInputAttachmentArrayNonUniformIndexing(boolean) shaderInputAttachmentArrayNonUniformIndexing}. */
    public static void nshaderInputAttachmentArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderUniformTexelBufferArrayNonUniformIndexing(boolean) shaderUniformTexelBufferArrayNonUniformIndexing}. */
    public static void nshaderUniformTexelBufferArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTexelBufferArrayNonUniformIndexing(boolean) shaderStorageTexelBufferArrayNonUniformIndexing}. */
    public static void nshaderStorageTexelBufferArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #descriptorBindingUniformBufferUpdateAfterBind(boolean) descriptorBindingUniformBufferUpdateAfterBind}. */
    public static void ndescriptorBindingUniformBufferUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingSampledImageUpdateAfterBind(boolean) descriptorBindingSampledImageUpdateAfterBind}. */
    public static void ndescriptorBindingSampledImageUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageImageUpdateAfterBind(boolean) descriptorBindingStorageImageUpdateAfterBind}. */
    public static void ndescriptorBindingStorageImageUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageBufferUpdateAfterBind(boolean) descriptorBindingStorageBufferUpdateAfterBind}. */
    public static void ndescriptorBindingStorageBufferUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingUniformTexelBufferUpdateAfterBind(boolean) descriptorBindingUniformTexelBufferUpdateAfterBind}. */
    public static void ndescriptorBindingUniformTexelBufferUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingStorageTexelBufferUpdateAfterBind(boolean) descriptorBindingStorageTexelBufferUpdateAfterBind}. */
    public static void ndescriptorBindingStorageTexelBufferUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #descriptorBindingUpdateUnusedWhilePending(boolean) descriptorBindingUpdateUnusedWhilePending}. */
    public static void ndescriptorBindingUpdateUnusedWhilePending(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING, value); }
    /** Unsafe version of {@link #descriptorBindingPartiallyBound(boolean) descriptorBindingPartiallyBound}. */
    public static void ndescriptorBindingPartiallyBound(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND, value); }
    /** Unsafe version of {@link #descriptorBindingVariableDescriptorCount(boolean) descriptorBindingVariableDescriptorCount}. */
    public static void ndescriptorBindingVariableDescriptorCount(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT, value); }
    /** Unsafe version of {@link #runtimeDescriptorArray(boolean) runtimeDescriptorArray}. */
    public static void nruntimeDescriptorArray(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY, value); }
    /** Unsafe version of {@link #samplerFilterMinmax(boolean) samplerFilterMinmax}. */
    public static void nsamplerFilterMinmax(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX, value); }
    /** Unsafe version of {@link #scalarBlockLayout(boolean) scalarBlockLayout}. */
    public static void nscalarBlockLayout(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT, value); }
    /** Unsafe version of {@link #imagelessFramebuffer(boolean) imagelessFramebuffer}. */
    public static void nimagelessFramebuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER, value); }
    /** Unsafe version of {@link #uniformBufferStandardLayout(boolean) uniformBufferStandardLayout}. */
    public static void nuniformBufferStandardLayout(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT, value); }
    /** Unsafe version of {@link #shaderSubgroupExtendedTypes(boolean) shaderSubgroupExtendedTypes}. */
    public static void nshaderSubgroupExtendedTypes(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES, value); }
    /** Unsafe version of {@link #separateDepthStencilLayouts(boolean) separateDepthStencilLayouts}. */
    public static void nseparateDepthStencilLayouts(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS, value); }
    /** Unsafe version of {@link #hostQueryReset(boolean) hostQueryReset}. */
    public static void nhostQueryReset(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET, value); }
    /** Unsafe version of {@link #timelineSemaphore(boolean) timelineSemaphore}. */
    public static void ntimelineSemaphore(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE, value); }
    /** Unsafe version of {@link #bufferDeviceAddress(boolean) bufferDeviceAddress}. */
    public static void nbufferDeviceAddress(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS, value); }
    /** Unsafe version of {@link #bufferDeviceAddressCaptureReplay(boolean) bufferDeviceAddressCaptureReplay}. */
    public static void nbufferDeviceAddressCaptureReplay(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY, value); }
    /** Unsafe version of {@link #bufferDeviceAddressMultiDevice(boolean) bufferDeviceAddressMultiDevice}. */
    public static void nbufferDeviceAddressMultiDevice(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE, value); }
    /** Unsafe version of {@link #vulkanMemoryModel(boolean) vulkanMemoryModel}. */
    public static void nvulkanMemoryModel(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL, value); }
    /** Unsafe version of {@link #vulkanMemoryModelDeviceScope(boolean) vulkanMemoryModelDeviceScope}. */
    public static void nvulkanMemoryModelDeviceScope(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE, value); }
    /** Unsafe version of {@link #vulkanMemoryModelAvailabilityVisibilityChains(boolean) vulkanMemoryModelAvailabilityVisibilityChains}. */
    public static void nvulkanMemoryModelAvailabilityVisibilityChains(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS, value); }
    /** Unsafe version of {@link #shaderOutputViewportIndex(boolean) shaderOutputViewportIndex}. */
    public static void nshaderOutputViewportIndex(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX, value); }
    /** Unsafe version of {@link #shaderOutputLayer(boolean) shaderOutputLayer}. */
    public static void nshaderOutputLayer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER, value); }
    /** Unsafe version of {@link #subgroupBroadcastDynamicId(boolean) subgroupBroadcastDynamicId}. */
    public static void nsubgroupBroadcastDynamicId(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan12Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan12Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan12Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan12Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan12Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan12Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkan12Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan12Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan12Features.npNext(address()); }
        /** @return the value of the {@code samplerMirrorClampToEdge} field. */
        @NativeType("VkBool32")
        public boolean samplerMirrorClampToEdge() { return VkPhysicalDeviceVulkan12Features.nsamplerMirrorClampToEdge(address()) != 0; }
        /** @return the value of the {@code drawIndirectCount} field. */
        @NativeType("VkBool32")
        public boolean drawIndirectCount() { return VkPhysicalDeviceVulkan12Features.ndrawIndirectCount(address()) != 0; }
        /** @return the value of the {@code storageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer8BitAccess() { return VkPhysicalDeviceVulkan12Features.nstorageBuffer8BitAccess(address()) != 0; }
        /** @return the value of the {@code uniformAndStorageBuffer8BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer8BitAccess() { return VkPhysicalDeviceVulkan12Features.nuniformAndStorageBuffer8BitAccess(address()) != 0; }
        /** @return the value of the {@code storagePushConstant8} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant8() { return VkPhysicalDeviceVulkan12Features.nstoragePushConstant8(address()) != 0; }
        /** @return the value of the {@code shaderBufferInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderBufferInt64Atomics() { return VkPhysicalDeviceVulkan12Features.nshaderBufferInt64Atomics(address()) != 0; }
        /** @return the value of the {@code shaderSharedInt64Atomics} field. */
        @NativeType("VkBool32")
        public boolean shaderSharedInt64Atomics() { return VkPhysicalDeviceVulkan12Features.nshaderSharedInt64Atomics(address()) != 0; }
        /** @return the value of the {@code shaderFloat16} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat16() { return VkPhysicalDeviceVulkan12Features.nshaderFloat16(address()) != 0; }
        /** @return the value of the {@code shaderInt8} field. */
        @NativeType("VkBool32")
        public boolean shaderInt8() { return VkPhysicalDeviceVulkan12Features.nshaderInt8(address()) != 0; }
        /** @return the value of the {@code descriptorIndexing} field. */
        @NativeType("VkBool32")
        public boolean descriptorIndexing() { return VkPhysicalDeviceVulkan12Features.ndescriptorIndexing(address()) != 0; }
        /** @return the value of the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayDynamicIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderUniformBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@code shaderSampledImageArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderSampledImageArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderStorageBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@code shaderStorageImageArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderStorageImageArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayNonUniformIndexing() { return VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUniformBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingSampledImageUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingSampledImageUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageImageUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageImageUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code descriptorBindingUpdateUnusedWhilePending} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingUpdateUnusedWhilePending() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingUpdateUnusedWhilePending(address()) != 0; }
        /** @return the value of the {@code descriptorBindingPartiallyBound} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingPartiallyBound() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingPartiallyBound(address()) != 0; }
        /** @return the value of the {@code descriptorBindingVariableDescriptorCount} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingVariableDescriptorCount() { return VkPhysicalDeviceVulkan12Features.ndescriptorBindingVariableDescriptorCount(address()) != 0; }
        /** @return the value of the {@code runtimeDescriptorArray} field. */
        @NativeType("VkBool32")
        public boolean runtimeDescriptorArray() { return VkPhysicalDeviceVulkan12Features.nruntimeDescriptorArray(address()) != 0; }
        /** @return the value of the {@code samplerFilterMinmax} field. */
        @NativeType("VkBool32")
        public boolean samplerFilterMinmax() { return VkPhysicalDeviceVulkan12Features.nsamplerFilterMinmax(address()) != 0; }
        /** @return the value of the {@code scalarBlockLayout} field. */
        @NativeType("VkBool32")
        public boolean scalarBlockLayout() { return VkPhysicalDeviceVulkan12Features.nscalarBlockLayout(address()) != 0; }
        /** @return the value of the {@code imagelessFramebuffer} field. */
        @NativeType("VkBool32")
        public boolean imagelessFramebuffer() { return VkPhysicalDeviceVulkan12Features.nimagelessFramebuffer(address()) != 0; }
        /** @return the value of the {@code uniformBufferStandardLayout} field. */
        @NativeType("VkBool32")
        public boolean uniformBufferStandardLayout() { return VkPhysicalDeviceVulkan12Features.nuniformBufferStandardLayout(address()) != 0; }
        /** @return the value of the {@code shaderSubgroupExtendedTypes} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupExtendedTypes() { return VkPhysicalDeviceVulkan12Features.nshaderSubgroupExtendedTypes(address()) != 0; }
        /** @return the value of the {@code separateDepthStencilLayouts} field. */
        @NativeType("VkBool32")
        public boolean separateDepthStencilLayouts() { return VkPhysicalDeviceVulkan12Features.nseparateDepthStencilLayouts(address()) != 0; }
        /** @return the value of the {@code hostQueryReset} field. */
        @NativeType("VkBool32")
        public boolean hostQueryReset() { return VkPhysicalDeviceVulkan12Features.nhostQueryReset(address()) != 0; }
        /** @return the value of the {@code timelineSemaphore} field. */
        @NativeType("VkBool32")
        public boolean timelineSemaphore() { return VkPhysicalDeviceVulkan12Features.ntimelineSemaphore(address()) != 0; }
        /** @return the value of the {@code bufferDeviceAddress} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddress() { return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddress(address()) != 0; }
        /** @return the value of the {@code bufferDeviceAddressCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() { return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressCaptureReplay(address()) != 0; }
        /** @return the value of the {@code bufferDeviceAddressMultiDevice} field. */
        @NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() { return VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressMultiDevice(address()) != 0; }
        /** @return the value of the {@code vulkanMemoryModel} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModel() { return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModel(address()) != 0; }
        /** @return the value of the {@code vulkanMemoryModelDeviceScope} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelDeviceScope() { return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelDeviceScope(address()) != 0; }
        /** @return the value of the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
        @NativeType("VkBool32")
        public boolean vulkanMemoryModelAvailabilityVisibilityChains() { return VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelAvailabilityVisibilityChains(address()) != 0; }
        /** @return the value of the {@code shaderOutputViewportIndex} field. */
        @NativeType("VkBool32")
        public boolean shaderOutputViewportIndex() { return VkPhysicalDeviceVulkan12Features.nshaderOutputViewportIndex(address()) != 0; }
        /** @return the value of the {@code shaderOutputLayer} field. */
        @NativeType("VkBool32")
        public boolean shaderOutputLayer() { return VkPhysicalDeviceVulkan12Features.nshaderOutputLayer(address()) != 0; }
        /** @return the value of the {@code subgroupBroadcastDynamicId} field. */
        @NativeType("VkBool32")
        public boolean subgroupBroadcastDynamicId() { return VkPhysicalDeviceVulkan12Features.nsubgroupBroadcastDynamicId(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan12Features.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan12Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code samplerMirrorClampToEdge} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer samplerMirrorClampToEdge(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nsamplerMirrorClampToEdge(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code drawIndirectCount} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer drawIndirectCount(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndrawIndirectCount(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storageBuffer8BitAccess} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nstorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code uniformAndStorageBuffer8BitAccess} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storagePushConstant8} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer storagePushConstant8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nstoragePushConstant8(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderBufferInt64Atomics} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderBufferInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderBufferInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSharedInt64Atomics} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderSharedInt64Atomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderSharedInt64Atomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderFloat16} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderFloat16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderFloat16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInt8} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderInt8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderInt8(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInputAttachmentArrayDynamicIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderInputAttachmentArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformTexelBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageTexelBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderUniformBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderUniformBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSampledImageArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderSampledImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderSampledImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderStorageBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderStorageBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageImageArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderStorageImageArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderStorageImageArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderInputAttachmentArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderInputAttachmentArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderUniformTexelBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageTexelBufferArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUniformBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUniformBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingSampledImageUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingSampledImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingSampledImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageImageUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageImageUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageImageUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUniformTexelBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageTexelBufferUpdateAfterBind} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageTexelBufferUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingUpdateUnusedWhilePending} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUpdateUnusedWhilePending(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingUpdateUnusedWhilePending(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingPartiallyBound} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingPartiallyBound(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingPartiallyBound(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingVariableDescriptorCount} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingVariableDescriptorCount(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ndescriptorBindingVariableDescriptorCount(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code runtimeDescriptorArray} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer runtimeDescriptorArray(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nruntimeDescriptorArray(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code samplerFilterMinmax} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer samplerFilterMinmax(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nsamplerFilterMinmax(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code scalarBlockLayout} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer scalarBlockLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nscalarBlockLayout(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code imagelessFramebuffer} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer imagelessFramebuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nimagelessFramebuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code uniformBufferStandardLayout} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nuniformBufferStandardLayout(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderSubgroupExtendedTypes} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code separateDepthStencilLayouts} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer separateDepthStencilLayouts(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nseparateDepthStencilLayouts(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code hostQueryReset} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer hostQueryReset(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nhostQueryReset(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code timelineSemaphore} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer timelineSemaphore(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.ntimelineSemaphore(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddress} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddress(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nbufferDeviceAddress(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressCaptureReplay} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddressCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bufferDeviceAddressMultiDevice} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddressMultiDevice(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressMultiDevice(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModel} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModel(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nvulkanMemoryModel(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModelDeviceScope} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModelDeviceScope(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelDeviceScope(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code vulkanMemoryModelAvailabilityVisibilityChains} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModelAvailabilityVisibilityChains(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelAvailabilityVisibilityChains(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderOutputViewportIndex} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderOutputViewportIndex(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderOutputViewportIndex(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderOutputLayer} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer shaderOutputLayer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nshaderOutputLayer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code subgroupBroadcastDynamicId} field. */
        public VkPhysicalDeviceVulkan12Features.Buffer subgroupBroadcastDynamicId(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVulkan12Features.nsubgroupBroadcastDynamicId(address(), value ? 1 : 0); return this; }

    }

}