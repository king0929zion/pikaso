package U1;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends U0.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r2.a f2419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f2420f;

    public b(d dVar, r2.a aVar) {
        this.f2420f = dVar;
        this.f2419e = aVar;
    }

    @Override // U0.b
    public final void g(int i3) {
        this.f2420f.f2436m = true;
        this.f2419e.Q(i3);
    }

    @Override // U0.b
    public final void h(Typeface typeface) {
        d dVar = this.f2420f;
        dVar.f2437n = Typeface.create(typeface, dVar.f2427c);
        dVar.f2436m = true;
        this.f2419e.R(dVar.f2437n, false);
    }
}
