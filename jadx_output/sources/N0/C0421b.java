package n0;

import A.AbstractC0000a;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import c2.InterfaceC0164c;
import java.util.LinkedHashMap;
import java.util.Map;
import l0.InterfaceC0360j;
import m0.C0369a;
import m0.InterfaceC0371c;
import o0.C0507u;
import q.C0553F;
import t0.C0599a;

/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421b extends P.k implements InterfaceC0437s, InterfaceC0430k, l0, j0, InterfaceC0371c, h0, r, InterfaceC0431l, U.b, U.l, U.o, f0 {

    /* renamed from: q, reason: collision with root package name */
    public P.j f5231q;

    @Override // n0.l0
    public final void A(t0.g gVar) {
        P.j jVar = this.f5231q;
        p2.g.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) jVar;
        t0.g gVar2 = new t0.g();
        gVar2.f6231e = appendedSemanticsElement.f3344a;
        appendedSemanticsElement.f3345b.i(gVar2);
        p2.g.c(gVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (gVar2.f6231e) {
            gVar.f6231e = true;
        }
        if (gVar2.f6232f) {
            gVar.f6232f = true;
        }
        for (Map.Entry entry : gVar2.f6230d.entrySet()) {
            t0.q qVar = (t0.q) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = gVar.f6230d;
            if (!linkedHashMap.containsKey(qVar)) {
                linkedHashMap.put(qVar, value);
            } else if (value instanceof C0599a) {
                Object obj = linkedHashMap.get(qVar);
                p2.g.c(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C0599a c0599a = (C0599a) obj;
                String str = c0599a.f6198a;
                if (str == null) {
                    str = ((C0599a) value).f6198a;
                }
                InterfaceC0164c interfaceC0164c = c0599a.f6199b;
                if (interfaceC0164c == null) {
                    interfaceC0164c = ((C0599a) value).f6199b;
                }
                linkedHashMap.put(qVar, new C0599a(str, interfaceC0164c));
            }
        }
    }

    @Override // n0.j0
    public final void B() {
        P.j jVar = this.f5231q;
        p2.g.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        AbstractC0000a.j(jVar);
        throw null;
    }

    @Override // n0.InterfaceC0430k
    public final void C(C0408B c0408b) {
        P.j jVar = this.f5231q;
        p2.g.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((C0553F) jVar).f5972a.d(c0408b);
    }

    @Override // n0.h0
    public final Object I() {
        p2.g.c(this.f5231q, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        throw new ClassCastException();
    }

    @Override // n0.r
    public final void K(Y y3) {
    }

    @Override // n0.InterfaceC0430k
    public final void M() {
        AbstractC0409C.k(this);
    }

    @Override // n0.j0
    public final boolean N() {
        P.j jVar = this.f5231q;
        p2.g.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        AbstractC0000a.j(jVar);
        throw null;
    }

    @Override // n0.InterfaceC0437s
    public final M1.j R(AbstractC0418L abstractC0418L, InterfaceC0360j interfaceC0360j, long j3) {
        p2.g.c(this.f5231q, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        throw new ClassCastException();
    }

    @Override // P.k
    public final void Y() {
        f0(true);
    }

    @Override // P.k
    public final void Z() {
        g0();
    }

    @Override // m0.InterfaceC0371c
    public final C0369a a() {
        return C0369a.f4955a;
    }

    public final void f0(boolean z3) {
        if (!this.f2099p) {
            Z0.d.S("initializeModifier called on unattached node");
            throw null;
        }
        if ((this.f2090f & 4) != 0 && !z3) {
            AbstractC0409C.p(this, 2).w0();
        }
        if ((this.f2090f & 2) != 0) {
            m0 m0Var = (m0) AbstractC0409C.q(this).f5319x.f856e;
            p2.g.c(m0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (m0Var.f5265q) {
                Y y3 = this.f2094k;
                p2.g.b(y3);
                ((C0439u) y3).M0(this);
                d0 d0Var = y3.f5216F;
                if (d0Var != null) {
                    d0Var.invalidate();
                }
            }
            if (!z3) {
                AbstractC0409C.p(this, 2).w0();
                AbstractC0409C.q(this).r();
            }
        }
        if ((this.f2090f & 8) != 0) {
            ((C0507u) AbstractC0409C.r(this)).z();
        }
    }

    public final void g0() {
        if (!this.f2099p) {
            Z0.d.S("unInitializeModifier called on unattached node");
            throw null;
        }
        if ((this.f2090f & 8) != 0) {
            ((C0507u) AbstractC0409C.r(this)).z();
        }
    }

    @Override // U.l
    public final void h(U.i iVar) {
        Z0.d.S("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override // n0.j0
    public final boolean l() {
        P.j jVar = this.f5231q;
        p2.g.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        AbstractC0000a.j(jVar);
        throw null;
    }

    @Override // n0.r
    public final void o(long j3) {
    }

    @Override // n0.InterfaceC0431l
    public final void p(Y y3) {
        p2.g.c(this.f5231q, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    public final String toString() {
        return this.f5231q.toString();
    }

    @Override // n0.f0
    public final boolean w() {
        return this.f2099p;
    }

    @Override // n0.j0
    public final void y(h0.f fVar, h0.g gVar, long j3) {
        p2.g.c(this.f5231q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // U.b
    public final void z(U.p pVar) {
        Z0.d.S("onFocusEvent called on wrong node");
        throw null;
    }
}
