package Q0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import m1.AbstractC0373b;

/* loaded from: classes.dex */
public final class f extends AbstractC0373b {
    public static final Parcelable.Creator<f> CREATOR = new M1.f(2);

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f2189f;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f2189f = new SparseArray(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            this.f2189f.append(iArr[i3], readParcelableArray[i3]);
        }
    }

    @Override // m1.AbstractC0373b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        SparseArray sparseArray = this.f2189f;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = this.f2189f.keyAt(i4);
            parcelableArr[i4] = (Parcelable) this.f2189f.valueAt(i4);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i3);
    }
}
