package j1;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import d1.C0209f;
import d1.InterfaceC0208e;
import d1.InterfaceC0219p;

/* loaded from: classes.dex */
public final class p implements InterfaceC0219p {
    public final C0209f a(View view, C0209f c0209f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0209f);
        }
        if (c0209f.f4206a.l() == 2) {
            return c0209f;
        }
        InterfaceC0208e interfaceC0208e = c0209f.f4206a;
        ClipData e3 = interfaceC0208e.e();
        int h = interfaceC0208e.h();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i3 = 0; i3 < e3.getItemCount(); i3++) {
            ClipData.Item itemAt = e3.getItemAt(i3);
            if ((h & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z3) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z3 = true;
                }
            }
        }
        return null;
    }
}
