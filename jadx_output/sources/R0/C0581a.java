package r0;

import c0.C0154e;
import p2.g;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581a {

    /* renamed from: a, reason: collision with root package name */
    public final C0154e f6107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6108b;

    public C0581a(C0154e c0154e, int i3) {
        this.f6107a = c0154e;
        this.f6108b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0581a)) {
            return false;
        }
        C0581a c0581a = (C0581a) obj;
        return g.a(this.f6107a, c0581a.f6107a) && this.f6108b == c0581a.f6108b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6108b) + (this.f6107a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.f6107a + ", configFlags=" + this.f6108b + ')';
    }
}
