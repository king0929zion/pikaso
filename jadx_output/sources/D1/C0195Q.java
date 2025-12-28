package d1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: d1.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195Q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0201X f4156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f4157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f4160e;

    public C0195Q(C0201X c0201x, l0 l0Var, l0 l0Var2, int i3, View view) {
        this.f4156a = c0201x;
        this.f4157b = l0Var;
        this.f4158c = l0Var2;
        this.f4159d = i3;
        this.f4160e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f3;
        C0201X c0201x;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0201X c0201x2 = this.f4156a;
        c0201x2.f4175a.d(animatedFraction);
        float b3 = c0201x2.f4175a.b();
        PathInterpolator pathInterpolator = C0197T.f4163e;
        int i3 = Build.VERSION.SDK_INT;
        l0 l0Var = this.f4157b;
        d0 c0Var = i3 >= 30 ? new c0(l0Var) : i3 >= 29 ? new b0(l0Var) : new C0203Z(l0Var);
        int i4 = 1;
        while (i4 <= 256) {
            int i5 = this.f4159d & i4;
            j0 j0Var = l0Var.f4228a;
            if (i5 == 0) {
                c0Var.c(i4, j0Var.f(i4));
                f3 = b3;
                c0201x = c0201x2;
            } else {
                V0.c f4 = j0Var.f(i4);
                V0.c f5 = this.f4158c.f4228a.f(i4);
                int i6 = (int) (((f4.f2460a - f5.f2460a) * r10) + 0.5d);
                int i7 = (int) (((f4.f2461b - f5.f2461b) * r10) + 0.5d);
                f3 = b3;
                int i8 = (int) (((f4.f2462c - f5.f2462c) * r10) + 0.5d);
                float f6 = (f4.f2463d - f5.f2463d) * (1.0f - b3);
                c0201x = c0201x2;
                c0Var.c(i4, l0.b(f4, i6, i7, i8, (int) (f6 + 0.5d)));
            }
            i4 <<= 1;
            b3 = f3;
            c0201x2 = c0201x;
        }
        C0197T.g(this.f4160e, c0Var.b(), Collections.singletonList(c0201x2));
    }
}
