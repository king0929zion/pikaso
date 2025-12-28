package q1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class h implements TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final EditText f6065d;

    /* renamed from: e, reason: collision with root package name */
    public g f6066e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6067f = true;

    public h(EditText editText) {
        this.f6065d = editText;
    }

    public static void a(EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            o1.i a3 = o1.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                a3.getClass();
                length = editableText.length();
            }
            a3.f(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        EditText editText = this.f6065d;
        if (!editText.isInEditMode() && this.f6067f && o1.i.c() && i4 <= i5 && (charSequence instanceof Spannable)) {
            int b3 = o1.i.a().b();
            if (b3 != 0) {
                if (b3 == 1) {
                    o1.i.a().f(i3, i5 + i3, 0, (Spannable) charSequence);
                    return;
                } else if (b3 != 3) {
                    return;
                }
            }
            o1.i a3 = o1.i.a();
            if (this.f6066e == null) {
                this.f6066e = new g(editText);
            }
            a3.g(this.f6066e);
        }
    }
}
