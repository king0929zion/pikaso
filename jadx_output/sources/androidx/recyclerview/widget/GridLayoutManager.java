package androidx.recyclerview.widget;

import A.AbstractC0000a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import e1.j;
import k.H;
import z1.C0724C;
import z1.C0738l;
import z1.F;
import z1.w;
import z1.x;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: q, reason: collision with root package name */
    public int f3496q;

    /* renamed from: r, reason: collision with root package name */
    public final H f3497r;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f3496q = -1;
        new SparseIntArray();
        new SparseIntArray();
        this.f3497r = new H(9);
        new Rect();
        int i5 = w.y(context, attributeSet, i3, i4).f7065c;
        if (i5 == this.f3496q) {
            return;
        }
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC0000a.c("Span count should be at least 1. Provided ", i5));
        }
        this.f3496q = i5;
        ((SparseIntArray) this.f3497r.f4656b).clear();
        L();
    }

    @Override // z1.w
    public final void E(C0724C c0724c, F f3, View view, j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0738l) {
            ((C0738l) layoutParams).getClass();
            throw null;
        }
        D(view, jVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.V(false);
    }

    public final int W(C0724C c0724c, F f3, int i3) {
        boolean z3 = f3.f6961f;
        H h = this.f3497r;
        if (!z3) {
            int i4 = this.f3496q;
            h.getClass();
            return H.k(i3, i4);
        }
        RecyclerView recyclerView = c0724c.f6954g;
        if (i3 < 0 || i3 >= recyclerView.f3533b0.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + recyclerView.f3533b0.a() + recyclerView.o());
        }
        int h3 = !recyclerView.f3533b0.f6961f ? i3 : recyclerView.f3539f.h(i3, 0);
        if (h3 != -1) {
            int i5 = this.f3496q;
            h.getClass();
            return H.k(h3, i5);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    @Override // z1.w
    public final boolean d(x xVar) {
        return xVar instanceof C0738l;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, z1.w
    public final int g(F f3) {
        return O(f3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, z1.w
    public final int h(F f3) {
        return P(f3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, z1.w
    public final int j(F f3) {
        return O(f3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, z1.w
    public final int k(F f3) {
        return P(f3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, z1.w
    public final x l() {
        return this.h == 0 ? new C0738l(-2, -1) : new C0738l(-1, -2);
    }

    @Override // z1.w
    public final x m(Context context, AttributeSet attributeSet) {
        C0738l c0738l = new C0738l(context, attributeSet);
        c0738l.f7061c = -1;
        c0738l.f7062d = 0;
        return c0738l;
    }

    @Override // z1.w
    public final x n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0738l c0738l = new C0738l((ViewGroup.MarginLayoutParams) layoutParams);
            c0738l.f7061c = -1;
            c0738l.f7062d = 0;
            return c0738l;
        }
        C0738l c0738l2 = new C0738l(layoutParams);
        c0738l2.f7061c = -1;
        c0738l2.f7062d = 0;
        return c0738l2;
    }

    @Override // z1.w
    public final int q(C0724C c0724c, F f3) {
        if (this.h == 1) {
            return this.f3496q;
        }
        if (f3.a() < 1) {
            return 0;
        }
        return W(c0724c, f3, f3.a() - 1) + 1;
    }

    @Override // z1.w
    public final int z(C0724C c0724c, F f3) {
        if (this.h == 0) {
            return this.f3496q;
        }
        if (f3.a() < 1) {
            return 0;
        }
        return W(c0724c, f3, f3.a() - 1) + 1;
    }
}
