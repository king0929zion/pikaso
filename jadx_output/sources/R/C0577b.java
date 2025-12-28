package r;

import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577b extends i2.i implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public int f6071f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6072g;
    public final /* synthetic */ InterfaceC0276i h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i2.i f6073i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0577b(InterfaceC0276i interfaceC0276i, o2.e eVar, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.h = interfaceC0276i;
        this.f6073i = (i2.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i2.i, o2.e] */
    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0577b c0577b = new C0577b(this.h, this.f6073i, interfaceC0271d);
        c0577b.f6072g = obj;
        return c0577b;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0577b) f((InterfaceC0271d) obj2, (h0.p) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [h0.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [i2.i, o2.e] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r9) {
        /*
            r8 = this;
            h2.a r0 = h2.a.f4407d
            int r1 = r8.f6071f
            g2.i r2 = r8.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r1 = r8.f6072g
            h0.p r1 = (h0.p) r1
            Z0.d.U(r9)
            goto L28
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f6072g
            h0.p r1 = (h0.p) r1
            Z0.d.U(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
        L28:
            r9 = r1
            goto L3b
        L2a:
            r9 = move-exception
            goto L5e
        L2c:
            java.lang.Object r1 = r8.f6072g
            h0.p r1 = (h0.p) r1
            Z0.d.U(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L4f
        L34:
            Z0.d.U(r9)
            java.lang.Object r9 = r8.f6072g
            h0.p r9 = (h0.p) r9
        L3b:
            boolean r1 = y2.AbstractC0688v.j(r2)
            if (r1 == 0) goto L70
            i2.i r1 = r8.f6073i     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f6072g = r9     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f6071f = r5     // Catch: java.util.concurrent.CancellationException -> L5a
            java.lang.Object r1 = r1.h(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5a
            if (r1 != r0) goto L4e
            return r0
        L4e:
            r1 = r9
        L4f:
            r8.f6072g = r1     // Catch: java.util.concurrent.CancellationException -> L2a
            r8.f6071f = r4     // Catch: java.util.concurrent.CancellationException -> L2a
            java.lang.Object r9 = Z0.d.h(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            if (r9 != r0) goto L28
            return r0
        L5a:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L5e:
            boolean r6 = y2.AbstractC0688v.j(r2)
            if (r6 == 0) goto L6f
            r8.f6072g = r1
            r8.f6071f = r3
            java.lang.Object r9 = Z0.d.h(r1, r8)
            if (r9 != r0) goto L28
            return r0
        L6f:
            throw r9
        L70:
            c2.m r9 = c2.C0174m.f3840a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C0577b.l(java.lang.Object):java.lang.Object");
    }
}
