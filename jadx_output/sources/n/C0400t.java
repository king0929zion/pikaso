package n;

import d2.AbstractC0239j;

/* renamed from: n.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400t {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5027a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f5028b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5029c;

    /* renamed from: d, reason: collision with root package name */
    public int f5030d;

    /* renamed from: e, reason: collision with root package name */
    public int f5031e;

    /* renamed from: f, reason: collision with root package name */
    public int f5032f;

    public final int a(int i3) {
        int i4 = this.f5030d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5027a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r16) {
        /*
            r15 = this;
            r0 = r15
            int r1 = java.lang.Long.hashCode(r16)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f5030d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
        L14:
            long[] r5 = r0.f5027a
            int r6 = r1 >> 3
            r7 = r1 & 7
            int r7 = r7 << 3
            r8 = r5[r6]
            long r8 = r8 >>> r7
            int r6 = r6 + 1
            r10 = r5[r6]
            int r5 = 64 - r7
            long r5 = r10 << r5
            long r10 = (long) r7
            long r10 = -r10
            r7 = 63
            long r10 = r10 >> r7
            long r5 = r5 & r10
            long r5 = r5 | r8
            long r7 = (long) r2
            r9 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r9
            long r7 = r7 ^ r5
            long r9 = r7 - r9
            long r7 = ~r7
            long r7 = r7 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
        L40:
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 == 0) goto L5d
            int r11 = java.lang.Long.numberOfTrailingZeros(r7)
            int r11 = r11 >> 3
            int r11 = r11 + r1
            r11 = r11 & r3
            long[] r12 = r0.f5028b
            r13 = r12[r11]
            int r12 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r12 != 0) goto L57
            goto L67
        L57:
            r11 = 1
            long r11 = r7 - r11
            long r7 = r7 & r11
            goto L40
        L5d:
            long r7 = ~r5
            r13 = 6
            long r7 = r7 << r13
            long r5 = r5 & r7
            long r5 = r5 & r9
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L70
            r11 = -1
        L67:
            if (r11 < 0) goto L6e
            java.lang.Object[] r1 = r0.f5029c
            r1 = r1[r11]
            goto L6f
        L6e:
            r1 = 0
        L6f:
            return r1
        L70:
            int r4 = r4 + 8
            int r1 = r1 + r4
            r1 = r1 & r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0400t.b(long):java.lang.Object");
    }

    public final void c(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0377D.c(i3)) : 0;
        this.f5030d = max;
        if (max == 0) {
            jArr = AbstractC0377D.f4966a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0239j.d0(jArr);
        }
        this.f5027a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5032f = AbstractC0377D.a(this.f5030d) - this.f5031e;
        this.f5028b = new long[max];
        this.f5029c = new Object[max];
    }

    public final void d(int i3) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.f5027a;
        long[] jArr4 = this.f5028b;
        Object[] objArr = this.f5029c;
        int i4 = this.f5030d;
        c(i3);
        long[] jArr5 = this.f5028b;
        Object[] objArr2 = this.f5029c;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr3[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                long j3 = jArr4[i5];
                int hashCode = Long.hashCode(j3) * (-862048943);
                int i6 = hashCode ^ (hashCode << 16);
                int a3 = a(i6 >>> 7);
                long j4 = i6 & 127;
                long[] jArr6 = this.f5027a;
                int i7 = a3 >> 3;
                int i8 = (a3 & 7) << 3;
                jArr = jArr3;
                jArr2 = jArr4;
                jArr6[i7] = (jArr6[i7] & (~(255 << i8))) | (j4 << i8);
                int i9 = this.f5030d;
                int i10 = ((a3 - 7) & i9) + (i9 & 7);
                int i11 = i10 >> 3;
                int i12 = (i10 & 7) << 3;
                jArr6[i11] = (jArr6[i11] & (~(255 << i12))) | (j4 << i12);
                jArr5[a3] = j3;
                objArr2[a3] = objArr[i5];
            } else {
                jArr = jArr3;
                jArr2 = jArr4;
            }
            i5++;
            jArr3 = jArr;
            jArr4 = jArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r21.f5032f != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (((r21.f5027a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        r1 = r21.f5030d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r1 <= 8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (java.lang.Long.compareUnsigned(r21.f5031e * 32, r1 * 25) > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        d(n.AbstractC0377D.b(r21.f5030d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        r1 = a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        d(n.AbstractC0377D.b(r21.f5030d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        r15 = r1;
        r21.f5031e++;
        r1 = r21.f5032f;
        r2 = r21.f5027a;
        r3 = r15 >> 3;
        r6 = r2[r3];
        r8 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        r21.f5032f = r1 - r12;
        r2[r3] = (r6 & (~(255 << r8))) | (r9 << r8);
        r1 = r21.f5030d;
        r3 = ((r15 - 7) & r1) + (r1 & 7);
        r1 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r2[r1] = ((~(255 << r3)) & r2[r1]) | (r9 << r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r22, n.C0404x r24) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0400t.e(long, n.x):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        r26 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0400t.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.f5028b;
        Object[] objArr = this.f5029c;
        long[] jArr2 = this.f5027a;
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
                            int i8 = (i4 << 3) + i7;
                            long j4 = jArr[i8];
                            Object obj = objArr[i8];
                            i5 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j4);
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
        int i3;
        int i4;
        if (this.f5031e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f5028b;
        Object[] objArr = this.f5029c;
        long[] jArr2 = this.f5027a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j3 = jArr2[i5];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((255 & j3) < 128) {
                            int i9 = (i5 << 3) + i8;
                            i4 = i5;
                            long j4 = jArr[i9];
                            Object obj = objArr[i9];
                            sb.append(j4);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i6++;
                            if (i6 < this.f5031e) {
                                sb.append(", ");
                            }
                        } else {
                            i4 = i5;
                        }
                        j3 >>= 8;
                        i8++;
                        i5 = i4;
                    }
                    int i10 = i5;
                    if (i7 != 8) {
                        break;
                    }
                    i3 = i10;
                } else {
                    i3 = i5;
                }
                if (i3 == length) {
                    break;
                }
                i5 = i3 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        p2.g.d(sb2, "s.append('}').toString()");
        return sb2;
    }
}
