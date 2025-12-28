package D;

import android.os.Looper;

/* renamed from: D.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0028b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f736a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f737b = 0;

    static {
        long j3;
        Z.b.C(C0026a.f734e);
        try {
            j3 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j3 = -1;
        }
        f736a = j3;
    }
}
