package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328p {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0326o f4850a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f4851b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f4852c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4853d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4854e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4855f;

    public C0328p(AbstractC0326o abstractC0326o) {
        this.f4850a = abstractC0326o;
    }

    public final void a() {
        AbstractC0326o abstractC0326o = this.f4850a;
        Drawable a3 = j1.c.a(abstractC0326o);
        if (a3 != null) {
            if (this.f4853d || this.f4854e) {
                Drawable mutate = a3.mutate();
                if (this.f4853d) {
                    W0.a.h(mutate, this.f4851b);
                }
                if (this.f4854e) {
                    W0.a.i(mutate, this.f4852c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(abstractC0326o.getDrawableState());
                }
                abstractC0326o.setButtonDrawable(mutate);
            }
        }
    }
}
