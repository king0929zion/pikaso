package d2;

/* renamed from: d2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0251v extends Z0.d {
    public static int X(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
