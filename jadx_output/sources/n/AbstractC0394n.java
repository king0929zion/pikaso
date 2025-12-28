package n;

import java.util.ConcurrentModificationException;
import o.AbstractC0450a;

/* renamed from: n.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0394n {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4999a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f5000b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5001c = new Object();

    public static final void a(C0387g c0387g, int i3) {
        p2.g.e(c0387g, "<this>");
        c0387g.f4987d = new int[i3];
        c0387g.f4988e = new Object[i3];
    }

    public static final int b(C0387g c0387g, Object obj, int i3) {
        p2.g.e(c0387g, "<this>");
        int i4 = c0387g.f4989f;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0450a.a(c0387g.f4989f, i3, c0387g.f4987d);
            if (a3 < 0 || p2.g.a(obj, c0387g.f4988e[a3])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && c0387g.f4987d[i5] == i3) {
                if (p2.g.a(obj, c0387g.f4988e[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && c0387g.f4987d[i6] == i3; i6--) {
                if (p2.g.a(obj, c0387g.f4988e[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
