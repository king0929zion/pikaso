package X1;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f2669a;

    /* renamed from: b, reason: collision with root package name */
    public R1.a f2670b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2671c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f2672d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2673e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f2674f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f2675g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public float f2676i;

    /* renamed from: j, reason: collision with root package name */
    public float f2677j;

    /* renamed from: k, reason: collision with root package name */
    public int f2678k;

    /* renamed from: l, reason: collision with root package name */
    public float f2679l;

    /* renamed from: m, reason: collision with root package name */
    public float f2680m;

    /* renamed from: n, reason: collision with root package name */
    public int f2681n;

    /* renamed from: o, reason: collision with root package name */
    public int f2682o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f2683p;

    public f(k kVar) {
        this.f2671c = null;
        this.f2672d = null;
        this.f2673e = null;
        this.f2674f = PorterDuff.Mode.SRC_IN;
        this.f2675g = null;
        this.h = 1.0f;
        this.f2676i = 1.0f;
        this.f2678k = 255;
        this.f2679l = 0.0f;
        this.f2680m = 0.0f;
        this.f2681n = 0;
        this.f2682o = 0;
        this.f2683p = Paint.Style.FILL_AND_STROKE;
        this.f2669a = kVar;
        this.f2670b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.h = true;
        return gVar;
    }

    public f(f fVar) {
        this.f2671c = null;
        this.f2672d = null;
        this.f2673e = null;
        this.f2674f = PorterDuff.Mode.SRC_IN;
        this.f2675g = null;
        this.h = 1.0f;
        this.f2676i = 1.0f;
        this.f2678k = 255;
        this.f2679l = 0.0f;
        this.f2680m = 0.0f;
        this.f2681n = 0;
        this.f2682o = 0;
        this.f2683p = Paint.Style.FILL_AND_STROKE;
        this.f2669a = fVar.f2669a;
        this.f2670b = fVar.f2670b;
        this.f2677j = fVar.f2677j;
        this.f2671c = fVar.f2671c;
        this.f2672d = fVar.f2672d;
        this.f2674f = fVar.f2674f;
        this.f2673e = fVar.f2673e;
        this.f2678k = fVar.f2678k;
        this.h = fVar.h;
        this.f2682o = fVar.f2682o;
        this.f2676i = fVar.f2676i;
        this.f2679l = fVar.f2679l;
        this.f2680m = fVar.f2680m;
        this.f2681n = fVar.f2681n;
        this.f2683p = fVar.f2683p;
        if (fVar.f2675g != null) {
            this.f2675g = new Rect(fVar.f2675g);
        }
    }
}
