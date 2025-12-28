package N;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import k.U;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f1791a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f1792b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1793c;

    public w(ImageView imageView) {
        this.f1792b = imageView;
    }

    public void a() {
        A1.e eVar;
        ImageView imageView = (ImageView) this.f1792b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            U.a(drawable);
        }
        if (drawable == null || (eVar = (A1.e) this.f1793c) == null) {
            return;
        }
        k.r.d(drawable, eVar, imageView.getDrawableState());
    }

    public void b(AttributeSet attributeSet, int i3) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1792b;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0262a.f4295e;
        B0.a y3 = B0.a.y(context, attributeSet, iArr, i3);
        AbstractC0189K.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) y3.f272c, i3);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) y3.f272c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = Z.b.r(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                U.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                j1.f.c(imageView, y3.k(2));
            }
            if (typedArray.hasValue(3)) {
                j1.f.d(imageView, U.b(typedArray.getInt(3, -1), null));
            }
            y3.C();
        } catch (Throwable th) {
            y3.C();
            throw th;
        }
    }
}
