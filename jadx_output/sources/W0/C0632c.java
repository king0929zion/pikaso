package w0;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0632c f6495a = new C0632c();

    public final void a(Canvas canvas, CharSequence charSequence, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        canvas.drawTextRun(charSequence, i3, i4, i5, i6, f3, f4, z3, paint);
    }

    public final void b(Canvas canvas, char[] cArr, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        canvas.drawTextRun(cArr, i3, i4, i5, i6, f3, f4, z3, paint);
    }
}
