package n0;

import D.C0059s;
import n.C0403w;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0428i extends P.k {

    /* renamed from: q, reason: collision with root package name */
    public final int f5255q = Z.e(this);

    /* renamed from: r, reason: collision with root package name */
    public P.k f5256r;

    @Override // P.k
    public final void W() {
        super.W();
        for (P.k kVar = this.f5256r; kVar != null; kVar = kVar.f2092i) {
            kVar.e0(this.f2094k);
            if (!kVar.f2099p) {
                kVar.W();
            }
        }
    }

    @Override // P.k
    public final void X() {
        for (P.k kVar = this.f5256r; kVar != null; kVar = kVar.f2092i) {
            kVar.X();
        }
        super.X();
    }

    @Override // P.k
    public final void a0() {
        super.a0();
        for (P.k kVar = this.f5256r; kVar != null; kVar = kVar.f2092i) {
            kVar.a0();
        }
    }

    @Override // P.k
    public final void b0() {
        for (P.k kVar = this.f5256r; kVar != null; kVar = kVar.f2092i) {
            kVar.b0();
        }
        super.b0();
    }

    @Override // P.k
    public final void c0() {
        super.c0();
        for (P.k kVar = this.f5256r; kVar != null; kVar = kVar.f2092i) {
            kVar.c0();
        }
    }

    @Override // P.k
    public final void d0(P.k kVar) {
        this.f2088d = kVar;
        for (P.k kVar2 = this.f5256r; kVar2 != null; kVar2 = kVar2.f2092i) {
            kVar2.d0(kVar);
        }
    }

    @Override // P.k
    public final void e0(Y y3) {
        this.f2094k = y3;
        for (P.k kVar = this.f5256r; kVar != null; kVar = kVar.f2092i) {
            kVar.e0(y3);
        }
    }

    public final void f0(InterfaceC0427h interfaceC0427h) {
        P.k kVar = ((P.k) interfaceC0427h).f2088d;
        if (kVar != interfaceC0427h) {
            P.k kVar2 = interfaceC0427h instanceof P.k ? (P.k) interfaceC0427h : null;
            P.k kVar3 = kVar2 != null ? kVar2.h : null;
            if (kVar != this.f2088d || !p2.g.a(kVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (kVar.f2099p) {
            Z0.d.S("Cannot delegate to an already attached node");
            throw null;
        }
        kVar.d0(this.f2088d);
        int i3 = this.f2090f;
        int f3 = Z.f(kVar);
        kVar.f2090f = f3;
        int i4 = this.f2090f;
        int i5 = f3 & 2;
        if (i5 != 0 && (i4 & 2) != 0 && !(this instanceof InterfaceC0437s)) {
            Z0.d.S("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + kVar);
            throw null;
        }
        kVar.f2092i = this.f5256r;
        this.f5256r = kVar;
        kVar.h = this;
        h0(f3 | i4, false);
        if (this.f2099p) {
            if (i5 == 0 || (i3 & 2) != 0) {
                e0(this.f2094k);
            } else {
                C0059s c0059s = AbstractC0409C.q(this).f5319x;
                this.f2088d.e0(null);
                c0059s.j();
            }
            kVar.W();
            kVar.b0();
            Z.a(kVar);
        }
    }

    public final void g0(InterfaceC0427h interfaceC0427h) {
        P.k kVar = null;
        for (P.k kVar2 = this.f5256r; kVar2 != null; kVar2 = kVar2.f2092i) {
            if (kVar2 == interfaceC0427h) {
                boolean z3 = kVar2.f2099p;
                if (z3) {
                    C0403w c0403w = Z.f5230a;
                    if (!z3) {
                        Z0.d.S("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    Z.b(kVar2, -1, 2);
                    kVar2.c0();
                    kVar2.X();
                }
                kVar2.d0(kVar2);
                kVar2.f2091g = 0;
                if (kVar == null) {
                    this.f5256r = kVar2.f2092i;
                } else {
                    kVar.f2092i = kVar2.f2092i;
                }
                kVar2.f2092i = null;
                kVar2.h = null;
                int i3 = this.f2090f;
                int f3 = Z.f(this);
                h0(f3, true);
                if (this.f2099p && (i3 & 2) != 0 && (f3 & 2) == 0) {
                    C0059s c0059s = AbstractC0409C.q(this).f5319x;
                    this.f2088d.e0(null);
                    c0059s.j();
                    return;
                }
                return;
            }
            kVar = kVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0427h).toString());
    }

    public final void h0(int i3, boolean z3) {
        P.k kVar;
        int i4 = this.f2090f;
        this.f2090f = i3;
        if (i4 != i3) {
            P.k kVar2 = this.f2088d;
            if (kVar2 == this) {
                this.f2091g = i3;
            }
            if (this.f2099p) {
                P.k kVar3 = this;
                while (kVar3 != null) {
                    i3 |= kVar3.f2090f;
                    kVar3.f2090f = i3;
                    if (kVar3 == kVar2) {
                        break;
                    } else {
                        kVar3 = kVar3.h;
                    }
                }
                if (z3 && kVar3 == kVar2) {
                    i3 = Z.f(kVar2);
                    kVar2.f2090f = i3;
                }
                int i5 = i3 | ((kVar3 == null || (kVar = kVar3.f2092i) == null) ? 0 : kVar.f2091g);
                while (kVar3 != null) {
                    i5 |= kVar3.f2090f;
                    kVar3.f2091g = i5;
                    kVar3 = kVar3.h;
                }
            }
        }
    }
}
