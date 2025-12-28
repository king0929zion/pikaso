package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import d1.AbstractC0189K;
import d1.AbstractC0229z;
import g.AbstractC0262a;
import java.lang.reflect.Field;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322m {

    /* renamed from: a, reason: collision with root package name */
    public final View f4814a;

    /* renamed from: b, reason: collision with root package name */
    public final r f4815b;

    /* renamed from: c, reason: collision with root package name */
    public int f4816c = -1;

    /* renamed from: d, reason: collision with root package name */
    public A1.e f4817d;

    /* renamed from: e, reason: collision with root package name */
    public A1.e f4818e;

    /* renamed from: f, reason: collision with root package name */
    public A1.e f4819f;

    public C0322m(View view) {
        r rVar;
        this.f4814a = view;
        PorterDuff.Mode mode = r.f4862b;
        synchronized (r.class) {
            try {
                if (r.f4863c == null) {
                    r.c();
                }
                rVar = r.f4863c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4815b = rVar;
    }

    public final void a() {
        View view = this.f4814a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f4817d != null) {
                if (this.f4819f == null) {
                    this.f4819f = new A1.e();
                }
                A1.e eVar = this.f4819f;
                eVar.f213c = null;
                eVar.f212b = false;
                eVar.f214d = null;
                eVar.f211a = false;
                Field field = AbstractC0189K.f4150a;
                ColorStateList g3 = AbstractC0229z.g(view);
                if (g3 != null) {
                    eVar.f212b = true;
                    eVar.f213c = g3;
                }
                PorterDuff.Mode h = AbstractC0229z.h(view);
                if (h != null) {
                    eVar.f211a = true;
                    eVar.f214d = h;
                }
                if (eVar.f212b || eVar.f211a) {
                    r.d(background, eVar, view.getDrawableState());
                    return;
                }
            }
            A1.e eVar2 = this.f4818e;
            if (eVar2 != null) {
                r.d(background, eVar2, view.getDrawableState());
                return;
            }
            A1.e eVar3 = this.f4817d;
            if (eVar3 != null) {
                r.d(background, eVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        A1.e eVar = this.f4818e;
        if (eVar != null) {
            return (ColorStateList) eVar.f213c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        A1.e eVar = this.f4818e;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f214d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i3) {
        ColorStateList f3;
        View view = this.f4814a;
        Context context = view.getContext();
        int[] iArr = AbstractC0262a.f4310u;
        B0.a y3 = B0.a.y(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) y3.f272c;
        View view2 = this.f4814a;
        AbstractC0189K.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) y3.f272c, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f4816c = typedArray.getResourceId(0, -1);
                r rVar = this.f4815b;
                Context context2 = view.getContext();
                int i4 = this.f4816c;
                synchronized (rVar) {
                    f3 = rVar.f4864a.f(context2, i4);
                }
                if (f3 != null) {
                    g(f3);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0229z.q(view, y3.k(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0229z.r(view, U.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            y3.C();
        }
    }

    public final void e() {
        this.f4816c = -1;
        g(null);
        a();
    }

    public final void f(int i3) {
        ColorStateList colorStateList;
        this.f4816c = i3;
        r rVar = this.f4815b;
        if (rVar != null) {
            Context context = this.f4814a.getContext();
            synchronized (rVar) {
                colorStateList = rVar.f4864a.f(context, i3);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f4817d == null) {
                this.f4817d = new A1.e();
            }
            A1.e eVar = this.f4817d;
            eVar.f213c = colorStateList;
            eVar.f212b = true;
        } else {
            this.f4817d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f4818e == null) {
            this.f4818e = new A1.e();
        }
        A1.e eVar = this.f4818e;
        eVar.f213c = colorStateList;
        eVar.f212b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f4818e == null) {
            this.f4818e = new A1.e();
        }
        A1.e eVar = this.f4818e;
        eVar.f214d = mode;
        eVar.f211a = true;
        a();
    }
}
