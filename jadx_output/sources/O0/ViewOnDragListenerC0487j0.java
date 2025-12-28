package o0;

import D.C0065y;
import P.k;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import n.C0382b;
import n.C0387g;
import n0.AbstractC0409C;
import o0.ViewOnDragListenerC0487j0;

/* renamed from: o0.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnDragListenerC0487j0 implements View.OnDragListener, S.a {

    /* renamed from: a, reason: collision with root package name */
    public final S.d f5595a = new S.d();

    /* renamed from: b, reason: collision with root package name */
    public final C0387g f5596b = new C0387g(0);

    /* renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f5597c = new n0.P() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // n0.P
        public final k d() {
            return ViewOnDragListenerC0487j0.this.f5595a;
        }

        @Override // n0.P
        public final /* bridge */ /* synthetic */ void e(k kVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return ViewOnDragListenerC0487j0.this.f5595a.hashCode();
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        A.t tVar = new A.t(11, dragEvent);
        int action = dragEvent.getAction();
        S.d dVar = this.f5595a;
        n0.n0 n0Var = n0.n0.f5270d;
        switch (action) {
            case 1:
                p2.m mVar = new p2.m();
                C0065y c0065y = new C0065y(tVar, dVar, mVar);
                if (c0065y.i(dVar) == n0Var) {
                    AbstractC0409C.t(dVar, c0065y);
                }
                boolean z3 = mVar.f5958d;
                C0387g c0387g = this.f5596b;
                c0387g.getClass();
                C0382b c0382b = new C0382b(c0387g);
                while (c0382b.hasNext()) {
                    ((S.d) c0382b.next()).j0(tVar);
                }
                break;
            case 2:
                dVar.i0(tVar);
                break;
            case 4:
                S.c cVar = new S.c(1);
                if (cVar.i(dVar) == n0Var) {
                    AbstractC0409C.t(dVar, cVar);
                    break;
                }
                break;
            case 5:
                dVar.g0(tVar);
                break;
            case 6:
                dVar.h0(tVar);
                break;
        }
        return false;
    }
}
