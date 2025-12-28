package o0;

import c2.C0168g;
import java.util.Comparator;

/* renamed from: o0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517z implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C0517z f5754b = new C0517z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0517z f5755c = new C0517z(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0517z f5756d = new C0517z(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5757a;

    public /* synthetic */ C0517z(int i3) {
        this.f5757a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5757a) {
            case 0:
                V.d f3 = ((t0.k) obj).f();
                V.d f4 = ((t0.k) obj2).f();
                int compare = Float.compare(f3.f2446a, f4.f2446a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f3.f2447b, f4.f2447b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f3.f2449d, f4.f2449d);
                return compare3 != 0 ? compare3 : Float.compare(f3.f2448c, f4.f2448c);
            case 1:
                V.d f5 = ((t0.k) obj).f();
                V.d f6 = ((t0.k) obj2).f();
                int compare4 = Float.compare(f6.f2448c, f5.f2448c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f5.f2447b, f6.f2447b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f5.f2449d, f6.f2449d);
                return compare6 != 0 ? compare6 : Float.compare(f6.f2446a, f5.f2446a);
            default:
                C0168g c0168g = (C0168g) obj;
                C0168g c0168g2 = (C0168g) obj2;
                int compare7 = Float.compare(((V.d) c0168g.f3833d).f2447b, ((V.d) c0168g2.f3833d).f2447b);
                return compare7 != 0 ? compare7 : Float.compare(((V.d) c0168g.f3833d).f2449d, ((V.d) c0168g2.f3833d).f2449d);
        }
    }
}
