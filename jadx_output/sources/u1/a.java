package U1;

import A.t;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends r2.a {

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f2416b;

    /* renamed from: c, reason: collision with root package name */
    public final t f2417c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2418d;

    public a(t tVar, Typeface typeface) {
        this.f2416b = typeface;
        this.f2417c = tVar;
    }

    @Override // r2.a
    public final void Q(int i3) {
        if (this.f2418d) {
            return;
        }
        S1.b bVar = (S1.b) this.f2417c.f175e;
        if (bVar.j(this.f2416b)) {
            bVar.h(false);
        }
    }

    @Override // r2.a
    public final void R(Typeface typeface, boolean z3) {
        if (this.f2418d) {
            return;
        }
        S1.b bVar = (S1.b) this.f2417c.f175e;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
