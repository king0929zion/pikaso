package q;

import c2.C0174m;
import g2.InterfaceC0271d;
import r.C0580e;
import y2.InterfaceC0687u;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557d extends i2.j implements o2.e {
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f5983i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f5984j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0580e f5985k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f5986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s.g f5987m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f5988n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0557d(C0580e c0580e, long j3, s.g gVar, l lVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5985k = c0580e;
        this.f5986l = j3;
        this.f5987m = gVar;
        this.f5988n = lVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0557d c0557d = new C0557d(this.f5985k, this.f5986l, this.f5987m, this.f5988n, interfaceC0271d);
        c0557d.f5984j = obj;
        return c0557d;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0557d) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0557d.l(java.lang.Object):java.lang.Object");
    }
}
