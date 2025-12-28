package S1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2301a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f2302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2303c;

    /* renamed from: d, reason: collision with root package name */
    public int f2304d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2309j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f2305e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f2306f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f2307g = 1.0f;
    public int h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2308i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f2310k = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f2301a = charSequence;
        this.f2302b = textPaint;
        this.f2303c = i3;
        this.f2304d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f2301a == null) {
            this.f2301a = "";
        }
        int max = Math.max(0, this.f2303c);
        CharSequence charSequence = this.f2301a;
        int i3 = this.f2306f;
        TextPaint textPaint = this.f2302b;
        if (i3 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f2310k);
        }
        int min = Math.min(charSequence.length(), this.f2304d);
        this.f2304d = min;
        if (this.f2309j && this.f2306f == 1) {
            this.f2305e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f2305e);
        obtain.setIncludePad(this.f2308i);
        obtain.setTextDirection(this.f2309j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f2310k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f2306f);
        float f3 = this.f2307g;
        if (f3 != 1.0f) {
            obtain.setLineSpacing(0.0f, f3);
        }
        if (this.f2306f > 1) {
            obtain.setHyphenationFrequency(this.h);
        }
        return obtain.build();
    }
}
