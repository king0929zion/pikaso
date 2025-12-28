package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class o extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3795c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3796d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3797e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3798f;

    public o(float f3, float f4, float f5, float f6) {
        super(2, true, false);
        this.f3795c = f3;
        this.f3796d = f4;
        this.f3797e = f5;
        this.f3798f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f3795c, oVar.f3795c) == 0 && Float.compare(this.f3796d, oVar.f3796d) == 0 && Float.compare(this.f3797e, oVar.f3797e) == 0 && Float.compare(this.f3798f, oVar.f3798f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3798f) + AbstractC0537f.a(this.f3797e, AbstractC0537f.a(this.f3796d, Float.hashCode(this.f3795c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f3795c);
        sb.append(", y1=");
        sb.append(this.f3796d);
        sb.append(", x2=");
        sb.append(this.f3797e);
        sb.append(", y2=");
        return AbstractC0000a.f(sb, this.f3798f, ')');
    }
}
