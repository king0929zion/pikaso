package q;

import D.C0038g;
import s.C0584b;
import y2.AbstractC0688v;
import y2.C0685s;
import y2.S;

/* loaded from: classes.dex */
public final class s extends P.k {

    /* renamed from: q, reason: collision with root package name */
    public s.g f6035q;

    /* renamed from: r, reason: collision with root package name */
    public C0584b f6036r;

    @Override // P.k
    public final boolean V() {
        return false;
    }

    public final void f0(s.g gVar, s.f fVar) {
        if (!this.f2099p) {
            gVar.b(fVar);
            return;
        }
        S s3 = (S) ((D2.d) U()).f1051d.n(C0685s.f6818e);
        AbstractC0688v.l(U(), null, 0, new r(gVar, fVar, s3 != null ? s3.q(new C0038g(gVar, 10, fVar)) : null, null), 3);
    }
}
