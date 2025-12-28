package J0;

import A.AbstractC0000a;
import a.AbstractC0090a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1423d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f1424e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0090a f1425f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f1426g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f1427a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f1428b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f1429c;

    static {
        AbstractC0090a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f1425f = eVar;
        if (th != null) {
            f1424e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1426g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.f1429c;
        } while (!f1425f.l(gVar, fVar, f.f1420c));
        while (fVar != null) {
            Thread thread = fVar.f1421a;
            if (thread != null) {
                fVar.f1421a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f1422b;
        }
        do {
            cVar = gVar.f1428b;
        } while (!f1425f.j(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f1415a;
            cVar.f1415a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f1415a;
            try {
                throw null;
            } catch (RuntimeException e3) {
                f1424e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e3);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f1413a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f1426g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d3 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d3 == this ? "this future" : String.valueOf(d3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f1427a;
        if (obj != null) {
            return false;
        }
        if (!f1425f.k(this, obj, f1423d ? new a(z3, new CancellationException("Future.cancel() was called.")) : z3 ? a.f1411b : a.f1412c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f1421a = null;
        while (true) {
            f fVar2 = this.f1429c;
            if (fVar2 == f.f1420c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f1422b;
                if (fVar2.f1421a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f1422b = fVar4;
                    if (fVar3.f1421a == null) {
                        break;
                    }
                } else if (!f1425f.l(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1427a;
        if (obj != null) {
            return c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f1429c;
            f fVar2 = f.f1420c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0090a abstractC0090a = f1425f;
                    abstractC0090a.Y(fVar3, fVar);
                    if (abstractC0090a.l(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1427a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f1429c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f1427a);
        }
        while (nanos > 0) {
            Object obj3 = this.f1427a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String e3 = AbstractC0000a.e(str, " (plus ");
            long j4 = -nanos;
            long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = e3 + convert + " " + lowerCase;
                if (z3) {
                    str2 = AbstractC0000a.e(str2, ",");
                }
                e3 = AbstractC0000a.e(str2, " ");
            }
            if (z3) {
                e3 = e3 + nanos2 + " nanoseconds ";
            }
            str = AbstractC0000a.e(e3, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0000a.e(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + gVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1427a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1427a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f1427a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1427a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f1429c;
            f fVar2 = f.f1420c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0090a abstractC0090a = f1425f;
                    abstractC0090a.Y(fVar3, fVar);
                    if (abstractC0090a.l(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1427a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f1429c;
                } while (fVar != fVar2);
            }
            return c(this.f1427a);
        }
        throw new InterruptedException();
    }
}
