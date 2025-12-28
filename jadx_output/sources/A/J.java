package A;

import D.C0032d;
import D.C0052n;
import D.InterfaceC0045j0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import c2.C0174m;
import java.util.concurrent.atomic.AtomicInteger;
import l0.InterfaceC0361k;
import n0.C0423d;
import n0.C0424e;
import n0.C0429j;
import n0.InterfaceC0425f;
import o0.AbstractC0479f0;

/* loaded from: classes.dex */
public final class J extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P.l f20e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W.H f21f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f22g;
    public final /* synthetic */ float h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f23i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L.a f24j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(P.l lVar, W.H h, long j3, float f3, float f4, L.a aVar) {
        super(2);
        this.f20e = lVar;
        this.f21f = h;
        this.f22g = j3;
        this.h = f3;
        this.f23i = f4;
        this.f24j = aVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0052n c0052n = (C0052n) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        C0174m c0174m = C0174m.f3840a;
        if (intValue == 2 && c0052n.y()) {
            c0052n.K();
        } else {
            long b3 = L.b(this.f22g, this.h, c0052n);
            float u3 = ((G0.b) c0052n.k(AbstractC0479f0.f5574f)).u(this.f23i);
            P.l a3 = L.a(this.f20e, this.f21f, b3, u3);
            C0007h c0007h = C0007h.f93g;
            AtomicInteger atomicInteger = t0.h.f6233a;
            P.l c3 = a3.c(new AppendedSemanticsElement(c0007h, false));
            I i3 = new I(2, null);
            h0.f fVar = h0.o.f4390a;
            P.l c4 = c3.c(new SuspendPointerInputElement(c0174m, null, i3, 6));
            InterfaceC0361k d3 = t.e.d(true);
            int i4 = c0052n.f805M;
            InterfaceC0045j0 m2 = c0052n.m();
            P.l b4 = P.m.b(c0052n, c4);
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
            if (c0052n.f804L || !p2.g.a(c0052n.H(), Integer.valueOf(i4))) {
                c0052n.V(Integer.valueOf(i4));
                c0052n.b(Integer.valueOf(i4), c0423d);
            }
            C0032d.G(c0052n, b4, C0424e.f5243c);
            this.f24j.h(c0052n, 0);
            c0052n.q(true);
        }
        return c0174m;
    }
}
