package U1;

import U0.o;
import a.AbstractC0090a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2426b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2427c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2428d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2429e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2430f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2431g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2432i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f2433j;

    /* renamed from: k, reason: collision with root package name */
    public float f2434k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2435l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2436m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f2437n;

    public d(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, H1.a.f1352r);
        this.f2434k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f2433j = AbstractC0090a.F(context, obtainStyledAttributes, 3);
        AbstractC0090a.F(context, obtainStyledAttributes, 4);
        AbstractC0090a.F(context, obtainStyledAttributes, 5);
        this.f2427c = obtainStyledAttributes.getInt(2, 0);
        this.f2428d = obtainStyledAttributes.getInt(1, 1);
        int i4 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f2435l = obtainStyledAttributes.getResourceId(i4, 0);
        this.f2426b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.f2425a = AbstractC0090a.F(context, obtainStyledAttributes, 6);
        this.f2429e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f2430f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f2431g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i3, H1.a.f1345k);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.f2432i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f2437n;
        int i3 = this.f2427c;
        if (typeface == null && (str = this.f2426b) != null) {
            this.f2437n = Typeface.create(str, i3);
        }
        if (this.f2437n == null) {
            int i4 = this.f2428d;
            if (i4 == 1) {
                this.f2437n = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f2437n = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f2437n = Typeface.DEFAULT;
            } else {
                this.f2437n = Typeface.MONOSPACE;
            }
            this.f2437n = Typeface.create(this.f2437n, i3);
        }
    }

    public final Typeface b(Context context) {
        if (this.f2436m) {
            return this.f2437n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a3 = o.a(context, this.f2435l);
                this.f2437n = a3;
                if (a3 != null) {
                    this.f2437n = Typeface.create(a3, this.f2427c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e3) {
                Log.d("TextAppearance", "Error loading font " + this.f2426b, e3);
            }
        }
        a();
        this.f2436m = true;
        return this.f2437n;
    }

    public final void c(Context context, r2.a aVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i3 = this.f2435l;
        if (i3 == 0) {
            this.f2436m = true;
        }
        if (this.f2436m) {
            aVar.R(this.f2437n, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = o.f2403a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                o.b(context, i3, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f2436m = true;
            aVar.Q(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f2426b, e3);
            this.f2436m = true;
            aVar.Q(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i3 = this.f2435l;
        if (i3 != 0) {
            ThreadLocal threadLocal = o.f2403a;
            if (!context.isRestricted()) {
                typeface = o.b(context, i3, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, r2.a aVar) {
        f(context, textPaint, aVar);
        ColorStateList colorStateList = this.f2433j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f2425a;
        textPaint.setShadowLayer(this.f2431g, this.f2429e, this.f2430f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, r2.a aVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f2437n);
        c(context, new c(this, context, textPaint, aVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface T2 = AbstractC0090a.T(context.getResources().getConfiguration(), typeface);
        if (T2 != null) {
            typeface = T2;
        }
        textPaint.setTypeface(typeface);
        int i3 = (~typeface.getStyle()) & this.f2427c;
        textPaint.setFakeBoldText((i3 & 1) != 0);
        textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f2434k);
        if (this.h) {
            textPaint.setLetterSpacing(this.f2432i);
        }
    }
}
