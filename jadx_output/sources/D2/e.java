package D2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1052a;

    static {
        try {
            Iterator it = Arrays.asList(new z2.b()).iterator();
            p2.g.e(it, "<this>");
            f1052a = w2.h.a0(new w2.a(new w2.d(1, it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
