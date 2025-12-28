package com.google.android.material.internal;

import N1.e;
import S1.a;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import d1.AbstractC0189K;
import k.C0339v;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0339v implements Checkable {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f3981j = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public boolean f3982g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3983i;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ai.assistance.operit.provider.R.attr.imageButtonStyle);
        this.h = true;
        this.f3983i = true;
        AbstractC0189K.j(this, new e(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3982g;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        return this.f3982g ? View.mergeDrawableStates(super.onCreateDrawableState(i3 + 1), f3981j) : super.onCreateDrawableState(i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f4957d);
        setChecked(aVar.f2235f);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f2235f = this.f3982g;
        return aVar;
    }

    public void setCheckable(boolean z3) {
        if (this.h != z3) {
            this.h = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.h || this.f3982g == z3) {
            return;
        }
        this.f3982g = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z3) {
        this.f3983i = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.f3983i) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3982g);
    }
}
