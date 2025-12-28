package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class r extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3807c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3808d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3809e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3810f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3811g;
    public final float h;

    public r(float f3, float f4, float f5, float f6, float f7, float f8) {
        super(2, true, false);
        this.f3807c = f3;
        this.f3808d = f4;
        this.f3809e = f5;
        this.f3810f = f6;
        this.f3811g = f7;
        this.h = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f3807c, rVar.f3807c) == 0 && Float.compare(this.f3808d, rVar.f3808d) == 0 && Float.compare(this.f3809e, rVar.f3809e) == 0 && Float.compare(this.f3810f, rVar.f3810f) == 0 && Float.compare(this.f3811g, rVar.f3811g) == 0 && Float.compare(this.h, rVar.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + AbstractC0537f.a(this.f3811g, AbstractC0537f.a(this.f3810f, AbstractC0537f.a(this.f3809e, AbstractC0537f.a(this.f3808d, Float.hashCode(this.f3807c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f3807c);
        sb.append(", dy1=");
        sb.append(this.f3808d);
        sb.append(", dx2=");
        sb.append(this.f3809e);
        sb.append(", dy2=");
        sb.append(this.f3810f);
        sb.append(", dx3=");
        sb.append(this.f3811g);
        sb.append(", dy3=");
        return AbstractC0000a.f(sb, this.h, ')');
    }
}
