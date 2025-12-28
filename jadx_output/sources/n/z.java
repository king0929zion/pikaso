package N;

import D.C0034e;

/* loaded from: classes.dex */
public abstract class z implements y {

    /* renamed from: d, reason: collision with root package name */
    public final C0034e f1798d = new C0034e(0);

    public final boolean e(int i3) {
        return (i3 & this.f1798d.get()) != 0;
    }

    public final void f(int i3) {
        C0034e c0034e;
        int i4;
        do {
            c0034e = this.f1798d;
            i4 = c0034e.get();
            if ((i4 & i3) != 0) {
                return;
            }
        } while (!c0034e.compareAndSet(i4, i4 | i3));
    }
}
