package o0;

import D.C0041h0;
import android.view.View;
import c2.C0174m;
import g2.InterfaceC0271d;
import java.util.ArrayList;
import y2.AbstractC0688v;
import y2.C0673f;
import y2.InterfaceC0672e;

/* loaded from: classes.dex */
public final class V0 implements androidx.lifecycle.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2.d f5510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0041h0 f5511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D.v0 f5512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p2.o f5513g;
    public final /* synthetic */ View h;

    public V0(D2.d dVar, C0041h0 c0041h0, D.v0 v0Var, p2.o oVar, View view) {
        this.f5510d = dVar;
        this.f5511e = c0041h0;
        this.f5512f = v0Var;
        this.f5513g = oVar;
        this.h = view;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        boolean z3;
        int i3 = S0.f5499a[lVar.ordinal()];
        InterfaceC0672e interfaceC0672e = null;
        if (i3 == 1) {
            AbstractC0688v.l(this.f5510d, null, 4, new U0(this.f5513g, this.f5512f, rVar, this, this.h, null), 1);
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    return;
                }
                this.f5512f.d();
                return;
            } else {
                D.v0 v0Var = this.f5512f;
                synchronized (v0Var.f908b) {
                    v0Var.f922q = true;
                }
                return;
            }
        }
        C0041h0 c0041h0 = this.f5511e;
        if (c0041h0 != null) {
            D.Q q3 = (D.Q) c0041h0.f767f;
            synchronized (q3.f720a) {
                try {
                    synchronized (q3.f720a) {
                        z3 = q3.f723d;
                    }
                    if (!z3) {
                        ArrayList arrayList = q3.f721b;
                        q3.f721b = q3.f722c;
                        q3.f722c = arrayList;
                        q3.f723d = true;
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ((InterfaceC0271d) arrayList.get(i4)).t(C0174m.f3840a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        D.v0 v0Var2 = this.f5512f;
        synchronized (v0Var2.f908b) {
            if (v0Var2.f922q) {
                v0Var2.f922q = false;
                interfaceC0672e = v0Var2.e();
            }
        }
        if (interfaceC0672e != null) {
            ((C0673f) interfaceC0672e).t(C0174m.f3840a);
        }
    }
}
