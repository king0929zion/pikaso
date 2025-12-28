package n;

import d2.AbstractC0239j;
import o.AbstractC0450a;

/* renamed from: n.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398r {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5016a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5017b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5018c;

    /* renamed from: d, reason: collision with root package name */
    public int f5019d;

    /* renamed from: e, reason: collision with root package name */
    public int f5020e;

    /* renamed from: f, reason: collision with root package name */
    public int f5021f;

    public C0398r(int i3) {
        this.f5016a = AbstractC0377D.f4966a;
        this.f5017b = AbstractC0391k.f4993a;
        this.f5018c = AbstractC0450a.f5364c;
        if (i3 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        g(AbstractC0377D.d(i3));
    }

    public final void a() {
        this.f5020e = 0;
        long[] jArr = this.f5016a;
        if (jArr != AbstractC0377D.f4966a) {
            AbstractC0239j.d0(jArr);
            long[] jArr2 = this.f5016a;
            int i3 = this.f5019d;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        AbstractC0239j.c0(this.f5018c, 0, this.f5019d);
        this.f5021f = AbstractC0377D.a(this.f5019d) - this.f5020e;
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
    public final boolean b(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f5019d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f5016a
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
            int[] r14 = r0.f5017b
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
        throw new UnsupportedOperationException("Method not decompiled: n.C0398r.b(int):boolean");
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
            int r3 = r0.f5019d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f5016a
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
            int[] r14 = r0.f5017b
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
        throw new UnsupportedOperationException("Method not decompiled: n.C0398r.c(int):boolean");
    }

    public final int d(int i3) {
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f5019d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f5016a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j3 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j4 = i6;
            int i12 = i9;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i7;
                if (this.f5017b[numberOfTrailingZeros] == i3) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int e3 = e(i5);
                if (this.f5021f == 0 && ((this.f5016a[e3 >> 3] >> ((e3 & 7) << 3)) & 255) != 254) {
                    int i13 = this.f5019d;
                    if (i13 <= 8 || Long.compareUnsigned(this.f5020e * 32, i13 * 25) > 0) {
                        h(AbstractC0377D.b(this.f5019d));
                    } else {
                        h(AbstractC0377D.b(this.f5019d));
                    }
                    e3 = e(i5);
                }
                this.f5020e++;
                int i14 = this.f5021f;
                long[] jArr2 = this.f5016a;
                int i15 = e3 >> 3;
                long j7 = jArr2[i15];
                int i16 = (e3 & 7) << 3;
                this.f5021f = i14 - (((j7 >> i16) & 255) == 128 ? 1 : 0);
                jArr2[i15] = ((~(255 << i16)) & j7) | (j4 << i16);
                int i17 = this.f5019d;
                int i18 = ((e3 - 7) & i17) + (i17 & 7);
                int i19 = i18 >> 3;
                int i20 = (i18 & 7) << 3;
                jArr2[i19] = ((~(255 << i20)) & jArr2[i19]) | (j4 << i20);
                return e3;
            }
            i9 = i12 + 8;
            i8 = (i8 + i9) & i7;
        }
    }

    public final int e(int i3) {
        int i4 = this.f5019d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5016a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0398r)) {
            return false;
        }
        C0398r c0398r = (C0398r) obj;
        if (c0398r.f5020e != this.f5020e) {
            return false;
        }
        int[] iArr = this.f5017b;
        Object[] objArr = this.f5018c;
        long[] jArr = this.f5016a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            Object obj2 = objArr[i6];
                            if (obj2 == null) {
                                if (c0398r.f(i7) != null || !c0398r.c(i7)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(c0398r.f(i7))) {
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
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f5019d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f5016a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f5017b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r14 = r13.f5018c
            r14 = r14[r10]
            goto L6c
        L6b:
            r14 = 0
        L6c:
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0398r.f(int):java.lang.Object");
    }

    public final void g(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0377D.c(i3)) : 0;
        this.f5019d = max;
        if (max == 0) {
            jArr = AbstractC0377D.f4966a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0239j.d0(jArr);
        }
        this.f5016a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5021f = AbstractC0377D.a(this.f5019d) - this.f5020e;
        this.f5017b = new int[max];
        this.f5018c = new Object[max];
    }

    public final void h(int i3) {
        long[] jArr;
        int[] iArr;
        long[] jArr2 = this.f5016a;
        int[] iArr2 = this.f5017b;
        Object[] objArr = this.f5018c;
        int i4 = this.f5019d;
        g(i3);
        int[] iArr3 = this.f5017b;
        Object[] objArr2 = this.f5018c;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr2[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                int i6 = iArr2[i5];
                int hashCode = Integer.hashCode(i6) * (-862048943);
                int i7 = hashCode ^ (hashCode << 16);
                int e3 = e(i7 >>> 7);
                long j3 = i7 & 127;
                long[] jArr3 = this.f5016a;
                int i8 = e3 >> 3;
                int i9 = (e3 & 7) << 3;
                jArr = jArr2;
                iArr = iArr2;
                jArr3[i8] = (jArr3[i8] & (~(255 << i9))) | (j3 << i9);
                int i10 = this.f5019d;
                int i11 = ((e3 - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr3[i12] = ((~(255 << i13)) & jArr3[i12]) | (j3 << i13);
                iArr3[e3] = i6;
                objArr2[e3] = objArr[i5];
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
        int[] iArr = this.f5017b;
        Object[] objArr = this.f5018c;
        long[] jArr = this.f5016a;
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
                            Object obj = objArr[i8];
                            i5 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i9);
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

    public final void i(int i3, Object obj) {
        int d3 = d(i3);
        this.f5017b[d3] = i3;
        this.f5018c[d3] = obj;
    }

    public final String toString() {
        if (this.f5020e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f5017b;
        Object[] objArr = this.f5018c;
        long[] jArr = this.f5016a;
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
                            Object obj = objArr[i7];
                            sb.append(i8);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.f5020e) {
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

    public /* synthetic */ C0398r() {
        this(6);
    }
}
