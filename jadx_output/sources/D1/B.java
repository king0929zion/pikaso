package D1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class B extends AnimatorListenerAdapter implements n {

    /* renamed from: a, reason: collision with root package name */
    public final View f945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f946b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f947c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f949e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f950f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f948d = true;

    public B(View view, int i3) {
        this.f945a = view;
        this.f946b = i3;
        this.f947c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // D1.n
    public final void a() {
    }

    @Override // D1.n
    public final void b() {
    }

    @Override // D1.n
    public final void c() {
        f(false);
    }

    @Override // D1.n
    public final void d(o oVar) {
        if (!this.f950f) {
            x.f1035a.f0(this.f945a, this.f946b);
            ViewGroup viewGroup = this.f947c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        oVar.u(this);
    }

    @Override // D1.n
    public final void e() {
        f(true);
    }

    public final void f(boolean z3) {
        ViewGroup viewGroup;
        if (!this.f948d || this.f949e == z3 || (viewGroup = this.f947c) == null) {
            return;
        }
        this.f949e = z3;
        r2.a.a0(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f950f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f950f) {
            x.f1035a.f0(this.f945a, this.f946b);
            ViewGroup viewGroup = this.f947c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f950f) {
            return;
        }
        x.f1035a.f0(this.f945a, this.f946b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f950f) {
            return;
        }
        x.f1035a.f0(this.f945a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
