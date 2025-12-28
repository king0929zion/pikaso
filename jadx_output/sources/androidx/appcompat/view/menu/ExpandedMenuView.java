package androidx.appcompat.view.menu;

import B0.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j.h;
import j.j;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h, AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3088d = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        a y3 = a.y(context, attributeSet, f3088d, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) y3.f272c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(y3.m(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(y3.m(1));
        }
        y3.C();
    }

    @Override // j.h
    public final boolean a(j jVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        throw null;
    }
}
