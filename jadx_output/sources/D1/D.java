package D1;

import android.view.ViewGroup;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f957a;

    public D(ViewGroup viewGroup) {
        this.f957a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof D) && ((D) obj).f957a.equals(this.f957a);
    }

    public final int hashCode() {
        return this.f957a.hashCode();
    }
}
