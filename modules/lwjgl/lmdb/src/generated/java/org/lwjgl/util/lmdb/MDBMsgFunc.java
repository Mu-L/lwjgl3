/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke MDB_msg_func *} */
public abstract class MDBMsgFunc extends Callback implements MDBMsgFuncI {

    /**
     * Creates a {@code MDBMsgFunc} instance from the specified function pointer.
     *
     * @return the new {@code MDBMsgFunc}
     */
    public static MDBMsgFunc create(long functionPointer) {
        MDBMsgFuncI instance = Callback.get(functionPointer);
        return instance instanceof MDBMsgFunc
            ? (MDBMsgFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MDBMsgFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code MDBMsgFunc} instance that delegates to the specified {@code MDBMsgFuncI} instance. */
    public static MDBMsgFunc create(MDBMsgFuncI instance) {
        return instance instanceof MDBMsgFunc
            ? (MDBMsgFunc)instance
            : new Container(instance.address(), instance);
    }

    protected MDBMsgFunc() {
        super(CIF);
    }

    MDBMsgFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends MDBMsgFunc {

        private final MDBMsgFuncI delegate;

        Container(long functionPointer, MDBMsgFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long msg, long ctx) {
            return delegate.invoke(msg, ctx);
        }

    }

}