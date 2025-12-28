package z1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740n implements Parcelable {
    public static final Parcelable.Creator<C0740n> CREATOR = new F1.a(3);

    /* renamed from: d, reason: collision with root package name */
    public int f7068d;

    /* renamed from: e, reason: collision with root package name */
    public int f7069e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7070f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f7068d);
        parcel.writeInt(this.f7069e);
        parcel.writeInt(this.f7070f ? 1 : 0);
    }
}
