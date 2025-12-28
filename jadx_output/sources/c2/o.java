package C2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class o extends CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i3) {
        super(str);
        this.f612d = i3;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f612d) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 2:
                setStackTrace(P.m.f2100a);
                break;
            case 3:
                setStackTrace(h0.o.f4391b);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o() {
        super("The coroutine scope left the composition");
        this.f612d = 1;
    }
}
