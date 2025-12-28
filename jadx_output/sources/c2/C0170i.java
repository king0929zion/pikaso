package c2;

import java.io.Serializable;

/* renamed from: c2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170i implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f3835d;

    public C0170i(Throwable th) {
        p2.g.e(th, "exception");
        this.f3835d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0170i) {
            if (p2.g.a(this.f3835d, ((C0170i) obj).f3835d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3835d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3835d + ')';
    }
}
