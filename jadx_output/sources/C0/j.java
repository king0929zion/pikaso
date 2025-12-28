package C0;

import W.D;
import W.G;
import W.o;
import android.text.TextPaint;
import java.util.ArrayList;
import v0.C0624i;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f576a = new k(false);

    public static final void a(C0624i c0624i, o oVar, D d3, float f3, G g3, F0.g gVar, Y.c cVar, int i3) {
        ArrayList arrayList = c0624i.h;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            v0.k kVar = (v0.k) arrayList.get(i4);
            kVar.f6359a.f(oVar, d3, f3, g3, gVar, cVar, i3);
            oVar.o(0.0f, kVar.f6359a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f3 * 255));
    }
}
