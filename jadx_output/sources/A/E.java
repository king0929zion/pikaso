package A;

import n0.InterfaceC0427h;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class E implements q.H {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8c;

    public E(boolean z3, float f3, long j3) {
        this.f6a = z3;
        this.f7b = f3;
        this.f8c = j3;
    }

    @Override // q.H
    public final InterfaceC0427h a(s.g gVar) {
        t tVar = new t(1, this);
        return new v(gVar, this.f6a, this.f7b, tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e3 = (E) obj;
        if (this.f6a == e3.f6a && G0.e.a(this.f7b, e3.f7b) && p2.g.a(null, null)) {
            return W.r.c(this.f8c, e3.f8c);
        }
        return false;
    }

    public final int hashCode() {
        int a3 = AbstractC0537f.a(this.f7b, Boolean.hashCode(this.f6a) * 31, 961);
        int i3 = W.r.f2563g;
        return Long.hashCode(this.f8c) + a3;
    }
}
