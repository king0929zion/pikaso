package k;

import A.AbstractC0000a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4636a;

    /* renamed from: b, reason: collision with root package name */
    public A1.e f4637b;

    /* renamed from: c, reason: collision with root package name */
    public A1.e f4638c;

    /* renamed from: d, reason: collision with root package name */
    public A1.e f4639d;

    /* renamed from: e, reason: collision with root package name */
    public A1.e f4640e;

    /* renamed from: f, reason: collision with root package name */
    public A1.e f4641f;

    /* renamed from: g, reason: collision with root package name */
    public A1.e f4642g;
    public A1.e h;

    /* renamed from: i, reason: collision with root package name */
    public final Q f4643i;

    /* renamed from: j, reason: collision with root package name */
    public int f4644j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4645k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f4646l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4647m;

    public F(TextView textView) {
        this.f4636a = textView;
        this.f4643i = new Q(textView);
    }

    public static A1.e c(Context context, r rVar, int i3) {
        ColorStateList f3;
        synchronized (rVar) {
            f3 = rVar.f4864a.f(context, i3);
        }
        if (f3 == null) {
            return null;
        }
        A1.e eVar = new A1.e();
        eVar.f212b = true;
        eVar.f213c = f3;
        return eVar;
    }

    public final void a(Drawable drawable, A1.e eVar) {
        if (drawable == null || eVar == null) {
            return;
        }
        r.d(drawable, eVar, this.f4636a.getDrawableState());
    }

    public final void b() {
        A1.e eVar = this.f4637b;
        TextView textView = this.f4636a;
        if (eVar != null || this.f4638c != null || this.f4639d != null || this.f4640e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f4637b);
            a(compoundDrawables[1], this.f4638c);
            a(compoundDrawables[2], this.f4639d);
            a(compoundDrawables[3], this.f4640e);
        }
        if (this.f4641f == null && this.f4642g == null) {
            return;
        }
        Drawable[] a3 = AbstractC0297B.a(textView);
        a(a3[0], this.f4641f);
        a(a3[2], this.f4642g);
    }

    public final void d(AttributeSet attributeSet, int i3) {
        r rVar;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        boolean z5;
        int i4;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6;
        TextView textView = this.f4636a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = r.f4862b;
        synchronized (r.class) {
            try {
                if (r.f4863c == null) {
                    r.c();
                }
                rVar = r.f4863c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = AbstractC0262a.f4296f;
        B0.a y3 = B0.a.y(context, attributeSet, iArr, i3);
        TextView textView2 = this.f4636a;
        AbstractC0189K.i(textView2, textView2.getContext(), iArr, attributeSet, (TypedArray) y3.f272c, i3);
        TypedArray typedArray = (TypedArray) y3.f272c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f4637b = c(context, rVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f4638c = c(context, rVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f4639d = c(context, rVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f4640e = c(context, rVar, typedArray.getResourceId(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f4641f = c(context, rVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f4642g = c(context, rVar, typedArray.getResourceId(6, 0));
        }
        y3.C();
        boolean z6 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0262a.f4308s;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            B0.a aVar = new B0.a(context, obtainStyledAttributes);
            if (z6 || !obtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z4 = false;
            } else {
                z4 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            k(context, aVar);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i6 = 13;
            } else {
                i6 = 13;
                str2 = null;
            }
            str = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getString(i6) : null;
            aVar.C();
        } else {
            z3 = false;
            z4 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        B0.a aVar2 = new B0.a(context, obtainStyledAttributes2);
        if (z6 || !obtainStyledAttributes2.hasValue(14)) {
            z5 = z4;
        } else {
            z5 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, aVar2);
        aVar2.C();
        if (!z6 && z3) {
            this.f4636a.setAllCaps(z5);
        }
        Typeface typeface = this.f4646l;
        if (typeface != null) {
            if (this.f4645k == -1) {
                textView.setTypeface(typeface, this.f4644j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            D.d(textView, str);
        }
        if (str2 != null) {
            C.b(textView, C.a(str2));
        }
        int[] iArr3 = AbstractC0262a.f4297g;
        Q q3 = this.f4643i;
        Context context2 = q3.f4709j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i3, 0);
        TextView textView3 = q3.f4708i;
        AbstractC0189K.i(textView3, textView3.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i3);
        if (obtainStyledAttributes3.hasValue(5)) {
            q3.f4701a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                q3.f4706f = Q.b(iArr4);
                q3.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!q3.j()) {
            q3.f4701a = 0;
        } else if (q3.f4701a == 1) {
            if (!q3.f4707g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                q3.k(dimension2, dimension3, dimension);
            }
            q3.h();
        }
        if (Y0.f4739a && q3.f4701a != 0) {
            int[] iArr5 = q3.f4706f;
            if (iArr5.length > 0) {
                if (D.a(textView) != -1.0f) {
                    D.b(textView, Math.round(q3.f4704d), Math.round(q3.f4705e), Math.round(q3.f4703c), 0);
                } else {
                    D.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a3 = resourceId4 != -1 ? rVar.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a4 = resourceId5 != -1 ? rVar.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a5 = resourceId6 != -1 ? rVar.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a6 = resourceId7 != -1 ? rVar.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a7 = resourceId8 != -1 ? rVar.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a8 = resourceId9 != -1 ? rVar.a(context, resourceId9) : null;
        if (a7 != null || a8 != null) {
            Drawable[] a9 = AbstractC0297B.a(textView);
            if (a7 == null) {
                a7 = a9[0];
            }
            if (a4 == null) {
                a4 = a9[1];
            }
            if (a8 == null) {
                a8 = a9[2];
            }
            if (a6 == null) {
                a6 = a9[3];
            }
            AbstractC0297B.b(textView, a7, a4, a8, a6);
        } else if (a3 != null || a4 != null || a5 != null || a6 != null) {
            Drawable[] a10 = AbstractC0297B.a(textView);
            Drawable drawable = a10[0];
            if (drawable == null && a10[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a3 == null) {
                    a3 = compoundDrawables[0];
                }
                if (a4 == null) {
                    a4 = compoundDrawables[1];
                }
                if (a5 == null) {
                    a5 = compoundDrawables[2];
                }
                if (a6 == null) {
                    a6 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a3, a4, a5, a6);
            } else {
                if (a4 == null) {
                    a4 = a10[1];
                }
                Drawable drawable2 = a10[2];
                if (a6 == null) {
                    a6 = a10[3];
                }
                AbstractC0297B.b(textView, drawable, a4, drawable2, a6);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = r2.a.y(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            j1.l.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i4 = -1;
            j1.l.g(textView, U.b(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i4 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i4);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i4);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, i4);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i4) {
            Z0.d.N(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i4) {
            Z0.d.P(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i4) {
            Z.b.f(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0262a.f4308s);
        B0.a aVar = new B0.a(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f4636a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, aVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            D.d(textView, string);
        }
        aVar.C();
        Typeface typeface = this.f4646l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f4644j);
        }
    }

    public final void f(int i3, int i4, int i5, int i6) {
        Q q3 = this.f4643i;
        if (q3.j()) {
            DisplayMetrics displayMetrics = q3.f4709j.getResources().getDisplayMetrics();
            q3.k(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (q3.h()) {
                q3.a();
            }
        }
    }

    public final void g(int[] iArr, int i3) {
        Q q3 = this.f4643i;
        if (q3.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = q3.f4709j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                q3.f4706f = Q.b(iArr2);
                if (!q3.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                q3.f4707g = false;
            }
            if (q3.h()) {
                q3.a();
            }
        }
    }

    public final void h(int i3) {
        Q q3 = this.f4643i;
        if (q3.j()) {
            if (i3 == 0) {
                q3.f4701a = 0;
                q3.f4704d = -1.0f;
                q3.f4705e = -1.0f;
                q3.f4703c = -1.0f;
                q3.f4706f = new int[0];
                q3.f4702b = false;
                return;
            }
            if (i3 != 1) {
                throw new IllegalArgumentException(AbstractC0000a.c("Unknown auto-size text type: ", i3));
            }
            DisplayMetrics displayMetrics = q3.f4709j.getResources().getDisplayMetrics();
            q3.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (q3.h()) {
                q3.a();
            }
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new A1.e();
        }
        A1.e eVar = this.h;
        eVar.f213c = colorStateList;
        eVar.f212b = colorStateList != null;
        this.f4637b = eVar;
        this.f4638c = eVar;
        this.f4639d = eVar;
        this.f4640e = eVar;
        this.f4641f = eVar;
        this.f4642g = eVar;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new A1.e();
        }
        A1.e eVar = this.h;
        eVar.f214d = mode;
        eVar.f211a = mode != null;
        this.f4637b = eVar;
        this.f4638c = eVar;
        this.f4639d = eVar;
        this.f4640e = eVar;
        this.f4641f = eVar;
        this.f4642g = eVar;
    }

    public final void k(Context context, B0.a aVar) {
        String string;
        int i3 = this.f4644j;
        TypedArray typedArray = (TypedArray) aVar.f272c;
        this.f4644j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f4645k = i5;
            if (i5 != -1) {
                this.f4644j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f4647m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f4646l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f4646l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f4646l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f4646l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f4645k;
        int i9 = this.f4644j;
        if (!context.isRestricted()) {
            try {
                Typeface n2 = aVar.n(i7, this.f4644j, new C0296A(this, i8, i9, new WeakReference(this.f4636a)));
                if (n2 != null) {
                    if (i4 < 28 || this.f4645k == -1) {
                        this.f4646l = n2;
                    } else {
                        this.f4646l = E.a(Typeface.create(n2, 0), this.f4645k, (this.f4644j & 2) != 0);
                    }
                }
                this.f4647m = this.f4646l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4646l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f4645k == -1) {
            this.f4646l = Typeface.create(string, this.f4644j);
        } else {
            this.f4646l = E.a(Typeface.create(string, 0), this.f4645k, (this.f4644j & 2) != 0);
        }
    }
}
