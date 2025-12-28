package G2;

import c2.C0174m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b extends p2.h implements o2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f1283g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i3) {
        super(1);
        this.f1281e = i3;
        this.f1282f = dVar;
        this.f1283g = cVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f1281e) {
            case 0:
                this.f1282f.d(this.f1283g.f1285e);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1287g;
                c cVar = this.f1283g;
                Object obj2 = cVar.f1285e;
                d dVar = this.f1282f;
                atomicReferenceFieldUpdater.set(dVar, obj2);
                dVar.d(cVar.f1285e);
                break;
        }
        return C0174m.f3840a;
    }
}
