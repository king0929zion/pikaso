package G2;

import D2.u;
import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends u {
    public final AtomicReferenceArray h;

    public j(long j3, j jVar, int i3) {
        super(j3, jVar, i3);
        this.h = new AtomicReferenceArray(i.f1302f);
    }

    @Override // D2.u
    public final int f() {
        return i.f1302f;
    }

    @Override // D2.u
    public final void g(int i3, InterfaceC0276i interfaceC0276i) {
        this.h.set(i3, i.f1301e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1085f + ", hashCode=" + hashCode() + ']';
    }
}
