package D;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n.C0398r;

/* loaded from: classes.dex */
public final class B0 implements Iterable, q2.a {

    /* renamed from: e, reason: collision with root package name */
    public int f648e;

    /* renamed from: g, reason: collision with root package name */
    public int f650g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f651i;

    /* renamed from: j, reason: collision with root package name */
    public int f652j;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f654l;

    /* renamed from: m, reason: collision with root package name */
    public C0398r f655m;

    /* renamed from: d, reason: collision with root package name */
    public int[] f647d = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public Object[] f649f = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f653k = new ArrayList();

    public final int a(C0030c c0030c) {
        if (this.f651i) {
            C0032d.r("Use active SlotWriter to determine anchor location instead");
            throw null;
        }
        if (c0030c.a()) {
            return c0030c.f739a;
        }
        C0032d.H("Anchor refers to a group that was removed");
        throw null;
    }

    public final A0 b() {
        if (this.f651i) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.h++;
        return new A0(this);
    }

    public final D0 c() {
        if (this.f651i) {
            C0032d.r("Cannot start a writer when another writer is pending");
            throw null;
        }
        if (this.h > 0) {
            C0032d.r("Cannot start a writer when a reader is pending");
            throw null;
        }
        this.f651i = true;
        this.f652j++;
        return new D0(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new K(this, 0, this.f648e);
    }
}
