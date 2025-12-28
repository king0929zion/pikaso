package q1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import p1.C0546b;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f6054a;

    /* renamed from: b, reason: collision with root package name */
    public final X1.e f6055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0571b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        X1.e eVar = new X1.e(27);
        this.f6054a = editText;
        this.f6055b = eVar;
        if (o1.i.c()) {
            o1.i a3 = o1.i.a();
            if (a3.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            o1.f fVar = a3.f5773e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            C0546b c0546b = (C0546b) fVar.f5766c.f1031a;
            int a4 = c0546b.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a4 != 0 ? c0546b.f5940b.getInt(a4 + c0546b.f5939a) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f5764a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        Editable editableText = this.f6054a.getEditableText();
        this.f6055b.getClass();
        return X1.e.h(this, editableText, i3, i4, false) || super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        Editable editableText = this.f6054a.getEditableText();
        this.f6055b.getClass();
        return X1.e.h(this, editableText, i3, i4, true) || super.deleteSurroundingTextInCodePoints(i3, i4);
    }
}
