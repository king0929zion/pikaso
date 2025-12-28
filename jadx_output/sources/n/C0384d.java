package n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384d implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f4980d;

    /* renamed from: e, reason: collision with root package name */
    public int f4981e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0386f f4983g;

    public C0384d(C0386f c0386f) {
        this.f4983g = c0386f;
        this.f4980d = c0386f.f4970f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f4982f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f4981e;
        C0386f c0386f = this.f4983g;
        return p2.g.a(key, c0386f.f(i3)) && p2.g.a(entry.getValue(), c0386f.i(this.f4981e));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f4982f) {
            return this.f4983g.f(this.f4981e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f4982f) {
            return this.f4983g.i(this.f4981e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4981e < this.f4980d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f4982f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f4981e;
        C0386f c0386f = this.f4983g;
        Object f3 = c0386f.f(i3);
        Object i4 = c0386f.i(this.f4981e);
        return (f3 == null ? 0 : f3.hashCode()) ^ (i4 != null ? i4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4981e++;
        this.f4982f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4982f) {
            throw new IllegalStateException();
        }
        this.f4983g.g(this.f4981e);
        this.f4981e--;
        this.f4980d--;
        this.f4982f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f4982f) {
            return this.f4983g.h(this.f4981e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
