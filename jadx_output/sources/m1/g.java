package M1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import m1.AbstractC0373b;

/* loaded from: classes.dex */
public final class g extends AbstractC0373b {
    public static final Parcelable.Creator<g> CREATOR = new f(0);

    /* renamed from: f, reason: collision with root package name */
    public final int f1684f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1685g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1686i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1687j;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1684f = parcel.readInt();
        this.f1685g = parcel.readInt();
        this.h = parcel.readInt() == 1;
        this.f1686i = parcel.readInt() == 1;
        this.f1687j = parcel.readInt() == 1;
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f1684f);
        parcel.writeInt(this.f1685g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.f1686i ? 1 : 0);
        parcel.writeInt(this.f1687j ? 1 : 0);
    }

    public g(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f1684f = bottomSheetBehavior.f3887L;
        this.f1685g = bottomSheetBehavior.f3910e;
        this.h = bottomSheetBehavior.f3904b;
        this.f1686i = bottomSheetBehavior.f3884I;
        this.f1687j = bottomSheetBehavior.f3885J;
    }
}
