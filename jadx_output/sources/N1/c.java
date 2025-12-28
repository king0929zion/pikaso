package N1;

import X1.g;
import X1.k;
import X1.v;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.button.MaterialButton;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f1844a;

    /* renamed from: b, reason: collision with root package name */
    public k f1845b;

    /* renamed from: c, reason: collision with root package name */
    public int f1846c;

    /* renamed from: d, reason: collision with root package name */
    public int f1847d;

    /* renamed from: e, reason: collision with root package name */
    public int f1848e;

    /* renamed from: f, reason: collision with root package name */
    public int f1849f;

    /* renamed from: g, reason: collision with root package name */
    public int f1850g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f1851i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1852j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1853k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1854l;

    /* renamed from: m, reason: collision with root package name */
    public g f1855m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1859q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f1861s;

    /* renamed from: t, reason: collision with root package name */
    public int f1862t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1856n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1857o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1858p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1860r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f1844a = materialButton;
        this.f1845b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f1861s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f1861s.getNumberOfLayers() > 2 ? (v) this.f1861s.getDrawable(2) : (v) this.f1861s.getDrawable(1);
    }

    public final g b(boolean z3) {
        RippleDrawable rippleDrawable = this.f1861s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f1861s.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f1845b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i3, int i4) {
        Field field = AbstractC0189K.f4150a;
        MaterialButton materialButton = this.f1844a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.f1848e;
        int i6 = this.f1849f;
        this.f1849f = i4;
        this.f1848e = i3;
        if (!this.f1857o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i3) - i5, paddingEnd, (paddingBottom + i4) - i6);
    }

    public final void e() {
        g gVar = new g(this.f1845b);
        MaterialButton materialButton = this.f1844a;
        gVar.h(materialButton.getContext());
        W0.a.h(gVar, this.f1852j);
        PorterDuff.Mode mode = this.f1851i;
        if (mode != null) {
            W0.a.i(gVar, mode);
        }
        float f3 = this.h;
        ColorStateList colorStateList = this.f1853k;
        gVar.f2685d.f2677j = f3;
        gVar.invalidateSelf();
        X1.f fVar = gVar.f2685d;
        if (fVar.f2672d != colorStateList) {
            fVar.f2672d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f1845b);
        gVar2.setTint(0);
        float f4 = this.h;
        int x3 = this.f1856n ? r2.a.x(materialButton, R.attr.colorSurface) : 0;
        gVar2.f2685d.f2677j = f4;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(x3);
        X1.f fVar2 = gVar2.f2685d;
        if (fVar2.f2672d != valueOf) {
            fVar2.f2672d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f1845b);
        this.f1855m = gVar3;
        W0.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(V1.a.a(this.f1854l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f1846c, this.f1848e, this.f1847d, this.f1849f), this.f1855m);
        this.f1861s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b3 = b(false);
        if (b3 != null) {
            b3.i(this.f1862t);
            b3.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b3 = b(false);
        g b4 = b(true);
        if (b3 != null) {
            float f3 = this.h;
            ColorStateList colorStateList = this.f1853k;
            b3.f2685d.f2677j = f3;
            b3.invalidateSelf();
            X1.f fVar = b3.f2685d;
            if (fVar.f2672d != colorStateList) {
                fVar.f2672d = colorStateList;
                b3.onStateChange(b3.getState());
            }
            if (b4 != null) {
                float f4 = this.h;
                int x3 = this.f1856n ? r2.a.x(this.f1844a, R.attr.colorSurface) : 0;
                b4.f2685d.f2677j = f4;
                b4.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(x3);
                X1.f fVar2 = b4.f2685d;
                if (fVar2.f2672d != valueOf) {
                    fVar2.f2672d = valueOf;
                    b4.onStateChange(b4.getState());
                }
            }
        }
    }
}
