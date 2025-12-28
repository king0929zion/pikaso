package d1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f4227b;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f4228a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4227b = i0.f4219q;
        } else {
            f4227b = j0.f4220b;
        }
    }

    public l0(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f4228a = new i0(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f4228a = new h0(this, windowInsets);
        } else if (i3 >= 28) {
            this.f4228a = new g0(this, windowInsets);
        } else {
            this.f4228a = new f0(this, windowInsets);
        }
    }

    public static V0.c b(V0.c cVar, int i3, int i4, int i5, int i6) {
        int max = Math.max(0, cVar.f2460a - i3);
        int max2 = Math.max(0, cVar.f2461b - i4);
        int max3 = Math.max(0, cVar.f2462c - i5);
        int max4 = Math.max(0, cVar.f2463d - i6);
        return (max == i3 && max2 == i4 && max3 == i5 && max4 == i6) ? cVar : V0.c.b(max, max2, max3, max4);
    }

    public static l0 d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l0 l0Var = new l0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = AbstractC0189K.f4150a;
            l0 a3 = AbstractC0179A.a(view);
            j0 j0Var = l0Var.f4228a;
            j0Var.p(a3);
            j0Var.d(view.getRootView());
        }
        return l0Var;
    }

    public final int a() {
        return this.f4228a.j().f2461b;
    }

    public final WindowInsets c() {
        j0 j0Var = this.f4228a;
        if (j0Var instanceof e0) {
            return ((e0) j0Var).f4201c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        return Objects.equals(this.f4228a, ((l0) obj).f4228a);
    }

    public final int hashCode() {
        j0 j0Var = this.f4228a;
        if (j0Var == null) {
            return 0;
        }
        return j0Var.hashCode();
    }

    public l0() {
        this.f4228a = new j0(this);
    }
}
