package k;

import android.content.Context;
import android.view.View;
import com.ai.assistance.operit.provider.R;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306e extends j.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4757l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0312h f4758m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0306e(C0312h c0312h, Context context, j.i iVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, iVar, true);
        this.f4758m = c0312h;
        this.f4572f = 8388613;
        A.t tVar = c0312h.f4797y;
        this.h = tVar;
        j.k kVar = this.f4574i;
        if (kVar != null) {
            kVar.k(tVar);
        }
    }

    @Override // j.n
    public final void c() {
        switch (this.f4757l) {
            case 0:
                C0312h c0312h = this.f4758m;
                c0312h.f4794v = null;
                c0312h.getClass();
                super.c();
                break;
            default:
                C0312h c0312h2 = this.f4758m;
                j.i iVar = c0312h2.f4779f;
                if (iVar != null) {
                    iVar.c(true);
                }
                c0312h2.f4793u = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0306e(C0312h c0312h, Context context, j.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f4758m = c0312h;
        if (!tVar.f4596w.d()) {
            View view2 = c0312h.f4783k;
            this.f4571e = view2 == null ? c0312h.f4782j : view2;
        }
        A.t tVar2 = c0312h.f4797y;
        this.h = tVar2;
        j.k kVar = this.f4574i;
        if (kVar != null) {
            kVar.k(tVar2);
        }
    }
}
