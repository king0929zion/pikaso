package y2;

import c2.C0174m;

/* loaded from: classes.dex */
public final class Y extends W {
    public final b0 h;

    /* renamed from: i, reason: collision with root package name */
    public final Z f6774i;

    /* renamed from: j, reason: collision with root package name */
    public final C0677j f6775j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f6776k;

    public Y(b0 b0Var, Z z3, C0677j c0677j, Object obj) {
        this.h = b0Var;
        this.f6774i = z3;
        this.f6775j = c0677j;
        this.f6776k = obj;
    }

    @Override // o2.c
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        p((Throwable) obj);
        return C0174m.f3840a;
    }

    @Override // y2.W
    public final void p(Throwable th) {
        C0677j c0677j = this.f6775j;
        b0 b0Var = this.h;
        b0Var.getClass();
        C0677j S2 = b0.S(c0677j);
        Z z3 = this.f6774i;
        Object obj = this.f6776k;
        if (S2 != null) {
            while (AbstractC0688v.i(S2.h, false, new Y(b0Var, z3, S2, obj), 1) == e0.f6792d) {
                S2 = b0.S(S2);
                if (S2 == null) {
                }
            }
            return;
        }
        b0Var.y(b0Var.H(z3, obj));
    }
}
