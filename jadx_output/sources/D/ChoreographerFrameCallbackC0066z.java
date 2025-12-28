package D;

import android.view.Choreographer;
import y2.C0673f;

/* renamed from: D.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0066z implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f933d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0673f f934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o2.c f935f;

    public ChoreographerFrameCallbackC0066z(o2.c cVar, C0673f c0673f) {
        this.f934e = c0673f;
        this.f935f = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        Object q3;
        Object q4;
        C0673f c0673f = this.f934e;
        o2.c cVar = this.f935f;
        switch (this.f933d) {
            case 0:
                A a3 = A.f627d;
                try {
                    q4 = cVar.i(Long.valueOf(j3));
                } catch (Throwable th) {
                    q4 = Z0.d.q(th);
                }
                c0673f.t(q4);
                break;
            default:
                try {
                    q3 = cVar.i(Long.valueOf(j3));
                } catch (Throwable th2) {
                    q3 = Z0.d.q(th2);
                }
                c0673f.t(q3);
                break;
        }
    }

    public ChoreographerFrameCallbackC0066z(C0673f c0673f, C0041h0 c0041h0, o2.c cVar) {
        this.f934e = c0673f;
        this.f935f = cVar;
    }
}
