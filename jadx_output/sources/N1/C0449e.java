package n1;

import M1.h;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449e {

    /* renamed from: v, reason: collision with root package name */
    public static final InterpolatorC0448d f5341v = new InterpolatorC0448d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f5342a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5343b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f5345d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f5346e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f5347f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f5348g;
    public int[] h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f5349i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f5350j;

    /* renamed from: k, reason: collision with root package name */
    public int f5351k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f5352l;

    /* renamed from: m, reason: collision with root package name */
    public final float f5353m;

    /* renamed from: n, reason: collision with root package name */
    public final float f5354n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5355o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f5356p;

    /* renamed from: q, reason: collision with root package name */
    public final Z.b f5357q;

    /* renamed from: r, reason: collision with root package name */
    public View f5358r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5359s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f5360t;

    /* renamed from: c, reason: collision with root package name */
    public int f5344c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final h f5361u = new h(5, this);

    public C0449e(Context context, CoordinatorLayout coordinatorLayout, Z.b bVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f5360t = coordinatorLayout;
        this.f5357q = bVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5355o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f5343b = viewConfiguration.getScaledTouchSlop();
        this.f5353m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5354n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5356p = new OverScroller(context, f5341v);
    }

    public final void a() {
        this.f5344c = -1;
        float[] fArr = this.f5345d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f5346e, 0.0f);
            Arrays.fill(this.f5347f, 0.0f);
            Arrays.fill(this.f5348g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.f5349i, 0);
            Arrays.fill(this.f5350j, 0);
            this.f5351k = 0;
        }
        VelocityTracker velocityTracker = this.f5352l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5352l = null;
        }
    }

    public final void b(View view, int i3) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f5360t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f5358r = view;
        this.f5344c = i3;
        this.f5357q.G(view, i3);
        n(1);
    }

    public final boolean c(View view, float f3, float f4) {
        if (view == null) {
            return false;
        }
        Z.b bVar = this.f5357q;
        boolean z3 = bVar.x(view) > 0;
        boolean z4 = bVar.y() > 0;
        if (!z3 || !z4) {
            return z3 ? Math.abs(f3) > ((float) this.f5343b) : z4 && Math.abs(f4) > ((float) this.f5343b);
        }
        float f5 = (f4 * f4) + (f3 * f3);
        int i3 = this.f5343b;
        return f5 > ((float) (i3 * i3));
    }

    public final void d(int i3) {
        float[] fArr = this.f5345d;
        if (fArr != null) {
            int i4 = this.f5351k;
            int i5 = 1 << i3;
            if ((i4 & i5) != 0) {
                fArr[i3] = 0.0f;
                this.f5346e[i3] = 0.0f;
                this.f5347f[i3] = 0.0f;
                this.f5348g[i3] = 0.0f;
                this.h[i3] = 0;
                this.f5349i[i3] = 0;
                this.f5350j[i3] = 0;
                this.f5351k = (~i5) & i4;
            }
        }
    }

    public final int e(int i3, int i4, int i5) {
        if (i3 == 0) {
            return 0;
        }
        float width = this.f5360t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i3) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i4);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / i5) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f5342a == 2) {
            OverScroller overScroller = this.f5356p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f5358r.getLeft();
            int top = currY - this.f5358r.getTop();
            if (left != 0) {
                View view = this.f5358r;
                Field field = AbstractC0189K.f4150a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f5358r;
                Field field2 = AbstractC0189K.f4150a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f5357q.I(this.f5358r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f5360t.post(this.f5361u);
            }
        }
        return this.f5342a == 2;
    }

    public final View g(int i3, int i4) {
        CoordinatorLayout coordinatorLayout = this.f5360t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f5357q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f5358r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f5358r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f5356p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.n(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f5358r
            float r0 = r10.f5354n
            int r0 = (int) r0
            float r6 = r10.f5353m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3d
        L3b:
            r14 = r11
            goto L45
        L3d:
            if (r7 <= r6) goto L45
            if (r14 <= 0) goto L43
            r14 = r6
            goto L45
        L43:
            int r11 = -r6
            goto L3b
        L45:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5f
            float r11 = (float) r6
            float r6 = (float) r8
        L5d:
            float r11 = r11 / r6
            goto L62
        L5f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L5d
        L62:
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
        L66:
            float r0 = r0 / r6
            goto L6b
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L66
        L6b:
            Z.b r6 = r10.f5357q
            int r12 = r6.x(r12)
            int r12 = r10.e(r4, r13, r12)
            int r13 = r6.y()
            int r13 = r10.e(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.n(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C0449e.h(int, int, int, int):boolean");
    }

    public final boolean i(int i3) {
        if ((this.f5351k & (1 << i3)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f5352l == null) {
            this.f5352l = VelocityTracker.obtain();
        }
        this.f5352l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g3 = g((int) x3, (int) y3);
            l(x3, y3, pointerId);
            q(g3, pointerId);
            int i5 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f5342a == 1) {
                k();
            }
            a();
            return;
        }
        Z.b bVar = this.f5357q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f5342a == 1) {
                    this.f5359s = true;
                    bVar.J(this.f5358r, 0.0f, 0.0f);
                    this.f5359s = false;
                    if (this.f5342a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                l(x4, y4, pointerId2);
                if (this.f5342a == 0) {
                    q(g((int) x4, (int) y4), pointerId2);
                    int i6 = this.h[pointerId2];
                    return;
                }
                int i7 = (int) x4;
                int i8 = (int) y4;
                View view = this.f5358r;
                if (view != null) {
                    i4 = (i7 < view.getLeft() || i7 >= view.getRight() || i8 < view.getTop() || i8 >= view.getBottom()) ? 0 : 1;
                }
                if (i4 != 0) {
                    q(this.f5358r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f5342a == 1 && pointerId3 == this.f5344c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i4 >= pointerCount) {
                        i3 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i4);
                    if (pointerId4 != this.f5344c) {
                        View g4 = g((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                        View view2 = this.f5358r;
                        if (g4 == view2 && q(view2, pointerId4)) {
                            i3 = this.f5344c;
                            break;
                        }
                    }
                    i4++;
                }
                if (i3 == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f5342a == 1) {
            if (i(this.f5344c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f5344c);
                float x5 = motionEvent.getX(findPointerIndex);
                float y5 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f5347f;
                int i9 = this.f5344c;
                int i10 = (int) (x5 - fArr[i9]);
                int i11 = (int) (y5 - this.f5348g[i9]);
                int left = this.f5358r.getLeft() + i10;
                int top = this.f5358r.getTop() + i11;
                int left2 = this.f5358r.getLeft();
                int top2 = this.f5358r.getTop();
                if (i10 != 0) {
                    left = bVar.h(this.f5358r, left);
                    Field field = AbstractC0189K.f4150a;
                    this.f5358r.offsetLeftAndRight(left - left2);
                }
                if (i11 != 0) {
                    top = bVar.i(this.f5358r, top);
                    Field field2 = AbstractC0189K.f4150a;
                    this.f5358r.offsetTopAndBottom(top - top2);
                }
                if (i10 != 0 || i11 != 0) {
                    bVar.I(this.f5358r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i4 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i4);
            if (i(pointerId5)) {
                float x6 = motionEvent.getX(i4);
                float y6 = motionEvent.getY(i4);
                float f3 = x6 - this.f5345d[pointerId5];
                float f4 = y6 - this.f5346e[pointerId5];
                Math.abs(f3);
                Math.abs(f4);
                int i12 = this.h[pointerId5];
                Math.abs(f4);
                Math.abs(f3);
                int i13 = this.h[pointerId5];
                Math.abs(f3);
                Math.abs(f4);
                int i14 = this.h[pointerId5];
                Math.abs(f4);
                Math.abs(f3);
                int i15 = this.h[pointerId5];
                if (this.f5342a != 1) {
                    View g5 = g((int) x6, (int) y6);
                    if (c(g5, f3, f4) && q(g5, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i4++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f5352l;
        float f3 = this.f5353m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.f5352l.getXVelocity(this.f5344c);
        float f4 = this.f5354n;
        float abs = Math.abs(xVelocity);
        float f5 = 0.0f;
        if (abs < f4) {
            xVelocity = 0.0f;
        } else if (abs > f3) {
            xVelocity = xVelocity > 0.0f ? f3 : -f3;
        }
        float yVelocity = this.f5352l.getYVelocity(this.f5344c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f3) {
                if (yVelocity <= 0.0f) {
                    f3 = -f3;
                }
                f5 = f3;
            } else {
                f5 = yVelocity;
            }
        }
        this.f5359s = true;
        this.f5357q.J(this.f5358r, xVelocity, f5);
        this.f5359s = false;
        if (this.f5342a == 1) {
            n(0);
        }
    }

    public final void l(float f3, float f4, int i3) {
        float[] fArr = this.f5345d;
        if (fArr == null || fArr.length <= i3) {
            int i4 = i3 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5346e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5347f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5348g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5349i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5350j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5345d = fArr2;
            this.f5346e = fArr3;
            this.f5347f = fArr4;
            this.f5348g = fArr5;
            this.h = iArr;
            this.f5349i = iArr2;
            this.f5350j = iArr3;
        }
        float[] fArr9 = this.f5345d;
        this.f5347f[i3] = f3;
        fArr9[i3] = f3;
        float[] fArr10 = this.f5346e;
        this.f5348g[i3] = f4;
        fArr10[i3] = f4;
        int[] iArr7 = this.h;
        int i5 = (int) f3;
        int i6 = (int) f4;
        CoordinatorLayout coordinatorLayout = this.f5360t;
        int left = coordinatorLayout.getLeft();
        int i7 = this.f5355o;
        int i8 = i5 < left + i7 ? 1 : 0;
        if (i6 < coordinatorLayout.getTop() + i7) {
            i8 |= 4;
        }
        if (i5 > coordinatorLayout.getRight() - i7) {
            i8 |= 2;
        }
        if (i6 > coordinatorLayout.getBottom() - i7) {
            i8 |= 8;
        }
        iArr7[i3] = i8;
        this.f5351k |= 1 << i3;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if (i(pointerId)) {
                float x3 = motionEvent.getX(i3);
                float y3 = motionEvent.getY(i3);
                this.f5347f[pointerId] = x3;
                this.f5348g[pointerId] = y3;
            }
        }
    }

    public final void n(int i3) {
        this.f5360t.removeCallbacks(this.f5361u);
        if (this.f5342a != i3) {
            this.f5342a = i3;
            this.f5357q.H(i3);
            if (this.f5342a == 0) {
                this.f5358r = null;
            }
        }
    }

    public final boolean o(int i3, int i4) {
        if (this.f5359s) {
            return h(i3, i4, (int) this.f5352l.getXVelocity(this.f5344c), (int) this.f5352l.getYVelocity(this.f5344c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C0449e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i3) {
        if (view == this.f5358r && this.f5344c == i3) {
            return true;
        }
        if (view == null || !this.f5357q.P(view, i3)) {
            return false;
        }
        this.f5344c = i3;
        b(view, i3);
        return true;
    }
}
