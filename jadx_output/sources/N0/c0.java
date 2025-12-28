package n0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class c0 implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f5235b = new c0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5236a;

    public /* synthetic */ c0(int i3) {
        this.f5236a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5236a) {
            case 0:
                C0444z c0444z = (C0444z) obj;
                C0444z c0444z2 = (C0444z) obj2;
                int f3 = p2.g.f(c0444z2.f5308m, c0444z.f5308m);
                return f3 != 0 ? f3 : p2.g.f(c0444z.hashCode(), c0444z2.hashCode());
            default:
                C0444z c0444z3 = (C0444z) obj;
                C0444z c0444z4 = (C0444z) obj2;
                int f4 = p2.g.f(c0444z3.f5308m, c0444z4.f5308m);
                return f4 != 0 ? f4 : p2.g.f(c0444z3.hashCode(), c0444z4.hashCode());
        }
    }
}
