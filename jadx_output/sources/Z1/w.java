package z1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.ArrayList;
import y1.AbstractC0667a;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public B0.a f7081a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f7082b;

    /* renamed from: c, reason: collision with root package name */
    public final B2.i f7083c;

    /* renamed from: d, reason: collision with root package name */
    public final B2.i f7084d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7085e;

    /* renamed from: f, reason: collision with root package name */
    public int f7086f;

    /* renamed from: g, reason: collision with root package name */
    public int f7087g;

    public w() {
        v vVar = new v(this, 0);
        v vVar2 = new v(this, 1);
        this.f7083c = new B2.i(vVar);
        this.f7084d = new B2.i(vVar2);
        this.f7085e = false;
    }

    public static int e(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i5) : size : Math.min(size, Math.max(i4, i5));
    }

    public static int x(View view) {
        ((x) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0739m y(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0739m c0739m = new C0739m(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0667a.f6747a, i3, i4);
        c0739m.f7064b = obtainStyledAttributes.getInt(0, 1);
        c0739m.f7065c = obtainStyledAttributes.getInt(10, 1);
        c0739m.f7066d = obtainStyledAttributes.getBoolean(9, false);
        c0739m.f7067e = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c0739m;
    }

    public boolean A() {
        return false;
    }

    public void B(RecyclerView recyclerView) {
    }

    public void C(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f7082b;
        C0724C c0724c = recyclerView.f3535d;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f7082b.canScrollVertically(-1) && !this.f7082b.canScrollHorizontally(-1) && !this.f7082b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        this.f7082b.getClass();
    }

    public final void D(View view, e1.j jVar) {
        RecyclerView.r(view);
    }

    public void E(C0724C c0724c, F f3, View view, e1.j jVar) {
        jVar.i(e1.i.a(false, c() ? x(view) : 0, 1, b() ? x(view) : 0, 1));
    }

    public void F(Parcelable parcelable) {
    }

    public Parcelable G() {
        return null;
    }

    public void H(int i3) {
    }

    public final void I(C0724C c0724c) {
        for (int p3 = p() - 1; p3 >= 0; p3--) {
            if (!RecyclerView.r(o(p3)).o()) {
                View o3 = o(p3);
                if (o(p3) != null) {
                    B0.a aVar = this.f7081a;
                    int q3 = aVar.q(p3);
                    C0742p c0742p = (C0742p) aVar.f271b;
                    View childAt = c0742p.f7072a.getChildAt(q3);
                    if (childAt != null) {
                        if (((C0728b) aVar.f272c).e(q3)) {
                            aVar.L(childAt);
                        }
                        c0742p.a(q3);
                    }
                }
                c0724c.e(o3);
            }
        }
    }

    public final void J(C0724C c0724c) {
        ArrayList arrayList;
        int size = c0724c.f6948a.size();
        int i3 = size - 1;
        while (true) {
            arrayList = c0724c.f6948a;
            if (i3 < 0) {
                break;
            }
            ((I) arrayList.get(i3)).getClass();
            I r3 = RecyclerView.r(null);
            if (!r3.o()) {
                r3.n(false);
                if (r3.k()) {
                    this.f7082b.removeDetachedView(null, false);
                }
                t tVar = this.f7082b.f3516H;
                if (tVar != null) {
                    tVar.b(r3);
                }
                r3.n(true);
                I r4 = RecyclerView.r(null);
                r4.f6973c = null;
                r4.f6974d = false;
                r4.f6972b &= -33;
                c0724c.f(r4);
            }
            i3--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0724c.f6949b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f7082b.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean K(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.u()
            int r1 = r8.w()
            int r2 = r8.f7086f
            int r3 = r8.v()
            int r2 = r2 - r3
            int r3 = r8.f7087g
            int r4 = r8.t()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.s()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.u()
            int r2 = r8.w()
            int r3 = r8.f7086f
            int r4 = r8.v()
            int r3 = r3 - r4
            int r4 = r8.f7087g
            int r5 = r8.t()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f7082b
            android.graphics.Rect r5 = r5.f3545j
            r8.r(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.B(r11, r10, r0)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.w.K(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void L() {
        RecyclerView recyclerView = this.f7082b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void M(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f7082b = null;
            this.f7081a = null;
            this.f7086f = 0;
            this.f7087g = 0;
            return;
        }
        this.f7082b = recyclerView;
        this.f7081a = recyclerView.f3541g;
        this.f7086f = recyclerView.getWidth();
        this.f7087g = recyclerView.getHeight();
    }

    public void a(String str) {
        RecyclerView recyclerView = this.f7082b;
        if (recyclerView != null) {
            recyclerView.c(str);
        }
    }

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(x xVar) {
        return xVar != null;
    }

    public abstract int f(F f3);

    public abstract int g(F f3);

    public abstract int h(F f3);

    public abstract int i(F f3);

    public abstract int j(F f3);

    public abstract int k(F f3);

    public abstract x l();

    public x m(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    public x n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x ? new x((x) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new x((ViewGroup.MarginLayoutParams) layoutParams) : new x(layoutParams);
    }

    public final View o(int i3) {
        B0.a aVar = this.f7081a;
        if (aVar == null) {
            return null;
        }
        return ((C0742p) aVar.f271b).f7072a.getChildAt(aVar.q(i3));
    }

    public final int p() {
        B0.a aVar = this.f7081a;
        if (aVar != null) {
            return ((C0742p) aVar.f271b).f7072a.getChildCount() - ((ArrayList) aVar.f273d).size();
        }
        return 0;
    }

    public int q(C0724C c0724c, F f3) {
        return 1;
    }

    public void r(View view, Rect rect) {
        int[] iArr = RecyclerView.f3506m0;
        x xVar = (x) view.getLayoutParams();
        Rect rect2 = xVar.f7088a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) xVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) xVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) xVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) xVar).bottomMargin);
    }

    public final int s() {
        RecyclerView recyclerView = this.f7082b;
        Field field = AbstractC0189K.f4150a;
        return recyclerView.getLayoutDirection();
    }

    public final int t() {
        RecyclerView recyclerView = this.f7082b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f7082b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int v() {
        RecyclerView recyclerView = this.f7082b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int w() {
        RecyclerView recyclerView = this.f7082b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int z(C0724C c0724c, F f3) {
        return 1;
    }
}
