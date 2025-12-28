package P1;

import S1.h;
import S1.i;
import X1.g;
import X1.j;
import X1.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, h {
    public static final int[] I0 = {R.attr.state_enabled};

    /* renamed from: J0, reason: collision with root package name */
    public static final ShapeDrawable f2108J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2109A;

    /* renamed from: A0, reason: collision with root package name */
    public PorterDuff.Mode f2110A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2111B;

    /* renamed from: B0, reason: collision with root package name */
    public int[] f2112B0;

    /* renamed from: C, reason: collision with root package name */
    public float f2113C;

    /* renamed from: C0, reason: collision with root package name */
    public ColorStateList f2114C0;

    /* renamed from: D, reason: collision with root package name */
    public float f2115D;

    /* renamed from: D0, reason: collision with root package name */
    public WeakReference f2116D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f2117E;

    /* renamed from: E0, reason: collision with root package name */
    public TextUtils.TruncateAt f2118E0;

    /* renamed from: F, reason: collision with root package name */
    public float f2119F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f2120F0;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f2121G;

    /* renamed from: G0, reason: collision with root package name */
    public int f2122G0;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f2123H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f2124H0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2125I;

    /* renamed from: J, reason: collision with root package name */
    public Drawable f2126J;

    /* renamed from: K, reason: collision with root package name */
    public ColorStateList f2127K;

    /* renamed from: L, reason: collision with root package name */
    public float f2128L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2129M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2130N;

    /* renamed from: O, reason: collision with root package name */
    public Drawable f2131O;

    /* renamed from: P, reason: collision with root package name */
    public RippleDrawable f2132P;

    /* renamed from: Q, reason: collision with root package name */
    public ColorStateList f2133Q;

    /* renamed from: R, reason: collision with root package name */
    public float f2134R;

    /* renamed from: S, reason: collision with root package name */
    public SpannableStringBuilder f2135S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f2136T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f2137U;

    /* renamed from: V, reason: collision with root package name */
    public Drawable f2138V;

    /* renamed from: W, reason: collision with root package name */
    public ColorStateList f2139W;

    /* renamed from: X, reason: collision with root package name */
    public I1.b f2140X;

    /* renamed from: Y, reason: collision with root package name */
    public I1.b f2141Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f2142Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f2143a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f2144b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f2145c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f2146d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f2147e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f2148f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f2149g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Context f2150h0;
    public final Paint i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Paint.FontMetrics f2151j0;
    public final RectF k0;

    /* renamed from: l0, reason: collision with root package name */
    public final PointF f2152l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Path f2153m0;

    /* renamed from: n0, reason: collision with root package name */
    public final i f2154n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f2155o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2156q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f2157r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f2158s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f2159t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2160u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f2161v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2162w0;

    /* renamed from: x0, reason: collision with root package name */
    public ColorFilter f2163x0;

    /* renamed from: y0, reason: collision with root package name */
    public PorterDuffColorFilter f2164y0;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f2165z0;

    public f(Context context, AttributeSet attributeSet) {
        super(k.a(context, attributeSet, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action).a());
        this.f2115D = -1.0f;
        this.i0 = new Paint(1);
        this.f2151j0 = new Paint.FontMetrics();
        this.k0 = new RectF();
        this.f2152l0 = new PointF();
        this.f2153m0 = new Path();
        this.f2162w0 = 255;
        this.f2110A0 = PorterDuff.Mode.SRC_IN;
        this.f2116D0 = new WeakReference(null);
        h(context);
        this.f2150h0 = context;
        i iVar = new i(this);
        this.f2154n0 = iVar;
        this.f2123H = "";
        iVar.f2311a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = I0;
        setState(iArr);
        if (!Arrays.equals(this.f2112B0, iArr)) {
            this.f2112B0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f2120F0 = true;
        int[] iArr2 = V1.a.f2480a;
        f2108J0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f3) {
        if (this.f2115D != f3) {
            this.f2115D = f3;
            j d3 = this.f2685d.f2669a.d();
            d3.f2711e = new X1.a(f3);
            d3.f2712f = new X1.a(f3);
            d3.f2713g = new X1.a(f3);
            d3.h = new X1.a(f3);
            setShapeAppearanceModel(d3.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2126J;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof W0.d;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p3 = p();
            this.f2126J = drawable != null ? drawable.mutate() : null;
            float p4 = p();
            U(drawable2);
            if (S()) {
                n(this.f2126J);
            }
            invalidateSelf();
            if (p3 != p4) {
                u();
            }
        }
    }

    public final void C(float f3) {
        if (this.f2128L != f3) {
            float p3 = p();
            this.f2128L = f3;
            float p4 = p();
            invalidateSelf();
            if (p3 != p4) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f2129M = true;
        if (this.f2127K != colorStateList) {
            this.f2127K = colorStateList;
            if (S()) {
                W0.a.h(this.f2126J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z3) {
        if (this.f2125I != z3) {
            boolean S2 = S();
            this.f2125I = z3;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.f2126J);
                } else {
                    U(this.f2126J);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f2117E != colorStateList) {
            this.f2117E = colorStateList;
            if (this.f2124H0) {
                X1.f fVar = this.f2685d;
                if (fVar.f2672d != colorStateList) {
                    fVar.f2672d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f3) {
        if (this.f2119F != f3) {
            this.f2119F = f3;
            this.i0.setStrokeWidth(f3);
            if (this.f2124H0) {
                this.f2685d.f2677j = f3;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r5.f2131O
            if (r1 == 0) goto Lb
            boolean r2 = r1 instanceof W0.d
            if (r2 == 0) goto Lc
            W0.d r1 = (W0.d) r1
        Lb:
            r1 = r0
        Lc:
            if (r1 == r6) goto L49
            float r2 = r5.q()
            if (r6 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r6.mutate()
        L18:
            r5.f2131O = r0
            int[] r6 = V1.a.f2480a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r0 = r5.f2121G
            android.content.res.ColorStateList r0 = V1.a.a(r0)
            android.graphics.drawable.Drawable r3 = r5.f2131O
            android.graphics.drawable.ShapeDrawable r4 = P1.f.f2108J0
            r6.<init>(r0, r3, r4)
            r5.f2132P = r6
            float r6 = r5.q()
            U(r1)
            boolean r0 = r5.T()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r5.f2131O
            r5.n(r0)
        L3f:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L49
            r5.u()
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.f.H(android.graphics.drawable.Drawable):void");
    }

    public final void I(float f3) {
        if (this.f2148f0 != f3) {
            this.f2148f0 = f3;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f3) {
        if (this.f2134R != f3) {
            this.f2134R = f3;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f3) {
        if (this.f2147e0 != f3) {
            this.f2147e0 = f3;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f2133Q != colorStateList) {
            this.f2133Q = colorStateList;
            if (T()) {
                W0.a.h(this.f2131O, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z3) {
        if (this.f2130N != z3) {
            boolean T2 = T();
            this.f2130N = z3;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f2131O);
                } else {
                    U(this.f2131O);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f3) {
        if (this.f2144b0 != f3) {
            float p3 = p();
            this.f2144b0 = f3;
            float p4 = p();
            invalidateSelf();
            if (p3 != p4) {
                u();
            }
        }
    }

    public final void O(float f3) {
        if (this.f2143a0 != f3) {
            float p3 = p();
            this.f2143a0 = f3;
            float p4 = p();
            invalidateSelf();
            if (p3 != p4) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f2121G != colorStateList) {
            this.f2121G = colorStateList;
            this.f2114C0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(U1.d dVar) {
        i iVar = this.f2154n0;
        if (iVar.f2316f != dVar) {
            iVar.f2316f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f2311a;
                Context context = this.f2150h0;
                b bVar = iVar.f2312b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f2315e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.f2314d = true;
            }
            h hVar2 = (h) iVar.f2315e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f2137U && this.f2138V != null && this.f2160u0;
    }

    public final boolean S() {
        return this.f2125I && this.f2126J != null;
    }

    public final boolean T() {
        return this.f2130N && this.f2131O != null;
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i3;
        RectF rectF;
        int i4;
        int i5;
        int i6;
        RectF rectF2;
        int i7;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i3 = this.f2162w0) == 0) {
            return;
        }
        int saveLayerAlpha = i3 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i3) : 0;
        boolean z3 = this.f2124H0;
        Paint paint = this.i0;
        RectF rectF3 = this.k0;
        if (!z3) {
            paint.setColor(this.f2155o0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.f2124H0) {
            paint.setColor(this.p0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f2163x0;
            if (colorFilter == null) {
                colorFilter = this.f2164y0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.f2124H0) {
            super.draw(canvas);
        }
        if (this.f2119F > 0.0f && !this.f2124H0) {
            paint.setColor(this.f2157r0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f2124H0) {
                ColorFilter colorFilter2 = this.f2163x0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f2164y0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.f2119F / 2.0f;
            rectF3.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.f2115D - (this.f2119F / 2.0f);
            canvas.drawRoundRect(rectF3, f5, f5, paint);
        }
        paint.setColor(this.f2158s0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f2124H0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f2153m0;
            X1.f fVar = this.f2685d;
            this.f2701u.a(fVar.f2669a, fVar.f2676i, rectF4, this.f2700t, path);
            d(canvas, paint, path, this.f2685d.f2669a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f2126J.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f2126J.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (R()) {
            o(bounds, rectF3);
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.f2138V.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f2138V.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.f2120F0 || this.f2123H == null) {
            rectF = rectF3;
            i4 = saveLayerAlpha;
            i5 = 0;
            i6 = 255;
        } else {
            PointF pointF = this.f2152l0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f2123H;
            i iVar = this.f2154n0;
            if (charSequence != null) {
                float p3 = p() + this.f2142Z + this.f2145c0;
                if (W0.b.a(this) == 0) {
                    pointF.x = bounds.left + p3;
                } else {
                    pointF.x = bounds.right - p3;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f2311a;
                Paint.FontMetrics fontMetrics = this.f2151j0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f2123H != null) {
                float p4 = p() + this.f2142Z + this.f2145c0;
                float q3 = q() + this.f2149g0 + this.f2146d0;
                if (W0.b.a(this) == 0) {
                    rectF3.left = bounds.left + p4;
                    rectF3.right = bounds.right - q3;
                } else {
                    rectF3.left = bounds.left + q3;
                    rectF3.right = bounds.right - p4;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            U1.d dVar = iVar.f2316f;
            TextPaint textPaint2 = iVar.f2311a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f2316f.e(this.f2150h0, textPaint2, iVar.f2312b);
            }
            textPaint2.setTextAlign(align);
            boolean z4 = Math.round(iVar.a(this.f2123H.toString())) > Math.round(rectF3.width());
            if (z4) {
                i7 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i7 = 0;
            }
            CharSequence charSequence2 = this.f2123H;
            if (z4 && this.f2118E0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f2118E0);
            }
            CharSequence charSequence3 = charSequence2;
            int length = charSequence3.length();
            float f10 = pointF.x;
            float f11 = pointF.y;
            rectF = rectF3;
            i4 = saveLayerAlpha;
            i5 = 0;
            i6 = 255;
            canvas.drawText(charSequence3, 0, length, f10, f11, textPaint2);
            if (z4) {
                canvas.restoreToCount(i7);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f12 = this.f2149g0 + this.f2148f0;
                if (W0.b.a(this) == 0) {
                    float f13 = bounds.right - f12;
                    rectF2 = rectF;
                    rectF2.right = f13;
                    rectF2.left = f13 - this.f2134R;
                } else {
                    rectF2 = rectF;
                    float f14 = bounds.left + f12;
                    rectF2.left = f14;
                    rectF2.right = f14 + this.f2134R;
                }
                float exactCenterY = bounds.exactCenterY();
                float f15 = this.f2134R;
                float f16 = exactCenterY - (f15 / 2.0f);
                rectF2.top = f16;
                rectF2.bottom = f16 + f15;
            } else {
                rectF2 = rectF;
            }
            float f17 = rectF2.left;
            float f18 = rectF2.top;
            canvas.translate(f17, f18);
            this.f2131O.setBounds(i5, i5, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = V1.a.f2480a;
            this.f2132P.setBounds(this.f2131O.getBounds());
            this.f2132P.jumpToCurrentState();
            this.f2132P.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.f2162w0 < i6) {
            canvas.restoreToCount(i4);
        }
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2162w0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f2163x0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f2113C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f2154n0.a(this.f2123H.toString()) + p() + this.f2142Z + this.f2145c0 + this.f2146d0 + this.f2149g0), this.f2122G0);
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f2124H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f2113C, this.f2115D);
        } else {
            outline.setRoundRect(bounds, this.f2115D);
        }
        outline.setAlpha(this.f2162w0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        U1.d dVar;
        ColorStateList colorStateList;
        return s(this.f2109A) || s(this.f2111B) || s(this.f2117E) || !((dVar = this.f2154n0.f2316f) == null || (colorStateList = dVar.f2433j) == null || !colorStateList.isStateful()) || ((this.f2137U && this.f2138V != null && this.f2136T) || t(this.f2126J) || t(this.f2138V) || s(this.f2165z0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        W0.b.b(drawable, W0.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f2131O) {
            if (drawable.isStateful()) {
                drawable.setState(this.f2112B0);
            }
            W0.a.h(drawable, this.f2133Q);
            return;
        }
        Drawable drawable2 = this.f2126J;
        if (drawable == drawable2 && this.f2129M) {
            W0.a.h(drawable2, this.f2127K);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f3 = this.f2142Z + this.f2143a0;
            Drawable drawable = this.f2160u0 ? this.f2138V : this.f2126J;
            float f4 = this.f2128L;
            if (f4 <= 0.0f && drawable != null) {
                f4 = drawable.getIntrinsicWidth();
            }
            if (W0.b.a(this) == 0) {
                float f5 = rect.left + f3;
                rectF.left = f5;
                rectF.right = f5 + f4;
            } else {
                float f6 = rect.right - f3;
                rectF.right = f6;
                rectF.left = f6 - f4;
            }
            Drawable drawable2 = this.f2160u0 ? this.f2138V : this.f2126J;
            float f7 = this.f2128L;
            if (f7 <= 0.0f && drawable2 != null) {
                f7 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f2150h0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f7) {
                    f7 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f7 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f7;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i3);
        if (S()) {
            onLayoutDirectionChanged |= W0.b.b(this.f2126J, i3);
        }
        if (R()) {
            onLayoutDirectionChanged |= W0.b.b(this.f2138V, i3);
        }
        if (T()) {
            onLayoutDirectionChanged |= W0.b.b(this.f2131O, i3);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        boolean onLevelChange = super.onLevelChange(i3);
        if (S()) {
            onLevelChange |= this.f2126J.setLevel(i3);
        }
        if (R()) {
            onLevelChange |= this.f2138V.setLevel(i3);
        }
        if (T()) {
            onLevelChange |= this.f2131O.setLevel(i3);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f2124H0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f2112B0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f3 = this.f2143a0;
        Drawable drawable = this.f2160u0 ? this.f2138V : this.f2126J;
        float f4 = this.f2128L;
        if (f4 <= 0.0f && drawable != null) {
            f4 = drawable.getIntrinsicWidth();
        }
        return f4 + f3 + this.f2144b0;
    }

    public final float q() {
        if (T()) {
            return this.f2147e0 + this.f2134R + this.f2148f0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f2124H0 ? this.f2685d.f2669a.f2722e.a(f()) : this.f2115D;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.f2162w0 != i3) {
            this.f2162w0 = i3;
            invalidateSelf();
        }
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2163x0 != colorFilter) {
            this.f2163x0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f2165z0 != colorStateList) {
            this.f2165z0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // X1.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f2110A0 != mode) {
            this.f2110A0 = mode;
            ColorStateList colorStateList = this.f2165z0;
            this.f2164y0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        if (S()) {
            visible |= this.f2126J.setVisible(z3, z4);
        }
        if (R()) {
            visible |= this.f2138V.setVisible(z3, z4);
        }
        if (T()) {
            visible |= this.f2131O.setVisible(z3, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f2116D0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f3969s);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.f.v(int[], int[]):boolean");
    }

    public final void w(boolean z3) {
        if (this.f2136T != z3) {
            this.f2136T = z3;
            float p3 = p();
            if (!z3 && this.f2160u0) {
                this.f2160u0 = false;
            }
            float p4 = p();
            invalidateSelf();
            if (p3 != p4) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f2138V != drawable) {
            float p3 = p();
            this.f2138V = drawable;
            float p4 = p();
            U(this.f2138V);
            n(this.f2138V);
            invalidateSelf();
            if (p3 != p4) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f2139W != colorStateList) {
            this.f2139W = colorStateList;
            if (this.f2137U && (drawable = this.f2138V) != null && this.f2136T) {
                W0.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z3) {
        if (this.f2137U != z3) {
            boolean R2 = R();
            this.f2137U = z3;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f2138V);
                } else {
                    U(this.f2138V);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
