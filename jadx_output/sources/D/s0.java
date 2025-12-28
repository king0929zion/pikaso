package D;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class s0 extends i2.j implements o2.e {
    public N.g h;

    /* renamed from: i, reason: collision with root package name */
    public int f860i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f861j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v0 f862k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u0 f863l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V f864m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(v0 v0Var, u0 u0Var, V v3, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f862k = v0Var;
        this.f863l = u0Var;
        this.f864m = v3;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        s0 s0Var = new s0(this.f862k, this.f863l, this.f864m, interfaceC0271d);
        s0Var.f861j = obj;
        return s0Var;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((s0) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.s0.l(java.lang.Object):java.lang.Object");
    }
}
