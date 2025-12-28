package B2;

import c2.C0174m;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.Arrays;
import p.AbstractC0537f;
import y2.C0673f;

/* loaded from: classes.dex */
public class v extends C2.b implements InterfaceC0021e, InterfaceC0022f, C2.q {
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f356i;

    /* renamed from: j, reason: collision with root package name */
    public final int f357j;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f358k;

    /* renamed from: l, reason: collision with root package name */
    public long f359l;

    /* renamed from: m, reason: collision with root package name */
    public long f360m;

    /* renamed from: n, reason: collision with root package name */
    public int f361n;

    /* renamed from: o, reason: collision with root package name */
    public int f362o;

    public v(int i3, int i4, int i5) {
        this.h = i3;
        this.f356i = i4;
        this.f357j = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x007a, B:20:0x0082, B:28:0x0095, B:31:0x009c, B:32:0x00a0, B:34:0x00a1, B:40:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [C2.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [B2.v] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [B2.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [C2.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [B2.x] */
    /* JADX WARN: Type inference failed for: r9v8, types: [B2.x] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00af -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(B2.v r8, B2.InterfaceC0022f r9, g2.InterfaceC0271d r10) {
        /*
            boolean r0 = r10 instanceof B2.u
            if (r0 == 0) goto L13
            r0 = r10
            B2.u r0 = (B2.u) r0
            int r1 = r0.f355m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f355m = r1
            goto L18
        L13:
            B2.u r0 = new B2.u
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f353k
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f355m
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            y2.S r8 = r0.f352j
            B2.x r9 = r0.f351i
            B2.f r2 = r0.h
            B2.v r5 = r0.f350g
            Z0.d.U(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L77
        L38:
            r8 = move-exception
            goto Lb5
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            y2.S r8 = r0.f352j
            B2.x r9 = r0.f351i
            B2.f r2 = r0.h
            B2.v r5 = r0.f350g
            Z0.d.U(r10)     // Catch: java.lang.Throwable -> L38
            goto L7a
        L4f:
            B2.x r9 = r0.f351i
            B2.f r8 = r0.h
            B2.v r2 = r0.f350g
            Z0.d.U(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb5
        L5e:
            Z0.d.U(r10)
            C2.d r10 = r8.a()
            B2.x r10 = (B2.x) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            g2.i r2 = r0.f4461e     // Catch: java.lang.Throwable -> Lb2
            p2.g.b(r2)     // Catch: java.lang.Throwable -> Lb2
            y2.s r5 = y2.C0685s.f6818e     // Catch: java.lang.Throwable -> Lb2
            g2.g r2 = r2.n(r5)     // Catch: java.lang.Throwable -> Lb2
            y2.S r2 = (y2.S) r2     // Catch: java.lang.Throwable -> Lb2
        L77:
            r5 = r8
            r8 = r2
            r2 = r10
        L7a:
            java.lang.Object r10 = r5.t(r9)     // Catch: java.lang.Throwable -> L38
            D2.w r6 = B2.w.f363a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L93
            r0.f350g = r5     // Catch: java.lang.Throwable -> L38
            r0.h = r2     // Catch: java.lang.Throwable -> L38
            r0.f351i = r9     // Catch: java.lang.Throwable -> L38
            r0.f352j = r8     // Catch: java.lang.Throwable -> L38
            r0.f355m = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.g(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L7a
            return
        L93:
            if (r8 == 0) goto La1
            boolean r6 = r8.b()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9c
            goto La1
        L9c:
            java.util.concurrent.CancellationException r8 = r8.f()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La1:
            r0.f350g = r5     // Catch: java.lang.Throwable -> L38
            r0.h = r2     // Catch: java.lang.Throwable -> L38
            r0.f351i = r9     // Catch: java.lang.Throwable -> L38
            r0.f352j = r8     // Catch: java.lang.Throwable -> L38
            r0.f355m = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Lb2:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb5:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.v.i(B2.v, B2.f, g2.d):void");
    }

    @Override // B2.InterfaceC0022f
    public final Object b(Object obj, InterfaceC0271d interfaceC0271d) {
        InterfaceC0271d[] interfaceC0271dArr;
        t tVar;
        if (q(obj)) {
            return C0174m.f3840a;
        }
        C0673f c0673f = new C0673f(1, Z.b.z(interfaceC0271d));
        c0673f.u();
        InterfaceC0271d[] interfaceC0271dArr2 = C2.c.f585a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    c0673f.t(C0174m.f3840a);
                    interfaceC0271dArr = l(interfaceC0271dArr2);
                    tVar = null;
                } else {
                    t tVar2 = new t(this, this.f361n + this.f362o + n(), obj, c0673f);
                    k(tVar2);
                    this.f362o++;
                    if (this.f356i == 0) {
                        interfaceC0271dArr2 = l(interfaceC0271dArr2);
                    }
                    interfaceC0271dArr = interfaceC0271dArr2;
                    tVar = tVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tVar != null) {
            c0673f.x(new y2.D(0, tVar));
        }
        for (InterfaceC0271d interfaceC0271d2 : interfaceC0271dArr) {
            if (interfaceC0271d2 != null) {
                interfaceC0271d2.t(C0174m.f3840a);
            }
        }
        Object s3 = c0673f.s();
        h2.a aVar = h2.a.f4407d;
        if (s3 != aVar) {
            s3 = C0174m.f3840a;
        }
        return s3 == aVar ? s3 : C0174m.f3840a;
    }

    @Override // C2.b
    public final C2.d c() {
        x xVar = new x();
        xVar.f366a = -1L;
        return xVar;
    }

    @Override // C2.b
    public final C2.d[] d() {
        return new x[2];
    }

    public final Object g(x xVar, u uVar) {
        C0673f c0673f = new C0673f(1, Z.b.z(uVar));
        c0673f.u();
        synchronized (this) {
            if (s(xVar) < 0) {
                xVar.f367b = c0673f;
            } else {
                c0673f.t(C0174m.f3840a);
            }
        }
        Object s3 = c0673f.s();
        return s3 == h2.a.f4407d ? s3 : C0174m.f3840a;
    }

    public final void h() {
        if (this.f356i != 0 || this.f362o > 1) {
            Object[] objArr = this.f358k;
            p2.g.b(objArr);
            while (this.f362o > 0) {
                long n2 = n();
                int i3 = this.f361n;
                int i4 = this.f362o;
                if (objArr[((int) ((n2 + (i3 + i4)) - 1)) & (objArr.length - 1)] != w.f363a) {
                    return;
                }
                this.f362o = i4 - 1;
                w.a(objArr, n() + this.f361n + this.f362o, null);
            }
        }
    }

    public final void j() {
        C2.d[] dVarArr;
        Object[] objArr = this.f358k;
        p2.g.b(objArr);
        w.a(objArr, n(), null);
        this.f361n--;
        long n2 = n() + 1;
        if (this.f359l < n2) {
            this.f359l = n2;
        }
        if (this.f360m < n2) {
            if (this.f582e != 0 && (dVarArr = this.f581d) != null) {
                for (C2.d dVar : dVarArr) {
                    if (dVar != null) {
                        x xVar = (x) dVar;
                        long j3 = xVar.f366a;
                        if (j3 >= 0 && j3 < n2) {
                            xVar.f366a = n2;
                        }
                    }
                }
            }
            this.f360m = n2;
        }
    }

    public final void k(Object obj) {
        int i3 = this.f361n + this.f362o;
        Object[] objArr = this.f358k;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i3 >= objArr.length) {
            objArr = p(objArr, i3, objArr.length * 2);
        }
        w.a(objArr, n() + i3, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC0271d[] l(InterfaceC0271d[] interfaceC0271dArr) {
        C2.d[] dVarArr;
        x xVar;
        C0673f c0673f;
        int length = interfaceC0271dArr.length;
        if (this.f582e != 0 && (dVarArr = this.f581d) != null) {
            int length2 = dVarArr.length;
            int i3 = 0;
            interfaceC0271dArr = interfaceC0271dArr;
            while (i3 < length2) {
                C2.d dVar = dVarArr[i3];
                if (dVar != null && (c0673f = (xVar = (x) dVar).f367b) != null && s(xVar) >= 0) {
                    int length3 = interfaceC0271dArr.length;
                    interfaceC0271dArr = interfaceC0271dArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC0271dArr, Math.max(2, interfaceC0271dArr.length * 2));
                        p2.g.d(copyOf, "copyOf(this, newSize)");
                        interfaceC0271dArr = copyOf;
                    }
                    interfaceC0271dArr[length] = c0673f;
                    xVar.f367b = null;
                    length++;
                }
                i3++;
                interfaceC0271dArr = interfaceC0271dArr;
            }
        }
        return interfaceC0271dArr;
    }

    @Override // C2.q
    public final InterfaceC0021e m(InterfaceC0276i interfaceC0276i, int i3, int i4) {
        return ((i3 == 0 || i3 == -3) && i4 == 1) ? this : new C2.i(this, interfaceC0276i, i3, i4);
    }

    public final long n() {
        return Math.min(this.f360m, this.f359l);
    }

    @Override // B2.InterfaceC0021e
    public final Object o(InterfaceC0022f interfaceC0022f, InterfaceC0271d interfaceC0271d) {
        i(this, interfaceC0022f, interfaceC0271d);
        return h2.a.f4407d;
    }

    public final Object[] p(Object[] objArr, int i3, int i4) {
        if (i4 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i4];
        this.f358k = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long n2 = n();
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = i5 + n2;
            w.a(objArr2, j3, objArr[((int) j3) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i3;
        boolean z3;
        InterfaceC0271d[] interfaceC0271dArr = C2.c.f585a;
        synchronized (this) {
            if (r(obj)) {
                interfaceC0271dArr = l(interfaceC0271dArr);
                z3 = true;
            } else {
                z3 = false;
            }
        }
        for (InterfaceC0271d interfaceC0271d : interfaceC0271dArr) {
            if (interfaceC0271d != null) {
                interfaceC0271d.t(C0174m.f3840a);
            }
        }
        return z3;
    }

    public final boolean r(Object obj) {
        int i3 = this.f582e;
        int i4 = this.h;
        if (i3 == 0) {
            if (i4 != 0) {
                k(obj);
                int i5 = this.f361n + 1;
                this.f361n = i5;
                if (i5 > i4) {
                    j();
                }
                this.f360m = n() + this.f361n;
            }
            return true;
        }
        int i6 = this.f361n;
        int i7 = this.f356i;
        if (i6 >= i7 && this.f360m <= this.f359l) {
            int b3 = AbstractC0537f.b(this.f357j);
            if (b3 == 0) {
                return false;
            }
            if (b3 == 2) {
                return true;
            }
        }
        k(obj);
        int i8 = this.f361n + 1;
        this.f361n = i8;
        if (i8 > i7) {
            j();
        }
        long n2 = n() + this.f361n;
        long j3 = this.f359l;
        if (((int) (n2 - j3)) > i4) {
            u(j3 + 1, this.f360m, n() + this.f361n, n() + this.f361n + this.f362o);
        }
        return true;
    }

    public final long s(x xVar) {
        long j3 = xVar.f366a;
        if (j3 < n() + this.f361n) {
            return j3;
        }
        if (this.f356i <= 0 && j3 <= n() && this.f362o != 0) {
            return j3;
        }
        return -1L;
    }

    public final Object t(x xVar) {
        Object obj;
        InterfaceC0271d[] interfaceC0271dArr = C2.c.f585a;
        synchronized (this) {
            try {
                long s3 = s(xVar);
                if (s3 < 0) {
                    obj = w.f363a;
                } else {
                    long j3 = xVar.f366a;
                    Object[] objArr = this.f358k;
                    p2.g.b(objArr);
                    Object obj2 = objArr[((int) s3) & (objArr.length - 1)];
                    if (obj2 instanceof t) {
                        obj2 = ((t) obj2).f348f;
                    }
                    xVar.f366a = s3 + 1;
                    Object obj3 = obj2;
                    interfaceC0271dArr = v(j3);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0271d interfaceC0271d : interfaceC0271dArr) {
            if (interfaceC0271d != null) {
                interfaceC0271d.t(C0174m.f3840a);
            }
        }
        return obj;
    }

    public final void u(long j3, long j4, long j5, long j6) {
        long min = Math.min(j4, j3);
        for (long n2 = n(); n2 < min; n2++) {
            Object[] objArr = this.f358k;
            p2.g.b(objArr);
            w.a(objArr, n2, null);
        }
        this.f359l = j3;
        this.f360m = j4;
        this.f361n = (int) (j5 - min);
        this.f362o = (int) (j6 - j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g2.InterfaceC0271d[] v(long r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.v.v(long):g2.d[]");
    }
}
