package com.google.android.material.timepicker;

import X1.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final R.a f4129s;

    /* renamed from: t, reason: collision with root package name */
    public int f4130t;

    /* renamed from: u, reason: collision with root package name */
    public final X1.g f4131u;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        X1.g gVar = new X1.g();
        this.f4131u = gVar;
        X1.h hVar = new X1.h(0.5f);
        j d3 = gVar.f2685d.f2669a.d();
        d3.f2711e = hVar;
        d3.f2712f = hVar;
        d3.f2713g = hVar;
        d3.h = hVar;
        gVar.setShapeAppearanceModel(d3.a());
        this.f4131u.j(ColorStateList.valueOf(-1));
        X1.g gVar2 = this.f4131u;
        Field field = AbstractC0189K.f4150a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H1.a.f1347m, R.attr.materialClockStyle, 0);
        this.f4130t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4129s = new R.a(8, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        if (view.getId() == -1) {
            Field field = AbstractC0189K.f4150a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            R.a aVar = this.f4129s;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public abstract void f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            R.a aVar = this.f4129s;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i3) {
        this.f4131u.j(ColorStateList.valueOf(i3));
    }
}
