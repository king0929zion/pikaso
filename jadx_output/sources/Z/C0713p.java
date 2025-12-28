package z;

import D.C0032d;
import D.C0037f0;
import c2.C0174m;
import p.AbstractC0536e;
import p.C0535d;
import y2.AbstractC0688v;
import y2.C0678k;

/* renamed from: z.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713p {

    /* renamed from: a, reason: collision with root package name */
    public V.c f6880a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6881b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6882c;

    /* renamed from: d, reason: collision with root package name */
    public Float f6883d;

    /* renamed from: e, reason: collision with root package name */
    public V.c f6884e;

    /* renamed from: f, reason: collision with root package name */
    public final C0535d f6885f = AbstractC0536e.a();

    /* renamed from: g, reason: collision with root package name */
    public final C0535d f6886g = AbstractC0536e.a();
    public final C0535d h = AbstractC0536e.a();

    /* renamed from: i, reason: collision with root package name */
    public final C0678k f6887i;

    /* renamed from: j, reason: collision with root package name */
    public final C0037f0 f6888j;

    /* renamed from: k, reason: collision with root package name */
    public final C0037f0 f6889k;

    public C0713p(V.c cVar, float f3, boolean z3) {
        this.f6880a = cVar;
        this.f6881b = f3;
        this.f6882c = z3;
        C0678k c0678k = new C0678k(true);
        c0678k.P(null);
        this.f6887i = c0678k;
        Boolean bool = Boolean.FALSE;
        this.f6888j = C0032d.A(bool);
        this.f6889k = C0032d.A(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(i2.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof z.C0706i
            if (r0 == 0) goto L13
            r0 = r11
            z.i r0 = (z.C0706i) r0
            int r1 = r0.f6873j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6873j = r1
            goto L18
        L13:
            z.i r0 = new z.i
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.h
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f6873j
            c2.m r3 = c2.C0174m.f3840a
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L46
            if (r2 == r7) goto L40
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            Z0.d.U(r11)
            goto Lc5
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            z.p r2 = r0.f6871g
            Z0.d.U(r11)
            goto Lae
        L40:
            z.p r2 = r0.f6871g
            Z0.d.U(r11)
            goto L5e
        L46:
            Z0.d.U(r11)
            r0.f6871g = r10
            r0.f6873j = r7
            z.m r11 = new z.m
            r11.<init>(r10, r6)
            java.lang.Object r11 = y2.AbstractC0688v.b(r11, r0)
            if (r11 != r1) goto L59
            goto L5a
        L59:
            r11 = r3
        L5a:
            if (r11 != r1) goto L5d
            return r1
        L5d:
            r2 = r10
        L5e:
            D.f0 r11 = r2.f6888j
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r11.setValue(r8)
            r0.f6871g = r2
            r0.f6873j = r5
        L69:
            y2.k r11 = r2.f6887i
            java.lang.Object r5 = r11.M()
            boolean r8 = r5 instanceof y2.N
            if (r8 != 0) goto L81
            boolean r11 = r5 instanceof y2.C0680m
            if (r11 != 0) goto L7c
            java.lang.Object r11 = y2.AbstractC0688v.q(r5)
            goto Lab
        L7c:
            y2.m r5 = (y2.C0680m) r5
            java.lang.Throwable r11 = r5.f6805a
            throw r11
        L81:
            int r5 = r11.X(r5)
            if (r5 < 0) goto L69
            y2.X r5 = new y2.X
            g2.d r8 = Z.b.z(r0)
            r5.<init>(r8, r11)
            r5.u()
            y2.Q r8 = new y2.Q
            r9 = 1
            r8.<init>(r9, r5)
            r9 = 0
            y2.C r11 = r11.v(r9, r7, r8)
            y2.D r7 = new y2.D
            r8 = 0
            r7.<init>(r8, r11)
            r5.x(r7)
            java.lang.Object r11 = r5.s()
        Lab:
            if (r11 != r1) goto Lae
            return r1
        Lae:
            r0.f6871g = r6
            r0.f6873j = r4
            r2.getClass()
            z.o r11 = new z.o
            r11.<init>(r2, r6)
            java.lang.Object r11 = y2.AbstractC0688v.b(r11, r0)
            if (r11 != r1) goto Lc1
            goto Lc2
        Lc1:
            r11 = r3
        Lc2:
            if (r11 != r1) goto Lc5
            return r1
        Lc5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C0713p.a(i2.c):java.lang.Object");
    }

    public final void b() {
        Object Z2;
        this.f6889k.setValue(Boolean.TRUE);
        C0174m c0174m = C0174m.f3840a;
        do {
            C0678k c0678k = this.f6887i;
            Z2 = c0678k.Z(c0678k.M(), c0174m);
            if (Z2 == AbstractC0688v.f6822d || Z2 == AbstractC0688v.f6823e) {
                return;
            }
        } while (Z2 == AbstractC0688v.f6824f);
    }
}
