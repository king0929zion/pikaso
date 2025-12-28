package d1;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* renamed from: d1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC0186H implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0219p f4145a;

    public OnReceiveContentListenerC0186H(InterfaceC0219p interfaceC0219p) {
        this.f4145a = interfaceC0219p;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0209f c0209f = new C0209f(new A.t(contentInfo));
        C0209f a3 = ((j1.p) this.f4145a).a(view, c0209f);
        if (a3 == null) {
            return null;
        }
        if (a3 == c0209f) {
            return contentInfo;
        }
        ContentInfo i3 = a3.f4206a.i();
        Objects.requireNonNull(i3);
        return M1.a.g(i3);
    }
}
