package Z;

import W.A;
import W.B;
import W.C0084g;
import W.C0086i;
import W.y;
import W.z;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import n.AbstractC0378E;
import n.C0375B;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f f2792a;

    /* renamed from: e, reason: collision with root package name */
    public Outline f2796e;

    /* renamed from: i, reason: collision with root package name */
    public float f2799i;

    /* renamed from: j, reason: collision with root package name */
    public B f2800j;

    /* renamed from: k, reason: collision with root package name */
    public C0086i f2801k;

    /* renamed from: l, reason: collision with root package name */
    public C0086i f2802l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2803m;

    /* renamed from: n, reason: collision with root package name */
    public C0084g f2804n;

    /* renamed from: o, reason: collision with root package name */
    public int f2805o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2807q;

    /* renamed from: r, reason: collision with root package name */
    public long f2808r;

    /* renamed from: s, reason: collision with root package name */
    public long f2809s;

    /* renamed from: t, reason: collision with root package name */
    public long f2810t;

    /* renamed from: b, reason: collision with root package name */
    public G0.b f2793b = Y.c.f2773a;

    /* renamed from: c, reason: collision with root package name */
    public G0.f f2794c = G0.f.f1258d;

    /* renamed from: d, reason: collision with root package name */
    public p2.h f2795d = c.f2789f;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2797f = true;

    /* renamed from: g, reason: collision with root package name */
    public long f2798g = 0;
    public long h = 9205357640488583168L;

    /* renamed from: p, reason: collision with root package name */
    public final a f2806p = new a();

    public d(f fVar) {
        this.f2792a = fVar;
        fVar.J(false);
        this.f2808r = 0L;
        this.f2809s = 0L;
        this.f2810t = 9205357640488583168L;
    }

    public final void a() {
        if (this.f2797f) {
            f fVar = this.f2792a;
            if (fVar.e() || fVar.B() > 0.0f) {
                C0086i c0086i = this.f2801k;
                if (c0086i != null) {
                    Outline outline = this.f2796e;
                    if (outline == null) {
                        outline = new Outline();
                        this.f2796e = outline;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    Path path = c0086i.f2545a;
                    if (i3 > 28 || path.isConvex()) {
                        if (i3 > 30) {
                            l.f2884a.a(outline, c0086i);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f2803m = !outline.canClip();
                    } else {
                        Outline outline2 = this.f2796e;
                        if (outline2 != null) {
                            outline2.setEmpty();
                        }
                        this.f2803m = true;
                    }
                    this.f2801k = c0086i;
                    outline.setAlpha(fVar.a());
                    fVar.l(outline);
                } else {
                    Outline outline3 = this.f2796e;
                    if (outline3 == null) {
                        outline3 = new Outline();
                        this.f2796e = outline3;
                    }
                    long c02 = r2.a.c0(this.f2809s);
                    long j3 = this.f2798g;
                    long j4 = this.h;
                    if (j4 != 9205357640488583168L) {
                        c02 = j4;
                    }
                    outline3.setRoundRect(Math.round(V.c.b(j3)), Math.round(V.c.c(j3)), Math.round(V.f.d(c02) + V.c.b(j3)), Math.round(V.f.b(c02) + V.c.c(j3)), this.f2799i);
                    outline3.setAlpha(fVar.a());
                    fVar.l(outline3);
                }
            } else {
                fVar.l(null);
            }
        }
        this.f2797f = false;
    }

    public final void b() {
        if (this.f2807q && this.f2805o == 0) {
            a aVar = this.f2806p;
            d dVar = (d) aVar.f2785b;
            if (dVar != null) {
                dVar.d();
                aVar.f2785b = null;
            }
            C0375B c0375b = (C0375B) aVar.f2787d;
            if (c0375b != null) {
                Object[] objArr = c0375b.f4961b;
                long[] jArr = c0375b.f4960a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j3) < 128) {
                                    ((d) objArr[(i3 << 3) + i5]).d();
                                }
                                j3 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                c0375b.b();
            }
            this.f2792a.o();
        }
    }

    public final B c() {
        B zVar;
        B b3 = this.f2800j;
        C0086i c0086i = this.f2801k;
        if (b3 != null) {
            return b3;
        }
        if (c0086i != null) {
            y yVar = new y(c0086i);
            this.f2800j = yVar;
            return yVar;
        }
        long c02 = r2.a.c0(this.f2809s);
        long j3 = this.f2798g;
        long j4 = this.h;
        if (j4 != 9205357640488583168L) {
            c02 = j4;
        }
        float b4 = V.c.b(j3);
        float c3 = V.c.c(j3);
        float d3 = V.f.d(c02) + b4;
        float b5 = V.f.b(c02) + c3;
        float f3 = this.f2799i;
        if (f3 > 0.0f) {
            long a3 = r2.a.a(f3, f3);
            long a4 = r2.a.a(V.a.b(a3), V.a.c(a3));
            zVar = new A(new V.e(b4, c3, d3, b5, a4, a4, a4, a4));
        } else {
            zVar = new z(new V.d(b4, c3, d3, b5));
        }
        this.f2800j = zVar;
        return zVar;
    }

    public final void d() {
        this.f2805o--;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [o2.c, p2.h] */
    public final void e() {
        a aVar = this.f2806p;
        aVar.f2786c = (d) aVar.f2785b;
        C0375B c0375b = (C0375B) aVar.f2787d;
        if (c0375b != null && c0375b.h()) {
            C0375B c0375b2 = (C0375B) aVar.f2788e;
            if (c0375b2 == null) {
                int i3 = AbstractC0378E.f4967a;
                c0375b2 = new C0375B();
                aVar.f2788e = c0375b2;
            }
            c0375b2.i(c0375b);
            c0375b.b();
        }
        aVar.f2784a = true;
        this.f2792a.y(this.f2793b, this.f2794c, this, this.f2795d);
        aVar.f2784a = false;
        d dVar = (d) aVar.f2786c;
        if (dVar != null) {
            dVar.d();
        }
        C0375B c0375b3 = (C0375B) aVar.f2788e;
        if (c0375b3 == null || !c0375b3.h()) {
            return;
        }
        Object[] objArr = c0375b3.f4961b;
        long[] jArr = c0375b3.f4960a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j3 = jArr[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            ((d) objArr[(i4 << 3) + i6]).d();
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
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
        c0375b3.b();
    }

    public final void f(long j3, long j4, float f3) {
        if (V.c.a(this.f2798g, j3) && V.f.a(this.h, j4) && this.f2799i == f3 && this.f2801k == null) {
            return;
        }
        this.f2800j = null;
        this.f2801k = null;
        this.f2797f = true;
        this.f2803m = false;
        this.f2798g = j3;
        this.h = j4;
        this.f2799i = f3;
        a();
    }
}
