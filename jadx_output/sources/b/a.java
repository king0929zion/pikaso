package B;

import A.O;
import A.s;
import D.C0032d;
import D.C0049l0;
import D.C0052n;
import D.C0053n0;
import D.H;
import W.r;
import v0.C0613B;
import v0.p;
import v0.q;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final q f262a = new q(new p());

    public static final void a(long j3, C0613B c0613b, L.a aVar, C0052n c0052n, int i3) {
        int i4;
        c0052n.O(-716124955);
        if ((i3 & 6) == 0) {
            i4 = (c0052n.e(j3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0052n.f(c0613b) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0052n.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0052n.y()) {
            c0052n.K();
        } else {
            H h = O.f56a;
            C0032d.b(new C0049l0[]{s.f173a.a(new r(j3)), h.a(((C0613B) c0052n.k(h)).c(c0613b))}, aVar, c0052n, ((i4 >> 3) & 112) | 8);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new c(j3, c0613b, aVar, i3);
        }
    }
}
