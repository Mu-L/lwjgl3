/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.vulkan;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.system.*;
import org.lwjgl.vulkan.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWVulkan.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.EXTDebugUtils.*;
import static org.lwjgl.vulkan.KHRSurface.*;
import static org.lwjgl.vulkan.KHRSwapchain.*;
import static org.lwjgl.vulkan.VK10.*;

/*
 * Copyright (c) 2015-2016 The Khronos Group Inc.
 * Copyright (c) 2015-2016 Valve Corporation
 * Copyright (c) 2015-2016 LunarG, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author: Chia-I Wu <olvaffe@gmail.com>
 * Author: Cody Northrop <cody@lunarg.com>
 * Author: Courtney Goeltzenleuchter <courtney@LunarG.com>
 * Author: Ian Elliott <ian@LunarG.com>
 * Author: Jon Ashburn <jon@lunarg.com>
 * Author: Piers Daniell <pdaniell@nvidia.com>
 * Author: Gwan-gyeong Mun <elongbug@gmail.com>
 * Porter: Camilla Berglund <elmindreda@glfw.org>
 */

/** Simple Vulkan demo. Ported from the GLFW <a href="https://github.com/glfw/glfw/blob/master/tests/vulkan.c">vulkan</a> test. */
public final class HelloVulkan {

    private static final boolean VALIDATE = true;

    private static final boolean USE_STAGING_BUFFER = false;

    private static final int DEMO_TEXTURE_COUNT    = 1;
    private static final int VERTEX_BUFFER_BIND_ID = 0;

    private static final ByteBuffer KHR_swapchain   = memASCII(VK_KHR_SWAPCHAIN_EXTENSION_NAME);
    private static final ByteBuffer EXT_debug_utils = memASCII(VK_EXT_DEBUG_UTILS_EXTENSION_NAME);

    private static final byte[] fragShaderCode = {
        0x03, 0x02, 0x23, 0x07, 0x00, 0x00, 0x01, 0x00, 0x08, 0x00, 0x0d, 0x00,
        0x14, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x11, 0x00, 0x02, 0x00,
        0x01, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x06, 0x00, 0x01, 0x00, 0x00, 0x00,
        0x47, 0x4c, 0x53, 0x4c, 0x2e, 0x73, 0x74, 0x64, 0x2e, 0x34, 0x35, 0x30,
        0x00, 0x00, 0x00, 0x00, 0x0e, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x01, 0x00, 0x00, 0x00, 0x0f, 0x00, 0x07, 0x00, 0x04, 0x00, 0x00, 0x00,
        0x04, 0x00, 0x00, 0x00, 0x6d, 0x61, 0x69, 0x6e, 0x00, 0x00, 0x00, 0x00,
        0x09, 0x00, 0x00, 0x00, 0x11, 0x00, 0x00, 0x00, 0x10, 0x00, 0x03, 0x00,
        0x04, 0x00, 0x00, 0x00, 0x07, 0x00, 0x00, 0x00, 0x03, 0x00, 0x03, 0x00,
        0x02, 0x00, 0x00, 0x00, (byte)0xcc, 0x01, 0x00, 0x00, 0x04, 0x00, 0x0a, 0x00,
        0x47, 0x4c, 0x5f, 0x47, 0x4f, 0x4f, 0x47, 0x4c, 0x45, 0x5f, 0x63, 0x70,
        0x70, 0x5f, 0x73, 0x74, 0x79, 0x6c, 0x65, 0x5f, 0x6c, 0x69, 0x6e, 0x65,
        0x5f, 0x64, 0x69, 0x72, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x00, 0x00,
        0x04, 0x00, 0x08, 0x00, 0x47, 0x4c, 0x5f, 0x47, 0x4f, 0x4f, 0x47, 0x4c,
        0x45, 0x5f, 0x69, 0x6e, 0x63, 0x6c, 0x75, 0x64, 0x65, 0x5f, 0x64, 0x69,
        0x72, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x00, 0x05, 0x00, 0x04, 0x00,
        0x04, 0x00, 0x00, 0x00, 0x6d, 0x61, 0x69, 0x6e, 0x00, 0x00, 0x00, 0x00,
        0x05, 0x00, 0x05, 0x00, 0x09, 0x00, 0x00, 0x00, 0x75, 0x46, 0x72, 0x61,
        0x67, 0x43, 0x6f, 0x6c, 0x6f, 0x72, 0x00, 0x00, 0x05, 0x00, 0x03, 0x00,
        0x0d, 0x00, 0x00, 0x00, 0x74, 0x65, 0x78, 0x00, 0x05, 0x00, 0x05, 0x00,
        0x11, 0x00, 0x00, 0x00, 0x74, 0x65, 0x78, 0x63, 0x6f, 0x6f, 0x72, 0x64,
        0x00, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00, 0x09, 0x00, 0x00, 0x00,
        0x1e, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00,
        0x0d, 0x00, 0x00, 0x00, 0x22, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x47, 0x00, 0x04, 0x00, 0x0d, 0x00, 0x00, 0x00, 0x21, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x47, 0x00, 0x04, 0x00, 0x11, 0x00, 0x00, 0x00,
        0x1e, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x13, 0x00, 0x02, 0x00,
        0x02, 0x00, 0x00, 0x00, 0x21, 0x00, 0x03, 0x00, 0x03, 0x00, 0x00, 0x00,
        0x02, 0x00, 0x00, 0x00, 0x16, 0x00, 0x03, 0x00, 0x06, 0x00, 0x00, 0x00,
        0x20, 0x00, 0x00, 0x00, 0x17, 0x00, 0x04, 0x00, 0x07, 0x00, 0x00, 0x00,
        0x06, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00,
        0x08, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x07, 0x00, 0x00, 0x00,
        0x3b, 0x00, 0x04, 0x00, 0x08, 0x00, 0x00, 0x00, 0x09, 0x00, 0x00, 0x00,
        0x03, 0x00, 0x00, 0x00, 0x19, 0x00, 0x09, 0x00, 0x0a, 0x00, 0x00, 0x00,
        0x06, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x1b, 0x00, 0x03, 0x00, 0x0b, 0x00, 0x00, 0x00,
        0x0a, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00, 0x0c, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00,
        0x0c, 0x00, 0x00, 0x00, 0x0d, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x17, 0x00, 0x04, 0x00, 0x0f, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00,
        0x02, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00, 0x10, 0x00, 0x00, 0x00,
        0x01, 0x00, 0x00, 0x00, 0x0f, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00,
        0x10, 0x00, 0x00, 0x00, 0x11, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        0x36, 0x00, 0x05, 0x00, 0x02, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, (byte)0xf8, 0x00, 0x02, 0x00,
        0x05, 0x00, 0x00, 0x00, 0x3d, 0x00, 0x04, 0x00, 0x0b, 0x00, 0x00, 0x00,
        0x0e, 0x00, 0x00, 0x00, 0x0d, 0x00, 0x00, 0x00, 0x3d, 0x00, 0x04, 0x00,
        0x0f, 0x00, 0x00, 0x00, 0x12, 0x00, 0x00, 0x00, 0x11, 0x00, 0x00, 0x00,
        0x57, 0x00, 0x05, 0x00, 0x07, 0x00, 0x00, 0x00, 0x13, 0x00, 0x00, 0x00,
        0x0e, 0x00, 0x00, 0x00, 0x12, 0x00, 0x00, 0x00, 0x3e, 0x00, 0x03, 0x00,
        0x09, 0x00, 0x00, 0x00, 0x13, 0x00, 0x00, 0x00, (byte)0xfd, 0x00, 0x01, 0x00,
        0x38, 0x00, 0x01, 0x00,
    };

    private static final byte[] vertShaderCode = {
        0x03, 0x02, 0x23, 0x07, 0x00, 0x00, 0x01, 0x00, 0x08, 0x00, 0x0d, 0x00,
        0x1b, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x11, 0x00, 0x02, 0x00,
        0x01, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x06, 0x00, 0x01, 0x00, 0x00, 0x00,
        0x47, 0x4c, 0x53, 0x4c, 0x2e, 0x73, 0x74, 0x64, 0x2e, 0x34, 0x35, 0x30,
        0x00, 0x00, 0x00, 0x00, 0x0e, 0x00, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x01, 0x00, 0x00, 0x00, 0x0f, 0x00, 0x09, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x04, 0x00, 0x00, 0x00, 0x6d, 0x61, 0x69, 0x6e, 0x00, 0x00, 0x00, 0x00,
        0x09, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x13, 0x00, 0x00, 0x00,
        0x17, 0x00, 0x00, 0x00, 0x03, 0x00, 0x03, 0x00, 0x02, 0x00, 0x00, 0x00,
        (byte)0xcc, 0x01, 0x00, 0x00, 0x04, 0x00, 0x0a, 0x00, 0x47, 0x4c, 0x5f, 0x47,
        0x4f, 0x4f, 0x47, 0x4c, 0x45, 0x5f, 0x63, 0x70, 0x70, 0x5f, 0x73, 0x74,
        0x79, 0x6c, 0x65, 0x5f, 0x6c, 0x69, 0x6e, 0x65, 0x5f, 0x64, 0x69, 0x72,
        0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x00, 0x00, 0x04, 0x00, 0x08, 0x00,
        0x47, 0x4c, 0x5f, 0x47, 0x4f, 0x4f, 0x47, 0x4c, 0x45, 0x5f, 0x69, 0x6e,
        0x63, 0x6c, 0x75, 0x64, 0x65, 0x5f, 0x64, 0x69, 0x72, 0x65, 0x63, 0x74,
        0x69, 0x76, 0x65, 0x00, 0x05, 0x00, 0x04, 0x00, 0x04, 0x00, 0x00, 0x00,
        0x6d, 0x61, 0x69, 0x6e, 0x00, 0x00, 0x00, 0x00, 0x05, 0x00, 0x05, 0x00,
        0x09, 0x00, 0x00, 0x00, 0x74, 0x65, 0x78, 0x63, 0x6f, 0x6f, 0x72, 0x64,
        0x00, 0x00, 0x00, 0x00, 0x05, 0x00, 0x04, 0x00, 0x0b, 0x00, 0x00, 0x00,
        0x61, 0x74, 0x74, 0x72, 0x00, 0x00, 0x00, 0x00, 0x05, 0x00, 0x06, 0x00,
        0x11, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x50, 0x65, 0x72, 0x56, 0x65,
        0x72, 0x74, 0x65, 0x78, 0x00, 0x00, 0x00, 0x00, 0x06, 0x00, 0x06, 0x00,
        0x11, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x50,
        0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x00, 0x06, 0x00, 0x07, 0x00,
        0x11, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x50,
        0x6f, 0x69, 0x6e, 0x74, 0x53, 0x69, 0x7a, 0x65, 0x00, 0x00, 0x00, 0x00,
        0x06, 0x00, 0x07, 0x00, 0x11, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00,
        0x67, 0x6c, 0x5f, 0x43, 0x6c, 0x69, 0x70, 0x44, 0x69, 0x73, 0x74, 0x61,
        0x6e, 0x63, 0x65, 0x00, 0x06, 0x00, 0x07, 0x00, 0x11, 0x00, 0x00, 0x00,
        0x03, 0x00, 0x00, 0x00, 0x67, 0x6c, 0x5f, 0x43, 0x75, 0x6c, 0x6c, 0x44,
        0x69, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x00, 0x05, 0x00, 0x03, 0x00,
        0x13, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x05, 0x00, 0x03, 0x00,
        0x17, 0x00, 0x00, 0x00, 0x70, 0x6f, 0x73, 0x00, 0x47, 0x00, 0x04, 0x00,
        0x09, 0x00, 0x00, 0x00, 0x1e, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x47, 0x00, 0x04, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x1e, 0x00, 0x00, 0x00,
        0x01, 0x00, 0x00, 0x00, 0x48, 0x00, 0x05, 0x00, 0x11, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x48, 0x00, 0x05, 0x00, 0x11, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        0x0b, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x48, 0x00, 0x05, 0x00,
        0x11, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00,
        0x03, 0x00, 0x00, 0x00, 0x48, 0x00, 0x05, 0x00, 0x11, 0x00, 0x00, 0x00,
        0x03, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00,
        0x47, 0x00, 0x03, 0x00, 0x11, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00,
        0x47, 0x00, 0x04, 0x00, 0x17, 0x00, 0x00, 0x00, 0x1e, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x13, 0x00, 0x02, 0x00, 0x02, 0x00, 0x00, 0x00,
        0x21, 0x00, 0x03, 0x00, 0x03, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00,
        0x16, 0x00, 0x03, 0x00, 0x06, 0x00, 0x00, 0x00, 0x20, 0x00, 0x00, 0x00,
        0x17, 0x00, 0x04, 0x00, 0x07, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00,
        0x02, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00, 0x08, 0x00, 0x00, 0x00,
        0x03, 0x00, 0x00, 0x00, 0x07, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00,
        0x08, 0x00, 0x00, 0x00, 0x09, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00,
        0x20, 0x00, 0x04, 0x00, 0x0a, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        0x07, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00, 0x0a, 0x00, 0x00, 0x00,
        0x0b, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x17, 0x00, 0x04, 0x00,
        0x0d, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x00,
        0x15, 0x00, 0x04, 0x00, 0x0e, 0x00, 0x00, 0x00, 0x20, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x2b, 0x00, 0x04, 0x00, 0x0e, 0x00, 0x00, 0x00,
        0x0f, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x1c, 0x00, 0x04, 0x00,
        0x10, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x0f, 0x00, 0x00, 0x00,
        0x1e, 0x00, 0x06, 0x00, 0x11, 0x00, 0x00, 0x00, 0x0d, 0x00, 0x00, 0x00,
        0x06, 0x00, 0x00, 0x00, 0x10, 0x00, 0x00, 0x00, 0x10, 0x00, 0x00, 0x00,
        0x20, 0x00, 0x04, 0x00, 0x12, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00,
        0x11, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00, 0x12, 0x00, 0x00, 0x00,
        0x13, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00, 0x15, 0x00, 0x04, 0x00,
        0x14, 0x00, 0x00, 0x00, 0x20, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        0x2b, 0x00, 0x04, 0x00, 0x14, 0x00, 0x00, 0x00, 0x15, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x20, 0x00, 0x04, 0x00, 0x16, 0x00, 0x00, 0x00,
        0x01, 0x00, 0x00, 0x00, 0x0d, 0x00, 0x00, 0x00, 0x3b, 0x00, 0x04, 0x00,
        0x16, 0x00, 0x00, 0x00, 0x17, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        0x20, 0x00, 0x04, 0x00, 0x19, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00,
        0x0d, 0x00, 0x00, 0x00, 0x36, 0x00, 0x05, 0x00, 0x02, 0x00, 0x00, 0x00,
        0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x03, 0x00, 0x00, 0x00,
        (byte)0xf8, 0x00, 0x02, 0x00, 0x05, 0x00, 0x00, 0x00, 0x3d, 0x00, 0x04, 0x00,
        0x07, 0x00, 0x00, 0x00, 0x0c, 0x00, 0x00, 0x00, 0x0b, 0x00, 0x00, 0x00,
        0x3e, 0x00, 0x03, 0x00, 0x09, 0x00, 0x00, 0x00, 0x0c, 0x00, 0x00, 0x00,
        0x3d, 0x00, 0x04, 0x00, 0x0d, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00,
        0x17, 0x00, 0x00, 0x00, 0x41, 0x00, 0x05, 0x00, 0x19, 0x00, 0x00, 0x00,
        0x1a, 0x00, 0x00, 0x00, 0x13, 0x00, 0x00, 0x00, 0x15, 0x00, 0x00, 0x00,
        0x3e, 0x00, 0x03, 0x00, 0x1a, 0x00, 0x00, 0x00, 0x18, 0x00, 0x00, 0x00,
        (byte)0xfd, 0x00, 0x01, 0x00, 0x38, 0x00, 0x01, 0x00,
    };

    // buffers for handle output-params
    private final IntBuffer     ip = memAllocInt(1);
    private final LongBuffer    lp = memAllocLong(1);
    private final PointerBuffer pp = memAllocPointer(1);

    private PointerBuffer extension_names = memAllocPointer(64);

    private VkInstance       inst;
    private VkPhysicalDevice gpu;

    private long msg_callback;

    private VkPhysicalDeviceProperties gpu_props    = VkPhysicalDeviceProperties.malloc();
    private VkPhysicalDeviceFeatures   gpu_features = VkPhysicalDeviceFeatures.malloc();

    private VkQueueFamilyProperties.Buffer queue_props;

    private int   width          = 300;
    private int   height         = 300;
    private float depthStencil   = 1.0f;
    private float depthIncrement = -0.01f;

    private long window;

    private long surface;

    private int graphics_queue_node_index;

    private VkDevice device;
    private VkQueue  queue;

    private int format;
    private int color_space;

    private VkPhysicalDeviceMemoryProperties memory_properties = VkPhysicalDeviceMemoryProperties.malloc();

    private long            cmd_pool;
    private VkCommandBuffer draw_cmd;

    private long               swapchain;
    private int                swapchainImageCount;
    private SwapchainBuffers[] buffers;
    private int                current_buffer;

    private VkCommandBuffer setup_cmd;

    private Depth depth = new Depth();

    private TextureObject[] textures = new TextureObject[DEMO_TEXTURE_COUNT];

    private Vertices vertices = new Vertices();

    private long desc_layout;
    private long pipeline_layout;

    private long render_pass;

    private long pipeline;

    private long desc_pool;
    private long desc_set;

    private LongBuffer framebuffers;

    private HelloVulkan() {
        for (int i = 0; i < textures.length; i++) {
            textures[i] = new TextureObject();
        }
    }

    private final VkDebugUtilsMessengerCallbackEXT dbgFunc = VkDebugUtilsMessengerCallbackEXT.create(
        (messageSeverity, messageTypes, pCallbackData, pUserData) -> {
            String severity;
            if ((messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT) != 0) {
                severity = "VERBOSE";
            } else if ((messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT) != 0) {
                severity = "INFO";
            } else if ((messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) != 0) {
                severity = "WARNING";
            } else if ((messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) != 0) {
                severity = "ERROR";
            } else {
                severity = "UNKNOWN";
            }

            String type;
            if ((messageTypes & VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT) != 0) {
                type = "GENERAL";
            } else if ((messageTypes & VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) != 0) {
                type = "VALIDATION";
            } else if ((messageTypes & VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT) != 0) {
                type = "PERFORMANCE";
            } else {
                type = "UNKNOWN";
            }

            VkDebugUtilsMessengerCallbackDataEXT data = VkDebugUtilsMessengerCallbackDataEXT.create(pCallbackData);
            System.err.format(
                "%s %s: [%s]\n\t%s\n",
                type, severity, data.pMessageIdNameString(), data.pMessageString()
            );

            /*
             * false indicates that layer should not bail-out of an
             * API call that had validation failures. This may mean that the
             * app dies inside the driver due to invalid parameter(s).
             * That's what would happen without validation layers, so we'll
             * keep that behavior here.
             */
            return VK_FALSE;
        }
    );

    private static void check(int errcode) {
        if (errcode != 0) {
            throw new IllegalStateException(String.format("Vulkan error [0x%X]", errcode));
        }
    }

    private static void demo_init_connection() {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        if (!glfwVulkanSupported()) {
            throw new IllegalStateException("Cannot find a compatible Vulkan installable client driver (ICD)");
        }
    }

    /**
     * Return true if all layer names specified in {@code check_names} can be found in given {@code layer} properties.
     */
    private static PointerBuffer demo_check_layers(MemoryStack stack, VkLayerProperties.Buffer available, String... layers) {
        PointerBuffer required = stack.mallocPointer(layers.length);
        for (int i = 0; i < layers.length; i++) {
            boolean found = false;

            for (int j = 0; j < available.capacity(); j++) {
                available.position(j);
                if (layers[i].equals(available.layerNameString())) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.err.format("Cannot find layer: %s\n", layers[i]);
                return null;
            }

            required.put(i, stack.ASCII(layers[i]));
        }

        return required;
    }

    private void demo_init_vk() {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer requiredLayers = null;
            if (VALIDATE) {
                check(vkEnumerateInstanceLayerProperties(ip, null));

                if (ip.get(0) > 0) {
                    VkLayerProperties.Buffer availableLayers = VkLayerProperties.malloc(ip.get(0), stack);
                    check(vkEnumerateInstanceLayerProperties(ip, availableLayers));

                    // VulkanSDK 1.1.106+
                    requiredLayers = demo_check_layers(
                        stack, availableLayers,
                        "VK_LAYER_KHRONOS_validation"/*,
                        "VK_LAYER_LUNARG_assistant_layer"*/
                    );
                    if (requiredLayers == null) { // use alternative (deprecated) set of validation layers
                        requiredLayers = demo_check_layers(
                            stack, availableLayers,
                            "VK_LAYER_LUNARG_standard_validation"/*,
                            "VK_LAYER_LUNARG_assistant_layer"*/
                        );
                    }
                    if (requiredLayers == null) { // use alternative (deprecated) set of validation layers
                        requiredLayers = demo_check_layers(
                            stack, availableLayers,
                            "VK_LAYER_GOOGLE_threading",
                            "VK_LAYER_LUNARG_parameter_validation",
                            "VK_LAYER_LUNARG_object_tracker",
                            "VK_LAYER_LUNARG_core_validation",
                            "VK_LAYER_GOOGLE_unique_objects"/*,
                            "VK_LAYER_LUNARG_assistant_layer"*/
                        );
                    }
                }

                if (requiredLayers == null) {
                    throw new IllegalStateException("vkEnumerateInstanceLayerProperties failed to find required validation layer.");
                }
            }

            PointerBuffer required_extensions = glfwGetRequiredInstanceExtensions();
            if (required_extensions == null) {
                throw new IllegalStateException("glfwGetRequiredInstanceExtensions failed to find the platform surface extensions.");
            }

            for (int i = 0; i < required_extensions.capacity(); i++) {
                extension_names.put(required_extensions.get(i));
            }

            check(vkEnumerateInstanceExtensionProperties((String)null, ip, null));

            if (ip.get(0) != 0) {
                VkExtensionProperties.Buffer instance_extensions = VkExtensionProperties.malloc(ip.get(0), stack);
                check(vkEnumerateInstanceExtensionProperties((String)null, ip, instance_extensions));

                for (int i = 0; i < ip.get(0); i++) {
                    instance_extensions.position(i);
                    if (VK_EXT_DEBUG_UTILS_EXTENSION_NAME.equals(instance_extensions.extensionNameString())) {
                        if (VALIDATE) {
                            extension_names.put(EXT_debug_utils);
                        }
                    }
                }
            }

            ByteBuffer APP_SHORT_NAME = stack.UTF8("tri");

            VkApplicationInfo app = VkApplicationInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .pApplicationName(APP_SHORT_NAME)
                .applicationVersion(0)
                .pEngineName(APP_SHORT_NAME)
                .engineVersion(0)
                .apiVersion(VK.getInstanceVersionSupported());

            extension_names.flip();
            VkInstanceCreateInfo inst_info = VkInstanceCreateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0)
                .pApplicationInfo(app)
                .ppEnabledLayerNames(requiredLayers)
                .ppEnabledExtensionNames(extension_names);
            extension_names.clear();

            VkDebugUtilsMessengerCreateInfoEXT dbgCreateInfo;
            if (VALIDATE) {
                dbgCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.malloc(stack)
                    .sType$Default()
                    .pNext(NULL)
                    .flags(0)
                    .messageSeverity(
                        /*VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT |
                        VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT |*/
                        VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                        VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
                    )
                    .messageType(
                        VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                        VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                        VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT
                    )
                    .pfnUserCallback(dbgFunc)
                    .pUserData(NULL);

                inst_info.pNext(dbgCreateInfo);
            }

            int err = vkCreateInstance(inst_info, null, pp);
            if (err == VK_ERROR_INCOMPATIBLE_DRIVER) {
                throw new IllegalStateException("Cannot find a compatible Vulkan installable client driver (ICD).");
            } else if (err == VK_ERROR_EXTENSION_NOT_PRESENT) {
                throw new IllegalStateException("Cannot find a specified extension library. Make sure your layers path is set appropriately.");
            } else if (err != 0) {
                throw new IllegalStateException("vkCreateInstance failed. Do you have a compatible Vulkan installable client driver (ICD) installed?");
            }

            inst = new VkInstance(pp.get(0), inst_info);

            /* Make initial call to query gpu_count, then second call for gpu info */
            check(vkEnumeratePhysicalDevices(inst, ip, null));

            if (ip.get(0) > 0) {
                PointerBuffer physical_devices = stack.mallocPointer(ip.get(0));
                check(vkEnumeratePhysicalDevices(inst, ip, physical_devices));

                /* For tri demo we just grab the first physical device */
                gpu = new VkPhysicalDevice(physical_devices.get(0), inst);
            } else {
                throw new IllegalStateException("vkEnumeratePhysicalDevices reported zero accessible devices.");
            }

            /* Look for device extensions */
            boolean swapchainExtFound = false;
            check(vkEnumerateDeviceExtensionProperties(gpu, (String)null, ip, null));

            if (ip.get(0) > 0) {
                try (VkExtensionProperties.Buffer device_extensions = VkExtensionProperties.malloc(ip.get(0))) {
                    check(vkEnumerateDeviceExtensionProperties(gpu, (String)null, ip, device_extensions));

                    for (int i = 0; i < ip.get(0); i++) {
                        device_extensions.position(i);
                        if (VK_KHR_SWAPCHAIN_EXTENSION_NAME.equals(device_extensions.extensionNameString())) {
                            swapchainExtFound = true;
                            extension_names.put(KHR_swapchain);
                        }
                    }
                }
            }

            if (!swapchainExtFound) {
                throw new IllegalStateException("vkEnumerateDeviceExtensionProperties failed to find the " + VK_KHR_SWAPCHAIN_EXTENSION_NAME + " extension.");
            }

            if (VALIDATE) {
                err = vkCreateDebugUtilsMessengerEXT(inst, dbgCreateInfo, null, lp);
                switch (err) {
                    case VK_SUCCESS:
                        msg_callback = lp.get(0);
                        break;
                    case VK_ERROR_OUT_OF_HOST_MEMORY:
                        throw new IllegalStateException("CreateDebugReportCallback: out of host memory");
                    default:
                        throw new IllegalStateException("CreateDebugReportCallback: unknown failure");
                }
            }

            vkGetPhysicalDeviceProperties(gpu, gpu_props);

            // Query with NULL data to get count
            vkGetPhysicalDeviceQueueFamilyProperties(gpu, ip, null);

            queue_props = VkQueueFamilyProperties.malloc(ip.get(0));
            vkGetPhysicalDeviceQueueFamilyProperties(gpu, ip, queue_props);
            if (ip.get(0) == 0) {
                throw new IllegalStateException();
            }

            vkGetPhysicalDeviceFeatures(gpu, gpu_features);

            // Graphics queue and MemMgr queue can be separate.
            // TODO: Add support for separate queues, including synchronization,
            //       and appropriate tracking for QueueSubmit
        }
    }

    private void demo_init() {
        demo_init_connection();
        demo_init_vk();
    }

    private void demo_create_window() {
        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);

        window = glfwCreateWindow(width, height, "The Vulkan Triangle Demo Program", NULL, NULL);
        if (window == NULL) {
            throw new IllegalStateException("Cannot create a window in which to draw!");
        }

        glfwSetWindowRefreshCallback(window, window -> demo_draw());

        glfwSetFramebufferSizeCallback(window, (window, width, height) -> {
            this.width = width;
            this.height = height;

            if (width != 0 && height != 0) {
                demo_resize();
            }
        });

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(window, true);
            }
        });
    }

    private void demo_init_device() {
        try (MemoryStack stack = stackPush()) {
            VkDeviceQueueCreateInfo.Buffer queue = VkDeviceQueueCreateInfo.malloc(1, stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0)
                .queueFamilyIndex(graphics_queue_node_index)
                .pQueuePriorities(stack.floats(0.0f));

            VkPhysicalDeviceFeatures features = VkPhysicalDeviceFeatures.calloc(stack);
            if (gpu_features.shaderClipDistance()) {
                features.shaderClipDistance(true);
            }

            extension_names.flip();
            VkDeviceCreateInfo device = VkDeviceCreateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0)
                .pQueueCreateInfos(queue)
                .ppEnabledLayerNames(null)
                .ppEnabledExtensionNames(extension_names)
                .pEnabledFeatures(features);

            check(vkCreateDevice(gpu, device, null, pp));

            this.device = new VkDevice(pp.get(0), gpu, device);
        }
    }

    private void demo_init_vk_swapchain() {
        // Create a WSI surface for the window:
        glfwCreateWindowSurface(inst, window, null, lp);
        surface = lp.get(0);

        try (MemoryStack stack = stackPush()) {
            // Iterate over each queue to learn whether it supports presenting:
            IntBuffer supportsPresent = stack.mallocInt(queue_props.capacity());
            int       graphicsQueueNodeIndex;
            int       presentQueueNodeIndex;
            for (int i = 0; i < supportsPresent.capacity(); i++) {
                supportsPresent.position(i);
                vkGetPhysicalDeviceSurfaceSupportKHR(gpu, i, surface, supportsPresent);
            }

            // Search for a graphics and a present queue in the array of queue
            // families, try to find one that supports both
            graphicsQueueNodeIndex = Integer.MAX_VALUE;
            presentQueueNodeIndex = Integer.MAX_VALUE;
            for (int i = 0; i < supportsPresent.capacity(); i++) {
                if ((queue_props.get(i).queueFlags() & VK_QUEUE_GRAPHICS_BIT) != 0) {
                    if (graphicsQueueNodeIndex == Integer.MAX_VALUE) {
                        graphicsQueueNodeIndex = i;
                    }

                    if (supportsPresent.get(i) == VK_TRUE) {
                        graphicsQueueNodeIndex = i;
                        presentQueueNodeIndex = i;
                        break;
                    }
                }
            }
            if (presentQueueNodeIndex == Integer.MAX_VALUE) {
                // If didn't find a queue that supports both graphics and present, then
                // find a separate present queue.
                for (int i = 0; i < supportsPresent.capacity(); ++i) {
                    if (supportsPresent.get(i) == VK_TRUE) {
                        presentQueueNodeIndex = i;
                        break;
                    }
                }
            }

            // Generate error if could not find both a graphics and a present queue
            if (graphicsQueueNodeIndex == Integer.MAX_VALUE || presentQueueNodeIndex == Integer.MAX_VALUE) {
                throw new IllegalStateException("Could not find a graphics and a present queue");
            }

            // TODO: Add support for separate queues, including presentation,
            //       synchronization, and appropriate tracking for QueueSubmit.
            // NOTE: While it is possible for an application to use a separate graphics
            //       and a present queues, this demo program assumes it is only using
            //       one:
            if (graphicsQueueNodeIndex != presentQueueNodeIndex) {
                throw new IllegalStateException("Could not find a common graphics and a present queue");
            }

            graphics_queue_node_index = graphicsQueueNodeIndex;

            demo_init_device();

            vkGetDeviceQueue(device, graphics_queue_node_index, 0, pp);
            queue = new VkQueue(pp.get(0), device);

            // Get the list of VkFormat's that are supported:
            check(vkGetPhysicalDeviceSurfaceFormatsKHR(gpu, surface, ip, null));

            VkSurfaceFormatKHR.Buffer surfFormats = VkSurfaceFormatKHR.malloc(ip.get(0), stack);
            check(vkGetPhysicalDeviceSurfaceFormatsKHR(gpu, surface, ip, surfFormats));

            // If the format list includes just one entry of VK_FORMAT_UNDEFINED,
            // the surface has no preferred format.  Otherwise, at least one
            // supported format will be returned.
            if (ip.get(0) == 1 && surfFormats.get(0).format() == VK_FORMAT_UNDEFINED) {
                format = VK_FORMAT_B8G8R8A8_UNORM;
            } else {
                assert ip.get(0) >= 1;
                format = surfFormats.get(0).format();
            }
            color_space = surfFormats.get(0).colorSpace();

            // Get Memory information and properties
            vkGetPhysicalDeviceMemoryProperties(gpu, memory_properties);
        }
    }

    private static class SwapchainBuffers {
        long            image;
        VkCommandBuffer cmd;
        long            view;
    }

    private void demo_set_image_layout(long image, int aspectMask, int old_image_layout, int new_image_layout, int srcAccessMask) {
        try (MemoryStack stack = stackPush()) {
            if (setup_cmd == null) {
                VkCommandBufferAllocateInfo cmd = VkCommandBufferAllocateInfo.malloc(stack)
                    .sType$Default()
                    .pNext(NULL)
                    .commandPool(cmd_pool)
                    .level(VK_COMMAND_BUFFER_LEVEL_PRIMARY)
                    .commandBufferCount(1);

                check(vkAllocateCommandBuffers(device, cmd, pp));
                setup_cmd = new VkCommandBuffer(pp.get(0), device);

                VkCommandBufferBeginInfo cmd_buf_info = VkCommandBufferBeginInfo.malloc(stack)
                    .sType$Default()
                    .pNext(NULL)
                    .flags(0)
                    .pInheritanceInfo(null);
                check(vkBeginCommandBuffer(setup_cmd, cmd_buf_info));
            }

            VkImageMemoryBarrier.Buffer image_memory_barrier = VkImageMemoryBarrier.malloc(1, stack)
                .sType$Default()
                .pNext(NULL)
                .srcAccessMask(srcAccessMask)
                .dstAccessMask(0)
                .oldLayout(old_image_layout)
                .newLayout(new_image_layout)
                .srcQueueFamilyIndex(0)
                .dstQueueFamilyIndex(0)
                .image(image)
                .subresourceRange(it -> it
                    .aspectMask(aspectMask)
                    .baseMipLevel(0)
                    .levelCount(1)
                    .baseArrayLayer(0)
                    .layerCount(1));

            int src_stages  = VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT;
            int dest_stages = VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT;

            if (srcAccessMask == VK_ACCESS_HOST_WRITE_BIT) {
                src_stages = VK_PIPELINE_STAGE_HOST_BIT;
            }

            switch (new_image_layout) {
                case VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL:
                    image_memory_barrier.dstAccessMask(VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT);
                    break;
                case VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL:
                    image_memory_barrier.dstAccessMask(VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT);
                    dest_stages = VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT;
                    break;
                case VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL:
                    /* Make sure any Copy or CPU writes to image are flushed */
                    image_memory_barrier.dstAccessMask(VK_ACCESS_SHADER_READ_BIT | VK_ACCESS_INPUT_ATTACHMENT_READ_BIT);
                    dest_stages = VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT;
                    break;
                case VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL:
                    image_memory_barrier.srcAccessMask(VK_ACCESS_MEMORY_READ_BIT);
                    /* Make sure anything that was copying from this image has completed */
                    image_memory_barrier.dstAccessMask(VK_ACCESS_TRANSFER_READ_BIT);
                    dest_stages = VK_PIPELINE_STAGE_TRANSFER_BIT;
                    break;
                case VK_IMAGE_LAYOUT_PRESENT_SRC_KHR:
                    image_memory_barrier.dstAccessMask(VK_ACCESS_MEMORY_READ_BIT);
                    break;
            }


            vkCmdPipelineBarrier(setup_cmd, src_stages, dest_stages, 0, null, null, image_memory_barrier);
        }
    }

    private void demo_prepare_buffers() {
        long oldSwapchain = swapchain;

        try (MemoryStack stack = stackPush()) {
            // Check the surface capabilities and formats
            VkSurfaceCapabilitiesKHR surfCapabilities = VkSurfaceCapabilitiesKHR.malloc(stack);
            check(vkGetPhysicalDeviceSurfaceCapabilitiesKHR(gpu, surface, surfCapabilities));

            check(vkGetPhysicalDeviceSurfacePresentModesKHR(gpu, surface, ip, null));

            IntBuffer presentModes = stack.mallocInt(ip.get(0));
            check(vkGetPhysicalDeviceSurfacePresentModesKHR(gpu, surface, ip, presentModes));

            VkExtent2D swapchainExtent = VkExtent2D.malloc(stack);
            // width and height are either both 0xFFFFFFFF, or both not 0xFFFFFFFF.
            if (surfCapabilities.currentExtent().width() == 0xFFFFFFFF) {
                // If the surface size is undefined, the size is set to the size
                // of the images requested, which must fit within the minimum and
                // maximum values.
                swapchainExtent.width(width);
                swapchainExtent.height(height);

                if (swapchainExtent.width() < surfCapabilities.minImageExtent().width()) {
                    swapchainExtent.width(surfCapabilities.minImageExtent().width());
                } else if (swapchainExtent.width() > surfCapabilities.maxImageExtent().width()) {
                    swapchainExtent.width(surfCapabilities.maxImageExtent().width());
                }

                if (swapchainExtent.height() < surfCapabilities.minImageExtent().height()) {
                    swapchainExtent.height(surfCapabilities.minImageExtent().height());
                } else if (swapchainExtent.height() > surfCapabilities.maxImageExtent().height()) {
                    swapchainExtent.height(surfCapabilities.maxImageExtent().height());
                }
            } else {
                // If the surface size is defined, the swap chain size must match
                swapchainExtent.set(surfCapabilities.currentExtent());
                width = surfCapabilities.currentExtent().width();
                height = surfCapabilities.currentExtent().height();
            }

            int swapchainPresentMode = VK_PRESENT_MODE_FIFO_KHR;

            // Determine the number of VkImage's to use in the swap chain.
            // Application desires to only acquire 1 image at a time (which is
            // "surfCapabilities.minImageCount").
            int desiredNumOfSwapchainImages = surfCapabilities.minImageCount();
            // If maxImageCount is 0, we can ask for as many images as we want;
            // otherwise we're limited to maxImageCount
            if ((surfCapabilities.maxImageCount() > 0) &&
                (desiredNumOfSwapchainImages > surfCapabilities.maxImageCount())) {
                // Application must settle for fewer images than desired:
                desiredNumOfSwapchainImages = surfCapabilities.maxImageCount();
            }

            int preTransform;
            if ((surfCapabilities.supportedTransforms() & VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR) != 0) {
                preTransform = VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
            } else {
                preTransform = surfCapabilities.currentTransform();
            }

            VkSwapchainCreateInfoKHR swapchain = VkSwapchainCreateInfoKHR.calloc(stack)
                .sType$Default()
                .surface(surface)
                .minImageCount(desiredNumOfSwapchainImages)
                .imageFormat(format)
                .imageColorSpace(color_space)
                .imageExtent(swapchainExtent)
                .imageArrayLayers(1)
                .imageUsage(VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT)
                .imageSharingMode(VK_SHARING_MODE_EXCLUSIVE)
                .preTransform(preTransform)
                .compositeAlpha(VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR)
                .presentMode(swapchainPresentMode)
                .clipped(true)
                .oldSwapchain(oldSwapchain);

            check(vkCreateSwapchainKHR(device, swapchain, null, lp));
            this.swapchain = lp.get(0);

            // If we just re-created an existing swapchain, we should destroy the old
            // swapchain at this point.
            // Note: destroying the swapchain also cleans up all its associated
            // presentable images once the platform is done with them.
            if (oldSwapchain != VK_NULL_HANDLE) {
                vkDestroySwapchainKHR(device, oldSwapchain, null);
            }

            check(vkGetSwapchainImagesKHR(device, this.swapchain, ip, null));
            swapchainImageCount = ip.get(0);

            LongBuffer swapchainImages = stack.mallocLong(swapchainImageCount);
            check(vkGetSwapchainImagesKHR(device, this.swapchain, ip, swapchainImages));

            buffers = new SwapchainBuffers[swapchainImageCount];

            for (int i = 0; i < swapchainImageCount; i++) {
                buffers[i] = new SwapchainBuffers();
                buffers[i].image = swapchainImages.get(i);

                VkImageViewCreateInfo color_attachment_view = VkImageViewCreateInfo.malloc(stack)
                    .sType$Default()
                    .pNext(NULL)
                    .flags(0)
                    .image(buffers[i].image)
                    .viewType(VK_IMAGE_VIEW_TYPE_2D)
                    .format(format)
                    .components(it -> it
                        .r(VK_COMPONENT_SWIZZLE_R)
                        .g(VK_COMPONENT_SWIZZLE_G)
                        .b(VK_COMPONENT_SWIZZLE_B)
                        .a(VK_COMPONENT_SWIZZLE_A))
                    .subresourceRange(it -> it
                        .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                        .baseMipLevel(0)
                        .levelCount(1)
                        .baseArrayLayer(0)
                        .layerCount(1));

                check(vkCreateImageView(device, color_attachment_view, null, lp));
                buffers[i].view = lp.get(0);
            }

            current_buffer = 0;
        }
    }

    private static class Depth {
        int format;

        long image;
        long mem;
        long view;
    }

    private boolean memory_type_from_properties(int typeBits, int requirements_mask, VkMemoryAllocateInfo mem_alloc) {
        // Search memtypes to find first index with those properties
        for (int i = 0; i < VK_MAX_MEMORY_TYPES; i++) {
            if ((typeBits & 1) == 1) {
                // Type is available, does it match user properties?
                if ((memory_properties.memoryTypes().get(i).propertyFlags() & requirements_mask) == requirements_mask) {
                    mem_alloc.memoryTypeIndex(i);
                    return true;
                }
            }
            typeBits >>= 1;
        }
        // No memory types matched, return failure
        return false;
    }

    private void demo_prepare_depth() {
        depth.format = VK_FORMAT_D16_UNORM;

        try (MemoryStack stack = stackPush()) {
            VkImageCreateInfo image = VkImageCreateInfo.calloc(stack)
                .sType$Default()
                .pNext(NULL)
                .imageType(VK_IMAGE_TYPE_2D)
                .format(depth.format)
                .extent(it -> it
                    .width(width)
                    .height(height)
                    .depth(1))
                .mipLevels(1)
                .arrayLayers(1)
                .samples(VK_SAMPLE_COUNT_1_BIT)
                .tiling(VK_IMAGE_TILING_OPTIMAL)
                .usage(VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT);

            /* create image */
            check(vkCreateImage(device, image, null, lp));
            depth.image = lp.get(0);

            /* get memory requirements for this object */
            VkMemoryRequirements mem_reqs = VkMemoryRequirements.malloc(stack);
            vkGetImageMemoryRequirements(device, depth.image, mem_reqs);

            /* select memory size and type */
            VkMemoryAllocateInfo mem_alloc = VkMemoryAllocateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .allocationSize(mem_reqs.size())
                .memoryTypeIndex(0);
            boolean pass = memory_type_from_properties(mem_reqs.memoryTypeBits(),
                0, /* No requirements */
                mem_alloc);
            assert (pass);

            /* allocate memory */
            check(vkAllocateMemory(device, mem_alloc, null, lp));
            depth.mem = lp.get(0);

            /* bind memory */
            check(vkBindImageMemory(device, depth.image, depth.mem, 0));

            demo_set_image_layout(depth.image, VK_IMAGE_ASPECT_DEPTH_BIT,
                VK_IMAGE_LAYOUT_UNDEFINED,
                VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL,
                0);

            /* create image view */
            VkImageViewCreateInfo view = VkImageViewCreateInfo.calloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0)
                .image(depth.image)
                .viewType(VK_IMAGE_VIEW_TYPE_2D)
                .format(depth.format)
                .subresourceRange(it -> it
                    .aspectMask(VK_IMAGE_ASPECT_DEPTH_BIT)
                    .baseMipLevel(0)
                    .levelCount(1)
                    .baseArrayLayer(0)
                    .layerCount(1));

            check(vkCreateImageView(device, view, null, lp));
            depth.view = lp.get(0);
        }
    }

    private static class TextureObject {
        long sampler;

        long image;
        int  imageLayout;

        long mem;
        long view;
        int  tex_width, tex_height;
    }

    private void demo_prepare_texture_image(
        int[] tex_colors,
        TextureObject tex_obj, int tiling,
        int usage, int required_props
    ) {
        int tex_format = VK_FORMAT_B8G8R8A8_UNORM;

        int tex_width  = 2;
        int tex_height = 2;

        boolean pass;

        tex_obj.tex_width = tex_width;
        tex_obj.tex_height = tex_height;

        try (MemoryStack stack = stackPush()) {
            VkImageCreateInfo image_create_info = VkImageCreateInfo.calloc(stack)
                .sType$Default()
                .pNext(NULL)
                .imageType(VK_IMAGE_TYPE_2D)
                .format(tex_format)
                .extent(it -> it
                    .width(tex_width)
                    .height(tex_height)
                    .depth(1))
                .mipLevels(1)
                .arrayLayers(1)
                .samples(VK_SAMPLE_COUNT_1_BIT)
                .tiling(tiling)
                .usage(usage)
                .flags(0)
                .initialLayout(VK_IMAGE_LAYOUT_PREINITIALIZED);

            check(vkCreateImage(device, image_create_info, null, lp));
            tex_obj.image = lp.get(0);

            VkMemoryRequirements mem_reqs = VkMemoryRequirements.malloc(stack);
            vkGetImageMemoryRequirements(device, tex_obj.image, mem_reqs);
            VkMemoryAllocateInfo mem_alloc = VkMemoryAllocateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .allocationSize(mem_reqs.size())
                .memoryTypeIndex(0);
            pass = memory_type_from_properties(mem_reqs.memoryTypeBits(), required_props, mem_alloc);
            assert (pass);

            /* allocate memory */
            check(vkAllocateMemory(device, mem_alloc, null, lp));
            tex_obj.mem = lp.get(0);

            /* bind memory */
            check(vkBindImageMemory(device, tex_obj.image, tex_obj.mem, 0));

            if ((required_props & VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) != 0) {
                VkImageSubresource subres = VkImageSubresource.malloc(stack)
                    .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                    .mipLevel(0)
                    .arrayLayer(0);

                VkSubresourceLayout layout = VkSubresourceLayout.malloc(stack);
                vkGetImageSubresourceLayout(device, tex_obj.image, subres, layout);

                check(vkMapMemory(device, tex_obj.mem, 0, mem_alloc.allocationSize(), 0, pp));

                for (int y = 0; y < tex_height; y++) {
                    IntBuffer row = memIntBuffer(pp.get(0) + layout.rowPitch() * y, tex_width);
                    for (int x = 0; x < tex_width; x++) {
                        row.put(x, tex_colors[(x & 1) ^ (y & 1)]);
                    }
                }

                vkUnmapMemory(device, tex_obj.mem);
            }

            tex_obj.imageLayout = VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL;
            demo_set_image_layout(tex_obj.image, VK_IMAGE_ASPECT_COLOR_BIT, VK_IMAGE_LAYOUT_PREINITIALIZED, tex_obj.imageLayout, VK_ACCESS_HOST_WRITE_BIT);
            /* setting the image layout does not reference the actual memory so no need
             * to add a mem ref */
        }
    }

    private void demo_destroy_texture_image(TextureObject tex_obj) {
        /* clean up staging resources */
        vkDestroyImage(device, tex_obj.image, null);
        vkFreeMemory(device, tex_obj.mem, null);
    }

    private void demo_flush_init_cmd() {
        if (setup_cmd == null) {
            return;
        }

        check(vkEndCommandBuffer(setup_cmd));

        try (MemoryStack stack = stackPush()) {
            VkSubmitInfo submit_info = VkSubmitInfo.calloc(stack)
                .sType$Default()
                .pCommandBuffers(pp.put(0, setup_cmd));

            check(vkQueueSubmit(queue, submit_info, VK_NULL_HANDLE));
        }

        check(vkQueueWaitIdle(queue));

        vkFreeCommandBuffers(device, cmd_pool, pp);
        setup_cmd = null;
    }

    private void demo_prepare_textures() {
        int tex_format = VK_FORMAT_B8G8R8A8_UNORM;

        int[][] tex_colors = {{0xffff0000, 0xff00ff00}};

        try (MemoryStack stack = stackPush()) {
            VkFormatProperties props = VkFormatProperties.malloc(stack);
            vkGetPhysicalDeviceFormatProperties(gpu, tex_format, props);

            for (int i = 0; i < DEMO_TEXTURE_COUNT; i++) {
                if ((props.linearTilingFeatures() & VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT) != 0 && !USE_STAGING_BUFFER) {
                    /* Device can texture using linear textures */
                    demo_prepare_texture_image(
                        tex_colors[i], textures[i], VK_IMAGE_TILING_LINEAR,
                        VK_IMAGE_USAGE_SAMPLED_BIT,
                        VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT);
                } else if ((props.optimalTilingFeatures() & VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT) != 0) {
                    /* Must use staging buffer to copy linear texture to optimized */
                    TextureObject staging_texture = new TextureObject();

                    demo_prepare_texture_image(
                        tex_colors[i], staging_texture, VK_IMAGE_TILING_LINEAR,
                        VK_IMAGE_USAGE_TRANSFER_SRC_BIT,
                        VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT);

                    demo_prepare_texture_image(
                        tex_colors[i], textures[i],
                        VK_IMAGE_TILING_OPTIMAL,
                        (VK_IMAGE_USAGE_TRANSFER_DST_BIT | VK_IMAGE_USAGE_SAMPLED_BIT),
                        VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT);

                    demo_set_image_layout(staging_texture.image,
                        VK_IMAGE_ASPECT_COLOR_BIT,
                        staging_texture.imageLayout,
                        VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL,
                        0);

                    demo_set_image_layout(textures[i].image,
                        VK_IMAGE_ASPECT_COLOR_BIT,
                        textures[i].imageLayout,
                        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
                        0);

                    VkImageCopy.Buffer copy_region = VkImageCopy.malloc(1, stack)
                        .srcSubresource(it -> it
                            .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                            .mipLevel(0)
                            .baseArrayLayer(0)
                            .layerCount(1))
                        .srcOffset(it -> it
                            .x(0)
                            .y(0)
                            .z(0))
                        .dstSubresource(it -> it
                            .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                            .mipLevel(0)
                            .baseArrayLayer(0)
                            .layerCount(1))
                        .dstOffset(it -> it
                            .x(0)
                            .y(0)
                            .z(0))
                        .extent(it -> it
                            .width(staging_texture.tex_width)
                            .height(staging_texture.tex_height)
                            .depth(1));

                    vkCmdCopyImage(
                        setup_cmd, staging_texture.image,
                        VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL, textures[i].image,
                        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL, copy_region
                    );

                    demo_set_image_layout(textures[i].image,
                        VK_IMAGE_ASPECT_COLOR_BIT,
                        VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
                        textures[i].imageLayout,
                        0);

                    demo_flush_init_cmd();

                    demo_destroy_texture_image(staging_texture);
                } else {
                    /* Can't support VK_FORMAT_B8G8R8A8_UNORM !? */
                    throw new IllegalStateException("No support for B8G8R8A8_UNORM as texture image format");
                }

                VkSamplerCreateInfo sampler = VkSamplerCreateInfo.calloc(stack)
                    .sType$Default()
                    .pNext(NULL)
                    .magFilter(VK_FILTER_NEAREST)
                    .minFilter(VK_FILTER_NEAREST)
                    .mipmapMode(VK_SAMPLER_MIPMAP_MODE_NEAREST)
                    .addressModeU(VK_SAMPLER_ADDRESS_MODE_REPEAT)
                    .addressModeV(VK_SAMPLER_ADDRESS_MODE_REPEAT)
                    .addressModeW(VK_SAMPLER_ADDRESS_MODE_REPEAT)
                    .mipLodBias(0.0f)
                    .anisotropyEnable(false)
                    .maxAnisotropy(1)
                    .compareOp(VK_COMPARE_OP_NEVER)
                    .minLod(0.0f)
                    .maxLod(0.0f)
                    .borderColor(VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE)
                    .unnormalizedCoordinates(false);

                /* create sampler */
                check(vkCreateSampler(device, sampler, null, lp));
                textures[i].sampler = lp.get(0);

                VkImageViewCreateInfo view = VkImageViewCreateInfo.malloc(stack)
                    .sType$Default()
                    .pNext(NULL)
                    .image(VK_NULL_HANDLE)
                    .viewType(VK_IMAGE_VIEW_TYPE_2D)
                    .format(tex_format)
                    .flags(0)
                    .components(it -> it
                        .r(VK_COMPONENT_SWIZZLE_R)
                        .g(VK_COMPONENT_SWIZZLE_G)
                        .b(VK_COMPONENT_SWIZZLE_B)
                        .a(VK_COMPONENT_SWIZZLE_A))
                    .subresourceRange(it -> it
                        .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                        .baseMipLevel(0)
                        .levelCount(1)
                        .baseArrayLayer(0)
                        .layerCount(1));

                /* create image view */
                view.image(textures[i].image);
                check(vkCreateImageView(device, view, null, lp));
                textures[i].view = lp.get(0);
            }
        }
    }

    private static class Vertices {
        long buf;
        long mem;

        VkPipelineVertexInputStateCreateInfo     vi          = VkPipelineVertexInputStateCreateInfo.calloc();
        VkVertexInputBindingDescription.Buffer   vi_bindings = VkVertexInputBindingDescription.calloc(1);
        VkVertexInputAttributeDescription.Buffer vi_attrs    = VkVertexInputAttributeDescription.calloc(2);
    }

    private void demo_prepare_vertices() {
        float[][] vb = {
            /*      position             texcoord */
            {-1.0f, -1.0f, 0.25f, 0.0f, 0.0f},
            {1.0f, -1.0f, 0.25f, 1.0f, 0.0f},
            {0.0f, 1.0f, 1.0f, 0.5f, 1.0f},
        };

        try (MemoryStack stack = stackPush()) {
            VkBufferCreateInfo buf_info = VkBufferCreateInfo.calloc(stack)
                .sType$Default()
                .size(/*sizeof(vb)*/ vb.length * vb[0].length * 4)
                .usage(VK_BUFFER_USAGE_VERTEX_BUFFER_BIT)
                .sharingMode(VK_SHARING_MODE_EXCLUSIVE);

            check(vkCreateBuffer(device, buf_info, null, lp));
            vertices.buf = lp.get(0);

            VkMemoryRequirements mem_reqs = VkMemoryRequirements.malloc(stack);
            vkGetBufferMemoryRequirements(device, vertices.buf, mem_reqs);

            VkMemoryAllocateInfo mem_alloc = VkMemoryAllocateInfo.calloc(stack)
                .sType$Default()
                .allocationSize(mem_reqs.size());
            boolean pass = memory_type_from_properties(mem_reqs.memoryTypeBits(), VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT, mem_alloc);
            assert (pass);

            check(vkAllocateMemory(device, mem_alloc, null, lp));
            vertices.mem = lp.get(0);

            check(vkMapMemory(device, vertices.mem, 0, mem_alloc.allocationSize(), 0, pp));
            FloatBuffer data = pp.getFloatBuffer(0, ((int)mem_alloc.allocationSize()) >> 2);
            data
                .put(vb[0])
                .put(vb[1])
                .put(vb[2])
                .flip();
        }

        vkUnmapMemory(device, vertices.mem);

        check(vkBindBufferMemory(device, vertices.buf, vertices.mem, 0));

        vertices.vi
            .sType$Default()
            .pNext(NULL)
            .pVertexBindingDescriptions(vertices.vi_bindings)
            .pVertexAttributeDescriptions(vertices.vi_attrs);

        vertices.vi_bindings.get(0)
            .binding(VERTEX_BUFFER_BIND_ID)
            .stride(vb[0].length * 4)
            .inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

        vertices.vi_attrs.get(0)
            .binding(VERTEX_BUFFER_BIND_ID)
            .location(0)
            .format(VK_FORMAT_R32G32B32_SFLOAT)
            .offset(0);

        vertices.vi_attrs.get(1)
            .binding(VERTEX_BUFFER_BIND_ID)
            .location(1)
            .format(VK_FORMAT_R32G32_SFLOAT)
            .offset(4 * 3);
    }

    private void demo_prepare_descriptor_layout() {
        try (MemoryStack stack = stackPush()) {
            VkDescriptorSetLayoutCreateInfo descriptor_layout = VkDescriptorSetLayoutCreateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0)
                .pBindings(
                    VkDescriptorSetLayoutBinding.calloc(1, stack)
                        .binding(0)
                        .descriptorType(VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
                        .descriptorCount(DEMO_TEXTURE_COUNT)
                        .stageFlags(VK_SHADER_STAGE_FRAGMENT_BIT)
                );

            LongBuffer layouts = stack.mallocLong(1);
            check(vkCreateDescriptorSetLayout(device, descriptor_layout, null, layouts));
            desc_layout = layouts.get(0);

            VkPipelineLayoutCreateInfo pPipelineLayoutCreateInfo = VkPipelineLayoutCreateInfo.calloc(stack)
                .sType$Default()
                .pNext(NULL)
                .pSetLayouts(layouts);

            check(vkCreatePipelineLayout(device, pPipelineLayoutCreateInfo, null, lp));
            pipeline_layout = lp.get(0);
        }
    }

    private void demo_prepare_render_pass() {
        try (MemoryStack stack = stackPush()) {
            VkAttachmentDescription.Buffer attachments = VkAttachmentDescription.malloc(2, stack);
            attachments.get(0)
                .flags(0)
                .format(format)
                .samples(VK_SAMPLE_COUNT_1_BIT)
                .loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)
                .storeOp(VK_ATTACHMENT_STORE_OP_STORE)
                .stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE)
                .stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
                .initialLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
                .finalLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);
            attachments.get(1)
                .flags(0)
                .format(depth.format)
                .samples(VK_SAMPLE_COUNT_1_BIT)
                .loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)
                .storeOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
                .stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE)
                .stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
                .initialLayout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL)
                .finalLayout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

            VkSubpassDescription.Buffer subpass = VkSubpassDescription.calloc(1, stack)
                .pipelineBindPoint(VK_PIPELINE_BIND_POINT_GRAPHICS)
                .colorAttachmentCount(1)
                .pColorAttachments(
                    VkAttachmentReference.malloc(1, stack)
                        .attachment(0)
                        .layout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
                )
                .pDepthStencilAttachment(
                    VkAttachmentReference.malloc(stack)
                        .attachment(1)
                        .layout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL)
                );

            VkRenderPassCreateInfo rp_info = VkRenderPassCreateInfo.calloc(stack)
                .sType$Default()
                .pAttachments(attachments)
                .pSubpasses(subpass);

            check(vkCreateRenderPass(device, rp_info, null, lp));
            render_pass = lp.get(0);
        }
    }

    private long demo_prepare_shader_module(byte[] code) {
        try (MemoryStack stack = stackPush()) {
            ByteBuffer pCode = memAlloc(code.length).put(code);
            pCode.flip();

            VkShaderModuleCreateInfo moduleCreateInfo = VkShaderModuleCreateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0)
                .pCode(pCode);

            check(vkCreateShaderModule(device, moduleCreateInfo, null, lp));

            memFree(pCode);

            return lp.get(0);
        }
    }

    private void demo_prepare_pipeline() {
        long vert_shader_module;
        long frag_shader_module;
        long pipelineCache;

        try (MemoryStack stack = stackPush()) {
            VkGraphicsPipelineCreateInfo.Buffer pipeline = VkGraphicsPipelineCreateInfo.calloc(1, stack);

            // Two stages: vs and fs
            ByteBuffer main = stack.UTF8("main");

            VkPipelineShaderStageCreateInfo.Buffer shaderStages = VkPipelineShaderStageCreateInfo.calloc(2, stack);
            shaderStages.get(0)
                .sType$Default()
                .stage(VK_SHADER_STAGE_VERTEX_BIT)
                .module(vert_shader_module = demo_prepare_shader_module(vertShaderCode))
                .pName(main);
            shaderStages.get(1)
                .sType$Default()
                .stage(VK_SHADER_STAGE_FRAGMENT_BIT)
                .module(frag_shader_module = demo_prepare_shader_module(fragShaderCode))
                .pName(main);

            VkPipelineDepthStencilStateCreateInfo ds = VkPipelineDepthStencilStateCreateInfo.calloc(stack)
                .sType$Default()
                .depthTestEnable(true)
                .depthWriteEnable(true)
                .depthCompareOp(VK_COMPARE_OP_LESS_OR_EQUAL)
                .depthBoundsTestEnable(false)
                .stencilTestEnable(false)
                .back(it -> it
                    .failOp(VK_STENCIL_OP_KEEP)
                    .passOp(VK_STENCIL_OP_KEEP)
                    .compareOp(VK_COMPARE_OP_ALWAYS));
            ds.front(ds.back());

            pipeline
                .sType$Default()
                .pStages(shaderStages)
                .pVertexInputState(vertices.vi)
                .pInputAssemblyState(
                    VkPipelineInputAssemblyStateCreateInfo.calloc(stack)
                        .sType$Default()
                        .topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST))
                .pViewportState(
                    VkPipelineViewportStateCreateInfo.calloc(stack)
                        .sType$Default()
                        .viewportCount(1)
                        .scissorCount(1))
                .pRasterizationState(
                    VkPipelineRasterizationStateCreateInfo.calloc(stack)
                        .sType$Default()
                        .polygonMode(VK_POLYGON_MODE_FILL)
                        .cullMode(VK_CULL_MODE_BACK_BIT)
                        .frontFace(VK_FRONT_FACE_CLOCKWISE)
                        .depthClampEnable(false)
                        .rasterizerDiscardEnable(false)
                        .depthBiasEnable(false)
                        .lineWidth(1.0f))
                .pMultisampleState(
                    VkPipelineMultisampleStateCreateInfo.calloc(stack)
                        .sType$Default()
                        .pSampleMask(null)
                        .rasterizationSamples(VK_SAMPLE_COUNT_1_BIT))
                .pDepthStencilState(ds)
                .pColorBlendState(
                    VkPipelineColorBlendStateCreateInfo.calloc(stack)
                        .sType$Default()
                        .pAttachments(
                            VkPipelineColorBlendAttachmentState.calloc(1, stack)
                                .colorWriteMask(0xf)
                                .blendEnable(false)
                        ))
                .pDynamicState(
                    VkPipelineDynamicStateCreateInfo.calloc(stack)
                        .sType$Default()
                        .pDynamicStates(stack.ints(
                            VK_DYNAMIC_STATE_VIEWPORT,
                            VK_DYNAMIC_STATE_SCISSOR
                        )))
                .layout(pipeline_layout)
                .renderPass(render_pass);

            VkPipelineCacheCreateInfo pipelineCacheCI = VkPipelineCacheCreateInfo.calloc(stack)
                .sType$Default();

            check(vkCreatePipelineCache(device, pipelineCacheCI, null, lp));
            pipelineCache = lp.get(0);

            check(vkCreateGraphicsPipelines(device, pipelineCache, pipeline, null, lp));
            this.pipeline = lp.get(0);

            vkDestroyPipelineCache(device, pipelineCache, null);

            vkDestroyShaderModule(device, frag_shader_module, null);
            vkDestroyShaderModule(device, vert_shader_module, null);
        }
    }

    private void demo_prepare_descriptor_pool() {
        try (MemoryStack stack = stackPush()) {
            VkDescriptorPoolCreateInfo descriptor_pool = VkDescriptorPoolCreateInfo.calloc(stack)
                .sType$Default()
                .pNext(NULL)
                .maxSets(1)
                .pPoolSizes(
                    VkDescriptorPoolSize.malloc(1, stack)
                        .type(VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
                        .descriptorCount(DEMO_TEXTURE_COUNT)
                );

            check(vkCreateDescriptorPool(device, descriptor_pool, null, lp));
            desc_pool = lp.get(0);
        }
    }

    private void demo_prepare_descriptor_set() {
        try (MemoryStack stack = stackPush()) {
            LongBuffer layouts = stack.longs(desc_layout);
            VkDescriptorSetAllocateInfo alloc_info = VkDescriptorSetAllocateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .descriptorPool(desc_pool)
                .pSetLayouts(layouts);

            check(vkAllocateDescriptorSets(device, alloc_info, lp));
            desc_set = lp.get(0);

            VkDescriptorImageInfo.Buffer tex_descs = VkDescriptorImageInfo.calloc(DEMO_TEXTURE_COUNT, stack);
            for (int i = 0; i < DEMO_TEXTURE_COUNT; i++) {
                tex_descs.get(i)
                    .sampler(textures[i].sampler)
                    .imageView(textures[i].view)
                    .imageLayout(VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL);
            }

            VkWriteDescriptorSet.Buffer write = VkWriteDescriptorSet.calloc(1, stack)
                .sType$Default()
                .dstSet(desc_set)
                .descriptorType(VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER)
                .descriptorCount(tex_descs.remaining())
                .pImageInfo(tex_descs);

            vkUpdateDescriptorSets(device, write, null);
        }
    }

    private void demo_prepare_framebuffers() {
        try (MemoryStack stack = stackPush()) {
            LongBuffer attachments = stack.longs(0, depth.view);

            VkFramebufferCreateInfo fb_info = VkFramebufferCreateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0)
                .renderPass(render_pass)
                .pAttachments(attachments)
                .width(width)
                .height(height)
                .layers(1);

            framebuffers = memAllocLong(swapchainImageCount);

            for (int i = 0; i < swapchainImageCount; i++) {
                attachments.put(0, buffers[i].view);
                check(vkCreateFramebuffer(device, fb_info, null, lp));
                framebuffers.put(i, lp.get(0));
            }
        }
    }

    private void demo_prepare() {
        try (MemoryStack stack = stackPush()) {
            VkCommandPoolCreateInfo cmd_pool_info = VkCommandPoolCreateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT)
                .queueFamilyIndex(graphics_queue_node_index);

            check(vkCreateCommandPool(device, cmd_pool_info, null, lp));

            cmd_pool = lp.get(0);

            VkCommandBufferAllocateInfo cmd = VkCommandBufferAllocateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .commandPool(cmd_pool)
                .level(VK_COMMAND_BUFFER_LEVEL_PRIMARY)
                .commandBufferCount(1);

            check(vkAllocateCommandBuffers(device, cmd, pp));
        }

        draw_cmd = new VkCommandBuffer(pp.get(0), device);

        demo_prepare_buffers();
        demo_prepare_depth();
        demo_prepare_textures();
        demo_prepare_vertices();
        demo_prepare_descriptor_layout();
        demo_prepare_render_pass();
        demo_prepare_pipeline();

        demo_prepare_descriptor_pool();
        demo_prepare_descriptor_set();

        demo_prepare_framebuffers();
    }

    private void demo_draw_build_cmd() {
        try (MemoryStack stack = stackPush()) {
            VkCommandBufferBeginInfo cmd_buf_info = VkCommandBufferBeginInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0)
                .pInheritanceInfo(null);

            check(vkBeginCommandBuffer(draw_cmd, cmd_buf_info));

            VkClearValue.Buffer clear_values = VkClearValue.malloc(2, stack);
            clear_values.get(0).color()
                .float32(0, 0.2f)
                .float32(1, 0.2f)
                .float32(2, 0.2f)
                .float32(3, 0.2f);
            clear_values.get(1).depthStencil()
                .depth(depthStencil)
                .stencil(0);

            VkRenderPassBeginInfo rp_begin = VkRenderPassBeginInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .renderPass(render_pass)
                .framebuffer(framebuffers.get(current_buffer))
                .renderArea(ra -> ra
                    .offset(it -> it
                        .x(0)
                        .y(0))
                    .extent(it -> it
                        .width(width)
                        .height(height)))
                .pClearValues(clear_values);

            // We can use LAYOUT_UNDEFINED as a wildcard here because we don't care what
            // happens to the previous contents of the image
            VkImageMemoryBarrier.Buffer image_memory_barrier = VkImageMemoryBarrier.malloc(1, stack)
                .sType$Default()
                .pNext(NULL)
                .srcAccessMask(0)
                .dstAccessMask(VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT)
                .oldLayout(VK_IMAGE_LAYOUT_UNDEFINED)
                .newLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
                .srcQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED)
                .dstQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED)
                .image(buffers[current_buffer].image)
                .subresourceRange(it -> it
                    .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                    .baseMipLevel(0)
                    .levelCount(1)
                    .baseArrayLayer(0)
                    .layerCount(1));

            vkCmdPipelineBarrier(draw_cmd, VK_PIPELINE_STAGE_ALL_COMMANDS_BIT, VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT, 0, null, null, image_memory_barrier);
            vkCmdBeginRenderPass(draw_cmd, rp_begin, VK_SUBPASS_CONTENTS_INLINE);

            vkCmdBindPipeline(draw_cmd, VK_PIPELINE_BIND_POINT_GRAPHICS, pipeline);

            lp.put(0, desc_set);
            vkCmdBindDescriptorSets(draw_cmd, VK_PIPELINE_BIND_POINT_GRAPHICS, pipeline_layout, 0, lp, null);

            VkViewport.Buffer viewport = VkViewport.calloc(1, stack)
                .height(height)
                .width(width)
                .minDepth(0.0f)
                .maxDepth(1.0f);
            vkCmdSetViewport(draw_cmd, 0, viewport);

            VkRect2D.Buffer scissor = VkRect2D.calloc(1, stack)
                .extent(it -> it
                    .width(width)
                    .height(height))
                .offset(it -> it
                    .x(0)
                    .y(0));
            vkCmdSetScissor(draw_cmd, 0, scissor);

            lp.put(0, 0);
            LongBuffer pBuffers = stack.longs(vertices.buf);
            vkCmdBindVertexBuffers(draw_cmd, VERTEX_BUFFER_BIND_ID, pBuffers, lp);

            vkCmdDraw(draw_cmd, 3, 1, 0, 0);
            vkCmdEndRenderPass(draw_cmd);

            VkImageMemoryBarrier.Buffer prePresentBarrier = VkImageMemoryBarrier.malloc(1, stack)
                .sType$Default()
                .pNext(NULL)
                .srcAccessMask(VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT)
                .dstAccessMask(VK_ACCESS_MEMORY_READ_BIT)
                .oldLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
                .newLayout(VK_IMAGE_LAYOUT_PRESENT_SRC_KHR)
                .srcQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED)
                .dstQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED)
                .image(buffers[current_buffer].image)
                .subresourceRange(it -> it
                    .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                    .baseMipLevel(0)
                    .levelCount(1)
                    .baseArrayLayer(0)
                    .layerCount(1));

            vkCmdPipelineBarrier(draw_cmd, VK_PIPELINE_STAGE_ALL_COMMANDS_BIT, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT, 0, null, null, prePresentBarrier);

            check(vkEndCommandBuffer(draw_cmd));
        }
    }

    private void demo_draw() {
        try (MemoryStack stack = stackPush()) {
            VkSemaphoreCreateInfo semaphoreCreateInfo = VkSemaphoreCreateInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .flags(0);

            check(vkCreateSemaphore(device, semaphoreCreateInfo, null, lp));
            long imageAcquiredSemaphore = lp.get(0);

            check(vkCreateSemaphore(device, semaphoreCreateInfo, null, lp));
            long drawCompleteSemaphore = lp.get(0);

            // Get the index of the next available swapchain image:
            int err = vkAcquireNextImageKHR(device, swapchain, ~0L,
                imageAcquiredSemaphore,
                NULL, // TODO: Show use of fence
                ip);
            if (err == VK_ERROR_OUT_OF_DATE_KHR) {
                // demo->swapchain is out of date (e.g. the window was resized) and
                // must be recreated:
                demo_resize();
                demo_draw();
                vkDestroySemaphore(device, drawCompleteSemaphore, null);
                vkDestroySemaphore(device, imageAcquiredSemaphore, null);
                return;
            } else if (err == VK_SUBOPTIMAL_KHR) {
                // demo->swapchain is not as optimal as it could be, but the platform's
                // presentation engine will still present the image correctly.
            } else {
                check(err);
            }
            current_buffer = ip.get(0);

            demo_flush_init_cmd();

            // Wait for the present complete semaphore to be signaled to ensure
            // that the image won't be rendered to until the presentation
            // engine has fully released ownership to the application, and it is
            // okay to render to the image.

            demo_draw_build_cmd();
            LongBuffer lp2 = stack.mallocLong(1);
            VkSubmitInfo submit_info = VkSubmitInfo.malloc(stack)
                .sType$Default()
                .pNext(NULL)
                .waitSemaphoreCount(1)
                .pWaitSemaphores(lp.put(0, imageAcquiredSemaphore))
                .pWaitDstStageMask(ip.put(0, VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT))
                .pCommandBuffers(pp.put(0, draw_cmd))
                .pSignalSemaphores(lp2.put(0, drawCompleteSemaphore));

            check(vkQueueSubmit(queue, submit_info, VK_NULL_HANDLE));

            VkPresentInfoKHR present = VkPresentInfoKHR.calloc(stack)
                .sType$Default()
                .pNext(NULL)
                .pWaitSemaphores(lp2)
                .swapchainCount(1)
                .pSwapchains(lp.put(0, swapchain))
                .pImageIndices(ip.put(0, current_buffer));

            err = vkQueuePresentKHR(queue, present);
            if (err == VK_ERROR_OUT_OF_DATE_KHR) {
                // demo->swapchain is out of date (e.g. the window was resized) and
                // must be recreated:
                demo_resize();
            } else if (err == VK_SUBOPTIMAL_KHR) {
                // demo->swapchain is not as optimal as it could be, but the platform's
                // presentation engine will still present the image correctly.
            } else {
                check(err);
            }

            check(vkQueueWaitIdle(queue));

            vkDestroySemaphore(device, drawCompleteSemaphore, null);
            vkDestroySemaphore(device, imageAcquiredSemaphore, null);
        }
    }

    private void demo_resize() {
        // In order to properly resize the window, we must re-create the swapchain
        // AND redo the command buffers, etc.
        //
        // First, perform part of the demo_cleanup() function:

        for (int i = 0; i < swapchainImageCount; i++) {
            vkDestroyFramebuffer(device, framebuffers.get(i), null);
        }
        memFree(framebuffers);
        vkDestroyDescriptorPool(device, desc_pool, null);

        if (setup_cmd != null) {
            vkFreeCommandBuffers(device, cmd_pool, setup_cmd);
            setup_cmd = null;
        }
        vkFreeCommandBuffers(device, cmd_pool, draw_cmd);
        vkDestroyCommandPool(device, cmd_pool, null);

        vkDestroyPipeline(device, pipeline, null);
        vkDestroyRenderPass(device, render_pass, null);
        vkDestroyPipelineLayout(device, pipeline_layout, null);
        vkDestroyDescriptorSetLayout(device, desc_layout, null);

        vkDestroyBuffer(device, vertices.buf, null);
        vkFreeMemory(device, vertices.mem, null);

        for (int i = 0; i < DEMO_TEXTURE_COUNT; i++) {
            vkDestroyImageView(device, textures[i].view, null);
            vkDestroyImage(device, textures[i].image, null);
            vkFreeMemory(device, textures[i].mem, null);
            vkDestroySampler(device, textures[i].sampler, null);
        }

        for (int i = 0; i < swapchainImageCount; i++) {
            vkDestroyImageView(device, buffers[i].view, null);
        }

        vkDestroyImageView(device, depth.view, null);
        vkDestroyImage(device, depth.image, null);
        vkFreeMemory(device, depth.mem, null);

        buffers = null;

        // Second, re-perform the demo_prepare() function, which will re-create the
        // swapchain:
        demo_prepare();
    }

    private void demo_run() {
        int  c = 0;
        long t = System.nanoTime();
        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            demo_draw();

            if (depthStencil > 0.99f) {
                depthIncrement = -0.001f;
            }
            if (depthStencil < 0.8f) {
                depthIncrement = 0.001f;
            }

            depthStencil += depthIncrement;

            c++;
            if (System.nanoTime() - t > 1000 * 1000 * 1000) {
                System.out.println(c);
                t = System.nanoTime();
                c = 0;
            }

            // Wait for work to finish before updating MVP.
            vkDeviceWaitIdle(device);
        }
    }

    private void demo_cleanup() {
        for (int i = 0; i < swapchainImageCount; i++) {
            vkDestroyFramebuffer(device, framebuffers.get(i), null);
        }
        memFree(framebuffers);
        vkDestroyDescriptorPool(device, desc_pool, null);

        if (setup_cmd != null) {
            vkFreeCommandBuffers(device, cmd_pool, setup_cmd);
            setup_cmd = null;
        }
        vkFreeCommandBuffers(device, cmd_pool, draw_cmd);
        vkDestroyCommandPool(device, cmd_pool, null);

        vkDestroyPipeline(device, pipeline, null);
        vkDestroyRenderPass(device, render_pass, null);
        vkDestroyPipelineLayout(device, pipeline_layout, null);
        vkDestroyDescriptorSetLayout(device, desc_layout, null);

        vkDestroyBuffer(device, vertices.buf, null);
        vkFreeMemory(device, vertices.mem, null);
        vertices.vi.free();
        vertices.vi_bindings.free();
        vertices.vi_attrs.free();

        for (int i = 0; i < DEMO_TEXTURE_COUNT; i++) {
            vkDestroyImageView(device, textures[i].view, null);
            vkDestroyImage(device, textures[i].image, null);
            vkFreeMemory(device, textures[i].mem, null);
            vkDestroySampler(device, textures[i].sampler, null);
        }

        for (int i = 0; i < swapchainImageCount; i++) {
            vkDestroyImageView(device, buffers[i].view, null);
        }

        vkDestroyImageView(device, depth.view, null);
        vkDestroyImage(device, depth.image, null);
        vkFreeMemory(device, depth.mem, null);

        vkDestroySwapchainKHR(device, swapchain, null);
        buffers = null;

        vkDestroyDevice(device, null);
        vkDestroySurfaceKHR(inst, surface, null);
        if (msg_callback != NULL) {
            vkDestroyDebugUtilsMessengerEXT(inst, msg_callback, null);
        }
        vkDestroyInstance(inst, null);
        dbgFunc.free();

        gpu_features.free();
        gpu_props.free();
        queue_props.free();
        memory_properties.free();

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();

        memFree(extension_names);

        memFree(pp);
        memFree(lp);
        memFree(ip);

        memFree(EXT_debug_utils);
        memFree(KHR_swapchain);
    }

    private void run() {
        demo_init();
        demo_create_window();
        demo_init_vk_swapchain();

        demo_prepare();
        demo_run();

        demo_cleanup();
    }

    public static void main(String[] args) {
        new HelloVulkan().run();
    }
}