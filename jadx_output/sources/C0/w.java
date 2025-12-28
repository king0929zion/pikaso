package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class w extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3821c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3822d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3823e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3824f;

    public w(float f3, float f4, float f5, float f6) {
        super(2, true, false);
        this.f3821c = f3;
        this.f3822d = f4;
        this.f3823e = f5;
        this.f3824f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f3821c, wVar.f3821c) == 0 && Float.compare(this.f3822d, wVar.f3822d) == 0 && Float.compare(this.f3823e, wVar.f3823e) == 0 && Float.compare(this.f3824f, wVar.f3824f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3824f) + AbstractC0537f.a(this.f3823e, AbstractC0537f.a(this.f3822d, Float.hashCode(this.f3821c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f3821c);
        sb.append(", dy1=");
        sb.append(this.f3822d);
        sb.append(", dx2=");
        sb.append(this.f3823e);
        sb.append(", dy2=");
        return AbstractC0000a.f(sb, this.f3824f, ')');
    }
}
