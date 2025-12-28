package p;

/* renamed from: p.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529H extends p2.h implements o2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0529H f5850f = new C0529H(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0529H f5851g = new C0529H(1, 1);
    public static final C0529H h = new C0529H(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0529H f5852i = new C0529H(1, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0529H(int i3, int i4) {
        super(i3);
        this.f5853e = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f5853e) {
            case 0:
                return new C0541j(((G0.e) obj).f1257d);
            case 1:
                return new G0.e(((C0541j) obj).f5896a);
            case 2:
                return new C0541j(((Number) obj).floatValue());
            default:
                return Float.valueOf(((C0541j) obj).f5896a);
        }
    }
}
