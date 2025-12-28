package androidx.lifecycle;

import android.os.Bundle;
import c2.C0172k;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class F implements A1.d {

    /* renamed from: a, reason: collision with root package name */
    public final A1.e f3451a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3452b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3453c;

    /* renamed from: d, reason: collision with root package name */
    public final C0172k f3454d;

    public F(A1.e eVar, b.k kVar) {
        p2.g.e(eVar, "savedStateRegistry");
        this.f3451a = eVar;
        this.f3454d = Z.b.C(new A0.c(8, kVar));
    }

    @Override // A1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3453c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((G) this.f3454d.getValue()).f3456b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f3452b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
