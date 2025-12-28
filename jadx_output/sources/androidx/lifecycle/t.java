package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l.C0349a;
import m.C0363a;
import m.C0365c;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3482a;

    /* renamed from: b, reason: collision with root package name */
    public C0363a f3483b;

    /* renamed from: c, reason: collision with root package name */
    public m f3484c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f3485d;

    /* renamed from: e, reason: collision with root package name */
    public int f3486e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3487f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3488g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final B2.G f3489i;

    public t(r rVar) {
        new AtomicReference(null);
        this.f3482a = true;
        this.f3483b = new C0363a();
        m mVar = m.f3475e;
        this.f3484c = mVar;
        this.h = new ArrayList();
        this.f3485d = new WeakReference(rVar);
        this.f3489i = new B2.G(mVar);
    }

    public final void a(q qVar) {
        p c0125f;
        r rVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        int i3 = 1;
        p2.g.e(qVar, "observer");
        c("addObserver");
        m mVar = this.f3484c;
        m mVar2 = m.f3474d;
        if (mVar != mVar2) {
            mVar2 = m.f3475e;
        }
        s sVar = new s();
        HashMap hashMap = u.f3490a;
        boolean z3 = qVar instanceof p;
        boolean z4 = qVar instanceof InterfaceC0123d;
        if (z3 && z4) {
            c0125f = new C0125f((InterfaceC0123d) qVar, (p) qVar);
        } else if (z4) {
            c0125f = new C0125f((InterfaceC0123d) qVar, null);
        } else if (z3) {
            c0125f = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.c(cls) == 2) {
                Object obj2 = u.f3491b.get(cls);
                p2.g.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0127h[] interfaceC0127hArr = new InterfaceC0127h[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                c0125f = new A1.a(i3, interfaceC0127hArr);
            } else {
                c0125f = new C0125f(qVar);
            }
        }
        sVar.f3481b = c0125f;
        sVar.f3480a = mVar2;
        C0363a c0363a = this.f3483b;
        C0365c a3 = c0363a.a(qVar);
        if (a3 != null) {
            obj = a3.f4945e;
        } else {
            HashMap hashMap2 = c0363a.h;
            C0365c c0365c = new C0365c(qVar, sVar);
            c0363a.f4954g++;
            C0365c c0365c2 = c0363a.f4952e;
            if (c0365c2 == null) {
                c0363a.f4951d = c0365c;
                c0363a.f4952e = c0365c;
            } else {
                c0365c2.f4946f = c0365c;
                c0365c.f4947g = c0365c2;
                c0363a.f4952e = c0365c;
            }
            hashMap2.put(qVar, c0365c);
        }
        if (((s) obj) == null && (rVar = (r) this.f3485d.get()) != null) {
            boolean z5 = this.f3486e != 0 || this.f3487f;
            m b3 = b(qVar);
            this.f3486e++;
            while (sVar.f3480a.compareTo(b3) < 0 && this.f3483b.h.containsKey(qVar)) {
                arrayList.add(sVar.f3480a);
                C0129j c0129j = l.Companion;
                m mVar3 = sVar.f3480a;
                c0129j.getClass();
                l a4 = C0129j.a(mVar3);
                if (a4 == null) {
                    throw new IllegalStateException("no event up from " + sVar.f3480a);
                }
                sVar.a(rVar, a4);
                arrayList.remove(arrayList.size() - 1);
                b3 = b(qVar);
            }
            if (!z5) {
                g();
            }
            this.f3486e--;
        }
    }

    public final m b(q qVar) {
        HashMap hashMap = this.f3483b.h;
        C0365c c0365c = hashMap.containsKey(qVar) ? ((C0365c) hashMap.get(qVar)).f4947g : null;
        m mVar = c0365c != null ? ((s) c0365c.f4945e).f3480a : null;
        ArrayList arrayList = this.h;
        m mVar2 = arrayList.isEmpty() ? null : (m) arrayList.get(arrayList.size() - 1);
        m mVar3 = this.f3484c;
        p2.g.e(mVar3, "state1");
        if (mVar == null || mVar.compareTo(mVar3) >= 0) {
            mVar = mVar3;
        }
        return (mVar2 == null || mVar2.compareTo(mVar) >= 0) ? mVar : mVar2;
    }

    public final void c(String str) {
        C0349a c0349a;
        if (this.f3482a) {
            if (C0349a.f4912b != null) {
                c0349a = C0349a.f4912b;
            } else {
                synchronized (C0349a.class) {
                    try {
                        if (C0349a.f4912b == null) {
                            C0349a.f4912b = new C0349a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0349a = C0349a.f4912b;
            }
            ((C0349a) c0349a.f4913a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void d(l lVar) {
        p2.g.e(lVar, "event");
        c("handleLifecycleEvent");
        e(lVar.a());
    }

    public final void e(m mVar) {
        m mVar2 = this.f3484c;
        if (mVar2 == mVar) {
            return;
        }
        m mVar3 = m.f3475e;
        m mVar4 = m.f3474d;
        if (mVar2 == mVar3 && mVar == mVar4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + mVar + ", but was " + this.f3484c + " in component " + this.f3485d.get()).toString());
        }
        this.f3484c = mVar;
        if (this.f3487f || this.f3486e != 0) {
            this.f3488g = true;
            return;
        }
        this.f3487f = true;
        g();
        this.f3487f = false;
        if (this.f3484c == mVar4) {
            this.f3483b = new C0363a();
        }
    }

    public final void f(q qVar) {
        p2.g.e(qVar, "observer");
        c("removeObserver");
        this.f3483b.b(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r8.f3488g = false;
        r0 = r8.f3484c;
        r1 = r8.f3489i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = C2.c.f586b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.g(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.g():void");
    }
}
