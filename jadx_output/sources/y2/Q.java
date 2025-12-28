package y2;

import c2.C0174m;

/* loaded from: classes.dex */
public final class Q extends W {
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f6769i;

    public /* synthetic */ Q(int i3, Object obj) {
        this.h = i3;
        this.f6769i = obj;
    }

    @Override // o2.c
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        switch (this.h) {
            case 0:
                p((Throwable) obj);
                break;
            case 1:
                p((Throwable) obj);
                break;
            default:
                p((Throwable) obj);
                break;
        }
        return C0174m.f3840a;
    }

    @Override // y2.W
    public final void p(Throwable th) {
        switch (this.h) {
            case 0:
                ((o2.c) this.f6769i).i(th);
                break;
            case 1:
                Object M2 = o().M();
                boolean z3 = M2 instanceof C0680m;
                X x3 = (X) this.f6769i;
                if (!z3) {
                    x3.t(AbstractC0688v.q(M2));
                    break;
                } else {
                    x3.t(Z0.d.q(((C0680m) M2).f6805a));
                    break;
                }
            default:
                ((C0673f) this.f6769i).t(C0174m.f3840a);
                break;
        }
    }
}
