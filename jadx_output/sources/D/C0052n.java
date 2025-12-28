package D;

import A.AbstractC0000a;
import E.C0072a;
import a.AbstractC0090a;
import android.os.Trace;
import android.util.SparseArray;
import c2.C0168g;
import d2.AbstractC0245p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n.AbstractC0378E;
import n.C0374A;
import n.C0375B;
import n.C0396p;
import n.C0398r;
import n.C0403w;
import n.C0405y;
import n0.C0429j;

/* renamed from: D.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052n {

    /* renamed from: A, reason: collision with root package name */
    public final C0050m f793A;

    /* renamed from: B, reason: collision with root package name */
    public final K0 f794B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f795C;

    /* renamed from: D, reason: collision with root package name */
    public A0 f796D;

    /* renamed from: E, reason: collision with root package name */
    public B0 f797E;

    /* renamed from: F, reason: collision with root package name */
    public D0 f798F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f799G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0045j0 f800H;

    /* renamed from: I, reason: collision with root package name */
    public final E.b f801I;

    /* renamed from: J, reason: collision with root package name */
    public C0030c f802J;

    /* renamed from: K, reason: collision with root package name */
    public E.c f803K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f804L;

    /* renamed from: M, reason: collision with root package name */
    public int f805M;

    /* renamed from: a, reason: collision with root package name */
    public final B0.a f806a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0058q f807b;

    /* renamed from: c, reason: collision with root package name */
    public final B0 f808c;

    /* renamed from: d, reason: collision with root package name */
    public final C0374A f809d;

    /* renamed from: e, reason: collision with root package name */
    public final C0072a f810e;

    /* renamed from: f, reason: collision with root package name */
    public final C0072a f811f;

    /* renamed from: g, reason: collision with root package name */
    public final C0060t f812g;

    /* renamed from: i, reason: collision with root package name */
    public C0043i0 f813i;

    /* renamed from: j, reason: collision with root package name */
    public int f814j;

    /* renamed from: k, reason: collision with root package name */
    public int f815k;

    /* renamed from: l, reason: collision with root package name */
    public int f816l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f818n;

    /* renamed from: o, reason: collision with root package name */
    public C0396p f819o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f820p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f821q;

    /* renamed from: u, reason: collision with root package name */
    public A.t f825u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f826v;

    /* renamed from: x, reason: collision with root package name */
    public int f828x;

    /* renamed from: y, reason: collision with root package name */
    public int f829y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f830z;
    public final K0 h = new K0();

    /* renamed from: m, reason: collision with root package name */
    public final M f817m = new M();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f822r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final M f823s = new M();

    /* renamed from: t, reason: collision with root package name */
    public L.e f824t = L.e.f1452g;

    /* renamed from: w, reason: collision with root package name */
    public final M f827w = new M();

    public C0052n(B0.a aVar, AbstractC0058q abstractC0058q, B0 b02, C0374A c0374a, C0072a c0072a, C0072a c0072a2, C0060t c0060t) {
        this.f806a = aVar;
        this.f807b = abstractC0058q;
        this.f808c = b02;
        this.f809d = c0374a;
        this.f810e = c0072a;
        this.f811f = c0072a2;
        this.f812g = c0060t;
        AtomicReference atomicReference = v0.f906w;
        this.f830z = ((Boolean) atomicReference.get()).booleanValue();
        this.f793A = new C0050m(0, this);
        this.f794B = new K0();
        A0 b3 = b02.b();
        b3.c();
        this.f796D = b3;
        B0 b03 = new B0();
        if (((Boolean) atomicReference.get()).booleanValue()) {
            b03.f655m = new C0398r();
        }
        this.f797E = b03;
        D0 c3 = b03.c();
        c3.e(true);
        this.f798F = c3;
        this.f801I = new E.b(this, c0072a);
        A0 b4 = this.f797E.b();
        try {
            C0030c a3 = b4.a(0);
            b4.c();
            this.f802J = a3;
            this.f803K = new E.c();
        } catch (Throwable th) {
            b4.c();
            throw th;
        }
    }

    public static final int I(C0052n c0052n, int i3, boolean z3, int i4) {
        A0 a02 = c0052n.f796D;
        int[] iArr = a02.f630b;
        int i5 = i3 * 5;
        boolean z4 = (iArr[i5 + 1] & 134217728) != 0;
        int[] iArr2 = a02.f630b;
        if (z4) {
            int i6 = iArr[i5];
            Object j3 = a02.j(iArr, i3);
            if (i6 == 206 && p2.g.a(j3, C0032d.f745e)) {
                a02.g(i3, 0);
                return C0032d.l(iArr2, i3);
            }
            if (C0032d.j(iArr2, i3)) {
                return 1;
            }
            return C0032d.l(iArr2, i3);
        }
        if (!C0032d.e(iArr, i3)) {
            if (C0032d.j(iArr2, i3)) {
                return 1;
            }
            return C0032d.l(iArr2, i3);
        }
        int i7 = iArr2[i5 + 3] + i3;
        int i8 = 0;
        for (int i9 = i3 + 1; i9 < i7; i9 += iArr2[(i9 * 5) + 3]) {
            boolean j4 = C0032d.j(iArr2, i9);
            E.b bVar = c0052n.f801I;
            if (j4) {
                bVar.c();
                Object i10 = a02.i(i9);
                bVar.c();
                bVar.h.f706a.add(i10);
            }
            i8 += I(c0052n, i9, j4 || z3, j4 ? 0 : i4 + i8);
            if (j4) {
                bVar.c();
                bVar.a();
            }
        }
        if (C0032d.j(iArr2, i3)) {
            return 1;
        }
        return i8;
    }

    public final Object A() {
        if (!this.f804L) {
            return this.f796D.h();
        }
        if (!this.f821q) {
            return C0048l.f781a;
        }
        C0032d.r("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    public final int B(int i3) {
        int m2 = C0032d.m(this.f796D.f630b, i3) + 1;
        int i4 = 0;
        while (m2 < i3) {
            if (!C0032d.i(this.f796D.f630b, m2)) {
                i4++;
            }
            m2 += C0032d.g(this.f796D.f630b, m2);
        }
        return i4;
    }

    public final boolean C(A.t tVar) {
        E.A a3 = this.f810e.f1102b;
        if (!a3.i0()) {
            C0032d.r("Expected applyChanges() to have been called");
            throw null;
        }
        if (((C0405y) tVar.f175e).f5056e <= 0 && this.f822r.isEmpty()) {
            return false;
        }
        o(tVar, null);
        return a3.j0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f711b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0052n.D():void");
    }

    public final void E() {
        I(this, this.f796D.f635g, false, 0);
        E.b bVar = this.f801I;
        bVar.c();
        bVar.d(false);
        C0052n c0052n = bVar.f1103a;
        A0 a02 = c0052n.f796D;
        if (a02.f631c > 0) {
            int i3 = a02.f636i;
            M m2 = bVar.f1106d;
            int i4 = m2.f709b;
            if ((i4 > 0 ? m2.f708a[i4 - 1] : -2) != i3) {
                if (!bVar.f1105c && bVar.f1107e) {
                    bVar.d(false);
                    bVar.f1104b.f1102b.l0(E.k.f1123c);
                    bVar.f1105c = true;
                }
                if (i3 > 0) {
                    C0030c a3 = a02.a(i3);
                    m2.b(i3);
                    bVar.d(false);
                    C0072a c0072a = bVar.f1104b;
                    E.j jVar = E.j.f1122c;
                    E.A a4 = c0072a.f1102b;
                    a4.m0(jVar);
                    AbstractC0090a.d0(a4, 0, a3);
                    int i5 = a4.h;
                    int i6 = jVar.f1141a;
                    int f02 = E.A.f0(a4, i6);
                    int i7 = jVar.f1142b;
                    if (i5 != f02 || a4.f1101i != E.A.f0(a4, i7)) {
                        StringBuilder sb = new StringBuilder();
                        int i8 = 0;
                        for (int i9 = 0; i9 < i6; i9++) {
                            if (((1 << i9) & a4.h) != 0) {
                                if (i8 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(jVar.b(i9));
                                i8++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
                        int i10 = 0;
                        for (int i11 = 0; i11 < i7; i11++) {
                            if (((1 << i11) & a4.f1101i) != 0) {
                                if (i8 > 0) {
                                    g3.append(", ");
                                }
                                g3.append(jVar.c(i11));
                                i10++;
                            }
                        }
                        String sb3 = g3.toString();
                        p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(jVar);
                        sb4.append(". Not all arguments were provided. Missing ");
                        AbstractC0000a.k(sb4, i8, " int arguments (", sb2, ") and ");
                        AbstractC0000a.l(sb4, i10, " object arguments (", sb3, ").");
                        throw null;
                    }
                    bVar.f1105c = true;
                }
            }
        }
        bVar.f1104b.f1102b.l0(E.r.f1134c);
        int i12 = bVar.f1108f;
        A0 a03 = c0052n.f796D;
        bVar.f1108f = a03.f630b[(a03.f635g * 5) + 3] + i12;
    }

    public final void F(InterfaceC0045j0 interfaceC0045j0) {
        A.t tVar = this.f825u;
        if (tVar == null) {
            tVar = new A.t(6);
            this.f825u = tVar;
        }
        ((SparseArray) tVar.f175e).put(this.f796D.f635g, interfaceC0045j0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(int r8, int r9, int r10) {
        /*
            r7 = this;
            D.A0 r0 = r7.f796D
            if (r8 != r9) goto L7
        L4:
            r10 = r8
            goto L71
        L7:
            if (r8 == r10) goto L71
            if (r9 != r10) goto Ld
            goto L71
        Ld:
            int[] r1 = r0.f630b
            int r2 = r8 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            if (r2 != r9) goto L1a
            r10 = r9
            goto L71
        L1a:
            int r3 = r9 * 5
            int r3 = r3 + 2
            r3 = r1[r3]
            if (r3 != r8) goto L23
            goto L4
        L23:
            if (r2 != r3) goto L27
            r10 = r2
            goto L71
        L27:
            r2 = 0
            r3 = r8
            r4 = r2
        L2a:
            int[] r5 = r0.f630b
            if (r3 <= 0) goto L37
            if (r3 == r10) goto L37
            int r3 = D.C0032d.m(r5, r3)
            int r4 = r4 + 1
            goto L2a
        L37:
            r3 = r9
            r6 = r2
        L39:
            if (r3 <= 0) goto L44
            if (r3 == r10) goto L44
            int r3 = D.C0032d.m(r5, r3)
            int r6 = r6 + 1
            goto L39
        L44:
            int r10 = r4 - r6
            r5 = r8
            r3 = r2
        L48:
            if (r3 >= r10) goto L53
            int r5 = r5 * 5
            int r5 = r5 + 2
            r5 = r1[r5]
            int r3 = r3 + 1
            goto L48
        L53:
            int r6 = r6 - r4
            r10 = r9
        L55:
            if (r2 >= r6) goto L60
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 + 1
            goto L55
        L60:
            r2 = r10
            r10 = r5
        L62:
            if (r10 == r2) goto L71
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            goto L62
        L71:
            if (r8 <= 0) goto L8b
            if (r8 == r10) goto L8b
            int[] r1 = r0.f630b
            boolean r1 = D.C0032d.j(r1, r8)
            if (r1 == 0) goto L82
            E.b r1 = r7.f801I
            r1.a()
        L82:
            int[] r1 = r0.f630b
            int r8 = r8 * 5
            int r8 = r8 + 2
            r8 = r1[r8]
            goto L71
        L8b:
            r7.p(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0052n.G(int, int, int):void");
    }

    public final Object H() {
        if (!this.f804L) {
            Object h = this.f796D.h();
            return h instanceof x0 ? ((x0) h).f928a : h;
        }
        if (!this.f821q) {
            return C0048l.f781a;
        }
        C0032d.r("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f822r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            int r0 = r12.f815k
            D.A0 r1 = r12.f796D
            int r1 = r1.l()
            int r1 = r1 + r0
            r12.f815k = r1
            goto Ldf
        L15:
            D.A0 r0 = r12.f796D
            int r1 = r0.f()
            int r2 = r0.f635g
            int r3 = r0.h
            r4 = 0
            int[] r5 = r0.f630b
            if (r2 >= r3) goto L29
            java.lang.Object r2 = r0.j(r5, r2)
            goto L2a
        L29:
            r2 = r4
        L2a:
            java.lang.Object r3 = r0.e()
            int r6 = r12.f816l
            D.U r7 = D.C0048l.f781a
            r8 = 207(0xcf, float:2.9E-43)
            r9 = 3
            if (r2 != 0) goto L63
            if (r3 == 0) goto L54
            if (r1 != r8) goto L54
            boolean r10 = r3.equals(r7)
            if (r10 != 0) goto L54
            int r10 = r3.hashCode()
            int r11 = r12.f805M
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
            r12.f805M = r10
            goto L7f
        L54:
            int r10 = r12.f805M
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r1
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
        L60:
            r12.f805M = r10
            goto L7f
        L63:
            boolean r10 = r2 instanceof java.lang.Enum
            if (r10 == 0) goto L7a
            r10 = r2
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
        L6e:
            int r11 = r12.f805M
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            goto L60
        L7a:
            int r10 = r2.hashCode()
            goto L6e
        L7f:
            int r10 = r0.f635g
            boolean r5 = D.C0032d.j(r5, r10)
            r12.M(r5, r4)
            r12.D()
            r0.d()
            if (r2 != 0) goto Lc4
            if (r3 == 0) goto Lb1
            if (r1 != r8) goto Lb1
            boolean r0 = r3.equals(r7)
            if (r0 != 0) goto Lb1
            int r0 = r3.hashCode()
            int r1 = r12.f805M
            r1 = r1 ^ r6
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f805M = r0
            goto Ldf
        Lb1:
            int r0 = r12.f805M
            r0 = r0 ^ r6
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        Lbd:
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f805M = r0
            goto Ldf
        Lc4:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Lda
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        Lce:
            int r1 = r12.f805M
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto Lbd
        Lda:
            int r0 = r2.hashCode()
            goto Lce
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0052n.J():void");
    }

    public final void K() {
        if (this.f815k != 0) {
            C0032d.r("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C0053n0 w3 = w();
        if (w3 != null) {
            w3.f831a |= 16;
        }
        if (!this.f822r.isEmpty()) {
            D();
            return;
        }
        A0 a02 = this.f796D;
        int i3 = a02.f636i;
        this.f815k = i3 >= 0 ? C0032d.l(a02.f630b, i3) : 0;
        this.f796D.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r28, java.lang.Object r29, int r30, D.InterfaceC0045j0 r31) {
        /*
            Method dump skipped, instructions count: 1203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0052n.L(int, java.lang.Object, int, D.j0):void");
    }

    public final void M(boolean z3, InterfaceC0045j0 interfaceC0045j0) {
        if (z3) {
            A0 a02 = this.f796D;
            if (a02.f638k <= 0) {
                if (C0032d.j(a02.f630b, a02.f635g)) {
                    a02.n();
                    return;
                } else {
                    C0032d.H("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (interfaceC0045j0 != null && this.f796D.e() != interfaceC0045j0) {
            E.b bVar = this.f801I;
            bVar.getClass();
            bVar.d(false);
            C0072a c0072a = bVar.f1104b;
            E.v vVar = E.v.f1138c;
            E.A a3 = c0072a.f1102b;
            a3.m0(vVar);
            AbstractC0090a.d0(a3, 0, interfaceC0045j0);
            int i3 = a3.h;
            int i4 = vVar.f1141a;
            int f02 = E.A.f0(a3, i4);
            int i5 = vVar.f1142b;
            if (i3 != f02 || a3.f1101i != E.A.f0(a3, i5)) {
                StringBuilder sb = new StringBuilder();
                int i6 = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    if (((1 << i7) & a3.h) != 0) {
                        if (i6 > 0) {
                            sb.append(", ");
                        }
                        sb.append(vVar.b(i7));
                        i6++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    if (((1 << i9) & a3.f1101i) != 0) {
                        if (i6 > 0) {
                            g3.append(", ");
                        }
                        g3.append(vVar.c(i9));
                        i8++;
                    }
                }
                String sb3 = g3.toString();
                p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(vVar);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC0000a.k(sb4, i6, " int arguments (", sb2, ") and ");
                AbstractC0000a.l(sb4, i8, " object arguments (", sb3, ").");
                throw null;
            }
        }
        this.f796D.n();
    }

    public final void N(int i3) {
        int i4;
        int i5;
        if (this.f813i != null) {
            L(i3, null, 0, null);
            return;
        }
        if (this.f821q) {
            C0032d.r("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.f805M = this.f816l ^ Integer.rotateLeft(Integer.rotateLeft(this.f805M, 3) ^ i3, 3);
        this.f816l++;
        A0 a02 = this.f796D;
        boolean z3 = this.f804L;
        U u3 = C0048l.f781a;
        if (z3) {
            a02.f638k++;
            this.f798F.G(i3, u3, u3, false);
            u(false, null);
            return;
        }
        if (a02.f() == i3 && ((i5 = a02.f635g) >= a02.h || !C0032d.i(a02.f630b, i5))) {
            a02.n();
            u(false, null);
            return;
        }
        if (a02.f638k <= 0 && (i4 = a02.f635g) != a02.h) {
            int i6 = this.f814j;
            E();
            this.f801I.e(i6, a02.l());
            C0032d.n(this.f822r, i4, a02.f635g);
        }
        a02.f638k++;
        this.f804L = true;
        this.f800H = null;
        if (this.f798F.f685v) {
            D0 c3 = this.f797E.c();
            this.f798F = c3;
            c3.B();
            this.f799G = false;
            this.f800H = null;
        }
        D0 d02 = this.f798F;
        d02.d();
        int i7 = d02.f682s;
        d02.G(i3, u3, u3, false);
        this.f802J = d02.b(i7);
        u(false, null);
    }

    public final C0052n O(int i3) {
        C0053n0 c0053n0;
        N(i3);
        boolean z3 = this.f804L;
        C0060t c0060t = this.f812g;
        K0 k0 = this.f794B;
        if (z3) {
            C0053n0 c0053n02 = new C0053n0(c0060t);
            k0.f706a.add(c0053n02);
            W(c0053n02);
            c0053n02.f835e = this.f829y;
            c0053n02.f831a &= -17;
        } else {
            ArrayList arrayList = this.f822r;
            int w3 = C0032d.w(this.f796D.f636i, arrayList);
            N n2 = w3 >= 0 ? (N) arrayList.remove(w3) : null;
            Object h = this.f796D.h();
            if (p2.g.a(h, C0048l.f781a)) {
                c0053n0 = new C0053n0(c0060t);
                W(c0053n0);
            } else {
                p2.g.c(h, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c0053n0 = (C0053n0) h;
            }
            if (n2 == null) {
                int i4 = c0053n0.f831a;
                boolean z4 = (i4 & 64) != 0;
                if (z4) {
                    c0053n0.f831a = i4 & (-65);
                }
                if (!z4) {
                    c0053n0.f831a &= -9;
                    k0.f706a.add(c0053n0);
                    c0053n0.f835e = this.f829y;
                    c0053n0.f831a &= -17;
                }
            }
            c0053n0.f831a |= 8;
            k0.f706a.add(c0053n0);
            c0053n0.f835e = this.f829y;
            c0053n0.f831a &= -17;
        }
        return this;
    }

    public final void P() {
        L(125, null, 2, null);
        this.f821q = true;
    }

    public final void Q() {
        this.f816l = 0;
        B0 b02 = this.f808c;
        this.f796D = b02.b();
        L(100, null, 0, null);
        this.f824t = r.f848a;
        this.f827w.b(this.f826v ? 1 : 0);
        this.f826v = f(this.f824t);
        this.f800H = null;
        if (!this.f820p) {
            this.f820p = false;
        }
        if (!this.f830z) {
            this.f830z = false;
        }
        Set set = (Set) C0032d.B(this.f824t, O.b.f1873a);
        if (set != null) {
            set.add(b02);
        }
        L(1000, null, 0, null);
    }

    public final boolean R(C0053n0 c0053n0, Object obj) {
        C0030c c0030c = c0053n0.f833c;
        if (c0030c == null) {
            return false;
        }
        int a3 = this.f796D.f629a.a(c0030c);
        if (!this.f795C || a3 < this.f796D.f635g) {
            return false;
        }
        ArrayList arrayList = this.f822r;
        int w3 = C0032d.w(a3, arrayList);
        if (w3 < 0) {
            int i3 = -(w3 + 1);
            if (!(obj instanceof D)) {
                obj = null;
            }
            arrayList.add(i3, new N(c0053n0, a3, obj));
        } else {
            N n2 = (N) arrayList.get(w3);
            if (obj instanceof D) {
                Object obj2 = n2.f712c;
                if (obj2 == null) {
                    n2.f712c = obj;
                } else if (obj2 instanceof C0375B) {
                    ((C0375B) obj2).a(obj);
                } else {
                    int i4 = AbstractC0378E.f4967a;
                    C0375B c0375b = new C0375B(2);
                    c0375b.f4961b[c0375b.d(obj2)] = obj2;
                    c0375b.f4961b[c0375b.d(obj)] = obj;
                    n2.f712c = c0375b;
                }
            } else {
                n2.f712c = null;
            }
        }
        return true;
    }

    public final void S(int i3, int i4) {
        if (X(i3) != i4) {
            if (i3 < 0) {
                C0396p c0396p = this.f819o;
                if (c0396p == null) {
                    c0396p = new C0396p();
                    this.f819o = c0396p;
                }
                c0396p.g(i3, i4);
                return;
            }
            int[] iArr = this.f818n;
            if (iArr == null) {
                int i5 = this.f796D.f631c;
                int[] iArr2 = new int[i5];
                Arrays.fill(iArr2, 0, i5, -1);
                this.f818n = iArr2;
                iArr = iArr2;
            }
            iArr[i3] = i4;
        }
    }

    public final void T(int i3, int i4) {
        int X2 = X(i3);
        if (X2 != i4) {
            int i5 = i4 - X2;
            K0 k0 = this.h;
            int size = k0.f706a.size() - 1;
            while (i3 != -1) {
                int X3 = X(i3) + i5;
                S(i3, X3);
                int i6 = size;
                while (true) {
                    if (-1 < i6) {
                        C0043i0 c0043i0 = (C0043i0) k0.f706a.get(i6);
                        if (c0043i0 != null && c0043i0.a(i3, X3)) {
                            size = i6 - 1;
                            break;
                        }
                        i6--;
                    } else {
                        break;
                    }
                }
                if (i3 < 0) {
                    i3 = this.f796D.f636i;
                } else if (C0032d.j(this.f796D.f630b, i3)) {
                    return;
                } else {
                    i3 = C0032d.m(this.f796D.f630b, i3);
                }
            }
        }
    }

    public final L.e U(InterfaceC0045j0 interfaceC0045j0, L.e eVar) {
        L.e eVar2 = (L.e) interfaceC0045j0;
        eVar2.getClass();
        L.d dVar = new L.d(eVar2);
        dVar.putAll(eVar);
        L.e a3 = dVar.a();
        L(204, C0032d.f744d, 0, null);
        A();
        W(a3);
        A();
        W(eVar);
        q(false);
        return a3;
    }

    public final void V(Object obj) {
        int i3;
        A0 a02;
        int i4;
        D0 d02;
        if (obj instanceof w0) {
            C0030c c0030c = null;
            if (this.f804L) {
                C0072a c0072a = this.f801I.f1104b;
                E.q qVar = E.q.f1133c;
                E.A a3 = c0072a.f1102b;
                a3.m0(qVar);
                AbstractC0090a.d0(a3, 0, (w0) obj);
                int i5 = a3.h;
                int i6 = qVar.f1141a;
                int f02 = E.A.f0(a3, i6);
                int i7 = qVar.f1142b;
                if (i5 != f02 || a3.f1101i != E.A.f0(a3, i7)) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    for (int i9 = 0; i9 < i6; i9++) {
                        if (((1 << i9) & a3.h) != 0) {
                            if (i8 > 0) {
                                sb.append(", ");
                            }
                            sb.append(qVar.b(i9));
                            i8++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i10 = 0;
                    for (int i11 = 0; i11 < i7; i11++) {
                        if (((1 << i11) & a3.f1101i) != 0) {
                            if (i8 > 0) {
                                g3.append(", ");
                            }
                            g3.append(qVar.c(i11));
                            i10++;
                        }
                    }
                    String sb3 = g3.toString();
                    p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(qVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC0000a.k(sb4, i8, " int arguments (", sb2, ") and ");
                    AbstractC0000a.l(sb4, i10, " object arguments (", sb3, ").");
                    throw null;
                }
            }
            this.f809d.add(obj);
            w0 w0Var = (w0) obj;
            if (this.f804L) {
                D0 d03 = this.f798F;
                int i12 = d03.f682s;
                if (i12 > d03.f684u + 1) {
                    int i13 = i12 - 1;
                    int w3 = d03.w(d03.f666b, i13);
                    while (true) {
                        i4 = i13;
                        i13 = w3;
                        d02 = this.f798F;
                        if (i13 == d02.f684u || i13 < 0) {
                            break;
                        } else {
                            w3 = d02.w(d02.f666b, i13);
                        }
                    }
                    c0030c = d02.b(i4);
                }
            } else {
                A0 a03 = this.f796D;
                int i14 = a03.f635g;
                if (i14 > a03.f636i + 1) {
                    int i15 = i14 - 1;
                    int i16 = a03.f630b[(i15 * 5) + 2];
                    while (true) {
                        i3 = i15;
                        i15 = i16;
                        a02 = this.f796D;
                        if (i15 == a02.f636i || i15 < 0) {
                            break;
                        } else {
                            i16 = a02.f630b[(i15 * 5) + 2];
                        }
                    }
                    c0030c = a02.a(i3);
                }
            }
            x0 x0Var = new x0();
            x0Var.f928a = w0Var;
            x0Var.f929b = c0030c;
            obj = x0Var;
        }
        W(obj);
    }

    public final void W(Object obj) {
        int i3;
        int i4;
        int i5 = 1;
        if (this.f804L) {
            D0 d02 = this.f798F;
            if (d02.f677n > 0) {
                d02.s(1, d02.f684u);
            }
            Object[] objArr = d02.f667c;
            int i6 = d02.f672i;
            d02.f672i = i6 + 1;
            Object obj2 = objArr[d02.g(i6)];
            int i7 = d02.f672i;
            if (i7 <= d02.f673j) {
                d02.f667c[d02.g(i7 - 1)] = obj;
                return;
            } else {
                C0032d.r("Writing to an invalid slot");
                throw null;
            }
        }
        A0 a02 = this.f796D;
        boolean z3 = a02.f641n;
        E.b bVar = this.f801I;
        if (!z3) {
            C0030c a3 = a02.a(a02.f636i);
            C0072a c0072a = bVar.f1104b;
            E.e eVar = E.e.f1117c;
            E.A a4 = c0072a.f1102b;
            a4.m0(eVar);
            int i8 = 0;
            AbstractC0090a.d0(a4, 0, a3);
            AbstractC0090a.d0(a4, 1, obj);
            int i9 = a4.h;
            int i10 = eVar.f1141a;
            int f02 = E.A.f0(a4, i10);
            int i11 = eVar.f1142b;
            if (i9 == f02 && a4.f1101i == E.A.f0(a4, i11)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i12 = 0;
            while (i12 < i10) {
                if (((i5 << i12) & a4.h) != 0) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(eVar.b(i12));
                    i8++;
                }
                i12++;
                i5 = 1;
            }
            String sb2 = sb.toString();
            StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                int i15 = i11;
                if (((1 << i13) & a4.f1101i) != 0) {
                    if (i8 > 0) {
                        g3.append(", ");
                    }
                    g3.append(eVar.c(i13));
                    i14++;
                }
                i13++;
                i11 = i15;
            }
            String sb3 = g3.toString();
            p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(eVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0000a.k(sb4, i8, " int arguments (", sb2, ") and ");
            AbstractC0000a.l(sb4, i14, " object arguments (", sb3, ").");
            throw null;
        }
        int o3 = (a02.f639l - C0032d.o(a02.f630b, a02.f636i)) - 1;
        if (bVar.f1103a.f796D.f636i - bVar.f1108f >= 0) {
            bVar.d(true);
            C0072a c0072a2 = bVar.f1104b;
            E.l lVar = E.l.f1127g;
            E.A a5 = c0072a2.f1102b;
            a5.m0(lVar);
            AbstractC0090a.d0(a5, 0, obj);
            AbstractC0090a.c0(a5, 0, o3);
            if (a5.h == E.A.f0(a5, 1) && a5.f1101i == E.A.f0(a5, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((a5.h & 1) != 0) {
                sb5.append(lVar.b(0));
                i3 = 1;
            } else {
                i3 = 0;
            }
            String sb6 = sb5.toString();
            StringBuilder g4 = AbstractC0000a.g(sb6, "StringBuilder().apply(builderAction).toString()");
            if ((a5.f1101i & 1) != 0) {
                if (i3 > 0) {
                    g4.append(", ");
                }
                g4.append(lVar.c(0));
            } else {
                i5 = 0;
            }
            String sb7 = g4.toString();
            p2.g.d(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder("Error while pushing ");
            sb8.append(lVar);
            sb8.append(". Not all arguments were provided. Missing ");
            AbstractC0000a.k(sb8, i3, " int arguments (", sb6, ") and ");
            AbstractC0000a.l(sb8, i5, " object arguments (", sb7, ").");
            throw null;
        }
        A0 a03 = this.f796D;
        C0030c a6 = a03.a(a03.f636i);
        C0072a c0072a3 = bVar.f1104b;
        E.l lVar2 = E.l.f1126f;
        E.A a7 = c0072a3.f1102b;
        a7.m0(lVar2);
        AbstractC0090a.d0(a7, 0, obj);
        AbstractC0090a.d0(a7, 1, a6);
        AbstractC0090a.c0(a7, 0, o3);
        if (a7.h == E.A.f0(a7, 1) && a7.f1101i == E.A.f0(a7, 2)) {
            return;
        }
        StringBuilder sb9 = new StringBuilder();
        if ((a7.h & 1) != 0) {
            sb9.append(lVar2.b(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb10 = sb9.toString();
        StringBuilder g5 = AbstractC0000a.g(sb10, "StringBuilder().apply(builderAction).toString()");
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 2; i16 < i18; i18 = 2) {
            if (((1 << i16) & a7.f1101i) != 0) {
                if (i4 > 0) {
                    g5.append(", ");
                }
                g5.append(lVar2.c(i16));
                i17++;
            }
            i16++;
        }
        String sb11 = g5.toString();
        p2.g.d(sb11, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb12 = new StringBuilder("Error while pushing ");
        sb12.append(lVar2);
        sb12.append(". Not all arguments were provided. Missing ");
        AbstractC0000a.k(sb12, i4, " int arguments (", sb10, ") and ");
        AbstractC0000a.l(sb12, i17, " object arguments (", sb11, ").");
        throw null;
    }

    public final int X(int i3) {
        int i4;
        if (i3 >= 0) {
            int[] iArr = this.f818n;
            return (iArr == null || (i4 = iArr[i3]) < 0) ? C0032d.l(this.f796D.f630b, i3) : i4;
        }
        C0396p c0396p = this.f819o;
        if (c0396p == null || c0396p.c(i3) < 0) {
            return 0;
        }
        return c0396p.d(i3);
    }

    public final void Y() {
        if (!this.f821q) {
            C0032d.r("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f821q = false;
        if (this.f804L) {
            C0032d.r("useNode() called while inserting");
            throw null;
        }
        A0 a02 = this.f796D;
        Object i3 = a02.i(a02.f636i);
        E.b bVar = this.f801I;
        bVar.c();
        bVar.h.f706a.add(i3);
    }

    public final void a() {
        i();
        this.h.f706a.clear();
        this.f817m.f709b = 0;
        this.f823s.f709b = 0;
        this.f827w.f709b = 0;
        this.f825u = null;
        E.c cVar = this.f803K;
        cVar.f1115c.g0();
        cVar.f1114b.g0();
        this.f805M = 0;
        this.f828x = 0;
        this.f821q = false;
        this.f804L = false;
        this.f795C = false;
        A0 a02 = this.f796D;
        if (!a02.f634f) {
            a02.c();
        }
        if (this.f798F.f685v) {
            return;
        }
        v();
    }

    public final void b(Object obj, o2.e eVar) {
        int i3 = 0;
        if (this.f804L) {
            E.c cVar = this.f803K;
            cVar.getClass();
            E.w wVar = E.w.f1139c;
            E.A a3 = cVar.f1114b;
            a3.m0(wVar);
            AbstractC0090a.d0(a3, 0, obj);
            p2.g.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            p2.r.c(2, eVar);
            AbstractC0090a.d0(a3, 1, eVar);
            int i4 = a3.h;
            int i5 = wVar.f1141a;
            int f02 = E.A.f0(a3, i5);
            int i6 = wVar.f1142b;
            if (i4 == f02 && a3.f1101i == E.A.f0(a3, i6)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i5;
                if (((1 << i7) & a3.h) != 0) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(wVar.b(i7));
                    i3++;
                }
                i7++;
                i5 = i8;
            }
            String sb2 = sb.toString();
            StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
            int i9 = 0;
            int i10 = 0;
            while (i10 < i6) {
                int i11 = i6;
                if (((1 << i10) & a3.f1101i) != 0) {
                    if (i3 > 0) {
                        g3.append(", ");
                    }
                    g3.append(wVar.c(i10));
                    i9++;
                }
                i10++;
                i6 = i11;
            }
            String sb3 = g3.toString();
            p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(wVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0000a.k(sb4, i3, " int arguments (", sb2, ") and ");
            AbstractC0000a.l(sb4, i9, " object arguments (", sb3, ").");
            throw null;
        }
        E.b bVar = this.f801I;
        bVar.b();
        C0072a c0072a = bVar.f1104b;
        E.w wVar2 = E.w.f1139c;
        E.A a4 = c0072a.f1102b;
        a4.m0(wVar2);
        int i12 = 0;
        AbstractC0090a.d0(a4, 0, obj);
        p2.g.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        p2.r.c(2, eVar);
        AbstractC0090a.d0(a4, 1, eVar);
        int i13 = a4.h;
        int i14 = wVar2.f1141a;
        int f03 = E.A.f0(a4, i14);
        int i15 = wVar2.f1142b;
        if (i13 == f03 && a4.f1101i == E.A.f0(a4, i15)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i16 = 0; i16 < i14; i16++) {
            if (((1 << i16) & a4.h) != 0) {
                if (i12 > 0) {
                    sb5.append(", ");
                }
                sb5.append(wVar2.b(i16));
                i12++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder g4 = AbstractC0000a.g(sb6, "StringBuilder().apply(builderAction).toString()");
        int i17 = 0;
        int i18 = 0;
        while (i17 < i15) {
            int i19 = i15;
            if (((1 << i17) & a4.f1101i) != 0) {
                if (i12 > 0) {
                    g4.append(", ");
                }
                g4.append(wVar2.c(i17));
                i18++;
            }
            i17++;
            i15 = i19;
        }
        String sb7 = g4.toString();
        p2.g.d(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(wVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        AbstractC0000a.k(sb8, i12, " int arguments (", sb6, ") and ");
        AbstractC0000a.l(sb8, i18, " object arguments (", sb7, ").");
        throw null;
    }

    public final boolean c(float f3) {
        Object A3 = A();
        if ((A3 instanceof Float) && f3 == ((Number) A3).floatValue()) {
            return false;
        }
        W(Float.valueOf(f3));
        return true;
    }

    public final boolean d(int i3) {
        Object A3 = A();
        if ((A3 instanceof Integer) && i3 == ((Number) A3).intValue()) {
            return false;
        }
        W(Integer.valueOf(i3));
        return true;
    }

    public final boolean e(long j3) {
        Object A3 = A();
        if ((A3 instanceof Long) && j3 == ((Number) A3).longValue()) {
            return false;
        }
        W(Long.valueOf(j3));
        return true;
    }

    public final boolean f(Object obj) {
        if (p2.g.a(A(), obj)) {
            return false;
        }
        W(obj);
        return true;
    }

    public final boolean g(boolean z3) {
        Object A3 = A();
        if ((A3 instanceof Boolean) && z3 == ((Boolean) A3).booleanValue()) {
            return false;
        }
        W(Boolean.valueOf(z3));
        return true;
    }

    public final boolean h(Object obj) {
        if (A() == obj) {
            return false;
        }
        W(obj);
        return true;
    }

    public final void i() {
        this.f813i = null;
        this.f814j = 0;
        this.f815k = 0;
        this.f805M = 0;
        this.f821q = false;
        E.b bVar = this.f801I;
        bVar.f1105c = false;
        bVar.f1106d.f709b = 0;
        bVar.f1108f = 0;
        this.f794B.f706a.clear();
        this.f818n = null;
        this.f819o = null;
    }

    public final int j(int i3, int i4, int i5, int i6) {
        int i7;
        Object b3;
        if (i3 == i5) {
            return i6;
        }
        A0 a02 = this.f796D;
        boolean i8 = C0032d.i(a02.f630b, i3);
        int[] iArr = a02.f630b;
        if (i8) {
            Object j3 = a02.j(iArr, i3);
            i7 = j3 != null ? j3 instanceof Enum ? ((Enum) j3).ordinal() : j3.hashCode() : 0;
        } else {
            int i9 = iArr[i3 * 5];
            if (i9 == 207 && (b3 = a02.b(iArr, i3)) != null && !b3.equals(C0048l.f781a)) {
                i9 = b3.hashCode();
            }
            i7 = i9;
        }
        if (i7 == 126665345) {
            return i7;
        }
        int i10 = this.f796D.f630b[(i3 * 5) + 2];
        if (i10 != i5) {
            i6 = j(i10, B(i10), i5, i6);
        }
        if (C0032d.i(this.f796D.f630b, i3)) {
            i4 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i6, 3) ^ i7, 3) ^ i4;
    }

    public final Object k(AbstractC0047k0 abstractC0047k0) {
        return C0032d.B(m(), abstractC0047k0);
    }

    public final void l(C0429j c0429j) {
        int i3;
        int i4;
        int i5;
        if (!this.f821q) {
            C0032d.r("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f821q = false;
        if (!this.f804L) {
            C0032d.r("createNode() can only be called when inserting");
            throw null;
        }
        M m2 = this.f817m;
        int i6 = m2.f708a[m2.f709b - 1];
        D0 d02 = this.f798F;
        C0030c b3 = d02.b(d02.f684u);
        this.f815k++;
        E.c cVar = this.f803K;
        E.l lVar = E.l.f1124d;
        E.A a3 = cVar.f1114b;
        a3.m0(lVar);
        AbstractC0090a.d0(a3, 0, c0429j);
        AbstractC0090a.c0(a3, 0, i6);
        AbstractC0090a.d0(a3, 1, b3);
        if (!(a3.h == E.A.f0(a3, 1) && a3.f1101i == E.A.f0(a3, 2))) {
            StringBuilder sb = new StringBuilder();
            if ((a3.h & 1) != 0) {
                sb.append(lVar.b(0));
                i5 = 1;
            } else {
                i5 = 0;
            }
            String sb2 = sb.toString();
            StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
            int i7 = 0;
            for (int i8 = 0; i8 < 2; i8++) {
                if (((1 << i8) & a3.f1101i) != 0) {
                    if (i5 > 0) {
                        g3.append(", ");
                    }
                    g3.append(lVar.c(i8));
                    i7++;
                }
            }
            String sb3 = g3.toString();
            p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(lVar);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0000a.k(sb4, i5, " int arguments (", sb2, ") and ");
            AbstractC0000a.l(sb4, i7, " object arguments (", sb3, ").");
            throw null;
        }
        E.l lVar2 = E.l.f1125e;
        E.A a4 = cVar.f1115c;
        a4.m0(lVar2);
        AbstractC0090a.c0(a4, 0, i6);
        AbstractC0090a.d0(a4, 0, b3);
        if (a4.h == E.A.f0(a4, 1) && a4.f1101i == E.A.f0(a4, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((a4.h & 1) != 0) {
            sb5.append(lVar2.b(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb6 = sb5.toString();
        StringBuilder g4 = AbstractC0000a.g(sb6, "StringBuilder().apply(builderAction).toString()");
        if ((a4.f1101i & 1) != 0) {
            if (i3 > 0) {
                g4.append(", ");
            }
            g4.append(lVar2.c(0));
            i4 = 1;
        } else {
            i4 = 0;
        }
        String sb7 = g4.toString();
        p2.g.d(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(lVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        AbstractC0000a.k(sb8, i3, " int arguments (", sb6, ") and ");
        AbstractC0000a.l(sb8, i4, " object arguments (", sb7, ").");
        throw null;
    }

    public final InterfaceC0045j0 m() {
        InterfaceC0045j0 interfaceC0045j0;
        InterfaceC0045j0 interfaceC0045j02;
        Object obj;
        Object obj2;
        InterfaceC0045j0 interfaceC0045j03 = this.f800H;
        if (interfaceC0045j03 != null) {
            return interfaceC0045j03;
        }
        int i3 = this.f796D.f636i;
        boolean z3 = this.f804L;
        C0027a0 c0027a0 = C0032d.f743c;
        if (z3 && this.f799G) {
            int i4 = this.f798F.f684u;
            while (i4 > 0) {
                D0 d02 = this.f798F;
                if (d02.f666b[d02.p(i4) * 5] == 202) {
                    D0 d03 = this.f798F;
                    int p3 = d03.p(i4);
                    if (C0032d.i(d03.f666b, p3)) {
                        Object[] objArr = d03.f667c;
                        int[] iArr = d03.f666b;
                        int i5 = p3 * 5;
                        obj = objArr[C0032d.t(iArr[i5 + 1] >> 30) + iArr[i5 + 4]];
                    } else {
                        obj = null;
                    }
                    if (p2.g.a(obj, c0027a0)) {
                        D0 d04 = this.f798F;
                        int p4 = d04.p(i4);
                        if (C0032d.h(d04.f666b, p4)) {
                            Object[] objArr2 = d04.f667c;
                            int[] iArr2 = d04.f666b;
                            obj2 = objArr2[C0032d.t(iArr2[(p4 * 5) + 1] >> 29) + d04.f(iArr2, p4)];
                        } else {
                            obj2 = C0048l.f781a;
                        }
                        p2.g.c(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        InterfaceC0045j0 interfaceC0045j04 = (InterfaceC0045j0) obj2;
                        this.f800H = interfaceC0045j04;
                        return interfaceC0045j04;
                    }
                }
                D0 d05 = this.f798F;
                i4 = d05.w(d05.f666b, i4);
            }
        }
        if (this.f796D.f631c > 0) {
            while (i3 > 0) {
                A0 a02 = this.f796D;
                int i6 = i3 * 5;
                int[] iArr3 = a02.f630b;
                if (iArr3[i6] == 202 && p2.g.a(a02.j(iArr3, i3), c0027a0)) {
                    A.t tVar = this.f825u;
                    if (tVar == null || (interfaceC0045j02 = (InterfaceC0045j0) ((SparseArray) tVar.f175e).get(i3)) == null) {
                        A0 a03 = this.f796D;
                        Object b3 = a03.b(a03.f630b, i3);
                        p2.g.c(b3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC0045j0 = (InterfaceC0045j0) b3;
                    } else {
                        interfaceC0045j0 = interfaceC0045j02;
                    }
                    this.f800H = interfaceC0045j0;
                    return interfaceC0045j0;
                }
                i3 = this.f796D.f630b[i6 + 2];
            }
        }
        L.e eVar = this.f824t;
        this.f800H = eVar;
        return eVar;
    }

    public final void n() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f794B.f706a.clear();
            this.f822r.clear();
            this.f810e.f1102b.g0();
            this.f825u = null;
            this.f806a.d();
        } finally {
            Trace.endSection();
        }
    }

    public final void o(A.t tVar, L.a aVar) {
        int i3;
        if (this.f795C) {
            C0032d.r("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f829y = N.o.k().d();
            this.f825u = null;
            C0405y c0405y = (C0405y) tVar.f175e;
            Object[] objArr = c0405y.f5053b;
            Object[] objArr2 = c0405y.f5054c;
            long[] jArr = c0405y.f5052a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f822r;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j3 = jArr[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                int i8 = (i4 << 3) + i7;
                                Object obj = objArr[i8];
                                Object obj2 = objArr2[i8];
                                p2.g.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C0030c c0030c = ((C0053n0) obj).f833c;
                                if (c0030c != null) {
                                    int i9 = c0030c.f739a;
                                    C0053n0 c0053n0 = (C0053n0) obj;
                                    if (obj2 == U.h) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new N(c0053n0, i9, obj2));
                                }
                                i3 = 8;
                            } else {
                                i3 = i5;
                            }
                            j3 >>= i3;
                            i7++;
                            i5 = i3;
                        }
                        if (i6 != i5) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            AbstractC0245p.X(arrayList, C0032d.f746f);
            this.f814j = 0;
            this.f795C = true;
            try {
                Q();
                Object A3 = A();
                if (A3 != aVar && aVar != null) {
                    W(aVar);
                }
                C0050m c0050m = this.f793A;
                F.d v3 = C0032d.v();
                try {
                    v3.b(c0050m);
                    C0027a0 c0027a0 = C0032d.f741a;
                    if (aVar != null) {
                        L(200, c0027a0, 0, null);
                        C0032d.y(this, aVar);
                        q(false);
                    } else if (!this.f826v || A3 == null || A3.equals(C0048l.f781a)) {
                        J();
                    } else {
                        L(200, c0027a0, 0, null);
                        p2.r.c(2, A3);
                        C0032d.y(this, (o2.e) A3);
                        q(false);
                    }
                    v3.m(v3.f1160f - 1);
                    t();
                    this.f795C = false;
                    arrayList.clear();
                    C0032d.E(this.f798F.f685v);
                    v();
                    Trace.endSection();
                } finally {
                    v3.m(v3.f1160f - 1);
                }
            } catch (Throwable th) {
                this.f795C = false;
                arrayList.clear();
                a();
                C0032d.E(this.f798F.f685v);
                v();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void p(int i3, int i4) {
        if (i3 <= 0 || i3 == i4) {
            return;
        }
        p(this.f796D.f630b[(i3 * 5) + 2], i4);
        if (C0032d.j(this.f796D.f630b, i3)) {
            Object i5 = this.f796D.i(i3);
            E.b bVar = this.f801I;
            bVar.c();
            bVar.h.f706a.add(i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0835  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r43) {
        /*
            Method dump skipped, instructions count: 2651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0052n.q(boolean):void");
    }

    public final void r() {
        q(false);
        C0053n0 w3 = w();
        if (w3 != null) {
            int i3 = w3.f831a;
            if ((i3 & 1) != 0) {
                w3.f831a = i3 | 2;
            }
        }
    }

    public final C0053n0 s() {
        C0053n0 c0053n0;
        C0030c a3;
        C0051m0 c0051m0;
        K0 k0 = this.f794B;
        if (k0.f706a.isEmpty()) {
            c0053n0 = null;
        } else {
            ArrayList arrayList = k0.f706a;
            c0053n0 = (C0053n0) arrayList.remove(arrayList.size() - 1);
        }
        if (c0053n0 != null) {
            c0053n0.f831a &= -9;
        }
        if (c0053n0 != null) {
            int i3 = this.f829y;
            C0403w c0403w = c0053n0.f836f;
            if (c0403w != null && (c0053n0.f831a & 16) == 0) {
                Object[] objArr = c0403w.f5045b;
                int[] iArr = c0403w.f5046c;
                long[] jArr = c0403w.f5044a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    loop0: while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j3 & 255) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    Object obj = objArr[i7];
                                    if (iArr[i7] != i3) {
                                        c0051m0 = new C0051m0(c0053n0, i3, c0403w);
                                        break loop0;
                                    }
                                }
                                j3 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            c0051m0 = null;
            if (c0051m0 != null) {
                C0072a c0072a = this.f801I.f1104b;
                E.g gVar = E.g.f1119c;
                E.A a4 = c0072a.f1102b;
                a4.m0(gVar);
                AbstractC0090a.d0(a4, 0, c0051m0);
                AbstractC0090a.d0(a4, 1, this.f812g);
                int i8 = a4.h;
                int i9 = gVar.f1141a;
                int f02 = E.A.f0(a4, i9);
                int i10 = gVar.f1142b;
                if (i8 != f02 || a4.f1101i != E.A.f0(a4, i10)) {
                    StringBuilder sb = new StringBuilder();
                    int i11 = 0;
                    for (int i12 = 0; i12 < i9; i12++) {
                        if ((a4.h & (1 << i12)) != 0) {
                            if (i11 > 0) {
                                sb.append(", ");
                            }
                            sb.append(gVar.b(i12));
                            i11++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder g3 = AbstractC0000a.g(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i13 = 0;
                    for (int i14 = 0; i14 < i10; i14++) {
                        if ((a4.f1101i & (1 << i14)) != 0) {
                            if (i11 > 0) {
                                g3.append(", ");
                            }
                            g3.append(gVar.c(i14));
                            i13++;
                        }
                    }
                    String sb3 = g3.toString();
                    p2.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(gVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC0000a.k(sb4, i11, " int arguments (", sb2, ") and ");
                    AbstractC0000a.l(sb4, i13, " object arguments (", sb3, ").");
                    throw null;
                }
            }
        }
        C0053n0 c0053n02 = null;
        if (c0053n0 != null) {
            int i15 = c0053n0.f831a;
            if ((i15 & 16) == 0 && ((i15 & 1) != 0 || this.f820p)) {
                if (c0053n0.f833c == null) {
                    if (this.f804L) {
                        D0 d02 = this.f798F;
                        a3 = d02.b(d02.f684u);
                    } else {
                        A0 a02 = this.f796D;
                        a3 = a02.a(a02.f636i);
                    }
                    c0053n0.f833c = a3;
                }
                c0053n0.f831a &= -5;
                c0053n02 = c0053n0;
            }
        }
        q(false);
        return c0053n02;
    }

    public final void t() {
        q(false);
        q(false);
        E.b bVar = this.f801I;
        if (bVar.f1105c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f1104b.f1102b.l0(E.h.f1120c);
            bVar.f1105c = false;
        }
        bVar.b();
        if (!(bVar.f1106d.f709b == 0)) {
            C0032d.r("Missed recording an endGroup()");
            throw null;
        }
        if (!this.h.f706a.isEmpty()) {
            C0032d.r("Start/end imbalance");
            throw null;
        }
        i();
        this.f796D.c();
        this.f826v = this.f827w.a() != 0;
    }

    public final void u(boolean z3, C0043i0 c0043i0) {
        this.h.f706a.add(this.f813i);
        this.f813i = c0043i0;
        int i3 = this.f815k;
        M m2 = this.f817m;
        m2.b(i3);
        m2.b(this.f816l);
        m2.b(this.f814j);
        if (z3) {
            this.f814j = 0;
        }
        this.f815k = 0;
        this.f816l = 0;
    }

    public final void v() {
        B0 b02 = new B0();
        if (this.f830z) {
            b02.f654l = new HashMap();
        }
        if (((Boolean) v0.f906w.get()).booleanValue()) {
            b02.f655m = new C0398r();
        }
        this.f797E = b02;
        D0 c3 = b02.c();
        c3.e(true);
        this.f798F = c3;
    }

    public final C0053n0 w() {
        if (this.f828x == 0) {
            K0 k0 = this.f794B;
            if (!k0.f706a.isEmpty()) {
                return (C0053n0) k0.f706a.get(r0.size() - 1);
            }
        }
        return null;
    }

    public final boolean x() {
        C0053n0 w3;
        return (y() && !this.f826v && ((w3 = w()) == null || (w3.f831a & 4) == 0)) ? false : true;
    }

    public final boolean y() {
        C0053n0 w3;
        return (this.f804L || this.f826v || (w3 = w()) == null || (w3.f831a & 8) != 0) ? false : true;
    }

    public final void z(ArrayList arrayList) {
        C0072a c0072a = this.f811f;
        E.b bVar = this.f801I;
        C0072a c0072a2 = bVar.f1104b;
        try {
            bVar.f1104b = c0072a;
            c0072a.f1102b.l0(E.t.f1136c);
            if (arrayList.size() <= 0) {
                C0072a c0072a3 = bVar.f1104b;
                c0072a3.f1102b.l0(E.i.f1121c);
                bVar.f1108f = 0;
                return;
            }
            C0168g c0168g = (C0168g) arrayList.get(0);
            X x3 = (X) c0168g.f3833d;
            x3.getClass();
            throw null;
        } finally {
            bVar.f1104b = c0072a2;
        }
    }
}
