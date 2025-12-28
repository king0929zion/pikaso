package U;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import c2.C0174m;
import n.C0375B;
import n0.AbstractC0409C;
import n0.AbstractC0428i;
import o0.C0507u;
import q0.AbstractC0568f;
import q0.AbstractC0569g;
import q0.C0566d;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends p2.f implements o2.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2333l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i3, obj, cls, str, str2, i4);
        this.f2333l = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o2.a
    public final Object c() {
        C0375B c0375b;
        e eVar;
        C0375B c0375b2;
        Object[] objArr;
        long[] jArr;
        C0375B c0375b3;
        e eVar2;
        C0375B c0375b4;
        Object[] objArr2;
        long[] jArr2;
        F.d dVar;
        F.d dVar2;
        C0375B c0375b5;
        e eVar3;
        C0375B c0375b6;
        C0375B c0375b7;
        int i3;
        F.d dVar3;
        Object[] objArr3;
        long[] jArr3;
        Object[] objArr4;
        long[] jArr4;
        int i4;
        F.d dVar4;
        F.d dVar5;
        Object[] objArr5;
        long[] jArr5;
        int i5;
        ContentCaptureSession a3;
        switch (this.f2333l) {
            case 0:
                e eVar4 = (e) this.f5945e;
                C0375B c0375b8 = eVar4.f2338e;
                Object[] objArr6 = c0375b8.f4961b;
                long[] jArr6 = c0375b8.f4960a;
                int length = jArr6.length - 2;
                char c3 = 7;
                long j3 = -9187201950435737472L;
                C0375B c0375b9 = eVar4.f2336c;
                int i6 = 8;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j4 = jArr6[i7];
                        if ((((~j4) << c3) & j4 & j3) != j3) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j4 & 255) < 128) {
                                    P.k kVar = (P.k) ((l) objArr6[(i7 << 3) + i9]);
                                    P.k kVar2 = kVar.f2088d;
                                    if (kVar2.f2099p) {
                                        F.d dVar6 = null;
                                        while (kVar2 != null) {
                                            if (kVar2 instanceof q) {
                                                c0375b9.a((q) kVar2);
                                            } else if ((kVar2.f2090f & 1024) != 0 && (kVar2 instanceof AbstractC0428i)) {
                                                P.k kVar3 = ((AbstractC0428i) kVar2).f5256r;
                                                objArr5 = objArr6;
                                                int i10 = 0;
                                                while (kVar3 != null) {
                                                    long[] jArr7 = jArr6;
                                                    if ((kVar3.f2090f & 1024) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            kVar2 = kVar3;
                                                        } else {
                                                            if (dVar6 == null) {
                                                                i5 = i10;
                                                                dVar6 = new F.d(new P.k[16]);
                                                            } else {
                                                                i5 = i10;
                                                            }
                                                            if (kVar2 != null) {
                                                                dVar6.b(kVar2);
                                                                kVar2 = null;
                                                            }
                                                            dVar6.b(kVar3);
                                                            i10 = i5;
                                                        }
                                                    }
                                                    kVar3 = kVar3.f2092i;
                                                    jArr6 = jArr7;
                                                }
                                                jArr5 = jArr6;
                                                if (i10 == 1) {
                                                    objArr6 = objArr5;
                                                    jArr6 = jArr5;
                                                }
                                                kVar2 = AbstractC0409C.e(dVar6);
                                                objArr6 = objArr5;
                                                jArr6 = jArr5;
                                            }
                                            objArr5 = objArr6;
                                            jArr5 = jArr6;
                                            kVar2 = AbstractC0409C.e(dVar6);
                                            objArr6 = objArr5;
                                            jArr6 = jArr5;
                                        }
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                        P.k kVar4 = kVar.f2088d;
                                        if (!kVar4.f2099p) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        F.d dVar7 = new F.d(new P.k[16]);
                                        P.k kVar5 = kVar4.f2092i;
                                        if (kVar5 == null) {
                                            AbstractC0409C.b(dVar7, kVar4);
                                        } else {
                                            dVar7.b(kVar5);
                                        }
                                        while (dVar7.k()) {
                                            P.k kVar6 = (P.k) dVar7.m(dVar7.f1160f - 1);
                                            if ((kVar6.f2091g & 1024) == 0) {
                                                AbstractC0409C.b(dVar7, kVar6);
                                            } else {
                                                while (true) {
                                                    if (kVar6 == null) {
                                                        break;
                                                    }
                                                    if ((kVar6.f2090f & 1024) != 0) {
                                                        F.d dVar8 = null;
                                                        while (kVar6 != null) {
                                                            if (kVar6 instanceof q) {
                                                                c0375b9.a((q) kVar6);
                                                            } else if ((kVar6.f2090f & 1024) != 0 && (kVar6 instanceof AbstractC0428i)) {
                                                                P.k kVar7 = ((AbstractC0428i) kVar6).f5256r;
                                                                int i11 = 0;
                                                                while (kVar7 != null) {
                                                                    if ((kVar7.f2090f & 1024) != 0) {
                                                                        i11++;
                                                                        if (i11 == 1) {
                                                                            dVar5 = dVar7;
                                                                            kVar6 = kVar7;
                                                                        } else {
                                                                            if (dVar8 == null) {
                                                                                dVar5 = dVar7;
                                                                                dVar8 = new F.d(new P.k[16]);
                                                                            } else {
                                                                                dVar5 = dVar7;
                                                                            }
                                                                            if (kVar6 != null) {
                                                                                dVar8.b(kVar6);
                                                                                kVar6 = null;
                                                                            }
                                                                            dVar8.b(kVar7);
                                                                        }
                                                                    } else {
                                                                        dVar5 = dVar7;
                                                                    }
                                                                    kVar7 = kVar7.f2092i;
                                                                    dVar7 = dVar5;
                                                                }
                                                                dVar4 = dVar7;
                                                                if (i11 == 1) {
                                                                    dVar7 = dVar4;
                                                                }
                                                                kVar6 = AbstractC0409C.e(dVar8);
                                                                dVar7 = dVar4;
                                                            }
                                                            dVar4 = dVar7;
                                                            kVar6 = AbstractC0409C.e(dVar8);
                                                            dVar7 = dVar4;
                                                        }
                                                    } else {
                                                        kVar6 = kVar6.f2092i;
                                                        dVar7 = dVar7;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        objArr4 = objArr6;
                                        jArr4 = jArr6;
                                    }
                                    i4 = 8;
                                } else {
                                    objArr4 = objArr6;
                                    jArr4 = jArr6;
                                    i4 = i6;
                                }
                                j4 >>= i4;
                                i9++;
                                i6 = i4;
                                objArr6 = objArr4;
                                jArr6 = jArr4;
                            }
                            objArr3 = objArr6;
                            jArr3 = jArr6;
                            if (i8 != i6) {
                            }
                        } else {
                            objArr3 = objArr6;
                            jArr3 = jArr6;
                        }
                        if (i7 != length) {
                            i7++;
                            objArr6 = objArr3;
                            jArr6 = jArr3;
                            c3 = 7;
                            i6 = 8;
                            j3 = -9187201950435737472L;
                        }
                    }
                }
                c0375b8.b();
                C0375B c0375b10 = eVar4.f2337d;
                Object[] objArr7 = c0375b10.f4961b;
                long[] jArr8 = c0375b10.f4960a;
                int length2 = jArr8.length - 2;
                C0375B c0375b11 = eVar4.f2339f;
                if (length2 >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j5 = jArr8[i12];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j5 & 255) < 128) {
                                    b bVar = (b) objArr7[(i12 << 3) + i14];
                                    P.k kVar8 = (P.k) bVar;
                                    objArr2 = objArr7;
                                    P.k kVar9 = kVar8.f2088d;
                                    jArr2 = jArr8;
                                    boolean z3 = kVar9.f2099p;
                                    p pVar = p.f2363f;
                                    if (z3) {
                                        boolean z4 = false;
                                        P.k kVar10 = kVar9;
                                        boolean z5 = true;
                                        q qVar = null;
                                        F.d dVar9 = null;
                                        while (kVar10 != null) {
                                            p pVar2 = pVar;
                                            if (kVar10 instanceof q) {
                                                q qVar2 = (q) kVar10;
                                                if (qVar != null) {
                                                    z4 = true;
                                                }
                                                if (c0375b9.c(qVar2)) {
                                                    c0375b11.a(qVar2);
                                                    z5 = false;
                                                }
                                                c0375b5 = c0375b10;
                                                eVar3 = eVar4;
                                                c0375b6 = c0375b8;
                                                qVar = qVar2;
                                            } else if ((kVar10.f2090f & 1024) == 0 || !(kVar10 instanceof AbstractC0428i)) {
                                                c0375b5 = c0375b10;
                                                eVar3 = eVar4;
                                                c0375b6 = c0375b8;
                                            } else {
                                                P.k kVar11 = ((AbstractC0428i) kVar10).f5256r;
                                                c0375b6 = c0375b8;
                                                int i15 = 0;
                                                while (kVar11 != null) {
                                                    e eVar5 = eVar4;
                                                    if ((kVar11.f2090f & 1024) != 0) {
                                                        i15++;
                                                        if (i15 == 1) {
                                                            c0375b7 = c0375b10;
                                                            kVar10 = kVar11;
                                                        } else {
                                                            if (dVar9 == null) {
                                                                c0375b7 = c0375b10;
                                                                i3 = i15;
                                                                dVar3 = new F.d(new P.k[16]);
                                                            } else {
                                                                c0375b7 = c0375b10;
                                                                i3 = i15;
                                                                dVar3 = dVar9;
                                                            }
                                                            if (kVar10 != null) {
                                                                dVar3.b(kVar10);
                                                                kVar10 = null;
                                                            }
                                                            dVar3.b(kVar11);
                                                            dVar9 = dVar3;
                                                            i15 = i3;
                                                        }
                                                    } else {
                                                        c0375b7 = c0375b10;
                                                    }
                                                    kVar11 = kVar11.f2092i;
                                                    eVar4 = eVar5;
                                                    c0375b10 = c0375b7;
                                                }
                                                c0375b5 = c0375b10;
                                                eVar3 = eVar4;
                                                if (i15 == 1) {
                                                    pVar = pVar2;
                                                    c0375b8 = c0375b6;
                                                    eVar4 = eVar3;
                                                    c0375b10 = c0375b5;
                                                }
                                            }
                                            kVar10 = AbstractC0409C.e(dVar9);
                                            pVar = pVar2;
                                            c0375b8 = c0375b6;
                                            eVar4 = eVar3;
                                            c0375b10 = c0375b5;
                                        }
                                        c0375b3 = c0375b10;
                                        eVar2 = eVar4;
                                        c0375b4 = c0375b8;
                                        p pVar3 = pVar;
                                        P.k kVar12 = kVar8.f2088d;
                                        if (!kVar12.f2099p) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        F.d dVar10 = new F.d(new P.k[16]);
                                        P.k kVar13 = kVar12.f2092i;
                                        if (kVar13 == null) {
                                            AbstractC0409C.b(dVar10, kVar12);
                                        } else {
                                            dVar10.b(kVar13);
                                        }
                                        while (dVar10.k()) {
                                            P.k kVar14 = (P.k) dVar10.m(dVar10.f1160f - 1);
                                            if ((kVar14.f2091g & 1024) == 0) {
                                                AbstractC0409C.b(dVar10, kVar14);
                                            } else {
                                                while (kVar14 != null) {
                                                    if ((kVar14.f2090f & 1024) != 0) {
                                                        F.d dVar11 = null;
                                                        while (kVar14 != null) {
                                                            if (kVar14 instanceof q) {
                                                                q qVar3 = (q) kVar14;
                                                                if (qVar != null) {
                                                                    z4 = true;
                                                                }
                                                                if (c0375b9.c(qVar3)) {
                                                                    c0375b11.a(qVar3);
                                                                    z5 = false;
                                                                }
                                                                qVar = qVar3;
                                                            } else if ((kVar14.f2090f & 1024) != 0 && (kVar14 instanceof AbstractC0428i)) {
                                                                P.k kVar15 = ((AbstractC0428i) kVar14).f5256r;
                                                                int i16 = 0;
                                                                while (kVar15 != null) {
                                                                    if ((kVar15.f2090f & 1024) != 0) {
                                                                        i16++;
                                                                        if (i16 == 1) {
                                                                            dVar2 = dVar10;
                                                                            kVar14 = kVar15;
                                                                        } else {
                                                                            if (dVar11 == null) {
                                                                                dVar2 = dVar10;
                                                                                dVar11 = new F.d(new P.k[16]);
                                                                            } else {
                                                                                dVar2 = dVar10;
                                                                            }
                                                                            if (kVar14 != null) {
                                                                                dVar11.b(kVar14);
                                                                                kVar14 = null;
                                                                            }
                                                                            dVar11.b(kVar15);
                                                                            kVar15 = kVar15.f2092i;
                                                                            dVar10 = dVar2;
                                                                        }
                                                                    } else {
                                                                        dVar2 = dVar10;
                                                                    }
                                                                    kVar15 = kVar15.f2092i;
                                                                    dVar10 = dVar2;
                                                                }
                                                                dVar = dVar10;
                                                                if (i16 == 1) {
                                                                    dVar10 = dVar;
                                                                }
                                                                kVar14 = AbstractC0409C.e(dVar11);
                                                                dVar10 = dVar;
                                                            }
                                                            dVar = dVar10;
                                                            kVar14 = AbstractC0409C.e(dVar11);
                                                            dVar10 = dVar;
                                                        }
                                                    } else {
                                                        kVar14 = kVar14.f2092i;
                                                        dVar10 = dVar10;
                                                    }
                                                }
                                            }
                                            dVar10 = dVar10;
                                        }
                                        if (z5) {
                                            bVar.z(z4 ? c.o(bVar) : qVar != null ? qVar.h0() : pVar3);
                                        }
                                        j5 >>= 8;
                                        i14++;
                                        objArr7 = objArr2;
                                        jArr8 = jArr2;
                                        c0375b8 = c0375b4;
                                        eVar4 = eVar2;
                                        c0375b10 = c0375b3;
                                    } else {
                                        bVar.z(pVar);
                                        c0375b3 = c0375b10;
                                        eVar2 = eVar4;
                                        c0375b4 = c0375b8;
                                    }
                                } else {
                                    c0375b3 = c0375b10;
                                    eVar2 = eVar4;
                                    c0375b4 = c0375b8;
                                    objArr2 = objArr7;
                                    jArr2 = jArr8;
                                }
                                j5 >>= 8;
                                i14++;
                                objArr7 = objArr2;
                                jArr8 = jArr2;
                                c0375b8 = c0375b4;
                                eVar4 = eVar2;
                                c0375b10 = c0375b3;
                            }
                            c0375b = c0375b10;
                            eVar = eVar4;
                            c0375b2 = c0375b8;
                            objArr = objArr7;
                            jArr = jArr8;
                            if (i13 != 8) {
                            }
                        } else {
                            c0375b = c0375b10;
                            eVar = eVar4;
                            c0375b2 = c0375b8;
                            objArr = objArr7;
                            jArr = jArr8;
                        }
                        if (i12 != length2) {
                            i12++;
                            objArr7 = objArr;
                            jArr8 = jArr;
                            c0375b8 = c0375b2;
                            eVar4 = eVar;
                            c0375b10 = c0375b;
                        }
                    }
                } else {
                    c0375b = c0375b10;
                    eVar = eVar4;
                    c0375b2 = c0375b8;
                }
                c0375b.b();
                Object[] objArr8 = c0375b9.f4961b;
                long[] jArr9 = c0375b9.f4960a;
                int length3 = jArr9.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j6 = jArr9[i17];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j6 & 255) < 128) {
                                    q qVar4 = (q) objArr8[(i17 << 3) + i19];
                                    if (qVar4.f2099p) {
                                        p h02 = qVar4.h0();
                                        qVar4.k0();
                                        if (h02 != qVar4.h0() || c0375b11.c(qVar4)) {
                                            c.A(qVar4);
                                        }
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i18 != 8) {
                            }
                        }
                        if (i17 != length3) {
                            i17++;
                        }
                    }
                }
                c0375b9.b();
                c0375b11.b();
                eVar.f2335b.c();
                if (!c0375b2.g()) {
                    Z0.d.S("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!c0375b.g()) {
                    Z0.d.S("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (c0375b9.g()) {
                    return C0174m.f3840a;
                }
                Z0.d.S("Unprocessed FocusTarget nodes");
                throw null;
            case 1:
                androidx.compose.ui.focus.a aVar = (androidx.compose.ui.focus.a) this.f5945e;
                if (aVar.f3319d.h0() == p.f2363f) {
                    aVar.f3317b.c();
                }
                return C0174m.f3840a;
            case 2:
                View view = (View) this.f5945e;
                int i20 = Build.VERSION.SDK_INT;
                if (i20 >= 30) {
                    AbstractC0569g.a(view, 1);
                }
                if (i20 < 29 || (a3 = AbstractC0568f.a(view)) == null) {
                    return null;
                }
                return new C0566d(a3, view);
            default:
                C0507u c0507u = (C0507u) this.f5945e;
                if (c0507u.isFocused() || c0507u.hasFocus()) {
                    c0507u.clearFocus();
                }
                return C0174m.f3840a;
        }
    }
}
