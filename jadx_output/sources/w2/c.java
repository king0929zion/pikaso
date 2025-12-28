package w2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f6562d;

    /* renamed from: e, reason: collision with root package name */
    public int f6563e = -1;

    /* renamed from: f, reason: collision with root package name */
    public Object f6564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f6565g;

    public c(d dVar) {
        this.f6565g = dVar;
        this.f6562d = new k((e) dVar.f6567b);
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.f6562d;
            if (!it.hasNext()) {
                this.f6563e = 0;
                return;
            } else {
                next = it.next();
                this.f6565g.getClass();
            }
        } while (((Boolean) j.f6574e.i(next)).booleanValue());
        this.f6564f = next;
        this.f6563e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6563e == -1) {
            a();
        }
        return this.f6563e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6563e == -1) {
            a();
        }
        if (this.f6563e == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f6564f;
        this.f6564f = null;
        this.f6563e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
