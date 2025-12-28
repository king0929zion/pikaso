package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import d1.AbstractC0227x;
import d1.l0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import r1.AbstractC0582a;
import s1.AbstractComponentCallbacksC0591e;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3433d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3434e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f3435f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3436g;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f3436g = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0582a.f6112a);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.f3434e;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f3433d == null) {
            this.f3433d = new ArrayList();
        }
        this.f3433d.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0591e ? (AbstractComponentCallbacksC0591e) tag : null) != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z3) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0591e ? (AbstractComponentCallbacksC0591e) tag : null) != null) {
            return super.addViewInLayout(view, i3, layoutParams, z3);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        l0 l0Var;
        l0 d3 = l0.d(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3435f;
        if (onApplyWindowInsetsListener != null) {
            l0Var = l0.d(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            Field field = AbstractC0189K.f4150a;
            WindowInsets c3 = d3.c();
            if (c3 != null) {
                WindowInsets b3 = AbstractC0227x.b(this, c3);
                if (!b3.equals(c3)) {
                    d3 = l0.d(this, b3);
                }
            }
            l0Var = d3;
        }
        if (!l0Var.f4228a.m()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                Field field2 = AbstractC0189K.f4150a;
                WindowInsets c4 = l0Var.c();
                if (c4 != null) {
                    WindowInsets a3 = AbstractC0227x.a(childAt, c4);
                    if (!a3.equals(c4)) {
                        l0.d(childAt, a3);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f3436g && this.f3433d != null) {
            for (int i3 = 0; i3 < this.f3433d.size(); i3++) {
                super.drawChild(canvas, (View) this.f3433d.get(i3), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ArrayList arrayList;
        if (!this.f3436g || (arrayList = this.f3433d) == null || arrayList.size() <= 0 || !this.f3433d.contains(view)) {
            return super.drawChild(canvas, view, j3);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f3434e;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f3433d;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3436g = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        if (z3) {
            a(view);
        }
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i3) {
        a(getChildAt(i3));
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            a(getChildAt(i5));
        }
        super.removeViews(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            a(getChildAt(i5));
        }
        super.removeViewsInLayout(i3, i4);
    }

    public void setDrawDisappearingViewsLast(boolean z3) {
        this.f3436g = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3435f = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3434e == null) {
                this.f3434e = new ArrayList();
            }
            this.f3434e.add(view);
        }
        super.startViewTransition(view);
    }
}
