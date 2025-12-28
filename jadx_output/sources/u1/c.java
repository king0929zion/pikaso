package U1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends r2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextPaint f2422c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.a f2423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f2424e;

    public c(d dVar, Context context, TextPaint textPaint, r2.a aVar) {
        this.f2424e = dVar;
        this.f2421b = context;
        this.f2422c = textPaint;
        this.f2423d = aVar;
    }

    @Override // r2.a
    public final void Q(int i3) {
        this.f2423d.Q(i3);
    }

    @Override // r2.a
    public final void R(Typeface typeface, boolean z3) {
        this.f2424e.g(this.f2421b, this.f2422c, typeface);
        this.f2423d.R(typeface, z3);
    }
}
