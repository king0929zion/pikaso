package o0;

import D.C0032d;
import D.C0048l;
import D.C0052n;
import android.view.View;
import c2.C0174m;
import com.ai.assistance.operit.provider.R;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class a1 extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f5545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L.a f5546g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, L.a aVar, int i3) {
        super(2);
        this.f5544e = i3;
        this.f5545f = b1Var;
        this.f5546g = aVar;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        switch (this.f5544e) {
            case 0:
                C0052n c0052n = (C0052n) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0052n.y()) {
                    c0052n.K();
                } else {
                    S.a(this.f5545f.f5551d, this.f5546g, c0052n, 0);
                }
                break;
            default:
                C0052n c0052n2 = (C0052n) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0052n2.y()) {
                    c0052n2.K();
                } else {
                    b1 b1Var = this.f5545f;
                    Object tag = b1Var.f5551d.getTag(R.id.inspection_slot_table_set);
                    Set set = (tag instanceof Set) && (!(tag instanceof q2.a) || (tag instanceof q2.e)) ? (Set) tag : null;
                    C0507u c0507u = b1Var.f5551d;
                    if (set == null) {
                        Object parent = c0507u.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof q2.a) && !(tag2 instanceof q2.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0052n2.f808c);
                        c0052n2.f820p = true;
                        c0052n2.f830z = true;
                        c0052n2.f808c.f654l = new HashMap();
                        D.B0 b02 = c0052n2.f797E;
                        b02.getClass();
                        b02.f654l = new HashMap();
                        D.D0 d02 = c0052n2.f798F;
                        D.B0 b03 = d02.f665a;
                        d02.f669e = b03.f654l;
                        d02.f670f = b03.f655m;
                    }
                    boolean h = c0052n2.h(b1Var);
                    Object H2 = c0052n2.H();
                    D.U u3 = C0048l.f781a;
                    if (h || H2 == u3) {
                        H2 = new Y0(b1Var, null);
                        c0052n2.V(H2);
                    }
                    C0032d.d(c0052n2, c0507u, (o2.e) H2);
                    boolean h3 = c0052n2.h(b1Var);
                    Object H3 = c0052n2.H();
                    if (h3 || H3 == u3) {
                        H3 = new Z0(b1Var, null);
                        c0052n2.V(H3);
                    }
                    C0032d.d(c0052n2, c0507u, (o2.e) H3);
                    C0032d.a(O.b.f1873a.a(set), L.b.b(-1193460702, new a1(b1Var, this.f5546g, 0), c0052n2), c0052n2, 56);
                }
                break;
        }
        return C0174m.f3840a;
    }
}
