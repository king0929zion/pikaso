package D;

import android.view.Choreographer;
import g2.InterfaceC0274g;
import g2.InterfaceC0275h;
import g2.InterfaceC0276i;
import y2.AbstractC0688v;
import y2.C0673f;

/* loaded from: classes.dex */
public final class A implements V {

    /* renamed from: d, reason: collision with root package name */
    public static final A f627d = new A();

    /* renamed from: e, reason: collision with root package name */
    public static final Choreographer f628e;

    static {
        F2.d dVar = y2.B.f6749a;
        f628e = (Choreographer) AbstractC0688v.o(D2.o.f1078a.f7092i, new C0064x(2, null));
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        return Z0.d.H(this, interfaceC0275h);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i i(InterfaceC0276i interfaceC0276i) {
        return Z0.d.K(this, interfaceC0276i);
    }

    @Override // g2.InterfaceC0276i
    public final Object l(Object obj, o2.e eVar) {
        return eVar.h(obj, this);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        return Z0.d.w(this, interfaceC0275h);
    }

    @Override // D.V
    public final Object u(o2.c cVar, i2.c cVar2) {
        C0673f c0673f = new C0673f(1, Z.b.z(cVar2));
        c0673f.u();
        ChoreographerFrameCallbackC0066z choreographerFrameCallbackC0066z = new ChoreographerFrameCallbackC0066z(cVar, c0673f);
        f628e.postFrameCallback(choreographerFrameCallbackC0066z);
        c0673f.x(new C0065y(0, choreographerFrameCallbackC0066z));
        return c0673f.s();
    }
}
