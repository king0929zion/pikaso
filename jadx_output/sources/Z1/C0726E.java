package z1;

import android.os.Parcel;
import android.os.Parcelable;
import m1.AbstractC0373b;

/* renamed from: z1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726E extends AbstractC0373b {
    public static final Parcelable.Creator<C0726E> CREATOR = new M1.f(9);

    /* renamed from: f, reason: collision with root package name */
    public Parcelable f6955f;

    public C0726E(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6955f = parcel.readParcelable(classLoader == null ? w.class.getClassLoader() : classLoader);
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f6955f, 0);
    }
}
