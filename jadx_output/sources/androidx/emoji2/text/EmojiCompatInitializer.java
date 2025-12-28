package androidx.emoji2.text;

import B1.a;
import B1.b;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k.H;
import o1.i;
import o1.j;
import o1.r;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // B1.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // B1.b
    public final Object b(Context context) {
        Object obj;
        r rVar = new r(new H(context));
        rVar.f5800b = 1;
        if (i.f5768k == null) {
            synchronized (i.f5767j) {
                try {
                    if (i.f5768k == null) {
                        i.f5768k = new i(rVar);
                    }
                } finally {
                }
            }
        }
        a c3 = a.c(context);
        c3.getClass();
        synchronized (a.f280e) {
            try {
                obj = c3.f281a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c3.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        t c4 = ((androidx.lifecycle.r) obj).c();
        c4.a(new j(this, c4));
        return Boolean.TRUE;
    }
}
