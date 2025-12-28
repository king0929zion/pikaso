package y2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: y2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0680m {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6804b = AtomicIntegerFieldUpdater.newUpdater(C0680m.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f6805a;

    public C0680m(Throwable th, boolean z3) {
        this.f6805a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f6805a + ']';
    }
}
