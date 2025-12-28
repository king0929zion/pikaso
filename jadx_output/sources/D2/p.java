package D2;

import a.AbstractC0090a;
import android.view.DragEvent;
import c2.C0174m;
import g2.InterfaceC0276i;
import n0.AbstractC0409C;
import n0.AbstractC0418L;
import n0.n0;
import n0.o0;
import o0.C0507u;
import o0.ViewOnDragListenerC0487j0;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class p extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1081g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(U.q qVar, androidx.compose.ui.focus.a aVar, o2.c cVar) {
        super(1);
        this.f1079e = 2;
        this.f1080f = qVar;
        this.f1081g = aVar;
        this.h = (p2.h) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [o2.c, p2.h] */
    @Override // o2.c
    public final Object i(Object obj) {
        boolean booleanValue;
        switch (this.f1079e) {
            case 0:
                B1.c a3 = AbstractC0071a.a((o2.c) this.f1080f, this.f1081g, null);
                if (a3 != null) {
                    AbstractC0688v.h((InterfaceC0276i) this.h, a3);
                }
                return C0174m.f3840a;
            case 1:
                o0 o0Var = (o0) obj;
                S.d dVar = (S.d) o0Var;
                if (((ViewOnDragListenerC0487j0) ((C0507u) AbstractC0409C.r((S.d) this.f1081g)).getDragAndDropManager()).f5596b.contains(dVar)) {
                    DragEvent dragEvent = (DragEvent) ((A.t) this.h).f175e;
                    if (AbstractC0090a.g(dVar, r2.a.f(dragEvent.getX(), dragEvent.getY()))) {
                        ((p2.o) this.f1080f).f5960d = o0Var;
                        return n0.f5272f;
                    }
                }
                return n0.f5270d;
            case 2:
                U.q qVar = (U.q) obj;
                if (p2.g.a(qVar, (U.q) this.f1080f)) {
                    booleanValue = false;
                } else {
                    if (p2.g.a(qVar, ((androidx.compose.ui.focus.a) this.f1081g).f3319d)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    booleanValue = ((Boolean) ((p2.h) this.h).i(qVar)).booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            case 3:
                l0.n nVar = (l0.n) obj;
                t.o oVar = (t.o) this.f1080f;
                boolean z3 = oVar.f6181u;
                AbstractC0418L abstractC0418L = (AbstractC0418L) this.h;
                l0.o oVar2 = (l0.o) this.f1081g;
                if (z3) {
                    l0.n.f(nVar, oVar2, abstractC0418L.b(oVar.f6177q), abstractC0418L.b(oVar.f6178r));
                } else {
                    l0.n.d(nVar, oVar2, abstractC0418L.b(oVar.f6177q), abstractC0418L.b(oVar.f6178r));
                }
                return C0174m.f3840a;
            default:
                l0.n nVar2 = (l0.n) obj;
                t.q qVar2 = (t.q) this.h;
                t.p pVar = qVar2.f6186q;
                AbstractC0418L abstractC0418L2 = (AbstractC0418L) this.f1081g;
                l0.n.d(nVar2, (l0.o) this.f1080f, abstractC0418L2.b(abstractC0418L2.getLayoutDirection() == G0.f.f1258d ? pVar.f6182a : pVar.f6184c), abstractC0418L2.b(qVar2.f6186q.f6183b));
                return C0174m.f3840a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i3) {
        super(1);
        this.f1079e = i3;
        this.f1080f = obj;
        this.f1081g = obj2;
        this.h = obj3;
    }
}
