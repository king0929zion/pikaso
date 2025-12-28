package D2;

import a.AbstractC0090a;
import c2.AbstractC0171j;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1086a = 0;

    static {
        Object q3;
        Object q4;
        Exception exc = new Exception();
        String simpleName = AbstractC0090a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            q3 = i2.a.class.getCanonicalName();
        } catch (Throwable th) {
            q3 = Z0.d.q(th);
        }
        if (AbstractC0171j.a(q3) != null) {
            q3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            q4 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            q4 = Z0.d.q(th2);
        }
        if (AbstractC0171j.a(q4) != null) {
            q4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
