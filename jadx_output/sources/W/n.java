package W;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class n extends D {

    /* renamed from: e, reason: collision with root package name */
    public Shader f2553e;

    /* renamed from: f, reason: collision with root package name */
    public long f2554f = 9205357640488583168L;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Shader f2555g;

    public n(Shader shader) {
        this.f2555g = shader;
    }

    @Override // W.D
    public final void h(float f3, long j3, C0084g c0084g) {
        Shader shader = this.f2553e;
        if (shader == null || !V.f.a(this.f2554f, j3)) {
            if (V.f.e(j3)) {
                shader = null;
                this.f2553e = null;
                this.f2554f = 9205357640488583168L;
            } else {
                shader = this.f2555g;
                this.f2553e = shader;
                this.f2554f = j3;
            }
        }
        long b3 = D.b(c0084g.f2539a.getColor());
        long j4 = r.f2558b;
        if (!r.c(b3, j4)) {
            c0084g.c(j4);
        }
        if (!p2.g.a(c0084g.f2541c, shader)) {
            c0084g.f2541c = shader;
            c0084g.f2539a.setShader(shader);
        }
        if (c0084g.f2539a.getAlpha() / 255.0f == f3) {
            return;
        }
        c0084g.a(f3);
    }
}
