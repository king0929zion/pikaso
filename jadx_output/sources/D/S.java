package D;

import g2.InterfaceC0276i;
import java.util.concurrent.CancellationException;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class S implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public final o2.e f724d;

    /* renamed from: e, reason: collision with root package name */
    public final D2.d f725e;

    /* renamed from: f, reason: collision with root package name */
    public y2.h0 f726f;

    public S(InterfaceC0276i interfaceC0276i, o2.e eVar) {
        this.f724d = eVar;
        this.f725e = AbstractC0688v.a(interfaceC0276i);
    }

    @Override // D.w0
    public final void a() {
        y2.h0 h0Var = this.f726f;
        if (h0Var != null) {
            h0Var.B(new C2.o());
        }
        this.f726f = null;
    }

    @Override // D.w0
    public final void b() {
        y2.h0 h0Var = this.f726f;
        if (h0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            h0Var.B(cancellationException);
        }
        this.f726f = AbstractC0688v.l(this.f725e, null, 0, this.f724d, 3);
    }

    @Override // D.w0
    public final void c() {
        y2.h0 h0Var = this.f726f;
        if (h0Var != null) {
            h0Var.B(new C2.o());
        }
        this.f726f = null;
    }
}
