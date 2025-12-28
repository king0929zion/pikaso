package A;

import D.C0032d;
import D.C0052n;
import c2.C0174m;
import o0.C0477e0;
import v0.C0613B;

/* loaded from: classes.dex */
public final class M extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f34e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f35f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f36g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C0477e0 c0477e0, int i3) {
        super(2);
        this.f36g = c0477e0;
        this.f35f = i3;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0174m c0174m = C0174m.f3840a;
        Object obj3 = this.f36g;
        int i3 = this.f35f;
        int i4 = this.f34e;
        C0052n c0052n = (C0052n) obj;
        ((Number) obj2).intValue();
        switch (i4) {
            case 0:
                int J2 = C0032d.J(i3 | 1);
                L.a aVar = G1.c.f1270a;
                O.a((C0613B) obj3, c0052n, J2);
                break;
            default:
                ((C0477e0) obj3).a(C0032d.J(i3 | 1), c0052n);
                break;
        }
        return c0174m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C0613B c0613b, int i3) {
        super(2);
        L.a aVar = G1.c.f1270a;
        this.f36g = c0613b;
        this.f35f = i3;
    }
}
