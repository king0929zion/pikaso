package a1;

import android.os.Process;

/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final int f2949d;

    public i(Runnable runnable, String str, int i3) {
        super(runnable, str);
        this.f2949d = i3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2949d);
        super.run();
    }
}
