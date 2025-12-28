package D;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: D.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037f0 extends N.z implements Parcelable, N.p {
    public static final Parcelable.Creator<C0037f0> CREATOR = new C0035e0();

    /* renamed from: e, reason: collision with root package name */
    public final H0 f751e;

    /* renamed from: f, reason: collision with root package name */
    public G0 f752f;

    public C0037f0(Object obj, H0 h02) {
        this.f751e = h02;
        G0 g02 = new G0(obj);
        if (N.o.f1755a.i() != null) {
            G0 g03 = new G0(obj);
            g03.f1700a = 1;
            g02.f1701b = g03;
        }
        this.f752f = g02;
    }

    @Override // N.y
    public final void a(N.A a3) {
        p2.g.c(a3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f752f = (G0) a3;
    }

    @Override // N.y
    public final N.A b() {
        return this.f752f;
    }

    @Override // N.y
    public final N.A c(N.A a3, N.A a4, N.A a5) {
        if (this.f751e.a(((G0) a4).f691c, ((G0) a5).f691c)) {
            return a4;
        }
        return null;
    }

    @Override // N.p
    public final H0 d() {
        return this.f751e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // D.L0
    public final Object getValue() {
        return ((G0) N.o.t(this.f752f, this)).f691c;
    }

    @Override // D.Z
    public final void setValue(Object obj) {
        N.h k3;
        G0 g02 = (G0) N.o.i(this.f752f);
        if (this.f751e.a(g02.f691c, obj)) {
            return;
        }
        G0 g03 = this.f752f;
        synchronized (N.o.f1756b) {
            k3 = N.o.k();
            ((G0) N.o.o(g03, this, k3, g02)).f691c = obj;
        }
        N.o.n(k3, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((G0) N.o.i(this.f752f)).f691c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int i4;
        parcel.writeValue(getValue());
        U u3 = U.f729f;
        H0 h02 = this.f751e;
        if (p2.g.a(h02, u3)) {
            i4 = 0;
        } else if (p2.g.a(h02, U.f731i)) {
            i4 = 1;
        } else {
            if (!p2.g.a(h02, U.f730g)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i4 = 2;
        }
        parcel.writeInt(i4);
    }
}
