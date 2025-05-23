/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package zstd.templates

import org.lwjgl.generator.*
import zstd.*

val ZstdErrors = "ZstdErrors".nativeClass(Module.ZSTD, prefix = "ZSTD", prefixMethod = "ZSTD_") {
    /*nativeDirective(
        """DISABLE_WARNINGS()
#include "zstd_errors.h"
ENABLE_WARNINGS()""")*/
    nativeImport("zstd_errors.h")

    EnumConstant(
        "error_no_error".."0",
        "error_GENERIC".."1",
        "error_prefix_unknown".."10",
        "error_version_unsupported".."12",
        "error_frameParameter_unsupported".."14",
        "error_frameParameter_windowTooLarge".."16",
        "error_corruption_detected".."20",
        "error_checksum_wrong".."22",
        "error_literals_headerWrong".."24",
        "error_dictionary_corrupted".."30",
        "error_dictionary_wrong".."32",
        "error_dictionaryCreation_failed".."34",
        "error_parameter_unsupported".."40",
        "error_parameter_combination_unsupported".."41",
        "error_parameter_outOfBound".."42",
        "error_tableLog_tooLarge".."44",
        "error_maxSymbolValue_tooLarge".."46",
        "error_maxSymbolValue_tooSmall".."48",
        "error_cannotProduce_uncompressedBlock".."49",
        "error_stabilityCondition_notRespected".."50",
        "error_stage_wrong".."60",
        "error_init_missing".."62",
        "error_memory_allocation".."64",
        "error_workSpace_tooSmall".."66",
        "error_dstSize_tooSmall".."70",
        "error_srcSize_wrong".."72",
        "error_dstBuffer_null".."74",
        "error_noForwardProgress_destFull".."80",
        "error_noForwardProgress_inputEmpty".."82",
        /* following error codes are not stable and may be removed or changed in a future version */
        "error_frameIndex_tooLarge".."100",
        "error_seekableIO".."102",
        "error_dstBuffer_wrong".."104",
        "error_srcBuffer_wrong".."105",
        "error_sequenceProducer_failed".."106",
        "error_externalSequences_invalid".."107"
    )

    Nonnull..charASCII.const.p(
        "getErrorString",

        ZSTD_ErrorCode("code")
    )
}