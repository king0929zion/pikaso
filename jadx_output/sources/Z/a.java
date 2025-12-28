package Z;

import A.t;
import d2.AbstractC0240k;
import java.util.ArrayList;
import n.C0393m;
import n0.C0408B;
import n0.C0433n;
import n0.C0444z;
import o0.C0507u;
import p.AbstractC0536e;
import p.C0528G;
import p.C0535d;
import s.AbstractC0583a;
import s.C0584b;
import s.C0585c;
import s.C0586d;
import y2.AbstractC0688v;
import y2.InterfaceC0687u;
import z.C0694B;
import z.C0695C;
import z.C0705h;
import z.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2784a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2785b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2786c = AbstractC0536e.a();

    /* renamed from: d, reason: collision with root package name */
    public Object f2787d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f2788e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z3, o2.a aVar) {
        this.f2784a = z3;
        this.f2785b = (p2.h) aVar;
    }

    public void a(C0408B c0408b, float f3, long j3) {
        float floatValue = ((Number) ((C0535d) this.f2786c).c()).floatValue();
        if (floatValue > 0.0f) {
            long b3 = W.r.b(j3, floatValue);
            if (!this.f2784a) {
                Y.d.i(c0408b, b3, f3, 0L, 124);
                return;
            }
            Y.b bVar = c0408b.f5076d;
            float d3 = V.f.d(bVar.L());
            float b4 = V.f.b(bVar.L());
            B0.a aVar = bVar.f2770e;
            long r3 = aVar.r();
            aVar.j().d();
            ((B0.a) ((t) aVar.f271b).f175e).j().n(0.0f, 0.0f, d3, b4, 1);
            Y.d.i(c0408b, b3, f3, 0L, 124);
            aVar.j().a();
            aVar.J(r3);
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [o2.a, p2.h] */
    public void b(s.f fVar, InterfaceC0687u interfaceC0687u) {
        boolean z3 = fVar instanceof C0586d;
        ArrayList arrayList = (ArrayList) this.f2787d;
        if (z3) {
            arrayList.add(fVar);
        } else if (fVar instanceof s.e) {
            arrayList.remove(((s.e) fVar).f6115a);
        } else if (fVar instanceof C0584b) {
            arrayList.add(fVar);
        } else if (fVar instanceof C0585c) {
            arrayList.remove(((C0585c) fVar).f6114a);
        } else if (!(fVar instanceof AbstractC0583a)) {
            return;
        } else {
            arrayList.add(fVar);
        }
        s.f fVar2 = (s.f) AbstractC0240k.f0(arrayList);
        if (p2.g.a((s.f) this.f2788e, fVar2)) {
            return;
        }
        if (fVar2 != null) {
            C0705h c0705h = (C0705h) ((p2.h) this.f2785b).c();
            float f3 = z3 ? c0705h.f6869c : fVar instanceof C0584b ? c0705h.f6868b : fVar instanceof AbstractC0583a ? c0705h.f6867a : 0.0f;
            C0528G c0528g = u.f6901a;
            boolean z4 = fVar2 instanceof C0586d;
            C0528G c0528g2 = u.f6901a;
            if (!z4) {
                if (fVar2 instanceof C0584b) {
                    c0528g2 = new C0528G(45, 0, p.s.f5913b);
                } else if (fVar2 instanceof AbstractC0583a) {
                    c0528g2 = new C0528G(45, 0, p.s.f5913b);
                }
            }
            AbstractC0688v.l(interfaceC0687u, null, 0, new C0694B(this, f3, c0528g2, null), 3);
        } else {
            s.f fVar3 = (s.f) this.f2788e;
            C0528G c0528g3 = u.f6901a;
            boolean z5 = fVar3 instanceof C0586d;
            C0528G c0528g4 = u.f6901a;
            if (!z5 && !(fVar3 instanceof C0584b) && (fVar3 instanceof AbstractC0583a)) {
                c0528g4 = new C0528G(150, 0, p.s.f5913b);
            }
            AbstractC0688v.l(interfaceC0687u, null, 0, new C0695C(this, c0528g4, null), 3);
        }
        this.f2788e = fVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int c(B2.i iVar, C0507u c0507u, boolean z3) {
        Object[] objArr;
        B0.a aVar;
        int i3;
        C0433n c0433n = (C0433n) this.f2788e;
        if (this.f2784a) {
            return 0;
        }
        try {
            this.f2784a = true;
            B2.i C3 = ((t) this.f2787d).C(iVar, c0507u);
            C0393m c0393m = (C0393m) C3.f316e;
            int g3 = c0393m.g();
            for (int i4 = 0; i4 < g3; i4++) {
                h0.k kVar = (h0.k) c0393m.h(i4);
                if (!kVar.f4367d && !kVar.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int g4 = c0393m.g();
            int i5 = 0;
            while (true) {
                aVar = (B0.a) this.f2786c;
                if (i5 >= g4) {
                    break;
                }
                h0.k kVar2 = (h0.k) c0393m.h(i5);
                if (objArr != false || Z0.d.m(kVar2)) {
                    ((C0444z) this.f2785b).o(kVar2.f4366c, (C0433n) this.f2788e, kVar2.f4371i == 1, true);
                    if (!c0433n.isEmpty()) {
                        aVar.c(kVar2.f4364a, c0433n, Z0.d.m(kVar2));
                        c0433n.clear();
                    }
                }
                i5++;
            }
            ((t) aVar.f272c).E();
            boolean f3 = aVar.f(C3, z3);
            int g5 = c0393m.g();
            int i6 = 0;
            while (true) {
                if (i6 >= g5) {
                    i3 = 0;
                    break;
                }
                h0.k kVar3 = (h0.k) c0393m.h(i6);
                if (!V.c.a(V.c.e(kVar3.f4366c, kVar3.f4370g), 0L) && kVar3.b()) {
                    i3 = 2;
                    break;
                }
                i6++;
            }
            int i7 = (f3 ? 1 : 0) | i3;
            this.f2784a = false;
            return i7;
        } catch (Throwable th) {
            this.f2784a = false;
            throw th;
        }
    }

    public void d() {
        if (this.f2784a) {
            return;
        }
        ((C0393m) ((t) this.f2787d).f175e).a();
        B0.a aVar = (B0.a) this.f2786c;
        F.d dVar = (F.d) ((t) aVar.f272c).f175e;
        int i3 = dVar.f1160f;
        if (i3 > 0) {
            Object[] objArr = dVar.f1158d;
            int i4 = 0;
            do {
                ((h0.e) objArr[i4]).J();
                i4++;
            } while (i4 < i3);
        }
        ((F.d) ((t) aVar.f272c).f175e).g();
    }
}
