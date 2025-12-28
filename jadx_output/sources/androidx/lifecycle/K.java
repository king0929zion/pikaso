package androidx.lifecycle;

import android.view.View;
import com.ai.assistance.operit.provider.R;

/* loaded from: classes.dex */
public final class K extends p2.h implements o2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final K f3458f = new K(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final K f3459g = new K(1, 1);
    public static final K h = new K(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final K f3460i = new K(1, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i3, int i4) {
        super(i3);
        this.f3461e = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f3461e) {
            case 0:
                View view = (View) obj;
                p2.g.e(view, "currentView");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View view2 = (View) obj;
                p2.g.e(view2, "viewParent");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof r) {
                    return (r) tag;
                }
                return null;
            case 2:
                View view3 = (View) obj;
                p2.g.e(view3, "view");
                Object parent2 = view3.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view4 = (View) obj;
                p2.g.e(view4, "view");
                Object tag2 = view4.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof J) {
                    return (J) tag2;
                }
                return null;
        }
    }
}
