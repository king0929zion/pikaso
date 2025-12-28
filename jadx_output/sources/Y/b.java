package Y;

import W.C;
import W.C0083f;
import W.C0084g;
import W.C0089l;
import W.D;
import W.r;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: d, reason: collision with root package name */
    public final a f2769d;

    /* renamed from: e, reason: collision with root package name */
    public final B0.a f2770e;

    /* renamed from: f, reason: collision with root package name */
    public C0084g f2771f;

    /* renamed from: g, reason: collision with root package name */
    public C0084g f2772g;

    public b() {
        G0.c cVar = c.f2773a;
        G0.f fVar = G0.f.f1258d;
        e eVar = new e();
        a aVar = new a();
        aVar.f2765a = cVar;
        aVar.f2766b = fVar;
        aVar.f2767c = eVar;
        aVar.f2768d = 0L;
        this.f2769d = aVar;
        this.f2770e = new B0.a(this);
    }

    public static C0084g a(b bVar, long j3, c cVar, float f3, C0089l c0089l, int i3) {
        C0084g d3 = bVar.d(cVar);
        if (f3 != 1.0f) {
            j3 = r.b(j3, r.d(j3) * f3);
        }
        if (!r.c(D.b(d3.f2539a.getColor()), j3)) {
            d3.c(j3);
        }
        if (d3.f2541c != null) {
            d3.f2541c = null;
            d3.f2539a.setShader(null);
        }
        if (!p2.g.a(d3.f2542d, c0089l)) {
            d3.d(c0089l);
        }
        if (!D.l(d3.f2540b, i3)) {
            d3.b(i3);
        }
        if (!D.n(d3.f2539a.isFilterBitmap() ? 1 : 0, 1)) {
            d3.f2539a.setFilterBitmap(!D.n(1, 0));
        }
        return d3;
    }

    @Override // Y.d
    public final void E(C0083f c0083f, long j3, long j4, long j5, long j6, float f3, c cVar, C0089l c0089l, int i3, int i4) {
        this.f2769d.f2767c.l(c0083f, j3, j4, j5, j6, c(null, cVar, f3, c0089l, i3, i4));
    }

    @Override // Y.d
    public final B0.a H() {
        return this.f2770e;
    }

    public final C0084g c(D d3, c cVar, float f3, C0089l c0089l, int i3, int i4) {
        C0084g d4 = d(cVar);
        if (d3 != null) {
            d3.h(f3, L(), d4);
        } else {
            if (d4.f2541c != null) {
                d4.f2541c = null;
                d4.f2539a.setShader(null);
            }
            long b3 = D.b(d4.f2539a.getColor());
            long j3 = r.f2558b;
            if (!r.c(b3, j3)) {
                d4.c(j3);
            }
            if (d4.f2539a.getAlpha() / 255.0f != f3) {
                d4.a(f3);
            }
        }
        if (!p2.g.a(d4.f2542d, c0089l)) {
            d4.d(c0089l);
        }
        if (!D.l(d4.f2540b, i3)) {
            d4.b(i3);
        }
        if (!D.n(d4.f2539a.isFilterBitmap() ? 1 : 0, i4)) {
            d4.f2539a.setFilterBitmap(!D.n(i4, 0));
        }
        return d4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W.C0084g d(Y.c r10) {
        /*
            r9 = this;
            Y.f r0 = Y.f.f2774b
            boolean r0 = p2.g.a(r10, r0)
            r1 = 0
            if (r0 == 0) goto L18
            W.g r10 = r9.f2771f
            if (r10 != 0) goto La8
            W.g r10 = W.D.e()
            r10.g(r1)
            r9.f2771f = r10
            goto La8
        L18:
            boolean r0 = r10 instanceof Y.g
            if (r0 == 0) goto La9
            W.g r0 = r9.f2772g
            r2 = 1
            if (r0 != 0) goto L2a
            W.g r0 = W.D.e()
            r0.g(r2)
            r9.f2772g = r0
        L2a:
            android.graphics.Paint r3 = r0.f2539a
            float r4 = r3.getStrokeWidth()
            Y.g r10 = (Y.g) r10
            float r5 = r10.f2775b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L39
            goto L3e
        L39:
            android.graphics.Paint r4 = r0.f2539a
            r4.setStrokeWidth(r5)
        L3e:
            android.graphics.Paint$Cap r4 = r3.getStrokeCap()
            r5 = -1
            if (r4 != 0) goto L47
            r4 = r5
            goto L4f
        L47:
            int[] r6 = W.AbstractC0085h.f2543a
            int r4 = r4.ordinal()
            r4 = r6[r4]
        L4f:
            r6 = 3
            r7 = 2
            if (r4 == r2) goto L57
            if (r4 == r7) goto L5b
            if (r4 == r6) goto L59
        L57:
            r4 = r1
            goto L5c
        L59:
            r4 = r7
            goto L5c
        L5b:
            r4 = r2
        L5c:
            int r8 = r10.f2777d
            boolean r4 = W.D.p(r4, r8)
            if (r4 != 0) goto L67
            r0.e(r8)
        L67:
            float r4 = r3.getStrokeMiter()
            float r8 = r10.f2776c
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L72
            goto L77
        L72:
            android.graphics.Paint r4 = r0.f2539a
            r4.setStrokeMiter(r8)
        L77:
            android.graphics.Paint$Join r3 = r3.getStrokeJoin()
            if (r3 != 0) goto L7e
            goto L86
        L7e:
            int[] r4 = W.AbstractC0085h.f2544b
            int r3 = r3.ordinal()
            r5 = r4[r3]
        L86:
            if (r5 == r2) goto L90
            if (r5 == r7) goto L8f
            if (r5 == r6) goto L8d
            goto L90
        L8d:
            r1 = r2
            goto L90
        L8f:
            r1 = r7
        L90:
            int r10 = r10.f2778e
            boolean r1 = W.D.q(r1, r10)
            if (r1 != 0) goto L9b
            r0.f(r10)
        L9b:
            r10 = 0
            boolean r1 = p2.g.a(r10, r10)
            if (r1 != 0) goto La7
            android.graphics.Paint r1 = r0.f2539a
            r1.setPathEffect(r10)
        La7:
            r10 = r0
        La8:
            return r10
        La9:
            B1.c r10 = new B1.c
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.b.d(Y.c):W.g");
    }

    @Override // G0.b
    public final float f() {
        return this.f2769d.f2765a.f();
    }

    @Override // Y.d
    public final G0.f getLayoutDirection() {
        return this.f2769d.f2766b;
    }

    @Override // Y.d
    public final void m(C c3, D d3, float f3, c cVar, C0089l c0089l, int i3) {
        this.f2769d.f2767c.h(c3, c(d3, cVar, f3, c0089l, i3, 1));
    }

    @Override // G0.b
    public final float n() {
        return this.f2769d.f2765a.n();
    }

    @Override // Y.d
    public final void x(long j3, long j4, long j5, float f3, c cVar, C0089l c0089l, int i3) {
        this.f2769d.f2767c.p(V.c.b(j4), V.c.c(j4), V.f.d(j5) + V.c.b(j4), V.f.b(j5) + V.c.c(j4), a(this, j3, cVar, f3, c0089l, i3));
    }
}
