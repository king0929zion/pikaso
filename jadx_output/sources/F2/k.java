package F2;

import D2.AbstractC0071a;
import D2.x;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1235a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1236b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1237c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1238d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1239e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1240f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f1241g;
    public static final i h;

    static {
        String str;
        int i3 = x.f1089a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1235a = str;
        f1236b = AbstractC0071a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = x.f1089a;
        if (i4 < 2) {
            i4 = 2;
        }
        f1237c = AbstractC0071a.k("kotlinx.coroutines.scheduler.core.pool.size", i4, 1, 0, 8);
        f1238d = AbstractC0071a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f1239e = TimeUnit.SECONDS.toNanos(AbstractC0071a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1240f = f.f1229a;
        f1241g = new i(0);
        h = new i(1);
    }
}
