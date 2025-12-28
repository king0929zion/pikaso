package y2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Z implements N {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f6777e = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_isCompleting");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6778f = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_rootCause");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6779g = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f6780d;

    public Z(d0 d0Var, Throwable th) {
        this.f6780d = d0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable c3 = c();
        if (c3 == null) {
            f6778f.set(this, th);
            return;
        }
        if (th == c3) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6779g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // y2.N
    public final boolean b() {
        return c() == null;
    }

    public final Throwable c() {
        return (Throwable) f6778f.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return f6777e.get(this) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6779g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable c3 = c();
        if (c3 != null) {
            arrayList.add(0, c3);
        }
        if (th != null && !th.equals(c3)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0688v.h);
        return arrayList;
    }

    @Override // y2.N
    public final d0 g() {
        return this.f6780d;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f6779g.get(this) + ", list=" + this.f6780d + ']';
    }
}
