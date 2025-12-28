package Q;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public final class e extends AutofillManager.AutofillCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2171a = new e();

    public final void a(a aVar) {
        aVar.f2168c.registerCallback(this);
    }

    public final void b(a aVar) {
        aVar.f2168c.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i3, int i4) {
        super.onAutofillEvent(view, i3, i4);
        Log.d("Autofill Status", i4 != 1 ? i4 != 2 ? i4 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
