package z1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new F1.a(4);

    /* renamed from: d, reason: collision with root package name */
    public int f6982d;

    /* renamed from: e, reason: collision with root package name */
    public int f6983e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f6984f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6985g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f6982d + ", mGapDir=" + this.f6983e + ", mHasUnwantedGapAfter=" + this.f6985g + ", mGapPerSpan=" + Arrays.toString(this.f6984f) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f6982d);
        parcel.writeInt(this.f6983e);
        parcel.writeInt(this.f6985g ? 1 : 0);
        int[] iArr = this.f6984f;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f6984f);
        }
    }
}
