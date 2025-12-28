package U0;

import W.D;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
import o0.AbstractC0461K;
import o0.InterfaceC0469a0;

/* loaded from: classes.dex */
public final class i implements InterfaceC0469a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f2393a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2394b;

    public i(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f2394b = new int[size];
        this.f2393a = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            this.f2394b[i3] = ((Integer) arrayList.get(i3)).intValue();
            this.f2393a[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }

    @Override // o0.InterfaceC0469a0
    public void a(View view, float[] fArr) {
        D.v(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z3 = parent instanceof View;
        float[] fArr2 = this.f2393a;
        if (z3) {
            b((View) parent, fArr);
            D.v(fArr2);
            D.F(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC0461K.m(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            D.v(fArr2);
            D.F(fArr2, left, top);
            AbstractC0461K.m(fArr, fArr2);
        } else {
            int[] iArr = this.f2394b;
            view.getLocationInWindow(iArr);
            D.v(fArr2);
            D.F(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC0461K.m(fArr, fArr2);
            float f3 = iArr[0];
            float f4 = iArr[1];
            D.v(fArr2);
            D.F(fArr2, f3, f4);
            AbstractC0461K.m(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        D.y(fArr2, matrix);
        AbstractC0461K.m(fArr, fArr2);
    }

    public i(int i3, int i4) {
        this.f2394b = new int[]{i3, i4};
        this.f2393a = new float[]{0.0f, 1.0f};
    }

    public i(int i3, int i4, int i5) {
        this.f2394b = new int[]{i3, i4, i5};
        this.f2393a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public i(float[] fArr) {
        this.f2393a = fArr;
        this.f2394b = new int[2];
    }
}
