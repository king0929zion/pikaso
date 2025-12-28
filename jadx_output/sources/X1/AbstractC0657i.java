package x1;

import android.view.Choreographer;

/* renamed from: x1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0657i {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: x1.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                runnable.run();
            }
        });
    }
}
