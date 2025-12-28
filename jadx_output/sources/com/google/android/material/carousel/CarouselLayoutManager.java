package com.google.android.material.carousel;

import A.AbstractC0000a;
import O1.a;
import O1.b;
import O1.c;
import X1.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import z1.F;
import z1.w;
import z1.x;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends w {
    public b h;

    public CarouselLayoutManager() {
        new a();
        L();
        P(0);
    }

    public static e N(List list, float f3, boolean z3) {
        float f4 = Float.MAX_VALUE;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        float f5 = -3.4028235E38f;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((c) list.get(i7)).getClass();
            float abs = Math.abs(0.0f - f3);
            if (0.0f <= f3 && abs <= f4) {
                i3 = i7;
                f4 = abs;
            }
            if (0.0f > f3 && abs <= f6) {
                i5 = i7;
                f6 = abs;
            }
            if (0.0f <= f7) {
                f7 = 0.0f;
                i4 = i7;
            }
            if (0.0f > f5) {
                f5 = 0.0f;
                i6 = i7;
            }
        }
        if (i3 == -1) {
            i3 = i4;
        }
        if (i5 == -1) {
            i5 = i6;
        }
        return new e((c) list.get(i3), (c) list.get(i5));
    }

    @Override // z1.w
    public final void C(AccessibilityEvent accessibilityEvent) {
        super.C(accessibilityEvent);
        if (p() > 0) {
            accessibilityEvent.setFromIndex(w.x(o(0)));
            accessibilityEvent.setToIndex(w.x(o(p() - 1)));
        }
    }

    @Override // z1.w
    public final boolean K(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        return false;
    }

    public final boolean O() {
        return this.h.f2062a == 0;
    }

    public final void P(int i3) {
        b bVar;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException(AbstractC0000a.c("invalid orientation:", i3));
        }
        a(null);
        b bVar2 = this.h;
        if (bVar2 == null || i3 != bVar2.f2062a) {
            if (i3 == 0) {
                bVar = new b(this, 1);
            } else {
                if (i3 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                bVar = new b(this, 0);
            }
            this.h = bVar;
            L();
        }
    }

    @Override // z1.w
    public final boolean b() {
        return O();
    }

    @Override // z1.w
    public final boolean c() {
        return !O();
    }

    @Override // z1.w
    public final int f(F f3) {
        throw null;
    }

    @Override // z1.w
    public final int g(F f3) {
        return 0;
    }

    @Override // z1.w
    public final int h(F f3) {
        return 0 - 0;
    }

    @Override // z1.w
    public final int i(F f3) {
        throw null;
    }

    @Override // z1.w
    public final int j(F f3) {
        return 0;
    }

    @Override // z1.w
    public final int k(F f3) {
        return 0 - 0;
    }

    @Override // z1.w
    public final x l() {
        return new x(-2, -2);
    }

    @Override // z1.w
    public final void r(View view, Rect rect) {
        super.r(view, rect);
        rect.centerX();
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        new a();
        P(w.y(context, attributeSet, i3, i4).f7064b);
        L();
    }
}
