package N1;

import android.os.Parcel;
import android.os.Parcelable;
import m1.AbstractC0373b;

/* loaded from: classes.dex */
public final class b extends AbstractC0373b {
    public static final Parcelable.Creator<b> CREATOR = new M1.f(1);

    /* renamed from: f, reason: collision with root package name */
    public boolean f1843f;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f1843f = parcel.readInt() == 1;
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f1843f ? 1 : 0);
    }
}
