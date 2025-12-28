package G1;

import D.Z;
import c2.C0174m;
import com.ai.assistance.operit.provider.UIAccessibilityService;
import g2.InterfaceC0271d;
import y2.AbstractC0688v;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class f extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z f1273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Z z3, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f1273i = z3;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new f(this.f1273i, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        ((f) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
        return h2.a.f4407d;
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z0.d.U(obj);
        do {
            this.f1273i.setValue(Boolean.valueOf(UIAccessibilityService.h));
            this.h = 1;
        } while (AbstractC0688v.c(1000L, this) != aVar);
        return aVar;
    }
}
