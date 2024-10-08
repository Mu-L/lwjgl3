/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val EXT_conformance_automation = "EXTConformanceAutomation".nativeClassXR("EXT_conformance_automation", type = "instance", postfix = "EXT") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_EXT_conformance_automation">XR_EXT_conformance_automation</a> extension.

        The XR_EXT_conformance_automation allows conformance test and runtime developers to provide hints to the underlying runtime as to what input the test is expecting. This enables runtime authors to automate the testing of their runtime conformance. This is useful for achieving rapidly iterative runtime development whilst maintaining conformance for runtime releases.

        This extension provides the following capabilities:

        <ul>
            <li>The ability to toggle the active state of an input device.</li>
            <li>The ability to set the state of an input device button or other input component.</li>
            <li>The ability to set the location of the input device.</li>
        </ul>

        Applications <b>may</b> call these functions at any time. The runtime <b>must</b> do its best to honor the request of applications calling these functions, however it does not guarantee that any state change will be reflected immediately, at all, or with the exact value that was requested. Applications are thus advised to wait for the state change to be observable and to not assume that the value they requested will be the value observed. If any of the functions of this extension are called, control over input <b>must</b> be removed from the physical hardware of the system.

        <h5>Warning</h5>
        This extension is <b>not</b> intended for use by non-conformance-test applications. A runtime <b>may</b> require a runtime-specified configuration such as a "developer mode" to be enabled before reporting support for this extension or providing a non-stub implementation of it.

        <b>Do not</b> use this functionality in a non-conformance-test application!
        """

    IntConstant(
        "The extension specification version.",

        "EXT_conformance_automation_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "EXT_CONFORMANCE_AUTOMATION_EXTENSION_NAME".."XR_EXT_conformance_automation"
    )

    XrResult(
        "SetInputDeviceActiveEXT",
        """
        Sets the active state of the input device.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSetInputDeviceActiveEXT(
￿    XrSession                                   session,
￿    XrPath                                      interactionProfile,
￿    XrPath                                      topLevelPath,
￿    XrBool32                                    isActive);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid session handle.</li>
            <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling #SetInputDeviceActiveEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "the {@code XrSession} to set the input device state in."),
        XrPath("interactionProfile", "the path representing the interaction profile of the input device (e.g. pathname:/interaction_profiles/khr/simple_controller)."),
        XrPath("topLevelPath", "the path representing the input device (e.g. pathname:/user/hand/left)."),
        XrBool32("isActive", "the requested activation state of the input device.")
    )

    XrResult(
        "SetInputDeviceStateBoolEXT",
        """
        Sets the state of a boolean input source on the input device.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSetInputDeviceStateBoolEXT(
￿    XrSession                                   session,
￿    XrPath                                      topLevelPath,
￿    XrPath                                      inputSourcePath,
￿    XrBool32                                    state);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid session handle.</li>
            <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
            <li>{@code inputSourcePath} <b>must</b> be a valid input source path.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling #SetInputDeviceStateBoolEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "the {@code XrSession} to set the input device state in."),
        XrPath("topLevelPath", "the path representing the input device (e.g. pathname:/user/hand/left)."),
        XrPath("inputSourcePath", "the full path of the input component for which we wish to set the state for (e.g. pathname:/user/hand/left/input/select/click)."),
        XrBool32("state", "the requested boolean state of the input device.")
    )

    XrResult(
        "SetInputDeviceStateFloatEXT",
        """
        Sets the state of a float input source on the input device.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSetInputDeviceStateFloatEXT(
￿    XrSession                                   session,
￿    XrPath                                      topLevelPath,
￿    XrPath                                      inputSourcePath,
￿    float                                       state);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid session handle.</li>
            <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
            <li>{@code inputSourcePath} <b>must</b> be a valid input source path.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling #SetInputDeviceStateFloatEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
            </ul></dd>
        </dl>
        """,

        XrSession("session", "the {@code XrSession} to set the input device state in."),
        XrPath("topLevelPath", "the path representing the input device (e.g. pathname:/user/hand/left)."),
        XrPath("inputSourcePath", "the full path of the input component for which we wish to set the state for (e.g. pathname:/user/hand/left/input/trigger/value)."),
        float("state", "the requested float state of the input device.")
    )

    XrResult(
        "SetInputDeviceStateVector2fEXT",
        """
        Sets the state of a 2D vector input source on the input device.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSetInputDeviceStateVector2fEXT(
￿    XrSession                                   session,
￿    XrPath                                      topLevelPath,
￿    XrPath                                      inputSourcePath,
￿    XrVector2f                                  state);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid session handle.</li>
            <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
            <li>{@code inputSourcePath} <b>must</b> be a valid input source path.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling #SetInputDeviceStateVector2fEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrVector2f
        """,

        XrSession("session", "the {@code XrSession} to set the input device state in."),
        XrPath("topLevelPath", "the path representing the input device (e.g. pathname:/user/hand/left)."),
        XrPath("inputSourcePath", "the full path of the input component for which we wish to set the state for (e.g. pathname:/user/hand/left/input/thumbstick)."),
        XrVector2f("state", "the requested two-dimensional state of the input device.")
    )

    XrResult(
        "SetInputDeviceLocationEXT",
        """
        Sets the effective location of a pose input source on the input device.

        <h5>C Specification</h5>
        <pre><code>
￿XrResult xrSetInputDeviceLocationEXT(
￿    XrSession                                   session,
￿    XrPath                                      topLevelPath,
￿    XrPath                                      inputSourcePath,
￿    XrSpace                                     space,
￿    XrPosef                                     pose);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code session} <b>must</b> be a valid session handle.</li>
            <li>{@code topLevelPath} <b>must</b> be a valid top level path.</li>
            <li>{@code inputSourcePath} <b>must</b> be a valid input source path.</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace}.</li>
            <li>{@code pose} <b>must</b> be a valid ##XrPosef.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link EXTConformanceAutomation XR_EXT_conformance_automation} extension <b>must</b> be enabled prior to calling #SetInputDeviceLocationEXT()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code space} <b>must</b> be a valid {@code XrSpace} handle</li>
            <li>{@code space} <b>must</b> have been created, allocated, or retrieved from {@code session}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_POSE_INVALID</li>
                <li>#ERROR_PATH_UNSUPPORTED</li>
                <li>#ERROR_PATH_INVALID</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrPosef
        """,

        XrSession("session", "the {@code XrSession} to set the input device state in."),
        XrPath("topLevelPath", "the path representing the input device (e.g. pathname:/user/hand/left)."),
        XrPath("inputSourcePath", "the full path of the input component for which we wish to set the pose for (e.g. pathname:/user/hand/left/input/grip/pose)."),
        XrSpace("space", ""),
        XrPosef("pose", "the requested pose state of the input device.")
    )
}