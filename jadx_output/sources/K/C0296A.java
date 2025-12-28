package k;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import d1.AbstractC0189K;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: k.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296A extends U0.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f4633g;
    public final /* synthetic */ F h;

    public C0296A(F f3, int i3, int i4, WeakReference weakReference) {
        this.h = f3;
        this.f4631e = i3;
        this.f4632f = i4;
        this.f4633g = weakReference;
    }

    @Override // U0.b
    public final void g(int i3) {
    }

    @Override // U0.b
    public final void h(Typeface typeface) {
        int i3;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f4631e) != -1) {
            typeface = E.a(typeface, i3, (this.f4632f & 2) != 0);
        }
        F f3 = this.h;
        if (f3.f4647m) {
            f3.f4646l = typeface;
            TextView textView = (TextView) this.f4633g.get();
            if (textView != null) {
                Field field = AbstractC0189K.f4150a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new M1.b(textView, typeface, f3.f4644j));
                } else {
                    textView.setTypeface(typeface, f3.f4644j);
                }
            }
        }
    }
}
