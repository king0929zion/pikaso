package o0;

import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* loaded from: classes.dex */
public final class U extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5502a;

    public /* synthetic */ U(int i3) {
        this.f5502a = i3;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f5502a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                W w3 = new W(choreographer, Z0.d.p(myLooper));
                return Z0.d.K(w3, w3.f5524o);
            default:
                return new Random();
        }
    }
}
