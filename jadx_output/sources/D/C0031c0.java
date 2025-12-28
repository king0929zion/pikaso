package D;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: D.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031c0 extends N.z implements Parcelable, N.p, Z, L0 {
    public static final Parcelable.Creator<C0031c0> CREATOR = new C0029b0(0);

    /* renamed from: e, reason: collision with root package name */
    public E0 f740e;

    public C0031c0(float f3) {
        E0 e02 = new E0(f3);
        if (N.o.f1755a.i() != null) {
            E0 e03 = new E0(f3);
            e03.f1700a = 1;
            e02.f1701b = e03;
        }
        this.f740e = e02;
    }

    @Override // N.y
    public final void a(N.A a3) {
        p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f740e = (E0) a3;
    }

    @Override // N.y
    public final N.A b() {
        return this.f740e;
    }

    @Override // N.y
    public final N.A c(N.A a3, N.A a4, N.A a5) {
        if (((E0) a4).f689c == ((E0) a5).f689c) {
            return a4;
        }
        return null;
    }

    @Override // N.p
    public final H0 d() {
        return U.f731i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void g(float f3) {
        N.h k3;
        E0 e02 = (E0) N.o.i(this.f740e);
        if (e02.f689c == f3) {
            return;
        }
        E0 e03 = this.f740e;
        synchronized (N.o.f1756b) {
            k3 = N.o.k();
            ((E0) N.o.o(e03, this, k3, e02)).f689c = f3;
        }
        N.o.n(k3, this);
    }

    @Override // D.L0
    public Object getValue() {
        return Float.valueOf(((E0) N.o.t(this.f740e, this)).f689c);
    }

    @Override // D.Z
    public void setValue(Object obj) {
        g(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((E0) N.o.i(this.f740e)).f689c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeFloat(((E0) N.o.t(this.f740e, this)).f689c);
    }
}
