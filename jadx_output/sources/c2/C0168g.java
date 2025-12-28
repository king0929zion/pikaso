package c2;

import java.io.Serializable;

/* renamed from: c2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168g implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3833d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3834e;

    public C0168g(Object obj, Object obj2) {
        this.f3833d = obj;
        this.f3834e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0168g)) {
            return false;
        }
        C0168g c0168g = (C0168g) obj;
        return p2.g.a(this.f3833d, c0168g.f3833d) && p2.g.a(this.f3834e, c0168g.f3834e);
    }

    public final int hashCode() {
        Object obj = this.f3833d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3834e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3833d + ", " + this.f3834e + ')';
    }
}
