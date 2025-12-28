package D;

import c2.C0174m;

/* renamed from: D.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042i extends p2.h implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0042i f768f = new C0042i(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0042i f769g = new C0042i(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f770e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0042i(int i3, int i4) {
        super(i3);
        this.f770e = i4;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        switch (this.f770e) {
            case 0:
                C0052n c0052n = (C0052n) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0052n.y()) {
                    c0052n.K();
                }
                break;
            default:
                C0052n c0052n2 = (C0052n) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0052n2.y()) {
                    c0052n2.K();
                }
                break;
        }
        return C0174m.f3840a;
    }
}
