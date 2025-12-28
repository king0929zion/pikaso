package C2;

import B2.InterfaceC0022f;
import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class j extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0022f f599j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f600k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, InterfaceC0022f interfaceC0022f, Object obj, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f598i = nVar;
        this.f599j = interfaceC0022f;
        this.f600k = obj;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new j(this.f598i, this.f599j, this.f600k, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((j) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [i2.j, o2.f] */
    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 == 0) {
            Z0.d.U(obj);
            ?? r4 = this.f598i.h;
            this.h = 1;
            if (r4.a(this.f599j, this.f600k, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
        }
        return C0174m.f3840a;
    }
}
