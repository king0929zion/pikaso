package X;

import n.AbstractC0390j;
import n.C0398r;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0398r f2622a;

    static {
        r rVar = e.f2597c;
        int i3 = rVar.f2593c;
        f fVar = new f(rVar, rVar, 1);
        m mVar = e.f2613t;
        int i4 = mVar.f2593c << 6;
        int i5 = rVar.f2593c;
        int i6 = i4 | i5;
        h hVar = new h(rVar, mVar, 0);
        int i7 = (i5 << 6) | mVar.f2593c;
        h hVar2 = new h(mVar, rVar, 0);
        C0398r c0398r = AbstractC0390j.f4992a;
        C0398r c0398r2 = new C0398r();
        c0398r2.i(i3 | (i3 << 6), fVar);
        c0398r2.i(i6, hVar);
        c0398r2.i(i7, hVar2);
        f2622a = c0398r2;
    }
}
