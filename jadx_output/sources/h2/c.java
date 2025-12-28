package h2;

import Z0.d;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import o2.e;
import p2.g;
import p2.r;

/* loaded from: classes.dex */
public final class c extends i2.c {

    /* renamed from: g, reason: collision with root package name */
    public int f4414g;
    public final /* synthetic */ e h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0271d f4415i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0271d interfaceC0271d, InterfaceC0276i interfaceC0276i, e eVar, InterfaceC0271d interfaceC0271d2) {
        super(interfaceC0271d, interfaceC0276i);
        this.h = eVar;
        this.f4415i = interfaceC0271d2;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        int i3 = this.f4414g;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4414g = 2;
            d.U(obj);
            return obj;
        }
        this.f4414g = 1;
        d.U(obj);
        e eVar = this.h;
        g.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        r.c(2, eVar);
        return eVar.h(this.f4415i, this);
    }
}
