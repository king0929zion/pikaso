package C2;

import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class k extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public l f601g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f602i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f603j;

    /* renamed from: k, reason: collision with root package name */
    public int f604k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f603j = lVar;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.f602i = obj;
        this.f604k |= Integer.MIN_VALUE;
        return this.f603j.b(null, this);
    }
}
