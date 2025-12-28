package D2;

import A.AbstractC0000a;
import c2.AbstractC0171j;
import g2.InterfaceC0271d;
import g2.InterfaceC0276i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.AbstractC0688v;
import y2.C0680m;
import y2.C0681n;
import y2.C0685s;
import y2.InterfaceC0686t;
import y2.J;
import y2.S;
import y2.j0;
import y2.k0;
import y2.n0;

/* renamed from: D2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0071a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f1042a = new w("NO_DECISION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final w f1043b = new w("CLOSED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final w f1044c = new w("UNDEFINED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final w f1045d = new w("REUSABLE_CLAIMED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final w f1046e = new w("CONDITION_FALSE", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final w f1047f = new w("NO_THREAD_ELEMENTS", 0);

    public static final B1.c a(o2.c cVar, Object obj, B1.c cVar2) {
        try {
            cVar.i(obj);
        } catch (Throwable th) {
            if (cVar2 == null || cVar2.getCause() == th) {
                return new B1.c("Exception in undelivered element handler for " + obj, th);
            }
            Z0.d.f(cVar2, th);
        }
        return cVar2;
    }

    public static final Object b(u uVar, long j3, o2.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f1085f >= j3 && !uVar.c()) {
                return uVar;
            }
            Object obj = c.f1049d.get(uVar);
            w wVar = f1043b;
            if (obj == wVar) {
                return wVar;
            }
            u uVar2 = (u) ((c) obj);
            if (uVar2 == null) {
                uVar2 = (u) eVar.h(Long.valueOf(uVar.f1085f + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = c.f1049d;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f1043b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(InterfaceC0276i interfaceC0276i, Throwable th) {
        Throwable runtimeException;
        Iterator it = e.f1052a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0686t) it.next()).r(interfaceC0276i, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    Z0.d.f(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            Z0.d.f(th, new f(interfaceC0276i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f1043b;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(InterfaceC0276i interfaceC0276i, Object obj) {
        if (obj == f1047f) {
            return;
        }
        if (!(obj instanceof A)) {
            Object l3 = interfaceC0276i.l(null, y.f1091g);
            p2.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0000a.j(l3);
            throw null;
        }
        A a3 = (A) obj;
        j0[] j0VarArr = a3.f1041b;
        int length = j0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        j0 j0Var = j0VarArr[length];
        p2.g.b(null);
        Object obj2 = a3.f1040a[length];
        throw null;
    }

    public static final void h(InterfaceC0271d interfaceC0271d, Object obj, o2.c cVar) {
        if (!(interfaceC0271d instanceof g)) {
            interfaceC0271d.t(obj);
            return;
        }
        g gVar = (g) interfaceC0271d;
        Throwable a3 = AbstractC0171j.a(obj);
        Object c0681n = a3 == null ? cVar != null ? new C0681n(obj, cVar) : obj : new C0680m(a3, false);
        i2.c cVar2 = gVar.h;
        cVar2.o();
        y2.r rVar = gVar.f1055g;
        if (rVar.g()) {
            gVar.f1056i = c0681n;
            gVar.f6748f = 1;
            rVar.d(cVar2.o(), gVar);
            return;
        }
        J a4 = k0.a();
        if (a4.t()) {
            gVar.f1056i = c0681n;
            gVar.f6748f = 1;
            a4.m(gVar);
            return;
        }
        a4.p(true);
        try {
            S s3 = (S) cVar2.o().n(C0685s.f6818e);
            if (s3 == null || s3.b()) {
                Object obj2 = gVar.f1057j;
                InterfaceC0276i o3 = cVar2.o();
                Object m2 = m(o3, obj2);
                n0 r3 = m2 != f1047f ? AbstractC0688v.r(cVar2, o3, m2) : null;
                try {
                    cVar2.t(obj);
                } finally {
                    if (r3 == null || r3.d0()) {
                        g(o3, m2);
                    }
                }
            } else {
                CancellationException f3 = s3.f();
                gVar.b(c0681n, f3);
                gVar.t(Z0.d.q(f3));
            }
            while (a4.x()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long j(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.AbstractC0071a.j(java.lang.String, long, long, long):long");
    }

    public static int k(String str, int i3, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return (int) j(str, i3, i4, i5);
    }

    public static final Object l(InterfaceC0276i interfaceC0276i) {
        Object l3 = interfaceC0276i.l(0, y.f1090f);
        p2.g.b(l3);
        return l3;
    }

    public static final Object m(InterfaceC0276i interfaceC0276i, Object obj) {
        if (obj == null) {
            obj = l(interfaceC0276i);
        }
        if (obj == 0) {
            return f1047f;
        }
        if (obj instanceof Integer) {
            return interfaceC0276i.l(new A(((Number) obj).intValue(), interfaceC0276i), y.h);
        }
        AbstractC0000a.j(obj);
        throw null;
    }
}
