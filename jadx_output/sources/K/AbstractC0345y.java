package k;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import d1.AbstractC0189K;
import d1.C0207d;
import d1.InterfaceC0206c;

/* renamed from: k.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0345y {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0206c interfaceC0206c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0206c = new A.t(clipData, 3);
            } else {
                C0207d c0207d = new C0207d();
                c0207d.f4191e = clipData;
                c0207d.f4192f = 3;
                interfaceC0206c = c0207d;
            }
            AbstractC0189K.f(textView, interfaceC0206c.g());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0206c interfaceC0206c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0206c = new A.t(clipData, 3);
        } else {
            C0207d c0207d = new C0207d();
            c0207d.f4191e = clipData;
            c0207d.f4192f = 3;
            interfaceC0206c = c0207d;
        }
        AbstractC0189K.f(view, interfaceC0206c.g());
        return true;
    }
}
