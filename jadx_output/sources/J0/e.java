package J0;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class e extends AbstractC0090a {
    @Override // a.AbstractC0090a
    public final void Y(f fVar, f fVar2) {
        fVar.f1422b = fVar2;
    }

    @Override // a.AbstractC0090a
    public final void Z(f fVar, Thread thread) {
        fVar.f1421a = thread;
    }

    @Override // a.AbstractC0090a
    public final boolean j(g gVar, c cVar) {
        c cVar2 = c.f1414b;
        synchronized (gVar) {
            try {
                if (gVar.f1428b != cVar) {
                    return false;
                }
                gVar.f1428b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0090a
    public final boolean k(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f1427a != obj) {
                    return false;
                }
                gVar.f1427a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0090a
    public final boolean l(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f1429c != fVar) {
                    return false;
                }
                gVar.f1429c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
