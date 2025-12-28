package com.google.android.material.snackbar;

import I1.a;
import a.AbstractC0090a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public TextView f4018d;

    /* renamed from: e, reason: collision with root package name */
    public Button f4019e;

    /* renamed from: f, reason: collision with root package name */
    public int f4020f;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0090a.b0(context, R.attr.motionEasingEmphasizedInterpolator, a.f1391b);
    }

    public final boolean a(int i3, int i4, int i5) {
        boolean z3;
        if (i3 != getOrientation()) {
            setOrientation(i3);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f4018d.getPaddingTop() == i4 && this.f4018d.getPaddingBottom() == i5) {
            return z3;
        }
        TextView textView = this.f4018d;
        Field field = AbstractC0189K.f4150a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i4, textView.getPaddingEnd(), i5);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i5);
        return true;
    }

    public Button getActionView() {
        return this.f4019e;
    }

    public TextView getMessageView() {
        return this.f4018d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4018d = (TextView) findViewById(R.id.snackbar_text);
        this.f4019e = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f4018d.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f4020f <= 0 || this.f4019e.getMeasuredWidth() <= this.f4020f) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i3, i4);
    }

    public void setMaxInlineActionWidth(int i3) {
        this.f4020f = i3;
    }
}
