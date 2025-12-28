package D;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: D.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033d0 extends N.z implements Parcelable, N.p, Z, L0 {
    public static final Parcelable.Creator<C0033d0> CREATOR = new C0029b0(1);

    /* renamed from: e, reason: collision with root package name */
    public F0 f748e;

    public C0033d0(int i3) {
        F0 f02 = new F0(i3);
        if (N.o.f1755a.i() != null) {
            F0 f03 = new F0(i3);
            f03.f1700a = 1;
            f02.f1701b = f03;
        }
        this.f748e = f02;
    }

    @Override // N.y
    public final void a(N.A a3) {
        p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f748e = (F0) a3;
    }

    @Override // N.y
    public final N.A b() {
        return this.f748e;
    }

    @Override // N.y
    public final N.A c(N.A a3, N.A a4, N.A a5) {
        if (((F0) a4).f690c == ((F0) a5).f690c) {
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

    public final void g(int i3) {
        N.h k3;
        F0 f02 = (F0) N.o.i(this.f748e);
        if (f02.f690c != i3) {
            F0 f03 = this.f748e;
            synchronized (N.o.f1756b) {
                k3 = N.o.k();
                ((F0) N.o.o(f03, this, k3, f02)).f690c = i3;
            }
            N.o.n(k3, this);
        }
    }

    @Override // D.L0
    public Object getValue() {
        return Integer.valueOf(((F0) N.o.t(this.f748e, this)).f690c);
    }

    @Override // D.Z
    public void setValue(Object obj) {
        g(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((F0) N.o.i(this.f748e)).f690c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(((F0) N.o.t(this.f748e, this)).f690c);
    }
}
