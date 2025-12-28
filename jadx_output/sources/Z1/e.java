package Z1;

import A.AbstractC0000a;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H.e f2914a;

    public e(H.e eVar) {
        this.f2914a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        H.e eVar = this.f2914a;
        AbstractC0000a.j(message.obj);
        synchronized (eVar.f1310a) {
            throw null;
        }
    }
}
