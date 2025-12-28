package androidx.compose.foundation.layout;

import G0.e;
import P.k;
import n0.P;
import p.AbstractC0537f;
import t.v;

/* loaded from: classes.dex */
final class SizeElement extends P {

    /* renamed from: a, reason: collision with root package name */
    public final float f3283a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3284b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3285c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3286d;

    public SizeElement(float f3, float f4, float f5, float f6) {
        this.f3283a = f3;
        this.f3284b = f4;
        this.f3285c = f5;
        this.f3286d = f6;
    }

    @Override // n0.P
    public final k d() {
        v vVar = new v();
        vVar.f6191q = this.f3283a;
        vVar.f6192r = this.f3284b;
        vVar.f6193s = this.f3285c;
        vVar.f6194t = this.f3286d;
        vVar.f6195u = true;
        return vVar;
    }

    @Override // n0.P
    public final void e(k kVar) {
        v vVar = (v) kVar;
        vVar.f6191q = this.f3283a;
        vVar.f6192r = this.f3284b;
        vVar.f6193s = this.f3285c;
        vVar.f6194t = this.f3286d;
        vVar.f6195u = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return e.a(this.f3283a, sizeElement.f3283a) && e.a(this.f3284b, sizeElement.f3284b) && e.a(this.f3285c, sizeElement.f3285c) && e.a(this.f3286d, sizeElement.f3286d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0537f.a(this.f3286d, AbstractC0537f.a(this.f3285c, AbstractC0537f.a(this.f3284b, Float.hashCode(this.f3283a) * 31, 31), 31), 31);
    }
}
