package D1;

import a.AbstractC0090a;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class y extends AbstractC0090a {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1037g = true;
    public static boolean h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f1038i = true;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f1039j = true;

    @Override // a.AbstractC0090a
    public void f0(View view, int i3) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f0(view, i3);
        } else if (f1039j) {
            try {
                view.setTransitionVisibility(i3);
            } catch (NoSuchMethodError unused) {
                f1039j = false;
            }
        }
    }

    public void k0(View view, int i3, int i4, int i5, int i6) {
        if (f1038i) {
            try {
                view.setLeftTopRightBottom(i3, i4, i5, i6);
            } catch (NoSuchMethodError unused) {
                f1038i = false;
            }
        }
    }

    public void l0(View view, Matrix matrix) {
        if (f1037g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1037g = false;
            }
        }
    }

    public void m0(View view, Matrix matrix) {
        if (h) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
