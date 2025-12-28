package G1;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class d extends Binder implements e {
    public d() {
        attachInterface(this, "com.ai.assistance.operit.provider.IAccessibilityProvider");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // G1.e
    public String d() {
        return d();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("com.ai.assistance.operit.provider.IAccessibilityProvider");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("com.ai.assistance.operit.provider.IAccessibilityProvider");
            return true;
        }
        switch (i3) {
            case 1:
                String g3 = g();
                parcel2.writeNoException();
                parcel2.writeString(g3);
                return true;
            case 2:
                boolean c3 = c(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(c3 ? 1 : 0);
                return true;
            case 3:
                boolean a3 = a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a3 ? 1 : 0);
                return true;
            case 4:
                boolean b3 = b(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(b3 ? 1 : 0);
                return true;
            case 5:
                boolean i5 = i(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(i5 ? 1 : 0);
                return true;
            case 6:
                String j3 = j();
                parcel2.writeNoException();
                parcel2.writeString(j3);
                return true;
            case 7:
                boolean f3 = f(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(f3 ? 1 : 0);
                return true;
            case 8:
                boolean h = h(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(h ? 1 : 0);
                return true;
            case 9:
                boolean e3 = e();
                parcel2.writeNoException();
                parcel2.writeInt(e3 ? 1 : 0);
                return true;
            case 10:
                String d3 = d();
                parcel2.writeNoException();
                parcel2.writeString(d3);
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i4);
        }
    }
}
