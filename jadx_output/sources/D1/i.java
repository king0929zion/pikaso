package D1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import z1.C0735i;

/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f982a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f983b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f984c;

    public i(View view) {
        this.f984c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f982a) {
            case 1:
                this.f983b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f982a) {
            case 0:
                y yVar = x.f1035a;
                View view = (View) this.f984c;
                yVar.e0(view, 1.0f);
                if (this.f983b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
            default:
                if (!this.f983b) {
                    C0735i c0735i = (C0735i) this.f984c;
                    if (((Float) c0735i.f7048u.getAnimatedValue()).floatValue() != 0.0f) {
                        c0735i.f7049v = 2;
                        c0735i.f7041n.invalidate();
                        break;
                    } else {
                        c0735i.f7049v = 0;
                        c0735i.f(0);
                        break;
                    }
                } else {
                    this.f983b = false;
                    break;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f982a) {
            case 0:
                Field field = AbstractC0189K.f4150a;
                View view = (View) this.f984c;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f983b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i(C0735i c0735i) {
        this.f984c = c0735i;
    }
}
