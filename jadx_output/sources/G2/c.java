package G2;

import D2.u;
import D2.w;
import c2.C0174m;
import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.C0673f;
import y2.InterfaceC0672e;
import y2.p0;

/* loaded from: classes.dex */
public final class c implements InterfaceC0672e, p0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0673f f1284d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1286f;

    public c(d dVar, C0673f c0673f, Object obj) {
        this.f1286f = dVar;
        this.f1284d = c0673f;
        this.f1285e = obj;
    }

    @Override // y2.p0
    public final void a(u uVar, int i3) {
        this.f1284d.a(uVar, i3);
    }

    @Override // y2.InterfaceC0672e
    public final w d(Object obj, o2.c cVar) {
        d dVar = this.f1286f;
        b bVar = new b(dVar, this, 1);
        w d3 = this.f1284d.d((C0174m) obj, bVar);
        if (d3 != null) {
            d.f1287g.set(dVar, this.f1285e);
        }
        return d3;
    }

    @Override // y2.InterfaceC0672e
    public final void g(Object obj, o2.c cVar) {
        C0174m c0174m = C0174m.f3840a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1287g;
        d dVar = this.f1286f;
        atomicReferenceFieldUpdater.set(dVar, this.f1285e);
        this.f1284d.g(c0174m, new b(dVar, this, 0));
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return this.f1284d.h;
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        this.f1284d.t(obj);
    }

    @Override // y2.InterfaceC0672e
    public final void w(Object obj) {
        this.f1284d.w(obj);
    }
}
