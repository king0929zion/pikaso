package m;

import java.util.Iterator;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366d extends AbstractC0367e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0365c f4948d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4949e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0368f f4950f;

    public C0366d(C0368f c0368f) {
        this.f4950f = c0368f;
    }

    @Override // m.AbstractC0367e
    public final void a(C0365c c0365c) {
        C0365c c0365c2 = this.f4948d;
        if (c0365c == c0365c2) {
            C0365c c0365c3 = c0365c2.f4947g;
            this.f4948d = c0365c3;
            this.f4949e = c0365c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4949e) {
            return this.f4950f.f4951d != null;
        }
        C0365c c0365c = this.f4948d;
        return (c0365c == null || c0365c.f4946f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4949e) {
            this.f4949e = false;
            this.f4948d = this.f4950f.f4951d;
        } else {
            C0365c c0365c = this.f4948d;
            this.f4948d = c0365c != null ? c0365c.f4946f : null;
        }
        return this.f4948d;
    }
}
