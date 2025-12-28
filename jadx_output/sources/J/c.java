package J;

import Z0.d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import n.C0375B;
import n.C0406z;
import p2.g;
import w2.e;

/* loaded from: classes.dex */
public final class c implements Iterator, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1407d;

    /* renamed from: e, reason: collision with root package name */
    public int f1408e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1409f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1410g;

    public c(Object obj, Map map) {
        this.f1407d = 0;
        this.f1409f = obj;
        this.f1410g = map;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o2.c] */
    public void a() {
        Object i3;
        int i4 = this.f1408e;
        e eVar = (e) this.f1410g;
        if (i4 == -2) {
            i3 = ((A0.c) eVar.f6569b).f199f;
        } else {
            ?? r02 = eVar.f6570c;
            Object obj = this.f1409f;
            g.b(obj);
            i3 = r02.i(obj);
        }
        this.f1409f = i3;
        this.f1408e = i3 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1407d) {
            case 0:
                return this.f1408e < ((Map) this.f1410g).size();
            case 1:
                return ((w2.g) this.f1409f).hasNext();
            default:
                if (this.f1408e < 0) {
                    a();
                }
                return this.f1408e == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1407d) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f1409f;
                this.f1408e++;
                Object obj2 = ((Map) this.f1410g).get(obj);
                if (obj2 != null) {
                    this.f1409f = ((a) obj2).f1402b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                return ((w2.g) this.f1409f).next();
            default:
                if (this.f1408e < 0) {
                    a();
                }
                if (this.f1408e == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f1409f;
                g.c(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f1408e = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1407d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i3 = this.f1408e;
                if (i3 != -1) {
                    ((C0375B) this.f1410g).k(i3);
                    this.f1408e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(e eVar) {
        this.f1407d = 2;
        this.f1410g = eVar;
        this.f1408e = -2;
    }

    public c(C0375B c0375b) {
        this.f1407d = 1;
        this.f1410g = c0375b;
        this.f1408e = -1;
        this.f1409f = d.D(new C0406z(c0375b, this, null));
    }
}
