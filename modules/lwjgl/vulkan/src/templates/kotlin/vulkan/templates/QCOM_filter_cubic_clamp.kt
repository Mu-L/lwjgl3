/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_filter_cubic_clamp = "QCOMFilterCubicClamp".nativeClassVK("QCOM_filter_cubic_clamp", type = "device", postfix = "QCOM") {
    documentation =
        """
        This extension extends cubic filtering by adding the ability to enable an anti-ringing clamp. Cubic filtering samples from a 4x4 region of texels and computes a cubic weighted average of the region. In some cases, the resulting value is outside the range of any of the texels in the 4x4 region. This is sometimes referred to as “{@code filter overshoot}” or “{@code filter ringing}” and can occur when there is a sharp discontinuity in the 4x4 region being filtered. For some use cases this “{@code ringing}” can produces unacceptable artifacts.

        The solution to the ringing problem is to clamp the post-cubic-filtered value to be within the max and min of texel values in the 4x4 region. While such “{@code range clamping}” can be performed in shader code, the additional texture fetches and clamping ALU operations can be costly.

        Certain Adreno GPUs are able to perform the range clamp in the texture unit during cubic filtering at significant performance/power savings versus a shader-based clamping approach. This extension exposes such hardware functionality.

        This extension extends {@code VkSamplerReductionMode}, adding #SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM which enables the range clamp operation.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_QCOM_filter_cubic_clamp}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>522</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link EXTFilterCubic VK_EXT_filter_cubic} and <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.2">Version 1.2</a> or {@link EXTSamplerFilterMinmax VK_EXT_sampler_filter_minmax}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthew Netsch <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_filter_cubic_clamp]%20@mnetsch%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_filter_cubic_clamp%20extension*">mnetsch</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-08-02</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "QCOM_FILTER_CUBIC_CLAMP_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "QCOM_FILTER_CUBIC_CLAMP_EXTENSION_NAME".."VK_QCOM_filter_cubic_clamp"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM".."1000521000"
    )

    EnumConstant(
        "Extends {@code VkSamplerReductionMode}.",

        "SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM".."1000521000"
    )
}