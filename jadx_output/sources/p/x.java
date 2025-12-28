package p;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class x extends i2.j implements o2.e {
    public G2.a h;

    /* renamed from: i, reason: collision with root package name */
    public Object f5923i;

    /* renamed from: j, reason: collision with root package name */
    public y f5924j;

    /* renamed from: k, reason: collision with root package name */
    public int f5925k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f5926l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5927m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f5928n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i2.j f5929o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(int i3, y yVar, o2.c cVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5927m = i3;
        this.f5928n = yVar;
        this.f5929o = (i2.j) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i2.j, o2.c] */
    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        x xVar = new x(this.f5927m, this.f5928n, this.f5929o, interfaceC0271d);
        xVar.f5926l = obj;
        return xVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((x) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o2.c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [G2.a] */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x.l(java.lang.Object):java.lang.Object");
    }
}
