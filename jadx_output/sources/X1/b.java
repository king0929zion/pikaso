package X1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f2665a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2666b;

    public b(float f3, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f2665a;
            f3 += ((b) cVar).f2666b;
        }
        this.f2665a = cVar;
        this.f2666b = f3;
    }

    @Override // X1.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2665a.a(rectF) + this.f2666b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2665a.equals(bVar.f2665a) && this.f2666b == bVar.f2666b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2665a, Float.valueOf(this.f2666b)});
    }
}
