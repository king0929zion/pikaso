package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.widget.CheckBox;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0326o extends CheckBox {

    /* renamed from: d, reason: collision with root package name */
    public final C0328p f4846d;

    /* renamed from: e, reason: collision with root package name */
    public final C0322m f4847e;

    /* renamed from: f, reason: collision with root package name */
    public final F f4848f;

    /* renamed from: g, reason: collision with root package name */
    public C0337u f4849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006f A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:3:0x0036, B:5:0x003d, B:8:0x0043, B:9:0x0068, B:11:0x006f, B:12:0x0076, B:14:0x007d, B:21:0x0051, B:23:0x0057, B:25:0x005d), top: B:2:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:3:0x0036, B:5:0x003d, B:8:0x0043, B:9:0x0068, B:11:0x006f, B:12:0x0076, B:14:0x007d, B:21:0x0051, B:23:0x0057, B:25:0x005d), top: B:2:0x0036 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC0326o(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            k.K0.a(r9)
            r6 = 2130903230(0x7f0300be, float:1.7413272E38)
            r8.<init>(r9, r10, r6)
            android.content.Context r9 = r8.getContext()
            k.J0.a(r8, r9)
            k.p r9 = new k.p
            r9.<init>(r8)
            r8.f4846d = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = g.AbstractC0262a.f4299j
            B0.a r9 = B0.a.y(r9, r10, r2, r6)
            java.lang.Object r0 = r9.f272c
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.f272c
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r8
            r3 = r10
            r5 = r6
            d1.AbstractC0189K.i(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            if (r1 == 0) goto L51
            int r0 = r7.getResourceId(r0, r2)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L51
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Throwable -> L4f android.content.res.Resources.NotFoundException -> L51
            android.graphics.drawable.Drawable r0 = Z.b.r(r1, r0)     // Catch: java.lang.Throwable -> L4f android.content.res.Resources.NotFoundException -> L51
            r8.setButtonDrawable(r0)     // Catch: java.lang.Throwable -> L4f android.content.res.Resources.NotFoundException -> L51
            goto L68
        L4f:
            r10 = move-exception
            goto La9
        L51:
            boolean r0 = r7.hasValue(r2)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L68
            int r0 = r7.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L68
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Throwable -> L4f
            android.graphics.drawable.Drawable r0 = Z.b.r(r1, r0)     // Catch: java.lang.Throwable -> L4f
            r8.setButtonDrawable(r0)     // Catch: java.lang.Throwable -> L4f
        L68:
            r0 = 2
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L76
            android.content.res.ColorStateList r0 = r9.k(r0)     // Catch: java.lang.Throwable -> L4f
            j1.AbstractC0295b.c(r8, r0)     // Catch: java.lang.Throwable -> L4f
        L76:
            r0 = 3
            boolean r1 = r7.hasValue(r0)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L8a
            r1 = -1
            int r0 = r7.getInt(r0, r1)     // Catch: java.lang.Throwable -> L4f
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = k.U.b(r0, r1)     // Catch: java.lang.Throwable -> L4f
            j1.AbstractC0295b.d(r8, r0)     // Catch: java.lang.Throwable -> L4f
        L8a:
            r9.C()
            k.m r9 = new k.m
            r9.<init>(r8)
            r8.f4847e = r9
            r9.d(r10, r6)
            k.F r9 = new k.F
            r9.<init>(r8)
            r8.f4848f = r9
            r9.d(r10, r6)
            k.u r9 = r8.getEmojiTextViewHelper()
            r9.a(r10, r6)
            return
        La9:
            r9.C()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0326o.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0337u getEmojiTextViewHelper() {
        if (this.f4849g == null) {
            this.f4849g = new C0337u(this);
        }
        return this.f4849g;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0322m c0322m = this.f4847e;
        if (c0322m != null) {
            c0322m.a();
        }
        F f3 = this.f4848f;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0328p c0328p = this.f4846d;
        if (c0328p != null) {
            c0328p.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0322m c0322m = this.f4847e;
        if (c0322m != null) {
            return c0322m.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0322m c0322m = this.f4847e;
        if (c0322m != null) {
            return c0322m.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0328p c0328p = this.f4846d;
        if (c0328p != null) {
            return c0328p.f4851b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0328p c0328p = this.f4846d;
        if (c0328p != null) {
            return c0328p.f4852c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        A1.e eVar = this.f4848f.h;
        if (eVar != null) {
            return (ColorStateList) eVar.f213c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        A1.e eVar = this.f4848f.h;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f214d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        ((Z.b) getEmojiTextViewHelper().f4878b.f4656b).L(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0322m c0322m = this.f4847e;
        if (c0322m != null) {
            c0322m.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0322m c0322m = this.f4847e;
        if (c0322m != null) {
            c0322m.f(i3);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0328p c0328p = this.f4846d;
        if (c0328p != null) {
            if (c0328p.f4855f) {
                c0328p.f4855f = false;
            } else {
                c0328p.f4855f = true;
                c0328p.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4848f;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4848f;
        if (f3 != null) {
            f3.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        ((Z.b) getEmojiTextViewHelper().f4878b.f4656b).M(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((Z.b) getEmojiTextViewHelper().f4878b.f4656b).t(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0322m c0322m = this.f4847e;
        if (c0322m != null) {
            c0322m.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0322m c0322m = this.f4847e;
        if (c0322m != null) {
            c0322m.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0328p c0328p = this.f4846d;
        if (c0328p != null) {
            c0328p.f4851b = colorStateList;
            c0328p.f4853d = true;
            c0328p.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0328p c0328p = this.f4846d;
        if (c0328p != null) {
            c0328p.f4852c = mode;
            c0328p.f4854e = true;
            c0328p.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F f3 = this.f4848f;
        f3.i(colorStateList);
        f3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F f3 = this.f4848f;
        f3.j(mode);
        f3.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(Z.b.r(getContext(), i3));
    }
}
