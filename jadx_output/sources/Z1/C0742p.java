package z1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: z1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7072a;

    public /* synthetic */ C0742p(RecyclerView recyclerView) {
        this.f7072a = recyclerView;
    }

    public void a(int i3) {
        RecyclerView recyclerView = this.f7072a;
        View childAt = recyclerView.getChildAt(i3);
        if (childAt != null) {
            RecyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i3);
    }
}
