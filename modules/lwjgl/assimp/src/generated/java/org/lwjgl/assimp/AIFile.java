/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct aiFile {
 *     {@link AIFileReadProcI aiFileReadProc} ReadProc;
 *     {@link AIFileWriteProcI aiFileWriteProc} WriteProc;
 *     {@link AIFileTellProcI aiFileTellProc} TellProc;
 *     {@link AIFileTellProcI aiFileTellProc} FileSizeProc;
 *     {@link AIFileSeekI aiFileSeek} SeekProc;
 *     {@link AIFileFlushProcI aiFileFlushProc} FlushProc;
 *     aiUserData UserData;
 * }}</pre>
 */
@NativeType("struct aiFile")
public class AIFile extends Struct<AIFile> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        READPROC,
        WRITEPROC,
        TELLPROC,
        FILESIZEPROC,
        SEEKPROC,
        FLUSHPROC,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        READPROC = layout.offsetof(0);
        WRITEPROC = layout.offsetof(1);
        TELLPROC = layout.offsetof(2);
        FILESIZEPROC = layout.offsetof(3);
        SEEKPROC = layout.offsetof(4);
        FLUSHPROC = layout.offsetof(5);
        USERDATA = layout.offsetof(6);
    }

    protected AIFile(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIFile create(long address, @Nullable ByteBuffer container) {
        return new AIFile(address, container);
    }

    /**
     * Creates a {@code AIFile} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIFile(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ReadProc} field. */
    @NativeType("aiFileReadProc")
    public AIFileReadProc ReadProc() { return nReadProc(address()); }
    /** @return the value of the {@code WriteProc} field. */
    @NativeType("aiFileWriteProc")
    public AIFileWriteProc WriteProc() { return nWriteProc(address()); }
    /** @return the value of the {@code TellProc} field. */
    @NativeType("aiFileTellProc")
    public AIFileTellProc TellProc() { return nTellProc(address()); }
    /** @return the value of the {@code FileSizeProc} field. */
    @NativeType("aiFileTellProc")
    public AIFileTellProc FileSizeProc() { return nFileSizeProc(address()); }
    /** @return the value of the {@code SeekProc} field. */
    @NativeType("aiFileSeek")
    public AIFileSeek SeekProc() { return nSeekProc(address()); }
    /** @return the value of the {@code FlushProc} field. */
    @NativeType("aiFileFlushProc")
    public AIFileFlushProc FlushProc() { return nFlushProc(address()); }
    /** @return the value of the {@code UserData} field. */
    @NativeType("aiUserData")
    public long UserData() { return nUserData(address()); }

    /** Sets the specified value to the {@code ReadProc} field. */
    public AIFile ReadProc(@NativeType("aiFileReadProc") AIFileReadProcI value) { nReadProc(address(), value); return this; }
    /** Sets the specified value to the {@code WriteProc} field. */
    public AIFile WriteProc(@NativeType("aiFileWriteProc") AIFileWriteProcI value) { nWriteProc(address(), value); return this; }
    /** Sets the specified value to the {@code TellProc} field. */
    public AIFile TellProc(@NativeType("aiFileTellProc") AIFileTellProcI value) { nTellProc(address(), value); return this; }
    /** Sets the specified value to the {@code FileSizeProc} field. */
    public AIFile FileSizeProc(@NativeType("aiFileTellProc") AIFileTellProcI value) { nFileSizeProc(address(), value); return this; }
    /** Sets the specified value to the {@code SeekProc} field. */
    public AIFile SeekProc(@NativeType("aiFileSeek") AIFileSeekI value) { nSeekProc(address(), value); return this; }
    /** Sets the specified value to the {@code FlushProc} field. */
    public AIFile FlushProc(@NativeType("aiFileFlushProc") AIFileFlushProcI value) { nFlushProc(address(), value); return this; }
    /** Sets the specified value to the {@code UserData} field. */
    public AIFile UserData(@NativeType("aiUserData") long value) { nUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIFile set(
        AIFileReadProcI ReadProc,
        AIFileWriteProcI WriteProc,
        AIFileTellProcI TellProc,
        AIFileTellProcI FileSizeProc,
        AIFileSeekI SeekProc,
        AIFileFlushProcI FlushProc,
        long UserData
    ) {
        ReadProc(ReadProc);
        WriteProc(WriteProc);
        TellProc(TellProc);
        FileSizeProc(FileSizeProc);
        SeekProc(SeekProc);
        FlushProc(FlushProc);
        UserData(UserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIFile set(AIFile src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIFile} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIFile malloc() {
        return new AIFile(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIFile} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIFile calloc() {
        return new AIFile(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIFile} instance allocated with {@link BufferUtils}. */
    public static AIFile create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIFile(memAddress(container), container);
    }

    /** Returns a new {@code AIFile} instance for the specified memory address. */
    public static AIFile create(long address) {
        return new AIFile(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIFile createSafe(long address) {
        return address == NULL ? null : new AIFile(address, null);
    }

    /**
     * Returns a new {@link AIFile.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIFile.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIFile.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIFile.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIFile.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIFile.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIFile.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIFile.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIFile.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIFile mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIFile callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIFile mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIFile callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFile.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFile.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFile.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIFile.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIFile} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIFile malloc(MemoryStack stack) {
        return new AIFile(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIFile} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIFile calloc(MemoryStack stack) {
        return new AIFile(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIFile.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIFile.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIFile.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIFile.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ReadProc}. */
    public static AIFileReadProc nReadProc(long struct) { return AIFileReadProc.create(memGetAddress(struct + AIFile.READPROC)); }
    /** Unsafe version of {@link #WriteProc}. */
    public static AIFileWriteProc nWriteProc(long struct) { return AIFileWriteProc.create(memGetAddress(struct + AIFile.WRITEPROC)); }
    /** Unsafe version of {@link #TellProc}. */
    public static AIFileTellProc nTellProc(long struct) { return AIFileTellProc.create(memGetAddress(struct + AIFile.TELLPROC)); }
    /** Unsafe version of {@link #FileSizeProc}. */
    public static AIFileTellProc nFileSizeProc(long struct) { return AIFileTellProc.create(memGetAddress(struct + AIFile.FILESIZEPROC)); }
    /** Unsafe version of {@link #SeekProc}. */
    public static AIFileSeek nSeekProc(long struct) { return AIFileSeek.create(memGetAddress(struct + AIFile.SEEKPROC)); }
    /** Unsafe version of {@link #FlushProc}. */
    public static AIFileFlushProc nFlushProc(long struct) { return AIFileFlushProc.create(memGetAddress(struct + AIFile.FLUSHPROC)); }
    /** Unsafe version of {@link #UserData}. */
    public static long nUserData(long struct) { return memGetAddress(struct + AIFile.USERDATA); }

    /** Unsafe version of {@link #ReadProc(AIFileReadProcI) ReadProc}. */
    public static void nReadProc(long struct, AIFileReadProcI value) { memPutAddress(struct + AIFile.READPROC, value.address()); }
    /** Unsafe version of {@link #WriteProc(AIFileWriteProcI) WriteProc}. */
    public static void nWriteProc(long struct, AIFileWriteProcI value) { memPutAddress(struct + AIFile.WRITEPROC, value.address()); }
    /** Unsafe version of {@link #TellProc(AIFileTellProcI) TellProc}. */
    public static void nTellProc(long struct, AIFileTellProcI value) { memPutAddress(struct + AIFile.TELLPROC, value.address()); }
    /** Unsafe version of {@link #FileSizeProc(AIFileTellProcI) FileSizeProc}. */
    public static void nFileSizeProc(long struct, AIFileTellProcI value) { memPutAddress(struct + AIFile.FILESIZEPROC, value.address()); }
    /** Unsafe version of {@link #SeekProc(AIFileSeekI) SeekProc}. */
    public static void nSeekProc(long struct, AIFileSeekI value) { memPutAddress(struct + AIFile.SEEKPROC, value.address()); }
    /** Unsafe version of {@link #FlushProc(AIFileFlushProcI) FlushProc}. */
    public static void nFlushProc(long struct, AIFileFlushProcI value) { memPutAddress(struct + AIFile.FLUSHPROC, value.address()); }
    /** Unsafe version of {@link #UserData(long) UserData}. */
    public static void nUserData(long struct, long value) { memPutAddress(struct + AIFile.USERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AIFile.READPROC));
        check(memGetAddress(struct + AIFile.WRITEPROC));
        check(memGetAddress(struct + AIFile.TELLPROC));
        check(memGetAddress(struct + AIFile.FILESIZEPROC));
        check(memGetAddress(struct + AIFile.SEEKPROC));
        check(memGetAddress(struct + AIFile.FLUSHPROC));
    }

    // -----------------------------------

    /** An array of {@link AIFile} structs. */
    public static class Buffer extends StructBuffer<AIFile, Buffer> implements NativeResource {

        private static final AIFile ELEMENT_FACTORY = AIFile.create(-1L);

        /**
         * Creates a new {@code AIFile.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIFile#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected AIFile getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ReadProc} field. */
        @NativeType("aiFileReadProc")
        public AIFileReadProc ReadProc() { return AIFile.nReadProc(address()); }
        /** @return the value of the {@code WriteProc} field. */
        @NativeType("aiFileWriteProc")
        public AIFileWriteProc WriteProc() { return AIFile.nWriteProc(address()); }
        /** @return the value of the {@code TellProc} field. */
        @NativeType("aiFileTellProc")
        public AIFileTellProc TellProc() { return AIFile.nTellProc(address()); }
        /** @return the value of the {@code FileSizeProc} field. */
        @NativeType("aiFileTellProc")
        public AIFileTellProc FileSizeProc() { return AIFile.nFileSizeProc(address()); }
        /** @return the value of the {@code SeekProc} field. */
        @NativeType("aiFileSeek")
        public AIFileSeek SeekProc() { return AIFile.nSeekProc(address()); }
        /** @return the value of the {@code FlushProc} field. */
        @NativeType("aiFileFlushProc")
        public AIFileFlushProc FlushProc() { return AIFile.nFlushProc(address()); }
        /** @return the value of the {@code UserData} field. */
        @NativeType("aiUserData")
        public long UserData() { return AIFile.nUserData(address()); }

        /** Sets the specified value to the {@code ReadProc} field. */
        public AIFile.Buffer ReadProc(@NativeType("aiFileReadProc") AIFileReadProcI value) { AIFile.nReadProc(address(), value); return this; }
        /** Sets the specified value to the {@code WriteProc} field. */
        public AIFile.Buffer WriteProc(@NativeType("aiFileWriteProc") AIFileWriteProcI value) { AIFile.nWriteProc(address(), value); return this; }
        /** Sets the specified value to the {@code TellProc} field. */
        public AIFile.Buffer TellProc(@NativeType("aiFileTellProc") AIFileTellProcI value) { AIFile.nTellProc(address(), value); return this; }
        /** Sets the specified value to the {@code FileSizeProc} field. */
        public AIFile.Buffer FileSizeProc(@NativeType("aiFileTellProc") AIFileTellProcI value) { AIFile.nFileSizeProc(address(), value); return this; }
        /** Sets the specified value to the {@code SeekProc} field. */
        public AIFile.Buffer SeekProc(@NativeType("aiFileSeek") AIFileSeekI value) { AIFile.nSeekProc(address(), value); return this; }
        /** Sets the specified value to the {@code FlushProc} field. */
        public AIFile.Buffer FlushProc(@NativeType("aiFileFlushProc") AIFileFlushProcI value) { AIFile.nFlushProc(address(), value); return this; }
        /** Sets the specified value to the {@code UserData} field. */
        public AIFile.Buffer UserData(@NativeType("aiUserData") long value) { AIFile.nUserData(address(), value); return this; }

    }

}