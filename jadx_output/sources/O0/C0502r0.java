package o0;

import W.C0086i;
import a.AbstractC0090a;
import android.graphics.Outline;
import android.os.Build;

/* renamed from: o0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502r0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5644a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f5645b;

    /* renamed from: c, reason: collision with root package name */
    public W.B f5646c;

    /* renamed from: d, reason: collision with root package name */
    public C0086i f5647d;

    /* renamed from: e, reason: collision with root package name */
    public W.C f5648e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5649f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5650g;
    public W.C h;

    /* renamed from: i, reason: collision with root package name */
    public V.e f5651i;

    /* renamed from: j, reason: collision with root package name */
    public float f5652j;

    /* renamed from: k, reason: collision with root package name */
    public long f5653k;

    /* renamed from: l, reason: collision with root package name */
    public long f5654l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5655m;

    public C0502r0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f5645b = outline;
        this.f5653k = 0L;
        this.f5654l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (V.a.b(r5.f2454e) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(W.o r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r20.d()
            W.C r2 = r0.f5648e
            r3 = 1
            if (r2 == 0) goto L11
            r1.j(r2, r3)
            goto Lf2
        L11:
            float r2 = r0.f5652j
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lc6
            W.C r4 = r0.h
            V.e r5 = r0.f5651i
            if (r4 == 0) goto L68
            long r6 = r0.f5653k
            long r8 = r0.f5654l
            if (r5 == 0) goto L68
            boolean r10 = r2.a.K(r5)
            if (r10 != 0) goto L2b
            goto L68
        L2b:
            float r10 = V.c.b(r6)
            float r11 = r5.f2450a
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = V.c.c(r6)
            float r11 = r5.f2451b
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = V.c.b(r6)
            float r11 = V.f.d(r8)
            float r11 = r11 + r10
            float r10 = r5.f2452c
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L68
            float r6 = V.c.c(r6)
            float r7 = V.f.b(r8)
            float r7 = r7 + r6
            float r6 = r5.f2453d
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L68
            long r5 = r5.f2454e
            float r5 = V.a.b(r5)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lc2
        L68:
            long r5 = r0.f5653k
            float r8 = V.c.b(r5)
            long r5 = r0.f5653k
            float r9 = V.c.c(r5)
            long r5 = r0.f5653k
            float r2 = V.c.b(r5)
            long r5 = r0.f5654l
            float r5 = V.f.d(r5)
            float r10 = r5 + r2
            long r5 = r0.f5653k
            float r2 = V.c.c(r5)
            long r5 = r0.f5654l
            float r5 = V.f.b(r5)
            float r11 = r5 + r2
            float r2 = r0.f5652j
            long r5 = r2.a.a(r2, r2)
            float r2 = V.a.b(r5)
            float r5 = V.a.c(r5)
            long r18 = r2.a.a(r2, r5)
            V.e r2 = new V.e
            r7 = r2
            r12 = r18
            r14 = r18
            r16 = r18
            r7.<init>(r8, r9, r10, r11, r12, r14, r16, r18)
            if (r4 != 0) goto Lb5
            W.i r4 = W.D.f()
            goto Lbb
        Lb5:
            r5 = r4
            W.i r5 = (W.C0086i) r5
            r5.b()
        Lbb:
            W.C.a(r4, r2)
            r0.f5651i = r2
            r0.h = r4
        Lc2:
            r1.j(r4, r3)
            goto Lf2
        Lc6:
            long r2 = r0.f5653k
            float r2 = V.c.b(r2)
            long r3 = r0.f5653k
            float r3 = V.c.c(r3)
            long r4 = r0.f5653k
            float r4 = V.c.b(r4)
            long r5 = r0.f5654l
            float r5 = V.f.d(r5)
            float r4 = r4 + r5
            long r5 = r0.f5653k
            float r5 = V.c.c(r5)
            long r6 = r0.f5654l
            float r6 = V.f.b(r6)
            float r5 = r5 + r6
            r6 = 1
            r1 = r21
            r1.n(r2, r3, r4, r5, r6)
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0502r0.a(W.o):void");
    }

    public final Outline b() {
        d();
        if (this.f5655m && this.f5644a) {
            return this.f5645b;
        }
        return null;
    }

    public final boolean c(W.B b3, float f3, boolean z3, float f4, long j3) {
        this.f5645b.setAlpha(f3);
        boolean a3 = p2.g.a(this.f5646c, b3);
        boolean z4 = !a3;
        if (!a3) {
            this.f5646c = b3;
            this.f5649f = true;
        }
        this.f5654l = j3;
        boolean z5 = b3 != null && (z3 || f4 > 0.0f);
        if (this.f5655m != z5) {
            this.f5655m = z5;
            this.f5649f = true;
        }
        return z4;
    }

    public final void d() {
        if (this.f5649f) {
            this.f5653k = 0L;
            this.f5652j = 0.0f;
            this.f5648e = null;
            this.f5649f = false;
            this.f5650g = false;
            W.B b3 = this.f5646c;
            Outline outline = this.f5645b;
            if (b3 == null || !this.f5655m || V.f.d(this.f5654l) <= 0.0f || V.f.b(this.f5654l) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f5644a = true;
            if (b3 instanceof W.z) {
                V.d dVar = ((W.z) b3).f2572a;
                float f3 = dVar.f2446a;
                float f4 = dVar.f2447b;
                this.f5653k = r2.a.f(f3, f4);
                this.f5654l = AbstractC0090a.d(dVar.c(), dVar.b());
                outline.setRect(Math.round(f3), Math.round(f4), Math.round(dVar.f2448c), Math.round(dVar.f2449d));
                return;
            }
            if (!(b3 instanceof W.A)) {
                if (b3 instanceof W.y) {
                    e(((W.y) b3).f2571a);
                    return;
                }
                return;
            }
            V.e eVar = ((W.A) b3).f2482a;
            float b4 = V.a.b(eVar.f2454e);
            float f5 = eVar.f2450a;
            float f6 = eVar.f2451b;
            this.f5653k = r2.a.f(f5, f6);
            this.f5654l = AbstractC0090a.d(eVar.b(), eVar.a());
            if (r2.a.K(eVar)) {
                this.f5645b.setRoundRect(Math.round(f5), Math.round(f6), Math.round(eVar.f2452c), Math.round(eVar.f2453d), b4);
                this.f5652j = b4;
                return;
            }
            C0086i c0086i = this.f5647d;
            if (c0086i == null) {
                c0086i = W.D.f();
                this.f5647d = c0086i;
            }
            c0086i.b();
            W.C.a(c0086i, eVar);
            e(c0086i);
        }
    }

    public final void e(W.C c3) {
        int i3 = Build.VERSION.SDK_INT;
        Outline outline = this.f5645b;
        if (i3 <= 28 && !((C0086i) c3).f2545a.isConvex()) {
            this.f5644a = false;
            outline.setEmpty();
            this.f5650g = true;
        } else {
            if (!(c3 instanceof C0086i)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C0086i) c3).f2545a);
            this.f5650g = !outline.canClip();
        }
        this.f5648e = c3;
    }
}
