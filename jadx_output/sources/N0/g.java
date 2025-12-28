package N0;

import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f1828m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f1821e = 2;
        } else {
            this.f1821e = 3;
        }
    }

    @Override // N0.f
    public final void d(int i3) {
        if (this.f1825j) {
            return;
        }
        this.f1825j = true;
        this.f1823g = i3;
        Iterator it = this.f1826k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
