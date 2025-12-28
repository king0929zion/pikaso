package y2;

import c2.C0174m;

/* loaded from: classes.dex */
public final class D implements f0, o2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6751d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6752e;

    public /* synthetic */ D(int i3, Object obj) {
        this.f6751d = i3;
        this.f6752e = obj;
    }

    public final void b(Throwable th) {
        switch (this.f6751d) {
            case 0:
                ((C) this.f6752e).d();
                break;
            default:
                ((o2.c) this.f6752e).i(th);
                break;
        }
    }

    @Override // o2.c
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        switch (this.f6751d) {
            case 0:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return C0174m.f3840a;
    }

    public final String toString() {
        switch (this.f6751d) {
            case 0:
                return "DisposeOnCancel[" + ((C) this.f6752e) + ']';
            default:
                return "InvokeOnCancel[" + ((o2.c) this.f6752e).getClass().getSimpleName() + '@' + AbstractC0688v.f(this) + ']';
        }
    }
}
