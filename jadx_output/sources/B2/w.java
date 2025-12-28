package B2;

import g2.C0272e;
import g2.C0277j;
import g2.InterfaceC0276i;
import y2.AbstractC0668a;
import y2.AbstractC0688v;
import y2.c0;
import y2.h0;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final D2.w f363a = new D2.w("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final D2.w f364b = new D2.w("NONE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final D2.w f365c = new D2.w("PENDING", 0);

    public static final void a(Object[] objArr, long j3, Object obj) {
        objArr[((int) j3) & (objArr.length - 1)] = obj;
    }

    public static final InterfaceC0021e b(InterfaceC0021e interfaceC0021e) {
        if (interfaceC0021e instanceof E) {
            return interfaceC0021e;
        }
        if (!(interfaceC0021e instanceof C0020d)) {
            return new C0020d(interfaceC0021e);
        }
        ((C0020d) interfaceC0021e).getClass();
        return interfaceC0021e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x0059, B:19:0x006d, B:21:0x0075, B:32:0x0048, B:34:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v5, types: [A2.p] */
    /* JADX WARN: Type inference failed for: r8v7, types: [A2.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0087 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(B2.InterfaceC0022f r7, A2.n r8, boolean r9, i2.c r10) {
        /*
            boolean r0 = r10 instanceof B2.C0023g
            if (r0 == 0) goto L13
            r0 = r10
            B2.g r0 = (B2.C0023g) r0
            int r1 = r0.f313l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f313l = r1
            goto L18
        L13:
            B2.g r0 = new B2.g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f312k
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f313l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4c
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            boolean r9 = r0.f311j
            A2.a r7 = r0.f310i
            A2.p r8 = r0.h
            B2.f r2 = r0.f309g
            Z0.d.U(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r6 = r2
            r2 = r7
            r7 = r6
            goto L59
        L36:
            r7 = move-exception
            goto L92
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            boolean r9 = r0.f311j
            A2.a r7 = r0.f310i
            A2.p r8 = r0.h
            B2.f r2 = r0.f309g
            Z0.d.U(r10)     // Catch: java.lang.Throwable -> L36
            goto L6d
        L4c:
            Z0.d.U(r10)
            A2.b r10 = r8.f260g     // Catch: java.lang.Throwable -> L36
            r10.getClass()     // Catch: java.lang.Throwable -> L36
            A2.a r2 = new A2.a     // Catch: java.lang.Throwable -> L36
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L36
        L59:
            r0.f309g = r7     // Catch: java.lang.Throwable -> L36
            r0.h = r8     // Catch: java.lang.Throwable -> L36
            r0.f310i = r2     // Catch: java.lang.Throwable -> L36
            r0.f311j = r9     // Catch: java.lang.Throwable -> L36
            r0.f313l = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r2.b(r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r1) goto L6a
            return r1
        L6a:
            r6 = r2
            r2 = r7
            r7 = r6
        L6d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L36
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r10 == 0) goto L8a
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L36
            r0.f309g = r2     // Catch: java.lang.Throwable -> L36
            r0.h = r8     // Catch: java.lang.Throwable -> L36
            r0.f310i = r7     // Catch: java.lang.Throwable -> L36
            r0.f311j = r9     // Catch: java.lang.Throwable -> L36
            r0.f313l = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r1) goto L32
            return r1
        L8a:
            if (r9 == 0) goto L8f
            r8.a(r3)
        L8f:
            c2.m r7 = c2.C0174m.f3840a
            return r7
        L92:
            throw r7     // Catch: java.lang.Throwable -> L93
        L93:
            r10 = move-exception
            if (r9 == 0) goto Lac
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9d
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9d:
            if (r3 != 0) goto La9
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La9:
            r8.a(r3)
        Lac:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.w.c(B2.f, A2.n, boolean, i2.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(B2.InterfaceC0021e r5, o2.e r6, i2.c r7) {
        /*
            boolean r0 = r7 instanceof B2.o
            if (r0 == 0) goto L13
            r0 = r7
            B2.o r0 = (B2.o) r0
            int r1 = r0.f336k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f336k = r1
            goto L18
        L13:
            B2.o r0 = new B2.o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f335j
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f336k
            D2.w r3 = C2.c.f586b
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            B2.n r5 = r0.f334i
            p2.o r6 = r0.h
            o2.e r0 = r0.f333g
            Z0.d.U(r7)     // Catch: C2.C0025a -> L2f
            goto L63
        L2f:
            r7 = move-exception
            goto L5f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            Z0.d.U(r7)
            p2.o r7 = new p2.o
            r7.<init>()
            r7.f5960d = r3
            B2.n r2 = new B2.n
            r2.<init>(r6, r7)
            r0.f333g = r6     // Catch: C2.C0025a -> L5a
            r0.h = r7     // Catch: C2.C0025a -> L5a
            r0.f334i = r2     // Catch: C2.C0025a -> L5a
            r0.f336k = r4     // Catch: C2.C0025a -> L5a
            java.lang.Object r5 = r5.o(r2, r0)     // Catch: C2.C0025a -> L5a
            if (r5 != r1) goto L57
            goto L67
        L57:
            r0 = r6
            r6 = r7
            goto L63
        L5a:
            r5 = move-exception
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L5f:
            B2.n r1 = r7.f580d
            if (r1 != r5) goto L7c
        L63:
            java.lang.Object r1 = r6.f5960d
            if (r1 == r3) goto L68
        L67:
            return r1
        L68:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.w.d(B2.e, o2.e, i2.c):java.lang.Object");
    }

    public static final s e(A.t tVar, D2.d dVar, D d3, Float f3) {
        A2.f.f255a.getClass();
        A2.e eVar = A2.e.f253a;
        i iVar = new i(tVar, 1, C0277j.f4334d);
        G g3 = new G(f3);
        int i3 = d3.equals(z.f372a) ? 1 : 4;
        r rVar = new r(d3, (InterfaceC0021e) iVar.f316e, g3, f3, null);
        InterfaceC0276i e3 = AbstractC0688v.e(dVar.m(), (InterfaceC0276i) iVar.f317f, true);
        F2.d dVar2 = y2.B.f6749a;
        if (e3 != dVar2 && e3.n(C0272e.f4333d) == null) {
            e3 = e3.i(dVar2);
        }
        if (i3 == 0) {
            throw null;
        }
        AbstractC0668a c0Var = i3 == 2 ? new c0(e3, rVar) : new h0(e3, true);
        c0Var.c0(i3, c0Var, rVar);
        return new s(g3);
    }
}
