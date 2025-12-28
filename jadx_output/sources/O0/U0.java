package o0;

import android.view.View;
import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class U0 extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f5503i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p2.o f5504j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D.v0 f5505k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.r f5506l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V0 f5507m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f5508n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(p2.o oVar, D.v0 v0Var, androidx.lifecycle.r rVar, V0 v02, View view, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5504j = oVar;
        this.f5505k = v0Var;
        this.f5506l = rVar;
        this.f5507m = v02;
        this.f5508n = view;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        U0 u02 = new U0(this.f5504j, this.f5505k, this.f5506l, this.f5507m, this.f5508n, interfaceC0271d);
        u02.f5503i = obj;
        return u02;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((U0) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r12) {
        /*
            r11 = this;
            h2.a r0 = h2.a.f4407d
            int r1 = r11.h
            androidx.lifecycle.r r2 = r11.f5506l
            c2.m r3 = c2.C0174m.f3840a
            r4 = 0
            o0.V0 r5 = r11.f5507m
            r6 = 1
            if (r1 == 0) goto L24
            if (r1 != r6) goto L1c
            java.lang.Object r0 = r11.f5503i
            y2.S r0 = (y2.S) r0
            Z0.d.U(r12)     // Catch: java.lang.Throwable -> L19
            goto L8c
        L19:
            r12 = move-exception
            goto L9f
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            Z0.d.U(r12)
            java.lang.Object r12 = r11.f5503i
            y2.u r12 = (y2.InterfaceC0687u) r12
            p2.o r1 = r11.f5504j     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r1.f5960d     // Catch: java.lang.Throwable -> L5e
            o0.p0 r1 = (o0.C0499p0) r1     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L60
            android.view.View r7 = r11.f5508n     // Catch: java.lang.Throwable -> L5e
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.Throwable -> L5e
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L5e
            B2.E r7 = o0.X0.a(r7)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r8 = r7.getValue()     // Catch: java.lang.Throwable -> L5e
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L5e
            float r8 = r8.floatValue()     // Catch: java.lang.Throwable -> L5e
            D.c0 r9 = r1.f5638d     // Catch: java.lang.Throwable -> L5e
            r9.g(r8)     // Catch: java.lang.Throwable -> L5e
            o0.T0 r8 = new o0.T0     // Catch: java.lang.Throwable -> L5e
            r8.<init>(r7, r1, r4)     // Catch: java.lang.Throwable -> L5e
            r1 = 0
            r7 = 3
            y2.h0 r12 = y2.AbstractC0688v.l(r12, r4, r1, r8, r7)     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5c:
            r0 = r4
            goto L9f
        L5e:
            r12 = move-exception
            goto L5c
        L60:
            r12 = r4
        L61:
            D.v0 r1 = r11.f5505k     // Catch: java.lang.Throwable -> L9d
            r11.f5503i = r12     // Catch: java.lang.Throwable -> L9d
            r11.h = r6     // Catch: java.lang.Throwable -> L9d
            D.u0 r6 = new D.u0     // Catch: java.lang.Throwable -> L9d
            r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> L9d
            g2.i r7 = r11.f4461e     // Catch: java.lang.Throwable -> L9d
            p2.g.b(r7)     // Catch: java.lang.Throwable -> L9d
            D.V r7 = D.C0032d.x(r7)     // Catch: java.lang.Throwable -> L9d
            D.s0 r8 = new D.s0     // Catch: java.lang.Throwable -> L9d
            r8.<init>(r1, r6, r7, r4)     // Catch: java.lang.Throwable -> L9d
            D.h r1 = r1.f907a     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r1 = y2.AbstractC0688v.s(r1, r8, r11)     // Catch: java.lang.Throwable -> L9d
            if (r1 != r0) goto L83
            goto L84
        L83:
            r1 = r3
        L84:
            if (r1 != r0) goto L87
            goto L88
        L87:
            r1 = r3
        L88:
            if (r1 != r0) goto L8b
            return r0
        L8b:
            r0 = r12
        L8c:
            if (r0 == 0) goto L91
            r0.a(r4)
        L91:
            androidx.lifecycle.t r12 = r2.c()
            r12.f(r5)
            return r3
        L99:
            r10 = r0
            r0 = r12
            r12 = r10
            goto L9f
        L9d:
            r0 = move-exception
            goto L99
        L9f:
            if (r0 == 0) goto La4
            r0.a(r4)
        La4:
            androidx.lifecycle.t r0 = r2.c()
            r0.f(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.U0.l(java.lang.Object):java.lang.Object");
    }
}
