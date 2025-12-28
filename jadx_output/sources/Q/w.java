package q;

import n0.AbstractC0409C;
import n0.InterfaceC0431l;
import n0.Y;
import n0.o0;

/* loaded from: classes.dex */
public final class w extends P.k implements o0, InterfaceC0431l {

    /* renamed from: s, reason: collision with root package name */
    public static final I f6042s = new I();

    /* renamed from: q, reason: collision with root package name */
    public boolean f6043q;

    /* renamed from: r, reason: collision with root package name */
    public Y f6044r;

    @Override // P.k
    public final boolean V() {
        return false;
    }

    @Override // n0.o0
    public final Object j() {
        return f6042s;
    }

    @Override // n0.InterfaceC0431l
    public final void p(Y y3) {
        this.f6044r = y3;
        if (this.f6043q) {
            boolean z3 = y3.q0().f2099p;
            I i3 = x.f6045q;
            if (!z3) {
                if (this.f2099p) {
                    AbstractC0409C.i(this, i3);
                }
            } else {
                Y y4 = this.f6044r;
                if (y4 != null && y4.q0().f2099p && this.f2099p) {
                    AbstractC0409C.i(this, i3);
                }
            }
        }
    }
}
