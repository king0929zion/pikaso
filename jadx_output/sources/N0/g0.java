package n0;

import D.C0032d;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final N.v f5248a;

    /* renamed from: b, reason: collision with root package name */
    public final C0416J f5249b = C0416J.f5158o;

    /* renamed from: c, reason: collision with root package name */
    public final C0416J f5250c = C0416J.f5159p;

    /* renamed from: d, reason: collision with root package name */
    public final C0416J f5251d = C0416J.f5160q;

    /* renamed from: e, reason: collision with root package name */
    public final C0416J f5252e = C0416J.f5154k;

    /* renamed from: f, reason: collision with root package name */
    public final C0416J f5253f = C0416J.f5155l;

    /* renamed from: g, reason: collision with root package name */
    public final C0416J f5254g = C0416J.f5156m;
    public final C0416J h = C0416J.f5157n;

    public g0(o0.r rVar) {
        this.f5248a = new N.v(rVar);
    }

    public final void a(f0 f0Var, o2.c cVar, o2.a aVar) {
        Object obj;
        N.u uVar;
        N.v vVar = this.f5248a;
        synchronized (vVar.f1788f) {
            F.d dVar = vVar.f1788f;
            int i3 = dVar.f1160f;
            if (i3 > 0) {
                Object[] objArr = dVar.f1158d;
                int i4 = 0;
                do {
                    obj = objArr[i4];
                    if (((N.u) obj).f1772a == cVar) {
                        break;
                    } else {
                        i4++;
                    }
                } while (i4 < i3);
            }
            obj = null;
            uVar = (N.u) obj;
            if (uVar == null) {
                p2.g.c(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                p2.r.c(1, cVar);
                uVar = new N.u(cVar);
                dVar.b(uVar);
            }
        }
        N.u uVar2 = vVar.h;
        long j3 = vVar.f1790i;
        if (j3 == -1 || j3 == C0032d.u()) {
            try {
                vVar.h = uVar;
                vVar.f1790i = Thread.currentThread().getId();
                uVar.a(f0Var, vVar.f1787e, aVar);
                return;
            } finally {
                vVar.h = uVar2;
                vVar.f1790i = j3;
            }
        }
        C0032d.H("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + C0032d.u() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        throw null;
    }
}
