package D;

/* loaded from: classes.dex */
public final class N0 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f713a;

    public N0(Object obj) {
        this.f713a = obj;
    }

    @Override // D.O0
    public final Object a(InterfaceC0045j0 interfaceC0045j0) {
        return this.f713a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N0) && p2.g.a(this.f713a, ((N0) obj).f713a);
    }

    public final int hashCode() {
        Object obj = this.f713a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f713a + ')';
    }
}
