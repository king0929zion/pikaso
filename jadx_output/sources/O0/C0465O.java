package o0;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* renamed from: o0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465O implements D.F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks2 f5483c;

    public /* synthetic */ C0465O(Context context, ComponentCallbacks2 componentCallbacks2, int i3) {
        this.f5481a = i3;
        this.f5482b = context;
        this.f5483c = componentCallbacks2;
    }

    @Override // D.F
    public final void a() {
        switch (this.f5481a) {
            case 0:
                this.f5482b.getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0466P) this.f5483c);
                break;
            default:
                this.f5482b.getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0467Q) this.f5483c);
                break;
        }
    }
}
