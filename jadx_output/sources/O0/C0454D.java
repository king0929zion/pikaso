package o0;

import D.C0052n;
import android.graphics.Matrix;
import android.view.View;
import c2.C0174m;

/* renamed from: o0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454D extends p2.h implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0454D f5382f = new C0454D(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0454D f5383g = new C0454D(2, 1);
    public static final C0454D h = new C0454D(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C0454D f5384i = new C0454D(2, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0454D(int i3, int i4) {
        super(i3);
        this.f5385e = i4;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        switch (this.f5385e) {
            case 0:
                t0.k kVar = (t0.k) obj2;
                t0.g gVar = ((t0.k) obj).f6239d;
                t0.q qVar = t0.n.f6270n;
                Object obj3 = gVar.f6230d.get(qVar);
                if (obj3 == null) {
                    obj3 = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = kVar.f6239d.f6230d.get(qVar);
                if (obj4 == null) {
                    obj4 = Float.valueOf(0.0f);
                }
                break;
            case 1:
                C0052n c0052n = (C0052n) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0052n.y()) {
                    c0052n.K();
                }
                break;
            case 2:
                ((InterfaceC0481g0) obj).J((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return C0174m.f3840a;
    }
}
