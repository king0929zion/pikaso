package o1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521c extends X1.e {
    @Override // X1.e
    public final Signature[] g(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
