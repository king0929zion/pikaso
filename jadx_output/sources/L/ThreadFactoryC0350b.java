package l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0350b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f4914a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f4914a.getAndIncrement());
        return thread;
    }
}
