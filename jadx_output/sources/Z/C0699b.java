package z;

import W.AbstractC0081d;
import android.view.View;
import java.util.LinkedHashMap;
import n0.AbstractC0409C;
import n0.C0408B;
import o0.S;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699b extends w implements InterfaceC0716s {

    /* renamed from: A, reason: collision with root package name */
    public C0715r f6854A;

    /* renamed from: B, reason: collision with root package name */
    public t f6855B;

    @Override // z.InterfaceC0716s
    public final void F() {
        this.f6855B = null;
        AbstractC0409C.k(this);
    }

    @Override // P.k
    public final void Z() {
        C0715r c0715r = this.f6854A;
        if (c0715r != null) {
            F();
            M.c cVar = c0715r.f6894g;
            t tVar = (t) cVar.f1517a.get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = cVar.f1517a;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                c0715r.f6893f.add(tVar);
            }
        }
    }

    @Override // z.w
    public final void f0(s.i iVar, long j3, float f3) {
        C0715r c0715r = this.f6854A;
        if (c0715r == null) {
            c0715r = AbstractC0693A.a(AbstractC0693A.b((View) AbstractC0409C.h(this, S.f5498f)));
            this.f6854A = c0715r;
            p2.g.b(c0715r);
        }
        t a3 = c0715r.a(this);
        int U2 = r2.a.U(f3);
        long z3 = this.f6907t.z();
        C0705h c0705h = (C0705h) this.f6908u.c();
        a3.b(iVar, this.f6905r, j3, U2, z3, c0705h.f6870d, new A0.c(22, this));
        this.f6855B = a3;
        AbstractC0409C.k(this);
    }

    @Override // z.w
    public final void g0(C0408B c0408b) {
        W.o j3 = c0408b.f5076d.f2770e.j();
        t tVar = this.f6855B;
        if (tVar != null) {
            tVar.e(this.f6911x, this.f6907t.z(), ((C0705h) this.f6908u.c()).f6870d);
            tVar.draw(AbstractC0081d.a(j3));
        }
    }

    @Override // z.w
    public final void i0(s.i iVar) {
        t tVar = this.f6855B;
        if (tVar != null) {
            tVar.d();
        }
    }
}
