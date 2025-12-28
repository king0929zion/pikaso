package A;

import c2.C0174m;
import g2.InterfaceC0271d;
import p.C0535d;
import y2.InterfaceC0687u;

/* renamed from: A.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0535d f82i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f83j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f84k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0006g f85l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s.f f86m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0005f(C0535d c0535d, float f3, boolean z3, C0006g c0006g, s.f fVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f82i = c0535d;
        this.f83j = f3;
        this.f84k = z3;
        this.f85l = c0006g;
        this.f86m = fVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0005f(this.f82i, this.f83j, this.f84k, this.f85l, this.f86m, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0005f) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if ((r3 instanceof s.C0584b) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        if ((r1 instanceof s.C0584b) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0005f.l(java.lang.Object):java.lang.Object");
    }
}
