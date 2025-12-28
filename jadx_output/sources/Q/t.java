package q;

import a.AbstractC0090a;
import android.graphics.Rect;
import android.view.View;
import c2.C0174m;
import g2.InterfaceC0271d;
import n0.AbstractC0409C;
import n0.InterfaceC0427h;
import n0.Y;
import u.AbstractC0602b;
import u.C0603c;
import u.InterfaceC0601a;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class t extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f6037i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f6037i = uVar;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new t(this.f6037i, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((t) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        Object obj2;
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        C0174m c0174m = C0174m.f3840a;
        if (i3 == 0) {
            Z0.d.U(obj);
            this.h = 1;
            u uVar = this.f6037i;
            boolean z3 = uVar.f2088d.f2099p;
            if (z3) {
                if (!z3) {
                    Z0.d.S("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
                    throw null;
                }
                Y p3 = AbstractC0409C.p(uVar, 2);
                if (!p3.q0().f2099p) {
                    Z0.d.S("LayoutCoordinates is not attached.");
                    throw null;
                }
                if (uVar.f2088d.f2099p) {
                    obj2 = (InterfaceC0601a) AbstractC0409C.i(uVar, AbstractC0602b.f6293q);
                    if (obj2 == null) {
                        obj2 = new C0603c(uVar);
                    }
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    InterfaceC0427h interfaceC0427h = ((C0603c) obj2).f6294d;
                    if (!((P.k) interfaceC0427h).f2088d.f2099p) {
                        Z0.d.S("Cannot get View because the Modifier node is not currently attached.");
                        throw null;
                    }
                    View view = (View) AbstractC0409C.s(AbstractC0409C.q(interfaceC0427h));
                    long z02 = p3.z0(0L);
                    if (!p3.q0().f2099p) {
                        p3 = null;
                    }
                    V.d c3 = p3 != null ? AbstractC0090a.c(0L, r2.a.c0(p3.f4929f)) : null;
                    V.d e3 = c3 != null ? c3.e(z02) : null;
                    if (e3 != null) {
                        view.requestRectangleOnScreen(new Rect((int) e3.f2446a, (int) e3.f2447b, (int) e3.f2448c, (int) e3.f2449d), false);
                    }
                }
            }
            if (c0174m == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z0.d.U(obj);
        }
        return c0174m;
    }
}
