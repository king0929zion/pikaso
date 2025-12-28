package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import g.AbstractC0262a;
import java.lang.ref.WeakReference;
import k.X0;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: d, reason: collision with root package name */
    public int f3252d;

    /* renamed from: e, reason: collision with root package name */
    public int f3253e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f3254f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflater f3255g;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3252d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0262a.f4311v, 0, 0);
        this.f3253e = obtainStyledAttributes.getResourceId(2, -1);
        this.f3252d = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f3253e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f3255g;
    }

    public int getLayoutResource() {
        return this.f3252d;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f3253e = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f3255g = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f3252d = i3;
    }

    public void setOnInflateListener(X0 x02) {
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        WeakReference weakReference = this.f3254f;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i3);
            return;
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f3252d == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f3255g;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f3252d, viewGroup, false);
            int i4 = this.f3253e;
            if (i4 != -1) {
                inflate.setId(i4);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f3254f = new WeakReference(inflate);
        }
    }
}
