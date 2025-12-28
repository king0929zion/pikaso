package c0;

import c2.C0174m;

/* renamed from: c0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143C extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0144D f3668f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0143C(C0144D c0144d, int i3) {
        super(1);
        this.f3667e = i3;
        this.f3668f = c0144d;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [o2.a, p2.h] */
    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f3667e) {
            case 0:
                C0144D c0144d = this.f3668f;
                c0144d.f3671d = true;
                c0144d.f3673f.c();
                return C0174m.f3840a;
            default:
                Y.d dVar = (Y.d) obj;
                C0144D c0144d2 = this.f3668f;
                C0152c c0152c = c0144d2.f3669b;
                float f3 = c0144d2.f3677k;
                float f4 = c0144d2.f3678l;
                B0.a H2 = dVar.H();
                long r3 = H2.r();
                H2.j().d();
                try {
                    ((A.t) H2.f271b).G(f3, f4, 0L);
                    c0152c.a(dVar);
                    H2.j().a();
                    H2.J(r3);
                    return C0174m.f3840a;
                } catch (Throwable th) {
                    H2.j().a();
                    H2.J(r3);
                    throw th;
                }
        }
    }
}
