package D;

/* loaded from: classes.dex */
public final class I implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0037f0 f693a;

    public I(C0037f0 c0037f0) {
        this.f693a = c0037f0;
    }

    @Override // D.O0
    public final Object a(InterfaceC0045j0 interfaceC0045j0) {
        return this.f693a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && this.f693a.equals(((I) obj).f693a);
    }

    public final int hashCode() {
        return this.f693a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f693a + ')';
    }
}
