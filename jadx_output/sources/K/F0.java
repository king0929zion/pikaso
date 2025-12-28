package k;

import android.os.Parcel;
import android.os.Parcelable;
import m1.AbstractC0373b;

/* loaded from: classes.dex */
public final class F0 extends AbstractC0373b {
    public static final Parcelable.Creator<F0> CREATOR = new M1.f(6);

    /* renamed from: f, reason: collision with root package name */
    public boolean f4648f;

    public F0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4648f = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4648f + "}";
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Boolean.valueOf(this.f4648f));
    }
}
