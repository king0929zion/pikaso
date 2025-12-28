package P1;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.chip.Chip;
import e1.j;
import java.util.ArrayList;
import n1.AbstractC0446b;

/* loaded from: classes.dex */
public final class d extends AbstractC0446b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f2107q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f2107q = chip;
    }

    @Override // n1.AbstractC0446b
    public final void l(ArrayList arrayList) {
        boolean z3 = false;
        arrayList.add(0);
        Rect rect = Chip.f3958z;
        Chip chip = this.f2107q;
        if (chip.c()) {
            f fVar = chip.h;
            if (fVar != null && fVar.f2130N) {
                z3 = true;
            }
            if (!z3 || chip.f3961k == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // n1.AbstractC0446b
    public final void o(int i3, j jVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f4278a;
        if (i3 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f3958z);
            return;
        }
        Chip chip = this.f2107q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        jVar.b(e1.e.f4264e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
