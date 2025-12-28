package com.google.android.material.timepicker;

import O0.l;
import a.AbstractC0090a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final c f4097A;

    /* renamed from: B, reason: collision with root package name */
    public final int[] f4098B;

    /* renamed from: C, reason: collision with root package name */
    public final float[] f4099C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4100D;

    /* renamed from: E, reason: collision with root package name */
    public final int f4101E;

    /* renamed from: F, reason: collision with root package name */
    public final int f4102F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4103G;

    /* renamed from: H, reason: collision with root package name */
    public final String[] f4104H;

    /* renamed from: I, reason: collision with root package name */
    public float f4105I;

    /* renamed from: J, reason: collision with root package name */
    public final ColorStateList f4106J;

    /* renamed from: v, reason: collision with root package name */
    public final ClockHandView f4107v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f4108w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f4109x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f4110y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseArray f4111z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4108w = new Rect();
        this.f4109x = new RectF();
        this.f4110y = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f4111z = sparseArray;
        this.f4099C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H1.a.f1338c, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList F3 = AbstractC0090a.F(context, obtainStyledAttributes, 1);
        this.f4106J = F3;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f4107v = clockHandView;
        this.f4100D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = F3.getColorForState(new int[]{android.R.attr.state_selected}, F3.getDefaultColor());
        this.f4098B = new int[]{colorForState, colorForState, F3.getDefaultColor()};
        clockHandView.f4114f.add(this);
        int defaultColor = r2.a.y(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList F4 = AbstractC0090a.F(context, obtainStyledAttributes, 0);
        setBackgroundColor(F4 != null ? F4.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f4097A = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f4104H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < Math.max(this.f4104H.length, size); i3++) {
            TextView textView = (TextView) sparseArray.get(i3);
            if (i3 >= this.f4104H.length) {
                removeView(textView);
                sparseArray.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.f4104H[i3]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i3));
                int i4 = (i3 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i4));
                z3 = i4 > 1 ? true : z3;
                AbstractC0189K.j(textView, this.f4097A);
                textView.setTextColor(this.f4106J);
            }
        }
        ClockHandView clockHandView2 = this.f4107v;
        if (clockHandView2.f4113e && !z3) {
            clockHandView2.f4123p = 1;
        }
        clockHandView2.f4113e = z3;
        clockHandView2.invalidate();
        this.f4101E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f4102F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f4103G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void f() {
        l lVar = new l();
        lVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i4 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!hashMap.containsKey(i4)) {
                    hashMap.put(i4, new ArrayList());
                }
                ((List) hashMap.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f4130t * 0.66f) : this.f4130t;
            Iterator it = list.iterator();
            float f3 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = lVar.f2049c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new O0.g());
                }
                O0.h hVar = ((O0.g) hashMap2.get(Integer.valueOf(id))).f1961d;
                hVar.f2020w = R.id.circle_center;
                hVar.f2021x = round;
                hVar.f2022y = f3;
                f3 += 360.0f / list.size();
            }
        }
        lVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f4111z;
            if (i5 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i5)).setVisibility(0);
            i5++;
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f4107v.f4117j;
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        int i3 = 0;
        while (true) {
            sparseArray = this.f4111z;
            int size = sparseArray.size();
            rectF = this.f4109x;
            rect = this.f4108w;
            if (i3 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i3);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f3) {
                    textView = textView2;
                    f3 = height;
                }
            }
            i3++;
        }
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            TextView textView3 = (TextView) sparseArray.get(i4);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f4110y);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f4098B, this.f4099C, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f4104H.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f4103G / Math.max(Math.max(this.f4101E / displayMetrics.heightPixels, this.f4102F / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
