package a2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.ai.assistance.operit.provider.R;

/* loaded from: classes.dex */
public final class u extends AbstractC0118q {

    /* renamed from: e, reason: collision with root package name */
    public final int f3060e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f3061f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0102a f3062g;

    public u(C0117p c0117p, int i3) {
        super(c0117p);
        this.f3060e = R.drawable.design_password_eye;
        this.f3062g = new ViewOnClickListenerC0102a(this, 2);
        if (i3 != 0) {
            this.f3060e = i3;
        }
    }

    @Override // a2.AbstractC0118q
    public final void b() {
        q();
    }

    @Override // a2.AbstractC0118q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // a2.AbstractC0118q
    public final int d() {
        return this.f3060e;
    }

    @Override // a2.AbstractC0118q
    public final View.OnClickListener f() {
        return this.f3062g;
    }

    @Override // a2.AbstractC0118q
    public final boolean k() {
        return true;
    }

    @Override // a2.AbstractC0118q
    public final boolean l() {
        EditText editText = this.f3061f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // a2.AbstractC0118q
    public final void m(EditText editText) {
        this.f3061f = editText;
        q();
    }

    @Override // a2.AbstractC0118q
    public final void r() {
        EditText editText = this.f3061f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3061f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // a2.AbstractC0118q
    public final void s() {
        EditText editText = this.f3061f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
