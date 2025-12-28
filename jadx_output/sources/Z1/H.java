package z1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import n1.InterpolatorC0448d;

/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f6965d;

    /* renamed from: e, reason: collision with root package name */
    public int f6966e;

    /* renamed from: f, reason: collision with root package name */
    public OverScroller f6967f;

    /* renamed from: g, reason: collision with root package name */
    public Interpolator f6968g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6969i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f6970j;

    public H(RecyclerView recyclerView) {
        this.f6970j = recyclerView;
        InterpolatorC0448d interpolatorC0448d = RecyclerView.f3508o0;
        this.f6968g = interpolatorC0448d;
        this.h = false;
        this.f6969i = false;
        this.f6967f = new OverScroller(recyclerView.getContext(), interpolatorC0448d);
    }

    public final void a() {
        if (this.h) {
            this.f6969i = true;
            return;
        }
        RecyclerView recyclerView = this.f6970j;
        recyclerView.removeCallbacks(this);
        Field field = AbstractC0189K.f4150a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f6970j;
        if (recyclerView.f3548l == null) {
            recyclerView.removeCallbacks(this);
            this.f6967f.abortAnimation();
            return;
        }
        this.f6969i = false;
        this.h = true;
        recyclerView.f();
        OverScroller overScroller = this.f6967f;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.f6965d;
            int i4 = currY - this.f6966e;
            this.f6965d = currX;
            this.f6966e = currY;
            int[] iArr = recyclerView.f3546j0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean i5 = recyclerView.i(i3, i4, 1, iArr, null);
            int[] iArr2 = recyclerView.f3546j0;
            if (i5) {
                i3 -= iArr2[0];
                i4 -= iArr2[1];
            }
            int i6 = i3;
            int i7 = i4;
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.e(i6, i7);
            }
            if (!recyclerView.f3550m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f3546j0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.j(0, 0, i6, i7, null, 1, iArr3);
            int i8 = i6 - iArr2[0];
            int i9 = i7 - iArr2[1];
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i8 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i9 != 0));
            recyclerView.f3548l.getClass();
            if (z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i10 = i8 < 0 ? -currVelocity : i8 > 0 ? currVelocity : 0;
                    if (i9 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i9 <= 0) {
                        currVelocity = 0;
                    }
                    if (i10 < 0) {
                        recyclerView.l();
                        if (recyclerView.f3512D.isFinished()) {
                            recyclerView.f3512D.onAbsorb(-i10);
                        }
                    } else if (i10 > 0) {
                        recyclerView.m();
                        if (recyclerView.f3514F.isFinished()) {
                            recyclerView.f3514F.onAbsorb(i10);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.n();
                        if (recyclerView.f3513E.isFinished()) {
                            recyclerView.f3513E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.k();
                        if (recyclerView.f3515G.isFinished()) {
                            recyclerView.f3515G.onAbsorb(currVelocity);
                        }
                    }
                    if (i10 != 0 || currVelocity != 0) {
                        Field field = AbstractC0189K.f4150a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                S1.m mVar = recyclerView.f3532a0;
                mVar.getClass();
                mVar.f2322c = 0;
            } else {
                a();
                RunnableC0737k runnableC0737k = recyclerView.f3531W;
                if (runnableC0737k != null) {
                    runnableC0737k.a(recyclerView, 0, 0);
                }
            }
        }
        recyclerView.f3548l.getClass();
        this.h = false;
        if (!this.f6969i) {
            recyclerView.setScrollState(0);
            recyclerView.E(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field2 = AbstractC0189K.f4150a;
            recyclerView.postOnAnimation(this);
        }
    }
}
