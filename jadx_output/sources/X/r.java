package X;

import W.D;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final d f2641r = new d(2);

    /* renamed from: d, reason: collision with root package name */
    public final t f2642d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2643e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2644f;

    /* renamed from: g, reason: collision with root package name */
    public final s f2645g;
    public final float[] h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f2646i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f2647j;

    /* renamed from: k, reason: collision with root package name */
    public final j f2648k;

    /* renamed from: l, reason: collision with root package name */
    public final q f2649l;

    /* renamed from: m, reason: collision with root package name */
    public final n f2650m;

    /* renamed from: n, reason: collision with root package name */
    public final j f2651n;

    /* renamed from: o, reason: collision with root package name */
    public final q f2652o;

    /* renamed from: p, reason: collision with root package name */
    public final n f2653p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2654q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0226, code lost:
    
        if (X.k.f(r3[4] - r3[0], r3[5] - r3[1], r9[4], r9[5]) >= 0.0f) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(java.lang.String r33, float[] r34, X.t r35, float[] r36, X.j r37, X.j r38, float r39, float r40, X.s r41, int r42) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.r.<init>(java.lang.String, float[], X.t, float[], X.j, X.j, float, float, X.s, int):void");
    }

    @Override // X.c
    public final float a(int i3) {
        return this.f2644f;
    }

    @Override // X.c
    public final float b(int i3) {
        return this.f2643e;
    }

    @Override // X.c
    public final boolean c() {
        return this.f2654q;
    }

    @Override // X.c
    public final long d(float f3, float f4, float f5) {
        double d3 = f3;
        n nVar = this.f2653p;
        float b3 = (float) nVar.b(d3);
        float b4 = (float) nVar.b(f4);
        float b5 = (float) nVar.b(f5);
        float[] fArr = this.f2646i;
        float f6 = (fArr[6] * b5) + (fArr[3] * b4) + (fArr[0] * b3);
        float f7 = (fArr[7] * b5) + (fArr[4] * b4) + (fArr[1] * b3);
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    @Override // X.c
    public final float e(float f3, float f4, float f5) {
        double d3 = f3;
        n nVar = this.f2653p;
        float b3 = (float) nVar.b(d3);
        float b4 = (float) nVar.b(f4);
        float b5 = (float) nVar.b(f5);
        float[] fArr = this.f2646i;
        return (fArr[8] * b5) + (fArr[5] * b4) + (fArr[2] * b3);
    }

    @Override // X.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        if (Float.compare(rVar.f2643e, this.f2643e) != 0 || Float.compare(rVar.f2644f, this.f2644f) != 0 || !p2.g.a(this.f2642d, rVar.f2642d) || !Arrays.equals(this.h, rVar.h)) {
            return false;
        }
        s sVar = rVar.f2645g;
        s sVar2 = this.f2645g;
        if (sVar2 != null) {
            return p2.g.a(sVar2, sVar);
        }
        if (sVar == null) {
            return true;
        }
        if (p2.g.a(this.f2648k, rVar.f2648k)) {
            return p2.g.a(this.f2651n, rVar.f2651n);
        }
        return false;
    }

    @Override // X.c
    public final long f(float f3, float f4, float f5, float f6, c cVar) {
        float[] fArr = this.f2647j;
        float f7 = (fArr[6] * f5) + (fArr[3] * f4) + (fArr[0] * f3);
        float f8 = (fArr[7] * f5) + (fArr[4] * f4) + (fArr[1] * f3);
        float f9 = (fArr[8] * f5) + (fArr[5] * f4) + (fArr[2] * f3);
        n nVar = this.f2650m;
        return D.a((float) nVar.b(f7), (float) nVar.b(f8), (float) nVar.b(f9), f6, cVar);
    }

    @Override // X.c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.f2642d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f3 = this.f2643e;
        int floatToIntBits = (hashCode + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        float f4 = this.f2644f;
        int floatToIntBits2 = (floatToIntBits + (f4 == 0.0f ? 0 : Float.floatToIntBits(f4))) * 31;
        s sVar = this.f2645g;
        int hashCode2 = floatToIntBits2 + (sVar != null ? sVar.hashCode() : 0);
        if (sVar == null) {
            return this.f2651n.hashCode() + ((this.f2648k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(java.lang.String r12, float[] r13, X.t r14, final X.s r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            double r0 = r9.f2660f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            double r4 = r9.f2661g
            if (r0 != 0) goto L17
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L17
            X.p r1 = new X.p
            r6 = 0
            r1.<init>()
        L15:
            r6 = r1
            goto L1e
        L17:
            X.p r1 = new X.p
            r6 = 1
            r1.<init>()
            goto L15
        L1e:
            if (r0 != 0) goto L2c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L2c
            X.p r0 = new X.p
            r1 = 2
            r0.<init>()
        L2a:
            r7 = r0
            goto L33
        L2c:
            X.p r0 = new X.p
            r1 = 3
            r0.<init>()
            goto L2a
        L33:
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r6
            r6 = r7
            r7 = r10
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.r.<init>(java.lang.String, float[], X.t, X.s, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(java.lang.String r18, float[] r19, X.t r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            X.d r3 = X.r.f2641r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            X.o r4 = new X.o
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            X.o r3 = new X.o
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            X.s r15 = new X.s
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r1 = r21
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.r.<init>(java.lang.String, float[], X.t, double, float, float, int):void");
    }
}
