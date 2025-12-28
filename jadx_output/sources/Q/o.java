package q;

import n0.C0408B;
import n0.InterfaceC0430k;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class o extends P.k implements InterfaceC0430k {

    /* renamed from: q, reason: collision with root package name */
    public final s.g f6027q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6028r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6029s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6030t;

    public o(s.g gVar) {
        this.f6027q = gVar;
    }

    @Override // n0.InterfaceC0430k
    public final void C(C0408B c0408b) {
        c0408b.a();
        boolean z3 = this.f6028r;
        Y.b bVar = c0408b.f5076d;
        if (z3) {
            c0408b.x(W.r.b(W.r.f2558b, 0.3f), 0L, (r17 & 4) != 0 ? Y.d.S(c0408b.L(), 0L) : bVar.L(), 1.0f, Y.f.f2774b, null, (r17 & 64) != 0 ? 3 : 0);
        } else if (this.f6029s || this.f6030t) {
            c0408b.x(W.r.b(W.r.f2558b, 0.1f), 0L, (r17 & 4) != 0 ? Y.d.S(c0408b.L(), 0L) : bVar.L(), 1.0f, Y.f.f2774b, null, (r17 & 64) != 0 ? 3 : 0);
        }
    }

    @Override // P.k
    public final void Y() {
        AbstractC0688v.l(U(), null, 0, new n(this, null), 3);
    }
}
