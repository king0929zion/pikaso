package u2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f6303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6304e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6305f;

    /* renamed from: g, reason: collision with root package name */
    public int f6306g;

    public c(int i3, int i4, int i5) {
        this.f6303d = i5;
        this.f6304e = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.f6305f = z3;
        this.f6306g = z3 ? i3 : i4;
    }

    public final int a() {
        int i3 = this.f6306g;
        if (i3 != this.f6304e) {
            this.f6306g = this.f6303d + i3;
        } else {
            if (!this.f6305f) {
                throw new NoSuchElementException();
            }
            this.f6305f = false;
        }
        return i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6305f;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
