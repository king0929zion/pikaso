package o0;

import W.AbstractC0081d;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.ai.assistance.operit.provider.R;

/* renamed from: o0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0489k0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f5599d;

    public C0489k0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(W.o oVar, H0 h02, long j3) {
        super.drawChild(AbstractC0081d.a(oVar), h02, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            p2.g.c(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((H0) childAt).f5434k) {
                this.f5599d = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f5599d = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f5599d) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
