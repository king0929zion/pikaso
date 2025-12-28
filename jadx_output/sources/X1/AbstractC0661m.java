package x1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import s1.C0589c;

/* renamed from: x1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0661m {

    /* renamed from: a, reason: collision with root package name */
    public static final J0.h f6717a = new J0.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f6718b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0589c f6719c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0659k.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0589c b() {
        C0589c c0589c = new C0589c(10, false);
        f6719c = c0589c;
        J0.h hVar = f6717a;
        hVar.getClass();
        if (J0.g.f1425f.k(hVar, null, c0589c)) {
            J0.g.b(hVar);
        }
        return f6719c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.AbstractC0661m.c(android.content.Context, boolean):void");
    }
}
