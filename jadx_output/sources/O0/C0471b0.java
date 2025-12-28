package o0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471b0 implements InterfaceC0469a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f5549a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5550b = new int[2];

    @Override // o0.InterfaceC0469a0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f5549a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f5550b;
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i3, iArr[1] - i4);
        W.D.y(fArr, matrix);
    }
}
