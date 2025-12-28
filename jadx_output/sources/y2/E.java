package y2;

/* loaded from: classes.dex */
public final class E implements N {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6753d;

    public E(boolean z3) {
        this.f6753d = z3;
    }

    @Override // y2.N
    public final boolean b() {
        return this.f6753d;
    }

    @Override // y2.N
    public final d0 g() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f6753d ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
