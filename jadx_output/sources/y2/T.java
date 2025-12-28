package y2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class T extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient b0 f6770d;

    public T(String str, Throwable th, b0 b0Var) {
        super(str);
        this.f6770d = b0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof T) {
                T t3 = (T) obj;
                if (!p2.g.a(t3.getMessage(), getMessage()) || !p2.g.a(t3.f6770d, this.f6770d) || !p2.g.a(t3.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        p2.g.b(message);
        int hashCode = (this.f6770d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f6770d;
    }
}
