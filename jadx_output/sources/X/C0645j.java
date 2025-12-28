package x;

import A.t;
import W.D;
import W.G;
import W.o;
import W.r;
import a.AbstractC0090a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n0.C0408B;
import n0.InterfaceC0430k;
import n0.InterfaceC0437s;
import n0.l0;
import t0.C0599a;
import t0.n;
import t0.p;
import t0.q;
import v0.AbstractC0619d;
import v0.AbstractC0623h;
import v0.C0613B;
import v0.C0617b;
import v0.C0618c;
import v0.C0624i;
import v0.v;
import v0.y;
import z0.InterfaceC0721e;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645j extends P.k implements InterfaceC0437s, InterfaceC0430k, l0 {

    /* renamed from: A, reason: collision with root package name */
    public t f6622A;

    /* renamed from: B, reason: collision with root package name */
    public o2.c f6623B;

    /* renamed from: C, reason: collision with root package name */
    public Map f6624C;

    /* renamed from: D, reason: collision with root package name */
    public C0641f f6625D;

    /* renamed from: E, reason: collision with root package name */
    public C0644i f6626E;

    /* renamed from: F, reason: collision with root package name */
    public C0643h f6627F;

    /* renamed from: q, reason: collision with root package name */
    public C0618c f6628q;

    /* renamed from: r, reason: collision with root package name */
    public C0613B f6629r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0721e f6630s;

    /* renamed from: t, reason: collision with root package name */
    public o2.c f6631t;

    /* renamed from: u, reason: collision with root package name */
    public int f6632u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6633v;

    /* renamed from: w, reason: collision with root package name */
    public int f6634w;

    /* renamed from: x, reason: collision with root package name */
    public int f6635x;

    /* renamed from: y, reason: collision with root package name */
    public List f6636y;

    /* renamed from: z, reason: collision with root package name */
    public o2.c f6637z;

    @Override // n0.l0
    public final void A(t0.g gVar) {
        C0644i c0644i = this.f6626E;
        if (c0644i == null) {
            c0644i = new C0644i(this, 0);
            this.f6626E = c0644i;
        }
        C0618c c0618c = this.f6628q;
        v2.c[] cVarArr = p.f6284a;
        gVar.b(n.f6275s, Z.b.D(c0618c));
        C0643h c0643h = this.f6627F;
        if (c0643h != null) {
            C0618c c0618c2 = c0643h.f6617b;
            q qVar = n.f6276t;
            v2.c[] cVarArr2 = p.f6284a;
            v2.c cVar = cVarArr2[14];
            qVar.getClass();
            gVar.b(qVar, c0618c2);
            boolean z3 = c0643h.f6618c;
            q qVar2 = n.f6277u;
            v2.c cVar2 = cVarArr2[15];
            Boolean valueOf = Boolean.valueOf(z3);
            qVar2.getClass();
            gVar.b(qVar2, valueOf);
        }
        gVar.b(t0.f.f6213i, new C0599a(null, new C0644i(this, 1)));
        gVar.b(t0.f.f6214j, new C0599a(null, new C0644i(this, 2)));
        gVar.b(t0.f.f6215k, new C0599a(null, new A0.c(19, this)));
        gVar.b(t0.f.f6206a, new C0599a(null, c0644i));
    }

    @Override // n0.InterfaceC0430k
    public final void C(C0408B c0408b) {
        C0641f f02;
        if (this.f2099p) {
            o j3 = c0408b.f5076d.f2770e.j();
            C0643h c0643h = this.f6627F;
            if (c0643h == null || !c0643h.f6618c || (f02 = c0643h.f6619d) == null) {
                f02 = f0();
                f02.a(c0408b);
            } else {
                f02.a(c0408b);
            }
            y yVar = f02.f6600n;
            if (yVar == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            long j4 = yVar.f6474c;
            float f3 = (int) (j4 >> 32);
            C0624i c0624i = yVar.f6473b;
            boolean z3 = ((f3 > c0624i.f6353d ? 1 : (f3 == c0624i.f6353d ? 0 : -1)) < 0 || c0624i.f6352c || (((float) ((int) (j4 & 4294967295L))) > c0624i.f6354e ? 1 : (((float) ((int) (j4 & 4294967295L))) == c0624i.f6354e ? 0 : -1)) < 0) && !AbstractC0090a.z(this.f6632u, 3);
            if (z3) {
                V.d c3 = AbstractC0090a.c(0L, AbstractC0090a.d((int) (j4 >> 32), (int) (j4 & 4294967295L)));
                j3.d();
                o.g(j3, c3);
            }
            try {
                v vVar = this.f6629r.f6319a;
                F0.g gVar = vVar.f6456m;
                if (gVar == null) {
                    gVar = F0.g.f1182b;
                }
                F0.g gVar2 = gVar;
                G g3 = vVar.f6457n;
                if (g3 == null) {
                    g3 = G.f2508d;
                }
                G g4 = g3;
                Y.c cVar = vVar.f6458o;
                if (cVar == null) {
                    cVar = Y.f.f2774b;
                }
                Y.c cVar2 = cVar;
                D c4 = vVar.f6445a.c();
                if (c4 != null) {
                    C0624i.a(c0624i, j3, c4, this.f6629r.f6319a.f6445a.a(), g4, gVar2, cVar2);
                } else {
                    t tVar = this.f6622A;
                    long z4 = tVar != null ? tVar.z() : r.f2562f;
                    if (z4 == 16) {
                        z4 = this.f6629r.b() != 16 ? this.f6629r.b() : r.f2558b;
                    }
                    long j5 = z4;
                    j3.d();
                    ArrayList arrayList = c0624i.h;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        v0.k kVar = (v0.k) arrayList.get(i3);
                        kVar.f6359a.e(j3, j5, g4, gVar2, cVar2, 3);
                        j3.o(0.0f, kVar.f6359a.b());
                        i3++;
                        size = size;
                        arrayList = arrayList;
                    }
                    j3.a();
                }
                if (z3) {
                    j3.a();
                }
                C0643h c0643h2 = this.f6627F;
                if (c0643h2 == null || !c0643h2.f6618c) {
                    C0618c c0618c = this.f6628q;
                    int length = c0618c.f6334d.length();
                    List list = c0618c.f6337g;
                    if (list != null) {
                        int size2 = list.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            C0617b c0617b = (C0617b) list.get(i4);
                            if ((c0617b.f6330a instanceof AbstractC0623h) && AbstractC0619d.b(0, length, c0617b.f6331b, c0617b.f6332c)) {
                                break;
                            }
                        }
                    }
                }
                List list2 = this.f6636y;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                c0408b.a();
            } catch (Throwable th) {
                if (z3) {
                    j3.a();
                }
                throw th;
            }
        }
    }

    @Override // n0.l0
    public final boolean D() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019e  */
    @Override // n0.InterfaceC0437s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M1.j R(n0.AbstractC0418L r23, l0.InterfaceC0360j r24, long r25) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C0645j.R(n0.L, l0.j, long):M1.j");
    }

    public final C0641f f0() {
        if (this.f6625D == null) {
            this.f6625D = new C0641f(this.f6628q, this.f6629r, this.f6630s, this.f6632u, this.f6633v, this.f6634w, this.f6635x, this.f6636y);
        }
        C0641f c0641f = this.f6625D;
        p2.g.b(c0641f);
        return c0641f;
    }
}
