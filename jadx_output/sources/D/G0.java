package D;

/* loaded from: classes.dex */
public final class G0 extends N.A {

    /* renamed from: c, reason: collision with root package name */
    public Object f691c;

    public G0(Object obj) {
        this.f691c = obj;
    }

    @Override // N.A
    public final void a(N.A a3) {
        p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f691c = ((G0) a3).f691c;
    }

    @Override // N.A
    public final N.A b() {
        return new G0(this.f691c);
    }
}
