package c0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157h extends AbstractC0141A {

    /* renamed from: c, reason: collision with root package name */
    public final float f3774c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3775d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3776e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3777f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3778g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3779i;

    public C0157h(float f3, float f4, float f5, boolean z3, boolean z4, float f6, float f7) {
        super(3, false, false);
        this.f3774c = f3;
        this.f3775d = f4;
        this.f3776e = f5;
        this.f3777f = z3;
        this.f3778g = z4;
        this.h = f6;
        this.f3779i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0157h)) {
            return false;
        }
        C0157h c0157h = (C0157h) obj;
        return Float.compare(this.f3774c, c0157h.f3774c) == 0 && Float.compare(this.f3775d, c0157h.f3775d) == 0 && Float.compare(this.f3776e, c0157h.f3776e) == 0 && this.f3777f == c0157h.f3777f && this.f3778g == c0157h.f3778g && Float.compare(this.h, c0157h.h) == 0 && Float.compare(this.f3779i, c0157h.f3779i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3779i) + AbstractC0537f.a(this.h, (Boolean.hashCode(this.f3778g) + ((Boolean.hashCode(this.f3777f) + AbstractC0537f.a(this.f3776e, AbstractC0537f.a(this.f3775d, Float.hashCode(this.f3774c) * 31, 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f3774c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f3775d);
        sb.append(", theta=");
        sb.append(this.f3776e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f3777f);
        sb.append(", isPositiveArc=");
        sb.append(this.f3778g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return AbstractC0000a.f(sb, this.f3779i, ')');
    }
}
