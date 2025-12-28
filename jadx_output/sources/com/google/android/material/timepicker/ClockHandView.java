package com.google.android.material.timepicker;

import a.AbstractC0090a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f4112d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4113e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4114f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4115g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f4116i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f4117j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4118k;

    /* renamed from: l, reason: collision with root package name */
    public float f4119l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4120m;

    /* renamed from: n, reason: collision with root package name */
    public double f4121n;

    /* renamed from: o, reason: collision with root package name */
    public int f4122o;

    /* renamed from: p, reason: collision with root package name */
    public int f4123p;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f4112d = new ValueAnimator();
        this.f4114f = new ArrayList();
        Paint paint = new Paint();
        this.f4116i = paint;
        this.f4117j = new RectF();
        this.f4123p = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H1.a.f1339d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0090a.a0(context, R.attr.motionDurationLong2, 200);
        AbstractC0090a.b0(context, R.attr.motionEasingEmphasizedInterpolator, I1.a.f1391b);
        this.f4122o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f4115g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f4118k = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.h = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        Field field = AbstractC0189K.f4150a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i3) {
        return i3 == 2 ? Math.round(this.f4122o * 0.66f) : this.f4122o;
    }

    public final void b(float f3) {
        ValueAnimator valueAnimator = this.f4112d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f4 = f3 % 360.0f;
        this.f4119l = f4;
        this.f4121n = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a3 = a(this.f4123p);
        float cos = (((float) Math.cos(this.f4121n)) * a3) + width;
        float sin = (a3 * ((float) Math.sin(this.f4121n))) + height;
        float f5 = this.f4115g;
        this.f4117j.set(cos - f5, sin - f5, cos + f5, sin + f5);
        Iterator it = this.f4114f.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f4105I - f4) > 0.001f) {
                clockFaceView.f4105I = f4;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f3 = width;
        float a3 = a(this.f4123p);
        float cos = (((float) Math.cos(this.f4121n)) * a3) + f3;
        float f4 = height;
        float sin = (a3 * ((float) Math.sin(this.f4121n))) + f4;
        Paint paint = this.f4116i;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f4115g, paint);
        double sin2 = Math.sin(this.f4121n);
        paint.setStrokeWidth(this.f4118k);
        canvas.drawLine(f3, f4, width + ((int) (Math.cos(this.f4121n) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f3, f4, this.h, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (this.f4112d.isRunning()) {
            return;
        }
        b(this.f4119l);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean z5 = false;
        if (actionMasked == 0) {
            this.f4120m = false;
            z3 = true;
            z4 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z4 = this.f4120m;
            if (this.f4113e) {
                this.f4123p = ((float) Math.hypot((double) (x3 - ((float) (getWidth() / 2))), (double) (y3 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z3 = false;
        } else {
            z4 = false;
            z3 = false;
        }
        boolean z6 = this.f4120m;
        int degrees = (int) Math.toDegrees(Math.atan2(y3 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i3 = degrees + 90;
        if (i3 < 0) {
            i3 = degrees + 450;
        }
        float f3 = i3;
        boolean z7 = this.f4119l != f3;
        if (!z3 || !z7) {
            if (z7 || z4) {
                b(f3);
            }
            this.f4120m = z6 | z5;
            return true;
        }
        z5 = true;
        this.f4120m = z6 | z5;
        return true;
    }
}
