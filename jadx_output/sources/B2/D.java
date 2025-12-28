package B2;

import d2.AbstractC0240k;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final long f288a;

    /* renamed from: b, reason: collision with root package name */
    public final long f289b;

    public D(long j3, long j4) {
        this.f288a = j3;
        this.f289b = j4;
        if (j3 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j3 + " ms) cannot be negative").toString());
        }
        if (j4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j4 + " ms) cannot be negative").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            D d3 = (D) obj;
            if (this.f288a == d3.f288a && this.f289b == d3.f289b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f289b) + (Long.hashCode(this.f288a) * 31);
    }

    public final String toString() {
        e2.a aVar = new e2.a(2);
        long j3 = this.f288a;
        if (j3 > 0) {
            aVar.add("stopTimeout=" + j3 + "ms");
        }
        long j4 = this.f289b;
        if (j4 < Long.MAX_VALUE) {
            aVar.add("replayExpiration=" + j4 + "ms");
        }
        if (aVar.h != null) {
            throw new IllegalStateException();
        }
        aVar.g();
        aVar.f4286g = true;
        if (aVar.f4285f <= 0) {
            aVar = e2.a.f4282j;
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC0240k.d0(aVar, null, null, null, null, 63) + ')';
    }
}
