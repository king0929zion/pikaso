package D;

import A.C0008i;
import android.content.res.Configuration;
import c0.AbstractC0142B;
import c0.C0152c;
import c2.C0174m;
import d2.AbstractC0230a;
import d2.AbstractC0234e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import l0.C0356f;
import n.C0403w;
import n0.C0407A;
import n0.InterfaceC0420a;
import o0.AbstractC0493m0;
import o0.C0463M;
import o0.C0483h0;
import o0.C0495n0;
import y2.C0673f;

/* renamed from: D.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065y extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0065y(int i3, Object obj) {
        super(1);
        this.f930e = i3;
        this.f931f = obj;
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r0v58, types: [l0.o, n0.a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // o2.c
    public final Object i(Object obj) {
        int i3;
        int i4 = 2;
        int i5 = 0;
        switch (this.f930e) {
            case 0:
                A.f628e.removeFrameCallback((ChoreographerFrameCallbackC0066z) this.f931f);
                return C0174m.f3840a;
            case 1:
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                v0 v0Var = (v0) this.f931f;
                synchronized (v0Var.f908b) {
                    try {
                        y2.S s3 = v0Var.f909c;
                        if (s3 != null) {
                            B2.G g3 = v0Var.f923r;
                            EnumC0055o0 enumC0055o0 = EnumC0055o0.f840e;
                            g3.getClass();
                            g3.g(null, enumC0055o0);
                            B2.G g4 = v0.f905v;
                            s3.a(cancellationException);
                            v0Var.f920o = null;
                            s3.q(new C0038g(v0Var, i4, th));
                        } else {
                            v0Var.f910d = cancellationException;
                            B2.G g5 = v0Var.f923r;
                            EnumC0055o0 enumC0055o02 = EnumC0055o0.f839d;
                            g5.getClass();
                            g5.g(null, enumC0055o02);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C0174m.f3840a;
            case 2:
                ((C0060t) this.f931f).t(obj);
                return C0174m.f3840a;
            case 3:
                ((G2.h) this.f931f).b();
                return C0174m.f3840a;
            case 4:
                ?? r02 = this.f931f;
                int size = r02.size();
                while (i5 < size) {
                    ((o2.c) r02.get(i5)).i(obj);
                    i5++;
                }
                return C0174m.f3840a;
            case 5:
                N.l lVar = (N.l) obj;
                synchronized (N.o.f1756b) {
                    i3 = N.o.f1758d;
                    N.o.f1758d = 1 + i3;
                }
                return new N.f(i3, lVar, (o2.c) this.f931f);
            case 6:
                N.v vVar = (N.v) this.f931f;
                vVar.getClass();
                synchronized (vVar.f1788f) {
                    N.u uVar = vVar.h;
                    p2.g.b(uVar);
                    n0.f0 f0Var = uVar.f1773b;
                    p2.g.b(f0Var);
                    int i6 = uVar.f1775d;
                    C0403w c0403w = uVar.f1774c;
                    if (c0403w == null) {
                        c0403w = new C0403w();
                        uVar.f1774c = c0403w;
                        uVar.f1777f.j(f0Var, c0403w);
                    }
                    uVar.c(obj, i6, f0Var, c0403w);
                }
                return C0174m.f3840a;
            case 7:
                if (!((S.d) obj).f2099p) {
                    return n0.n0.f5271e;
                }
                p2.m mVar = (p2.m) this.f931f;
                mVar.f5958d = mVar.f5958d;
                return n0.n0.f5270d;
            case 8:
                W.F f3 = (W.F) obj;
                W.I i7 = (W.I) this.f931f;
                float f4 = i7.f2519q;
                if (f3.f2489e != f4) {
                    f3.f2488d = 1 | f3.f2488d;
                    f3.f2489e = f4;
                }
                float f5 = i7.f2520r;
                if (f3.f2490f != f5) {
                    f3.f2488d = 2 | f3.f2488d;
                    f3.f2490f = f5;
                }
                float f6 = i7.f2521s;
                if (f3.f2491g != f6) {
                    f3.f2488d |= 4;
                    f3.f2491g = f6;
                }
                float f7 = i7.f2522t;
                if (f3.h != f7) {
                    f3.f2488d |= 8;
                    f3.h = f7;
                }
                float f8 = i7.f2523u;
                if (f3.f2492i != f8) {
                    f3.f2488d |= 16;
                    f3.f2492i = f8;
                }
                float f9 = i7.f2524v;
                if (f3.f2493j != f9) {
                    f3.f2488d |= 32;
                    f3.f2493j = f9;
                }
                float f10 = i7.f2525w;
                if (f3.f2496m != f10) {
                    f3.f2488d |= 256;
                    f3.f2496m = f10;
                }
                float f11 = i7.f2526x;
                if (f3.f2497n != f11) {
                    f3.f2488d |= 512;
                    f3.f2497n = f11;
                }
                float f12 = i7.f2527y;
                if (f3.f2498o != f12) {
                    f3.f2488d |= 1024;
                    f3.f2498o = f12;
                }
                float f13 = i7.f2528z;
                if (f3.f2499p != f13) {
                    f3.f2488d |= 2048;
                    f3.f2499p = f13;
                }
                long j3 = i7.f2512A;
                long j4 = f3.f2500q;
                int i8 = W.K.f2531b;
                if (j4 != j3) {
                    f3.f2488d |= 4096;
                    f3.f2500q = j3;
                }
                W.H h = i7.f2513B;
                if (!p2.g.a(f3.f2501r, h)) {
                    f3.f2488d |= 8192;
                    f3.f2501r = h;
                }
                boolean z3 = i7.f2514C;
                if (f3.f2502s != z3) {
                    f3.f2488d |= 16384;
                    f3.f2502s = z3;
                }
                if (!p2.g.a(null, null)) {
                    f3.f2488d |= 131072;
                }
                long j5 = i7.f2515D;
                if (!W.r.c(f3.f2494k, j5)) {
                    f3.f2488d |= 64;
                    f3.f2494k = j5;
                }
                long j6 = i7.f2516E;
                if (!W.r.c(f3.f2495l, j6)) {
                    f3.f2488d |= 128;
                    f3.f2495l = j6;
                }
                int i9 = i7.f2517F;
                if (!W.D.m(f3.f2503t, i9)) {
                    f3.f2488d |= 32768;
                    f3.f2503t = i9;
                }
                return C0174m.f3840a;
            case 9:
                AbstractC0142B abstractC0142B = (AbstractC0142B) obj;
                C0152c c0152c = (C0152c) this.f931f;
                c0152c.g(abstractC0142B);
                ?? r03 = c0152c.f3722i;
                if (r03 != 0) {
                    r03.i(abstractC0142B);
                }
                return C0174m.f3840a;
            case 10:
                return obj == ((AbstractC0230a) this.f931f) ? "(this Collection)" : String.valueOf(obj);
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                p2.g.e(entry, "it");
                AbstractC0234e abstractC0234e = (AbstractC0234e) this.f931f;
                abstractC0234e.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == abstractC0234e ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != abstractC0234e ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 12:
                Throwable th3 = (Throwable) obj;
                h0.p pVar = (h0.p) this.f931f;
                C0673f c0673f = pVar.f4394f;
                if (c0673f != null) {
                    c0673f.n(th3);
                }
                pVar.f4394f = null;
                return C0174m.f3840a;
            case 13:
                l0.n nVar = (l0.n) obj;
                ArrayList arrayList = (ArrayList) this.f931f;
                int size2 = arrayList.size();
                while (i5 < size2) {
                    l0.n.g(nVar, (l0.o) arrayList.get(i5));
                    i5++;
                }
                return C0174m.f3840a;
            case 14:
                InterfaceC0420a interfaceC0420a = (InterfaceC0420a) obj;
                if (interfaceC0420a.g()) {
                    if (interfaceC0420a.y().f5070b) {
                        interfaceC0420a.d();
                    }
                    Iterator it = interfaceC0420a.y().f5075g.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        C0407A c0407a = (C0407A) this.f931f;
                        if (hasNext) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            C0407A.a(c0407a, (C0356f) entry2.getKey(), ((Number) entry2.getValue()).intValue(), interfaceC0420a.A());
                        } else {
                            n0.Y y3 = interfaceC0420a.A().f5219p;
                            p2.g.b(y3);
                            while (!y3.equals(c0407a.f5069a.A())) {
                                for (C0356f c0356f : c0407a.b(y3).keySet()) {
                                    C0407A.a(c0407a, c0356f, c0407a.c(y3, c0356f), y3);
                                }
                                y3 = y3.f5219p;
                                p2.g.b(y3);
                            }
                        }
                    }
                }
                return C0174m.f3840a;
            case 15:
                ((F.d) this.f931f).b((P.j) obj);
                return Boolean.TRUE;
            case 16:
                ((Z) this.f931f).setValue(new Configuration((Configuration) obj));
                return C0174m.f3840a;
            case 17:
                return new C0463M((C0483h0) this.f931f);
            case 18:
                boolean compareAndSet = AbstractC0493m0.f5611b.compareAndSet(false, true);
                C0174m c0174m = C0174m.f3840a;
                if (compareAndSet) {
                    ((A2.b) this.f931f).c(c0174m);
                }
                return c0174m;
            case 19:
                Y.d dVar = (Y.d) obj;
                W.o j7 = dVar.H().j();
                C0008i c0008i = ((C0495n0) this.f931f).f5615g;
                if (c0008i != null) {
                    c0008i.h(j7, (Z.d) dVar.H().f272c);
                }
                return C0174m.f3840a;
            case 20:
                ((C0008i) this.f931f).h((W.o) obj, null);
                return C0174m.f3840a;
            case 21:
                long j8 = ((V.c) obj).f2444a;
                q.l lVar2 = (q.l) this.f931f;
                if (lVar2.f6020w) {
                    lVar2.f6021x.c();
                }
                return C0174m.f3840a;
            case 22:
                t0.p.c((t0.g) obj, ((t0.e) this.f931f).f6205a);
                return C0174m.f3840a;
            default:
                z0.s sVar = (z0.s) obj;
                return ((z0.f) this.f931f).a(new z0.s(null, sVar.f6937b, sVar.f6938c, sVar.f6939d, sVar.f6940e)).f6941d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065y(A.t tVar, S.d dVar, p2.m mVar) {
        super(1);
        this.f930e = 7;
        this.f931f = mVar;
    }
}
