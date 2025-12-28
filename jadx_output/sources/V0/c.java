package V0;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2459e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2461b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2462c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2463d;

    public c(int i3, int i4, int i5, int i6) {
        this.f2460a = i3;
        this.f2461b = i4;
        this.f2462c = i5;
        this.f2463d = i6;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f2460a, cVar2.f2460a), Math.max(cVar.f2461b, cVar2.f2461b), Math.max(cVar.f2462c, cVar2.f2462c), Math.max(cVar.f2463d, cVar2.f2463d));
    }

    public static c b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f2459e : new c(i3, i4, i5, i6);
    }

    public static c c(Insets insets) {
        int i3;
        int i4;
        int i5;
        int i6;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return b(i3, i4, i5, i6);
    }

    public final Insets d() {
        return b.a(this.f2460a, this.f2461b, this.f2462c, this.f2463d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2463d == cVar.f2463d && this.f2460a == cVar.f2460a && this.f2462c == cVar.f2462c && this.f2461b == cVar.f2461b;
    }

    public final int hashCode() {
        return (((((this.f2460a * 31) + this.f2461b) * 31) + this.f2462c) * 31) + this.f2463d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2460a + ", top=" + this.f2461b + ", right=" + this.f2462c + ", bottom=" + this.f2463d + '}';
    }
}
