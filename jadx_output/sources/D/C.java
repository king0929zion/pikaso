package D;

import c2.C0174m;
import n.C0403w;

/* loaded from: classes.dex */
public final class C extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f656e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f658g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f659i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d3, L.c cVar, C0403w c0403w, int i3) {
        super(1);
        this.f658g = d3;
        this.h = cVar;
        this.f659i = c0403w;
        this.f657f = i3;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f656e) {
            case 0:
                if (obj == ((D) this.f658g)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof N.y) {
                    int i3 = ((L.c) this.h).f1446a - this.f657f;
                    C0403w c0403w = (C0403w) this.f659i;
                    int c3 = c0403w.c(obj);
                    int min = Math.min(i3, c3 >= 0 ? c0403w.f5046c[c3] : Integer.MAX_VALUE);
                    int b3 = c0403w.b(obj);
                    if (b3 < 0) {
                        b3 = ~b3;
                    }
                    c0403w.f5045b[b3] = obj;
                    c0403w.f5046c[b3] = min;
                }
                return C0174m.f3840a;
            default:
                l0.n nVar = (l0.n) obj;
                l0.o[] oVarArr = (l0.o[]) this.f658g;
                int length = oVarArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    l0.o oVar = oVarArr[i4];
                    p2.g.b(oVar);
                    oVar.o();
                    t.t tVar = (t.t) this.h;
                    tVar.getClass();
                    l0.n.d(nVar, oVar, ((int[]) this.f659i)[i5], Math.round((1 + tVar.f6189b.f2079a) * ((this.f657f - oVar.f4928e) / 2.0f)));
                    i4++;
                    i5++;
                }
                return C0174m.f3840a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(l0.o[] oVarArr, t.t tVar, int i3, int[] iArr) {
        super(1);
        this.f658g = oVarArr;
        this.h = tVar;
        this.f657f = i3;
        this.f659i = iArr;
    }
}
