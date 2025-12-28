package w0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6507a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f6508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6509c;

    /* renamed from: d, reason: collision with root package name */
    public float f6510d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f6511e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f6512f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6513g;

    public l(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f6507a = charSequence;
        this.f6508b = textPaint;
        this.f6509c = i3;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f6513g) {
            TextDirectionHeuristic a3 = x.a(this.f6509c);
            int i3 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f6507a;
            TextPaint textPaint = this.f6508b;
            this.f6512f = i3 >= 33 ? AbstractC0630a.b(charSequence, textPaint, a3) : AbstractC0631b.b(charSequence, textPaint, a3);
            this.f6513g = true;
        }
        return this.f6512f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (w0.r.b(r4, x0.e.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            r7 = this;
            float r0 = r7.f6510d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r7.f6510d
            goto L57
        Lb:
            android.text.BoringLayout$Metrics r0 = r7.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r7.f6508b
            java.lang.CharSequence r4 = r7.f6507a
            if (r2 >= 0) goto L2e
            r0 = 0
            int r2 = r4.length()
            float r0 = android.text.Layout.getDesiredWidth(r4, r0, r2, r3)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            float r0 = (float) r5
        L2e:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L33
            goto L55
        L33:
            boolean r2 = r4 instanceof android.text.Spanned
            if (r2 == 0) goto L49
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<x0.f> r2 = x0.f.class
            boolean r2 = w0.r.b(r4, r2)
            if (r2 != 0) goto L52
            java.lang.Class<x0.e> r2 = x0.e.class
            boolean r2 = w0.r.b(r4, r2)
            if (r2 != 0) goto L52
        L49:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L52
            goto L55
        L52:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L55:
            r7.f6510d = r0
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.l.b():float");
    }
}
