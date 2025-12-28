package x;

import a.AbstractC0090a;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0637b {
    public static void a(int i3) {
        u2.d dVar = new u2.d(2, 36, 1);
        if (2 > i3 || i3 > dVar.f6301e) {
            throw new IllegalArgumentException("radix " + i3 + " was not in valid range " + new u2.d(2, 36, 1));
        }
    }

    public static final long b(long j3, boolean z3, int i3, float f3) {
        int h = ((z3 || AbstractC0090a.z(i3, 2)) && G0.a.d(j3)) ? G0.a.h(j3) : Integer.MAX_VALUE;
        if (G0.a.j(j3) != h) {
            h = Z.b.k(Z.b.d(f3), G0.a.j(j3), h);
        }
        int g3 = G0.a.g(j3);
        int min = Math.min(0, 262142);
        int min2 = h == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(h, 262142);
        int h3 = AbstractC0090a.h(min2 == Integer.MAX_VALUE ? min : min2);
        return AbstractC0090a.a(min, min2, Math.min(h3, 0), g3 != Integer.MAX_VALUE ? Math.min(h3, g3) : Integer.MAX_VALUE);
    }

    public static boolean c(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    public abstract void d(int i3, int i4);

    public abstract void e();
}
