package k;

import androidx.appcompat.widget.SearchView;

/* renamed from: k.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0346y0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SearchView f4900e;

    public /* synthetic */ RunnableC0346y0(SearchView searchView, int i3) {
        this.f4899d = i3;
        this.f4900e = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4899d) {
            case 0:
                this.f4900e.r();
                break;
            default:
                k1.b bVar = this.f4900e.f3186R;
                if (bVar instanceof I0) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
