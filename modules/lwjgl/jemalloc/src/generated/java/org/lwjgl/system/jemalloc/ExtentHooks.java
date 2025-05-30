/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct extent_hooks_t {
 *     {@link ExtentAllocI extent_alloc_t} alloc;
 *     {@link ExtentDallocI extent_dalloc_t} dalloc;
 *     {@link ExtentDestroyI extent_destroy_t} destroy;
 *     {@link ExtentCommitI extent_commit_t} commit;
 *     {@link ExtentDecommitI extent_decommit_t} decommit;
 *     {@link ExtentPurgeI extent_purge_t} purge_lazy;
 *     {@link ExtentPurgeI extent_purge_t} purge_forced;
 *     {@link ExtentSplitI extent_split_t} split;
 *     {@link ExtentMergeI extent_merge_t} merge;
 * }}</pre>
 */
@NativeType("struct extent_hooks_t")
public class ExtentHooks extends Struct<ExtentHooks> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ALLOC,
        DALLOC,
        DESTROY,
        COMMIT,
        DECOMMIT,
        PURGE_LAZY,
        PURGE_FORCED,
        SPLIT,
        MERGE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
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

        ALLOC = layout.offsetof(0);
        DALLOC = layout.offsetof(1);
        DESTROY = layout.offsetof(2);
        COMMIT = layout.offsetof(3);
        DECOMMIT = layout.offsetof(4);
        PURGE_LAZY = layout.offsetof(5);
        PURGE_FORCED = layout.offsetof(6);
        SPLIT = layout.offsetof(7);
        MERGE = layout.offsetof(8);
    }

    protected ExtentHooks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ExtentHooks create(long address, @Nullable ByteBuffer container) {
        return new ExtentHooks(address, container);
    }

    /**
     * Creates a {@code ExtentHooks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ExtentHooks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code alloc} field. */
    @NativeType("extent_alloc_t")
    public ExtentAlloc alloc() { return nalloc(address()); }
    /** @return the value of the {@code dalloc} field. */
    @NativeType("extent_dalloc_t")
    public @Nullable ExtentDalloc dalloc() { return ndalloc(address()); }
    /** @return the value of the {@code destroy} field. */
    @NativeType("extent_destroy_t")
    public @Nullable ExtentDestroy destroy() { return ndestroy(address()); }
    /** @return the value of the {@code commit} field. */
    @NativeType("extent_commit_t")
    public @Nullable ExtentCommit commit() { return ncommit(address()); }
    /** @return the value of the {@code decommit} field. */
    @NativeType("extent_decommit_t")
    public @Nullable ExtentDecommit decommit() { return ndecommit(address()); }
    /** @return the value of the {@code purge_lazy} field. */
    @NativeType("extent_purge_t")
    public @Nullable ExtentPurge purge_lazy() { return npurge_lazy(address()); }
    /** @return the value of the {@code purge_forced} field. */
    @NativeType("extent_purge_t")
    public @Nullable ExtentPurge purge_forced() { return npurge_forced(address()); }
    /** @return the value of the {@code split} field. */
    @NativeType("extent_split_t")
    public @Nullable ExtentSplit split() { return nsplit(address()); }
    /** @return the value of the {@code merge} field. */
    @NativeType("extent_merge_t")
    public @Nullable ExtentMerge merge() { return nmerge(address()); }

    /** Sets the specified value to the {@code alloc} field. */
    public ExtentHooks alloc(@NativeType("extent_alloc_t") ExtentAllocI value) { nalloc(address(), value); return this; }
    /** Sets the specified value to the {@code dalloc} field. */
    public ExtentHooks dalloc(@Nullable @NativeType("extent_dalloc_t") ExtentDallocI value) { ndalloc(address(), value); return this; }
    /** Sets the specified value to the {@code destroy} field. */
    public ExtentHooks destroy(@Nullable @NativeType("extent_destroy_t") ExtentDestroyI value) { ndestroy(address(), value); return this; }
    /** Sets the specified value to the {@code commit} field. */
    public ExtentHooks commit(@Nullable @NativeType("extent_commit_t") ExtentCommitI value) { ncommit(address(), value); return this; }
    /** Sets the specified value to the {@code decommit} field. */
    public ExtentHooks decommit(@Nullable @NativeType("extent_decommit_t") ExtentDecommitI value) { ndecommit(address(), value); return this; }
    /** Sets the specified value to the {@code purge_lazy} field. */
    public ExtentHooks purge_lazy(@Nullable @NativeType("extent_purge_t") ExtentPurgeI value) { npurge_lazy(address(), value); return this; }
    /** Sets the specified value to the {@code purge_forced} field. */
    public ExtentHooks purge_forced(@Nullable @NativeType("extent_purge_t") ExtentPurgeI value) { npurge_forced(address(), value); return this; }
    /** Sets the specified value to the {@code split} field. */
    public ExtentHooks split(@Nullable @NativeType("extent_split_t") ExtentSplitI value) { nsplit(address(), value); return this; }
    /** Sets the specified value to the {@code merge} field. */
    public ExtentHooks merge(@Nullable @NativeType("extent_merge_t") ExtentMergeI value) { nmerge(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ExtentHooks set(
        ExtentAllocI alloc,
        ExtentDallocI dalloc,
        ExtentDestroyI destroy,
        ExtentCommitI commit,
        ExtentDecommitI decommit,
        ExtentPurgeI purge_lazy,
        ExtentPurgeI purge_forced,
        ExtentSplitI split,
        ExtentMergeI merge
    ) {
        alloc(alloc);
        dalloc(dalloc);
        destroy(destroy);
        commit(commit);
        decommit(decommit);
        purge_lazy(purge_lazy);
        purge_forced(purge_forced);
        split(split);
        merge(merge);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ExtentHooks set(ExtentHooks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ExtentHooks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ExtentHooks malloc() {
        return new ExtentHooks(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ExtentHooks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ExtentHooks calloc() {
        return new ExtentHooks(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ExtentHooks} instance allocated with {@link BufferUtils}. */
    public static ExtentHooks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ExtentHooks(memAddress(container), container);
    }

    /** Returns a new {@code ExtentHooks} instance for the specified memory address. */
    public static ExtentHooks create(long address) {
        return new ExtentHooks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable ExtentHooks createSafe(long address) {
        return address == NULL ? null : new ExtentHooks(address, null);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ExtentHooks mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ExtentHooks callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ExtentHooks mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ExtentHooks callocStack(MemoryStack stack) { return calloc(stack); }

    /**
     * Returns a new {@code ExtentHooks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ExtentHooks malloc(MemoryStack stack) {
        return new ExtentHooks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ExtentHooks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ExtentHooks calloc(MemoryStack stack) {
        return new ExtentHooks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #alloc}. */
    public static ExtentAlloc nalloc(long struct) { return ExtentAlloc.create(memGetAddress(struct + ExtentHooks.ALLOC)); }
    /** Unsafe version of {@link #dalloc}. */
    public static @Nullable ExtentDalloc ndalloc(long struct) { return ExtentDalloc.createSafe(memGetAddress(struct + ExtentHooks.DALLOC)); }
    /** Unsafe version of {@link #destroy}. */
    public static @Nullable ExtentDestroy ndestroy(long struct) { return ExtentDestroy.createSafe(memGetAddress(struct + ExtentHooks.DESTROY)); }
    /** Unsafe version of {@link #commit}. */
    public static @Nullable ExtentCommit ncommit(long struct) { return ExtentCommit.createSafe(memGetAddress(struct + ExtentHooks.COMMIT)); }
    /** Unsafe version of {@link #decommit}. */
    public static @Nullable ExtentDecommit ndecommit(long struct) { return ExtentDecommit.createSafe(memGetAddress(struct + ExtentHooks.DECOMMIT)); }
    /** Unsafe version of {@link #purge_lazy}. */
    public static @Nullable ExtentPurge npurge_lazy(long struct) { return ExtentPurge.createSafe(memGetAddress(struct + ExtentHooks.PURGE_LAZY)); }
    /** Unsafe version of {@link #purge_forced}. */
    public static @Nullable ExtentPurge npurge_forced(long struct) { return ExtentPurge.createSafe(memGetAddress(struct + ExtentHooks.PURGE_FORCED)); }
    /** Unsafe version of {@link #split}. */
    public static @Nullable ExtentSplit nsplit(long struct) { return ExtentSplit.createSafe(memGetAddress(struct + ExtentHooks.SPLIT)); }
    /** Unsafe version of {@link #merge}. */
    public static @Nullable ExtentMerge nmerge(long struct) { return ExtentMerge.createSafe(memGetAddress(struct + ExtentHooks.MERGE)); }

    /** Unsafe version of {@link #alloc(ExtentAllocI) alloc}. */
    public static void nalloc(long struct, ExtentAllocI value) { memPutAddress(struct + ExtentHooks.ALLOC, value.address()); }
    /** Unsafe version of {@link #dalloc(ExtentDallocI) dalloc}. */
    public static void ndalloc(long struct, @Nullable ExtentDallocI value) { memPutAddress(struct + ExtentHooks.DALLOC, memAddressSafe(value)); }
    /** Unsafe version of {@link #destroy(ExtentDestroyI) destroy}. */
    public static void ndestroy(long struct, @Nullable ExtentDestroyI value) { memPutAddress(struct + ExtentHooks.DESTROY, memAddressSafe(value)); }
    /** Unsafe version of {@link #commit(ExtentCommitI) commit}. */
    public static void ncommit(long struct, @Nullable ExtentCommitI value) { memPutAddress(struct + ExtentHooks.COMMIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #decommit(ExtentDecommitI) decommit}. */
    public static void ndecommit(long struct, @Nullable ExtentDecommitI value) { memPutAddress(struct + ExtentHooks.DECOMMIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #purge_lazy(ExtentPurgeI) purge_lazy}. */
    public static void npurge_lazy(long struct, @Nullable ExtentPurgeI value) { memPutAddress(struct + ExtentHooks.PURGE_LAZY, memAddressSafe(value)); }
    /** Unsafe version of {@link #purge_forced(ExtentPurgeI) purge_forced}. */
    public static void npurge_forced(long struct, @Nullable ExtentPurgeI value) { memPutAddress(struct + ExtentHooks.PURGE_FORCED, memAddressSafe(value)); }
    /** Unsafe version of {@link #split(ExtentSplitI) split}. */
    public static void nsplit(long struct, @Nullable ExtentSplitI value) { memPutAddress(struct + ExtentHooks.SPLIT, memAddressSafe(value)); }
    /** Unsafe version of {@link #merge(ExtentMergeI) merge}. */
    public static void nmerge(long struct, @Nullable ExtentMergeI value) { memPutAddress(struct + ExtentHooks.MERGE, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ExtentHooks.ALLOC));
    }

}