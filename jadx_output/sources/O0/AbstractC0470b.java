package o0;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0470b {

    /* renamed from: a, reason: collision with root package name */
    public String f5547a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5548b = new int[2];

    public abstract int[] a(int i3);

    public final int[] b(int i3, int i4) {
        if (i3 < 0 || i4 < 0 || i3 == i4) {
            return null;
        }
        int[] iArr = this.f5548b;
        iArr[0] = i3;
        iArr[1] = i4;
        return iArr;
    }

    public final String c() {
        String str = this.f5547a;
        if (str != null) {
            return str;
        }
        p2.g.h("text");
        throw null;
    }

    public abstract int[] d(int i3);
}
