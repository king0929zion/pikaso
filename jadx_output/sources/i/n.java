package I;

import D.C0032d;
import D.U;
import d2.AbstractC0239j;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f1380e = new n(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f1381a;

    /* renamed from: b, reason: collision with root package name */
    public int f1382b;

    /* renamed from: c, reason: collision with root package name */
    public final K.b f1383c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f1384d;

    public n(int i3, int i4, Object[] objArr, K.b bVar) {
        this.f1381a = i3;
        this.f1382b = i4;
        this.f1383c = bVar;
        this.f1384d = objArr;
    }

    public static n j(int i3, Object obj, Object obj2, int i4, Object obj3, Object obj4, int i5, K.b bVar) {
        if (i5 > 30) {
            return new n(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int H2 = r2.a.H(i3, i5);
        int H3 = r2.a.H(i4, i5);
        if (H2 != H3) {
            return new n((1 << H2) | (1 << H3), 0, H2 < H3 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new n(0, 1 << H2, new Object[]{j(i3, obj, obj2, i4, obj3, obj4, i5 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i3, int i4, int i5, Object obj, Object obj2, int i6, K.b bVar) {
        Object obj3 = this.f1384d[i3];
        n j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i3), i5, obj, obj2, i6 + 5, bVar);
        int t3 = t(i4);
        int i7 = t3 + 1;
        Object[] objArr = this.f1384d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0239j.a0(objArr, objArr2, 0, i3, 6);
        AbstractC0239j.Y(objArr, objArr2, i3, i3 + 2, i7);
        objArr2[t3 - 1] = j3;
        AbstractC0239j.Y(objArr, objArr2, t3, i7, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f1382b == 0) {
            return this.f1384d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f1381a);
        int length = this.f1384d.length;
        for (int i3 = bitCount * 2; i3 < length; i3++) {
            bitCount += s(i3).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        u2.b N2 = Z.b.N(Z.b.R(0, this.f1384d.length));
        int i3 = N2.f6300d;
        int i4 = N2.f6301e;
        int i5 = N2.f6302f;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!p2.g.a(obj, this.f1384d[i3])) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i3, int i4, Object obj) {
        int H2 = 1 << r2.a.H(i3, i4);
        if (h(H2)) {
            return p2.g.a(obj, this.f1384d[f(H2)]);
        }
        if (!i(H2)) {
            return false;
        }
        n s3 = s(t(H2));
        return i4 == 30 ? s3.c(obj) : s3.d(i3, i4 + 5, obj);
    }

    public final boolean e(n nVar) {
        if (this == nVar) {
            return true;
        }
        if (this.f1382b != nVar.f1382b || this.f1381a != nVar.f1381a) {
            return false;
        }
        int length = this.f1384d.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.f1384d[i3] != nVar.f1384d[i3]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i3) {
        return Integer.bitCount((i3 - 1) & this.f1381a) * 2;
    }

    public final Object g(int i3, int i4, Object obj) {
        int H2 = 1 << r2.a.H(i3, i4);
        if (h(H2)) {
            int f3 = f(H2);
            if (p2.g.a(obj, this.f1384d[f3])) {
                return x(f3);
            }
            return null;
        }
        if (!i(H2)) {
            return null;
        }
        n s3 = s(t(H2));
        if (i4 != 30) {
            return s3.g(i3, i4 + 5, obj);
        }
        u2.b N2 = Z.b.N(Z.b.R(0, s3.f1384d.length));
        int i5 = N2.f6300d;
        int i6 = N2.f6301e;
        int i7 = N2.f6302f;
        if ((i7 <= 0 || i5 > i6) && (i7 >= 0 || i6 > i5)) {
            return null;
        }
        while (!p2.g.a(obj, s3.f1384d[i5])) {
            if (i5 == i6) {
                return null;
            }
            i5 += i7;
        }
        return s3.x(i5);
    }

    public final boolean h(int i3) {
        return (i3 & this.f1381a) != 0;
    }

    public final boolean i(int i3) {
        return (i3 & this.f1382b) != 0;
    }

    public final n k(int i3, L.d dVar) {
        dVar.getClass();
        dVar.e(dVar.h - 1);
        dVar.f1449f = x(i3);
        Object[] objArr = this.f1384d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f1383c != dVar.f1447d) {
            return new n(0, 0, r2.a.h(objArr, i3), dVar.f1447d);
        }
        this.f1384d = r2.a.h(objArr, i3);
        return this;
    }

    public final n l(int i3, Object obj, Object obj2, int i4, L.d dVar) {
        n l3;
        int H2 = 1 << r2.a.H(i3, i4);
        boolean h = h(H2);
        K.b bVar = this.f1383c;
        if (h) {
            int f3 = f(H2);
            if (!p2.g.a(obj, this.f1384d[f3])) {
                dVar.getClass();
                dVar.e(dVar.h + 1);
                K.b bVar2 = dVar.f1447d;
                if (bVar != bVar2) {
                    return new n(this.f1381a ^ H2, this.f1382b | H2, a(f3, H2, i3, obj, obj2, i4, bVar2), bVar2);
                }
                this.f1384d = a(f3, H2, i3, obj, obj2, i4, bVar2);
                this.f1381a ^= H2;
                this.f1382b |= H2;
                return this;
            }
            dVar.f1449f = x(f3);
            if (x(f3) == obj2) {
                return this;
            }
            if (bVar == dVar.f1447d) {
                this.f1384d[f3 + 1] = obj2;
                return this;
            }
            dVar.f1450g++;
            Object[] objArr = this.f1384d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            p2.g.d(copyOf, "copyOf(this, size)");
            copyOf[f3 + 1] = obj2;
            return new n(this.f1381a, this.f1382b, copyOf, dVar.f1447d);
        }
        if (!i(H2)) {
            dVar.getClass();
            dVar.e(dVar.h + 1);
            K.b bVar3 = dVar.f1447d;
            int f4 = f(H2);
            if (bVar != bVar3) {
                return new n(this.f1381a | H2, this.f1382b, r2.a.g(this.f1384d, f4, obj, obj2), bVar3);
            }
            this.f1384d = r2.a.g(this.f1384d, f4, obj, obj2);
            this.f1381a |= H2;
            return this;
        }
        int t3 = t(H2);
        n s3 = s(t3);
        if (i4 == 30) {
            u2.b N2 = Z.b.N(Z.b.R(0, s3.f1384d.length));
            int i5 = N2.f6300d;
            int i6 = N2.f6301e;
            int i7 = N2.f6302f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!p2.g.a(obj, s3.f1384d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                dVar.f1449f = s3.x(i5);
                if (s3.f1383c == dVar.f1447d) {
                    s3.f1384d[i5 + 1] = obj2;
                    l3 = s3;
                } else {
                    dVar.f1450g++;
                    Object[] objArr2 = s3.f1384d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    p2.g.d(copyOf2, "copyOf(this, size)");
                    copyOf2[i5 + 1] = obj2;
                    l3 = new n(0, 0, copyOf2, dVar.f1447d);
                }
            }
            dVar.getClass();
            dVar.e(dVar.h + 1);
            l3 = new n(0, 0, r2.a.g(s3.f1384d, 0, obj, obj2), dVar.f1447d);
            break;
        }
        l3 = s3.l(i3, obj, obj2, i4 + 5, dVar);
        return s3 == l3 ? this : r(t3, l3, dVar.f1447d);
    }

    public final n m(n nVar, int i3, K.a aVar, L.d dVar) {
        Object[] objArr;
        int i4;
        n j3;
        if (this == nVar) {
            aVar.f1434a += b();
            return this;
        }
        int i5 = 0;
        if (i3 > 30) {
            K.b bVar = dVar.f1447d;
            int i6 = nVar.f1382b;
            Object[] objArr2 = this.f1384d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + nVar.f1384d.length);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            int length = this.f1384d.length;
            u2.b N2 = Z.b.N(Z.b.R(0, nVar.f1384d.length));
            int i7 = N2.f6300d;
            int i8 = N2.f6301e;
            int i9 = N2.f6302f;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    if (c(nVar.f1384d[i7])) {
                        aVar.f1434a++;
                    } else {
                        Object[] objArr3 = nVar.f1384d;
                        copyOf[length] = objArr3[i7];
                        copyOf[length + 1] = objArr3[i7 + 1];
                        length += 2;
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7 += i9;
                }
            }
            if (length == this.f1384d.length) {
                return this;
            }
            if (length == nVar.f1384d.length) {
                return nVar;
            }
            if (length == copyOf.length) {
                return new n(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            p2.g.d(copyOf2, "copyOf(this, newSize)");
            return new n(0, 0, copyOf2, bVar);
        }
        int i10 = this.f1382b | nVar.f1382b;
        int i11 = this.f1381a;
        int i12 = nVar.f1381a;
        int i13 = (i11 ^ i12) & (~i10);
        int i14 = i11 & i12;
        int i15 = i13;
        while (i14 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i14);
            if (p2.g.a(this.f1384d[f(lowestOneBit)], nVar.f1384d[nVar.f(lowestOneBit)])) {
                i15 |= lowestOneBit;
            } else {
                i10 |= lowestOneBit;
            }
            i14 ^= lowestOneBit;
        }
        if (!((i10 & i15) == 0)) {
            C0032d.I("Check failed.");
            throw null;
        }
        n nVar2 = (p2.g.a(this.f1383c, dVar.f1447d) && this.f1381a == i15 && this.f1382b == i10) ? this : new n(i15, i10, new Object[Integer.bitCount(i10) + (Integer.bitCount(i15) * 2)], null);
        int i16 = i10;
        int i17 = 0;
        while (i16 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i16);
            Object[] objArr4 = nVar2.f1384d;
            int length2 = (objArr4.length - 1) - i17;
            if (i(lowestOneBit2)) {
                j3 = s(t(lowestOneBit2));
                if (nVar.i(lowestOneBit2)) {
                    j3 = j3.m(nVar.s(nVar.t(lowestOneBit2)), i3 + 5, aVar, dVar);
                } else if (nVar.h(lowestOneBit2)) {
                    int f3 = nVar.f(lowestOneBit2);
                    Object obj = nVar.f1384d[f3];
                    Object x3 = nVar.x(f3);
                    int i18 = dVar.h;
                    objArr = objArr4;
                    j3 = j3.l(obj != null ? obj.hashCode() : i5, obj, x3, i3 + 5, dVar);
                    if (dVar.h == i18) {
                        aVar.f1434a++;
                    }
                    i4 = lowestOneBit2;
                }
                objArr = objArr4;
                i4 = lowestOneBit2;
            } else {
                objArr = objArr4;
                i4 = lowestOneBit2;
                if (nVar.i(i4)) {
                    j3 = nVar.s(nVar.t(i4));
                    if (h(i4)) {
                        int f4 = f(i4);
                        Object obj2 = this.f1384d[f4];
                        int i19 = i3 + 5;
                        if (j3.d(obj2 != null ? obj2.hashCode() : 0, i19, obj2)) {
                            aVar.f1434a++;
                        } else {
                            j3 = j3.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f4), i19, dVar);
                        }
                    }
                } else {
                    int f5 = f(i4);
                    Object obj3 = this.f1384d[f5];
                    Object x4 = x(f5);
                    int f6 = nVar.f(i4);
                    Object obj4 = nVar.f1384d[f6];
                    j3 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x4, obj4 != null ? obj4.hashCode() : 0, obj4, nVar.x(f6), i3 + 5, dVar.f1447d);
                }
            }
            objArr[length2] = j3;
            i17++;
            i16 ^= i4;
            i5 = 0;
        }
        int i20 = 0;
        while (i15 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i15);
            int i21 = i20 * 2;
            if (nVar.h(lowestOneBit3)) {
                int f7 = nVar.f(lowestOneBit3);
                Object[] objArr5 = nVar2.f1384d;
                objArr5[i21] = nVar.f1384d[f7];
                objArr5[i21 + 1] = nVar.x(f7);
                if (h(lowestOneBit3)) {
                    aVar.f1434a++;
                }
            } else {
                int f8 = f(lowestOneBit3);
                Object[] objArr6 = nVar2.f1384d;
                objArr6[i21] = this.f1384d[f8];
                objArr6[i21 + 1] = x(f8);
            }
            i20++;
            i15 ^= lowestOneBit3;
        }
        return e(nVar2) ? this : nVar.e(nVar2) ? nVar : nVar2;
    }

    public final n n(int i3, Object obj, int i4, L.d dVar) {
        n n2;
        int H2 = 1 << r2.a.H(i3, i4);
        if (h(H2)) {
            int f3 = f(H2);
            return p2.g.a(obj, this.f1384d[f3]) ? p(f3, H2, dVar) : this;
        }
        if (!i(H2)) {
            return this;
        }
        int t3 = t(H2);
        n s3 = s(t3);
        if (i4 == 30) {
            u2.b N2 = Z.b.N(Z.b.R(0, s3.f1384d.length));
            int i5 = N2.f6300d;
            int i6 = N2.f6301e;
            int i7 = N2.f6302f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!p2.g.a(obj, s3.f1384d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                n2 = s3.k(i5, dVar);
            }
            n2 = s3;
            break;
        }
        n2 = s3.n(i3, obj, i4 + 5, dVar);
        return q(s3, n2, t3, H2, dVar.f1447d);
    }

    public final n o(int i3, Object obj, Object obj2, int i4, L.d dVar) {
        n o3;
        int H2 = 1 << r2.a.H(i3, i4);
        if (h(H2)) {
            int f3 = f(H2);
            return (p2.g.a(obj, this.f1384d[f3]) && p2.g.a(obj2, x(f3))) ? p(f3, H2, dVar) : this;
        }
        if (!i(H2)) {
            return this;
        }
        int t3 = t(H2);
        n s3 = s(t3);
        if (i4 == 30) {
            u2.b N2 = Z.b.N(Z.b.R(0, s3.f1384d.length));
            int i5 = N2.f6300d;
            int i6 = N2.f6301e;
            int i7 = N2.f6302f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (!p2.g.a(obj, s3.f1384d[i5]) || !p2.g.a(obj2, s3.x(i5))) {
                        if (i5 == i6) {
                            break;
                        }
                        i5 += i7;
                    } else {
                        o3 = s3.k(i5, dVar);
                        break;
                    }
                }
            }
            o3 = s3;
        } else {
            o3 = s3.o(i3, obj, obj2, i4 + 5, dVar);
        }
        return q(s3, o3, t3, H2, dVar.f1447d);
    }

    public final n p(int i3, int i4, L.d dVar) {
        dVar.getClass();
        dVar.e(dVar.h - 1);
        dVar.f1449f = x(i3);
        Object[] objArr = this.f1384d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f1383c != dVar.f1447d) {
            return new n(i4 ^ this.f1381a, this.f1382b, r2.a.h(objArr, i3), dVar.f1447d);
        }
        this.f1384d = r2.a.h(objArr, i3);
        this.f1381a ^= i4;
        return this;
    }

    public final n q(n nVar, n nVar2, int i3, int i4, K.b bVar) {
        K.b bVar2 = this.f1383c;
        if (nVar2 == null) {
            Object[] objArr = this.f1384d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 != bVar) {
                return new n(this.f1381a, i4 ^ this.f1382b, r2.a.i(objArr, i3), bVar);
            }
            this.f1384d = r2.a.i(objArr, i3);
            this.f1382b ^= i4;
        } else if (bVar2 == bVar || nVar != nVar2) {
            return r(i3, nVar2, bVar);
        }
        return this;
    }

    public final n r(int i3, n nVar, K.b bVar) {
        Object[] objArr = this.f1384d;
        if (objArr.length == 1 && nVar.f1384d.length == 2 && nVar.f1382b == 0) {
            nVar.f1381a = this.f1382b;
            return nVar;
        }
        if (this.f1383c == bVar) {
            objArr[i3] = nVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p2.g.d(copyOf, "copyOf(this, size)");
        copyOf[i3] = nVar;
        return new n(this.f1381a, this.f1382b, copyOf, bVar);
    }

    public final n s(int i3) {
        Object obj = this.f1384d[i3];
        p2.g.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (n) obj;
    }

    public final int t(int i3) {
        return (this.f1384d.length - 1) - Integer.bitCount((i3 - 1) & this.f1382b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I.m u(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I.n.u(int, java.lang.Object, java.lang.Object, int):I.m");
    }

    public final n v(int i3, U u3, int i4) {
        n v3;
        int H2 = 1 << r2.a.H(i3, i4);
        if (h(H2)) {
            int f3 = f(H2);
            if (!p2.g.a(u3, this.f1384d[f3])) {
                return this;
            }
            Object[] objArr = this.f1384d;
            if (objArr.length == 2) {
                return null;
            }
            return new n(this.f1381a ^ H2, this.f1382b, r2.a.h(objArr, f3), null);
        }
        if (!i(H2)) {
            return this;
        }
        int t3 = t(H2);
        n s3 = s(t3);
        if (i4 == 30) {
            u2.b N2 = Z.b.N(Z.b.R(0, s3.f1384d.length));
            int i5 = N2.f6300d;
            int i6 = N2.f6301e;
            int i7 = N2.f6302f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (!p2.g.a(u3, s3.f1384d[i5])) {
                    if (i5 != i6) {
                        i5 += i7;
                    }
                }
                Object[] objArr2 = s3.f1384d;
                v3 = objArr2.length == 2 ? null : new n(0, 0, r2.a.h(objArr2, i5), null);
            }
            v3 = s3;
            break;
        }
        v3 = s3.v(i3, u3, i4 + 5);
        if (v3 != null) {
            return s3 != v3 ? w(t3, H2, v3) : this;
        }
        Object[] objArr3 = this.f1384d;
        if (objArr3.length == 1) {
            return null;
        }
        return new n(this.f1381a, H2 ^ this.f1382b, r2.a.i(objArr3, t3), null);
    }

    public final n w(int i3, int i4, n nVar) {
        Object[] objArr = nVar.f1384d;
        if (objArr.length != 2 || nVar.f1382b != 0) {
            Object[] objArr2 = this.f1384d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            p2.g.d(copyOf, "copyOf(this, newSize)");
            copyOf[i3] = nVar;
            return new n(this.f1381a, this.f1382b, copyOf, null);
        }
        if (this.f1384d.length == 1) {
            nVar.f1381a = this.f1382b;
            return nVar;
        }
        int f3 = f(i4);
        Object[] objArr3 = this.f1384d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        p2.g.d(copyOf2, "copyOf(this, newSize)");
        AbstractC0239j.Y(copyOf2, copyOf2, i3 + 2, i3 + 1, objArr3.length);
        AbstractC0239j.Y(copyOf2, copyOf2, f3 + 2, f3, i3);
        copyOf2[f3] = obj;
        copyOf2[f3 + 1] = obj2;
        return new n(this.f1381a ^ i4, i4 ^ this.f1382b, copyOf2, null);
    }

    public final Object x(int i3) {
        return this.f1384d[i3 + 1];
    }
}
