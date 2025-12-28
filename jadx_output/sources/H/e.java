package H;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static e f1309b;

    /* renamed from: a, reason: collision with root package name */
    public Object f1310a;

    public e(Object obj) {
        this.f1310a = obj;
    }

    public e() {
        this.f1310a = new Object();
        new Handler(Looper.getMainLooper(), new Z1.e(this));
    }
}
