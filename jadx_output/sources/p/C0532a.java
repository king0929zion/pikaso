package p;

import D.C0037f0;
import c2.C0174m;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532a extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0535d f5856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0540i f5857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o2.c f5858g;
    public final /* synthetic */ p2.m h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0532a(C0535d c0535d, C0540i c0540i, o2.c cVar, p2.m mVar) {
        super(1);
        this.f5856e = c0535d;
        this.f5857f = c0540i;
        this.f5858g = cVar;
        this.h = mVar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [o2.a, p2.h] */
    @Override // o2.c
    public final Object i(Object obj) {
        C0538g c0538g = (C0538g) obj;
        C0535d c0535d = this.f5856e;
        AbstractC0536e.h(c0538g, c0535d.f5869c);
        C0037f0 c0037f0 = c0538g.f5886c;
        Object a3 = C0535d.a(c0535d, c0037f0.getValue());
        boolean a4 = p2.g.a(a3, c0037f0.getValue());
        o2.c cVar = this.f5858g;
        if (!a4) {
            c0535d.f5869c.f5892e.setValue(a3);
            this.f5857f.f5892e.setValue(a3);
            if (cVar != null) {
                cVar.i(c0535d);
            }
            c0538g.f5890g.setValue(Boolean.FALSE);
            c0538g.f5885b.c();
            this.h.f5958d = true;
        } else if (cVar != null) {
            cVar.i(c0535d);
        }
        return C0174m.f3840a;
    }
}
