/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for using half float variables in shaders.
 * 
 * <h5>Deprecation by {@code VK_KHR_shader_float16_int8}</h5>
 * 
 * <p>Functionality in this extension is included in the {@link KHRShaderFloat16Int8 VK_KHR_shader_float16_int8} extension, when the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderFloat16">{@code shaderFloat16}</a> feature is enabled.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_gpu_shader_half_float}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>37</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/AMD/SPV_AMD_gpu_shader_half_float.html">SPV_AMD_gpu_shader_half_float</a></li>
 * </ul></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Deprecated</em> by {@link KHRShaderFloat16Int8 VK_KHR_shader_float16_int8} extension
 * 
 * <ul>
 * <li>Which in turn was <em>promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul>
 * </li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Dominik Witczak <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_gpu_shader_half_float]%20@dominikwitczakamd%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_gpu_shader_half_float%20extension*">dominikwitczakamd</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-04-11</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension provides API support for <a href="https://registry.khronos.org/OpenGL/extensions/AMD/AMD_gpu_shader_half_float.txt">{@code GL_AMD_gpu_shader_half_float}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos, AMD</li>
 * <li>Dominik Witczak, AMD</li>
 * <li>Donglin Wei, AMD</li>
 * <li>Graham Sellers, AMD</li>
 * <li>Qun Lin, AMD</li>
 * <li>Rex Xu, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDGPUShaderHalfFloat {

    /** The extension specification version. */
    public static final int VK_AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME = "VK_AMD_gpu_shader_half_float";

    private AMDGPUShaderHalfFloat() {}

}