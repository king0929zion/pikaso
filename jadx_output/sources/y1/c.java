package Y1;

import M1.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import m1.AbstractC0373b;

/* loaded from: classes.dex */
public final class c extends AbstractC0373b {
    public static final Parcelable.Creator<c> CREATOR = new f(4);

    /* renamed from: f, reason: collision with root package name */
    public final int f2783f;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2783f = parcel.readInt();
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f2783f);
    }

    public c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f2783f = sideSheetBehavior.h;
    }
}
