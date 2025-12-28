package y2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class G implements Runnable, Comparable, C {
    private volatile Object _heap;

    /* renamed from: d, reason: collision with root package name */
    public long f6756d;

    /* renamed from: e, reason: collision with root package name */
    public int f6757e;

    public final int a(long j3, H h, I i3) {
        synchronized (this) {
            if (this._heap == AbstractC0688v.f6820b) {
                return 2;
            }
            synchronized (h) {
                try {
                    G[] gArr = h.f1094a;
                    G g3 = gArr != null ? gArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I.f6759j;
                    i3.getClass();
                    if (I.f6761l.get(i3) != 0) {
                        return 1;
                    }
                    if (g3 == null) {
                        h.f6758c = j3;
                    } else {
                        long j4 = g3.f6756d;
                        if (j4 - j3 < 0) {
                            j3 = j4;
                        }
                        if (j3 - h.f6758c > 0) {
                            h.f6758c = j3;
                        }
                    }
                    long j5 = this.f6756d;
                    long j6 = h.f6758c;
                    if (j5 - j6 < 0) {
                        this.f6756d = j6;
                    }
                    h.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(H h) {
        if (this._heap == AbstractC0688v.f6820b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f6756d - ((G) obj).f6756d;
        if (j3 > 0) {
            return 1;
        }
        return j3 < 0 ? -1 : 0;
    }

    @Override // y2.C
    public final void d() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                D2.w wVar = AbstractC0688v.f6820b;
                if (obj == wVar) {
                    return;
                }
                H h = obj instanceof H ? (H) obj : null;
                if (h != null) {
                    synchronized (h) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof D2.z ? (D2.z) obj2 : null) != null) {
                            h.b(this.f6757e);
                        }
                    }
                }
                this._heap = wVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f6756d + ']';
    }
}
