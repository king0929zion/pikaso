package k;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class M0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f4695e;

    public /* synthetic */ M0(Toolbar toolbar, int i3) {
        this.f4694d = i3;
        this.f4695e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4694d) {
            case 0:
                Q0 q02 = this.f4695e.f3224N;
                j.j jVar = q02 == null ? null : q02.f4712e;
                if (jVar != null) {
                    jVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f4695e.n();
                break;
        }
    }
}
