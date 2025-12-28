package Q1;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public Long f2192a;

    @Override // Q1.c
    public final boolean a() {
        if (this.f2192a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l3 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l3.longValue();
                this.f2192a = l3;
            } catch (Exception unused) {
                this.f2192a = -1L;
            }
        }
        return this.f2192a.longValue() >= 40100;
    }
}
