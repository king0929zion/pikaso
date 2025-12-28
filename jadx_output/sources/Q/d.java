package Q;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2170a = new d();

    public final AutofillId a(ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public final boolean b(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean c(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean d(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean e(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i3) {
        viewStructure.setAutofillId(autofillId, i3);
    }

    public final void h(ViewStructure viewStructure, int i3) {
        viewStructure.setAutofillType(i3);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
