package U;

import c2.C0174m;

/* loaded from: classes.dex */
public final class r extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f2369f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(q qVar, int i3) {
        super(0);
        this.f2368e = i3;
        this.f2369f = qVar;
    }

    @Override // o2.a
    public final Object c() {
        switch (this.f2368e) {
            case 0:
                this.f2369f.f0();
                break;
            default:
                q qVar = this.f2369f;
                if (qVar.f2088d.f2099p) {
                    c.A(qVar);
                }
                break;
        }
        return C0174m.f3840a;
    }
}
