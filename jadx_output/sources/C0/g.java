package C0;

import A.t;
import D.C0037f0;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import q1.C0572c;

/* loaded from: classes.dex */
public final class g extends o1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f571a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f572b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f573c;

    public g(C0037f0 c0037f0, t tVar) {
        this.f572b = c0037f0;
        this.f573c = tVar;
    }

    @Override // o1.g
    public void a() {
        switch (this.f571a) {
            case 0:
                ((t) this.f573c).f175e = j.f576a;
                break;
        }
    }

    @Override // o1.g
    public final void b() {
        InputFilter[] filters;
        int length;
        switch (this.f571a) {
            case 0:
                ((C0037f0) this.f572b).setValue(Boolean.TRUE);
                ((t) this.f573c).f175e = new k(true);
                break;
            default:
                TextView textView = (TextView) ((WeakReference) this.f572b).get();
                InputFilter inputFilter = (InputFilter) ((WeakReference) this.f573c).get();
                if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                    for (InputFilter inputFilter2 : filters) {
                        if (inputFilter2 == inputFilter) {
                            if (textView.isAttachedToWindow()) {
                                CharSequence text = textView.getText();
                                o1.i a3 = o1.i.a();
                                if (text == null) {
                                    length = 0;
                                } else {
                                    a3.getClass();
                                    length = text.length();
                                }
                                CharSequence f3 = a3.f(0, length, 0, text);
                                if (text != f3) {
                                    int selectionStart = Selection.getSelectionStart(f3);
                                    int selectionEnd = Selection.getSelectionEnd(f3);
                                    textView.setText(f3);
                                    if (f3 instanceof Spannable) {
                                        Spannable spannable = (Spannable) f3;
                                        if (selectionStart < 0 || selectionEnd < 0) {
                                            if (selectionStart >= 0) {
                                                Selection.setSelection(spannable, selectionStart);
                                                break;
                                            } else if (selectionEnd >= 0) {
                                                Selection.setSelection(spannable, selectionEnd);
                                                break;
                                            }
                                        } else {
                                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    public g(TextView textView, C0572c c0572c) {
        this.f572b = new WeakReference(textView);
        this.f573c = new WeakReference(c0572c);
    }
}
