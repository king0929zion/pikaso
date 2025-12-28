package k;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import g.AbstractC0262a;

/* renamed from: k.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4877a;

    /* renamed from: b, reason: collision with root package name */
    public final H f4878b;

    public C0337u(TextView textView) {
        this.f4877a = textView;
        this.f4878b = new H(textView);
    }

    public final void a(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.f4877a.getContext().obtainStyledAttributes(attributeSet, AbstractC0262a.f4297g, i3, 0);
        try {
            boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            ((Z.b) this.f4878b.f4656b).M(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
