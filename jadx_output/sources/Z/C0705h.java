package z;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705h {

    /* renamed from: a, reason: collision with root package name */
    public final float f6867a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6868b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6869c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6870d;

    public C0705h(float f3, float f4, float f5, float f6) {
        this.f6867a = f3;
        this.f6868b = f4;
        this.f6869c = f5;
        this.f6870d = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0705h)) {
            return false;
        }
        C0705h c0705h = (C0705h) obj;
        return this.f6867a == c0705h.f6867a && this.f6868b == c0705h.f6868b && this.f6869c == c0705h.f6869c && this.f6870d == c0705h.f6870d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6870d) + AbstractC0537f.a(this.f6869c, AbstractC0537f.a(this.f6868b, Float.hashCode(this.f6867a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f6867a);
        sb.append(", focusedAlpha=");
        sb.append(this.f6868b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f6869c);
        sb.append(", pressedAlpha=");
        return AbstractC0000a.f(sb, this.f6870d, ')');
    }
}
