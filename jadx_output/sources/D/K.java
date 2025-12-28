package D;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class K implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f702d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final B0 f703e;

    /* renamed from: f, reason: collision with root package name */
    public final int f704f;

    /* renamed from: g, reason: collision with root package name */
    public int f705g;
    public int h;

    public K(B0 b02, int i3, int i4) {
        this.f703e = b02;
        this.f704f = i4;
        this.f705g = i3;
        this.h = b02.f652j;
        if (b02.f651i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f702d) {
            case 0:
                return this.f705g < this.f704f;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f702d) {
            case 0:
                B0 b02 = this.f703e;
                int i3 = b02.f652j;
                int i4 = this.h;
                if (i3 != i4) {
                    throw new ConcurrentModificationException();
                }
                int i5 = this.f705g;
                this.f705g = C0032d.g(b02.f647d, i5) + i5;
                return new C0(b02, i5, i4);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f702d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public K(B0 b02, int i3, L l3, C0032d c0032d) {
        this.f703e = b02;
        this.f704f = i3;
        this.f705g = b02.f652j;
    }
}
