package n;

import d2.AbstractC0239j;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401u {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5033a = AbstractC0377D.f4966a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f5034b = AbstractC0392l.f4994a;

    /* renamed from: c, reason: collision with root package name */
    public int f5035c;

    /* renamed from: d, reason: collision with root package name */
    public int f5036d;

    /* renamed from: e, reason: collision with root package name */
    public int f5037e;

    public C0401u(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        c(AbstractC0377D.d(i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f5035c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f5033a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f5034b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            r4 = r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0401u.a(long):boolean");
    }

    public final int b(int i3) {
        int i4 = this.f5035c;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5033a;
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

    public final void c(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0377D.c(i3)) : 0;
        this.f5035c = max;
        if (max == 0) {
            jArr = AbstractC0377D.f4966a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0239j.d0(jArr);
        }
        this.f5033a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5037e = AbstractC0377D.a(this.f5035c) - this.f5036d;
        this.f5034b = new long[max];
    }

    public final void d(int i3) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.f5033a;
        long[] jArr4 = this.f5034b;
        int i4 = this.f5035c;
        c(i3);
        long[] jArr5 = this.f5034b;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr3[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j3 = jArr4[i5];
                int hashCode = Long.hashCode(j3) * (-862048943);
                int i6 = hashCode ^ (hashCode << 16);
                int b3 = b(i6 >>> 7);
                long j4 = i6 & 127;
                long[] jArr6 = this.f5033a;
                int i7 = b3 >> 3;
                int i8 = (b3 & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i7] = (jArr6[i7] & (~(255 << i8))) | (j4 << i8);
                int i9 = this.f5035c;
                int i10 = ((b3 - 7) & i9) + (i9 & 7);
                int i11 = i10 >> 3;
                int i12 = (i10 & 7) << 3;
                jArr6[i11] = ((~(255 << i12)) & jArr6[i11]) | (j4 << i12);
                jArr5[b3] = j3;
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i5++;
            jArr3 = jArr;
            jArr4 = jArr2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0401u)) {
            return false;
        }
        C0401u c0401u = (C0401u) obj;
        if (c0401u.f5036d != this.f5036d) {
            return false;
        }
        long[] jArr = this.f5034b;
        long[] jArr2 = this.f5033a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr2[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128 && !c0401u.a(jArr[(i3 << 3) + i5])) {
                            return false;
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

    public final int hashCode() {
        long[] jArr = this.f5034b;
        long[] jArr2 = this.f5033a;
        int length = jArr2.length - 2;
        int i3 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j3) < 128) {
                            i5 = Long.hashCode(jArr[(i4 << 3) + i7]) + i5;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f5034b;
        long[] jArr2 = this.f5033a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j3 = jArr2[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            long j4 = jArr[(i3 << 3) + i6];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j4);
                            i4++;
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
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        p2.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
