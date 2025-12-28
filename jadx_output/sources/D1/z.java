package D1;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class z extends y {
    @Override // a.AbstractC0090a
    public final float M(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // a.AbstractC0090a
    public final void e0(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // D1.y, a.AbstractC0090a
    public final void f0(View view, int i3) {
        view.setTransitionVisibility(i3);
    }

    @Override // D1.y
    public final void k0(View view, int i3, int i4, int i5, int i6) {
        view.setLeftTopRightBottom(i3, i4, i5, i6);
    }

    @Override // D1.y
    public final void l0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // D1.y
    public final void m0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
