package W;

import n.C0398r;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2558b = D.c(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2559c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2560d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2561e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2562f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2563g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2564a;

    static {
        D.c(4282664004L);
        D.c(4287137928L);
        D.c(4291611852L);
        D.c(4294967295L);
        f2559c = D.c(4294901760L);
        D.c(4278255360L);
        f2560d = D.c(4278190335L);
        D.c(4294967040L);
        D.c(4278255615L);
        D.c(4294902015L);
        f2561e = D.b(0);
        f2562f = D.a(0.0f, 0.0f, 0.0f, 0.0f, X.e.f2612s);
    }

    public /* synthetic */ r(long j3) {
        this.f2564a = j3;
    }

    public static final long a(long j3, X.c cVar) {
        X.h hVar;
        X.c f3 = f(j3);
        int i3 = f3.f2593c;
        int i4 = cVar.f2593c;
        if ((i3 | i4) < 0) {
            hVar = X.k.e(f3, cVar, 0);
        } else {
            C0398r c0398r = X.i.f2622a;
            int i5 = i3 | (i4 << 6);
            Object f4 = c0398r.f(i5);
            if (f4 == null) {
                f4 = X.k.e(f3, cVar, 0);
                c0398r.i(i5, f4);
            }
            hVar = (X.h) f4;
        }
        return hVar.a(j3);
    }

    public static long b(long j3, float f3) {
        return D.a(h(j3), g(j3), e(j3), f3, f(j3));
    }

    public static final boolean c(long j3, long j4) {
        return j3 == j4;
    }

    public static final float d(long j3) {
        float Q2;
        float f3;
        if ((63 & j3) == 0) {
            Q2 = (float) Z.b.Q((j3 >>> 56) & 255);
            f3 = 255.0f;
        } else {
            Q2 = (float) Z.b.Q((j3 >>> 6) & 1023);
            f3 = 1023.0f;
        }
        return Q2 / f3;
    }

    public static final float e(long j3) {
        int i3;
        int i4;
        int i5;
        if ((63 & j3) == 0) {
            return ((float) Z.b.Q((j3 >>> 32) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 16) & 65535);
        int i6 = 32768 & s3;
        int i7 = ((65535 & s3) >>> 10) & 31;
        int i8 = s3 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i3 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i3 = i7 + 112;
            }
            int i10 = i3;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - v.f2569a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static final X.c f(long j3) {
        float[] fArr = X.e.f2595a;
        return X.e.f2614u[(int) (j3 & 63)];
    }

    public static final float g(long j3) {
        int i3;
        int i4;
        int i5;
        if ((63 & j3) == 0) {
            return ((float) Z.b.Q((j3 >>> 40) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 32) & 65535);
        int i6 = 32768 & s3;
        int i7 = ((65535 & s3) >>> 10) & 31;
        int i8 = s3 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i3 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i3 = i7 + 112;
            }
            int i10 = i3;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - v.f2569a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static final float h(long j3) {
        int i3;
        int i4;
        int i5;
        if ((63 & j3) == 0) {
            return ((float) Z.b.Q((j3 >>> 48) & 255)) / 255.0f;
        }
        short s3 = (short) ((j3 >>> 48) & 65535);
        int i6 = 32768 & s3;
        int i7 = ((65535 & s3) >>> 10) & 31;
        int i8 = s3 & 1023;
        if (i7 != 0) {
            int i9 = i8 << 13;
            if (i7 == 31) {
                i3 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i3 = i7 + 112;
            }
            int i10 = i3;
            i4 = i9;
            i5 = i10;
        } else {
            if (i8 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i8 + 1056964608) - v.f2569a;
                return i6 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i5 = 0;
            i4 = 0;
        }
        return Float.intBitsToFloat((i5 << 23) | (i6 << 16) | i4);
    }

    public static String i(long j3) {
        return "Color(" + h(j3) + ", " + g(j3) + ", " + e(j3) + ", " + d(j3) + ", " + f(j3).f2591a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f2564a == ((r) obj).f2564a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2564a);
    }

    public final String toString() {
        return i(this.f2564a);
    }
}
