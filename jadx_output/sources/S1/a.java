package S1;

import android.os.Parcel;
import android.os.Parcelable;
import m1.AbstractC0373b;

/* loaded from: classes.dex */
public final class a extends AbstractC0373b {
    public static final Parcelable.Creator<a> CREATOR = new M1.f(3);

    /* renamed from: f, reason: collision with root package name */
    public boolean f2235f;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2235f = parcel.readInt() == 1;
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f2235f ? 1 : 0);
    }
}
