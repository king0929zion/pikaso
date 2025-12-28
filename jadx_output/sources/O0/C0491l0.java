package o0;

import c2.C0174m;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* renamed from: o0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491l0 extends i2.j implements o2.e {
    public A2.p h;

    /* renamed from: i, reason: collision with root package name */
    public A2.a f5602i;

    /* renamed from: j, reason: collision with root package name */
    public int f5603j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A2.b f5604k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0491l0(A2.b bVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5604k = bVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new C0491l0(this.f5604k, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0491l0) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x0061, B:19:0x0027, B:23:0x0064, B:26:0x0068, B:27:0x0069, B:34:0x0021, B:12:0x004b, B:14:0x0057), top: B:2:0x0006, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [A2.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r8) {
        /*
            r7 = this;
            h2.a r0 = h2.a.f4407d
            int r1 = r7.f5603j
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            A2.a r1 = r7.f5602i
            A2.p r4 = r7.h
            Z0.d.U(r8)     // Catch: java.lang.Throwable -> L12
            goto L34
        L12:
            r8 = move-exception
            goto L70
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            Z0.d.U(r8)
            A2.b r4 = r7.f5604k
            A2.a r8 = new A2.a     // Catch: java.lang.Throwable -> L12
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L12
            r1 = r8
        L27:
            r7.h = r4     // Catch: java.lang.Throwable -> L12
            r7.f5602i = r1     // Catch: java.lang.Throwable -> L12
            r7.f5603j = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r1.b(r7)     // Catch: java.lang.Throwable -> L12
            if (r8 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L12
            c2.m r8 = (c2.C0174m) r8     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r8 = o0.AbstractC0493m0.f5611b     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = N.o.f1756b     // Catch: java.lang.Throwable -> L12
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicReference r6 = N.o.f1762i     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L5f
            N.b r6 = (N.C0074b) r6     // Catch: java.lang.Throwable -> L5f
            n.B r6 = r6.h     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L61
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L5f
            if (r6 != r3) goto L61
            r5 = r3
            goto L61
        L5f:
            r0 = move-exception
            goto L68
        L61:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L27
            N.o.a()     // Catch: java.lang.Throwable -> L12
            goto L27
        L68:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            throw r0     // Catch: java.lang.Throwable -> L12
        L6a:
            r4.a(r2)
            c2.m r8 = c2.C0174m.f3840a
            return r8
        L70:
            throw r8     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L79
            r2 = r8
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L79:
            if (r2 != 0) goto L85
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "Channel was consumed, consumer had failed"
            r2.<init>(r1)
            r2.initCause(r8)
        L85:
            r4.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0491l0.l(java.lang.Object):java.lang.Object");
    }
}
