package k;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: k.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319k0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0323m0 f4808a;

    public C0319k0(AbstractC0323m0 abstractC0323m0) {
        this.f4808a = abstractC0323m0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        if (i3 == 1) {
            AbstractC0323m0 abstractC0323m0 = this.f4808a;
            if (abstractC0323m0.f4842y.getInputMethodMode() == 2 || abstractC0323m0.f4842y.getContentView() == null) {
                return;
            }
            Handler handler = abstractC0323m0.f4838u;
            RunnableC0315i0 runnableC0315i0 = abstractC0323m0.f4834q;
            handler.removeCallbacks(runnableC0315i0);
            runnableC0315i0.run();
        }
    }
}
