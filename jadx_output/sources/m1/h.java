package M1;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d1.AbstractC0189K;
import j1.C0294a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k.AbstractC0299a0;
import k.C0312h;
import n1.C0449e;
import o0.C0507u;
import s1.DialogInterfaceOnCancelListenerC0590d;
import z1.AbstractC0731e;
import z1.AbstractC0732f;
import z1.C0733g;
import z1.C0735i;
import z1.I;
import z1.RunnableC0729c;
import z1.t;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1689e;

    public /* synthetic */ h(int i3, Object obj) {
        this.f1688d = i3;
        this.f1689e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0312h c0312h;
        int i3 = 1;
        int i4 = 2;
        Object obj = this.f1689e;
        switch (this.f1688d) {
            case 0:
                i iVar = (i) obj;
                iVar.f1692c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) iVar.f1694e;
                C0449e c0449e = bottomSheetBehavior.f3888M;
                if (c0449e != null && c0449e.f()) {
                    iVar.a(iVar.f1691b);
                    return;
                } else {
                    if (bottomSheetBehavior.f3887L == 2) {
                        bottomSheetBehavior.C(iVar.f1691b);
                        return;
                    }
                    return;
                }
            case 1:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e3) {
                    if (!TextUtils.equals(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e3;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!TextUtils.equals(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
            case 2:
                j1.g gVar = (j1.g) obj;
                if (gVar.f4620r) {
                    boolean z3 = gVar.f4618p;
                    C0294a c0294a = gVar.f4607d;
                    if (z3) {
                        gVar.f4618p = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0294a.f4602e = currentAnimationTimeMillis;
                        c0294a.f4604g = -1L;
                        c0294a.f4603f = currentAnimationTimeMillis;
                        c0294a.h = 0.5f;
                    }
                    if ((c0294a.f4604g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0294a.f4604g + c0294a.f4605i) || !gVar.e()) {
                        gVar.f4620r = false;
                        return;
                    }
                    boolean z4 = gVar.f4619q;
                    ListView listView = gVar.f4609f;
                    if (z4) {
                        gVar.f4619q = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0294a.f4603f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a3 = c0294a.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - c0294a.f4603f;
                    c0294a.f4603f = currentAnimationTimeMillis2;
                    gVar.f4622t.scrollListBy((int) (j3 * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * c0294a.f4601d));
                    Field field = AbstractC0189K.f4150a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                AbstractC0299a0 abstractC0299a0 = (AbstractC0299a0) obj;
                abstractC0299a0.f4752o = null;
                abstractC0299a0.drawableStateChanged();
                return;
            case 4:
                ActionMenuView actionMenuView = ((Toolbar) obj).f3230d;
                if (actionMenuView == null || (c0312h = actionMenuView.f3153v) == null) {
                    return;
                }
                c0312h.h();
                return;
            case 5:
                ((C0449e) obj).n(0);
                return;
            case 6:
                C0507u c0507u = (C0507u) obj;
                c0507u.removeCallbacks(this);
                MotionEvent motionEvent = c0507u.f5714o0;
                if (motionEvent != null) {
                    r7 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (r7 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    C0507u c0507u2 = (C0507u) obj;
                    c0507u2.F(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, c0507u2.p0, false);
                    return;
                }
                return;
            case 7:
                ((DialogInterfaceOnCancelListenerC0590d) obj).h.onDismiss(null);
                return;
            case 8:
                ((B2.i) obj).i();
                throw null;
            case 9:
                C0735i c0735i = (C0735i) obj;
                int i5 = c0735i.f7049v;
                ValueAnimator valueAnimator = c0735i.f7048u;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                    return;
                }
                c0735i.f7049v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 10:
                t tVar = ((RecyclerView) obj).f3516H;
                if (tVar != null) {
                    C0733g c0733g = (C0733g) tVar;
                    ArrayList arrayList = c0733g.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0733g.f7018j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0733g.f7019k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0733g.f7017i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        ((I) it.next()).getClass();
                        throw null;
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        c0733g.f7021m.add(arrayList5);
                        arrayList2.clear();
                        RunnableC0729c runnableC0729c = new RunnableC0729c(c0733g, arrayList5, r7);
                        if (!isEmpty) {
                            ((AbstractC0732f) arrayList5.get(0)).getClass();
                            throw null;
                        }
                        runnableC0729c.run();
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(arrayList3);
                        c0733g.f7022n.add(arrayList6);
                        arrayList3.clear();
                        RunnableC0729c runnableC0729c2 = new RunnableC0729c(c0733g, arrayList6, i3);
                        if (!isEmpty) {
                            ((AbstractC0731e) arrayList6.get(0)).getClass();
                            throw null;
                        }
                        runnableC0729c2.run();
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.addAll(arrayList4);
                    c0733g.f7020l.add(arrayList7);
                    arrayList4.clear();
                    RunnableC0729c runnableC0729c3 = new RunnableC0729c(c0733g, arrayList7, i4);
                    if (isEmpty && isEmpty2 && isEmpty3) {
                        runnableC0729c3.run();
                        return;
                    }
                    Math.max(!isEmpty2 ? c0733g.f7077e : 0L, !isEmpty3 ? c0733g.f7078f : 0L);
                    ((I) arrayList7.get(0)).getClass();
                    Field field2 = AbstractC0189K.f4150a;
                    throw null;
                }
                return;
            default:
                ((StaggeredGridLayoutManager) obj).N();
                return;
        }
    }
}
