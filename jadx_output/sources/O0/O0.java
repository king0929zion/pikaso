package o0;

import java.lang.reflect.Method;
import z0.InterfaceC0720d;

/* loaded from: classes.dex */
public final class O0 implements h0.j, InterfaceC0720d, D0, C0 {

    /* renamed from: a, reason: collision with root package name */
    public static final N0 f5484a = new N0();

    public static final boolean a() {
        Class cls = C0507u.f5666A0;
        try {
            if (C0507u.f5666A0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C0507u.f5666A0 = cls2;
                C0507u.f5667B0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C0507u.f5667B0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
