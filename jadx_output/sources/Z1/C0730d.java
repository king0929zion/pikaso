package z1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: z1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7014c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0733g f7015d;

    public /* synthetic */ C0730d(C0733g c0733g, Object obj, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f7012a = i3;
        this.f7015d = c0733g;
        this.f7014c = viewPropertyAnimator;
        this.f7013b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7012a) {
            case 1:
                this.f7013b.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7012a) {
            case 0:
                this.f7014c.setListener(null);
                this.f7013b.setAlpha(1.0f);
                C0733g c0733g = this.f7015d;
                c0733g.a(null);
                c0733g.f7025q.remove((Object) null);
                c0733g.f();
                break;
            case 1:
                this.f7014c.setListener(null);
                C0733g c0733g2 = this.f7015d;
                c0733g2.a(null);
                c0733g2.f7023o.remove((Object) null);
                c0733g2.f();
                break;
            case 2:
                this.f7014c.setListener(null);
                View view = this.f7013b;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0733g c0733g3 = this.f7015d;
                c0733g3.a(null);
                c0733g3.f7026r.remove((Object) null);
                c0733g3.f();
                break;
            default:
                this.f7014c.setListener(null);
                View view2 = this.f7013b;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0733g c0733g4 = this.f7015d;
                c0733g4.a(null);
                c0733g4.f7026r.remove((Object) null);
                c0733g4.f();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7012a) {
            case 0:
                this.f7015d.getClass();
                break;
            case 1:
                this.f7015d.getClass();
                break;
            case 2:
                this.f7015d.getClass();
                break;
            default:
                this.f7015d.getClass();
                break;
        }
    }

    public C0730d(C0733g c0733g, I i3, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7012a = 1;
        this.f7015d = c0733g;
        this.f7013b = view;
        this.f7014c = viewPropertyAnimator;
    }
}
