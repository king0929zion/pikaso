package J0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1411b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1412c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f1413a;

    static {
        if (g.f1423d) {
            f1412c = null;
            f1411b = null;
        } else {
            f1412c = new a(false, null);
            f1411b = new a(true, null);
        }
    }

    public a(boolean z3, CancellationException cancellationException) {
        this.f1413a = cancellationException;
    }
}
