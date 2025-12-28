package c2;

import java.io.Serializable;

/* renamed from: c2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175n implements InterfaceC0165d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public p2.h f3841d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3842e;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o2.a, p2.h] */
    @Override // c2.InterfaceC0165d
    public final Object getValue() {
        if (this.f3842e == C0173l.f3839a) {
            ?? r02 = this.f3841d;
            p2.g.b(r02);
            this.f3842e = r02.c();
            this.f3841d = null;
        }
        return this.f3842e;
    }

    public final String toString() {
        return this.f3842e != C0173l.f3839a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
