package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class q extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3801c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3802d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3803e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3804f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3805g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3806i;

    public q(float f3, float f4, float f5, boolean z3, boolean z4, float f6, float f7) {
        super(3, false, false);
        this.f3801c = f3;
        this.f3802d = f4;
        this.f3803e = f5;
        this.f3804f = z3;
        this.f3805g = z4;
        this.h = f6;
        this.f3806i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f3801c, qVar.f3801c) == 0 && Float.compare(this.f3802d, qVar.f3802d) == 0 && Float.compare(this.f3803e, qVar.f3803e) == 0 && this.f3804f == qVar.f3804f && this.f3805g == qVar.f3805g && Float.compare(this.h, qVar.h) == 0 && Float.compare(this.f3806i, qVar.f3806i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3806i) + AbstractC0537f.a(this.h, (Boolean.hashCode(this.f3805g) + ((Boolean.hashCode(this.f3804f) + AbstractC0537f.a(this.f3803e, AbstractC0537f.a(this.f3802d, Float.hashCode(this.f3801c) * 31, 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f3801c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f3802d);
        sb.append(", theta=");
        sb.append(this.f3803e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f3804f);
        sb.append(", isPositiveArc=");
        sb.append(this.f3805g);
        sb.append(", arcStartDx=");
        sb.append(this.h);
        sb.append(", arcStartDy=");
        return AbstractC0000a.f(sb, this.f3806i, ')');
    }
}
