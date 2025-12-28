package C2;

import B2.InterfaceC0021e;
import B2.InterfaceC0022f;
import c2.C0174m;
import g2.InterfaceC0276i;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class n extends h {
    public final i2.j h;

    /* JADX WARN: Multi-variable type inference failed */
    public n(o2.f fVar, InterfaceC0021e interfaceC0021e, InterfaceC0276i interfaceC0276i, int i3, int i4) {
        super(interfaceC0021e, interfaceC0276i, i3, i4);
        this.h = (i2.j) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i2.j, o2.f] */
    @Override // C2.h
    public final h a(InterfaceC0276i interfaceC0276i, int i3, int i4) {
        return new n(this.h, this.f597g, interfaceC0276i, i3, i4);
    }

    @Override // C2.h
    public final Object c(InterfaceC0022f interfaceC0022f, i2.c cVar) {
        Object b3 = AbstractC0688v.b(new m(this, interfaceC0022f, null), cVar);
        return b3 == h2.a.f4407d ? b3 : C0174m.f3840a;
    }
}
