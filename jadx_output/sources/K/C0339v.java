package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0339v extends ImageButton {

    /* renamed from: d, reason: collision with root package name */
    public final C0322m f4886d;

    /* renamed from: e, reason: collision with root package name */
    public final N.w f4887e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4888f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339v(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        K0.a(context);
        this.f4888f = false;
        J0.a(this, getContext());
        C0322m c0322m = new C0322m(this);
        this.f4886d = c0322m;
        c0322m.d(attributeSet, i3);
        N.w wVar = new N.w(this);
        this.f4887e = wVar;
        wVar.b(attributeSet, i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0322m c0322m = this.f4886d;
        if (c0322m != null) {
            c0322m.a();
        }
        N.w wVar = this.f4887e;
        if (wVar != null) {
            wVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0322m c0322m = this.f4886d;
        if (c0322m != null) {
            return c0322m.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0322m c0322m = this.f4886d;
        if (c0322m != null) {
            return c0322m.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        A1.e eVar;
        N.w wVar = this.f4887e;
        if (wVar == null || (eVar = (A1.e) wVar.f1793c) == null) {
            return null;
        }
        return (ColorStateList) eVar.f213c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        A1.e eVar;
        N.w wVar = this.f4887e;
        if (wVar == null || (eVar = (A1.e) wVar.f1793c) == null) {
            return null;
        }
        return (PorterDuff.Mode) eVar.f214d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f4887e.f1792b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0322m c0322m = this.f4886d;
        if (c0322m != null) {
            c0322m.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0322m c0322m = this.f4886d;
        if (c0322m != null) {
            c0322m.f(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        N.w wVar = this.f4887e;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        N.w wVar = this.f4887e;
        if (wVar != null && drawable != null && !this.f4888f) {
            wVar.f1791a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (wVar != null) {
            wVar.a();
            if (this.f4888f) {
                return;
            }
            ImageView imageView = (ImageView) wVar.f1792b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(wVar.f1791a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f4888f = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        N.w wVar = this.f4887e;
        ImageView imageView = (ImageView) wVar.f1792b;
        if (i3 != 0) {
            Drawable r3 = Z.b.r(imageView.getContext(), i3);
            if (r3 != null) {
                U.a(r3);
            }
            imageView.setImageDrawable(r3);
        } else {
            imageView.setImageDrawable(null);
        }
        wVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        N.w wVar = this.f4887e;
        if (wVar != null) {
            wVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0322m c0322m = this.f4886d;
        if (c0322m != null) {
            c0322m.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0322m c0322m = this.f4886d;
        if (c0322m != null) {
            c0322m.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        N.w wVar = this.f4887e;
        if (wVar != null) {
            if (((A1.e) wVar.f1793c) == null) {
                wVar.f1793c = new A1.e();
            }
            A1.e eVar = (A1.e) wVar.f1793c;
            eVar.f213c = colorStateList;
            eVar.f212b = true;
            wVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        N.w wVar = this.f4887e;
        if (wVar != null) {
            if (((A1.e) wVar.f1793c) == null) {
                wVar.f1793c = new A1.e();
            }
            A1.e eVar = (A1.e) wVar.f1793c;
            eVar.f214d = mode;
            eVar.f211a = true;
            wVar.a();
        }
    }
}
