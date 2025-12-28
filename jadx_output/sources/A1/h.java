package A1;

import android.view.View;
import com.ai.assistance.operit.provider.R;

/* loaded from: classes.dex */
public final class h extends p2.h implements o2.c {

    /* renamed from: f, reason: collision with root package name */
    public static final h f218f = new h(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final h f219g = new h(1, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, int i4) {
        super(i3);
        this.f220e = i4;
    }

    @Override // o2.c
    public final Object i(Object obj) {
        switch (this.f220e) {
            case 0:
                View view = (View) obj;
                p2.g.e(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                p2.g.e(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof g) {
                    return (g) tag;
                }
                return null;
        }
    }
}
