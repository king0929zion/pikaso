package d1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: d1.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203Z extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f4180e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f4181f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f4182g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f4183c;

    /* renamed from: d, reason: collision with root package name */
    public V0.c f4184d;

    public C0203Z() {
        this.f4183c = i();
    }

    private static WindowInsets i() {
        if (!f4181f) {
            try {
                f4180e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f4181f = true;
        }
        Field field = f4180e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!h) {
            try {
                f4182g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            h = true;
        }
        Constructor constructor = f4182g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // d1.d0
    public l0 b() {
        a();
        l0 d3 = l0.d(null, this.f4183c);
        V0.c[] cVarArr = this.f4196b;
        j0 j0Var = d3.f4228a;
        j0Var.o(cVarArr);
        j0Var.q(this.f4184d);
        return d3;
    }

    @Override // d1.d0
    public void e(V0.c cVar) {
        this.f4184d = cVar;
    }

    @Override // d1.d0
    public void g(V0.c cVar) {
        WindowInsets windowInsets = this.f4183c;
        if (windowInsets != null) {
            this.f4183c = windowInsets.replaceSystemWindowInsets(cVar.f2460a, cVar.f2461b, cVar.f2462c, cVar.f2463d);
        }
    }

    public C0203Z(l0 l0Var) {
        super(l0Var);
        this.f4183c = l0Var.c();
    }
}
