package F1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import e.C0252a;
import j1.j;
import z1.C0740n;
import z1.M;
import z1.N;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1197a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1197a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                return new C0252a(parcel);
            case 2:
                j jVar = new j(parcel);
                jVar.f4623d = parcel.readInt();
                return jVar;
            case 3:
                C0740n c0740n = new C0740n();
                c0740n.f7068d = parcel.readInt();
                c0740n.f7069e = parcel.readInt();
                c0740n.f7070f = parcel.readInt() == 1;
                return c0740n;
            case 4:
                M m2 = new M();
                m2.f6982d = parcel.readInt();
                m2.f6983e = parcel.readInt();
                m2.f6985g = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    m2.f6984f = iArr;
                    parcel.readIntArray(iArr);
                }
                return m2;
            default:
                N n2 = new N();
                n2.f6986d = parcel.readInt();
                n2.f6987e = parcel.readInt();
                int readInt2 = parcel.readInt();
                n2.f6988f = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    n2.f6989g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                n2.h = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    n2.f6990i = iArr3;
                    parcel.readIntArray(iArr3);
                }
                n2.f6992k = parcel.readInt() == 1;
                n2.f6993l = parcel.readInt() == 1;
                n2.f6994m = parcel.readInt() == 1;
                n2.f6991j = parcel.readArrayList(M.class.getClassLoader());
                return n2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f1197a) {
            case 0:
                return new ParcelImpl[i3];
            case 1:
                return new C0252a[i3];
            case 2:
                return new j[i3];
            case 3:
                return new C0740n[i3];
            case 4:
                return new M[i3];
            default:
                return new N[i3];
        }
    }
}
