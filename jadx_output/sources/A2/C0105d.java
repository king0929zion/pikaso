package a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0106e f2965b;

    public /* synthetic */ C0105d(C0106e c0106e, int i3) {
        this.f2964a = i3;
        this.f2965b = c0106e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2964a) {
            case 1:
                this.f2965b.f3023b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2964a) {
            case 0:
                this.f2965b.f3023b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
