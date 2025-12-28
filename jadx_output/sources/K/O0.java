package k;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class O0 implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4697d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4698e;

    public O0(U0 u02) {
        this.f4698e = u02;
        u02.f4720a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4697d) {
            case 0:
                Q0 q02 = ((Toolbar) this.f4698e).f3224N;
                j.j jVar = q02 == null ? null : q02.f4712e;
                if (jVar != null) {
                    jVar.collapseActionView();
                    break;
                }
                break;
            default:
                U0 u02 = (U0) this.f4698e;
                if (u02.f4729k != null) {
                    u02.getClass();
                    break;
                }
                break;
        }
    }

    public O0(Toolbar toolbar) {
        this.f4698e = toolbar;
    }
}
