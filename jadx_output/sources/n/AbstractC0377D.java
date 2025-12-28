package n;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0377D {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f4966a = {-9187201950435737345L, -1};

    static {
        new C0405y(0);
    }

    public static final int a(int i3) {
        if (i3 == 7) {
            return 6;
        }
        return i3 - (i3 / 8);
    }

    public static final int b(int i3) {
        if (i3 == 0) {
            return 6;
        }
        return (i3 * 2) + 1;
    }

    public static final int c(int i3) {
        if (i3 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i3);
        }
        return 0;
    }

    public static final int d(int i3) {
        if (i3 == 7) {
            return 8;
        }
        return ((i3 - 1) / 7) + i3;
    }
}
