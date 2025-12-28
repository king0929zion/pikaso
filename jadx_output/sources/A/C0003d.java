package A;

import B2.InterfaceC0022f;
import c2.C0174m;
import g2.InterfaceC0271d;
import o0.C0499p0;
import s.C0584b;
import s.C0585c;
import s.C0586d;

/* renamed from: A.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d implements InterfaceC0022f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f78d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79e;

    public /* synthetic */ C0003d(int i3, Object obj) {
        this.f78d = i3;
        this.f79e = obj;
    }

    @Override // B2.InterfaceC0022f
    public final Object b(Object obj, InterfaceC0271d interfaceC0271d) {
        switch (this.f78d) {
            case 0:
                s.f fVar = (s.f) obj;
                boolean z3 = fVar instanceof C0586d;
                N.s sVar = (N.s) this.f79e;
                if (z3) {
                    sVar.add(fVar);
                } else if (fVar instanceof s.e) {
                    sVar.remove(((s.e) fVar).f6115a);
                } else if (fVar instanceof C0584b) {
                    sVar.add(fVar);
                } else if (fVar instanceof C0585c) {
                    sVar.remove(((C0585c) fVar).f6114a);
                } else if (fVar instanceof s.i) {
                    sVar.add(fVar);
                } else if (fVar instanceof s.j) {
                    sVar.remove(((s.j) fVar).f6119a);
                } else if (fVar instanceof s.h) {
                    sVar.remove(((s.h) fVar).f6117a);
                }
                break;
            default:
                ((C0499p0) this.f79e).f5638d.g(((Number) obj).floatValue());
                break;
        }
        return C0174m.f3840a;
    }
}
