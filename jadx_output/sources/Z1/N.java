package z1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new F1.a(5);

    /* renamed from: d, reason: collision with root package name */
    public int f6986d;

    /* renamed from: e, reason: collision with root package name */
    public int f6987e;

    /* renamed from: f, reason: collision with root package name */
    public int f6988f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f6989g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f6990i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f6991j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6992k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6993l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6994m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f6986d);
        parcel.writeInt(this.f6987e);
        parcel.writeInt(this.f6988f);
        if (this.f6988f > 0) {
            parcel.writeIntArray(this.f6989g);
        }
        parcel.writeInt(this.h);
        if (this.h > 0) {
            parcel.writeIntArray(this.f6990i);
        }
        parcel.writeInt(this.f6992k ? 1 : 0);
        parcel.writeInt(this.f6993l ? 1 : 0);
        parcel.writeInt(this.f6994m ? 1 : 0);
        parcel.writeList(this.f6991j);
    }
}
