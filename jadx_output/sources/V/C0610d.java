package v;

import G0.f;
import W.A;
import W.B;
import W.H;
import W.z;
import a.AbstractC0090a;
import p2.g;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610d implements H {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0607a f6310d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0607a f6311e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0607a f6312f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0607a f6313g;

    public C0610d(InterfaceC0607a interfaceC0607a, InterfaceC0607a interfaceC0607a2, InterfaceC0607a interfaceC0607a3, InterfaceC0607a interfaceC0607a4) {
        this.f6310d = interfaceC0607a;
        this.f6311e = interfaceC0607a2;
        this.f6312f = interfaceC0607a3;
        this.f6313g = interfaceC0607a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [v.a] */
    public static C0610d a(C0610d c0610d, C0608b c0608b, C0608b c0608b2, C0608b c0608b3, int i3) {
        C0608b c0608b4 = c0608b;
        if ((i3 & 1) != 0) {
            c0608b4 = c0610d.f6310d;
        }
        InterfaceC0607a interfaceC0607a = c0610d.f6311e;
        C0608b c0608b5 = c0608b2;
        if ((i3 & 4) != 0) {
            c0608b5 = c0610d.f6312f;
        }
        c0610d.getClass();
        return new C0610d(c0608b4, interfaceC0607a, c0608b5, c0608b3);
    }

    @Override // W.H
    public final B b(long j3, f fVar, G0.b bVar) {
        float a3 = this.f6310d.a(j3, bVar);
        float a4 = this.f6311e.a(j3, bVar);
        float a5 = this.f6312f.a(j3, bVar);
        float a6 = this.f6313g.a(j3, bVar);
        float c3 = V.f.c(j3);
        float f3 = a3 + a6;
        if (f3 > c3) {
            float f4 = c3 / f3;
            a3 *= f4;
            a6 *= f4;
        }
        float f5 = a4 + a5;
        if (f5 > c3) {
            float f6 = c3 / f5;
            a4 *= f6;
            a5 *= f6;
        }
        if (a3 < 0.0f || a4 < 0.0f || a5 < 0.0f || a6 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a3 + ", topEnd = " + a4 + ", bottomEnd = " + a5 + ", bottomStart = " + a6 + ")!").toString());
        }
        if (a3 + a4 + a5 + a6 == 0.0f) {
            return new z(AbstractC0090a.c(0L, j3));
        }
        V.d c4 = AbstractC0090a.c(0L, j3);
        f fVar2 = f.f1258d;
        float f7 = fVar == fVar2 ? a3 : a4;
        long a7 = r2.a.a(f7, f7);
        if (fVar == fVar2) {
            a3 = a4;
        }
        long a8 = r2.a.a(a3, a3);
        float f8 = fVar == fVar2 ? a5 : a6;
        long a9 = r2.a.a(f8, f8);
        if (fVar != fVar2) {
            a6 = a5;
        }
        return new A(new V.e(c4.f2446a, c4.f2447b, c4.f2448c, c4.f2449d, a7, a8, a9, r2.a.a(a6, a6)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0610d)) {
            return false;
        }
        C0610d c0610d = (C0610d) obj;
        if (!g.a(this.f6310d, c0610d.f6310d)) {
            return false;
        }
        if (!g.a(this.f6311e, c0610d.f6311e)) {
            return false;
        }
        if (g.a(this.f6312f, c0610d.f6312f)) {
            return g.a(this.f6313g, c0610d.f6313g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6313g.hashCode() + ((this.f6312f.hashCode() + ((this.f6311e.hashCode() + (this.f6310d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f6310d + ", topEnd = " + this.f6311e + ", bottomEnd = " + this.f6312f + ", bottomStart = " + this.f6313g + ')';
    }
}
