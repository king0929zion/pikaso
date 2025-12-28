package androidx.compose.foundation;

import D.C0048l;
import D.C0052n;
import P.l;
import java.io.Serializable;
import o2.f;
import p2.h;
import q.InterfaceC0550C;
import s.g;
import t0.e;

/* loaded from: classes.dex */
public final class b extends h implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0550C f3271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f3273g;
    public final /* synthetic */ e h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A0.c f3274i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0550C interfaceC0550C, boolean z3, String str, e eVar, A0.c cVar) {
        super(3);
        this.f3271e = interfaceC0550C;
        this.f3272f = z3;
        this.f3273g = str;
        this.h = eVar;
        this.f3274i = cVar;
    }

    @Override // o2.f
    public final Object a(Object obj, Object obj2, Serializable serializable) {
        C0052n c0052n = (C0052n) obj2;
        ((Number) serializable).intValue();
        c0052n.N(-1525724089);
        Object H2 = c0052n.H();
        if (H2 == C0048l.f781a) {
            H2 = new g();
            c0052n.V(H2);
        }
        g gVar = (g) H2;
        l c3 = c.a(gVar, this.f3271e).c(new ClickableElement(gVar, null, this.f3272f, this.f3273g, this.h, this.f3274i));
        c0052n.q(false);
        return c3;
    }
}
