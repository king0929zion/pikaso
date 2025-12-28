package p2;

import c2.C0167f;

/* loaded from: classes.dex */
public final class i extends j implements v2.c, o2.c {
    public i(String str, String str2) {
        super(a.f5943d, t0.p.class, str, str2, 1);
    }

    @Override // p2.b
    public final v2.a b() {
        p.f5961a.getClass();
        return this;
    }

    public final void g() {
        if (this.f5957j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        v2.a f3 = f();
        if (f3 == this) {
            throw new C0167f("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((i) ((v2.c) f3)).g();
    }

    @Override // o2.c
    public final Object i(Object obj) {
        g();
        throw null;
    }
}
