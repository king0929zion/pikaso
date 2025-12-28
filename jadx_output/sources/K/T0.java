package k;

import android.os.Parcel;
import android.os.Parcelable;
import m1.AbstractC0373b;

/* loaded from: classes.dex */
public final class T0 extends AbstractC0373b {
    public static final Parcelable.Creator<T0> CREATOR = new M1.f(7);

    /* renamed from: f, reason: collision with root package name */
    public int f4716f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4717g;

    public T0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4716f = parcel.readInt();
        this.f4717g = parcel.readInt() != 0;
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f4716f);
        parcel.writeInt(this.f4717g ? 1 : 0);
    }
}
