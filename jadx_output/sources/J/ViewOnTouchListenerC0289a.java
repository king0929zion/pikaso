package j;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.C0306e;
import k.C0308f;
import k.C0310g;
import k.RunnableC0303c0;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0289a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f4470d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4471e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4472f;

    /* renamed from: g, reason: collision with root package name */
    public final View f4473g;
    public RunnableC0303c0 h;

    /* renamed from: i, reason: collision with root package name */
    public RunnableC0303c0 f4474i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4475j;

    /* renamed from: k, reason: collision with root package name */
    public int f4476k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f4477l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4478m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f4479n;

    public ViewOnTouchListenerC0289a(View view) {
        this.f4477l = new int[2];
        this.f4473g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4470d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4471e = tapTimeout;
        this.f4472f = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0303c0 runnableC0303c0 = this.f4474i;
        View view = this.f4473g;
        if (runnableC0303c0 != null) {
            view.removeCallbacks(runnableC0303c0);
        }
        RunnableC0303c0 runnableC0303c02 = this.h;
        if (runnableC0303c02 != null) {
            view.removeCallbacks(runnableC0303c02);
        }
    }

    public final k b() {
        C0306e c0306e;
        switch (this.f4478m) {
            case 0:
                AbstractC0290b abstractC0290b = ((ActionMenuItemView) this.f4479n).f3082p;
                if (abstractC0290b == null || (c0306e = ((C0308f) abstractC0290b).f4773a.f4794v) == null) {
                    return null;
                }
                return c0306e.a();
            default:
                C0306e c0306e2 = ((C0310g) this.f4479n).f4776g.f4793u;
                if (c0306e2 == null) {
                    return null;
                }
                return c0306e2.a();
        }
    }

    public final boolean c() {
        k b3;
        switch (this.f4478m) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f4479n;
                h hVar = actionMenuItemView.f3080n;
                return hVar != null && hVar.a(actionMenuItemView.f3077k) && (b3 = b()) != null && b3.h();
            default:
                ((C0310g) this.f4479n).f4776g.h();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.ViewOnTouchListenerC0289a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4475j = false;
        this.f4476k = -1;
        RunnableC0303c0 runnableC0303c0 = this.h;
        if (runnableC0303c0 != null) {
            this.f4473g.removeCallbacks(runnableC0303c0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0289a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f4478m = 0;
        this.f4479n = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0289a(C0310g c0310g, C0310g c0310g2) {
        this(c0310g2);
        this.f4478m = 1;
        this.f4479n = c0310g;
    }
}
