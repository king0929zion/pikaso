package n;

import c2.C0174m;
import g2.InterfaceC0271d;

/* renamed from: n.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406z extends i2.i implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public J.c f5058f;

    /* renamed from: g, reason: collision with root package name */
    public C0375B f5059g;
    public long[] h;

    /* renamed from: i, reason: collision with root package name */
    public int f5060i;

    /* renamed from: j, reason: collision with root package name */
    public int f5061j;

    /* renamed from: k, reason: collision with root package name */
    public int f5062k;

    /* renamed from: l, reason: collision with root package name */
    public int f5063l;

    /* renamed from: m, reason: collision with root package name */
    public long f5064m;

    /* renamed from: n, reason: collision with root package name */
    public int f5065n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f5066o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0375B f5067p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J.c f5068q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0406z(C0375B c0375b, J.c cVar, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f5067p = c0375b;
        this.f5068q = cVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        C0406z c0406z = new C0406z(this.f5067p, this.f5068q, interfaceC0271d);
        c0406z.f5066o = obj;
        return c0406z;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((C0406z) f((InterfaceC0271d) obj2, (w2.g) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0091). Please report as a decompilation issue!!! */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f5065n
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            int r2 = r0.f5063l
            int r6 = r0.f5062k
            long r7 = r0.f5064m
            int r9 = r0.f5061j
            int r10 = r0.f5060i
            long[] r11 = r0.h
            n.B r12 = r0.f5059g
            J.c r13 = r0.f5058f
            java.lang.Object r14 = r0.f5066o
            w2.g r14 = (w2.g) r14
            Z0.d.U(r22)
            goto L91
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            Z0.d.U(r22)
            java.lang.Object r2 = r0.f5066o
            w2.g r2 = (w2.g) r2
            n.B r6 = r0.f5067p
            long[] r7 = r6.f4960a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La1
            J.c r9 = r0.f5068q
            r10 = r4
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L9c
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r4
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L94
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L91
            int r4 = r9 << 3
            int r4 = r4 + r2
            r13.f1408e = r4
            java.lang.Object[] r5 = r12.f4961b
            r4 = r5[r4]
            r0.f5066o = r14
            r0.f5058f = r13
            r0.f5059g = r12
            r0.h = r11
            r0.f5060i = r10
            r0.f5061j = r9
            r0.f5064m = r7
            r0.f5062k = r6
            r0.f5063l = r2
            r0.f5065n = r3
            r14.b(r4, r0)
            return r1
        L91:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L65
        L94:
            if (r6 != r5) goto La1
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        L9c:
            if (r10 == r8) goto La1
            int r10 = r10 + 1
            goto L42
        La1:
            c2.m r1 = c2.C0174m.f3840a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0406z.l(java.lang.Object):java.lang.Object");
    }
}
