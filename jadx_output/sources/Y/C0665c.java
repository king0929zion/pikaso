package y;

import A.AbstractC0000a;
import W.r;

/* renamed from: y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665c {

    /* renamed from: a, reason: collision with root package name */
    public final long f6738a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6739b;

    public C0665c(long j3, long j4) {
        this.f6738a = j3;
        this.f6739b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0665c)) {
            return false;
        }
        C0665c c0665c = (C0665c) obj;
        return r.c(this.f6738a, c0665c.f6738a) && r.c(this.f6739b, c0665c.f6739b);
    }

    public final int hashCode() {
        int i3 = r.f2563g;
        return Long.hashCode(this.f6739b) + (Long.hashCode(this.f6738a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0000a.i(this.f6738a, sb, ", selectionBackgroundColor=");
        sb.append((Object) r.i(this.f6739b));
        sb.append(')');
        return sb.toString();
    }
}
