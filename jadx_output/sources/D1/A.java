package D1;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.ai.assistance.operit.provider.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f943c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f944d;

    public A(j jVar, ViewGroup viewGroup, View view, View view2) {
        this.f944d = jVar;
        this.f941a = viewGroup;
        this.f942b = view;
        this.f943c = view2;
    }

    @Override // D1.p, D1.n
    public final void c() {
        this.f941a.getOverlay().remove(this.f942b);
    }

    @Override // D1.n
    public final void d(o oVar) {
        this.f943c.setTag(R.id.save_overlay_view, null);
        this.f941a.getOverlay().remove(this.f942b);
        oVar.u(this);
    }

    @Override // D1.p, D1.n
    public final void e() {
        View view = this.f942b;
        if (view.getParent() == null) {
            this.f941a.getOverlay().add(view);
            return;
        }
        j jVar = this.f944d;
        ArrayList arrayList = jVar.f1011p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = jVar.f1015t;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) jVar.f1015t.clone();
        int size2 = arrayList3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((n) arrayList3.get(i3)).a();
        }
    }
}
