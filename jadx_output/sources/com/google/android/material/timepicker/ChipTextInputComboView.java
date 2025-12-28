package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: d, reason: collision with root package name */
    public final Chip f4095d;

    /* renamed from: e, reason: collision with root package name */
    public final EditText f4096e;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f4095d = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f4096e = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        Field field = AbstractC0189K.f4150a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4095d.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4096e.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z3) {
        Chip chip = this.f4095d;
        chip.setChecked(z3);
        int i3 = z3 ? 0 : 4;
        EditText editText = this.f4096e;
        editText.setVisibility(i3);
        chip.setVisibility(z3 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new R.a(1, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4095d.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i3, Object obj) {
        this.f4095d.setTag(i3, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f4095d.toggle();
    }
}
