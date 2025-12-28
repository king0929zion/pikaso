package D;

import N.C0075c;
import android.util.Log;
import d2.C0248s;
import g2.InterfaceC0276i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;
import n.C0375B;
import y2.C0673f;
import y2.C0685s;
import y2.InterfaceC0672e;

/* loaded from: classes.dex */
public final class v0 extends AbstractC0058q {

    /* renamed from: v, reason: collision with root package name */
    public static final B2.G f905v;

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f906w;

    /* renamed from: a, reason: collision with root package name */
    public final C0040h f907a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f908b;

    /* renamed from: c, reason: collision with root package name */
    public y2.S f909c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f910d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f911e;

    /* renamed from: f, reason: collision with root package name */
    public Object f912f;

    /* renamed from: g, reason: collision with root package name */
    public C0375B f913g;
    public final F.d h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f914i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f915j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f916k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f917l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f918m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashSet f919n;

    /* renamed from: o, reason: collision with root package name */
    public C0673f f920o;

    /* renamed from: p, reason: collision with root package name */
    public A.t f921p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f922q;

    /* renamed from: r, reason: collision with root package name */
    public final B2.G f923r;

    /* renamed from: s, reason: collision with root package name */
    public final y2.V f924s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC0276i f925t;

    /* renamed from: u, reason: collision with root package name */
    public final U f926u;

    static {
        Object obj = J.b.f1403g;
        if (obj == null) {
            obj = C2.c.f586b;
        }
        f905v = new B2.G(obj);
        f906w = new AtomicReference(Boolean.FALSE);
    }

    public v0(InterfaceC0276i interfaceC0276i) {
        C0040h c0040h = new C0040h(new A0.c(4, this));
        this.f907a = c0040h;
        this.f908b = new Object();
        this.f911e = new ArrayList();
        this.f913g = new C0375B();
        this.h = new F.d(new C0060t[16]);
        this.f914i = new ArrayList();
        this.f915j = new ArrayList();
        this.f916k = new LinkedHashMap();
        this.f917l = new LinkedHashMap();
        this.f923r = new B2.G(EnumC0055o0.f841f);
        y2.V v3 = new y2.V((y2.S) interfaceC0276i.n(C0685s.f6818e));
        v3.q(new C0065y(1, this));
        this.f924s = v3;
        this.f925t = interfaceC0276i.i(c0040h).i(v3);
        this.f926u = new U(7);
    }

    public static final C0060t a(v0 v0Var, C0060t c0060t, C0375B c0375b) {
        C0075c B3;
        if (c0060t.f880t.f795C || c0060t.f881u) {
            return null;
        }
        LinkedHashSet linkedHashSet = v0Var.f919n;
        if (linkedHashSet != null && linkedHashSet.contains(c0060t)) {
            return null;
        }
        C0065y c0065y = new C0065y(2, c0060t);
        C0038g c0038g = new C0038g(c0060t, 3, c0375b);
        N.h k3 = N.o.k();
        C0075c c0075c = k3 instanceof C0075c ? (C0075c) k3 : null;
        if (c0075c == null || (B3 = c0075c.B(c0065y, c0038g)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            N.h j3 = B3.j();
            if (c0375b != null) {
                try {
                    if (c0375b.h()) {
                        q0 q0Var = new q0(c0375b, 0, c0060t);
                        C0052n c0052n = c0060t.f880t;
                        if (c0052n.f795C) {
                            C0032d.r("Preparing a composition while composing is not supported");
                            throw null;
                        }
                        c0052n.f795C = true;
                        try {
                            q0Var.c();
                            c0052n.f795C = false;
                        } catch (Throwable th) {
                            c0052n.f795C = false;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    N.h.p(j3);
                    throw th2;
                }
            }
            boolean r3 = c0060t.r();
            N.h.p(j3);
            if (!r3) {
                c0060t = null;
            }
            return c0060t;
        } finally {
            c(B3);
        }
    }

    public static final boolean b(v0 v0Var) {
        boolean z3;
        List h;
        synchronized (v0Var.f908b) {
            z3 = true;
            if (!v0Var.f913g.g()) {
                F.f fVar = new F.f(v0Var.f913g);
                v0Var.f913g = new C0375B();
                synchronized (v0Var.f908b) {
                    h = v0Var.h();
                }
                try {
                    int size = h.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((C0060t) h.get(i3)).s(fVar);
                        if (((EnumC0055o0) v0Var.f923r.getValue()).compareTo(EnumC0055o0.f840e) <= 0) {
                            break;
                        }
                    }
                    synchronized (v0Var.f908b) {
                        v0Var.f913g = new C0375B();
                    }
                    synchronized (v0Var.f908b) {
                        if (v0Var.e() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        if (!v0Var.h.k() && !v0Var.f()) {
                            z3 = false;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (v0Var.f908b) {
                        C0375B c0375b = v0Var.f913g;
                        c0375b.getClass();
                        for (Object obj : fVar) {
                            c0375b.f4961b[c0375b.d(obj)] = obj;
                        }
                        throw th;
                    }
                }
            } else if (!v0Var.h.k() && !v0Var.f()) {
                z3 = false;
            }
        }
        return z3;
    }

    public static void c(C0075c c0075c) {
        try {
            if (c0075c.v() instanceof N.i) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c0075c.c();
        }
    }

    public static final void i(ArrayList arrayList, v0 v0Var, C0060t c0060t) {
        arrayList.clear();
        synchronized (v0Var.f908b) {
            Iterator it = v0Var.f915j.iterator();
            if (it.hasNext()) {
                ((X) it.next()).getClass();
                throw null;
            }
        }
    }

    public static /* synthetic */ void l(v0 v0Var, Exception exc, boolean z3, int i3) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        v0Var.k(exc, null, z3);
    }

    public final void d() {
        synchronized (this.f908b) {
            if (((EnumC0055o0) this.f923r.getValue()).compareTo(EnumC0055o0.h) >= 0) {
                B2.G g3 = this.f923r;
                EnumC0055o0 enumC0055o0 = EnumC0055o0.f840e;
                g3.getClass();
                g3.g(null, enumC0055o0);
            }
        }
        this.f924s.a(null);
    }

    public final InterfaceC0672e e() {
        B2.G g3 = this.f923r;
        int compareTo = ((EnumC0055o0) g3.getValue()).compareTo(EnumC0055o0.f840e);
        ArrayList arrayList = this.f915j;
        ArrayList arrayList2 = this.f914i;
        F.d dVar = this.h;
        if (compareTo <= 0) {
            this.f911e.clear();
            this.f912f = C0248s.f4255d;
            this.f913g = new C0375B();
            dVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f918m = null;
            C0673f c0673f = this.f920o;
            if (c0673f != null) {
                c0673f.n(null);
            }
            this.f920o = null;
            this.f921p = null;
            return null;
        }
        A.t tVar = this.f921p;
        EnumC0055o0 enumC0055o0 = EnumC0055o0.f843i;
        EnumC0055o0 enumC0055o02 = EnumC0055o0.f841f;
        if (tVar == null) {
            if (this.f909c == null) {
                this.f913g = new C0375B();
                dVar.g();
                if (f()) {
                    enumC0055o02 = EnumC0055o0.f842g;
                }
            } else {
                enumC0055o02 = (dVar.k() || this.f913g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || f()) ? enumC0055o0 : EnumC0055o0.h;
            }
        }
        g3.getClass();
        g3.g(null, enumC0055o02);
        if (enumC0055o02 != enumC0055o0) {
            return null;
        }
        C0673f c0673f2 = this.f920o;
        this.f920o = null;
        return c0673f2;
    }

    public final boolean f() {
        return (this.f922q || this.f907a.f764i.get() == 0) ? false : true;
    }

    public final boolean g() {
        boolean z3;
        synchronized (this.f908b) {
            if (!this.f913g.h() && !this.h.k()) {
                z3 = f();
            }
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List h() {
        Object obj = this.f912f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f911e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? C0248s.f4255d : new ArrayList(arrayList);
            this.f912f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        if (r4 >= r3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (((c2.C0168g) r10.get(r4)).f3834e == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        if (r8 >= r4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0119, code lost:
    
        r11 = (c2.C0168g) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0121, code lost:
    
        if (r11.f3834e != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        r11 = (D.X) r11.f3833d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012d, code lost:
    
        r4 = r17.f908b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012f, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        d2.AbstractC0246q.Y(r17.f915j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0136, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0144, code lost:
    
        if (r8 >= r4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014f, code lost:
    
        if (((c2.C0168g) r11).f3834e == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0151, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j(java.util.List r18, n.C0375B r19) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.v0.j(java.util.List, n.B):java.util.List");
    }

    public final void k(Exception exc, C0060t c0060t, boolean z3) {
        int i3 = 5;
        if (!((Boolean) f906w.get()).booleanValue() || (exc instanceof C0046k)) {
            synchronized (this.f908b) {
                A.t tVar = this.f921p;
                if (tVar != null) {
                    throw ((Exception) tVar.f175e);
                }
                this.f921p = new A.t(i3, exc);
            }
            throw exc;
        }
        synchronized (this.f908b) {
            try {
                int i4 = AbstractC0028b.f737b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f914i.clear();
                this.h.g();
                this.f913g = new C0375B();
                this.f915j.clear();
                this.f916k.clear();
                this.f917l.clear();
                this.f921p = new A.t(i3, exc);
                if (c0060t != null) {
                    m(c0060t);
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(C0060t c0060t) {
        ArrayList arrayList = this.f918m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f918m = arrayList;
        }
        if (!arrayList.contains(c0060t)) {
            arrayList.add(c0060t);
        }
        this.f911e.remove(c0060t);
        this.f912f = null;
    }
}
