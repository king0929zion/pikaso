package z;

import c2.C0174m;
import g2.InterfaceC0271d;
import n0.AbstractC0409C;
import y2.InterfaceC0687u;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700c extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0713p f6856i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0701d f6857j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s.i f6858k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0700c(C0713p c0713p, C0701d c0701d, s.i iVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6856i = c0713p;
        this.f6857j = c0701d;
        this.f6858k = iVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0700c(this.f6856i, this.f6857j, this.f6858k, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0700c) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        s.i iVar = this.f6858k;
        C0701d c0701d = this.f6857j;
        try {
            if (i3 == 0) {
                Z0.d.U(obj);
                C0713p c0713p = this.f6856i;
                this.h = 1;
                if (c0713p.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z0.d.U(obj);
            }
            c0701d.f6859A.g(iVar);
            AbstractC0409C.k(c0701d);
            return C0174m.f3840a;
        } catch (Throwable th) {
            c0701d.f6859A.g(iVar);
            AbstractC0409C.k(c0701d);
            throw th;
        }
    }
}
