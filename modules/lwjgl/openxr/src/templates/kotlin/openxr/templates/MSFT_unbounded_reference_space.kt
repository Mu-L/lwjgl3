/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val MSFT_unbounded_reference_space = "MSFTUnboundedReferenceSpace".nativeClassXR("MSFT_unbounded_reference_space", type = "instance", postfix = "MSFT") {
    IntConstant(
        "MSFT_unbounded_reference_space_SPEC_VERSION".."1"
    )

    StringConstant(
        "MSFT_UNBOUNDED_REFERENCE_SPACE_EXTENSION_NAME".."XR_MSFT_unbounded_reference_space"
    )

    EnumConstant(
        "REFERENCE_SPACE_TYPE_UNBOUNDED_MSFT".."1000038000"
    )
}