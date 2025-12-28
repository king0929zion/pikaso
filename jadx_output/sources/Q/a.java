package Q;

import android.view.autofill.AutofillManager;
import o0.C0507u;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final C0507u f2166a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2167b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f2168c;

    public a(C0507u c0507u, f fVar) {
        this.f2166a = c0507u;
        this.f2167b = fVar;
        AutofillManager autofillManager = (AutofillManager) c0507u.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f2168c = autofillManager;
        c0507u.setImportantForAutofill(1);
    }
}
