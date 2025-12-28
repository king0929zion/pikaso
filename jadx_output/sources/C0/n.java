package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class n extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3791c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3792d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3793e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3794f;

    public n(float f3, float f4, float f5, float f6) {
        super(1, false, true);
        this.f3791c = f3;
        this.f3792d = f4;
        this.f3793e = f5;
        this.f3794f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f3791c, nVar.f3791c) == 0 && Float.compare(this.f3792d, nVar.f3792d) == 0 && Float.compare(this.f3793e, nVar.f3793e) == 0 && Float.compare(this.f3794f, nVar.f3794f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3794f) + AbstractC0537f.a(this.f3793e, AbstractC0537f.a(this.f3792d, Float.hashCode(this.f3791c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f3791c);
        sb.append(", y1=");
        sb.append(this.f3792d);
        sb.append(", x2=");
        sb.append(this.f3793e);
        sb.append(", y2=");
        return AbstractC0000a.f(sb, this.f3794f, ')');
    }
}
