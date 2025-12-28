package n0;

import java.util.List;
import l0.C0356f;
import l0.InterfaceC0361k;

/* renamed from: n0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434o extends AbstractC0419M {
    @Override // n0.AbstractC0418L
    public final int M(C0356f c0356f) {
        C0412F c0412f = this.f5168n.f5217n.f5320y.f5147r;
        p2.g.b(c0412f);
        C0415I c0415i = c0412f.f5102z;
        int i3 = c0415i.f5132b;
        C0407A c0407a = c0412f.f5095s;
        if (i3 == 2) {
            c0407a.f5072d = true;
            if (c0407a.f5070b) {
                c0415i.f5137g = true;
                c0415i.h = true;
            }
        } else {
            c0407a.f5073e = true;
        }
        C0434o c0434o = c0412f.A().f5276L;
        if (c0434o != null) {
            c0434o.f5164j = true;
        }
        c0412f.d();
        C0434o c0434o2 = c0412f.A().f5276L;
        if (c0434o2 != null) {
            c0434o2.f5164j = false;
        }
        Integer num = (Integer) c0407a.f5075g.get(c0356f);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f5173s.put(c0356f, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // l0.InterfaceC0360j
    public final l0.o a(long j3) {
        List f3;
        K(j3);
        Y y3 = this.f5168n;
        F.d n2 = y3.f5217n.n();
        int i3 = n2.f1160f;
        if (i3 > 0) {
            Object[] objArr = n2.f1158d;
            int i4 = 0;
            do {
                C0412F c0412f = ((C0444z) objArr[i4]).f5320y.f5147r;
                p2.g.b(c0412f);
                c0412f.f5088l = 3;
                i4++;
            } while (i4 < i3);
        }
        C0444z c0444z = y3.f5217n;
        InterfaceC0361k interfaceC0361k = c0444z.f5313r;
        C0412F c0412f2 = c0444z.f5320y.f5147r;
        p2.g.b(c0412f2);
        C0415I c0415i = c0412f2.f5102z;
        c0415i.f5131a.h();
        boolean z3 = c0412f2.f5097u;
        F.d dVar = c0412f2.f5096t;
        if (z3) {
            C0444z c0444z2 = c0415i.f5131a;
            F.d n3 = c0444z2.n();
            int i5 = n3.f1160f;
            if (i5 > 0) {
                Object[] objArr2 = n3.f1158d;
                int i6 = 0;
                do {
                    C0444z c0444z3 = (C0444z) objArr2[i6];
                    if (dVar.f1160f <= i6) {
                        C0412F c0412f3 = c0444z3.f5320y.f5147r;
                        p2.g.b(c0412f3);
                        dVar.b(c0412f3);
                    } else {
                        C0412F c0412f4 = c0444z3.f5320y.f5147r;
                        p2.g.b(c0412f4);
                        Object[] objArr3 = dVar.f1158d;
                        Object obj = objArr3[i6];
                        objArr3[i6] = c0412f4;
                    }
                    i6++;
                } while (i6 < i5);
            }
            dVar.n(((F.a) c0444z2.h()).f1152d.f1160f, dVar.f1160f);
            c0412f2.f5097u = false;
            f3 = dVar.f();
        } else {
            f3 = dVar.f();
        }
        AbstractC0419M.e0(this, interfaceC0361k.f(this, f3, j3));
        return this;
    }

    @Override // n0.AbstractC0419M
    public final void f0() {
        C0412F c0412f = this.f5168n.f5217n.f5320y.f5147r;
        p2.g.b(c0412f);
        c0412f.R();
    }
}
