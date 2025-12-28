package i2;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Method f4463a;

    /* renamed from: b, reason: collision with root package name */
    public Method f4464b;

    /* renamed from: c, reason: collision with root package name */
    public Method f4465c;

    public f(Method method, Method method2, Method method3) {
        this.f4463a = method;
        this.f4464b = method2;
        this.f4465c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
