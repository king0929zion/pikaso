package Z;

import c2.C0174m;

/* loaded from: classes.dex */
public final class c extends p2.h implements o2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final c f2789f = new c(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final c f2790g = new c(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, int i4) {
        super(i3);
        this.f2791e = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f2791e) {
            case 0:
                break;
            default:
                r1.x(W.r.f2561e, 0L, (r17 & 4) != 0 ? Y.d.S(((Y.d) obj).L(), 0L) : 0L, 1.0f, Y.f.f2774b, null, (r17 & 64) != 0 ? 3 : 0);
                break;
        }
        return C0174m.f3840a;
    }
}
