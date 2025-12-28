package B2;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class r extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ D f341i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0021e f342j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G f343k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Float f344l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(D d3, InterfaceC0021e interfaceC0021e, G g3, Float f3, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f341i = d3;
        this.f342j = interfaceC0021e;
        this.f343k = g3;
        this.f344l = f3;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new r(this.f341i, this.f342j, this.f343k, this.f344l, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((r) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[RETURN] */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            h2.a r2 = h2.a.f4407d
            int r3 = r0.h
            c2.m r4 = c2.C0174m.f3840a
            B2.e r5 = r0.f342j
            B2.G r6 = r0.f343k
            r7 = 2
            r8 = 1
            r9 = 4
            r10 = 3
            if (r3 == 0) goto L2d
            if (r3 == r8) goto L28
            if (r3 == r7) goto L24
            if (r3 == r10) goto L28
            if (r3 != r9) goto L1c
            goto L28
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L24:
            Z0.d.U(r23)
            goto L56
        L28:
            Z0.d.U(r23)
            goto Lbc
        L2d:
            Z0.d.U(r23)
            B2.A r3 = B2.z.f372a
            B2.D r11 = r0.f341i
            if (r11 != r3) goto L3f
            r0.h = r8
            java.lang.Object r1 = r5.o(r6, r0)
            if (r1 != r2) goto Lbc
            return r2
        L3f:
            B2.A r3 = B2.z.f373b
            r12 = 0
            if (r11 != r3) goto L5f
            C2.z r1 = r6.f()
            B2.p r3 = new B2.p
            r3.<init>(r7, r12)
            r0.h = r7
            java.lang.Object r1 = B2.w.d(r1, r3, r0)
            if (r1 != r2) goto L56
            return r2
        L56:
            r0.h = r10
            java.lang.Object r1 = r5.o(r6, r0)
            if (r1 != r2) goto Lbc
            return r2
        L5f:
            C2.z r15 = r6.f()
            B2.B r14 = new B2.B
            r14.<init>(r11, r12)
            int r3 = B2.l.f325a
            C2.n r3 = new C2.n
            g2.j r10 = g2.C0277j.f4334d
            r17 = -2
            r18 = 1
            r13 = r3
            r16 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            B2.C r11 = new B2.C
            r11.<init>(r7, r12)
            B2.i r7 = new B2.i
            r7.<init>(r3, r1, r11)
            B2.e r3 = B2.w.b(r7)
            B2.e r18 = B2.w.b(r3)
            B2.q r3 = new B2.q
            java.lang.Float r7 = r0.f344l
            r3.<init>(r5, r6, r7, r12)
            r0.h = r9
            B2.k r5 = new B2.k
            r5.<init>(r3, r12)
            C2.n r3 = new C2.n
            r20 = -2
            r21 = 1
            r16 = r3
            r17 = r5
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            B2.e r1 = r3.m(r10, r1, r8)
            C2.s r3 = C2.s.f616d
            java.lang.Object r1 = r1.o(r3, r0)
            if (r1 != r2) goto Lb4
            goto Lb5
        Lb4:
            r1 = r4
        Lb5:
            if (r1 != r2) goto Lb8
            goto Lb9
        Lb8:
            r1 = r4
        Lb9:
            if (r1 != r2) goto Lbc
            return r2
        Lbc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.r.l(java.lang.Object):java.lang.Object");
    }
}
