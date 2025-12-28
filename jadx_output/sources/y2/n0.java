package y2;

import D2.AbstractC0071a;
import c2.C0168g;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public final class n0 extends D2.t {
    public final ThreadLocal h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n0(g2.InterfaceC0276i r3, i2.c r4) {
        /*
            r2 = this;
            y2.o0 r0 = y2.o0.f6812d
            g2.g r1 = r3.n(r0)
            if (r1 != 0) goto Ld
            g2.i r0 = r3.i(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r4, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.h = r0
            g2.i r4 = r4.o()
            g2.e r0 = g2.C0272e.f4333d
            g2.g r4 = r4.n(r0)
            boolean r4 = r4 instanceof y2.r
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = D2.AbstractC0071a.m(r3, r4)
            D2.AbstractC0071a.g(r3, r4)
            r2.e0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.n0.<init>(g2.i, i2.c):void");
    }

    public final boolean d0() {
        boolean z3 = this.threadLocalIsSet && this.h.get() == null;
        this.h.remove();
        return !z3;
    }

    public final void e0(InterfaceC0276i interfaceC0276i, Object obj) {
        this.threadLocalIsSet = true;
        this.h.set(new C0168g(interfaceC0276i, obj));
    }

    @Override // D2.t, y2.b0
    public final void z(Object obj) {
        if (this.threadLocalIsSet) {
            C0168g c0168g = (C0168g) this.h.get();
            if (c0168g != null) {
                AbstractC0071a.g((InterfaceC0276i) c0168g.f3833d, c0168g.f3834e);
            }
            this.h.remove();
        }
        Object m2 = AbstractC0688v.m(obj);
        InterfaceC0271d interfaceC0271d = this.f1083g;
        InterfaceC0276i o3 = interfaceC0271d.o();
        Object m3 = AbstractC0071a.m(o3, null);
        n0 r3 = m3 != AbstractC0071a.f1047f ? AbstractC0688v.r(interfaceC0271d, o3, m3) : null;
        try {
            this.f1083g.t(m2);
        } finally {
            if (r3 == null || r3.d0()) {
                AbstractC0071a.g(o3, m3);
            }
        }
    }
}
