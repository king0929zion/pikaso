package p2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements v2.a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient v2.a f5944d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5945e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f5946f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5947g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5948i;

    public b(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f5945e = obj;
        this.f5946f = cls;
        this.f5947g = str;
        this.h = str2;
        this.f5948i = z3;
    }

    public abstract v2.a b();

    public final c d() {
        Class cls = this.f5946f;
        if (!this.f5948i) {
            return p.a(cls);
        }
        p.f5961a.getClass();
        return new k(cls);
    }
}
