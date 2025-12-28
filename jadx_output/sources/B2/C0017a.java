package B2;

import g2.InterfaceC0271d;

/* renamed from: B2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017a extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public C2.u f299g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A.t f300i;

    /* renamed from: j, reason: collision with root package name */
    public int f301j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017a(A.t tVar, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f300i = tVar;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.h = obj;
        this.f301j |= Integer.MIN_VALUE;
        return this.f300i.o(null, this);
    }
}
