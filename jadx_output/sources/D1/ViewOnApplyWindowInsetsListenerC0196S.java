package d1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* renamed from: d1.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0196S implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final M1.j f4161a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f4162b;

    public ViewOnApplyWindowInsetsListenerC0196S(View view, M1.j jVar) {
        l0 l0Var;
        this.f4161a = jVar;
        Field field = AbstractC0189K.f4150a;
        l0 a3 = AbstractC0179A.a(view);
        if (a3 != null) {
            int i3 = Build.VERSION.SDK_INT;
            l0Var = (i3 >= 30 ? new c0(a3) : i3 >= 29 ? new b0(a3) : new C0203Z(a3)).b();
        } else {
            l0Var = null;
        }
        this.f4162b = l0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        j0 j0Var;
        if (!view.isLaidOut()) {
            this.f4162b = l0.d(view, windowInsets);
            return C0197T.i(view, windowInsets);
        }
        l0 d3 = l0.d(view, windowInsets);
        if (this.f4162b == null) {
            Field field = AbstractC0189K.f4150a;
            this.f4162b = AbstractC0179A.a(view);
        }
        if (this.f4162b == null) {
            this.f4162b = d3;
            return C0197T.i(view, windowInsets);
        }
        M1.j j3 = C0197T.j(view);
        if (j3 != null && Objects.equals((WindowInsets) j3.f1698d, windowInsets)) {
            return C0197T.i(view, windowInsets);
        }
        l0 l0Var = this.f4162b;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            j0Var = d3.f4228a;
            if (i3 > 256) {
                break;
            }
            if (!j0Var.f(i3).equals(l0Var.f4228a.f(i3))) {
                i4 |= i3;
            }
            i3 <<= 1;
        }
        if (i4 == 0) {
            return C0197T.i(view, windowInsets);
        }
        l0 l0Var2 = this.f4162b;
        C0201X c0201x = new C0201X(i4, (i4 & 8) != 0 ? j0Var.f(8).f2463d > l0Var2.f4228a.f(8).f2463d ? C0197T.f4163e : C0197T.f4164f : C0197T.f4165g, 160L);
        c0201x.f4175a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0201x.f4175a.a());
        V0.c f3 = j0Var.f(i4);
        V0.c f4 = l0Var2.f4228a.f(i4);
        int min = Math.min(f3.f2460a, f4.f2460a);
        int i5 = f3.f2461b;
        int i6 = f4.f2461b;
        int min2 = Math.min(i5, i6);
        int i7 = f3.f2462c;
        int i8 = f4.f2462c;
        int min3 = Math.min(i7, i8);
        int i9 = f3.f2463d;
        int i10 = i4;
        int i11 = f4.f2463d;
        B2.i iVar = new B2.i(V0.c.b(min, min2, min3, Math.min(i9, i11)), 6, V0.c.b(Math.max(f3.f2460a, f4.f2460a), Math.max(i5, i6), Math.max(i7, i8), Math.max(i9, i11)));
        C0197T.f(view, windowInsets, false);
        duration.addUpdateListener(new C0195Q(c0201x, d3, l0Var2, i10, view));
        duration.addListener(new D1.k(c0201x, view));
        a1.k kVar = new a1.k(view, c0201x, iVar, duration);
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0221r viewTreeObserverOnPreDrawListenerC0221r = new ViewTreeObserverOnPreDrawListenerC0221r(view, kVar);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0221r);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0221r);
        this.f4162b = d3;
        return C0197T.i(view, windowInsets);
    }
}
