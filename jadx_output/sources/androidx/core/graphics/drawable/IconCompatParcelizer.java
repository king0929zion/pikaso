package androidx.core.graphics.drawable;

import F1.b;
import F1.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        int i3 = iconCompat.f3395a;
        if (bVar.e(1)) {
            i3 = ((c) bVar).f1202e.readInt();
        }
        iconCompat.f3395a = i3;
        byte[] bArr = iconCompat.f3397c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f1202e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f3397c = bArr;
        iconCompat.f3398d = bVar.f(iconCompat.f3398d, 3);
        int i4 = iconCompat.f3399e;
        if (bVar.e(4)) {
            i4 = ((c) bVar).f1202e.readInt();
        }
        iconCompat.f3399e = i4;
        int i5 = iconCompat.f3400f;
        if (bVar.e(5)) {
            i5 = ((c) bVar).f1202e.readInt();
        }
        iconCompat.f3400f = i5;
        iconCompat.f3401g = (ColorStateList) bVar.f(iconCompat.f3401g, 6);
        String str = iconCompat.f3402i;
        if (bVar.e(7)) {
            str = ((c) bVar).f1202e.readString();
        }
        iconCompat.f3402i = str;
        String str2 = iconCompat.f3403j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f1202e.readString();
        }
        iconCompat.f3403j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.f3402i);
        switch (iconCompat.f3395a) {
            case -1:
                Parcelable parcelable = iconCompat.f3398d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3396b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f3398d;
                if (parcelable2 != null) {
                    iconCompat.f3396b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f3397c;
                    iconCompat.f3396b = bArr3;
                    iconCompat.f3395a = 3;
                    iconCompat.f3399e = 0;
                    iconCompat.f3400f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f3397c, Charset.forName("UTF-16"));
                iconCompat.f3396b = str3;
                if (iconCompat.f3395a == 2 && iconCompat.f3403j == null) {
                    iconCompat.f3403j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f3396b = iconCompat.f3397c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f3402i = iconCompat.h.name();
        switch (iconCompat.f3395a) {
            case -1:
                iconCompat.f3398d = (Parcelable) iconCompat.f3396b;
                break;
            case 1:
            case 5:
                iconCompat.f3398d = (Parcelable) iconCompat.f3396b;
                break;
            case 2:
                iconCompat.f3397c = ((String) iconCompat.f3396b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f3397c = (byte[]) iconCompat.f3396b;
                break;
            case 4:
            case 6:
                iconCompat.f3397c = iconCompat.f3396b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f3395a;
        if (-1 != i3) {
            bVar.h(1);
            ((c) bVar).f1202e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f3397c;
        if (bArr != null) {
            bVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f1202e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f3398d;
        if (parcelable != null) {
            bVar.h(3);
            ((c) bVar).f1202e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f3399e;
        if (i4 != 0) {
            bVar.h(4);
            ((c) bVar).f1202e.writeInt(i4);
        }
        int i5 = iconCompat.f3400f;
        if (i5 != 0) {
            bVar.h(5);
            ((c) bVar).f1202e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f3401g;
        if (colorStateList != null) {
            bVar.h(6);
            ((c) bVar).f1202e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f3402i;
        if (str != null) {
            bVar.h(7);
            ((c) bVar).f1202e.writeString(str);
        }
        String str2 = iconCompat.f3403j;
        if (str2 != null) {
            bVar.h(8);
            ((c) bVar).f1202e.writeString(str2);
        }
    }
}
