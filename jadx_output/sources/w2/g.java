package w2;

import c2.C0174m;
import g2.C0277j;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC0271d, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f6571d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6572e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0271d f6573f;

    public final RuntimeException a() {
        int i3 = this.f6571d;
        if (i3 == 4) {
            return new NoSuchElementException();
        }
        if (i3 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f6571d);
    }

    public final void b(Object obj, i2.i iVar) {
        this.f6572e = obj;
        this.f6571d = 3;
        this.f6573f = iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        while (true) {
            i3 = this.f6571d;
            if (i3 != 0) {
                break;
            }
            this.f6571d = 5;
            InterfaceC0271d interfaceC0271d = this.f6573f;
            p2.g.b(interfaceC0271d);
            this.f6573f = null;
            interfaceC0271d.t(C0174m.f3840a);
        }
        if (i3 == 1) {
            p2.g.b(null);
            throw null;
        }
        if (i3 == 2 || i3 == 3) {
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f6571d;
        if (i3 == 0 || i3 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i3 == 2) {
            this.f6571d = 1;
            p2.g.b(null);
            throw null;
        }
        if (i3 != 3) {
            throw a();
        }
        this.f6571d = 0;
        Object obj = this.f6572e;
        this.f6572e = null;
        return obj;
    }

    @Override // g2.InterfaceC0271d
    public final InterfaceC0276i o() {
        return C0277j.f4334d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // g2.InterfaceC0271d
    public final void t(Object obj) {
        Z0.d.U(obj);
        this.f6571d = 4;
    }
}
