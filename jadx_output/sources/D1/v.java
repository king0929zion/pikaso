package D1;

import A.AbstractC0000a;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final View f1029b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1028a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1030c = new ArrayList();

    public v(View view) {
        this.f1029b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f1029b == vVar.f1029b && this.f1028a.equals(vVar.f1028a);
    }

    public final int hashCode() {
        return this.f1028a.hashCode() + (this.f1029b.hashCode() * 31);
    }

    public final String toString() {
        String e3 = AbstractC0000a.e(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1029b + "\n", "    values:");
        HashMap hashMap = this.f1028a;
        for (String str : hashMap.keySet()) {
            e3 = e3 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return e3;
    }
}
