package z1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class x extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f7088a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7089b;

    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7088a = new Rect();
        this.f7089b = true;
    }

    public x(int i3, int i4) {
        super(i3, i4);
        this.f7088a = new Rect();
        this.f7089b = true;
    }

    public x(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7088a = new Rect();
        this.f7089b = true;
    }

    public x(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7088a = new Rect();
        this.f7089b = true;
    }

    public x(x xVar) {
        super((ViewGroup.LayoutParams) xVar);
        this.f7088a = new Rect();
        this.f7089b = true;
    }
}
