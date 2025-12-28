package A;

import D.C0052n;
import c2.C0174m;
import v0.C0613B;

/* renamed from: A.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f97e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.p f98f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009j(long j3, t.p pVar) {
        super(2);
        L.a aVar = G1.c.f1270a;
        this.f97e = j3;
        this.f98f = pVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0052n c0052n = (C0052n) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0052n.y()) {
            c0052n.K();
        } else {
            C0613B c0613b = ((P) c0052n.k(Q.f71a)).f68m;
            L.a aVar = G1.c.f1270a;
            B.a.a(this.f97e, c0613b, L.b.b(1327513942, new C0008i(this.f98f), c0052n), c0052n, 384);
        }
        return C0174m.f3840a;
    }
}
