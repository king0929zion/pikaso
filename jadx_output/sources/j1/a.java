package J1;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class a extends Q0.a {

    /* renamed from: a, reason: collision with root package name */
    public b f1430a;

    @Override // Q0.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        r(coordinatorLayout, view, i3);
        if (this.f1430a == null) {
            this.f1430a = new b(view);
        }
        b bVar = this.f1430a;
        View view2 = (View) bVar.f1433c;
        bVar.f1431a = view2.getTop();
        bVar.f1432b = view2.getLeft();
        b bVar2 = this.f1430a;
        View view3 = (View) bVar2.f1433c;
        int top = 0 - (view3.getTop() - bVar2.f1431a);
        Field field = AbstractC0189K.f4150a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f1432b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i3) {
        coordinatorLayout.q(view, i3);
    }
}
