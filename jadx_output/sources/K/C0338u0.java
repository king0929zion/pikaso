package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.ai.assistance.operit.provider.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import n.C0380G;
import n.C0393m;

/* renamed from: k.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338u0 {

    /* renamed from: g, reason: collision with root package name */
    public static C0338u0 f4880g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f4881a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f4882b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4883c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4884d;

    /* renamed from: e, reason: collision with root package name */
    public C0330q f4885e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f4879f = PorterDuff.Mode.SRC_IN;
    public static final C0336t0 h = new C0336t0(6);

    public static synchronized C0338u0 b() {
        C0338u0 c0338u0;
        synchronized (C0338u0.class) {
            try {
                if (f4880g == null) {
                    f4880g = new C0338u0();
                }
                c0338u0 = f4880g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0338u0;
    }

    public static synchronized PorterDuffColorFilter e(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0338u0.class) {
            C0336t0 c0336t0 = h;
            c0336t0.getClass();
            int i4 = (31 + i3) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c0336t0.a(Integer.valueOf(mode.hashCode() + i4));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i3) {
        Drawable drawable;
        if (this.f4883c == null) {
            this.f4883c = new TypedValue();
        }
        TypedValue typedValue = this.f4883c;
        context.getResources().getValue(i3, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C0393m c0393m = (C0393m) this.f4882b.get(context);
            drawable = null;
            if (c0393m != null) {
                WeakReference weakReference = (WeakReference) c0393m.b(j3);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        c0393m.f(j3);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f4885e != null) {
            if (i3 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i3 == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0330q.c(this, context, R.dimen.abc_star_big);
            } else if (i3 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0330q.c(this, context, R.dimen.abc_star_medium);
            } else if (i3 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0330q.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        C0393m c0393m2 = (C0393m) this.f4882b.get(context);
                        if (c0393m2 == null) {
                            c0393m2 = new C0393m((Object) null);
                            this.f4882b.put(context, c0393m2);
                        }
                        c0393m2.e(j3, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i3) {
        return d(context, i3);
    }

    public final synchronized Drawable d(Context context, int i3) {
        Drawable a3;
        try {
            if (!this.f4884d) {
                this.f4884d = true;
                Drawable c3 = c(context, R.drawable.abc_vector_test);
                if (c3 == null || (!(c3 instanceof E1.a) && !"android.graphics.drawable.VectorDrawable".equals(c3.getClass().getName()))) {
                    this.f4884d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a3 = a(context, i3);
            if (a3 == null) {
                a3 = T0.a.b(context, i3);
            }
            if (a3 != null) {
                a3 = g(context, i3, a3);
            }
            if (a3 != null) {
                U.a(a3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a3;
    }

    public final synchronized ColorStateList f(Context context, int i3) {
        ColorStateList colorStateList;
        C0380G c0380g;
        WeakHashMap weakHashMap = this.f4881a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c0380g = (C0380G) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0380g.c(i3);
        if (colorStateList == null) {
            C0330q c0330q = this.f4885e;
            if (c0330q != null) {
                colorStateList2 = c0330q.d(context, i3);
            }
            if (colorStateList2 != null) {
                if (this.f4881a == null) {
                    this.f4881a = new WeakHashMap();
                }
                C0380G c0380g2 = (C0380G) this.f4881a.get(context);
                if (c0380g2 == null) {
                    c0380g2 = new C0380G(0);
                    this.f4881a.put(context, c0380g2);
                }
                c0380g2.a(i3, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, android.graphics.drawable.Drawable r11) {
        /*
            r8 = this;
            r0 = 2130903265(0x7f0300e1, float:1.7413343E38)
            r1 = 2130903263(0x7f0300df, float:1.741334E38)
            android.content.res.ColorStateList r2 = r8.f(r9, r10)
            if (r2 == 0) goto L29
            int[] r9 = k.U.f4718a
            android.graphics.drawable.Drawable r11 = r11.mutate()
            W0.a.h(r11, r2)
            k.q r9 = r8.f4885e
            r0 = 0
            if (r9 != 0) goto L1b
            goto L22
        L1b:
            r9 = 2131165292(0x7f07006c, float:1.7944797E38)
            if (r10 != r9) goto L22
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
        L22:
            if (r0 == 0) goto Lf5
            W0.a.i(r11, r0)
            goto Lf5
        L29:
            k.q r2 = r8.f4885e
            if (r2 == 0) goto L98
            r2 = 2131165287(0x7f070067, float:1.7944787E38)
            r3 = 16908301(0x102000d, float:2.3877265E-38)
            r4 = 16908303(0x102000f, float:2.387727E-38)
            r5 = 16908288(0x1020000, float:2.387723E-38)
            if (r10 != r2) goto L62
            r10 = r11
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r5)
            int r5 = k.J0.c(r9, r0)
            android.graphics.PorterDuff$Mode r6 = k.r.f4862b
            k.C0330q.e(r2, r5)
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r4)
            int r0 = k.J0.c(r9, r0)
            k.C0330q.e(r2, r0)
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)
            int r9 = k.J0.c(r9, r1)
            k.C0330q.e(r10, r9)
            goto Lf5
        L62:
            r2 = 2131165278(0x7f07005e, float:1.7944769E38)
            if (r10 == r2) goto L71
            r2 = 2131165277(0x7f07005d, float:1.7944767E38)
            if (r10 == r2) goto L71
            r2 = 2131165279(0x7f07005f, float:1.794477E38)
            if (r10 != r2) goto L98
        L71:
            r10 = r11
            android.graphics.drawable.LayerDrawable r10 = (android.graphics.drawable.LayerDrawable) r10
            android.graphics.drawable.Drawable r2 = r10.findDrawableByLayerId(r5)
            int r0 = k.J0.b(r9, r0)
            android.graphics.PorterDuff$Mode r5 = k.r.f4862b
            k.C0330q.e(r2, r0)
            android.graphics.drawable.Drawable r0 = r10.findDrawableByLayerId(r4)
            int r2 = k.J0.c(r9, r1)
            k.C0330q.e(r0, r2)
            android.graphics.drawable.Drawable r10 = r10.findDrawableByLayerId(r3)
            int r9 = k.J0.c(r9, r1)
            k.C0330q.e(r10, r9)
            goto Lf5
        L98:
            k.q r2 = r8.f4885e
            r3 = 0
            if (r2 == 0) goto Lf5
            android.graphics.PorterDuff$Mode r4 = k.r.f4862b
            int[] r5 = r2.f4856a
            boolean r5 = k.C0330q.a(r5, r10)
            r6 = 1
            r7 = -1
            if (r5 == 0) goto Lac
        La9:
            r3 = r6
        Laa:
            r10 = r7
            goto Ldd
        Lac:
            int[] r0 = r2.f4858c
            boolean r0 = k.C0330q.a(r0, r10)
            if (r0 == 0) goto Lb6
        Lb4:
            r0 = r1
            goto La9
        Lb6:
            int[] r0 = r2.f4859d
            boolean r0 = k.C0330q.a(r0, r10)
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto Lc4
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto Lb4
        Lc4:
            r0 = 2131165264(0x7f070050, float:1.794474E38)
            if (r10 != r0) goto Ld5
            r10 = 1109603123(0x42233333, float:40.8)
            int r10 = java.lang.Math.round(r10)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r6
            goto Ldd
        Ld5:
            r0 = 2131165246(0x7f07003e, float:1.7944704E38)
            if (r10 != r0) goto Ldb
            goto Lb4
        Ldb:
            r0 = r3
            goto Laa
        Ldd:
            if (r3 == 0) goto Lf5
            int[] r1 = k.U.f4718a
            android.graphics.drawable.Drawable r1 = r11.mutate()
            int r9 = k.J0.c(r9, r0)
            android.graphics.PorterDuffColorFilter r9 = k.r.b(r9, r4)
            r1.setColorFilter(r9)
            if (r10 == r7) goto Lf5
            r1.setAlpha(r10)
        Lf5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0338u0.g(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
