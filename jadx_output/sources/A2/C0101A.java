package a2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import m1.AbstractC0373b;

/* renamed from: a2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101A extends AbstractC0373b {
    public static final Parcelable.Creator<C0101A> CREATOR = new M1.f(5);

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2956f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2957g;

    public C0101A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2956f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2957g = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2956f) + "}";
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        TextUtils.writeToParcel(this.f2956f, parcel, i3);
        parcel.writeInt(this.f2957g ? 1 : 0);
    }
}
