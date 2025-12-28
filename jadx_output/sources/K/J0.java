package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.AbstractC0262a;

/* loaded from: classes.dex */
public abstract class J0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4686a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4687b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4688c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4689d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f4690e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f4691f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f4692g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0262a.h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i3) {
        ColorStateList d3 = d(context, i3);
        if (d3 != null && d3.isStateful()) {
            return d3.getColorForState(f4687b, d3.getDefaultColor());
        }
        ThreadLocal threadLocal = f4686a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        return V0.a.d(c(context, i3), Math.round(Color.alpha(r4) * f3));
    }

    public static int c(Context context, int i3) {
        int[] iArr = f4692g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f4692g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = r2.a.y(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
