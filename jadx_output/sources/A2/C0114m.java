package a2;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: a2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0117p f2994a;

    public C0114m(C0117p c0117p) {
        this.f2994a = c0117p;
    }

    public final void a(TextInputLayout textInputLayout) {
        C0117p c0117p = this.f2994a;
        if (c0117p.f3018v == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0117p.f3018v;
        C0113l c0113l = c0117p.f3021y;
        if (editText != null) {
            editText.removeTextChangedListener(c0113l);
            if (c0117p.f3018v.getOnFocusChangeListener() == c0117p.b().e()) {
                c0117p.f3018v.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0117p.f3018v = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0113l);
        }
        c0117p.b().m(c0117p.f3018v);
        c0117p.j(c0117p.b());
    }
}
