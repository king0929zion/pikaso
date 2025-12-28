package a2;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108g extends X1.f {

    /* renamed from: q, reason: collision with root package name */
    public final RectF f2975q;

    public C0108g(X1.k kVar, RectF rectF) {
        super(kVar);
        this.f2975q = rectF;
    }

    @Override // X1.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0109h c0109h = new C0109h(this);
        c0109h.f2977A = this;
        c0109h.invalidateSelf();
        return c0109h;
    }

    public C0108g(C0108g c0108g) {
        super(c0108g);
        this.f2975q = c0108g.f2975q;
    }
}
