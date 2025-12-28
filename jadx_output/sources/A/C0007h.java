package A;

import c2.C0174m;

/* renamed from: A.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h extends p2.h implements o2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0007h f92f = new C0007h(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0007h f93g = new C0007h(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f94e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0007h(int i3, int i4) {
        super(i3);
        this.f94e = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        C0174m c0174m = C0174m.f3840a;
        switch (this.f94e) {
            case 0:
                t0.p.c((t0.g) obj, 0);
                break;
            default:
                v2.c[] cVarArr = t0.p.f6284a;
                t0.q qVar = t0.n.f6268l;
                v2.c cVar = t0.p.f6284a[5];
                Boolean bool = Boolean.TRUE;
                qVar.getClass();
                ((t0.g) obj).b(qVar, bool);
                break;
        }
        return c0174m;
    }
}
