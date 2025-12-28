package m;

import java.util.Iterator;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364b extends AbstractC0367e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C0365c f4941d;

    /* renamed from: e, reason: collision with root package name */
    public C0365c f4942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4943f;

    public C0364b(C0365c c0365c, C0365c c0365c2, int i3) {
        this.f4943f = i3;
        this.f4941d = c0365c2;
        this.f4942e = c0365c;
    }

    @Override // m.AbstractC0367e
    public final void a(C0365c c0365c) {
        C0365c c0365c2;
        C0365c c0365c3 = null;
        if (this.f4941d == c0365c && c0365c == this.f4942e) {
            this.f4942e = null;
            this.f4941d = null;
        }
        C0365c c0365c4 = this.f4941d;
        if (c0365c4 == c0365c) {
            switch (this.f4943f) {
                case 0:
                    c0365c2 = c0365c4.f4947g;
                    break;
                default:
                    c0365c2 = c0365c4.f4946f;
                    break;
            }
            this.f4941d = c0365c2;
        }
        C0365c c0365c5 = this.f4942e;
        if (c0365c5 == c0365c) {
            C0365c c0365c6 = this.f4941d;
            if (c0365c5 != c0365c6 && c0365c6 != null) {
                c0365c3 = b(c0365c5);
            }
            this.f4942e = c0365c3;
        }
    }

    public final C0365c b(C0365c c0365c) {
        switch (this.f4943f) {
            case 0:
                return c0365c.f4946f;
            default:
                return c0365c.f4947g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4942e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0365c c0365c = this.f4942e;
        C0365c c0365c2 = this.f4941d;
        this.f4942e = (c0365c == c0365c2 || c0365c2 == null) ? null : b(c0365c);
        return c0365c;
    }
}
