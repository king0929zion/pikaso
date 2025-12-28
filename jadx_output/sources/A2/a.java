package A2;

import D2.u;
import D2.v;
import D2.w;
import g2.InterfaceC0276i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y2.AbstractC0688v;
import y2.C0673f;
import y2.p0;

/* loaded from: classes.dex */
public final class a implements p0 {

    /* renamed from: d, reason: collision with root package name */
    public Object f221d = d.f249p;

    /* renamed from: e, reason: collision with root package name */
    public C0673f f222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f223f;

    public a(b bVar) {
        this.f223f = bVar;
    }

    @Override // y2.p0
    public final void a(u uVar, int i3) {
        C0673f c0673f = this.f222e;
        if (c0673f != null) {
            c0673f.a(uVar, i3);
        }
    }

    public final Object b(i2.c cVar) {
        j jVar;
        Boolean bool;
        j jVar2;
        int i3 = 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f228k;
        b bVar = this.f223f;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            boolean z3 = true;
            if (bVar.r(b.f224f.get(bVar), true)) {
                this.f221d = d.f245l;
                Throwable m2 = bVar.m();
                if (m2 == null) {
                    return Boolean.FALSE;
                }
                int i4 = v.f1086a;
                throw m2;
            }
            long andIncrement = b.f225g.getAndIncrement(bVar);
            long j3 = d.f236b;
            long j4 = andIncrement / j3;
            int i5 = (int) (andIncrement % j3);
            if (jVar3.f1085f != j4) {
                j l3 = bVar.l(j4, jVar3);
                if (l3 == null) {
                    continue;
                } else {
                    jVar = l3;
                }
            } else {
                jVar = jVar3;
            }
            Object z4 = bVar.z(jVar, i5, andIncrement, null);
            w wVar = d.f246m;
            if (z4 == wVar) {
                throw new IllegalStateException("unreachable");
            }
            w wVar2 = d.f248o;
            if (z4 != wVar2) {
                if (z4 != d.f247n) {
                    jVar.a();
                    this.f221d = z4;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f223f;
                C0673f g3 = AbstractC0688v.g(Z.b.z(cVar));
                try {
                    this.f222e = g3;
                    j jVar4 = jVar;
                    Object z5 = bVar2.z(jVar, i5, andIncrement, this);
                    if (z5 == wVar) {
                        a(jVar4, i5);
                    } else {
                        D2.p pVar = null;
                        InterfaceC0276i interfaceC0276i = g3.h;
                        o2.c cVar2 = bVar2.f233e;
                        if (z5 == wVar2) {
                            if (andIncrement < bVar2.o()) {
                                jVar4.a();
                            }
                            j jVar5 = (j) b.f228k.get(bVar2);
                            while (true) {
                                if (bVar2.r(b.f224f.get(bVar2), z3)) {
                                    C0673f c0673f = this.f222e;
                                    p2.g.b(c0673f);
                                    this.f222e = null;
                                    this.f221d = d.f245l;
                                    Throwable m3 = bVar.m();
                                    if (m3 == null) {
                                        c0673f.t(Boolean.FALSE);
                                    } else {
                                        c0673f.t(Z0.d.q(m3));
                                    }
                                } else {
                                    long andIncrement2 = b.f225g.getAndIncrement(bVar2);
                                    long j5 = d.f236b;
                                    long j6 = andIncrement2 / j5;
                                    int i6 = (int) (andIncrement2 % j5);
                                    if (jVar5.f1085f != j6) {
                                        j l4 = bVar2.l(j6, jVar5);
                                        if (l4 != null) {
                                            jVar2 = l4;
                                        }
                                    } else {
                                        jVar2 = jVar5;
                                    }
                                    o2.c cVar3 = cVar2;
                                    Object z6 = bVar2.z(jVar2, i6, andIncrement2, this);
                                    if (z6 == d.f246m) {
                                        a(jVar2, i6);
                                        break;
                                    }
                                    if (z6 == d.f248o) {
                                        if (andIncrement2 < bVar2.o()) {
                                            jVar2.a();
                                        }
                                        jVar5 = jVar2;
                                        cVar2 = cVar3;
                                        z3 = true;
                                    } else {
                                        if (z6 == d.f247n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar2.a();
                                        this.f221d = z6;
                                        this.f222e = null;
                                        bool = Boolean.TRUE;
                                        if (cVar3 != null) {
                                            pVar = new D2.p(cVar3, z6, interfaceC0276i, i3);
                                        }
                                    }
                                }
                            }
                        } else {
                            jVar4.a();
                            this.f221d = z5;
                            this.f222e = null;
                            bool = Boolean.TRUE;
                            if (cVar2 != null) {
                                pVar = new D2.p(cVar2, z5, interfaceC0276i, i3);
                            }
                        }
                        g3.g(bool, pVar);
                    }
                    return g3.s();
                } catch (Throwable th) {
                    g3.C();
                    throw th;
                }
            }
            if (andIncrement < bVar.o()) {
                jVar.a();
            }
            jVar3 = jVar;
        }
    }

    public final Object c() {
        Object obj = this.f221d;
        w wVar = d.f249p;
        if (obj == wVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f221d = wVar;
        if (obj != d.f245l) {
            return obj;
        }
        Throwable m2 = this.f223f.m();
        if (m2 == null) {
            m2 = new k("Channel was closed");
        }
        int i3 = v.f1086a;
        throw m2;
    }
}
