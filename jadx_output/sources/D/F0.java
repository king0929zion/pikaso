package D;

/* loaded from: classes.dex */
public final class F0 extends N.A {

    /* renamed from: c, reason: collision with root package name */
    public int f690c;

    public F0(int i3) {
        this.f690c = i3;
    }

    @Override // N.A
    public final void a(N.A a3) {
        p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f690c = ((F0) a3).f690c;
    }

    @Override // N.A
    public final N.A b() {
        return new F0(this.f690c);
    }
}
