package Z1;

import A.AbstractC0000a;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            AbstractC0000a.j(message.obj);
            throw null;
        }
        if (i3 != 1) {
            return false;
        }
        AbstractC0000a.j(message.obj);
        throw null;
    }
}
