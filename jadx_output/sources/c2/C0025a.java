package C2;

import java.util.concurrent.CancellationException;

/* renamed from: C2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025a extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient B2.n f580d;

    public C0025a(B2.n nVar) {
        super("Flow was aborted, no more elements needed");
        this.f580d = nVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
