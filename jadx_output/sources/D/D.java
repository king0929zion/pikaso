package D;

/* loaded from: classes.dex */
public final class D extends N.z implements L0 {

    /* renamed from: e, reason: collision with root package name */
    public final p2.h f663e;

    /* renamed from: f, reason: collision with root package name */
    public B f664f = new B();

    /* JADX WARN: Multi-variable type inference failed */
    public D(o2.a aVar) {
        this.f663e = (p2.h) aVar;
    }

    @Override // N.y
    public final void a(N.A a3) {
        p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f664f = (B) a3;
    }

    @Override // N.y
    public final N.A b() {
        return this.f664f;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D.B g(D.B r22, N.h r23, boolean r24, o2.a r25) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.D.g(D.B, N.h, boolean, o2.a):D.B");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o2.a, p2.h] */
    @Override // D.L0
    public final Object getValue() {
        o2.c f3 = N.o.k().f();
        if (f3 != null) {
            f3.i(this);
        }
        N.h k3 = N.o.k();
        return g((B) N.o.j(this.f664f, k3), k3, true, this.f663e).f645f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o2.a, p2.h] */
    public final B h() {
        N.h k3 = N.o.k();
        return g((B) N.o.j(this.f664f, k3), k3, false, this.f663e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        B b3 = (B) N.o.i(this.f664f);
        sb.append(b3.c(this, N.o.k()) ? String.valueOf(b3.f645f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
