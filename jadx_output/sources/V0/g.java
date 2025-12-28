package V0;

import a.AbstractC0090a;
import android.content.res.Resources;
import android.os.Build;
import n.C0395o;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0090a f2467a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0395o f2468b;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f2467a = new j();
        } else if (i3 >= 28) {
            f2467a = new i();
        } else {
            f2467a = new h();
        }
        f2468b = new C0395o(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r5.equals(r6) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, U0.e r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, U0.b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.g.a(android.content.Context, U0.e, android.content.res.Resources, int, java.lang.String, int, int, U0.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }
}
