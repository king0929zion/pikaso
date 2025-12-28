package z1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public C0742p f7073a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7074b;

    /* renamed from: c, reason: collision with root package name */
    public long f7075c;

    /* renamed from: d, reason: collision with root package name */
    public long f7076d;

    /* renamed from: e, reason: collision with root package name */
    public long f7077e;

    /* renamed from: f, reason: collision with root package name */
    public long f7078f;

    public final void a(I i3) {
        C0742p c0742p = this.f7073a;
        if (c0742p != null) {
            boolean z3 = true;
            i3.n(true);
            if ((i3.f6972b & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0742p.f7072a;
            recyclerView.C();
            B0.a aVar = recyclerView.f3541g;
            C0742p c0742p2 = (C0742p) aVar.f271b;
            int indexOfChild = c0742p2.f7072a.indexOfChild(null);
            if (indexOfChild == -1) {
                aVar.L(null);
            } else {
                C0728b c0728b = (C0728b) aVar.f272c;
                if (c0728b.d(indexOfChild)) {
                    c0728b.e(indexOfChild);
                    aVar.L(null);
                    c0742p2.a(indexOfChild);
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                I r3 = RecyclerView.r(null);
                C0724C c0724c = recyclerView.f3535d;
                c0724c.h(r3);
                c0724c.f(r3);
            }
            recyclerView.D(!z3);
            if (z3 || !i3.k()) {
                return;
            }
            recyclerView.removeDetachedView(null, false);
        }
    }

    public abstract void b(I i3);

    public abstract void c();

    public abstract boolean d();
}
