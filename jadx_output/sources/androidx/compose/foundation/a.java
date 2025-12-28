package androidx.compose.foundation;

import P.l;
import W.H;
import q.InterfaceC0550C;
import s.g;

/* loaded from: classes.dex */
public abstract class a {
    public static final l a(l lVar, long j3, H h) {
        return lVar.c(new BackgroundElement(j3, h));
    }

    public static l b(l lVar, g gVar, InterfaceC0550C interfaceC0550C, boolean z3, A0.c cVar) {
        return lVar.c(interfaceC0550C instanceof q.H ? new ClickableElement(gVar, (q.H) interfaceC0550C, z3, null, null, cVar) : interfaceC0550C == null ? new ClickableElement(gVar, null, z3, null, null, cVar) : gVar != null ? c.a(gVar, interfaceC0550C).c(new ClickableElement(gVar, null, z3, null, null, cVar)) : new P.g(new b(interfaceC0550C, z3, null, null, cVar)));
    }
}
