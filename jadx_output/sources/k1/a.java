package K1;

import Z.b;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public int f1437a;

    /* renamed from: b, reason: collision with root package name */
    public int f1438b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f1439c;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f1439c = swipeDismissBehavior;
    }

    @Override // Z.b
    public final void G(View view, int i3) {
        this.f1438b = i3;
        this.f1437a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f1439c;
            swipeDismissBehavior.f3871c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f3871c = false;
        }
    }

    @Override // Z.b
    public final void H(int i3) {
        this.f1439c.getClass();
    }

    @Override // Z.b
    public final void I(View view, int i3, int i4) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f1439c;
        float f3 = width * swipeDismissBehavior.f3873e;
        float width2 = view.getWidth() * swipeDismissBehavior.f3874f;
        float abs = Math.abs(i3 - this.f1437a);
        if (abs <= f3) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f3) / (width2 - f3))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // Z.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f1438b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f1439c
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.reflect.Field r5 = d1.AbstractC0189K.f4150a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f3872d
            r7 = 2
            if (r6 != r7) goto L21
            goto L55
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L69
            goto L55
        L2a:
            if (r1 <= 0) goto L69
            goto L55
        L2d:
            if (r6 != r2) goto L69
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L69
            goto L55
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L69
            goto L55
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f1437a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r3.getClass()
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L69
        L55:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L64
            int r10 = r9.getLeft()
            int r0 = r8.f1437a
            if (r10 >= r0) goto L62
            goto L64
        L62:
            int r0 = r0 + r11
            goto L6c
        L64:
            int r10 = r8.f1437a
            int r0 = r10 - r11
            goto L6c
        L69:
            int r0 = r8.f1437a
            r2 = r4
        L6c:
            n1.e r10 = r3.f3869a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L82
            D2.h r10 = new D2.h
            r10.<init>(r3, r9, r2)
            java.lang.reflect.Field r11 = d1.AbstractC0189K.f4150a
            r9.postOnAnimation(r10)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.a.J(android.view.View, float, float):void");
    }

    @Override // Z.b
    public final boolean P(View view, int i3) {
        int i4 = this.f1438b;
        return (i4 == -1 || i4 == i3) && this.f1439c.r(view);
    }

    @Override // Z.b
    public final int h(View view, int i3) {
        int width;
        int width2;
        int width3;
        Field field = AbstractC0189K.f4150a;
        boolean z3 = view.getLayoutDirection() == 1;
        int i4 = this.f1439c.f3872d;
        if (i4 == 0) {
            if (z3) {
                width = this.f1437a - view.getWidth();
                width2 = this.f1437a;
            } else {
                width = this.f1437a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i4 != 1) {
            width = this.f1437a - view.getWidth();
            width2 = view.getWidth() + this.f1437a;
        } else if (z3) {
            width = this.f1437a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f1437a - view.getWidth();
            width2 = this.f1437a;
        }
        return Math.min(Math.max(width, i3), width2);
    }

    @Override // Z.b
    public final int i(View view, int i3) {
        return view.getTop();
    }

    @Override // Z.b
    public final int x(View view) {
        return view.getWidth();
    }
}
