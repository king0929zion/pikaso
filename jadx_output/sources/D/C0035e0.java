package D;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: D.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035e0 implements Parcelable.ClassLoaderCreator {
    public static C0037f0 a(Parcel parcel, ClassLoader classLoader) {
        U u3;
        if (classLoader == null) {
            classLoader = C0035e0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            u3 = U.f729f;
        } else if (readInt == 1) {
            u3 = U.f731i;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            u3 = U.f730g;
        }
        return new C0037f0(readValue, u3);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        return new C0037f0[i3];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
