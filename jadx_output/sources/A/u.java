package A;

import c2.C0174m;
import n0.AbstractC0409C;
import p.C0528G;
import z.AbstractC0693A;
import z.C0699b;
import z.C0701d;
import z.C0705h;

/* loaded from: classes.dex */
public final class u extends p2.h implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f177f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, int i3) {
        super(0);
        this.f176e = i3;
        this.f177f = vVar;
    }

    @Override // o2.a
    public final Object c() {
        C0705h c0705h;
        int i3 = 0;
        v vVar = this.f177f;
        switch (this.f176e) {
            case 0:
                B b3 = (B) AbstractC0409C.h(vVar, D.f4b);
                return (b3 == null || (c0705h = b3.f1b) == null) ? C.f2a : c0705h;
            default:
                if (((B) AbstractC0409C.h(vVar, D.f4b)) == null) {
                    z.w wVar = vVar.f182w;
                    if (wVar != null) {
                        vVar.g0(wVar);
                    }
                } else if (vVar.f182w == null) {
                    t tVar = new t(i3, vVar);
                    u uVar = new u(vVar, i3);
                    C0528G c0528g = z.u.f6901a;
                    boolean z3 = AbstractC0693A.f6831a;
                    s.g gVar = vVar.f178s;
                    boolean z4 = vVar.f179t;
                    float f3 = vVar.f180u;
                    z.w c0701d = z3 ? new C0701d(gVar, z4, f3, tVar, uVar) : new C0699b(gVar, z4, f3, tVar, uVar);
                    vVar.f0(c0701d);
                    vVar.f182w = c0701d;
                }
                return C0174m.f3840a;
        }
    }
}
