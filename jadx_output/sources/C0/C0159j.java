package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* renamed from: c0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159j extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3781c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3782d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3783e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3784f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3785g;
    public final float h;

    public C0159j(float f3, float f4, float f5, float f6, float f7, float f8) {
        super(2, true, false);
        this.f3781c = f3;
        this.f3782d = f4;
        this.f3783e = f5;
        this.f3784f = f6;
        this.f3785g = f7;
        this.h = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0159j)) {
            return false;
        }
        C0159j c0159j = (C0159j) obj;
        return Float.compare(this.f3781c, c0159j.f3781c) == 0 && Float.compare(this.f3782d, c0159j.f3782d) == 0 && Float.compare(this.f3783e, c0159j.f3783e) == 0 && Float.compare(this.f3784f, c0159j.f3784f) == 0 && Float.compare(this.f3785g, c0159j.f3785g) == 0 && Float.compare(this.h, c0159j.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + AbstractC0537f.a(this.f3785g, AbstractC0537f.a(this.f3784f, AbstractC0537f.a(this.f3783e, AbstractC0537f.a(this.f3782d, Float.hashCode(this.f3781c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f3781c);
        sb.append(", y1=");
        sb.append(this.f3782d);
        sb.append(", x2=");
        sb.append(this.f3783e);
        sb.append(", y2=");
        sb.append(this.f3784f);
        sb.append(", x3=");
        sb.append(this.f3785g);
        sb.append(", y3=");
        return AbstractC0000a.f(sb, this.h, ')');
    }
}
