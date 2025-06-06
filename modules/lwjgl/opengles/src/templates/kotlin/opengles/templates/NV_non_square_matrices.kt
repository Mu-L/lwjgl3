/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_non_square_matrices = "NVNonSquareMatrices".nativeClassGLES("NV_non_square_matrices", postfix = NV) {
    IntConstant(
        "FLOAT_MAT2x3_NV"..0x8B65,
        "FLOAT_MAT2x4_NV"..0x8B66,
        "FLOAT_MAT3x2_NV"..0x8B67,
        "FLOAT_MAT3x4_NV"..0x8B68,
        "FLOAT_MAT4x2_NV"..0x8B69,
        "FLOAT_MAT4x3_NV"..0x8B6A
    )

    void(
        "UniformMatrix2x3fvNV",

        GLint("location"),
        AutoSize(2 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix3x2fvNV",

        GLint("location"),
        AutoSize(3 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix2x4fvNV",

        GLint("location"),
        AutoSize(2 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix4x2fvNV",

        GLint("location"),
        AutoSize(4 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix3x4fvNV",

        GLint("location"),
        AutoSize(3 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix4x3fvNV",

        GLint("location"),
        AutoSize(4 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )
}