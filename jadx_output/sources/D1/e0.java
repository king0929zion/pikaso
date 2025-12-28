package d1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class e0 extends j0 {
    public static boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f4197i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f4198j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f4199k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f4200l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f4201c;

    /* renamed from: d, reason: collision with root package name */
    public V0.c[] f4202d;

    /* renamed from: e, reason: collision with root package name */
    public V0.c f4203e;

    /* renamed from: f, reason: collision with root package name */
    public l0 f4204f;

    /* renamed from: g, reason: collision with root package name */
    public V0.c f4205g;

    public e0(l0 l0Var, WindowInsets windowInsets) {
        super(l0Var);
        this.f4203e = null;
        this.f4201c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private V0.c r(int i3, boolean z3) {
        V0.c cVar = V0.c.f2459e;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                cVar = V0.c.a(cVar, s(i4, z3));
            }
        }
        return cVar;
    }

    private V0.c t() {
        l0 l0Var = this.f4204f;
        return l0Var != null ? l0Var.f4228a.h() : V0.c.f2459e;
    }

    private V0.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = f4197i;
        if (method != null && f4198j != null && f4199k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f4199k.get(f4200l.get(invoke));
                if (rect != null) {
                    return V0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f4197i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f4198j = cls;
            f4199k = cls.getDeclaredField("mVisibleInsets");
            f4200l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4199k.setAccessible(true);
            f4200l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        h = true;
    }

    @Override // d1.j0
    public void d(View view) {
        V0.c u3 = u(view);
        if (u3 == null) {
            u3 = V0.c.f2459e;
        }
        w(u3);
    }

    @Override // d1.j0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f4205g, ((e0) obj).f4205g);
        }
        return false;
    }

    @Override // d1.j0
    public V0.c f(int i3) {
        return r(i3, false);
    }

    @Override // d1.j0
    public final V0.c j() {
        if (this.f4203e == null) {
            WindowInsets windowInsets = this.f4201c;
            this.f4203e = V0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4203e;
    }

    @Override // d1.j0
    public l0 l(int i3, int i4, int i5, int i6) {
        l0 d3 = l0.d(null, this.f4201c);
        int i7 = Build.VERSION.SDK_INT;
        d0 c0Var = i7 >= 30 ? new c0(d3) : i7 >= 29 ? new b0(d3) : new C0203Z(d3);
        c0Var.g(l0.b(j(), i3, i4, i5, i6));
        c0Var.e(l0.b(h(), i3, i4, i5, i6));
        return c0Var.b();
    }

    @Override // d1.j0
    public boolean n() {
        return this.f4201c.isRound();
    }

    @Override // d1.j0
    public void o(V0.c[] cVarArr) {
        this.f4202d = cVarArr;
    }

    @Override // d1.j0
    public void p(l0 l0Var) {
        this.f4204f = l0Var;
    }

    public V0.c s(int i3, boolean z3) {
        V0.c h3;
        int i4;
        if (i3 == 1) {
            return z3 ? V0.c.b(0, Math.max(t().f2461b, j().f2461b), 0, 0) : V0.c.b(0, j().f2461b, 0, 0);
        }
        if (i3 == 2) {
            if (z3) {
                V0.c t3 = t();
                V0.c h4 = h();
                return V0.c.b(Math.max(t3.f2460a, h4.f2460a), 0, Math.max(t3.f2462c, h4.f2462c), Math.max(t3.f2463d, h4.f2463d));
            }
            V0.c j3 = j();
            l0 l0Var = this.f4204f;
            h3 = l0Var != null ? l0Var.f4228a.h() : null;
            int i5 = j3.f2463d;
            if (h3 != null) {
                i5 = Math.min(i5, h3.f2463d);
            }
            return V0.c.b(j3.f2460a, 0, j3.f2462c, i5);
        }
        V0.c cVar = V0.c.f2459e;
        if (i3 == 8) {
            V0.c[] cVarArr = this.f4202d;
            h3 = cVarArr != null ? cVarArr[3] : null;
            if (h3 != null) {
                return h3;
            }
            V0.c j4 = j();
            V0.c t4 = t();
            int i6 = j4.f2463d;
            if (i6 > t4.f2463d) {
                return V0.c.b(0, 0, 0, i6);
            }
            V0.c cVar2 = this.f4205g;
            return (cVar2 == null || cVar2.equals(cVar) || (i4 = this.f4205g.f2463d) <= t4.f2463d) ? cVar : V0.c.b(0, 0, 0, i4);
        }
        if (i3 == 16) {
            return i();
        }
        if (i3 == 32) {
            return g();
        }
        if (i3 == 64) {
            return k();
        }
        if (i3 != 128) {
            return cVar;
        }
        l0 l0Var2 = this.f4204f;
        C0212i e3 = l0Var2 != null ? l0Var2.f4228a.e() : e();
        if (e3 == null) {
            return cVar;
        }
        int i7 = Build.VERSION.SDK_INT;
        return V0.c.b(i7 >= 28 ? AbstractC0211h.d(e3.f4218a) : 0, i7 >= 28 ? AbstractC0211h.f(e3.f4218a) : 0, i7 >= 28 ? AbstractC0211h.e(e3.f4218a) : 0, i7 >= 28 ? AbstractC0211h.c(e3.f4218a) : 0);
    }

    public void w(V0.c cVar) {
        this.f4205g = cVar;
    }
}
