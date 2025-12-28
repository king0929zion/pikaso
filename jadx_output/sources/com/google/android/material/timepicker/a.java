package com.google.android.material.timepicker;

import S1.j;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f4126d;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f4126d = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f4126d;
        if (isEmpty) {
            chipTextInputComboView.f4095d.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a3 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f4095d;
        if (TextUtils.isEmpty(a3)) {
            a3 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a3);
    }
}
