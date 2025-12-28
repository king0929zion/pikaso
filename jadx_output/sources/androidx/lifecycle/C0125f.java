package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125f implements p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3470d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final q f3471e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3472f;

    public C0125f(InterfaceC0123d interfaceC0123d, p pVar) {
        p2.g.e(interfaceC0123d, "defaultLifecycleObserver");
        this.f3471e = interfaceC0123d;
        this.f3472f = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        switch (this.f3470d) {
            case 0:
                int i3 = AbstractC0124e.f3469a[lVar.ordinal()];
                InterfaceC0123d interfaceC0123d = (InterfaceC0123d) this.f3471e;
                switch (i3) {
                    case 1:
                        interfaceC0123d.getClass();
                        break;
                    case 2:
                        interfaceC0123d.d(rVar);
                        break;
                    case 3:
                        interfaceC0123d.a(rVar);
                        break;
                    case 4:
                        interfaceC0123d.getClass();
                        break;
                    case 5:
                        interfaceC0123d.c(rVar);
                        break;
                    case 6:
                        interfaceC0123d.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                p pVar = (p) this.f3472f;
                if (pVar != null) {
                    pVar.b(rVar, lVar);
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0120a) this.f3472f).f3462a;
                List list = (List) hashMap.get(lVar);
                q qVar = this.f3471e;
                C0120a.a(list, rVar, lVar, qVar);
                C0120a.a((List) hashMap.get(l.ON_ANY), rVar, lVar, qVar);
                return;
        }
    }

    public C0125f(q qVar) {
        this.f3471e = qVar;
        C0122c c0122c = C0122c.f3466c;
        Class<?> cls = qVar.getClass();
        C0120a c0120a = (C0120a) c0122c.f3467a.get(cls);
        this.f3472f = c0120a == null ? c0122c.a(cls, null) : c0120a;
    }
}
