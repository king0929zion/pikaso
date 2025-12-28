package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import d1.AbstractC0189K;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3976d;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g.a(null);
        if (c.e(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.ai.assistance.operit.provider.R.id.cancel_button);
            setNextFocusRightId(com.ai.assistance.operit.provider.R.id.confirm_button);
        }
        this.f3976d = c.e(getContext(), com.ai.assistance.operit.provider.R.attr.nestedScrollable);
        AbstractC0189K.j(this, new b(0));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (e) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((e) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ((e) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        if (!z3) {
            super.onFocusChanged(false, i3, rect);
            return;
        }
        if (i3 == 33) {
            ((e) super.getAdapter()).getClass();
            throw null;
        }
        if (i3 != 130) {
            super.onFocusChanged(true, i3, rect);
        } else {
            ((e) super.getAdapter()).getClass();
            throw null;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (!super.onKeyDown(i3, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1) {
            return true;
        }
        getSelectedItemPosition();
        ((e) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f3976d) {
            super.onMeasure(i3, i4);
            return;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i3) {
        ((e) super.getAdapter()).getClass();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (e) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof e)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), e.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
