/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_plugin_paste} */
public abstract class NkPluginPaste extends Callback implements NkPluginPasteI {

    /**
     * Creates a {@code NkPluginPaste} instance from the specified function pointer.
     *
     * @return the new {@code NkPluginPaste}
     */
    public static NkPluginPaste create(long functionPointer) {
        NkPluginPasteI instance = Callback.get(functionPointer);
        return instance instanceof NkPluginPaste
            ? (NkPluginPaste)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkPluginPaste createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkPluginPaste} instance that delegates to the specified {@code NkPluginPasteI} instance. */
    public static NkPluginPaste create(NkPluginPasteI instance) {
        return instance instanceof NkPluginPaste
            ? (NkPluginPaste)instance
            : new Container(instance.address(), instance);
    }

    protected NkPluginPaste() {
        super(CIF);
    }

    NkPluginPaste(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkPluginPaste {

        private final NkPluginPasteI delegate;

        Container(long functionPointer, NkPluginPasteI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long handle, long edit) {
            delegate.invoke(handle, edit);
        }

    }

}