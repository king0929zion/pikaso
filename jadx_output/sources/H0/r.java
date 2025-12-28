package h0;

import java.util.ArrayList;
import n0.AbstractC0409C;
import n0.j0;
import y2.AbstractC0688v;
import y2.C0673f;
import y2.h0;

/* loaded from: classes.dex */
public final class r extends P.k implements G0.b, j0 {

    /* renamed from: q, reason: collision with root package name */
    public Object f4397q;

    /* renamed from: r, reason: collision with root package name */
    public Object f4398r;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f4399s;

    /* renamed from: t, reason: collision with root package name */
    public i2.j f4400t;

    /* renamed from: u, reason: collision with root package name */
    public h0 f4401u;

    /* renamed from: y, reason: collision with root package name */
    public f f4405y;

    /* renamed from: v, reason: collision with root package name */
    public f f4402v = o.f4390a;

    /* renamed from: w, reason: collision with root package name */
    public final F.d f4403w = new F.d(new p[16]);

    /* renamed from: x, reason: collision with root package name */
    public final F.d f4404x = new F.d(new p[16]);

    /* renamed from: z, reason: collision with root package name */
    public long f4406z = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public r(Object obj, Object obj2, Object[] objArr, o2.e eVar) {
        this.f4397q = obj;
        this.f4398r = obj2;
        this.f4399s = objArr;
        this.f4400t = (i2.j) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // n0.j0
    public final void B() {
        f fVar = this.f4405y;
        if (fVar == null) {
            return;
        }
        ?? r12 = fVar.f4356a;
        int size = r12.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((k) r12.get(i3)).f4367d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    k kVar = (k) r12.get(i4);
                    long j3 = kVar.f4364a;
                    boolean z3 = kVar.f4367d;
                    long j4 = kVar.f4365b;
                    long j5 = kVar.f4366c;
                    arrayList.add(new k(j3, j4, j5, false, kVar.f4368e, j4, j5, z3, z3, 1, 0L));
                }
                f fVar2 = new f(arrayList, null);
                this.f4402v = fVar2;
                f0(fVar2, g.f4358d);
                f0(fVar2, g.f4359e);
                f0(fVar2, g.f4360f);
                this.f4405y = null;
                return;
            }
        }
    }

    @Override // P.k
    public final void Z() {
        g0();
    }

    @Override // n0.j0
    public final void c() {
        g0();
    }

    @Override // G0.b
    public final float f() {
        return AbstractC0409C.q(this).f5314s.f();
    }

    public final void f0(f fVar, g gVar) {
        C0673f c0673f;
        C0673f c0673f2;
        synchronized (this.f4403w) {
            F.d dVar = this.f4404x;
            dVar.c(dVar.f1160f, this.f4403w);
        }
        try {
            int ordinal = gVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    F.d dVar2 = this.f4404x;
                    int i3 = dVar2.f1160f;
                    if (i3 > 0) {
                        int i4 = i3 - 1;
                        Object[] objArr = dVar2.f1158d;
                        do {
                            p pVar = (p) objArr[i4];
                            if (gVar == pVar.f4395g && (c0673f2 = pVar.f4394f) != null) {
                                pVar.f4394f = null;
                                c0673f2.t(fVar);
                            }
                            i4--;
                        } while (i4 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            F.d dVar3 = this.f4404x;
            int i5 = dVar3.f1160f;
            if (i5 > 0) {
                Object[] objArr2 = dVar3.f1158d;
                int i6 = 0;
                do {
                    p pVar2 = (p) objArr2[i6];
                    if (gVar == pVar2.f4395g && (c0673f = pVar2.f4394f) != null) {
                        pVar2.f4394f = null;
                        c0673f.t(fVar);
                    }
                    i6++;
                } while (i6 < i5);
            }
        } finally {
            this.f4404x.g();
        }
    }

    public final void g0() {
        h0 h0Var = this.f4401u;
        if (h0Var != null) {
            h0Var.B(new C2.o("Pointer input was reset", 3));
            this.f4401u = null;
        }
    }

    @Override // G0.b
    public final float n() {
        return AbstractC0409C.q(this).f5314s.n();
    }

    @Override // n0.j0
    public final void t() {
        g0();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // n0.j0
    public final void y(f fVar, g gVar, long j3) {
        this.f4406z = j3;
        if (gVar == g.f4358d) {
            this.f4402v = fVar;
        }
        if (this.f4401u == null) {
            this.f4401u = AbstractC0688v.l(U(), null, 4, new q(this, null), 1);
        }
        f0(fVar, gVar);
        ?? r5 = fVar.f4356a;
        int size = r5.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                fVar = null;
                break;
            } else if (!Z0.d.n((k) r5.get(i3))) {
                break;
            } else {
                i3++;
            }
        }
        this.f4405y = fVar;
    }
}
