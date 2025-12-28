package t0;

import c2.InterfaceC0164c;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6198a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0164c f6199b;

    public C0599a(String str, InterfaceC0164c interfaceC0164c) {
        this.f6198a = str;
        this.f6199b = interfaceC0164c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0599a)) {
            return false;
        }
        C0599a c0599a = (C0599a) obj;
        return p2.g.a(this.f6198a, c0599a.f6198a) && p2.g.a(this.f6199b, c0599a.f6199b);
    }

    public final int hashCode() {
        String str = this.f6198a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0164c interfaceC0164c = this.f6199b;
        return hashCode + (interfaceC0164c != null ? interfaceC0164c.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f6198a + ", action=" + this.f6199b + ')';
    }
}
