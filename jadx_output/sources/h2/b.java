package h2;

import Z0.d;
import g2.InterfaceC0271d;
import i2.h;
import o2.e;
import p2.g;
import p2.r;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: e, reason: collision with root package name */
    public int f4411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f4412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0271d f4413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0271d interfaceC0271d, InterfaceC0271d interfaceC0271d2, e eVar) {
        super(interfaceC0271d);
        this.f4412f = eVar;
        this.f4413g = interfaceC0271d2;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        int i3 = this.f4411e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4411e = 2;
            d.U(obj);
            return obj;
        }
        this.f4411e = 1;
        d.U(obj);
        e eVar = this.f4412f;
        g.c(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        r.c(2, eVar);
        return eVar.h(this.f4413g, this);
    }
}
