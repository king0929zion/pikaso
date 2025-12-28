package D;

/* loaded from: classes.dex */
public final class E0 extends N.A {

    /* renamed from: c, reason: collision with root package name */
    public float f689c;

    public E0(float f3) {
        this.f689c = f3;
    }

    @Override // N.A
    public final void a(N.A a3) {
        p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f689c = ((E0) a3).f689c;
    }

    @Override // N.A
    public final N.A b() {
        return new E0(this.f689c);
    }
}
