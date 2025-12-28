package z1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: z1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735i extends u {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f7027x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f7028y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f7029a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f7030b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f7031c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7032d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7033e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f7034f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f7035g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7036i;

    /* renamed from: j, reason: collision with root package name */
    public float f7037j;

    /* renamed from: k, reason: collision with root package name */
    public float f7038k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f7041n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f7048u;

    /* renamed from: v, reason: collision with root package name */
    public int f7049v;

    /* renamed from: w, reason: collision with root package name */
    public final M1.h f7050w;

    /* renamed from: l, reason: collision with root package name */
    public int f7039l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f7040m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7042o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7043p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f7044q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f7045r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f7046s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f7047t = new int[2];

    public C0735i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7048u = ofFloat;
        this.f7049v = 0;
        M1.h hVar = new M1.h(9, this);
        this.f7050w = hVar;
        C0734h c0734h = new C0734h();
        this.f7030b = stateListDrawable;
        this.f7031c = drawable;
        this.f7034f = stateListDrawable2;
        this.f7035g = drawable2;
        this.f7032d = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f7033e = Math.max(i3, drawable.getIntrinsicWidth());
        this.h = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f7036i = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f7029a = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new D1.i(this));
        ofFloat.addUpdateListener(new M1.c(2, this));
        RecyclerView recyclerView2 = this.f7041n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            w wVar = recyclerView2.f3548l;
            if (wVar != null) {
                wVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f3550m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.u();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f7041n;
            recyclerView3.f3551n.remove(this);
            if (recyclerView3.f3552o == this) {
                recyclerView3.f3552o = null;
            }
            ArrayList arrayList2 = this.f7041n.f3536d0;
            if (arrayList2 != null) {
                arrayList2.remove(c0734h);
            }
            this.f7041n.removeCallbacks(hVar);
        }
        this.f7041n = recyclerView;
        if (recyclerView != null) {
            w wVar2 = recyclerView.f3548l;
            if (wVar2 != null) {
                wVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f3550m;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.u();
            recyclerView.requestLayout();
            this.f7041n.f3551n.add(this);
            RecyclerView recyclerView4 = this.f7041n;
            if (recyclerView4.f3536d0 == null) {
                recyclerView4.f3536d0 = new ArrayList();
            }
            recyclerView4.f3536d0.add(c0734h);
        }
    }

    public static int e(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 == 0) {
            return 0;
        }
        int i7 = i3 - i5;
        int i8 = (int) (((f4 - f3) / i6) * i7);
        int i9 = i4 + i8;
        if (i9 >= i7 || i9 < 0) {
            return 0;
        }
        return i8;
    }

    @Override // z1.u
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i3 = this.f7039l;
        RecyclerView recyclerView2 = this.f7041n;
        if (i3 != recyclerView2.getWidth() || this.f7040m != recyclerView2.getHeight()) {
            this.f7039l = recyclerView2.getWidth();
            this.f7040m = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.f7049v != 0) {
            if (this.f7042o) {
                int i4 = this.f7039l;
                int i5 = this.f7032d;
                int i6 = i4 - i5;
                int i7 = 0 - (0 / 2);
                StateListDrawable stateListDrawable = this.f7030b;
                stateListDrawable.setBounds(0, 0, i5, 0);
                int i8 = this.f7040m;
                int i9 = this.f7033e;
                Drawable drawable = this.f7031c;
                drawable.setBounds(0, 0, i9, i8);
                Field field = AbstractC0189K.f4150a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i5, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i5, -i7);
                } else {
                    canvas.translate(i6, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i6, -i7);
                }
            }
            if (this.f7043p) {
                int i10 = this.f7040m;
                int i11 = this.h;
                int i12 = i10 - i11;
                StateListDrawable stateListDrawable2 = this.f7034f;
                stateListDrawable2.setBounds(0, 0, 0, i11);
                int i13 = this.f7039l;
                int i14 = this.f7036i;
                Drawable drawable2 = this.f7035g;
                drawable2.setBounds(0, 0, i13, i14);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(0 - (0 / 2), 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r3, -i12);
            }
        }
    }

    public final boolean c(float f3, float f4) {
        return f4 >= ((float) (this.f7040m - this.h)) && f3 >= ((float) (0 - (0 / 2))) && f3 <= ((float) ((0 / 2) + 0));
    }

    public final boolean d(float f3, float f4) {
        RecyclerView recyclerView = this.f7041n;
        Field field = AbstractC0189K.f4150a;
        boolean z3 = recyclerView.getLayoutDirection() == 1;
        int i3 = this.f7032d;
        if (z3) {
            if (f3 > i3 / 2) {
                return false;
            }
        } else if (f3 < this.f7039l - i3) {
            return false;
        }
        int i4 = 0 / 2;
        return f4 >= ((float) (0 - i4)) && f4 <= ((float) (i4 + 0));
    }

    public final void f(int i3) {
        M1.h hVar = this.f7050w;
        StateListDrawable stateListDrawable = this.f7030b;
        if (i3 == 2 && this.f7044q != 2) {
            stateListDrawable.setState(f7027x);
            this.f7041n.removeCallbacks(hVar);
        }
        if (i3 == 0) {
            this.f7041n.invalidate();
        } else {
            g();
        }
        if (this.f7044q == 2 && i3 != 2) {
            stateListDrawable.setState(f7028y);
            this.f7041n.removeCallbacks(hVar);
            this.f7041n.postDelayed(hVar, 1200);
        } else if (i3 == 1) {
            this.f7041n.removeCallbacks(hVar);
            this.f7041n.postDelayed(hVar, 1500);
        }
        this.f7044q = i3;
    }

    public final void g() {
        int i3 = this.f7049v;
        ValueAnimator valueAnimator = this.f7048u;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7049v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
