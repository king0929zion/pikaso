package S1;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f2313c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f2315e;

    /* renamed from: f, reason: collision with root package name */
    public U1.d f2316f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2311a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final P1.b f2312b = new P1.b(1, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f2314d = true;

    public i(P1.f fVar) {
        this.f2315e = new WeakReference(null);
        this.f2315e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.f2314d) {
            return this.f2313c;
        }
        TextPaint textPaint = this.f2311a;
        this.f2313c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f2314d = false;
        return this.f2313c;
    }
}
