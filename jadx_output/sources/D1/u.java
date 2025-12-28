package D1;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1025a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1026b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f1027c;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f1025a = true;
        f1026b = true;
        f1027c = i3 >= 28;
    }
}
