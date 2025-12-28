package r;

import D.C0065y;
import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class m extends i2.i implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public int f6093f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6094g;
    public final /* synthetic */ InterfaceC0687u h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q.k f6095i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0065y f6096j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0580e f6097k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC0687u interfaceC0687u, q.k kVar, C0065y c0065y, C0580e c0580e, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.h = interfaceC0687u;
        this.f6095i = kVar;
        this.f6096j = c0065y;
        this.f6097k = c0580e;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0065y c0065y = this.f6096j;
        C0580e c0580e = this.f6097k;
        m mVar = new m(this.h, this.f6095i, c0065y, c0580e, interfaceC0271d);
        mVar.f6094g = obj;
        return mVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((m) f((InterfaceC0271d) obj2, (h0.p) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0066  */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r12) {
        /*
            r11 = this;
            h2.a r0 = h2.a.f4407d
            int r1 = r11.f6093f
            h0.g r2 = h0.g.f4359e
            r.e r3 = r11.f6097k
            r4 = 0
            y2.u r5 = r11.h
            r6 = 3
            r7 = 0
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L29
            if (r1 == r9) goto L21
            if (r1 != r8) goto L19
            Z0.d.U(r12)
            goto L62
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            java.lang.Object r1 = r11.f6094g
            h0.p r1 = (h0.p) r1
            Z0.d.U(r12)
            goto L44
        L29:
            Z0.d.U(r12)
            java.lang.Object r12 = r11.f6094g
            r1 = r12
            h0.p r1 = (h0.p) r1
            r.i r12 = new r.i
            r12.<init>(r3, r7)
            y2.AbstractC0688v.l(r5, r7, r4, r12, r6)
            r11.f6094g = r1
            r11.f6093f = r9
            java.lang.Object r12 = r.p.a(r1, r9, r2, r11)
            if (r12 != r0) goto L44
            return r0
        L44:
            h0.k r12 = (h0.k) r12
            r12.a()
            r.g r9 = r.p.f6106a
            q.k r10 = r11.f6095i
            if (r10 == r9) goto L57
            r.j r9 = new r.j
            r9.<init>(r10, r3, r12, r7)
            y2.AbstractC0688v.l(r5, r7, r4, r9, r6)
        L57:
            r11.f6094g = r7
            r11.f6093f = r8
            java.lang.Object r12 = r.p.b(r1, r2, r11)
            if (r12 != r0) goto L62
            return r0
        L62:
            h0.k r12 = (h0.k) r12
            if (r12 != 0) goto L6f
            r.k r12 = new r.k
            r12.<init>(r3, r7)
            y2.AbstractC0688v.l(r5, r7, r4, r12, r6)
            goto L89
        L6f:
            r12.a()
            r.l r12 = new r.l
            r12.<init>(r3, r7)
            y2.AbstractC0688v.l(r5, r7, r4, r12, r6)
            D.y r12 = r11.f6096j
            java.lang.Object r12 = r12.f931f
            q.l r12 = (q.l) r12
            boolean r0 = r12.f6020w
            if (r0 == 0) goto L89
            A0.c r12 = r12.f6021x
            r12.c()
        L89:
            c2.m r12 = c2.C0174m.f3840a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r.m.l(java.lang.Object):java.lang.Object");
    }
}
