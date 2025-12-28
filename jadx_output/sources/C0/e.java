package C0;

import W.C0084g;
import W.D;
import W.G;
import android.graphics.Paint;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public C0084g f563a;

    /* renamed from: b, reason: collision with root package name */
    public F0.g f564b;

    /* renamed from: c, reason: collision with root package name */
    public int f565c;

    /* renamed from: d, reason: collision with root package name */
    public G f566d;

    /* renamed from: e, reason: collision with root package name */
    public D f567e;

    /* renamed from: f, reason: collision with root package name */
    public D.D f568f;

    /* renamed from: g, reason: collision with root package name */
    public V.f f569g;
    public Y.c h;

    public final C0084g a() {
        C0084g c0084g = this.f563a;
        if (c0084g != null) {
            return c0084g;
        }
        C0084g c0084g2 = new C0084g(this);
        this.f563a = c0084g2;
        return c0084g2;
    }

    public final void b(int i3) {
        if (D.l(i3, this.f565c)) {
            return;
        }
        a().b(i3);
        this.f565c = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : V.f.a(r1.f2457a, r7)) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(W.D r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f568f = r0
            r5.f567e = r0
            r5.f569g = r0
            r5.setShader(r0)
            goto L74
        Ld:
            boolean r1 = r6 instanceof W.J
            if (r1 == 0) goto L1d
            W.J r6 = (W.J) r6
            long r6 = r6.f2529e
            long r6 = r2.a.P(r6, r9)
            r5.d(r6)
            goto L74
        L1d:
            boolean r1 = r6 instanceof W.n
            if (r1 == 0) goto L74
            W.D r1 = r5.f567e
            boolean r1 = p2.g.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            V.f r1 = r5.f569g
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f2457a
            boolean r1 = V.f.a(r3, r7)
        L36:
            if (r1 != 0) goto L5b
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L5b
            r5.f567e = r6
            V.f r1 = new V.f
            r1.<init>(r7)
            r5.f569g = r1
            A0.c r1 = new A0.c
            r1.<init>(r6, r7)
            B0.a r6 = D.I0.f694a
            D.D r6 = new D.D
            r6.<init>(r1)
            r5.f568f = r6
        L5b:
            W.g r6 = r5.a()
            D.D r7 = r5.f568f
            if (r7 == 0) goto L6a
            java.lang.Object r7 = r7.getValue()
            r0 = r7
            android.graphics.Shader r0 = (android.graphics.Shader) r0
        L6a:
            r6.f2541c = r0
            android.graphics.Paint r6 = r6.f2539a
            r6.setShader(r0)
            C0.j.b(r5, r9)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.e.c(W.D, long, float):void");
    }

    public final void d(long j3) {
        if (j3 != 16) {
            setColor(D.C(j3));
            this.f568f = null;
            this.f567e = null;
            this.f569g = null;
            setShader(null);
        }
    }

    public final void e(Y.c cVar) {
        if (cVar == null || p2.g.a(this.h, cVar)) {
            return;
        }
        this.h = cVar;
        if (cVar.equals(Y.f.f2774b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (cVar instanceof Y.g) {
            a().g(1);
            Y.g gVar = (Y.g) cVar;
            a().f2539a.setStrokeWidth(gVar.f2775b);
            a().f2539a.setStrokeMiter(gVar.f2776c);
            a().f(gVar.f2778e);
            a().e(gVar.f2777d);
            a().f2539a.setPathEffect(null);
        }
    }

    public final void f(G g3) {
        if (g3 == null || p2.g.a(this.f566d, g3)) {
            return;
        }
        this.f566d = g3;
        if (g3.equals(G.f2508d)) {
            clearShadowLayer();
            return;
        }
        G g4 = this.f566d;
        float f3 = g4.f2511c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, V.c.b(g4.f2510b), V.c.c(this.f566d.f2510b), D.C(this.f566d.f2509a));
    }

    public final void g(F0.g gVar) {
        if (gVar == null || p2.g.a(this.f564b, gVar)) {
            return;
        }
        this.f564b = gVar;
        int i3 = gVar.f1184a;
        setUnderlineText((i3 | 1) == i3);
        F0.g gVar2 = this.f564b;
        gVar2.getClass();
        int i4 = gVar2.f1184a;
        setStrikeThruText((i4 | 2) == i4);
    }
}
