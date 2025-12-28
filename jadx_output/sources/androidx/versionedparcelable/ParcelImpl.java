package androidx.versionedparcelable;

import F1.a;
import F1.c;
import F1.d;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(0);

    /* renamed from: d, reason: collision with root package name */
    public final d f3575d;

    public ParcelImpl(Parcel parcel) {
        this.f3575d = new c(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new c(parcel).i(this.f3575d);
    }
}
