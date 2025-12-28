package w0;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f6535a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f6536b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (p2.g.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (p2.g.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f6535a = alignment;
        f6536b = alignment2;
    }
}
