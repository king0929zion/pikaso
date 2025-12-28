package n;

import d2.AbstractC0239j;

/* renamed from: n.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399s {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5022a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5023b;

    /* renamed from: c, reason: collision with root package name */
    public int f5024c;

    /* renamed from: d, reason: collision with root package name */
    public int f5025d;

    /* renamed from: e, reason: collision with root package name */
    public int f5026e;

    public C0399s(int i3) {
        this.f5022a = AbstractC0377D.f4966a;
        this.f5023b = AbstractC0391k.f4993a;
        if (i3 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        e(AbstractC0377D.d(i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        r3 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r20.f5026e != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (((r20.f5022a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r3 = r20.f5024c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r3 <= 8) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (java.lang.Long.compareUnsigned(r20.f5025d * 32, r3 * 25) > 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        g(n.AbstractC0377D.b(r20.f5024c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        r3 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        g(n.AbstractC0377D.b(r20.f5024c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        r17 = r3;
        r19 = true;
        r20.f5025d++;
        r3 = r20.f5026e;
        r4 = r20.f5022a;
        r5 = r17 >> 3;
        r11 = r4[r5];
        r8 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        if (((r11 >> r8) & 255) != 128) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        r20.f5026e = r3 - r13;
        r4[r5] = (r11 & (~(255 << r8))) | (r9 << r8);
        r3 = r20.f5024c;
        r5 = ((r17 - 7) & r3) + (r3 & 7);
        r3 = r5 >> 3;
        r5 = (r5 & 7) << 3;
        r4[r3] = ((~(255 << r5)) & r4[r3]) | (r9 << r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        r13 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r21) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0399s.a(int):boolean");
    }

    public final void b() {
        this.f5025d = 0;
        long[] jArr = this.f5022a;
        if (jArr != AbstractC0377D.f4966a) {
            AbstractC0239j.d0(jArr);
            long[] jArr2 = this.f5022a;
            int i3 = this.f5024c;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        this.f5026e = AbstractC0377D.a(this.f5024c) - this.f5025d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f5024c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f5022a
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
            if (r10 == 0) goto L60
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.f5023b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L59
            goto L6a
        L59:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L42
        L60:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6e
            r10 = -1
        L6a:
            if (r10 < 0) goto L6d
            r4 = r11
        L6d:
            return r4
        L6e:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0399s.c(int):boolean");
    }

    public final int d(int i3) {
        int i4 = this.f5024c;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5022a;
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

    public final void e(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0377D.c(i3)) : 0;
        this.f5024c = max;
        if (max == 0) {
            jArr = AbstractC0377D.f4966a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0239j.d0(jArr);
        }
        this.f5022a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5026e = AbstractC0377D.a(this.f5024c) - this.f5025d;
        this.f5023b = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0399s)) {
            return false;
        }
        C0399s c0399s = (C0399s) obj;
        if (c0399s.f5025d != this.f5025d) {
            return false;
        }
        int[] iArr = this.f5023b;
        long[] jArr = this.f5022a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128 && !c0399s.c(iArr[(i3 << 3) + i5])) {
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

    public final void f(int i3) {
        this.f5025d--;
        long[] jArr = this.f5022a;
        int i4 = i3 >> 3;
        int i5 = (i3 & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        int i6 = this.f5024c;
        int i7 = ((i3 - 7) & i6) + (i6 & 7);
        int i8 = i7 >> 3;
        int i9 = (i7 & 7) << 3;
        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (254 << i9);
    }

    public final void g(int i3) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.f5022a;
        int[] iArr2 = this.f5023b;
        int i4 = this.f5024c;
        e(i3);
        int[] iArr3 = this.f5023b;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i6 = iArr2[i5];
                int hashCode = Integer.hashCode(i6) * (-862048943);
                int i7 = hashCode ^ (hashCode << 16);
                int d3 = d(i7 >>> 7);
                long j3 = i7 & 127;
                long[] jArr3 = this.f5022a;
                int i8 = d3 >> 3;
                int i9 = (d3 & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i8] = ((~(255 << i9)) & jArr3[i8]) | (j3 << i9);
                int i10 = this.f5024c;
                int i11 = ((d3 - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr3[i12] = ((~(255 << i13)) & jArr3[i12]) | (j3 << i13);
                iArr3[d3] = i6;
            } else {
                jArr = jArr2;
                iArr = iArr2;
            }
            i5++;
            jArr2 = jArr;
            iArr2 = iArr;
        }
    }

    public final int hashCode() {
        int[] iArr = this.f5023b;
        long[] jArr = this.f5022a;
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
                            i5 = Integer.hashCode(iArr[(i4 << 3) + i7]) + i5;
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
        int[] iArr = this.f5023b;
        long[] jArr = this.f5022a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = iArr[(i3 << 3) + i6];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i7);
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

    public /* synthetic */ C0399s() {
        this(6);
    }
}
