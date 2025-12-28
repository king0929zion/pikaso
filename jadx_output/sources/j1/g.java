package j1;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import k.AbstractC0299a0;

/* loaded from: classes.dex */
public final class g implements View.OnTouchListener {

    /* renamed from: u, reason: collision with root package name */
    public static final int f4606u = ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    public final C0294a f4607d;

    /* renamed from: e, reason: collision with root package name */
    public final AccelerateInterpolator f4608e;

    /* renamed from: f, reason: collision with root package name */
    public final ListView f4609f;

    /* renamed from: g, reason: collision with root package name */
    public M1.h f4610g;
    public final float[] h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f4611i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4612j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4613k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f4614l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f4615m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f4616n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4617o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4618p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4619q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4620r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4621s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC0299a0 f4622t;

    public g(AbstractC0299a0 abstractC0299a0) {
        C0294a c0294a = new C0294a();
        c0294a.f4602e = Long.MIN_VALUE;
        c0294a.f4604g = -1L;
        c0294a.f4603f = 0L;
        this.f4607d = c0294a;
        this.f4608e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4611i = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f4614l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f4615m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4616n = fArr5;
        this.f4609f = abstractC0299a0;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f4612j = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f4613k = f4606u;
        c0294a.f4598a = 500;
        c0294a.f4599b = 500;
        this.f4622t = abstractC0299a0;
    }

    public static float b(float f3, float f4, float f5) {
        return f3 > f5 ? f5 : f3 < f4 ? f4 : f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.h
            r0 = r0[r4]
            float[] r1 = r3.f4611i
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f4608e
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f4614l
            r0 = r0[r4]
            float[] r1 = r3.f4615m
            r1 = r1[r4]
            float[] r2 = r3.f4616n
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.g.a(int, float, float, float):float");
    }

    public final float c(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i3 = this.f4612j;
        if (i3 == 0 || i3 == 1) {
            if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (this.f4620r && i3 == 1) {
                    return 1.0f;
                }
            }
        } else if (i3 == 2 && f3 < 0.0f) {
            return f3 / (-f4);
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f4618p) {
            this.f4620r = false;
            return;
        }
        C0294a c0294a = this.f4607d;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (currentAnimationTimeMillis - c0294a.f4602e);
        int i5 = c0294a.f4599b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        c0294a.f4605i = i3;
        c0294a.h = c0294a.a(currentAnimationTimeMillis);
        c0294a.f4604g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC0299a0 abstractC0299a0;
        int count;
        C0294a c0294a = this.f4607d;
        float f3 = c0294a.f4601d;
        int abs = (int) (f3 / Math.abs(f3));
        Math.abs(c0294a.f4600c);
        if (abs == 0 || (count = (abstractC0299a0 = this.f4622t).getCount()) == 0) {
            return false;
        }
        int childCount = abstractC0299a0.getChildCount();
        int firstVisiblePosition = abstractC0299a0.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i3 >= count && abstractC0299a0.getChildAt(childCount - 1).getBottom() <= abstractC0299a0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && abstractC0299a0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r1 != 3) goto L28;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 2
            boolean r1 = r7.f4621s
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r0) goto L1e
            r8 = 3
            if (r1 == r8) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.f4619q = r3
            r7.f4617o = r2
        L1e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f4609f
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            j1.a r9 = r7.f4607d
            r9.f4600c = r1
            r9.f4601d = r8
            boolean r8 = r7.f4620r
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            M1.h r8 = r7.f4610g
            if (r8 != 0) goto L5f
            M1.h r8 = new M1.h
            r8.<init>(r0, r7)
            r7.f4610g = r8
        L5f:
            r7.f4620r = r3
            r7.f4618p = r3
            boolean r8 = r7.f4617o
            if (r8 != 0) goto L74
            int r8 = r7.f4613k
            if (r8 <= 0) goto L74
            M1.h r9 = r7.f4610g
            long r0 = (long) r8
            java.lang.reflect.Field r8 = d1.AbstractC0189K.f4150a
            r5.postOnAnimationDelayed(r9, r0)
            goto L79
        L74:
            M1.h r8 = r7.f4610g
            r8.run()
        L79:
            r7.f4617o = r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
