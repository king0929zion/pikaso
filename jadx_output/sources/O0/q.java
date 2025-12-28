package O0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class q extends b {

    /* renamed from: j, reason: collision with root package name */
    public boolean f2058j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2059k;

    @Override // O0.b
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f2051b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 6) {
                    this.f2058j = true;
                } else if (index == 13) {
                    this.f2059k = true;
                }
            }
        }
    }

    public abstract void h(M0.g gVar, int i3, int i4);

    @Override // O0.b, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2058j || this.f2059k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i3 = 0; i3 < this.f1881e; i3++) {
                View view = (View) constraintLayout.f3351d.get(this.f1880d[i3]);
                if (view != null) {
                    if (this.f2058j) {
                        view.setVisibility(visibility);
                    }
                    if (this.f2059k && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        c();
    }
}
