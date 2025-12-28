package A;

import D.C0032d;
import D.C0052n;
import D.InterfaceC0045j0;
import D.M0;
import androidx.compose.material3.MinimumInteractiveModifier;
import c2.C0174m;
import l0.InterfaceC0361k;
import n0.C0423d;
import n0.C0424e;
import n0.C0429j;
import n0.InterfaceC0425f;
import o0.AbstractC0479f0;

/* loaded from: classes.dex */
public final class K extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P.l f25e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W.H f26f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f27g;
    public final /* synthetic */ float h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s.g f28i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f29j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A0.c f30k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f31l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L.a f32m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(P.l lVar, W.H h, long j3, float f3, s.g gVar, boolean z3, A0.c cVar, float f4, L.a aVar) {
        super(2);
        this.f25e = lVar;
        this.f26f = h;
        this.f27g = j3;
        this.h = f3;
        this.f28i = gVar;
        this.f29j = z3;
        this.f30k = cVar;
        this.f31l = f4;
        this.f32m = aVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0052n c0052n = (C0052n) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0052n.y()) {
            c0052n.K();
        } else {
            M0 m02 = w.f183a;
            P.l b3 = androidx.compose.foundation.a.b(L.a(this.f25e.c(MinimumInteractiveModifier.f3307a), this.f26f, L.b(this.f27g, this.h, c0052n), ((G0.b) c0052n.k(AbstractC0479f0.f5574f)).u(this.f31l)), this.f28i, D.a(c0052n), this.f29j, this.f30k);
            InterfaceC0361k d3 = t.e.d(true);
            int i3 = c0052n.f805M;
            InterfaceC0045j0 m2 = c0052n.m();
            P.l b4 = P.m.b(c0052n, b3);
            InterfaceC0425f.f5247c.getClass();
            C0429j c0429j = C0424e.f5242b;
            c0052n.P();
            if (c0052n.f804L) {
                c0052n.l(c0429j);
            } else {
                c0052n.Y();
            }
            C0032d.G(c0052n, d3, C0424e.f5245e);
            C0032d.G(c0052n, m2, C0424e.f5244d);
            C0423d c0423d = C0424e.f5246f;
            if (c0052n.f804L || !p2.g.a(c0052n.H(), Integer.valueOf(i3))) {
                c0052n.V(Integer.valueOf(i3));
                c0052n.b(Integer.valueOf(i3), c0423d);
            }
            C0032d.G(c0052n, b4, C0424e.f5243c);
            this.f32m.h(c0052n, 0);
            c0052n.q(true);
        }
        return C0174m.f3840a;
    }
}
