package androidx.compose.foundation.layout;

import G0.e;
import P.k;
import n0.P;
import p.AbstractC0537f;
import t.o;

/* loaded from: classes.dex */
final class PaddingElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final float f3278a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3279b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3280c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3281d;

    public PaddingElement(float f3, float f4, float f5, float f6) {
        this.f3278a = f3;
        this.f3279b = f4;
        this.f3280c = f5;
        this.f3281d = f6;
        if ((f3 < 0.0f && !e.a(f3, Float.NaN)) || ((f4 < 0.0f && !e.a(f4, Float.NaN)) || ((f5 < 0.0f && !e.a(f5, Float.NaN)) || (f6 < 0.0f && !e.a(f6, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // n0.P
    public final k d() {
        o oVar = new o();
        oVar.f6177q = this.f3278a;
        oVar.f6178r = this.f3279b;
        oVar.f6179s = this.f3280c;
        oVar.f6180t = this.f3281d;
        oVar.f6181u = true;
        return oVar;
    }

    @Override // n0.P
    public final void e(k kVar) {
        o oVar = (o) kVar;
        oVar.f6177q = this.f3278a;
        oVar.f6178r = this.f3279b;
        oVar.f6179s = this.f3280c;
        oVar.f6180t = this.f3281d;
        oVar.f6181u = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && e.a(this.f3278a, paddingElement.f3278a) && e.a(this.f3279b, paddingElement.f3279b) && e.a(this.f3280c, paddingElement.f3280c) && e.a(this.f3281d, paddingElement.f3281d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0537f.a(this.f3281d, AbstractC0537f.a(this.f3280c, AbstractC0537f.a(this.f3279b, Float.hashCode(this.f3278a) * 31, 31), 31), 31);
    }
}
