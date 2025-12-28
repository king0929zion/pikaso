package k;

import android.database.DataSetObserver;

/* renamed from: k.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317j0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4807b;

    public /* synthetic */ C0317j0(int i3, Object obj) {
        this.f4806a = i3;
        this.f4807b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f4806a) {
            case 0:
                AbstractC0323m0 abstractC0323m0 = (AbstractC0323m0) this.f4807b;
                if (abstractC0323m0.f4842y.isShowing()) {
                    abstractC0323m0.b();
                    break;
                }
                break;
            default:
                I0 i0 = (I0) this.f4807b;
                i0.f4904d = true;
                i0.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f4806a) {
            case 0:
                ((AbstractC0323m0) this.f4807b).e();
                break;
            default:
                I0 i0 = (I0) this.f4807b;
                i0.f4904d = false;
                i0.notifyDataSetInvalidated();
                break;
        }
    }
}
