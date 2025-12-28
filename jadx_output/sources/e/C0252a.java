package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252a implements Parcelable {
    public static final Parcelable.Creator<C0252a> CREATOR = new F1.a(1);

    /* renamed from: d, reason: collision with root package name */
    public final int f4258d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f4259e;

    public C0252a(int i3, Intent intent) {
        this.f4258d = i3;
        this.f4259e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f4258d;
        sb.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f4259e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f4258d);
        Intent intent = this.f4259e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i3);
        }
    }

    public C0252a(Parcel parcel) {
        this.f4258d = parcel.readInt();
        this.f4259e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
