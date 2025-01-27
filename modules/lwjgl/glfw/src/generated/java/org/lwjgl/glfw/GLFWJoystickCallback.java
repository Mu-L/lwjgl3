/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Callback function: {@link #invoke GLFWjoystickfun} */
public abstract class GLFWJoystickCallback extends Callback implements GLFWJoystickCallbackI {

    /**
     * Creates a {@code GLFWJoystickCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWJoystickCallback}
     */
    public static GLFWJoystickCallback create(long functionPointer) {
        GLFWJoystickCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWJoystickCallback
            ? (GLFWJoystickCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWJoystickCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWJoystickCallback} instance that delegates to the specified {@code GLFWJoystickCallbackI} instance. */
    public static GLFWJoystickCallback create(GLFWJoystickCallbackI instance) {
        return instance instanceof GLFWJoystickCallback
            ? (GLFWJoystickCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWJoystickCallback() {
        super(CIF);
    }

    GLFWJoystickCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetJoystickCallback SetJoystickCallback}. */
    public GLFWJoystickCallback set() {
        glfwSetJoystickCallback(this);
        return this;
    }

    private static final class Container extends GLFWJoystickCallback {

        private final GLFWJoystickCallbackI delegate;

        Container(long functionPointer, GLFWJoystickCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int jid, int event) {
            delegate.invoke(jid, event);
        }

    }

}