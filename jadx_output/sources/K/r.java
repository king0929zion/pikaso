package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f4862b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static r f4863c;

    /* renamed from: a, reason: collision with root package name */
    public C0338u0 f4864a;

    public static synchronized PorterDuffColorFilter b(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter e3;
        synchronized (r.class) {
            e3 = C0338u0.e(i3, mode);
        }
        return e3;
    }

    public static synchronized void c() {
        synchronized (r.class) {
            if (f4863c == null) {
                r rVar = new r();
                f4863c = rVar;
                rVar.f4864a = C0338u0.b();
                C0338u0 c0338u0 = f4863c.f4864a;
                C0330q c0330q = new C0330q();
                synchronized (c0338u0) {
                    c0338u0.f4885e = c0330q;
                }
            }
        }
    }

    public static void d(Drawable drawable, A1.e eVar, int[] iArr) {
        PorterDuff.Mode mode = C0338u0.f4879f;
        int[] state = drawable.getState();
        int[] iArr2 = U.f4718a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = eVar.f212b;
        if (!z3 && !eVar.f211a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z3 ? (ColorStateList) eVar.f213c : null;
        PorterDuff.Mode mode2 = eVar.f211a ? (PorterDuff.Mode) eVar.f214d : C0338u0.f4879f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = C0338u0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable a(Context context, int i3) {
        return this.f4864a.c(context, i3);
    }
}
