package a2;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0102a implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0118q f2959e;

    public /* synthetic */ ViewOnClickListenerC0102a(AbstractC0118q abstractC0118q, int i3) {
        this.f2958d = i3;
        this.f2959e = abstractC0118q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2958d) {
            case 0:
                C0106e c0106e = (C0106e) this.f2959e;
                EditText editText = c0106e.f2969i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c0106e.q();
                    break;
                }
                break;
            case 1:
                ((C0112k) this.f2959e).u();
                break;
            default:
                u uVar = (u) this.f2959e;
                EditText editText2 = uVar.f3061f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = uVar.f3061f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        uVar.f3061f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        uVar.f3061f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        uVar.f3061f.setSelection(selectionEnd);
                    }
                    uVar.q();
                    break;
                }
                break;
        }
    }
}
