package z2;

import A.AbstractC0000a;
import D.C0038g;
import D2.h;
import D2.o;
import android.os.Handler;
import android.os.Looper;
import g2.InterfaceC0276i;
import java.util.concurrent.CancellationException;
import p2.g;
import y2.B;
import y2.C0673f;
import y2.C0685s;
import y2.InterfaceC0691y;
import y2.S;
import y2.r;

/* loaded from: classes.dex */
public final class c extends r implements InterfaceC0691y {
    private volatile c _immediate;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f7090f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7091g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final c f7092i;

    public c(Handler handler, String str, boolean z3) {
        this.f7090f = handler;
        this.f7091g = str;
        this.h = z3;
        this._immediate = z3 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f7092i = cVar;
    }

    @Override // y2.InterfaceC0691y
    public final void c(long j3, C0673f c0673f) {
        h hVar = new h(5, c0673f, this, false);
        if (j3 > 4611686018427387903L) {
            j3 = 4611686018427387903L;
        }
        if (this.f7090f.postDelayed(hVar, j3)) {
            c0673f.x(new C0038g(this, 11, hVar));
        } else {
            j(c0673f.h, hVar);
        }
    }

    @Override // y2.r
    public final void d(InterfaceC0276i interfaceC0276i, Runnable runnable) {
        if (this.f7090f.post(runnable)) {
            return;
        }
        j(interfaceC0276i, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f7090f == this.f7090f;
    }

    @Override // y2.r
    public final boolean g() {
        return (this.h && g.a(Looper.myLooper(), this.f7090f.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f7090f);
    }

    public final void j(InterfaceC0276i interfaceC0276i, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        S s3 = (S) interfaceC0276i.n(C0685s.f6818e);
        if (s3 != null) {
            s3.a(cancellationException);
        }
        B.f6750b.d(interfaceC0276i, runnable);
    }

    @Override // y2.r
    public final String toString() {
        c cVar;
        String str;
        F2.d dVar = B.f6749a;
        c cVar2 = o.f1078a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f7092i;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f7091g;
        if (str2 == null) {
            str2 = this.f7090f.toString();
        }
        return this.h ? AbstractC0000a.e(str2, ".immediate") : str2;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
