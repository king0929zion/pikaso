package A2;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f257a = new h();

    public static b a(int i3, int i4, int i5) {
        b mVar;
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        if (i3 != -2) {
            if (i3 == -1) {
                if (i4 == 1) {
                    return new m(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i3 != 0) {
                return i3 != Integer.MAX_VALUE ? i4 == 1 ? new b(i3, null) : new m(i3, i4, null) : new b(Integer.MAX_VALUE, null);
            }
            mVar = i4 == 1 ? new b(0, null) : new m(1, i4, null);
        } else if (i4 == 1) {
            f.f255a.getClass();
            mVar = new b(e.f254b, null);
        } else {
            mVar = new m(1, i4, null);
        }
        return mVar;
    }
}
