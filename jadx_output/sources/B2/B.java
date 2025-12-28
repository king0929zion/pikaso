package B2;

import c2.C0174m;
import g2.InterfaceC0271d;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class B extends i2.j implements o2.f {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ InterfaceC0022f f285i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f286j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D f287k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d3, InterfaceC0271d interfaceC0271d) {
        super(3, interfaceC0271d);
        this.f287k = d3;
    }

    @Override // o2.f
    public final Object a(Object obj, Object obj2, Serializable serializable) {
        int intValue = ((Number) obj2).intValue();
        B b3 = new B(this.f287k, (InterfaceC0271d) serializable);
        b3.f285i = (InterfaceC0022f) obj;
        b3.f286j = intValue;
        return b3.l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r11) {
        /*
            r10 = this;
            h2.a r0 = h2.a.f4407d
            int r1 = r10.h
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            B2.D r7 = r10.f287k
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            B2.f r1 = r10.f285i
            Z0.d.U(r11)
            goto L79
        L26:
            B2.f r1 = r10.f285i
            Z0.d.U(r11)
            goto L6c
        L2c:
            B2.f r1 = r10.f285i
            Z0.d.U(r11)
            goto L57
        L32:
            Z0.d.U(r11)
            goto L87
        L36:
            Z0.d.U(r11)
            B2.f r1 = r10.f285i
            int r11 = r10.f286j
            if (r11 <= 0) goto L4a
            B2.y r11 = B2.y.f368d
            r10.h = r6
            java.lang.Object r11 = r1.b(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L4a:
            long r8 = r7.f288a
            r10.f285i = r1
            r10.h = r5
            java.lang.Object r11 = y2.AbstractC0688v.c(r8, r10)
            if (r11 != r0) goto L57
            return r0
        L57:
            long r5 = r7.f289b
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L79
            B2.y r11 = B2.y.f369e
            r10.f285i = r1
            r10.h = r4
            java.lang.Object r11 = r1.b(r11, r10)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            long r4 = r7.f289b
            r10.f285i = r1
            r10.h = r3
            java.lang.Object r11 = y2.AbstractC0688v.c(r4, r10)
            if (r11 != r0) goto L79
            return r0
        L79:
            B2.y r11 = B2.y.f370f
            r3 = 0
            r10.f285i = r3
            r10.h = r2
            java.lang.Object r11 = r1.b(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L87:
            c2.m r11 = c2.C0174m.f3840a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.B.l(java.lang.Object):java.lang.Object");
    }
}
