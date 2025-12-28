package o0;

import android.view.View;

/* loaded from: classes.dex */
public final class R0 implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f5491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D.v0 f5492e;

    public R0(View view, D.v0 v0Var) {
        this.f5491d = view;
        this.f5492e = v0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f5491d.removeOnAttachStateChangeListener(this);
        this.f5492e.d();
    }
}
