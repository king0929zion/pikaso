package z1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6995a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f6996b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f6997c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f6998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f6999e;

    public O(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f6999e = staggeredGridLayoutManager;
        this.f6998d = i3;
    }

    public final int a(int i3) {
        int i4 = this.f6997c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f6995a.size() == 0) {
            return i3;
        }
        View view = (View) this.f6995a.get(r3.size() - 1);
        L l3 = (L) view.getLayoutParams();
        this.f6997c = this.f6999e.f3565j.b(view);
        l3.getClass();
        return this.f6997c;
    }
}
