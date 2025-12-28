package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: q1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573d implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f6058a;

    /* renamed from: b, reason: collision with root package name */
    public final X1.e f6059b;

    public C0573d(KeyListener keyListener) {
        X1.e eVar = new X1.e(28);
        this.f6058a = keyListener;
        this.f6059b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f6058a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f6058a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean z3;
        this.f6059b.getClass();
        if (i3 != 67 ? i3 != 112 ? false : B0.a.e(editable, keyEvent, true) : B0.a.e(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        return z3 || this.f6058a.onKeyDown(view, editable, i3, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f6058a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f6058a.onKeyUp(view, editable, i3, keyEvent);
    }
}
