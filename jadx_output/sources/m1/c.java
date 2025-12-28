package M1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import z1.C0735i;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1678b;

    public /* synthetic */ c(int i3, Object obj) {
        this.f1677a = i3;
        this.f1678b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1677a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                X1.g gVar = ((BottomSheetBehavior) this.f1678b).f3913i;
                if (gVar != null) {
                    X1.f fVar = gVar.f2685d;
                    if (fVar.f2676i != floatValue) {
                        fVar.f2676i = floatValue;
                        gVar.h = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                ((TextInputLayout) this.f1678b).f4090x0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0735i c0735i = (C0735i) this.f1678b;
                c0735i.f7030b.setAlpha(floatValue2);
                c0735i.f7031c.setAlpha(floatValue2);
                c0735i.f7041n.invalidate();
                break;
        }
    }
}
