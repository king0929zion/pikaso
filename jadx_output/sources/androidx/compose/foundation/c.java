package androidx.compose.foundation;

import D.M0;
import P.i;
import P.l;
import q.C0552E;
import q.H;
import q.InterfaceC0550C;
import s.g;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final M0 f3275a = new M0(C0552E.f5971e);

    public static final l a(g gVar, InterfaceC0550C interfaceC0550C) {
        return interfaceC0550C == null ? i.f2087a : interfaceC0550C instanceof H ? new IndicationModifierElement(gVar, (H) interfaceC0550C) : new P.g(new D0.b(interfaceC0550C, 2, gVar));
    }
}
