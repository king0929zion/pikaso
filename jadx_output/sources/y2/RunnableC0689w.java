package y2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: y2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0689w extends I implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m, reason: collision with root package name */
    public static final RunnableC0689w f6828m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f6829n;

    static {
        Long l3;
        RunnableC0689w runnableC0689w = new RunnableC0689w();
        f6828m = runnableC0689w;
        runnableC0689w.p(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f6829n = timeUnit.toNanos(l3.longValue());
    }

    @Override // y2.I
    public final void A(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.A(runnable);
    }

    public final synchronized void E() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            I.f6759j.set(this, null);
            I.f6760k.set(this, null);
            notifyAll();
        }
    }

    @Override // y2.J
    public final Thread o() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean C3;
        k0.f6798a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (C3) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long w3 = w();
                    if (w3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f6829n + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            E();
                            if (C()) {
                                return;
                            }
                            o();
                            return;
                        }
                        if (w3 > j4) {
                            w3 = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (w3 > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            E();
                            if (C()) {
                                return;
                            }
                            o();
                            return;
                        }
                        LockSupport.parkNanos(this, w3);
                    }
                }
            }
        } finally {
            _thread = null;
            E();
            if (!C()) {
                o();
            }
        }
    }

    @Override // y2.J
    public final void y(long j3, G g3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // y2.I, y2.J
    public final void z() {
        debugStatus = 4;
        super.z();
    }
}
