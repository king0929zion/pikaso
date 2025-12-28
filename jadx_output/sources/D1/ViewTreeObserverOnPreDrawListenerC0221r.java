package d1;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: d1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0221r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f4232d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f4233e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f4234f;

    public ViewTreeObserverOnPreDrawListenerC0221r(View view, Runnable runnable) {
        this.f4232d = view;
        this.f4233e = view.getViewTreeObserver();
        this.f4234f = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f4233e.isAlive();
        View view = this.f4232d;
        if (isAlive) {
            this.f4233e.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f4234f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4233e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f4233e.isAlive();
        View view2 = this.f4232d;
        if (isAlive) {
            this.f4233e.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
