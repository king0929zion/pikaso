package z;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public final class t extends View {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f6895i = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f6896j = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public C0697E f6897d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f6898e;

    /* renamed from: f, reason: collision with root package name */
    public Long f6899f;

    /* renamed from: g, reason: collision with root package name */
    public R.a f6900g;
    public p2.h h;

    private final void setRippleState(boolean z3) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f6900g;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l3 = this.f6899f;
        long longValue = currentAnimationTimeMillis - (l3 != null ? l3.longValue() : 0L);
        if (z3 || longValue >= 5) {
            int[] iArr = z3 ? f6895i : f6896j;
            C0697E c0697e = this.f6897d;
            if (c0697e != null) {
                c0697e.setState(iArr);
            }
        } else {
            R.a aVar = new R.a(13, this);
            this.f6900g = aVar;
            postDelayed(aVar, 50L);
        }
        this.f6899f = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(t tVar) {
        C0697E c0697e = tVar.f6897d;
        if (c0697e != null) {
            c0697e.setState(f6896j);
        }
        tVar.f6900g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(s.i iVar, boolean z3, long j3, int i3, long j4, float f3, o2.a aVar) {
        if (this.f6897d == null || !Boolean.valueOf(z3).equals(this.f6898e)) {
            C0697E c0697e = new C0697E(z3);
            setBackground(c0697e);
            this.f6897d = c0697e;
            this.f6898e = Boolean.valueOf(z3);
        }
        C0697E c0697e2 = this.f6897d;
        p2.g.b(c0697e2);
        this.h = (p2.h) aVar;
        Integer num = c0697e2.f6840f;
        if (num == null || num.intValue() != i3) {
            c0697e2.f6840f = Integer.valueOf(i3);
            C0696D.f6837a.a(c0697e2, i3);
        }
        e(j3, j4, f3);
        if (z3) {
            c0697e2.setHotspot(V.c.b(iVar.f6118a), V.c.c(iVar.f6118a));
        } else {
            c0697e2.setHotspot(c0697e2.getBounds().centerX(), c0697e2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.h = null;
        R.a aVar = this.f6900g;
        if (aVar != null) {
            removeCallbacks(aVar);
            R.a aVar2 = this.f6900g;
            p2.g.b(aVar2);
            aVar2.run();
        } else {
            C0697E c0697e = this.f6897d;
            if (c0697e != null) {
                c0697e.setState(f6896j);
            }
        }
        C0697E c0697e2 = this.f6897d;
        if (c0697e2 == null) {
            return;
        }
        c0697e2.setVisible(false, false);
        unscheduleDrawable(c0697e2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j3, long j4, float f3) {
        C0697E c0697e = this.f6897d;
        if (c0697e == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f3 *= 2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        long b3 = W.r.b(j4, f3);
        W.r rVar = c0697e.f6839e;
        if (!(rVar == null ? false : W.r.c(rVar.f2564a, b3))) {
            c0697e.f6839e = new W.r(b3);
            c0697e.setColor(ColorStateList.valueOf(W.D.C(b3)));
        }
        Rect rect = new Rect(0, 0, r2.a.U(V.f.d(j3)), r2.a.U(V.f.b(j3)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        c0697e.setBounds(rect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o2.a, p2.h] */
    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ?? r12 = this.h;
        if (r12 != 0) {
            r12.c();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
