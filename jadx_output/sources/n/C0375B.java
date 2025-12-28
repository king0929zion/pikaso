package n;

import d2.AbstractC0239j;
import o.AbstractC0450a;

/* renamed from: n.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375B {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4960a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4961b;

    /* renamed from: c, reason: collision with root package name */
    public int f4962c;

    /* renamed from: d, reason: collision with root package name */
    public int f4963d;

    /* renamed from: e, reason: collision with root package name */
    public int f4964e;

    public C0375B(int i3) {
        this.f4960a = AbstractC0377D.f4966a;
        this.f4961b = AbstractC0450a.f5364c;
        if (i3 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        f(AbstractC0377D.d(i3));
    }

    public final boolean a(Object obj) {
        int i3 = this.f4963d;
        this.f4961b[d(obj)] = obj;
        return this.f4963d != i3;
    }

    public final void b() {
        this.f4963d = 0;
        long[] jArr = this.f4960a;
        if (jArr != AbstractC0377D.f4966a) {
            AbstractC0239j.d0(jArr);
            long[] jArr2 = this.f4960a;
            int i3 = this.f4962c;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        AbstractC0239j.c0(this.f4961b, 0, this.f4962c);
        this.f4964e = AbstractC0377D.a(this.f4962c) - this.f4963d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f4962c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f4960a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f4961b
            r15 = r15[r11]
            boolean r15 = p2.g.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0375B.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.f4962c;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f4960a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = i5;
            int i11 = i5;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
                if (p2.g.a(this.f4961b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & (-9187201950435737472L)) != 0) {
                int e3 = e(i4);
                if (this.f4964e == 0 && ((this.f4960a[e3 >> 3] >> ((e3 & 7) << 3)) & 255) != 254) {
                    int i12 = this.f4962c;
                    if (i12 <= 8 || Long.compareUnsigned(this.f4963d * 32, i12 * 25) > 0) {
                        l(AbstractC0377D.b(this.f4962c));
                    } else {
                        l(AbstractC0377D.b(this.f4962c));
                    }
                    e3 = e(i4);
                }
                this.f4963d++;
                int i13 = this.f4964e;
                long[] jArr2 = this.f4960a;
                int i14 = e3 >> 3;
                long j7 = jArr2[i14];
                int i15 = (e3 & 7) << 3;
                this.f4964e = i13 - (((j7 >> i15) & 255) == 128 ? 1 : 0);
                jArr2[i14] = (j7 & (~(255 << i15))) | (j4 << i15);
                int i16 = this.f4962c;
                int i17 = ((e3 - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = ((~(255 << i19)) & jArr2[i18]) | (j4 << i19);
                return e3;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
        }
    }

    public final int e(int i3) {
        int i4 = this.f4962c;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f4960a;
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
        if (!(obj instanceof C0375B)) {
            return false;
        }
        C0375B c0375b = (C0375B) obj;
        if (c0375b.f4963d != this.f4963d) {
            return false;
        }
        Object[] objArr = this.f4961b;
        long[] jArr = this.f4960a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128 && !c0375b.c(objArr[(i3 << 3) + i5])) {
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
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0377D.c(i3)) : 0;
        this.f4962c = max;
        if (max == 0) {
            jArr = AbstractC0377D.f4966a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0239j.d0(jArr);
        }
        this.f4960a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f4964e = AbstractC0377D.a(this.f4962c) - this.f4963d;
        this.f4961b = new Object[max];
    }

    public final boolean g() {
        return this.f4963d == 0;
    }

    public final boolean h() {
        return this.f4963d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f4961b;
        long[] jArr = this.f4960a;
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
                            Object obj = objArr[(i4 << 3) + i7];
                            i5 += obj != null ? obj.hashCode() : 0;
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

    public final void i(C0375B c0375b) {
        p2.g.e(c0375b, "elements");
        Object[] objArr = c0375b.f4961b;
        long[] jArr = c0375b.f4960a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j3) < 128) {
                        Object obj = objArr[(i3 << 3) + i5];
                        this.f4961b[d(obj)] = obj;
                    }
                    j3 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f4962c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f4960a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f4961b
            r15 = r15[r11]
            boolean r15 = p2.g.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.k(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0375B.j(java.lang.Object):boolean");
    }

    public final void k(int i3) {
        this.f4963d--;
        long[] jArr = this.f4960a;
        int i4 = i3 >> 3;
        int i5 = (i3 & 7) << 3;
        jArr[i4] = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        int i6 = this.f4962c;
        int i7 = ((i3 - 7) & i6) + (i6 & 7);
        int i8 = i7 >> 3;
        int i9 = (i7 & 7) << 3;
        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (254 << i9);
        this.f4961b[i3] = null;
    }

    public final void l(int i3) {
        int i4;
        long[] jArr = this.f4960a;
        Object[] objArr = this.f4961b;
        int i5 = this.f4962c;
        f(i3);
        Object[] objArr2 = this.f4961b;
        int i6 = 0;
        while (i6 < i5) {
            if (((jArr[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i7 = hashCode ^ (hashCode << 16);
                int e3 = e(i7 >>> 7);
                long j3 = i7 & 127;
                long[] jArr2 = this.f4960a;
                int i8 = e3 >> 3;
                int i9 = (e3 & 7) << 3;
                i4 = i6;
                jArr2[i8] = (jArr2[i8] & (~(255 << i9))) | (j3 << i9);
                int i10 = this.f4962c;
                int i11 = ((e3 - 7) & i10) + (i10 & 7);
                int i12 = i11 >> 3;
                int i13 = (i11 & 7) << 3;
                jArr2[i12] = ((~(255 << i13)) & jArr2[i12]) | (j3 << i13);
                objArr2[e3] = obj;
            } else {
                i4 = i6;
            }
            i6 = i4 + 1;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f4961b;
        long[] jArr = this.f4960a;
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
                            Object obj = objArr[(i3 << 3) + i6];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
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

    public /* synthetic */ C0375B() {
        this(6);
    }
}
