package o0;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class V implements Choreographer.FrameCallback, Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f5509d;

    public V(W w3) {
        this.f5509d = w3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f5509d.f5517g.removeCallbacks(this);
        W.j(this.f5509d);
        W w3 = this.f5509d;
        synchronized (w3.h) {
            if (w3.f5522m) {
                w3.f5522m = false;
                ArrayList arrayList = w3.f5519j;
                w3.f5519j = w3.f5520k;
                w3.f5520k = arrayList;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Choreographer.FrameCallback) arrayList.get(i3)).doFrame(j3);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        W.j(this.f5509d);
        W w3 = this.f5509d;
        synchronized (w3.h) {
            if (w3.f5519j.isEmpty()) {
                w3.f5516f.removeFrameCallback(this);
                w3.f5522m = false;
            }
        }
    }
}
