/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package libdivide.templates

import org.lwjgl.generator.*
import libdivide.*

val libdivide = "LibDivide".nativeClass(Module.LIBDIVIDE, prefixConstant = "LIBDIVIDE_", prefixMethod = "libdivide_") {
    nativeImport("libdivide.h")
    javaImport("static org.lwjgl.system.MathUtil.*")
    javaImport("static org.lwjgl.system.MemoryUtil.*")
    documentation =
        """
        Native bindings to ${url("https://libdivide.com/", "libdivide")}.

        libdivide allows you to replace expensive integer divides with comparatively cheap multiplication and bitshifts. Compilers usually do this, but
        only when the divisor is known at compile time. libdivide allows you to take advantage of it at runtime. The result is that integer division can become
        faster - a lot faster.

        <b>LWJGL</b>: This is a hybrid implementation. Divider recovery methods use standard JNI bindings. All {@code *_gen}, {@code *_do} &amp;
        {@code *_get_algorithm} functions have been ported to pure Java. This eliminates the JNI overhead and enables the JVM to inline and further optimize
        these methods.
        """

    IntConstant(
        "Library version.",

        "VERSION_MAJOR".."5",
        "VERSION_MINOR".."1"
    )

    EnumConstant(
        "",

        "16_SHIFT_MASK".enum(0x1F),
        "32_SHIFT_MASK".enum(0x1F),
        "64_SHIFT_MASK".enum(0x3F),
        "ADD_MARKER".enum(0x40),
        "NEGATIVE_DIVISOR".enum(0x80)
    )

    NativeName("libdivide_s16_gen")..internal..libdivide_s16_t("s16_gen_ref", "", int16_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_s16_t")
    public static LibDivideS16 libdivide_s16_gen(@NativeType("int16_t") short denom, @NativeType("struct libdivide_s16_t") LibDivideS16 __result) {
        if (denom == 0) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        int magic, more;

        int absD          = denom < 0 ? -denom : denom;
        int floor_log_2_d = 31 - Integer.numberOfLeadingZeros(absD);

        if ((absD & (absD - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d | (denom < 0 ? LIBDIVIDE_NEGATIVE_DIVISOR : 0);
        } else {
            int l = 1 << (15 + floor_log_2_d);

            magic = l / absD;
            int rem = l % absD;

            if (absD - rem < 1 << floor_log_2_d) {
                more = floor_log_2_d - 1;
            } else {
                more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
                magic <<= 1;
            }

            magic++;
            if (denom < 0) {
                more |= LIBDIVIDE_NEGATIVE_DIVISOR;
                magic = -magic;
            }
        }

        __result.magic((short)magic);
        __result.more((byte)more);
        return __result;
    }""")

    NativeName("libdivide_u16_gen")..internal..libdivide_u16_t("u16_gen_ref", "", uint16_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_u16_t")
    public static LibDivideU16 libdivide_u16_gen(@NativeType("uint16_t") short denom, @NativeType("struct libdivide_u16_t") LibDivideU16 __result) {
        if (denom == 0) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        int d = Short.toUnsignedInt(denom);

        int magic, more;

        int floor_log_2_d = 31 - Integer.numberOfLeadingZeros(d);

        if ((d & (d - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d;
        } else {
            int l = 1 << (16 + floor_log_2_d);

            magic = Integer.divideUnsigned(l, d);
            int rem = l - magic * d;

            if (d - rem < 1 << floor_log_2_d) {
                more = floor_log_2_d;
            } else {
                more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
                magic <<= 1;
            }

            magic++;
        }

        __result.magic((short)magic);
        __result.more((byte)more);
        return __result;
    }""")

    
    NativeName("libdivide_s32_gen")..internal..libdivide_s32_t("s32_gen_ref", "", int32_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_s32_t")
    public static LibDivideS32 libdivide_s32_gen(@NativeType("int32_t") int denom, @NativeType("struct libdivide_s32_t") LibDivideS32 __result) {
        if (denom == 0) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        int magic, more;

        int absD          = denom < 0 ? -denom : denom;
        int floor_log_2_d = 31 - Integer.numberOfLeadingZeros(absD);

        if ((absD & (absD - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d | (denom < 0 ? LIBDIVIDE_NEGATIVE_DIVISOR : 0);
        } else {
            long l = 1L << (31 + floor_log_2_d);

            magic = (int)(l / absD);
            int rem = (int)(l % absD);

            if (absD - rem < 1 << floor_log_2_d) {
                more = floor_log_2_d - 1;
            } else {
                more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
                magic <<= 1;
            }

            magic++;
            if (denom < 0) {
                more |= LIBDIVIDE_NEGATIVE_DIVISOR;
                magic = -magic;
            }
        }

        __result.magic(magic);
        __result.more((byte)more);
        return __result;
    }""")

    NativeName("libdivide_u32_gen")..internal..libdivide_u32_t("u32_gen_ref", "", uint32_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_u32_t")
    public static LibDivideU32 libdivide_u32_gen(@NativeType("uint32_t") int denom, @NativeType("struct libdivide_u32_t") LibDivideU32 __result) {
        if (denom == 0) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        int magic, more;

        int floor_log_2_d = 31 - Integer.numberOfLeadingZeros(denom);

        if ((denom & (denom - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d;
        } else {
            long l = 1L << (32 + floor_log_2_d);

            magic = (int)mathDivideUnsigned(l, Integer.toUnsignedLong(denom));
            int rem = (int)(l - magic * Integer.toUnsignedLong(denom));

            if (Integer.compareUnsigned(denom - rem, 1 << floor_log_2_d) < 0) {
                more = floor_log_2_d;
            } else {
                more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
                magic <<= 1;
            }

            magic++;
        }

        __result.magic(magic);
        __result.more((byte)more);
        return __result;
    }""")

    NativeName("libdivide_s64_gen")..internal..libdivide_s64_t("s64_gen_ref", "", int64_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_s64_t")
    public static LibDivideS64 libdivide_s64_gen(@NativeType("int64_t") long denom, @NativeType("struct libdivide_s64_t") LibDivideS64 __result) {
        if (denom == 0L) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        long magic;
        int  more;

        long absD          = denom < 0L ? -denom : denom;
        int  floor_log_2_d = 63 - Long.numberOfLeadingZeros(absD);

        if ((absD & (absD - 1)) == 0) {
            magic = 0L;
            more = floor_log_2_d | (denom < 0L ? LIBDIVIDE_NEGATIVE_DIVISOR : 0);
        } else {
            magic = libdivide_128_div_64_to_64(1L << (floor_log_2_d - 1), 0L, absD, __result.address());
            long rem = __result.magic();

            if (absD - rem < 1L << floor_log_2_d) {
                more = floor_log_2_d - 1;
            } else {
                more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
                magic <<= 1;
            }

            magic++;
            if (denom < 0) {
                more |= LIBDIVIDE_NEGATIVE_DIVISOR;
                magic = -magic;
            }
        }

        __result.magic(magic);
        __result.more((byte)more);
        return __result;
    }""")

    NativeName("libdivide_u64_gen")..internal..libdivide_u64_t("u64_gen_ref", "", uint64_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_u64_t")
    public static LibDivideU64 libdivide_u64_gen(@NativeType("uint64_t") long denom, @NativeType("struct libdivide_u64_t") LibDivideU64 __result) {
        if (denom == 0L) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        long magic;
        int  more;

        int floor_log_2_d = 63 - Long.numberOfLeadingZeros(denom);

        if ((denom & (denom - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d;
        } else {
            magic = libdivide_128_div_64_to_64(1L << floor_log_2_d, 0L, denom, __result.address());
            long rem = __result.magic();

            if (Long.compareUnsigned(denom - rem, 1L << floor_log_2_d) < 0) {
                more = floor_log_2_d;
            } else {
                more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
                magic <<= 1;
            }

            magic++;
        }

        __result.magic(magic);
        __result.more((byte)more);
        return __result;
    }""")

    NativeName("libdivide_s16_branchfree_gen")..internal..libdivide_s16_branchfree_t("s16_branchfree_gen_ref", "", int16_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_s16_branchfree_t")
    public static LibDivideS16BranchFree libdivide_s16_branchfree_gen(@NativeType("int16_t") short denom, @NativeType("struct libdivide_s16_branchfree_t") LibDivideS16BranchFree __result) {
        if (denom == 0) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        int magic, more;

        int absD          = denom < 0 ? -denom : denom;
        int floor_log_2_d = 31 - Integer.numberOfLeadingZeros(absD);

        if ((absD & (absD - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d | (denom < 0 ? LIBDIVIDE_NEGATIVE_DIVISOR : 0);
        } else {
            int l = 1 << (15 + floor_log_2_d);

            magic = l / absD;
            int rem = l % absD;

            magic = (magic << 1) + 1;
            if (absD < rem << 1) {
                magic++;
            }

            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
            if (denom < 0) {
                more |= LIBDIVIDE_NEGATIVE_DIVISOR;
            }
        }

        __result.magic((short)magic);
        __result.more((byte)more);
        return __result;
    }""")

    NativeName("libdivide_u16_branchfree_gen")..internal..libdivide_u16_branchfree_t("u16_branchfree_gen_ref", "", uint16_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_u16_branchfree_t")
    public static LibDivideU16BranchFree libdivide_u16_branchfree_gen(@NativeType("uint16_t") short denom, @NativeType("struct libdivide_u16_branchfree_t") LibDivideU16BranchFree __result) {
        if (denom == 0) {
            throw new IllegalArgumentException("divider must be != 0");
        }
        if (denom == 1) {
            throw new IllegalArgumentException("branchfree divider must be != 1");
        }

        int d = Short.toUnsignedInt(denom);

        int magic, more;

        int floor_log_2_d = 31 - Integer.numberOfLeadingZeros(d);

        if ((d & (d - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d - 1;
        } else {
            int l = 1 << (16 + floor_log_2_d);

            magic = Integer.divideUnsigned(l, d);
            int rem = l - magic * d;

            magic = (magic << 1) + 1;
            if (d < rem << 1) {
                magic++;
            }

            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
        }

        __result.magic((short)magic);
        __result.more((byte)(more & LIBDIVIDE_16_SHIFT_MASK));
        return __result;
    }""")

    NativeName("libdivide_s32_branchfree_gen")..internal..libdivide_s32_branchfree_t("s32_branchfree_gen_ref", "", int32_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_s32_branchfree_t")
    public static LibDivideS32BranchFree libdivide_s32_branchfree_gen(@NativeType("int32_t") int denom, @NativeType("struct libdivide_s32_branchfree_t") LibDivideS32BranchFree __result) {
        if (denom == 0) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        int magic, more;

        int absD          = denom < 0 ? -denom : denom;
        int floor_log_2_d = 31 - Integer.numberOfLeadingZeros(absD);

        if ((absD & (absD - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d | (denom < 0 ? LIBDIVIDE_NEGATIVE_DIVISOR : 0);
        } else {
            long l = 1L << (31 + floor_log_2_d);

            magic = (int)(l / absD);
            int rem = (int)(l % absD);

            magic = (magic << 1) + 1;
            if (Integer.compareUnsigned(absD, rem << 1) < 0) {
                magic++;
            }

            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
            if (denom < 0) {
                more |= LIBDIVIDE_NEGATIVE_DIVISOR;
            }
        }

        __result.magic(magic);
        __result.more((byte)more);
        return __result;
    }""")

    NativeName("libdivide_u32_branchfree_gen")..internal..libdivide_u32_branchfree_t("u32_branchfree_gen_ref", "", uint32_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_u32_branchfree_t")
    public static LibDivideU32BranchFree libdivide_u32_branchfree_gen(@NativeType("uint32_t") int denom, @NativeType("struct libdivide_u32_branchfree_t") LibDivideU32BranchFree __result) {
        if (denom == 0) {
            throw new IllegalArgumentException("divider must be != 0");
        }
        if (denom == 1) {
            throw new IllegalArgumentException("branchfree divider must be != 1");
        }

        int magic, more;

        int floor_log_2_d = 31 - Integer.numberOfLeadingZeros(denom);

        if ((denom & (denom - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d - 1;
        } else {
            long l = 1L << (32 + floor_log_2_d);

            magic = (int)mathDivideUnsigned(l, Integer.toUnsignedLong(denom));
            int rem = (int)(l - magic * Integer.toUnsignedLong(denom));

            magic = (magic << 1) + 1;
            if (Integer.compareUnsigned(denom, rem << 1) < 0 || Integer.compareUnsigned(rem << 1, rem) < 0) {
                magic++;
            }

            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
        }

        __result.magic(magic);
        __result.more((byte)(more & LIBDIVIDE_32_SHIFT_MASK));
        return __result;
    }""")

    NativeName("libdivide_s64_branchfree_gen")..internal..libdivide_s64_branchfree_t("s64_branchfree_gen_ref", "", int64_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_s64_branchfree_t")
    public static LibDivideS64BranchFree libdivide_s64_branchfree_gen(@NativeType("int64_t") long denom, @NativeType("struct libdivide_s64_branchfree_t") LibDivideS64BranchFree __result) {
        if (denom == 0L) {
            throw new IllegalArgumentException("divider must be != 0");
        }

        long magic;
        int  more;

        long absD          = denom < 0L ? -denom : denom;
        int  floor_log_2_d = 63 - Long.numberOfLeadingZeros(absD);

        if ((absD & (absD - 1)) == 0) {
            magic = 0L;
            more = floor_log_2_d | (denom < 0L ? LIBDIVIDE_NEGATIVE_DIVISOR : 0);
        } else {
            magic = (libdivide_128_div_64_to_64(1L << (floor_log_2_d - 1), 0L, absD, __result.address()) << 1) + 1;
            long rem = __result.magic();
            if (Long.compareUnsigned(absD, rem << 1) < 0) {
                magic++;
            }

            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
            if (denom < 0) {
                more |= LIBDIVIDE_NEGATIVE_DIVISOR;
            }
        }

        __result.magic(magic);
        __result.more((byte)more);
        return __result;
    }
""")

    NativeName("libdivide_u64_branchfree_gen")..internal..libdivide_u64_branchfree_t("u64_branchfree_gen_ref", "", uint64_t("denom", ""))
    customMethod("""
    @NativeType("struct libdivide_u64_branchfree_t")
    public static LibDivideU64BranchFree libdivide_u64_branchfree_gen(@NativeType("uint64_t") long denom, @NativeType("struct libdivide_u64_branchfree_t") LibDivideU64BranchFree __result) {
        if (denom == 0L) {
            throw new IllegalArgumentException("divider must be != 0");
        }
        if (denom == 1L) {
            throw new IllegalArgumentException("branchfree divider must be != 1");
        }

        long magic;
        int  more;

        int floor_log_2_d = 63 - Long.numberOfLeadingZeros(denom);

        if ((denom & (denom - 1)) == 0) {
            magic = 0;
            more = floor_log_2_d - 1;
        } else {
            magic = (libdivide_128_div_64_to_64(1L << floor_log_2_d, 0L, denom, __result.address()) << 1) + 1;
            long rem = __result.magic();
            if (Long.compareUnsigned(denom, rem << 1) < 0 || Long.compareUnsigned(rem << 1, rem) < 0) {
                magic++;
            }

            more = floor_log_2_d | LIBDIVIDE_ADD_MARKER;
        }

        __result.magic(magic);
        __result.more((byte)(more & LIBDIVIDE_64_SHIFT_MASK));
        return __result;
    }""")

    NativeName("libdivide_s16_do")..internal..int16_t("s16_do_ref", "", int16_t("numer", ""), libdivide_s16_t.const.p("denom", ""))
    customMethod(
        """
    public static short libdivide_s16_do(@NativeType("int16_t") short numer, @NativeType("struct libdivide_s16_t const *") LibDivideS16 denom) { return libdivide_s16_do(numer, denom.magic(), denom.more()); }
    public static short libdivide_s16_do(@NativeType("int16_t") short numer, @NativeType("int16_t") short magic, @NativeType("uint8_t") byte more) {
        int shift = more & LIBDIVIDE_16_SHIFT_MASK;

        if (magic == 0) {
            int sign = more >> 7;
            int mask = (1 << shift) - 1;
            int q    = numer + ((numer >> 15) & mask);
            q >>= shift;
            q = (q ^ sign) - sign;
            return (short)q;
        } else {
            int uq = libdivide_mullhi_s16(magic, numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                int sign = more >> 7;
                uq += (numer ^ sign) - sign;
            }
            int q = uq;
            q >>= shift;
            q += (q < 0 ? 1 : 0);
            return (short)q;
        }
    }""")

    NativeName("libdivide_u16_do")..internal..uint16_t("u16_do_ref", "", uint16_t("numer", ""), libdivide_u16_t.const.p("denom", ""))
    customMethod(
        """
    public static short libdivide_u16_do(@NativeType("uint16_t") short numer, @NativeType("struct libdivide_u16_t const *") LibDivideU16 denom) { return libdivide_u16_do(numer, denom.magic(), denom.more()); }
    public static short libdivide_u16_do(@NativeType("uint16_t") short numer, @NativeType("uint16_t") short magic, @NativeType("uint8_t") byte more) {
        int n = Short.toUnsignedInt(numer);

        if (magic == 0) {
            return (short)(n >>> more);
        } else {
            int q = libdivide_mullhi_u16(magic, numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                int t = ((n - q) >>> 1) + q;
                return (short)(t >>> (more & LIBDIVIDE_16_SHIFT_MASK));
            } else {
                return (short)(q >>> more);
            }
        }
    }""")

    NativeName("libdivide_s32_do")..internal..int32_t("s32_do_ref", "", int32_t("numer", ""), libdivide_s32_t.const.p("denom", ""))
    customMethod(
        """
    public static int libdivide_s32_do(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_t const *") LibDivideS32 denom) { return libdivide_s32_do(numer, denom.magic(), denom.more()); }
    public static int libdivide_s32_do(@NativeType("int32_t") int numer, @NativeType("int32_t") int magic, @NativeType("uint8_t") byte more) {
        int shift = more & LIBDIVIDE_32_SHIFT_MASK;

        if (magic == 0) {
            int sign = more >> 7;
            int mask = (1 << shift) - 1;
            int q    = numer + ((numer >> 31) & mask);
            q >>= shift;
            q = (q ^ sign) - sign;
            return q;
        } else {
            int uq = libdivide_mullhi_s32(magic, numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                int sign = more >> 7;
                uq += (numer ^ sign) - sign;
            }
            int q = uq;
            q >>= shift;
            q += (q < 0 ? 1 : 0);
            return q;
        }
    }""")

    NativeName("libdivide_u32_do")..internal..uint32_t("u32_do_ref", "", uint32_t("numer", ""), libdivide_u32_t.const.p("denom", ""))
    customMethod(
        """
    public static int libdivide_u32_do(@NativeType("uint32_t") int numer, @NativeType("struct libdivide_u32_t const *") LibDivideU32 denom) { return libdivide_u32_do(numer, denom.magic(), denom.more()); }
    public static int libdivide_u32_do(@NativeType("uint32_t") int numer, @NativeType("uint32_t") int magic, @NativeType("uint8_t") byte more) {
        if (magic == 0) {
            return numer >>> more;
        } else {
            int q = libdivide_mullhi_u32(magic, numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                int t = ((numer - q) >>> 1) + q;
                return t >>> (more & LIBDIVIDE_32_SHIFT_MASK);
            } else {
                return q >>> more;
            }
        }
    }""")

    NativeName("libdivide_s64_do")..internal..int64_t("s64_do_ref", "", int64_t("numer", ""), libdivide_s64_t.const.p("denom", ""))
    customMethod(
        """
    public static long libdivide_s64_do(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_t const *") LibDivideS64 denom) { return libdivide_s64_do(numer, denom.magic(), denom.more()); }
    public static long libdivide_s64_do(@NativeType("int64_t") long numer, @NativeType("int64_t") long magic, @NativeType("uint8_t") byte more) {
        int shift = more & LIBDIVIDE_64_SHIFT_MASK;

        if (magic == 0L) {
            long mask = (1L << shift) - 1L;
            long q    = numer + ((numer >> 63) & mask);
            q >>= shift;
            long sign = more >> 7;
            q = (q ^ sign) - sign;
            return q;
        } else {
            long uq = mathMultiplyHighS64(magic, numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                long sign = more >> 7;
                uq += (numer ^ sign) - sign;
            }
            long q = uq;
            q >>= shift;
            q += (q < 0 ? 1 : 0);
            return q;
        }
    }""")

    NativeName("libdivide_u64_do")..internal..uint64_t("u64_do_ref", "", uint64_t("numer", ""), libdivide_u64_t.const.p("denom", ""))
    customMethod(
        """
    public static long libdivide_u64_do(@NativeType("uint64_t") long numer, @NativeType("struct libdivide_u64_t const *") LibDivideU64 denom) { return libdivide_u64_do(numer, denom.magic(), denom.more()); }
    public static long libdivide_u64_do(@NativeType("uint64_t") long numer, @NativeType("uint64_t") long magic, @NativeType("uint8_t") byte more) {
        if (magic == 0L) {
            return numer >>> more;
        } else {
            long q = mathMultiplyHighU64(magic, numer);
            if ((more & LIBDIVIDE_ADD_MARKER) != 0) {
                long t = ((numer - q) >>> 1) + q;
                return t >>> (more & LIBDIVIDE_64_SHIFT_MASK);
            } else {
                return q >>> more;
            }
        }
    }""")

    NativeName("libdivide_s16_branchfree_do")..internal..int16_t("s16_branchfree_do_ref", "", int16_t("numer", ""), libdivide_s16_branchfree_t.const.p("denom", ""))
    customMethod(
        """
    public static short libdivide_s16_branchfree_do(@NativeType("int16_t") short numer, @NativeType("struct libdivide_s16_branchfree_t const *") LibDivideS16BranchFree denom) { return libdivide_s16_branchfree_do(numer, denom.magic(), denom.more()); }
    public static short libdivide_s16_branchfree_do(@NativeType("int16_t") short numer, @NativeType("int16_t") short magic, @NativeType("uint8_t") byte more) {
        int shift = more & LIBDIVIDE_16_SHIFT_MASK;
        int sign  = more >> 7;
        int    q  = libdivide_mullhi_s16(magic, numer);
        q += numer;

        int q_sign = q >> 15;
        q += q_sign & ((1 << shift) - (magic == 0 ? 1 : 0));

        q >>= shift;

        q = (q ^ sign) - sign;

        return (short)q;
    }""")

    NativeName("libdivide_u16_branchfree_do")..internal..uint16_t("u16_branchfree_do_ref", "", uint16_t("numer", ""), libdivide_u16_branchfree_t.const.p("denom", ""))
    customMethod(
        """
    public static short libdivide_u16_branchfree_do(@NativeType("uint16_t") short numer, @NativeType("struct libdivide_u16_branchfree_t const *") LibDivideU16BranchFree denom) { return libdivide_u16_branchfree_do(numer, denom.magic(), denom.more()); }
    public static short libdivide_u16_branchfree_do(@NativeType("uint16_t") short numer, @NativeType("uint16_t") short magic, @NativeType("uint8_t") byte more) {
        int q = libdivide_mullhi_u16(magic, numer);
        int t = ((Short.toUnsignedInt(numer) - q) >>> 1) + q;
        return (short)(t >>> more);
    }""")
    
    NativeName("libdivide_s32_branchfree_do")..internal..int32_t("s32_branchfree_do_ref", "", int32_t("numer", ""), libdivide_s32_branchfree_t.const.p("denom", ""))
    customMethod(
        """
    public static int libdivide_s32_branchfree_do(@NativeType("int32_t") int numer, @NativeType("struct libdivide_s32_branchfree_t const *") LibDivideS32BranchFree denom) { return libdivide_s32_branchfree_do(numer, denom.magic(), denom.more()); }
    public static int libdivide_s32_branchfree_do(@NativeType("int32_t") int numer, @NativeType("int32_t") int magic, @NativeType("uint8_t") byte more) {
        int shift = more & LIBDIVIDE_32_SHIFT_MASK;
        int sign  = more >> 7;
        int q     = libdivide_mullhi_s32(magic, numer);
        q += numer;

        int q_sign = q >> 31;
        q += q_sign & ((1 << shift) - (magic == 0 ? 1 : 0));

        q >>= shift;

        q = (q ^ sign) - sign;

        return q;
    }""")

    NativeName("libdivide_u32_branchfree_do")..internal..uint32_t("u32_branchfree_do_ref", "", uint32_t("numer", ""), libdivide_u32_branchfree_t.const.p("denom", ""))
    customMethod(
        """
    public static int libdivide_u32_branchfree_do(@NativeType("uint32_t") int numer, @NativeType("struct libdivide_u32_branchfree_t const *") LibDivideU32BranchFree denom) { return libdivide_u32_branchfree_do(numer, denom.magic(), denom.more()); }
    public static int libdivide_u32_branchfree_do(@NativeType("uint32_t") int numer, @NativeType("uint32_t") int magic, @NativeType("uint8_t") byte more) {
        int q = libdivide_mullhi_u32(magic, numer);
        int t = ((numer - q) >>> 1) + q;
        return t >>> more;
    }""")

    NativeName("libdivide_s64_branchfree_do")..internal..int64_t("s64_branchfree_do_ref", "", int64_t("numer", ""), libdivide_s64_branchfree_t.const.p("denom", ""))
    customMethod(
        """
    public static long libdivide_s64_branchfree_do(@NativeType("int64_t") long numer, @NativeType("struct libdivide_s64_branchfree_t const *") LibDivideS64BranchFree denom) { return libdivide_s64_branchfree_do(numer, denom.magic(), denom.more()); }
    public static long libdivide_s64_branchfree_do(@NativeType("int64_t") long numer, @NativeType("int64_t") long magic, @NativeType("uint8_t") byte more) {
        int  shift = more & LIBDIVIDE_64_SHIFT_MASK;
        long sign  = more >> 7;
        long q     = mathMultiplyHighS64(magic, numer);
        q += numer;

        long q_sign = q >> 63;
        q += q_sign & ((1L << shift) - (magic == 0 ? 1 : 0));

        q >>= shift;

        q = (q ^ sign) - sign;
        return q;
    }""")

    NativeName("libdivide_u64_branchfree_do")..internal..uint64_t("u64_branchfree_do_ref", "", uint64_t("numer", ""), libdivide_u64_branchfree_t.const.p("denom", ""))
    customMethod(
        """
    public static long libdivide_u64_branchfree_do(@NativeType("uint64_t") long numer, @NativeType("struct libdivide_u64_branchfree_t const *") LibDivideU64BranchFree denom) { return libdivide_u64_branchfree_do(numer, denom.magic(), denom.more()); }
    public static long libdivide_u64_branchfree_do(@NativeType("uint64_t") long numer, @NativeType("uint64_t") long magic, @NativeType("uint8_t") byte more) {
        long q = mathMultiplyHighU64(magic, numer);
        long t = ((numer - q) >>> 1) + q;
        return t >>> more;
    }""")

    int16_t("s16_recover", "", libdivide_s16_t.const.p("denom", ""))
    uint16_t("u16_recover", "", libdivide_u16_t.const.p("denom", ""))
    int32_t("s32_recover", "", libdivide_s32_t.const.p("denom", ""))
    uint32_t("u32_recover", "", libdivide_u32_t.const.p("denom", ""))
    int64_t("s64_recover", "", libdivide_s64_t.const.p("denom", ""))
    uint64_t("u64_recover", "", libdivide_u64_t.const.p("denom", ""))

    int16_t("s16_branchfree_recover", "", libdivide_s16_branchfree_t.const.p("denom", ""))
    uint16_t("u16_branchfree_recover", "", libdivide_u16_branchfree_t.const.p("denom", ""))
    int32_t("s32_branchfree_recover", "", libdivide_s32_branchfree_t.const.p("denom", ""))
    uint32_t("u32_branchfree_recover", "", libdivide_u32_branchfree_t.const.p("denom", ""))
    int64_t("s64_branchfree_recover", "", libdivide_s64_branchfree_t.const.p("denom", ""))
    uint64_t("u64_branchfree_recover", "", libdivide_u64_branchfree_t.const.p("denom", ""))

    // Helper methods

    customMethod("""
    private static long libdivide_128_div_64_to_64(long u1, long u0, long v, long remainder) {
        long b = (1L << 32);

        long un64, un10;

        int s = Long.numberOfLeadingZeros(v);
        if (s > 0) {
            v <<= s;
            un64 = (u1 << s) | ((u0 >>> (64 - s)) & (-s >> 31));
            un10 = u0 << s;
        } else {
            un64 = u1 | u0;
            un10 = u0;
        }

        long vn1 = v >>> 32;
        long vn0 = v & 0xFFFF_FFFFL;

        long un1 = un10 >>> 32;
        long un0 = un10 & 0xFFFF_FFFFL;

        long q1   = mathDivideUnsigned(un64, vn1);
        long rhat = un64 - q1 * vn1;

        while (Long.compareUnsigned(b, q1) < 0 || Long.compareUnsigned(b * rhat + un1, q1 * vn0) <= 0) {
            q1--;
            rhat += vn1;
            if (rhat >= b) {
                break;
            }
        }

        long un21 = un64 * b + un1 - q1 * v;

        long q0 = mathDivideUnsigned(un21, vn1);
        rhat = un21 - q0 * vn1;

        while (Long.compareUnsigned(b, q0) < 0 || Long.compareUnsigned(b * rhat + un0, q0 * vn0) <= 0) {
            q0--;
            rhat += vn1;
            if (rhat >= b) {
                break;
            }
        }

        memPutLong(remainder, (un21 * b + un0 - q0 * v) >>> s);
        return q1 * b + q0;
    }

    private static int libdivide_mullhi_s16(short x, short y) {
        return (x * y) >> 16;
    }

    private static int libdivide_mullhi_u16(short x, short y) {
        return ((x & 0xFFFF) * (y & 0xFFFF)) >>> 16;
    }

    private static int libdivide_mullhi_s32(int x, int y) {
        return (int)(((long)x * y) >> 32);
    }

    private static int libdivide_mullhi_u32(int x, int y) {
        return (int)(((x & 0xFFFF_FFFFL) * (y & 0xFFFF_FFFFL)) >>> 32);
    }""")

}