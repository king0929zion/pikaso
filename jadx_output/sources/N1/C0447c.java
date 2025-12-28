package n1;

import android.graphics.Rect;
import e1.j;
import java.util.Comparator;

/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f5336a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f5337b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5338c;

    /* renamed from: d, reason: collision with root package name */
    public final X1.e f5339d;

    public C0447c(boolean z3, X1.e eVar) {
        this.f5338c = z3;
        this.f5339d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f5339d.getClass();
        Rect rect = this.f5336a;
        ((j) obj).f(rect);
        Rect rect2 = this.f5337b;
        ((j) obj2).f(rect2);
        int i3 = rect.top;
        int i4 = rect2.top;
        if (i3 < i4) {
            return -1;
        }
        if (i3 > i4) {
            return 1;
        }
        int i5 = rect.left;
        int i6 = rect2.left;
        boolean z3 = this.f5338c;
        if (i5 < i6) {
            return z3 ? 1 : -1;
        }
        if (i5 > i6) {
            return z3 ? -1 : 1;
        }
        int i7 = rect.bottom;
        int i8 = rect2.bottom;
        if (i7 < i8) {
            return -1;
        }
        if (i7 > i8) {
            return 1;
        }
        int i9 = rect.right;
        int i10 = rect2.right;
        if (i9 < i10) {
            return z3 ? 1 : -1;
        }
        if (i9 > i10) {
            return z3 ? -1 : 1;
        }
        return 0;
    }
}
