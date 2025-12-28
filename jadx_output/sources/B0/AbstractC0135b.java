package b0;

import A.t;
import G0.f;
import W.C0084g;
import W.C0089l;
import n0.C0408B;
import p2.g;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0135b {

    /* renamed from: a, reason: collision with root package name */
    public C0084g f3638a;

    /* renamed from: b, reason: collision with root package name */
    public C0089l f3639b;

    /* renamed from: c, reason: collision with root package name */
    public float f3640c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public f f3641d = f.f1258d;

    public abstract void a(float f3);

    public abstract void b(C0089l c0089l);

    public final void c(C0408B c0408b, long j3, float f3, C0089l c0089l) {
        if (this.f3640c != f3) {
            a(f3);
            this.f3640c = f3;
        }
        if (!g.a(this.f3639b, c0089l)) {
            b(c0089l);
            this.f3639b = c0089l;
        }
        f layoutDirection = c0408b.getLayoutDirection();
        if (this.f3641d != layoutDirection) {
            this.f3641d = layoutDirection;
        }
        Y.b bVar = c0408b.f5076d;
        float d3 = V.f.d(bVar.L()) - V.f.d(j3);
        float b3 = V.f.b(bVar.L()) - V.f.b(j3);
        ((t) bVar.f2770e.f271b).y(0.0f, 0.0f, d3, b3);
        if (f3 > 0.0f) {
            try {
                if (V.f.d(j3) > 0.0f && V.f.b(j3) > 0.0f) {
                    e(c0408b);
                }
            } finally {
                ((t) bVar.f2770e.f271b).y(-0.0f, -0.0f, -d3, -b3);
            }
        }
    }

    public abstract long d();

    public abstract void e(C0408B c0408b);
}
