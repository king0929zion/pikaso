package a2;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0104c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0118q f2963b;

    public /* synthetic */ C0104c(AbstractC0118q abstractC0118q, int i3) {
        this.f2962a = i3;
        this.f2963b = abstractC0118q;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2962a) {
            case 0:
                C0106e c0106e = (C0106e) this.f2963b;
                c0106e.getClass();
                c0106e.f3025d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                C0106e c0106e2 = (C0106e) this.f2963b;
                c0106e2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = c0106e2.f3025d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                break;
            default:
                C0112k c0112k = (C0112k) this.f2963b;
                c0112k.getClass();
                c0112k.f3025d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
