/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke bgfx_release_fn_t} */
public abstract class BGFXReleaseFunctionCallback extends Callback implements BGFXReleaseFunctionCallbackI {

    /**
     * Creates a {@code BGFXReleaseFunctionCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXReleaseFunctionCallback}
     */
    public static BGFXReleaseFunctionCallback create(long functionPointer) {
        BGFXReleaseFunctionCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BGFXReleaseFunctionCallback
            ? (BGFXReleaseFunctionCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable BGFXReleaseFunctionCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXReleaseFunctionCallback} instance that delegates to the specified {@code BGFXReleaseFunctionCallbackI} instance. */
    public static BGFXReleaseFunctionCallback create(BGFXReleaseFunctionCallbackI instance) {
        return instance instanceof BGFXReleaseFunctionCallback
            ? (BGFXReleaseFunctionCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXReleaseFunctionCallback() {
        super(CIF);
    }

    BGFXReleaseFunctionCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXReleaseFunctionCallback {

        private final BGFXReleaseFunctionCallbackI delegate;

        Container(long functionPointer, BGFXReleaseFunctionCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _ptr, long _userData) {
            delegate.invoke(_ptr, _userData);
        }

    }

}