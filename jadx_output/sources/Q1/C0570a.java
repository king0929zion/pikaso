package q1;

import android.text.Editable;
import o1.u;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f6051a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0570a f6052b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f6053c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f6053c;
        return cls != null ? new u(cls, charSequence) : super.newEditable(charSequence);
    }
}
