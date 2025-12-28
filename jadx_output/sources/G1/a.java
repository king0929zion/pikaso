package G1;

import A.y;
import D.C0052n;
import c2.C0174m;

/* loaded from: classes.dex */
public final class a extends p2.h implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1266f = new a(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final a f1267g = new a(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, int i4) {
        super(i3);
        this.f1268e = i4;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0174m c0174m = C0174m.f3840a;
        switch (this.f1268e) {
            case 0:
                C0052n c0052n = (C0052n) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0052n.y()) {
                    r2.a.e(0, c0052n);
                    break;
                } else {
                    c0052n.K();
                    break;
                }
                break;
            default:
                C0052n c0052n2 = (C0052n) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0052n2.y()) {
                    L.a aVar = c.f1270a;
                    y.a(null, null, null, c0052n2, 3072);
                    break;
                } else {
                    c0052n2.K();
                    break;
                }
                break;
        }
        return c0174m;
    }
}
