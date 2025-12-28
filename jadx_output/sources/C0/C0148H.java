package c0;

import D.AbstractC0028b;
import D.C0032d;
import D.C0033d0;
import D.C0037f0;
import D.F0;
import W.C0089l;
import b0.AbstractC0135b;
import n0.C0408B;

/* renamed from: c0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148H extends AbstractC0135b {

    /* renamed from: e, reason: collision with root package name */
    public final C0037f0 f3690e = C0032d.A(new V.f(0));

    /* renamed from: f, reason: collision with root package name */
    public final C0037f0 f3691f = C0032d.A(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    public final C0144D f3692g;
    public final C0033d0 h;

    /* renamed from: i, reason: collision with root package name */
    public float f3693i;

    /* renamed from: j, reason: collision with root package name */
    public C0089l f3694j;

    /* renamed from: k, reason: collision with root package name */
    public int f3695k;

    public C0148H(C0152c c0152c) {
        C0144D c0144d = new C0144D(c0152c);
        c0144d.f3673f = new A0.c(9, this);
        this.f3692g = c0144d;
        int i3 = AbstractC0028b.f737b;
        this.h = new C0033d0(0);
        this.f3693i = 1.0f;
        this.f3695k = -1;
    }

    @Override // b0.AbstractC0135b
    public final void a(float f3) {
        this.f3693i = f3;
    }

    @Override // b0.AbstractC0135b
    public final void b(C0089l c0089l) {
        this.f3694j = c0089l;
    }

    @Override // b0.AbstractC0135b
    public final long d() {
        return ((V.f) this.f3690e.getValue()).f2457a;
    }

    @Override // b0.AbstractC0135b
    public final void e(C0408B c0408b) {
        C0089l c0089l = this.f3694j;
        C0144D c0144d = this.f3692g;
        if (c0089l == null) {
            c0089l = (C0089l) c0144d.f3674g.getValue();
        }
        if (((Boolean) this.f3691f.getValue()).booleanValue() && c0408b.getLayoutDirection() == G0.f.f1259e) {
            Y.b bVar = c0408b.f5076d;
            long k3 = bVar.k();
            B0.a aVar = bVar.f2770e;
            long r3 = aVar.r();
            aVar.j().d();
            try {
                ((A.t) aVar.f271b).G(-1.0f, 1.0f, k3);
                c0144d.e(c0408b, this.f3693i, c0089l);
            } finally {
                aVar.j().a();
                aVar.J(r3);
            }
        } else {
            c0144d.e(c0408b, this.f3693i, c0089l);
        }
        C0033d0 c0033d0 = this.h;
        this.f3695k = ((F0) N.o.t(c0033d0.f748e, c0033d0)).f690c;
    }
}
