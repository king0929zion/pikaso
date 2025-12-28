package q1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: q1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572c implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6056a;

    /* renamed from: b, reason: collision with root package name */
    public C0.g f6057b;

    public C0572c(TextView textView) {
        this.f6056a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
        TextView textView = this.f6056a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b3 = o1.i.a().b();
        if (b3 != 0) {
            if (b3 == 1) {
                if ((i6 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i4);
                }
                return o1.i.a().f(0, charSequence.length(), 0, charSequence);
            }
            if (b3 != 3) {
                return charSequence;
            }
        }
        o1.i a3 = o1.i.a();
        if (this.f6057b == null) {
            this.f6057b = new C0.g(textView, this);
        }
        a3.g(this.f6057b);
        return charSequence;
    }
}
