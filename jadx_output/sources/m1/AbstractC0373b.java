package m1;

import M1.f;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0373b implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final Parcelable f4957d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0372a f4956e = new C0372a();
    public static final Parcelable.Creator<AbstractC0373b> CREATOR = new f(8);

    public AbstractC0373b() {
        this.f4957d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f4957d, i3);
    }

    public AbstractC0373b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4957d = parcelable == f4956e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0373b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4957d = readParcelable == null ? f4956e : readParcelable;
    }
}
