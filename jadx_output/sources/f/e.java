package F;

import c2.C0174m;
import g2.InterfaceC0271d;
import i2.i;
import w2.g;

/* loaded from: classes.dex */
public final class e extends i implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public Object[] f1161f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f1162g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f1163i;

    /* renamed from: j, reason: collision with root package name */
    public int f1164j;

    /* renamed from: k, reason: collision with root package name */
    public int f1165k;

    /* renamed from: l, reason: collision with root package name */
    public long f1166l;

    /* renamed from: m, reason: collision with root package name */
    public int f1167m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f1168n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f1169o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f1169o = fVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        e eVar = new e(this.f1169o, interfaceC0271d);
        eVar.f1168n = obj;
        return eVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((e) f((InterfaceC0271d) obj2, (g) obj)).l(C0174m.f3840a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x0088). Please report as a decompilation issue!!! */
    @Override // i2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f1167m
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            int r2 = r0.f1165k
            int r6 = r0.f1164j
            long r7 = r0.f1166l
            int r9 = r0.f1163i
            int r10 = r0.h
            long[] r11 = r0.f1162g
            java.lang.Object[] r12 = r0.f1161f
            java.lang.Object r13 = r0.f1168n
            w2.g r13 = (w2.g) r13
            Z0.d.U(r21)
            goto L88
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            Z0.d.U(r21)
            java.lang.Object r2 = r0.f1168n
            w2.g r2 = (w2.g) r2
            F.f r6 = r0.f1169o
            n.B r6 = r6.f1170d
            java.lang.Object[] r7 = r6.f4961b
            long[] r6 = r6.f4960a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L96
            r9 = r4
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L91
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r2 >= r6) goto L8b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L88
            int r4 = r9 << 3
            int r4 = r4 + r2
            r4 = r12[r4]
            r0.f1168n = r13
            r0.f1161f = r12
            r0.f1162g = r11
            r0.h = r10
            r0.f1163i = r9
            r0.f1166l = r7
            r0.f1164j = r6
            r0.f1165k = r2
            r0.f1167m = r3
            r13.b(r4, r0)
            return r1
        L88:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L62
        L8b:
            if (r6 != r5) goto L96
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L91:
            if (r9 == r8) goto L96
            int r9 = r9 + 1
            goto L41
        L96:
            c2.m r1 = c2.C0174m.f3840a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F.e.l(java.lang.Object):java.lang.Object");
    }
}
