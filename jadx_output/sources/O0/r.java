package o0;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c2.C0174m;
import g0.C0263a;
import g0.C0264b;

/* loaded from: classes.dex */
public final class r extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0507u f5643f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(C0507u c0507u, int i3) {
        super(1);
        this.f5642e = i3;
        this.f5643f = c0507u;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        U.a aVar;
        boolean requestFocus;
        switch (this.f5642e) {
            case 0:
                KeyEvent keyEvent = ((C0264b) obj).f4325a;
                C0507u c0507u = this.f5643f;
                c0507u.getClass();
                long a3 = Z.b.a(keyEvent.getKeyCode());
                if (C0263a.a(a3, C0263a.h)) {
                    aVar = new U.a(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (C0263a.a(a3, C0263a.f4316f)) {
                    aVar = new U.a(4);
                } else if (C0263a.a(a3, C0263a.f4315e)) {
                    aVar = new U.a(3);
                } else {
                    aVar = C0263a.a(a3, C0263a.f4313c) ? true : C0263a.a(a3, C0263a.f4320k) ? new U.a(5) : C0263a.a(a3, C0263a.f4314d) ? true : C0263a.a(a3, C0263a.f4321l) ? new U.a(6) : C0263a.a(a3, C0263a.f4317g) ? true : C0263a.a(a3, C0263a.f4318i) ? true : C0263a.a(a3, C0263a.f4322m) ? new U.a(7) : C0263a.a(a3, C0263a.f4312b) ? true : C0263a.a(a3, C0263a.f4319j) ? new U.a(8) : null;
                }
                if (aVar != null) {
                    if (Z0.d.A(keyEvent) == 2) {
                        V.d v3 = c0507u.v();
                        U.g focusOwner = c0507u.getFocusOwner();
                        C0500q c0500q = new C0500q(aVar, 1);
                        int i3 = aVar.f2331a;
                        Boolean c3 = ((androidx.compose.ui.focus.a) focusOwner).c(i3, v3, c0500q);
                        if (c3 != null ? c3.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(U.a.a(i3, 1) ? true : U.a.a(i3, 2))) {
                            return Boolean.FALSE;
                        }
                        Integer H2 = U.c.H(i3);
                        if (H2 == null) {
                            throw new IllegalStateException("Invalid focus direction");
                        }
                        int intValue = H2.intValue();
                        Rect B3 = v3 != null ? W.D.B(v3) : null;
                        if (B3 == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        View view = c0507u;
                        while (true) {
                            if (view != null) {
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View rootView = c0507u.getRootView();
                                p2.g.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                                if (view != null) {
                                    if (!view.equals(c0507u)) {
                                        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                            if (parent == c0507u) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                view = null;
                            }
                        }
                        if (p2.g.a(view, c0507u)) {
                            view = null;
                        }
                        if (view != null) {
                            Integer valueOf = Integer.valueOf(intValue);
                            if (view instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) view;
                                if (viewGroup.isFocused()) {
                                    requestFocus = true;
                                } else if (viewGroup.isFocusable() && !view.hasFocus()) {
                                    requestFocus = view.requestFocus(valueOf.intValue(), B3);
                                } else if (view instanceof C0507u) {
                                    requestFocus = view.requestFocus(valueOf.intValue(), B3);
                                } else if (B3 != null) {
                                    View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, B3, valueOf.intValue());
                                    requestFocus = findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(valueOf.intValue(), B3) : view.requestFocus(valueOf.intValue(), B3);
                                } else {
                                    View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, valueOf.intValue());
                                    requestFocus = findNextFocus != null ? findNextFocus.requestFocus(valueOf.intValue()) : view.requestFocus(valueOf.intValue());
                                }
                            } else {
                                requestFocus = view.requestFocus(valueOf.intValue(), B3);
                            }
                            if (requestFocus) {
                                return Boolean.TRUE;
                            }
                        }
                        if (!((androidx.compose.ui.focus.a) c0507u.getFocusOwner()).a(i3, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean c4 = ((androidx.compose.ui.focus.a) c0507u.getFocusOwner()).c(i3, null, new C0500q(aVar, 0));
                        return Boolean.valueOf(c4 != null ? c4.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            default:
                o2.a aVar2 = (o2.a) obj;
                C0507u c0507u2 = this.f5643f;
                Handler handler = c0507u2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar2.c();
                } else {
                    Handler handler2 = c0507u2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new R.a(10, aVar2));
                    }
                }
                return C0174m.f3840a;
        }
    }
}
