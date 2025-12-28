package o0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import r0.C0581a;

/* renamed from: o0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0466P implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Configuration f5485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.c f5486e;

    public ComponentCallbacks2C0466P(Configuration configuration, r0.c cVar) {
        this.f5485d = configuration;
        this.f5486e = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f5485d;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f5486e.f6110a.entrySet().iterator();
        while (it.hasNext()) {
            C0581a c0581a = (C0581a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c0581a == null || Configuration.needNewResources(updateFrom, c0581a.f6108b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5486e.f6110a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        this.f5486e.f6110a.clear();
    }
}
