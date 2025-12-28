package o0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: o0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0467Q implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0.d f5489d;

    public ComponentCallbacks2C0467Q(r0.d dVar) {
        this.f5489d = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        r0.d dVar = this.f5489d;
        synchronized (dVar) {
            dVar.f6111a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        r0.d dVar = this.f5489d;
        synchronized (dVar) {
            dVar.f6111a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        r0.d dVar = this.f5489d;
        synchronized (dVar) {
            dVar.f6111a.a();
        }
    }
}
