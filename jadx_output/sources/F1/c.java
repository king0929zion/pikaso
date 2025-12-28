package F1;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.C0386f;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1201d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1202e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1203f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1204g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f1205i;

    /* renamed from: j, reason: collision with root package name */
    public int f1206j;

    /* renamed from: k, reason: collision with root package name */
    public int f1207k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0386f(0), new C0386f(0), new C0386f(0));
    }

    @Override // F1.b
    public final c a() {
        Parcel parcel = this.f1202e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f1206j;
        if (i3 == this.f1203f) {
            i3 = this.f1204g;
        }
        return new c(parcel, dataPosition, i3, this.h + "  ", this.f1198a, this.f1199b, this.f1200c);
    }

    @Override // F1.b
    public final boolean e(int i3) {
        while (this.f1206j < this.f1204g) {
            int i4 = this.f1207k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f1206j;
            Parcel parcel = this.f1202e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f1207k = parcel.readInt();
            this.f1206j += readInt;
        }
        return this.f1207k == i3;
    }

    @Override // F1.b
    public final void h(int i3) {
        int i4 = this.f1205i;
        SparseIntArray sparseIntArray = this.f1201d;
        Parcel parcel = this.f1202e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f1205i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public c(Parcel parcel, int i3, int i4, String str, C0386f c0386f, C0386f c0386f2, C0386f c0386f3) {
        super(c0386f, c0386f2, c0386f3);
        this.f1201d = new SparseIntArray();
        this.f1205i = -1;
        this.f1207k = -1;
        this.f1202e = parcel;
        this.f1203f = i3;
        this.f1204g = i4;
        this.f1206j = i3;
        this.h = str;
    }
}
