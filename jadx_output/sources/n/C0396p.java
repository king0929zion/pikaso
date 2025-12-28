package n;

import A.AbstractC0000a;
import d2.AbstractC0239j;
import java.util.NoSuchElementException;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396p {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5008a = AbstractC0377D.f4966a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5009b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5010c;

    /* renamed from: d, reason: collision with root package name */
    public int f5011d;

    /* renamed from: e, reason: collision with root package name */
    public int f5012e;

    /* renamed from: f, reason: collision with root package name */
    public int f5013f;

    public C0396p() {
        int[] iArr = AbstractC0391k.f4993a;
        this.f5009b = iArr;
        this.f5010c = iArr;
        e(AbstractC0377D.d(6));
    }

    public final void a() {
        this.f5012e = 0;
        long[] jArr = this.f5008a;
        if (jArr != AbstractC0377D.f4966a) {
            AbstractC0239j.d0(jArr);
            long[] jArr2 = this.f5008a;
            int i3 = this.f5011d;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        this.f5013f = AbstractC0377D.a(this.f5011d) - this.f5012e;
    }

    public final int b(int i3) {
        int i4 = this.f5011d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5008a;
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

    public final int c(int i3) {
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f5011d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f5008a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = (i5 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i6;
                if (this.f5009b[numberOfTrailingZeros] == i3) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final int d(int i3) {
        int c3 = c(i3);
        if (c3 >= 0) {
            return this.f5010c[c3];
        }
        throw new NoSuchElementException(AbstractC0000a.c("Cannot find value for key ", i3));
    }

    public final void e(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0377D.c(i3)) : 0;
        this.f5011d = max;
        if (max == 0) {
            jArr = AbstractC0377D.f4966a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0239j.d0(jArr);
        }
        this.f5008a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5013f = AbstractC0377D.a(this.f5011d) - this.f5012e;
        this.f5009b = new int[max];
        this.f5010c = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0396p)) {
            return false;
        }
        C0396p c0396p = (C0396p) obj;
        if (c0396p.f5012e != this.f5012e) {
            return false;
        }
        int[] iArr = this.f5009b;
        int[] iArr2 = this.f5010c;
        long[] jArr = this.f5008a;
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
                            if (iArr2[i6] != c0396p.d(iArr[i6])) {
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
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.f5008a;
        int[] iArr2 = this.f5009b;
        int[] iArr3 = this.f5010c;
        int i4 = this.f5011d;
        e(i3);
        int[] iArr4 = this.f5009b;
        int[] iArr5 = this.f5010c;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i6 = iArr2[i5];
                int hashCode = Integer.hashCode(i6) * (-862048943);
                int i7 = hashCode ^ (hashCode << 16);
                int b3 = b(i7 >>> 7);
                long j3 = i7 & 127;
                long[] jArr3 = this.f5008a;
                int i8 = b3 >> 3;
                int i9 = (b3 & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i8] = (jArr3[i8] & (~(255 << i9))) | (j3 << i9);
                int i10 = this.f5011d;
                int i11 = ((b3 - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr3[i12] = ((~(255 << i13)) & jArr3[i12]) | (j3 << i13);
                iArr4[b3] = i6;
                iArr5[b3] = iArr3[i5];
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i5++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        r2 = b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r20.f5013f != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (((r20.f5008a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        r2 = r20.f5011d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r2 <= 8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (java.lang.Long.compareUnsigned(r20.f5012e * 32, r2 * 25) > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        f(n.AbstractC0377D.b(r20.f5011d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        r2 = b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        f(n.AbstractC0377D.b(r20.f5011d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        r20.f5012e++;
        r3 = r20.f5013f;
        r4 = r20.f5008a;
        r7 = r2 >> 3;
        r8 = r4[r7];
        r12 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (((r8 >> r12) & 255) != 128) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        r20.f5013f = r3 - r13;
        r4[r7] = (r8 & (~(255 << r12))) | (r10 << r12);
        r3 = r20.f5011d;
        r7 = ((r2 - 7) & r3) + (r3 & 7);
        r3 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r4[r3] = ((~(255 << r7)) & r4[r3]) | (r10 << r7);
        r2 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0396p.g(int, int):void");
    }

    public final int hashCode() {
        int[] iArr = this.f5009b;
        int[] iArr2 = this.f5010c;
        long[] jArr = this.f5008a;
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
                            int i9 = iArr[i8];
                            i5 += Integer.hashCode(iArr2[i8]) ^ Integer.hashCode(i9);
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
        if (this.f5012e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f5009b;
        int[] iArr2 = this.f5010c;
        long[] jArr = this.f5008a;
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
                            int i8 = iArr[i7];
                            int i9 = iArr2[i7];
                            sb.append(i8);
                            sb.append("=");
                            sb.append(i9);
                            i4++;
                            if (i4 < this.f5012e) {
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
}
