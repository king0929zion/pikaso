package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g extends o1.g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6064a;

    public g(EditText editText) {
        this.f6064a = new WeakReference(editText);
    }

    @Override // o1.g
    public final void b() {
        h.a((EditText) this.f6064a.get(), 1);
    }
}
