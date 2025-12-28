package D1;

import a2.C0112k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f991b;

    public /* synthetic */ l(int i3, Object obj) {
        this.f990a = i3;
        this.f991b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f990a) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f991b;
                actionBarOverlayLayout.f3144w = null;
                actionBarOverlayLayout.f3134m = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f990a) {
            case 0:
                ((o) this.f991b).l();
                animator.removeListener(this);
                break;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.f991b).h = null;
                break;
            case 2:
                C0112k c0112k = (C0112k) this.f991b;
                c0112k.q();
                c0112k.f2992r.start();
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f991b;
                actionBarOverlayLayout.f3144w = null;
                actionBarOverlayLayout.f3134m = false;
                break;
        }
    }
}
