package n0;

import l0.C0356f;

/* renamed from: n0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438t extends AbstractC0419M {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0439u f5285t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0438t(C0439u c0439u) {
        super(c0439u);
        this.f5285t = c0439u;
    }

    @Override // n0.AbstractC0418L
    public final int M(C0356f c0356f) {
        int c3 = AbstractC0409C.c(this, c0356f);
        this.f5173s.put(c0356f, Integer.valueOf(c3));
        return c3;
    }

    @Override // l0.InterfaceC0360j
    public final l0.o a(long j3) {
        K(j3);
        new G0.a(j3);
        C0439u c0439u = this.f5285t;
        c0439u.getClass();
        InterfaceC0437s interfaceC0437s = c0439u.f5287K;
        Y y3 = c0439u.f5218o;
        p2.g.b(y3);
        AbstractC0419M o02 = y3.o0();
        p2.g.b(o02);
        AbstractC0419M.e0(this, interfaceC0437s.R(this, o02, j3));
        return this;
    }
}
