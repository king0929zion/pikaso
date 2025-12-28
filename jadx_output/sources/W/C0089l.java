package W;

import A.AbstractC0000a;
import android.graphics.ColorFilter;

/* renamed from: W.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f2549a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2550b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2551c;

    public C0089l(long j3, int i3, ColorFilter colorFilter) {
        this.f2549a = colorFilter;
        this.f2550b = j3;
        this.f2551c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0089l)) {
            return false;
        }
        C0089l c0089l = (C0089l) obj;
        return r.c(this.f2550b, c0089l.f2550b) && D.l(this.f2551c, c0089l.f2551c);
    }

    public final int hashCode() {
        int i3 = r.f2563g;
        return Integer.hashCode(this.f2551c) + (Long.hashCode(this.f2550b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0000a.i(this.f2550b, sb, ", blendMode=");
        int i3 = this.f2551c;
        sb.append((Object) (D.l(i3, 0) ? "Clear" : D.l(i3, 1) ? "Src" : D.l(i3, 2) ? "Dst" : D.l(i3, 3) ? "SrcOver" : D.l(i3, 4) ? "DstOver" : D.l(i3, 5) ? "SrcIn" : D.l(i3, 6) ? "DstIn" : D.l(i3, 7) ? "SrcOut" : D.l(i3, 8) ? "DstOut" : D.l(i3, 9) ? "SrcAtop" : D.l(i3, 10) ? "DstAtop" : D.l(i3, 11) ? "Xor" : D.l(i3, 12) ? "Plus" : D.l(i3, 13) ? "Modulate" : D.l(i3, 14) ? "Screen" : D.l(i3, 15) ? "Overlay" : D.l(i3, 16) ? "Darken" : D.l(i3, 17) ? "Lighten" : D.l(i3, 18) ? "ColorDodge" : D.l(i3, 19) ? "ColorBurn" : D.l(i3, 20) ? "HardLight" : D.l(i3, 21) ? "Softlight" : D.l(i3, 22) ? "Difference" : D.l(i3, 23) ? "Exclusion" : D.l(i3, 24) ? "Multiply" : D.l(i3, 25) ? "Hue" : D.l(i3, 26) ? "Saturation" : D.l(i3, 27) ? "Color" : D.l(i3, 28) ? "Luminosity" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
