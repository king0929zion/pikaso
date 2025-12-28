package x0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f6663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6664b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6665c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6666d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6667e;

    /* renamed from: f, reason: collision with root package name */
    public int f6668f = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f6669g = Integer.MIN_VALUE;
    public int h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f6670i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f6671j;

    /* renamed from: k, reason: collision with root package name */
    public int f6672k;

    public g(float f3, int i3, boolean z3, boolean z4, float f4) {
        this.f6663a = f3;
        this.f6664b = i3;
        this.f6665c = z3;
        this.f6666d = z4;
        this.f6667e = f4;
        if ((0.0f > f4 || f4 > 1.0f) && f4 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i3, int i4, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        if (i7 - i8 <= 0) {
            return;
        }
        boolean z3 = i3 == 0;
        boolean z4 = i4 == this.f6664b;
        boolean z5 = this.f6666d;
        boolean z6 = this.f6665c;
        if (z3 && z4 && z6 && z5) {
            return;
        }
        if (this.f6668f == Integer.MIN_VALUE) {
            int i9 = i7 - i8;
            int ceil = (int) Math.ceil(this.f6663a);
            int i10 = ceil - i9;
            float f3 = this.f6667e;
            if (f3 == -1.0f) {
                f3 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i10 <= 0 ? Math.ceil(i10 * f3) : Math.ceil((1.0f - f3) * i10));
            int i11 = fontMetricsInt.descent;
            int i12 = ceil2 + i11;
            this.h = i12;
            int i13 = i12 - ceil;
            this.f6669g = i13;
            if (z6) {
                i13 = fontMetricsInt.ascent;
            }
            this.f6668f = i13;
            if (z5) {
                i12 = i11;
            }
            this.f6670i = i12;
            this.f6671j = fontMetricsInt.ascent - i13;
            this.f6672k = i12 - i11;
        }
        fontMetricsInt.ascent = z3 ? this.f6668f : this.f6669g;
        fontMetricsInt.descent = z4 ? this.f6670i : this.h;
    }
}
