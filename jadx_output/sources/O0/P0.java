package o0;

import D.C0057p0;
import android.view.View;
import c2.C0174m;
import com.ai.assistance.operit.provider.R;
import g2.InterfaceC0271d;
import y2.InterfaceC0687u;

/* loaded from: classes.dex */
public final class P0 extends i2.j implements o2.e {
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ D.v0 f5487i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f5488j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(D.v0 v0Var, View view, InterfaceC0271d interfaceC0271d) {
        super(2, interfaceC0271d);
        this.f5487i = v0Var;
        this.f5488j = view;
    }

    @Override // i2.a
    public final InterfaceC0271d f(InterfaceC0271d interfaceC0271d, Object obj) {
        return new P0(this.f5487i, this.f5488j, interfaceC0271d);
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        return ((P0) f((InterfaceC0271d) obj2, (InterfaceC0687u) obj)).l(C0174m.f3840a);
    }

    @Override // i2.a
    public final Object l(Object obj) {
        h2.a aVar = h2.a.f4407d;
        int i3 = this.h;
        C0174m c0174m = C0174m.f3840a;
        D.v0 v0Var = this.f5487i;
        View view = this.f5488j;
        try {
            if (i3 == 0) {
                Z0.d.U(obj);
                this.h = 1;
                Object d3 = B2.w.d(v0Var.f923r, new C0057p0(2, null), this);
                if (d3 != aVar) {
                    d3 = c0174m;
                }
                if (d3 == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z0.d.U(obj);
            }
            if (X0.b(view) == v0Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return c0174m;
        } finally {
            if (X0.b(view) == v0Var) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
