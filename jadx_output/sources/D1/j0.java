package d1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f4220b;

    /* renamed from: a, reason: collision with root package name */
    public final l0 f4221a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f4220b = (i3 >= 30 ? new c0() : i3 >= 29 ? new b0() : new C0203Z()).b().f4228a.a().f4228a.b().f4228a.c();
    }

    public j0(l0 l0Var) {
        this.f4221a = l0Var;
    }

    public l0 a() {
        return this.f4221a;
    }

    public l0 b() {
        return this.f4221a;
    }

    public l0 c() {
        return this.f4221a;
    }

    public void d(View view) {
    }

    public C0212i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return n() == j0Var.n() && m() == j0Var.m() && Objects.equals(j(), j0Var.j()) && Objects.equals(h(), j0Var.h()) && Objects.equals(e(), j0Var.e());
    }

    public V0.c f(int i3) {
        return V0.c.f2459e;
    }

    public V0.c g() {
        return j();
    }

    public V0.c h() {
        return V0.c.f2459e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public V0.c i() {
        return j();
    }

    public V0.c j() {
        return V0.c.f2459e;
    }

    public V0.c k() {
        return j();
    }

    public l0 l(int i3, int i4, int i5, int i6) {
        return f4220b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(V0.c[] cVarArr) {
    }

    public void p(l0 l0Var) {
    }

    public void q(V0.c cVar) {
    }
}
