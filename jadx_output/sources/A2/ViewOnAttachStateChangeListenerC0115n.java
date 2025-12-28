package a2;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import d1.C0193O;
import java.lang.reflect.Field;
import java.util.Iterator;
import o0.AbstractC0468a;
import o0.C0455E;
import o0.b1;
import y2.h0;

/* renamed from: a2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0115n implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2996e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0115n(int i3, Object obj) {
        this.f2995d = i3;
        this.f2996e = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f2996e;
        switch (this.f2995d) {
            case 0:
                C0117p c0117p = (C0117p) obj;
                if (c0117p.f3020x != null && (accessibilityManager = c0117p.f3019w) != null) {
                    Field field = AbstractC0189K.f4150a;
                    if (c0117p.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new e1.b(c0117p.f3020x));
                        break;
                    }
                }
                break;
            case 3:
                C0455E c0455e = (C0455E) obj;
                AccessibilityManager accessibilityManager2 = c0455e.f5401g;
                accessibilityManager2.addAccessibilityStateChangeListener(c0455e.f5402i);
                accessibilityManager2.addTouchExplorationStateChangeListener(c0455e.f5403j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        boolean z3;
        switch (this.f2995d) {
            case 0:
                C0117p c0117p = (C0117p) this.f2996e;
                N.g gVar = c0117p.f3020x;
                if (gVar != null && (accessibilityManager = c0117p.f3019w) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new e1.b(gVar));
                    break;
                }
                break;
            case 1:
                j.f fVar = (j.f) this.f2996e;
                ViewTreeObserver viewTreeObserver = fVar.f4489A;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f4489A = view.getViewTreeObserver();
                    }
                    fVar.f4489A.removeGlobalOnLayoutListener(fVar.f4498l);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                j.s sVar = (j.s) this.f2996e;
                ViewTreeObserver viewTreeObserver2 = sVar.f4589r;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f4589r = view.getViewTreeObserver();
                    }
                    sVar.f4589r.removeGlobalOnLayoutListener(sVar.f4583l);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                C0455E c0455e = (C0455E) this.f2996e;
                c0455e.f5405l.removeCallbacks(c0455e.f5395I);
                AccessibilityManager accessibilityManager2 = c0455e.f5401g;
                accessibilityManager2.removeAccessibilityStateChangeListener(c0455e.f5402i);
                accessibilityManager2.removeTouchExplorationStateChangeListener(c0455e.f5403j);
                break;
            case 4:
                AbstractC0468a abstractC0468a = (AbstractC0468a) this.f2996e;
                p2.g.e(abstractC0468a, "<this>");
                Iterator it = w2.h.Y(abstractC0468a.getParent(), C0193O.f4155l).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            p2.g.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z3 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    b1 b1Var = abstractC0468a.f5539f;
                    if (b1Var != null) {
                        b1Var.e();
                    }
                    abstractC0468a.f5539f = null;
                    abstractC0468a.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((h0) this.f2996e).a(null);
                break;
        }
    }
}
