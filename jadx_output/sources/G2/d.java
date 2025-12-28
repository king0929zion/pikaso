package G2;

import D2.w;
import c2.C0174m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.AbstractC0688v;
import y2.C0673f;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1287g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z3) {
        super(z3 ? 1 : 0);
        this.owner = z3 ? null : e.f1288a;
    }

    public final Object c(Object obj, i2.c cVar) {
        int i3;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f1295f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                c3 = 0;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1287g;
                if (i4 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f1288a) {
                                c3 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c3 == 1) {
                            c3 = 2;
                            break;
                        }
                        if (c3 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    break;
                }
            }
        }
        c3 = 1;
        C0174m c0174m = C0174m.f3840a;
        if (c3 == 0) {
            return c0174m;
        }
        if (c3 != 1) {
            if (c3 != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        C0673f g3 = AbstractC0688v.g(Z.b.z(cVar));
        try {
            a(new c(this, g3, obj));
            Object s3 = g3.s();
            h2.a aVar = h2.a.f4407d;
            if (s3 != aVar) {
                s3 = c0174m;
            }
            return s3 == aVar ? s3 : c0174m;
        } catch (Throwable th) {
            g3.C();
            throw th;
        }
    }

    public final void d(Object obj) {
        while (Math.max(h.f1295f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1287g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            w wVar = e.f1288a;
            if (obj2 != wVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, wVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0688v.f(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f1295f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f1287g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
