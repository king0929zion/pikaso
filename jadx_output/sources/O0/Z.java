package o0;

import A.AbstractC0000a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import n0.C0444z;

/* loaded from: classes.dex */
public final class Z extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5534d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f5535e;

    public Z(Context context) {
        super(context);
        setClipChildren(false);
        this.f5534d = new HashMap();
        this.f5535e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, C0444z> getHolderToLayoutNode() {
        return this.f5534d;
    }

    public final HashMap<C0444z, Object> getLayoutNodeToHolder() {
        return this.f5535e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        Iterator it = this.f5534d.keySet().iterator();
        if (it.hasNext()) {
            AbstractC0000a.j(it.next());
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!(View.MeasureSpec.getMode(i3) == 1073741824)) {
            Z0.d.R("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (!(View.MeasureSpec.getMode(i4) == 1073741824)) {
            Z0.d.R("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i4));
        Iterator it = this.f5534d.keySet().iterator();
        if (it.hasNext()) {
            AbstractC0000a.j(it.next());
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0444z c0444z = (C0444z) this.f5534d.get(childAt);
            if (childAt.isLayoutRequested() && c0444z != null) {
                C0444z.F(c0444z, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
