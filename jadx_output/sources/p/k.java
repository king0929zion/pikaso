package P;

import C2.o;
import n0.AbstractC0409C;
import n0.InterfaceC0427h;
import n0.Y;
import n0.b0;
import o0.C0507u;
import q.q;
import y2.AbstractC0688v;
import y2.C0685s;
import y2.InterfaceC0687u;
import y2.S;
import y2.V;

/* loaded from: classes.dex */
public abstract class k implements InterfaceC0427h {

    /* renamed from: e, reason: collision with root package name */
    public D2.d f2089e;

    /* renamed from: f, reason: collision with root package name */
    public int f2090f;
    public k h;

    /* renamed from: i, reason: collision with root package name */
    public k f2092i;

    /* renamed from: j, reason: collision with root package name */
    public b0 f2093j;

    /* renamed from: k, reason: collision with root package name */
    public Y f2094k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2095l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2096m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2097n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2098o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2099p;

    /* renamed from: d, reason: collision with root package name */
    public k f2088d = this;

    /* renamed from: g, reason: collision with root package name */
    public int f2091g = -1;

    public final InterfaceC0687u U() {
        D2.d dVar = this.f2089e;
        if (dVar != null) {
            return dVar;
        }
        D2.d a3 = AbstractC0688v.a(((C0507u) AbstractC0409C.r(this)).getCoroutineContext().i(new V((S) ((C0507u) AbstractC0409C.r(this)).getCoroutineContext().n(C0685s.f6818e))));
        this.f2089e = a3;
        return a3;
    }

    public boolean V() {
        return !(this instanceof q);
    }

    public void W() {
        if (this.f2099p) {
            Z0.d.S("node attached multiple times");
            throw null;
        }
        if (this.f2094k == null) {
            Z0.d.S("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f2099p = true;
        this.f2097n = true;
    }

    public void X() {
        if (!this.f2099p) {
            Z0.d.S("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.f2097n) {
            Z0.d.S("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.f2098o) {
            Z0.d.S("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f2099p = false;
        D2.d dVar = this.f2089e;
        if (dVar != null) {
            o oVar = new o("The Modifier.Node was detached", 2);
            S s3 = (S) dVar.f1051d.n(C0685s.f6818e);
            if (s3 != null) {
                s3.a(oVar);
                this.f2089e = null;
            } else {
                throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + dVar).toString());
            }
        }
    }

    public void Y() {
    }

    public void Z() {
    }

    public void a0() {
        if (this.f2099p) {
            return;
        }
        Z0.d.S("reset() called on an unattached node");
        throw null;
    }

    public void b0() {
        if (!this.f2099p) {
            Z0.d.S("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f2097n) {
            Z0.d.S("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f2097n = false;
        Y();
        this.f2098o = true;
    }

    public void c0() {
        if (!this.f2099p) {
            Z0.d.S("node detached multiple times");
            throw null;
        }
        if (this.f2094k == null) {
            Z0.d.S("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f2098o) {
            Z0.d.S("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f2098o = false;
        Z();
    }

    public void d0(k kVar) {
        this.f2088d = kVar;
    }

    public void e0(Y y3) {
        this.f2094k = y3;
    }
}
