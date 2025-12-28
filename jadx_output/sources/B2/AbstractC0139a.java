package b2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i.C0283b;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0139a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3661a = {R.attr.theme, com.ai.assistance.operit.provider.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3662b = {com.ai.assistance.operit.provider.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i3, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3662b, i3, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z3 = (context instanceof C0283b) && ((C0283b) context).f4416a == resourceId;
        if (resourceId == 0 || z3) {
            return context;
        }
        C0283b c0283b = new C0283b(context);
        c0283b.f4416a = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3661a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0283b.getTheme().applyStyle(resourceId2, true);
        }
        return c0283b;
    }
}
