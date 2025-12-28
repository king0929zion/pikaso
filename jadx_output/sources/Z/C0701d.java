package z;

import n.C0405y;
import n0.AbstractC0409C;
import n0.C0408B;
import p.C0535d;
import y2.AbstractC0688v;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701d extends w {

    /* renamed from: A, reason: collision with root package name */
    public final C0405y f6859A;

    public C0701d(s.g gVar, boolean z3, float f3, A.t tVar, A.u uVar) {
        super(gVar, z3, f3, tVar, uVar);
        this.f6859A = new C0405y();
    }

    @Override // P.k
    public final void Z() {
        this.f6859A.a();
    }

    @Override // z.w
    public final void f0(s.i iVar, long j3, float f3) {
        C0405y c0405y = this.f6859A;
        Object[] objArr = c0405y.f5053b;
        Object[] objArr2 = c0405y.f5054c;
        long[] jArr = c0405y.f5052a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j4 = jArr[i3];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            int i6 = (i3 << 3) + i5;
                            ((C0713p) objArr2[i6]).b();
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        boolean z3 = this.f6905r;
        C0713p c0713p = new C0713p(z3 ? new V.c(iVar.f6118a) : null, f3, z3);
        c0405y.j(iVar, c0713p);
        AbstractC0688v.l(U(), null, 0, new C0700c(c0713p, this, iVar, null), 3);
        AbstractC0409C.k(this);
    }

    @Override // z.w
    public final void g0(C0408B c0408b) {
        float f3;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        int i3;
        float f4;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i4;
        int i5;
        int i6;
        C0701d c0701d = this;
        float f5 = ((C0705h) c0701d.f6908u.c()).f6870d;
        if (f5 == 0.0f) {
            return;
        }
        C0405y c0405y = c0701d.f6859A;
        Object[] objArr5 = c0405y.f5053b;
        Object[] objArr6 = c0405y.f5054c;
        long[] jArr3 = c0405y.f5052a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr3[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((255 & j3) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr5[i11];
                        C0713p c0713p = (C0713p) objArr6[i11];
                        i4 = i7;
                        long b3 = W.r.b(c0701d.f6907t.z(), f5);
                        Float f6 = c0713p.f6883d;
                        Y.b bVar = c0408b.f5076d;
                        if (f6 == null) {
                            long L2 = bVar.L();
                            float f7 = AbstractC0714q.f6890a;
                            c0713p.f6883d = Float.valueOf(Math.max(V.f.d(L2), V.f.b(L2)) * 0.3f);
                        }
                        if (c0713p.f6880a == null) {
                            jArr2 = jArr3;
                            f4 = f5;
                            c0713p.f6880a = new V.c(bVar.k());
                        } else {
                            f4 = f5;
                            jArr2 = jArr3;
                        }
                        if (c0713p.f6884e == null) {
                            c0713p.f6884e = new V.c(r2.a.f(V.f.d(bVar.L()) / 2.0f, V.f.b(bVar.L()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) c0713p.f6889k.getValue()).booleanValue() || ((Boolean) c0713p.f6888j.getValue()).booleanValue()) ? ((Number) c0713p.f6885f.c()).floatValue() : 1.0f;
                        Float f8 = c0713p.f6883d;
                        p2.g.b(f8);
                        float floatValue2 = f8.floatValue();
                        float floatValue3 = ((Number) c0713p.f6886g.c()).floatValue();
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                        float f9 = 1;
                        float f10 = (floatValue3 * c0713p.f6881b) + ((f9 - floatValue3) * floatValue2);
                        V.c cVar = c0713p.f6880a;
                        p2.g.b(cVar);
                        float b4 = V.c.b(cVar.f2444a);
                        V.c cVar2 = c0713p.f6884e;
                        p2.g.b(cVar2);
                        float b5 = V.c.b(cVar2.f2444a);
                        C0535d c0535d = c0713p.h;
                        float floatValue4 = ((Number) c0535d.c()).floatValue();
                        float f11 = (floatValue4 * b5) + ((f9 - floatValue4) * b4);
                        V.c cVar3 = c0713p.f6880a;
                        p2.g.b(cVar3);
                        i5 = i9;
                        float c3 = V.c.c(cVar3.f2444a);
                        V.c cVar4 = c0713p.f6884e;
                        p2.g.b(cVar4);
                        float c4 = V.c.c(cVar4.f2444a);
                        float floatValue5 = ((Number) c0535d.c()).floatValue();
                        long f12 = r2.a.f(f11, (floatValue5 * c4) + ((f9 - floatValue5) * c3));
                        long b6 = W.r.b(b3, W.r.d(b3) * floatValue);
                        if (c0713p.f6882c) {
                            float d3 = V.f.d(bVar.L());
                            float b7 = V.f.b(bVar.L());
                            B0.a aVar = bVar.f2770e;
                            long r3 = aVar.r();
                            aVar.j().d();
                            ((B0.a) ((A.t) aVar.f271b).f175e).j().n(0.0f, 0.0f, d3, b7, 1);
                            Y.d.i(c0408b, b6, f10, f12, 120);
                            aVar.j().a();
                            aVar.J(r3);
                        } else {
                            Y.d.i(c0408b, b6, f10, f12, 120);
                        }
                        i6 = 8;
                    } else {
                        f4 = f5;
                        jArr2 = jArr3;
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                        i4 = i7;
                        i5 = i9;
                        i6 = i8;
                    }
                    j3 >>= i6;
                    i10++;
                    i8 = i6;
                    jArr3 = jArr2;
                    i7 = i4;
                    f5 = f4;
                    objArr5 = objArr3;
                    objArr6 = objArr4;
                    i9 = i5;
                    c0701d = this;
                }
                f3 = f5;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
                int i12 = i7;
                if (i9 != i8) {
                    return;
                } else {
                    i3 = i12;
                }
            } else {
                f3 = f5;
                jArr = jArr3;
                objArr = objArr5;
                objArr2 = objArr6;
                i3 = i7;
            }
            if (i3 == length) {
                return;
            }
            i7 = i3 + 1;
            c0701d = this;
            jArr3 = jArr;
            f5 = f3;
            objArr5 = objArr;
            objArr6 = objArr2;
        }
    }

    @Override // z.w
    public final void i0(s.i iVar) {
        C0713p c0713p = (C0713p) this.f6859A.e(iVar);
        if (c0713p != null) {
            c0713p.b();
        }
    }
}
