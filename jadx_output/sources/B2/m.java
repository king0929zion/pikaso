package B2;

import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class m extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public n f326g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public int f327i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f328j;

    /* renamed from: k, reason: collision with root package name */
    public Object f329k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f328j = nVar;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.h = obj;
        this.f327i |= Integer.MIN_VALUE;
        return this.f328j.b(null, this);
    }
}
