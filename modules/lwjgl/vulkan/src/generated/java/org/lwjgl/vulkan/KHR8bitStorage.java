/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * The {@code VK_KHR_8bit_storage} extension allows use of 8-bit types in uniform and storage buffers, and push constant blocks. This extension introduces several new optional features which map to SPIR-V capabilities and allow access to 8-bit data in {@code Block}-decorated objects in the {@code Uniform} and the {@code StorageBuffer} storage classes, and objects in the {@code PushConstant} storage class.
 * 
 * <p>The {@code StorageBuffer8BitAccess} capability <b>must</b> be supported by all implementations of this extension. The other capabilities are optional.</p>
 * 
 * <h5>Promotion to Vulkan 1.2</h5>
 * 
 * <p>Vulkan APIs in this extension are included in core Vulkan 1.2, with the KHR suffix omitted. However, if Vulkan 1.2 is supported and this extension is not, the {@code StorageBuffer8BitAccess} capability is optional. External interactions defined by this extension, such as SPIR-V token names, retain their original names. The original Vulkan API names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_8bit_storage}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>178</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRStorageBufferStorageClass VK_KHR_storage_buffer_storage_class} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_8bit_storage.html">SPV_KHR_8bit_storage</a></li>
 * </ul></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Alexander Galazin <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_8bit_storage]%20@alegal-arm%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_8bit_storage%20extension*">alegal-arm</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-02-05</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/ext/GL_EXT_shader_16bit_storage.txt">{@code GL_EXT_shader_16bit_storage}</a></li>
 * </ul></dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Alexander Galazin, Arm</li>
 * </ul></dd>
 * </dl>
 */
public final class KHR8bitStorage {

    /** The extension specification version. */
    public static final int VK_KHR_8BIT_STORAGE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_8BIT_STORAGE_EXTENSION_NAME = "VK_KHR_8bit_storage";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES_KHR = 1000177000;

    private KHR8bitStorage() {}

}