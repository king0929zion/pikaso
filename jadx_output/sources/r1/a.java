package R1;

import T0.b;
import android.content.Context;
import android.util.TypedValue;
import com.ai.assistance.operit.provider.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f2227f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2230c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2231d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2232e;

    public a(Context context) {
        int i3;
        int i4;
        TypedValue S2 = r2.a.S(context, R.attr.elevationOverlayEnabled);
        int i5 = 0;
        boolean z3 = (S2 == null || S2.type != 18 || S2.data == 0) ? false : true;
        TypedValue S3 = r2.a.S(context, R.attr.elevationOverlayColor);
        if (S3 != null) {
            int i6 = S3.resourceId;
            i3 = i6 != 0 ? b.a(context, i6) : S3.data;
        } else {
            i3 = 0;
        }
        TypedValue S4 = r2.a.S(context, R.attr.elevationOverlayAccentColor);
        if (S4 != null) {
            int i7 = S4.resourceId;
            i4 = i7 != 0 ? b.a(context, i7) : S4.data;
        } else {
            i4 = 0;
        }
        TypedValue S5 = r2.a.S(context, R.attr.colorSurface);
        if (S5 != null) {
            int i8 = S5.resourceId;
            i5 = i8 != 0 ? b.a(context, i8) : S5.data;
        }
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f2228a = z3;
        this.f2229b = i3;
        this.f2230c = i4;
        this.f2231d = i5;
        this.f2232e = f3;
    }
}
