package B2;

import g2.InterfaceC0271d;

/* loaded from: classes.dex */
public final class j extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public C0019c f318g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f319i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0019c f320j;

    /* renamed from: k, reason: collision with root package name */
    public int f321k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0019c c0019c, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f320j = c0019c;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.f319i = obj;
        this.f321k |= Integer.MIN_VALUE;
        return this.f320j.b(null, this);
    }
}
