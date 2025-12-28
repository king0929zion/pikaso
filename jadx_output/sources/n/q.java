package N;

/* loaded from: classes.dex */
public final class q extends A {

    /* renamed from: c, reason: collision with root package name */
    public H.c f1765c;

    /* renamed from: d, reason: collision with root package name */
    public int f1766d;

    /* renamed from: e, reason: collision with root package name */
    public int f1767e;

    public q(H.c cVar) {
        this.f1765c = cVar;
    }

    @Override // N.A
    public final void a(A a3) {
        synchronized (t.f1771a) {
            p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f1765c = ((q) a3).f1765c;
            this.f1766d = ((q) a3).f1766d;
            this.f1767e = ((q) a3).f1767e;
        }
    }

    @Override // N.A
    public final A b() {
        return new q(this.f1765c);
    }
}
