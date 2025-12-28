package D1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import d1.C0197T;
import d1.C0201X;
import n.C0386f;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f987a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f989c;

    public k(C0201X c0201x, View view) {
        this.f988b = c0201x;
        this.f989c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f987a) {
            case 0:
                ((C0386f) this.f988b).remove(animator);
                ((o) this.f989c).f1011p.remove(animator);
                break;
            default:
                ((C0201X) this.f988b).f4175a.d(1.0f);
                C0197T.e((View) this.f989c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f987a) {
            case 0:
                ((o) this.f989c).f1011p.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k(o oVar, C0386f c0386f) {
        this.f989c = oVar;
        this.f988b = c0386f;
    }
}
