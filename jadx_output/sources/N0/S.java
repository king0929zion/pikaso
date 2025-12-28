package n0;

import D.C0059s;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public P.k f5185a;

    /* renamed from: b, reason: collision with root package name */
    public int f5186b;

    /* renamed from: c, reason: collision with root package name */
    public F.d f5187c;

    /* renamed from: d, reason: collision with root package name */
    public F.d f5188d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0059s f5190f;

    public S(C0059s c0059s, P.k kVar, int i3, F.d dVar, F.d dVar2, boolean z3) {
        this.f5190f = c0059s;
        this.f5185a = kVar;
        this.f5186b = i3;
        this.f5187c = dVar;
        this.f5188d = dVar2;
        this.f5189e = z3;
    }

    public final boolean a(int i3, int i4) {
        F.d dVar = this.f5187c;
        int i5 = this.f5186b;
        P.j jVar = (P.j) dVar.f1158d[i3 + i5];
        P.j jVar2 = (P.j) this.f5188d.f1158d[i5 + i4];
        T t3 = U.f5191a;
        return p2.g.a(jVar, jVar2) || jVar.getClass() == jVar2.getClass();
    }
}
