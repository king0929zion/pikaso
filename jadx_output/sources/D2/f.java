package D2;

import g2.InterfaceC0276i;

/* loaded from: classes.dex */
public final class f extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final transient InterfaceC0276i f1053d;

    public f(InterfaceC0276i interfaceC0276i) {
        this.f1053d = interfaceC0276i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1053d.toString();
    }
}
