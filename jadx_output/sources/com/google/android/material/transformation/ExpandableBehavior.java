package com.google.android.material.transformation;

import Q0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // Q0.a
    public abstract void b(View view);

    @Override // Q0.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // Q0.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        Field field = AbstractC0189K.f4150a;
        if (!view.isLaidOut()) {
            ArrayList j3 = coordinatorLayout.j(view);
            int size = j3.size();
            for (int i4 = 0; i4 < size; i4++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
