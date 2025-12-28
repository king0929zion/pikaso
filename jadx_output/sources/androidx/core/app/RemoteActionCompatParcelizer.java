package androidx.core.app;

import F1.b;
import F1.c;
import F1.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f3388a;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f3388a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f3389b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1202e);
        }
        remoteActionCompat.f3389b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3390c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f1202e);
        }
        remoteActionCompat.f3390c = charSequence2;
        remoteActionCompat.f3391d = (PendingIntent) bVar.f(remoteActionCompat.f3391d, 4);
        boolean z3 = remoteActionCompat.f3392e;
        if (bVar.e(5)) {
            z3 = ((c) bVar).f1202e.readInt() != 0;
        }
        remoteActionCompat.f3392e = z3;
        boolean z4 = remoteActionCompat.f3393f;
        if (bVar.e(6)) {
            z4 = ((c) bVar).f1202e.readInt() != 0;
        }
        remoteActionCompat.f3393f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f3388a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3389b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f1202e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f3390c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f3391d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f3392e;
        bVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f3393f;
        bVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
