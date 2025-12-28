package X1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: z, reason: collision with root package name */
    public static final Paint f2684z;

    /* renamed from: d, reason: collision with root package name */
    public f f2685d;

    /* renamed from: e, reason: collision with root package name */
    public final t[] f2686e;

    /* renamed from: f, reason: collision with root package name */
    public final t[] f2687f;

    /* renamed from: g, reason: collision with root package name */
    public final BitSet f2688g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f2689i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f2690j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f2691k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f2692l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f2693m;

    /* renamed from: n, reason: collision with root package name */
    public final Region f2694n;

    /* renamed from: o, reason: collision with root package name */
    public final Region f2695o;

    /* renamed from: p, reason: collision with root package name */
    public k f2696p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f2697q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f2698r;

    /* renamed from: s, reason: collision with root package name */
    public final W1.a f2699s;

    /* renamed from: t, reason: collision with root package name */
    public final A.t f2700t;

    /* renamed from: u, reason: collision with root package name */
    public final m f2701u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f2702v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuffColorFilter f2703w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f2704x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2705y;

    static {
        Paint paint = new Paint(1);
        f2684z = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f2685d;
        this.f2701u.a(fVar.f2669a, fVar.f2676i, rectF, this.f2700t, path);
        if (this.f2685d.h != 1.0f) {
            Matrix matrix = this.f2689i;
            matrix.reset();
            float f3 = this.f2685d.h;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f2704x, true);
    }

    public final int b(int i3) {
        int i4;
        f fVar = this.f2685d;
        float f3 = fVar.f2680m + 0.0f + fVar.f2679l;
        R1.a aVar = fVar.f2670b;
        if (aVar == null || !aVar.f2228a || V0.a.d(i3, 255) != aVar.f2231d) {
            return i3;
        }
        float min = (aVar.f2232e <= 0.0f || f3 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f3 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i3);
        int N2 = r2.a.N(min, V0.a.d(i3, 255), aVar.f2229b);
        if (min > 0.0f && (i4 = aVar.f2230c) != 0) {
            N2 = V0.a.b(V0.a.d(i4, R1.a.f2227f), N2);
        }
        return V0.a.d(N2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.f2688g.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i3 = this.f2685d.f2682o;
        Path path = this.f2690j;
        W1.a aVar = this.f2699s;
        if (i3 != 0) {
            canvas.drawPath(path, aVar.f2577a);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            t tVar = this.f2686e[i4];
            int i5 = this.f2685d.f2681n;
            Matrix matrix = t.f2756b;
            tVar.a(matrix, aVar, i5, canvas);
            this.f2687f[i4].a(matrix, aVar, this.f2685d.f2681n, canvas);
        }
        if (this.f2705y) {
            double d3 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d3)) * this.f2685d.f2682o);
            int cos = (int) (Math.cos(Math.toRadians(d3)) * this.f2685d.f2682o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f2684z);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.c(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a3 = kVar.f2723f.a(rectF) * this.f2685d.f2676i;
            canvas.drawRoundRect(rectF, a3, a3, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f2697q;
        paint.setColorFilter(this.f2702v);
        int alpha = paint.getAlpha();
        int i3 = this.f2685d.f2678k;
        paint.setAlpha(((i3 + (i3 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f2698r;
        paint2.setColorFilter(this.f2703w);
        paint2.setStrokeWidth(this.f2685d.f2677j);
        int alpha2 = paint2.getAlpha();
        int i4 = this.f2685d.f2678k;
        paint2.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z3 = this.h;
        Path path = this.f2690j;
        if (z3) {
            float f3 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f2685d.f2669a;
            j d3 = kVar.d();
            c cVar = kVar.f2722e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            d3.f2711e = cVar;
            c cVar2 = kVar.f2723f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            d3.f2712f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            d3.h = cVar3;
            c cVar4 = kVar.f2724g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            d3.f2713g = cVar4;
            k a3 = d3.a();
            this.f2696p = a3;
            float f4 = this.f2685d.f2676i;
            RectF rectF = this.f2693m;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f2701u.a(a3, f4, rectF, null, this.f2691k);
            a(f(), path);
            this.h = false;
        }
        f fVar = this.f2685d;
        fVar.getClass();
        if (fVar.f2681n > 0) {
            int i5 = Build.VERSION.SDK_INT;
            if (!this.f2685d.f2669a.c(f()) && !path.isConvex() && i5 < 29) {
                canvas.save();
                double d4 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d4)) * this.f2685d.f2682o), (int) (Math.cos(Math.toRadians(d4)) * this.f2685d.f2682o));
                if (this.f2705y) {
                    RectF rectF2 = this.f2704x;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f2685d.f2681n * 2) + ((int) rectF2.width()) + width, (this.f2685d.f2681n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f5 = (getBounds().left - this.f2685d.f2681n) - width;
                    float f6 = (getBounds().top - this.f2685d.f2681n) - height;
                    canvas2.translate(-f5, -f6);
                    c(canvas2);
                    canvas.drawBitmap(createBitmap, f5, f6, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f2685d;
        Paint.Style style = fVar2.f2683p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f2669a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f2698r;
        Path path = this.f2691k;
        k kVar = this.f2696p;
        RectF rectF = this.f2693m;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f2692l;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f2685d.f2683p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2698r.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2685d.f2678k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2685d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2685d.getClass();
        if (this.f2685d.f2669a.c(f())) {
            outline.setRoundRect(getBounds(), this.f2685d.f2669a.f2722e.a(f()) * this.f2685d.f2676i);
            return;
        }
        RectF f3 = f();
        Path path = this.f2690j;
        a(f3, path);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i3 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2685d.f2675g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f2694n;
        region.set(bounds);
        RectF f3 = f();
        Path path = this.f2690j;
        a(f3, path);
        Region region2 = this.f2695o;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f2685d.f2670b = new R1.a(context);
        m();
    }

    public final void i(float f3) {
        f fVar = this.f2685d;
        if (fVar.f2680m != f3) {
            fVar.f2680m = f3;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f2685d.f2673e) == null || !colorStateList.isStateful())) {
            this.f2685d.getClass();
            ColorStateList colorStateList3 = this.f2685d.f2672d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f2685d.f2671c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f2685d;
        if (fVar.f2671c != colorStateList) {
            fVar.f2671c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2685d.f2671c == null || color2 == (colorForState2 = this.f2685d.f2671c.getColorForState(iArr, (color2 = (paint2 = this.f2697q).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.f2685d.f2672d == null || color == (colorForState = this.f2685d.f2672d.getColorForState(iArr, (color = (paint = this.f2698r).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2702v;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f2703w;
        f fVar = this.f2685d;
        ColorStateList colorStateList = fVar.f2673e;
        PorterDuff.Mode mode = fVar.f2674f;
        Paint paint = this.f2697q;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b3 = b(color);
            porterDuffColorFilter = b3 != color ? new PorterDuffColorFilter(b3, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f2702v = porterDuffColorFilter;
        this.f2685d.getClass();
        this.f2703w = null;
        this.f2685d.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f2702v) && Objects.equals(porterDuffColorFilter3, this.f2703w)) ? false : true;
    }

    public final void m() {
        f fVar = this.f2685d;
        float f3 = fVar.f2680m + 0.0f;
        fVar.f2681n = (int) Math.ceil(0.75f * f3);
        this.f2685d.f2682o = (int) Math.ceil(f3 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2685d = new f(this.f2685d);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z3 = k(iArr) || l();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        f fVar = this.f2685d;
        if (fVar.f2678k != i3) {
            fVar.f2678k = i3;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2685d.getClass();
        super.invalidateSelf();
    }

    @Override // X1.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f2685d.f2669a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2685d.f2673e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f2685d;
        if (fVar.f2674f != mode) {
            fVar.f2674f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f2686e = new t[4];
        this.f2687f = new t[4];
        this.f2688g = new BitSet(8);
        this.f2689i = new Matrix();
        this.f2690j = new Path();
        this.f2691k = new Path();
        this.f2692l = new RectF();
        this.f2693m = new RectF();
        this.f2694n = new Region();
        this.f2695o = new Region();
        Paint paint = new Paint(1);
        this.f2697q = paint;
        Paint paint2 = new Paint(1);
        this.f2698r = paint2;
        this.f2699s = new W1.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f2729a;
        } else {
            mVar = new m();
        }
        this.f2701u = mVar;
        this.f2704x = new RectF();
        this.f2705y = true;
        this.f2685d = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f2700t = new A.t(14, this);
    }
}
