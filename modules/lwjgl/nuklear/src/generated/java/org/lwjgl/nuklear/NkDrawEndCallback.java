/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_draw_end} */
public abstract class NkDrawEndCallback extends Callback implements NkDrawEndCallbackI {

    /**
     * Creates a {@code NkDrawEndCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkDrawEndCallback}
     */
    public static NkDrawEndCallback create(long functionPointer) {
        NkDrawEndCallbackI instance = Callback.get(functionPointer);
        return instance instanceof NkDrawEndCallback
            ? (NkDrawEndCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkDrawEndCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkDrawEndCallback} instance that delegates to the specified {@code NkDrawEndCallbackI} instance. */
    public static NkDrawEndCallback create(NkDrawEndCallbackI instance) {
        return instance instanceof NkDrawEndCallback
            ? (NkDrawEndCallback)instance
            : new Container(instance.address(), instance);
    }

    protected NkDrawEndCallback() {
        super(CIF);
    }

    NkDrawEndCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkDrawEndCallback {

        private final NkDrawEndCallbackI delegate;

        Container(long functionPointer, NkDrawEndCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long buffer, long userdata) {
            return delegate.invoke(buffer, userdata);
        }

    }

}