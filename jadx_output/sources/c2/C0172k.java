package c2;

import java.io.Serializable;

/* renamed from: c2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172k implements InterfaceC0165d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public o2.a f3836d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f3837e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3838f;

    public C0172k(o2.a aVar) {
        p2.g.e(aVar, "initializer");
        this.f3836d = aVar;
        this.f3837e = C0173l.f3839a;
        this.f3838f = this;
    }

    @Override // c2.InterfaceC0165d
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f3837e;
        C0173l c0173l = C0173l.f3839a;
        if (obj2 != c0173l) {
            return obj2;
        }
        synchronized (this.f3838f) {
            obj = this.f3837e;
            if (obj == c0173l) {
                o2.a aVar = this.f3836d;
                p2.g.b(aVar);
                obj = aVar.c();
                this.f3837e = obj;
                this.f3836d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f3837e != C0173l.f3839a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
