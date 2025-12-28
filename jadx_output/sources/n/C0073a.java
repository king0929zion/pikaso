package N;

import c2.C0174m;

/* renamed from: N.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073a extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o2.c f1718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o2.c f1719g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0073a(o2.c cVar, o2.c cVar2, int i3) {
        super(1);
        this.f1717e = i3;
        this.f1718f = cVar;
        this.f1719g = cVar2;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        int i3;
        switch (this.f1717e) {
            case 0:
                l lVar = (l) obj;
                synchronized (o.f1756b) {
                    i3 = o.f1758d;
                    o.f1758d = i3 + 1;
                }
                return new C0075c(i3, lVar, this.f1718f, this.f1719g);
            case 1:
                this.f1718f.i(obj);
                this.f1719g.i(obj);
                return C0174m.f3840a;
            default:
                this.f1718f.i(obj);
                this.f1719g.i(obj);
                return C0174m.f3840a;
        }
    }
}
