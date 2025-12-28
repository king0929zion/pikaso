package a2;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: a2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0118q {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3022a;

    /* renamed from: b, reason: collision with root package name */
    public final C0117p f3023b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3024c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f3025d;

    public AbstractC0118q(C0117p c0117p) {
        this.f3022a = c0117p.f3001d;
        this.f3023b = c0117p;
        this.f3024c = c0117p.getContext();
        this.f3025d = c0117p.f3006j;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public N.g h() {
        return null;
    }

    public boolean i(int i3) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof C0112k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(e1.j jVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z3) {
    }

    public final void q() {
        this.f3023b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
