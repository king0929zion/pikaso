package a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import k.J;
import z1.C0733g;
import z1.I;

/* renamed from: a2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3026a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3028c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f3029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3031f;

    public C0119r(t tVar, int i3, TextView textView, int i4, TextView textView2) {
        this.f3031f = tVar;
        this.f3027b = i3;
        this.f3029d = textView;
        this.f3028c = i4;
        this.f3030e = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3026a) {
            case 1:
                int i3 = this.f3027b;
                View view = this.f3029d;
                if (i3 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f3028c != 0) {
                    view.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        J j3;
        switch (this.f3026a) {
            case 0:
                int i3 = this.f3027b;
                t tVar = (t) this.f3031f;
                tVar.f3047n = i3;
                tVar.f3045l = null;
                TextView textView = (TextView) this.f3029d;
                if (textView != null) {
                    textView.setVisibility(4);
                    if (this.f3028c == 1 && (j3 = tVar.f3051r) != null) {
                        j3.setText((CharSequence) null);
                    }
                }
                TextView textView2 = (TextView) this.f3030e;
                if (textView2 != null) {
                    textView2.setTranslationY(0.0f);
                    textView2.setAlpha(1.0f);
                    break;
                }
                break;
            default:
                ((ViewPropertyAnimator) this.f3030e).setListener(null);
                C0733g c0733g = (C0733g) this.f3031f;
                c0733g.a(null);
                c0733g.f7024p.remove((Object) null);
                c0733g.f();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3026a) {
            case 0:
                TextView textView = (TextView) this.f3030e;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setAlpha(0.0f);
                    break;
                }
                break;
            default:
                ((C0733g) this.f3031f).getClass();
                break;
        }
    }

    public C0119r(C0733g c0733g, I i3, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3031f = c0733g;
        this.f3027b = i4;
        this.f3029d = view;
        this.f3028c = i5;
        this.f3030e = viewPropertyAnimator;
    }
}
