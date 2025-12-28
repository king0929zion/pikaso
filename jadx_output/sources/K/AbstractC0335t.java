package k;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import d1.C0207d;
import d1.C0209f;
import d1.InterfaceC0206c;
import d1.InterfaceC0220q;
import i1.AbstractC0287a;
import i1.C0288b;

/* renamed from: k.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0335t extends EditText implements InterfaceC0220q {

    /* renamed from: d, reason: collision with root package name */
    public final C0322m f4872d;

    /* renamed from: e, reason: collision with root package name */
    public final F f4873e;

    /* renamed from: f, reason: collision with root package name */
    public final B2.i f4874f;

    /* renamed from: g, reason: collision with root package name */
    public final j1.p f4875g;
    public final B2.i h;

    /* renamed from: i, reason: collision with root package name */
    public C0333s f4876i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0335t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        K0.a(context);
        J0.a(this, getContext());
        C0322m c0322m = new C0322m(this);
        this.f4872d = c0322m;
        c0322m.d(attributeSet, R.attr.editTextStyle);
        F f3 = new F(this);
        this.f4873e = f3;
        f3.d(attributeSet, R.attr.editTextStyle);
        f3.b();
        B2.i iVar = new B2.i(10, false);
        iVar.f316e = this;
        this.f4874f = iVar;
        this.f4875g = new j1.p();
        B2.i iVar2 = new B2.i(this, 9);
        this.h = iVar2;
        iVar2.n(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener k3 = iVar2.k(keyListener);
        if (k3 == keyListener) {
            return;
        }
        super.setKeyListener(k3);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C0333s getSuperCaller() {
        if (this.f4876i == null) {
            this.f4876i = new C0333s(this);
        }
        return this.f4876i;
    }

    @Override // d1.InterfaceC0220q
    public final C0209f a(C0209f c0209f) {
        return this.f4875g.a(this, c0209f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0322m c0322m = this.f4872d;
        if (c0322m != null) {
            c0322m.a();
        }
        F f3 = this.f4873e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof j1.o ? ((j1.o) customSelectionActionModeCallback).f4624a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0322m c0322m = this.f4872d;
        if (c0322m != null) {
            return c0322m.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0322m c0322m = this.f4872d;
        if (c0322m != null) {
            return c0322m.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        A1.e eVar = this.f4873e.h;
        if (eVar != null) {
            return (ColorStateList) eVar.f213c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        A1.e eVar = this.f4873e.h;
        if (eVar != null) {
            return (PorterDuff.Mode) eVar.f214d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B2.i iVar;
        if (Build.VERSION.SDK_INT >= 28 || (iVar = this.f4874f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) iVar.f317f;
        return textClassifier == null ? AbstractC0347z.a((TextView) iVar.f316e) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] d3;
        int i3;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4873e.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i4 >= 30) {
                AbstractC0287a.a(editorInfo, text);
            } else {
                text.getClass();
                if (i4 >= 30) {
                    AbstractC0287a.a(editorInfo, text);
                } else {
                    int i5 = editorInfo.initialSelStart;
                    int i6 = editorInfo.initialSelEnd;
                    int i7 = i5 > i6 ? i6 : i5;
                    if (i5 <= i6) {
                        i5 = i6;
                    }
                    int length = text.length();
                    if (i7 < 0 || i5 > length) {
                        Z0.d.Q(editorInfo, null, 0, 0);
                    } else {
                        int i8 = editorInfo.inputType & 4095;
                        if (i8 == 129 || i8 == 225 || i8 == 18) {
                            Z0.d.Q(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            Z0.d.Q(editorInfo, text, i7, i5);
                        } else {
                            int i9 = i5 - i7;
                            int i10 = i9 > 1024 ? 0 : i9;
                            int i11 = 2048 - i10;
                            int min = Math.min(text.length() - i5, i11 - Math.min(i7, (int) (i11 * 0.8d)));
                            int min2 = Math.min(i7, i11 - min);
                            int i12 = i7 - min2;
                            if (Character.isLowSurrogate(text.charAt(i12))) {
                                i3 = 1;
                                i12++;
                                min2--;
                            } else {
                                i3 = 1;
                            }
                            if (Character.isHighSurrogate(text.charAt((i5 + min) - i3))) {
                                min -= i3;
                            }
                            int i13 = min2 + i10;
                            Z0.d.Q(editorInfo, i10 != i9 ? TextUtils.concat(text.subSequence(i12, i12 + min2), text.subSequence(i5, min + i5)) : text.subSequence(i12, i13 + min + i12), min2, i13);
                        }
                    }
                }
            }
        }
        Z.b.E(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i4 <= 30 && (d3 = AbstractC0189K.d(this)) != null) {
            editorInfo.contentMimeTypes = d3;
            onCreateInputConnection = new C0288b(onCreateInputConnection, new N.g(this));
        }
        return this.h.p(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z3 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC0189K.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z3 = AbstractC0345y.a(dragEvent, this, activity);
            }
        }
        if (z3) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        InterfaceC0206c interfaceC0206c;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || AbstractC0189K.d(this) == null || !(i3 == 16908322 || i3 == 16908337)) {
            return super.onTextContextMenuItem(i3);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i4 >= 31) {
                interfaceC0206c = new A.t(primaryClip, 1);
            } else {
                C0207d c0207d = new C0207d();
                c0207d.f4191e = primaryClip;
                c0207d.f4192f = 1;
                interfaceC0206c = c0207d;
            }
            interfaceC0206c.p(i3 == 16908322 ? 0 : 1);
            AbstractC0189K.f(this, interfaceC0206c.g());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0322m c0322m = this.f4872d;
        if (c0322m != null) {
            c0322m.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0322m c0322m = this.f4872d;
        if (c0322m != null) {
            c0322m.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4873e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        F f3 = this.f4873e;
        if (f3 != null) {
            f3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Z0.d.W(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.h.t(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.k(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0322m c0322m = this.f4872d;
        if (c0322m != null) {
            c0322m.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0322m c0322m = this.f4872d;
        if (c0322m != null) {
            c0322m.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        F f3 = this.f4873e;
        f3.i(colorStateList);
        f3.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        F f3 = this.f4873e;
        f3.j(mode);
        f3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        F f3 = this.f4873e;
        if (f3 != null) {
            f3.e(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B2.i iVar;
        if (Build.VERSION.SDK_INT >= 28 || (iVar = this.f4874f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            iVar.f317f = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
