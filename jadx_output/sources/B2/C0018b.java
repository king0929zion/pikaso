package B2;

import g2.InterfaceC0271d;

/* renamed from: B2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018b extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f302g;
    public final /* synthetic */ C0019c h;

    /* renamed from: i, reason: collision with root package name */
    public int f303i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018b(C0019c c0019c, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.h = c0019c;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.f302g = obj;
        this.f303i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
