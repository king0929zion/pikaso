package q1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class i implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f6068a;

    public i(TransformationMethod transformationMethod) {
        this.f6068a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f6068a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || o1.i.a().b() != 1) {
            return charSequence;
        }
        o1.i a3 = o1.i.a();
        a3.getClass();
        return a3.f(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f6068a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i3, rect);
        }
    }
}
