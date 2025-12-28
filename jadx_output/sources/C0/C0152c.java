package c0;

import D.C0065y;
import W.C0086i;
import W.J;
import d2.C0248s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152c extends AbstractC0142B {

    /* renamed from: b, reason: collision with root package name */
    public float[] f3716b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3717c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f3718d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f3719e = W.r.f2562f;

    /* renamed from: f, reason: collision with root package name */
    public List f3720f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3721g;
    public C0086i h;

    /* renamed from: i, reason: collision with root package name */
    public p2.h f3722i;

    /* renamed from: j, reason: collision with root package name */
    public final C0065y f3723j;

    /* renamed from: k, reason: collision with root package name */
    public String f3724k;

    /* renamed from: l, reason: collision with root package name */
    public float f3725l;

    /* renamed from: m, reason: collision with root package name */
    public float f3726m;

    /* renamed from: n, reason: collision with root package name */
    public float f3727n;

    /* renamed from: o, reason: collision with root package name */
    public float f3728o;

    /* renamed from: p, reason: collision with root package name */
    public float f3729p;

    /* renamed from: q, reason: collision with root package name */
    public float f3730q;

    /* renamed from: r, reason: collision with root package name */
    public float f3731r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3732s;

    public C0152c() {
        int i3 = AbstractC0146F.f3689a;
        this.f3720f = C0248s.f4255d;
        this.f3721g = true;
        this.f3723j = new C0065y(9, this);
        this.f3724k = "";
        this.f3728o = 1.0f;
        this.f3729p = 1.0f;
        this.f3732s = true;
    }

    @Override // c0.AbstractC0142B
    public final void a(Y.d dVar) {
        if (this.f3732s) {
            float[] fArr = this.f3716b;
            if (fArr == null) {
                fArr = W.D.j();
                this.f3716b = fArr;
            } else {
                W.D.v(fArr);
            }
            W.D.F(fArr, this.f3730q + this.f3726m, this.f3731r + this.f3727n);
            W.D.w(fArr, this.f3725l);
            W.D.x(fArr, this.f3728o, this.f3729p, 1.0f);
            W.D.F(fArr, -this.f3726m, -this.f3727n);
            this.f3732s = false;
        }
        if (this.f3721g) {
            if (!this.f3720f.isEmpty()) {
                C0086i c0086i = this.h;
                if (c0086i == null) {
                    c0086i = W.D.f();
                    this.h = c0086i;
                }
                AbstractC0151b.c(this.f3720f, c0086i);
            }
            this.f3721g = false;
        }
        B0.a H2 = dVar.H();
        long r3 = H2.r();
        H2.j().d();
        try {
            A.t tVar = (A.t) H2.f271b;
            float[] fArr2 = this.f3716b;
            B0.a aVar = (B0.a) tVar.f175e;
            if (fArr2 != null) {
                aVar.j().k(fArr2);
            }
            C0086i c0086i2 = this.h;
            if (!this.f3720f.isEmpty() && c0086i2 != null) {
                aVar.j().j(c0086i2, 1);
            }
            ArrayList arrayList = this.f3717c;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0142B) arrayList.get(i3)).a(dVar);
            }
        } finally {
            H2.j().a();
            H2.J(r3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o2.c, p2.h] */
    @Override // c0.AbstractC0142B
    public final o2.c b() {
        return this.f3722i;
    }

    @Override // c0.AbstractC0142B
    public final void d(C0065y c0065y) {
        this.f3722i = c0065y;
    }

    public final void e(int i3, AbstractC0142B abstractC0142B) {
        ArrayList arrayList = this.f3717c;
        if (i3 < arrayList.size()) {
            arrayList.set(i3, abstractC0142B);
        } else {
            arrayList.add(abstractC0142B);
        }
        g(abstractC0142B);
        abstractC0142B.d(this.f3723j);
        c();
    }

    public final void f(long j3) {
        if (this.f3718d && j3 != 16) {
            long j4 = this.f3719e;
            if (j4 == 16) {
                this.f3719e = j3;
                return;
            }
            int i3 = AbstractC0146F.f3689a;
            if (W.r.h(j4) == W.r.h(j3) && W.r.g(j4) == W.r.g(j3) && W.r.e(j4) == W.r.e(j3)) {
                return;
            }
            this.f3718d = false;
            this.f3719e = W.r.f2562f;
        }
    }

    public final void g(AbstractC0142B abstractC0142B) {
        if (!(abstractC0142B instanceof C0156g)) {
            if (abstractC0142B instanceof C0152c) {
                C0152c c0152c = (C0152c) abstractC0142B;
                if (c0152c.f3718d && this.f3718d) {
                    f(c0152c.f3719e);
                    return;
                } else {
                    this.f3718d = false;
                    this.f3719e = W.r.f2562f;
                    return;
                }
            }
            return;
        }
        C0156g c0156g = (C0156g) abstractC0142B;
        W.D d3 = c0156g.f3756b;
        if (this.f3718d && d3 != null) {
            if (d3 instanceof J) {
                f(((J) d3).f2529e);
            } else {
                this.f3718d = false;
                this.f3719e = W.r.f2562f;
            }
        }
        W.D d4 = c0156g.f3761g;
        if (this.f3718d && d4 != null) {
            if (d4 instanceof J) {
                f(((J) d4).f2529e);
            } else {
                this.f3718d = false;
                this.f3719e = W.r.f2562f;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f3724k);
        ArrayList arrayList = this.f3717c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0142B abstractC0142B = (AbstractC0142B) arrayList.get(i3);
            sb.append("\t");
            sb.append(abstractC0142B.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
