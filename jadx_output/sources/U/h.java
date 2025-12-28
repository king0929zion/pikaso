package U;

import c2.C0174m;

/* loaded from: classes.dex */
public final class h extends p2.h implements o2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final h f2343f = new h(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final h f2344g = new h(1, 1);
    public static final h h = new h(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final h f2345i = new h(1, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, int i4) {
        super(i3);
        this.f2346e = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f2346e) {
            case 0:
                ((i) obj).b(false);
                return C0174m.f3840a;
            case 1:
                int i3 = ((a) obj).f2331a;
                return n.f2358b;
            case 2:
                int i4 = ((a) obj).f2331a;
                return n.f2358b;
            default:
                return Boolean.valueOf(c.B((q) obj));
        }
    }
}
