package t;

import a.AbstractC0090a;
import d2.C0249t;
import l0.InterfaceC0360j;
import n0.AbstractC0418L;
import n0.InterfaceC0437s;

/* loaded from: classes.dex */
public final class o extends P.k implements InterfaceC0437s {

    /* renamed from: q, reason: collision with root package name */
    public float f6177q;

    /* renamed from: r, reason: collision with root package name */
    public float f6178r;

    /* renamed from: s, reason: collision with root package name */
    public float f6179s;

    /* renamed from: t, reason: collision with root package name */
    public float f6180t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6181u;

    @Override // n0.InterfaceC0437s
    public final M1.j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        int b3 = abstractC0418L.b(this.f6179s) + abstractC0418L.b(this.f6177q);
        int b4 = abstractC0418L.b(this.f6180t) + abstractC0418L.b(this.f6178r);
        l0.o a3 = interfaceC0360j.a(AbstractC0090a.V(-b3, -b4, j3));
        return abstractC0418L.b0(AbstractC0090a.p(j3, a3.f4927d + b3), AbstractC0090a.o(j3, a3.f4928e + b4), C0249t.f4256d, new D2.p(this, a3, abstractC0418L, 3));
    }
}
