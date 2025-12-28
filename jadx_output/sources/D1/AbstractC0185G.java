package d1;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* renamed from: d1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0185G {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0209f b(View view, C0209f c0209f) {
        ContentInfo i3 = c0209f.f4206a.i();
        Objects.requireNonNull(i3);
        ContentInfo g3 = M1.a.g(i3);
        ContentInfo performReceiveContent = view.performReceiveContent(g3);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == g3 ? c0209f : new C0209f(new A.t(performReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0219p interfaceC0219p) {
        if (interfaceC0219p == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0186H(interfaceC0219p));
        }
    }
}
