package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import d2.C0248s;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements B1.b {
    @Override // B1.b
    public final List a() {
        return C0248s.f4255d;
    }

    @Override // B1.b
    public final Object b(Context context) {
        p2.g.e(context, "context");
        B1.a c3 = B1.a.c(context);
        p2.g.d(c3, "getInstance(context)");
        if (!c3.f282b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!o.f3479a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            p2.g.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
        }
        A a3 = A.f3437l;
        a3.getClass();
        a3.h = new Handler();
        a3.f3442i.d(l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        p2.g.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new z(a3));
        return a3;
    }
}
