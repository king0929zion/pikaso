package a2;

import android.text.Editable;

/* renamed from: a2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113l extends S1.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0117p f2993d;

    public C0113l(C0117p c0117p) {
        this.f2993d = c0117p;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2993d.b().a();
    }

    @Override // S1.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        this.f2993d.b().b();
    }
}
