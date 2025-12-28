package B2;

import g2.InterfaceC0271d;
import y2.S;

/* loaded from: classes.dex */
public final class u extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public v f350g;
    public InterfaceC0022f h;

    /* renamed from: i, reason: collision with root package name */
    public x f351i;

    /* renamed from: j, reason: collision with root package name */
    public S f352j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f353k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f354l;

    /* renamed from: m, reason: collision with root package name */
    public int f355m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, InterfaceC0271d interfaceC0271d) {
        super(interfaceC0271d);
        this.f354l = vVar;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        this.f353k = obj;
        this.f355m |= Integer.MIN_VALUE;
        v.i(this.f354l, null, this);
        return h2.a.f4407d;
    }
}
