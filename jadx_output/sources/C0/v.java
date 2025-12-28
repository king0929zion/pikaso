package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class v extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3817c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3818d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3819e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3820f;

    public v(float f3, float f4, float f5, float f6) {
        super(1, false, true);
        this.f3817c = f3;
        this.f3818d = f4;
        this.f3819e = f5;
        this.f3820f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f3817c, vVar.f3817c) == 0 && Float.compare(this.f3818d, vVar.f3818d) == 0 && Float.compare(this.f3819e, vVar.f3819e) == 0 && Float.compare(this.f3820f, vVar.f3820f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3820f) + AbstractC0537f.a(this.f3819e, AbstractC0537f.a(this.f3818d, Float.hashCode(this.f3817c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f3817c);
        sb.append(", dy1=");
        sb.append(this.f3818d);
        sb.append(", dx2=");
        sb.append(this.f3819e);
        sb.append(", dy2=");
        return AbstractC0000a.f(sb, this.f3820f, ')');
    }
}
