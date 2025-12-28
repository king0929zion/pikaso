package D;

import g2.InterfaceC0274g;
import g2.InterfaceC0275h;
import g2.InterfaceC0276i;
import java.util.ArrayList;
import y2.C0673f;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040h implements V {

    /* renamed from: d, reason: collision with root package name */
    public final A0.c f760d;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f762f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f761e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f763g = new ArrayList();
    public ArrayList h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final C0034e f764i = new C0034e(0);

    public C0040h(A0.c cVar) {
        this.f760d = cVar;
    }

    public final void c(long j3) {
        Object q3;
        synchronized (this.f761e) {
            try {
                ArrayList arrayList = this.f763g;
                this.f763g = this.h;
                this.h = arrayList;
                this.f764i.set(0);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0036f c0036f = (C0036f) arrayList.get(i3);
                    c0036f.getClass();
                    try {
                        q3 = c0036f.f749a.i(Long.valueOf(j3));
                    } catch (Throwable th) {
                        q3 = Z0.d.q(th);
                    }
                    c0036f.f750b.t(q3);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i e(InterfaceC0275h interfaceC0275h) {
        return Z0.d.H(this, interfaceC0275h);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0276i i(InterfaceC0276i interfaceC0276i) {
        return Z0.d.K(this, interfaceC0276i);
    }

    @Override // g2.InterfaceC0276i
    public final Object l(Object obj, o2.e eVar) {
        return eVar.h(obj, this);
    }

    @Override // g2.InterfaceC0276i
    public final InterfaceC0274g n(InterfaceC0275h interfaceC0275h) {
        return Z0.d.w(this, interfaceC0275h);
    }

    @Override // D.V
    public final Object u(o2.c cVar, i2.c cVar2) {
        C0673f c0673f = new C0673f(1, Z.b.z(cVar2));
        c0673f.u();
        C0036f c0036f = new C0036f(cVar, c0673f);
        synchronized (this.f761e) {
            Throwable th = this.f762f;
            if (th != null) {
                c0673f.t(Z0.d.q(th));
            } else {
                boolean isEmpty = this.f763g.isEmpty();
                this.f763g.add(c0036f);
                if (isEmpty) {
                    this.f764i.set(1);
                }
                c0673f.x(new C0038g(this, 0, c0036f));
                if (isEmpty) {
                    try {
                        this.f760d.c();
                    } catch (Throwable th2) {
                        synchronized (this.f761e) {
                            try {
                                if (this.f762f == null) {
                                    this.f762f = th2;
                                    ArrayList arrayList = this.f763g;
                                    int size = arrayList.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        ((C0036f) arrayList.get(i3)).f750b.t(Z0.d.q(th2));
                                    }
                                    this.f763g.clear();
                                    this.f764i.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return c0673f.s();
    }
}
