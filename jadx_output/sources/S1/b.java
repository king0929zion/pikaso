package S1;

import a.AbstractC0090a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f2236A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f2237B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2238C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f2240E;

    /* renamed from: F, reason: collision with root package name */
    public float f2241F;

    /* renamed from: G, reason: collision with root package name */
    public float f2242G;

    /* renamed from: H, reason: collision with root package name */
    public float f2243H;

    /* renamed from: I, reason: collision with root package name */
    public float f2244I;

    /* renamed from: J, reason: collision with root package name */
    public float f2245J;

    /* renamed from: K, reason: collision with root package name */
    public int f2246K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f2247L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2248M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f2249N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f2250O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f2251P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f2252Q;

    /* renamed from: R, reason: collision with root package name */
    public float f2253R;

    /* renamed from: S, reason: collision with root package name */
    public float f2254S;

    /* renamed from: T, reason: collision with root package name */
    public float f2255T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f2256U;

    /* renamed from: V, reason: collision with root package name */
    public float f2257V;

    /* renamed from: W, reason: collision with root package name */
    public float f2258W;

    /* renamed from: X, reason: collision with root package name */
    public float f2259X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f2260Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f2261Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2262a;

    /* renamed from: a0, reason: collision with root package name */
    public float f2263a0;

    /* renamed from: b, reason: collision with root package name */
    public float f2264b;

    /* renamed from: b0, reason: collision with root package name */
    public float f2265b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2266c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f2267c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2268d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f2270e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2276j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2277k;

    /* renamed from: l, reason: collision with root package name */
    public float f2278l;

    /* renamed from: m, reason: collision with root package name */
    public float f2279m;

    /* renamed from: n, reason: collision with root package name */
    public float f2280n;

    /* renamed from: o, reason: collision with root package name */
    public float f2281o;

    /* renamed from: p, reason: collision with root package name */
    public float f2282p;

    /* renamed from: q, reason: collision with root package name */
    public float f2283q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f2284r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f2285s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f2286t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f2287u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f2288v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f2289w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f2290x;

    /* renamed from: y, reason: collision with root package name */
    public U1.a f2291y;

    /* renamed from: f, reason: collision with root package name */
    public int f2272f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f2274g = 16;
    public float h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f2275i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f2292z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f2239D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f2269d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f2271e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f2273f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f2262a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f2249N = textPaint;
        this.f2250O = new TextPaint(textPaint);
        this.f2268d = new Rect();
        this.f2266c = new Rect();
        this.f2270e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f3, int i3, int i4) {
        float f4 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i4) * f3) + (Color.alpha(i3) * f4)), Math.round((Color.red(i4) * f3) + (Color.red(i3) * f4)), Math.round((Color.green(i4) * f3) + (Color.green(i3) * f4)), Math.round((Color.blue(i4) * f3) + (Color.blue(i3) * f4)));
    }

    public static float f(float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return I1.a.a(f3, f4, f5);
    }

    public final boolean b(CharSequence charSequence) {
        Field field = AbstractC0189K.f4150a;
        boolean z3 = this.f2262a.getLayoutDirection() == 1;
        if (this.f2239D) {
            return (z3 ? b1.f.f3660d : b1.f.f3659c).b(charSequence.length(), charSequence);
        }
        return z3;
    }

    public final void c(float f3, boolean z3) {
        float f4;
        float f5;
        Typeface typeface;
        boolean z4;
        Layout.Alignment alignment;
        if (this.f2236A == null) {
            return;
        }
        float width = this.f2268d.width();
        float width2 = this.f2266c.width();
        if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
            f4 = this.f2275i;
            f5 = this.f2257V;
            this.f2241F = 1.0f;
            typeface = this.f2284r;
        } else {
            float f6 = this.h;
            float f7 = this.f2258W;
            Typeface typeface2 = this.f2287u;
            if (Math.abs(f3 - 0.0f) < 1.0E-5f) {
                this.f2241F = 1.0f;
            } else {
                this.f2241F = f(this.h, this.f2275i, f3, this.f2252Q) / this.h;
            }
            float f8 = this.f2275i / this.h;
            width = (!z3 && width2 * f8 > width) ? Math.min(width / f8, width2) : width2;
            f4 = f6;
            f5 = f7;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f2249N;
        if (width > 0.0f) {
            boolean z5 = this.f2242G != f4;
            boolean z6 = this.f2259X != f5;
            boolean z7 = this.f2290x != typeface;
            StaticLayout staticLayout = this.f2260Y;
            boolean z8 = z5 || z6 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z7 || this.f2248M;
            this.f2242G = f4;
            this.f2259X = f5;
            this.f2290x = typeface;
            this.f2248M = false;
            textPaint.setLinearText(this.f2241F != 1.0f);
            z4 = z8;
        } else {
            z4 = false;
        }
        if (this.f2237B == null || z4) {
            textPaint.setTextSize(this.f2242G);
            textPaint.setTypeface(this.f2290x);
            textPaint.setLetterSpacing(this.f2259X);
            boolean b3 = b(this.f2236A);
            this.f2238C = b3;
            int i3 = this.f2269d0;
            if (i3 <= 1 || b3) {
                i3 = 1;
            }
            if (i3 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f2272f, b3 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f2238C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f2238C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            g gVar = new g(this.f2236A, textPaint, (int) width);
            gVar.f2310k = this.f2292z;
            gVar.f2309j = b3;
            gVar.f2305e = alignment;
            gVar.f2308i = false;
            gVar.f2306f = i3;
            gVar.f2307g = this.f2271e0;
            gVar.h = this.f2273f0;
            StaticLayout a3 = gVar.a();
            a3.getClass();
            this.f2260Y = a3;
            this.f2237B = a3.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f2250O;
        textPaint.setTextSize(this.f2275i);
        textPaint.setTypeface(this.f2284r);
        textPaint.setLetterSpacing(this.f2257V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f2247L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f2286t;
            if (typeface != null) {
                this.f2285s = AbstractC0090a.T(configuration, typeface);
            }
            Typeface typeface2 = this.f2289w;
            if (typeface2 != null) {
                this.f2288v = AbstractC0090a.T(configuration, typeface2);
            }
            Typeface typeface3 = this.f2285s;
            if (typeface3 == null) {
                typeface3 = this.f2286t;
            }
            this.f2284r = typeface3;
            Typeface typeface4 = this.f2288v;
            if (typeface4 == null) {
                typeface4 = this.f2289w;
            }
            this.f2287u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z3) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f2262a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z3) {
            return;
        }
        c(1.0f, z3);
        CharSequence charSequence = this.f2237B;
        TextPaint textPaint = this.f2249N;
        if (charSequence != null && (staticLayout = this.f2260Y) != null) {
            this.f2267c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f2292z);
        }
        CharSequence charSequence2 = this.f2267c0;
        if (charSequence2 != null) {
            this.f2261Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f2261Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f2274g, this.f2238C ? 1 : 0);
        int i3 = absoluteGravity & 112;
        Rect rect = this.f2268d;
        if (i3 == 48) {
            this.f2279m = rect.top;
        } else if (i3 != 80) {
            this.f2279m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f2279m = textPaint.ascent() + rect.bottom;
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f2281o = rect.centerX() - (this.f2261Z / 2.0f);
        } else if (i4 != 5) {
            this.f2281o = rect.left;
        } else {
            this.f2281o = rect.right - this.f2261Z;
        }
        c(0.0f, z3);
        float height = this.f2260Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f2260Y;
        if (staticLayout2 == null || this.f2269d0 <= 1) {
            CharSequence charSequence3 = this.f2237B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f2260Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f2272f, this.f2238C ? 1 : 0);
        int i5 = absoluteGravity2 & 112;
        Rect rect2 = this.f2266c;
        if (i5 == 48) {
            this.f2278l = rect2.top;
        } else if (i5 != 80) {
            this.f2278l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f2278l = textPaint.descent() + (rect2.bottom - height);
        }
        int i6 = absoluteGravity2 & 8388615;
        if (i6 == 1) {
            this.f2280n = rect2.centerX() - (measureText / 2.0f);
        } else if (i6 != 5) {
            this.f2280n = rect2.left;
        } else {
            this.f2280n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f2240E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f2240E = null;
        }
        l(this.f2264b);
        float f3 = this.f2264b;
        float f4 = f(rect2.left, rect.left, f3, this.f2251P);
        RectF rectF = this.f2270e;
        rectF.left = f4;
        rectF.top = f(this.f2278l, this.f2279m, f3, this.f2251P);
        rectF.right = f(rect2.right, rect.right, f3, this.f2251P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f3, this.f2251P);
        this.f2282p = f(this.f2280n, this.f2281o, f3, this.f2251P);
        this.f2283q = f(this.f2278l, this.f2279m, f3, this.f2251P);
        l(f3);
        t1.a aVar = I1.a.f1391b;
        this.f2263a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f3, aVar);
        Field field = AbstractC0189K.f4150a;
        textInputLayout.postInvalidateOnAnimation();
        this.f2265b0 = f(1.0f, 0.0f, f3, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f2277k;
        ColorStateList colorStateList2 = this.f2276j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f3, e(colorStateList2), e(this.f2277k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f5 = this.f2257V;
        float f6 = this.f2258W;
        if (f5 != f6) {
            textPaint.setLetterSpacing(f(f6, f5, f3, aVar));
        } else {
            textPaint.setLetterSpacing(f5);
        }
        this.f2243H = I1.a.a(0.0f, this.f2253R, f3);
        this.f2244I = I1.a.a(0.0f, this.f2254S, f3);
        this.f2245J = I1.a.a(0.0f, this.f2255T, f3);
        int a3 = a(f3, 0, e(this.f2256U));
        this.f2246K = a3;
        textPaint.setShadowLayer(this.f2243H, this.f2244I, this.f2245J, a3);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f2277k == colorStateList && this.f2276j == colorStateList) {
            return;
        }
        this.f2277k = colorStateList;
        this.f2276j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        U1.a aVar = this.f2291y;
        if (aVar != null) {
            aVar.f2418d = true;
        }
        if (this.f2286t == typeface) {
            return false;
        }
        this.f2286t = typeface;
        Typeface T2 = AbstractC0090a.T(this.f2262a.getContext().getResources().getConfiguration(), typeface);
        this.f2285s = T2;
        if (T2 == null) {
            T2 = this.f2286t;
        }
        this.f2284r = T2;
        return true;
    }

    public final void k(float f3) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f3 != this.f2264b) {
            this.f2264b = f3;
            float f4 = this.f2266c.left;
            Rect rect = this.f2268d;
            float f5 = f(f4, rect.left, f3, this.f2251P);
            RectF rectF = this.f2270e;
            rectF.left = f5;
            rectF.top = f(this.f2278l, this.f2279m, f3, this.f2251P);
            rectF.right = f(r1.right, rect.right, f3, this.f2251P);
            rectF.bottom = f(r1.bottom, rect.bottom, f3, this.f2251P);
            this.f2282p = f(this.f2280n, this.f2281o, f3, this.f2251P);
            this.f2283q = f(this.f2278l, this.f2279m, f3, this.f2251P);
            l(f3);
            t1.a aVar = I1.a.f1391b;
            this.f2263a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f3, aVar);
            Field field = AbstractC0189K.f4150a;
            TextInputLayout textInputLayout = this.f2262a;
            textInputLayout.postInvalidateOnAnimation();
            this.f2265b0 = f(1.0f, 0.0f, f3, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f2277k;
            ColorStateList colorStateList2 = this.f2276j;
            TextPaint textPaint = this.f2249N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f3, e(colorStateList2), e(this.f2277k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f6 = this.f2257V;
            float f7 = this.f2258W;
            if (f6 != f7) {
                textPaint.setLetterSpacing(f(f7, f6, f3, aVar));
            } else {
                textPaint.setLetterSpacing(f6);
            }
            this.f2243H = I1.a.a(0.0f, this.f2253R, f3);
            this.f2244I = I1.a.a(0.0f, this.f2254S, f3);
            this.f2245J = I1.a.a(0.0f, this.f2255T, f3);
            int a3 = a(f3, 0, e(this.f2256U));
            this.f2246K = a3;
            textPaint.setShadowLayer(this.f2243H, this.f2244I, this.f2245J, a3);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f3) {
        c(f3, false);
        Field field = AbstractC0189K.f4150a;
        this.f2262a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z3;
        boolean j3 = j(typeface);
        if (this.f2289w != typeface) {
            this.f2289w = typeface;
            Typeface T2 = AbstractC0090a.T(this.f2262a.getContext().getResources().getConfiguration(), typeface);
            this.f2288v = T2;
            if (T2 == null) {
                T2 = this.f2289w;
            }
            this.f2287u = T2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (j3 || z3) {
            h(false);
        }
    }
}
