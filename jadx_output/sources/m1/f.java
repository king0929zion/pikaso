package M1;

import a2.C0101A;
import android.os.Parcel;
import android.os.Parcelable;
import k.F0;
import k.T0;
import m1.AbstractC0373b;
import z1.C0726E;

/* loaded from: classes.dex */
public final class f implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1683a;

    public /* synthetic */ f(int i3) {
        this.f1683a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f1683a) {
            case 0:
                return new g(parcel, classLoader);
            case 1:
                return new N1.b(parcel, classLoader);
            case 2:
                return new Q0.f(parcel, classLoader);
            case 3:
                return new S1.a(parcel, classLoader);
            case 4:
                return new Y1.c(parcel, classLoader);
            case 5:
                return new C0101A(parcel, classLoader);
            case 6:
                return new F0(parcel, classLoader);
            case 7:
                return new T0(parcel, classLoader);
            case 8:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0373b.f4956e;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new C0726E(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1683a) {
            case 0:
                return new g[i3];
            case 1:
                return new N1.b[i3];
            case 2:
                return new Q0.f[i3];
            case 3:
                return new S1.a[i3];
            case 4:
                return new Y1.c[i3];
            case 5:
                return new C0101A[i3];
            case 6:
                return new F0[i3];
            case 7:
                return new T0[i3];
            case 8:
                return new AbstractC0373b[i3];
            default:
                return new C0726E[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1683a) {
            case 0:
                return new g(parcel, (ClassLoader) null);
            case 1:
                return new N1.b(parcel, null);
            case 2:
                return new Q0.f(parcel, null);
            case 3:
                return new S1.a(parcel, null);
            case 4:
                return new Y1.c(parcel, (ClassLoader) null);
            case 5:
                return new C0101A(parcel, null);
            case 6:
                return new F0(parcel, null);
            case 7:
                return new T0(parcel, null);
            case 8:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0373b.f4956e;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new C0726E(parcel, null);
        }
    }
}
