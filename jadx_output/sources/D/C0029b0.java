package D;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: D.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029b0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f738a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f738a) {
            case 0:
                return new C0031c0(parcel.readFloat());
            default:
                return new C0033d0(parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f738a) {
            case 0:
                return new C0031c0[i3];
            default:
                return new C0033d0[i3];
        }
    }
}
