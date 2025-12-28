package n;

import d2.AbstractC0239j;
import java.util.NoSuchElementException;
import o.AbstractC0450a;

/* renamed from: n.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5044a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5045b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5046c;

    /* renamed from: d, reason: collision with root package name */
    public int f5047d;

    /* renamed from: e, reason: collision with root package name */
    public int f5048e;

    /* renamed from: f, reason: collision with root package name */
    public int f5049f;

    public C0403w(int i3) {
        this.f5044a = AbstractC0377D.f4966a;
        this.f5045b = AbstractC0450a.f5364c;
        this.f5046c = AbstractC0391k.f4993a;
        if (i3 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        d(AbstractC0377D.d(i3));
    }

    public final int a(int i3) {
        int i4 = this.f5047d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5044a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j4 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int b(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f5047d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f5044a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = i5;
            int i11 = i5;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
                if (p2.g.a(this.f5045b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int a3 = a(i4);
                if (this.f5049f == 0 && ((this.f5044a[a3 >> 3] >> ((a3 & 7) << 3)) & 255) != 254) {
                    int i12 = this.f5047d;
                    if (i12 <= 8 || Long.compareUnsigned(this.f5048e * 32, i12 * 25) > 0) {
                        f(AbstractC0377D.b(this.f5047d));
                    } else {
                        f(AbstractC0377D.b(this.f5047d));
                    }
                    a3 = a(i4);
                }
                this.f5048e++;
                int i13 = this.f5049f;
                long[] jArr2 = this.f5044a;
                int i14 = a3 >> 3;
                long j7 = jArr2[i14];
                int i15 = (a3 & 7) << 3;
                this.f5049f = i13 - (((j7 >> i15) & 255) == 128 ? 1 : 0);
                jArr2[i14] = (j7 & (~(255 << i15))) | (j4 << i15);
                int i16 = this.f5047d;
                int i17 = ((a3 - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (j4 << i19);
                return ~a3;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
        }
    }

    public final int c(Object obj) {
        int i3 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f5047d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.f5044a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = (i5 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i6;
                if (p2.g.a(this.f5045b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i7 = i8 + i3;
        }
    }

    public final void d(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0377D.c(i3)) : 0;
        this.f5047d = max;
        if (max == 0) {
            jArr = AbstractC0377D.f4966a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0239j.d0(jArr);
        }
        this.f5044a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5049f = AbstractC0377D.a(this.f5047d) - this.f5048e;
        this.f5045b = new Object[max];
        this.f5046c = new int[max];
    }

    public final void e(int i3) {
        this.f5048e--;
        long[] jArr = this.f5044a;
        int i4 = i3 >> 3;
        int i5 = (i3 & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        int i6 = this.f5047d;
        int i7 = ((i3 - 7) & i6) + (i6 & 7);
        int i8 = i7 >> 3;
        int i9 = (i7 & 7) << 3;
        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        this.f5045b[i3] = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0403w)) {
            return false;
        }
        C0403w c0403w = (C0403w) obj;
        if (c0403w.f5048e != this.f5048e) {
            return false;
        }
        Object[] objArr = this.f5045b;
        int[] iArr = this.f5046c;
        long[] jArr = this.f5044a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj2 = objArr[i6];
                            int i7 = iArr[i6];
                            int c3 = c0403w.c(obj2);
                            if (c3 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (i7 != c0403w.f5046c[c3]) {
                                return false;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return true;
    }

    public final void f(int i3) {
        int i4;
        long[] jArr = this.f5044a;
        Object[] objArr = this.f5045b;
        int[] iArr = this.f5046c;
        int i5 = this.f5047d;
        d(i3);
        Object[] objArr2 = this.f5045b;
        int[] iArr2 = this.f5046c;
        int i6 = 0;
        while (i6 < i5) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i7 = hashCode ^ (hashCode << 16);
                int a3 = a(i7 >>> 7);
                long j3 = i7 & 127;
                long[] jArr2 = this.f5044a;
                int i8 = a3 >> 3;
                int i9 = (a3 & 7) << 3;
                i4 = i6;
                jArr2[i8] = (jArr2[i8] & (~(255 << i9))) | (j3 << i9);
                int i10 = this.f5047d;
                int i11 = ((a3 - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr2[i12] = (jArr2[i12] & (~(255 << i13))) | (j3 << i13);
                objArr2[a3] = obj;
                iArr2[a3] = iArr[i4];
            } else {
                i4 = i6;
            }
            i6 = i4 + 1;
        }
    }

    public final int hashCode() {
        Object[] objArr = this.f5045b;
        int[] iArr = this.f5046c;
        long[] jArr = this.f5044a;
        int length = jArr.length - 2;
        int i3 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j3 = jArr[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j3) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = objArr[i8];
                            i5 += Integer.hashCode(iArr[i8]) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j3 >>= 8;
                    }
                    if (i6 != 8) {
                        return i5;
                    }
                }
                if (i4 == length) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
        }
        return i3;
    }

    public final String toString() {
        if (this.f5048e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f5045b;
        int[] iArr = this.f5046c;
        long[] jArr = this.f5044a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            int i8 = iArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i8);
                            i4++;
                            if (i4 < this.f5048e) {
                                sb.append(", ");
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        p2.g.d(sb2, "s.append('}').toString()");
        return sb2;
    }

    public /* synthetic */ C0403w() {
        this(6);
    }
}
