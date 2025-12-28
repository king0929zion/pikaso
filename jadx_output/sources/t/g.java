package t;

import c2.C0174m;
import l0.InterfaceC0360j;
import n0.AbstractC0418L;

/* loaded from: classes.dex */
public final class g extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.o f6156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0360j f6157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0418L f6158g;
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6159i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f6160j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l0.o oVar, InterfaceC0360j interfaceC0360j, AbstractC0418L abstractC0418L, int i3, int i4, i iVar) {
        super(1);
        this.f6156e = oVar;
        this.f6157f = interfaceC0360j;
        this.f6158g = abstractC0418L;
        this.h = i3;
        this.f6159i = i4;
        this.f6160j = iVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        G0.f layoutDirection = this.f6158g.getLayoutDirection();
        P.d dVar = this.f6160j.f6166a;
        e.a((l0.n) obj, this.f6156e, this.f6157f, layoutDirection, this.h, this.f6159i, dVar);
        return C0174m.f3840a;
    }
}
