package a2;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import d1.C0205b;
import k.J;

/* loaded from: classes.dex */
public final class y extends C0205b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3076d;

    public y(TextInputLayout textInputLayout) {
        this.f3076d = textInputLayout;
    }

    @Override // d1.C0205b
    public final void d(View view, e1.j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4187a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f4278a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3076d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.f4088w0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z4 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        v vVar = textInputLayout.f4055e;
        J j3 = vVar.f3064e;
        if (j3.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(j3);
            accessibilityNodeInfo.setTraversalAfter(j3);
        } else {
            accessibilityNodeInfo.setTraversalAfter(vVar.f3066g);
        }
        if (!isEmpty) {
            jVar.j(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            jVar.j(charSequence);
            if (!z3 && placeholderText != null) {
                jVar.j(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            jVar.j(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z4) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        J j4 = textInputLayout.f4068m.f3058y;
        if (j4 != null) {
            accessibilityNodeInfo.setLabelFor(j4);
        }
        textInputLayout.f4057f.b().n(jVar);
    }

    @Override // d1.C0205b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f3076d.f4057f.b().o(accessibilityEvent);
    }
}
