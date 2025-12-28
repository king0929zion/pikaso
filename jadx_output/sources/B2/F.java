package B2;

import g2.InterfaceC0271d;
import y2.S;

/* loaded from: classes.dex */
public final class F extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public G f290g;
    public InterfaceC0022f h;

    /* renamed from: i, reason: collision with root package name */
    public H f291i;

    /* renamed from: j, reason: collision with root package name */
    public S f292j;

    /* renamed from: k, reason: collision with root package name */
    public Object f293k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f294l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G f295m;

    /* renamed from: n, reason: collision with root package name */
    public int f296n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(G g3, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f295m = g3;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.f294l = obj;
        this.f296n |= Integer.MIN_VALUE;
        this.f295m.o(null, this);
        return h2.a.f4407d;
    }
}
