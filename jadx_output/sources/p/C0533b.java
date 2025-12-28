package p;

import c2.C0174m;
import g2.InterfaceC0271d;
import java.util.concurrent.CancellationException;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533b extends i2.j implements o2.c {
    public C0540i h;

    /* renamed from: i, reason: collision with root package name */
    public p2.m f5859i;

    /* renamed from: j, reason: collision with root package name */
    public int f5860j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0535d f5861k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5862l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0527F f5863m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f5864n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o2.c f5865o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0533b(C0535d c0535d, Object obj, C0527F c0527f, long j3, o2.c cVar, InterfaceC0271d interfaceC0271d) {
        super(1, interfaceC0271d);
        this.f5861k = c0535d;
        this.f5862l = obj;
        this.f5863m = c0527f;
        this.f5864n = j3;
        this.f5865o = cVar;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        C0527F c0527f = this.f5863m;
        return new C0533b(this.f5861k, this.f5862l, c0527f, this.f5864n, this.f5865o, (InterfaceC0271d) obj).l(C0174m.f3840a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [o2.c, p2.h] */
    @Override // i2.a
    public final Object l(Object obj) {
        p2.m mVar;
        C0540i c0540i;
        h2.a aVar = h2.a.f4407d;
        int i3 = this.f5860j;
        int i4 = 1;
        C0535d c0535d = this.f5861k;
        try {
            if (i3 == 0) {
                Z0.d.U(obj);
                c0535d.f5869c.f5893f = (n) ((p2.h) c0535d.f5867a.f316e).i(this.f5862l);
                C0527F c0527f = this.f5863m;
                c0535d.f5871e.setValue(c0527f.f5841c);
                c0535d.f5870d.setValue(Boolean.TRUE);
                C0540i c0540i2 = c0535d.f5869c;
                C0540i c0540i3 = new C0540i(c0540i2.f5891d, c0540i2.f5892e.getValue(), AbstractC0536e.d(c0540i2.f5893f), c0540i2.f5894g, Long.MIN_VALUE, c0540i2.f5895i);
                p2.m mVar2 = new p2.m();
                long j3 = this.f5864n;
                C0532a c0532a = new C0532a(c0535d, c0540i3, this.f5865o, mVar2);
                this.h = c0540i3;
                this.f5859i = mVar2;
                this.f5860j = 1;
                if (AbstractC0536e.b(c0540i3, c0527f, j3, c0532a, this) == aVar) {
                    return aVar;
                }
                mVar = mVar2;
                c0540i = c0540i3;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = this.f5859i;
                c0540i = this.h;
                Z0.d.U(obj);
            }
            if (!mVar.f5958d) {
                i4 = 2;
            }
            C0540i c0540i4 = c0535d.f5869c;
            c0540i4.f5893f.d();
            c0540i4.f5894g = Long.MIN_VALUE;
            c0535d.f5870d.setValue(Boolean.FALSE);
            return new I.m(i4, 5, c0540i);
        } catch (CancellationException e3) {
            C0540i c0540i5 = c0535d.f5869c;
            c0540i5.f5893f.d();
            c0540i5.f5894g = Long.MIN_VALUE;
            c0535d.f5870d.setValue(Boolean.FALSE);
            throw e3;
        }
    }
}
