package q;

import android.view.KeyEvent;
import c2.C0174m;
import g0.C0263a;
import g0.InterfaceC0265c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import n0.AbstractC0428i;
import n0.InterfaceC0427h;
import n0.j0;
import n0.l0;
import n0.o0;
import s.C0586d;
import t0.C0599a;
import y2.AbstractC0688v;

/* loaded from: classes.dex */
public final class l extends AbstractC0428i implements j0, InterfaceC0265c, U.b, l0, o0 {

    /* renamed from: J, reason: collision with root package name */
    public static final I f6006J = new I();

    /* renamed from: A, reason: collision with root package name */
    public h0.r f6007A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0427h f6008B;

    /* renamed from: C, reason: collision with root package name */
    public s.i f6009C;

    /* renamed from: D, reason: collision with root package name */
    public C0586d f6010D;

    /* renamed from: G, reason: collision with root package name */
    public s.g f6013G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6014H;

    /* renamed from: I, reason: collision with root package name */
    public final I f6015I;

    /* renamed from: s, reason: collision with root package name */
    public s.g f6016s;

    /* renamed from: t, reason: collision with root package name */
    public H f6017t;

    /* renamed from: u, reason: collision with root package name */
    public String f6018u;

    /* renamed from: v, reason: collision with root package name */
    public t0.e f6019v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6020w;

    /* renamed from: x, reason: collision with root package name */
    public A0.c f6021x;

    /* renamed from: z, reason: collision with root package name */
    public final u f6023z;

    /* renamed from: y, reason: collision with root package name */
    public final q f6022y = new q();

    /* renamed from: E, reason: collision with root package name */
    public final LinkedHashMap f6011E = new LinkedHashMap();

    /* renamed from: F, reason: collision with root package name */
    public long f6012F = 0;

    public l(s.g gVar, H h, boolean z3, String str, t0.e eVar, A0.c cVar) {
        this.f6016s = gVar;
        this.f6017t = h;
        this.f6018u = str;
        this.f6019v = eVar;
        this.f6020w = z3;
        this.f6021x = cVar;
        this.f6023z = new u(gVar);
        s.g gVar2 = this.f6016s;
        this.f6013G = gVar2;
        this.f6014H = gVar2 == null && this.f6017t != null;
        this.f6015I = f6006J;
    }

    @Override // n0.l0
    public final void A(t0.g gVar) {
        t0.e eVar = this.f6019v;
        if (eVar != null) {
            t0.p.c(gVar, eVar.f6205a);
        }
        String str = this.f6018u;
        A0.c cVar = new A0.c(16, this);
        v2.c[] cVarArr = t0.p.f6284a;
        gVar.b(t0.f.f6207b, new C0599a(str, cVar));
        if (this.f6020w) {
            this.f6023z.A(gVar);
        } else {
            gVar.b(t0.n.f6265i, C0174m.f3840a);
        }
    }

    @Override // n0.j0
    public final void B() {
        C0586d c0586d;
        s.g gVar = this.f6016s;
        if (gVar != null && (c0586d = this.f6010D) != null) {
            gVar.b(new s.e(c0586d));
        }
        this.f6010D = null;
        h0.r rVar = this.f6007A;
        if (rVar != null) {
            rVar.B();
        }
    }

    @Override // n0.l0
    public final boolean G() {
        return true;
    }

    @Override // P.k
    public final boolean V() {
        return false;
    }

    @Override // P.k
    public final void Y() {
        if (!this.f6014H) {
            j0();
        }
        if (this.f6020w) {
            f0(this.f6022y);
            f0(this.f6023z);
        }
    }

    @Override // P.k
    public final void Z() {
        i0();
        if (this.f6013G == null) {
            this.f6016s = null;
        }
        InterfaceC0427h interfaceC0427h = this.f6008B;
        if (interfaceC0427h != null) {
            g0(interfaceC0427h);
        }
        this.f6008B = null;
    }

    @Override // g0.InterfaceC0265c
    public final boolean d(KeyEvent keyEvent) {
        return false;
    }

    @Override // g0.InterfaceC0265c
    public final boolean g(KeyEvent keyEvent) {
        int a3;
        j0();
        boolean z3 = this.f6020w;
        LinkedHashMap linkedHashMap = this.f6011E;
        if (z3) {
            int i3 = m.f6025b;
            if (Z0.d.A(keyEvent) == 2 && ((a3 = (int) (Z.b.a(keyEvent.getKeyCode()) >> 32)) == 23 || a3 == 66 || a3 == 160)) {
                if (linkedHashMap.containsKey(new C0263a(Z.b.a(keyEvent.getKeyCode())))) {
                    return false;
                }
                s.i iVar = new s.i(this.f6012F);
                linkedHashMap.put(new C0263a(Z.b.a(keyEvent.getKeyCode())), iVar);
                if (this.f6016s != null) {
                    AbstractC0688v.l(U(), null, 0, new C0558e(this, iVar, null), 3);
                }
                return true;
            }
        }
        if (!this.f6020w) {
            return false;
        }
        int i4 = m.f6025b;
        if (Z0.d.A(keyEvent) != 1) {
            return false;
        }
        int a4 = (int) (Z.b.a(keyEvent.getKeyCode()) >> 32);
        if (a4 != 23 && a4 != 66 && a4 != 160) {
            return false;
        }
        s.i iVar2 = (s.i) linkedHashMap.remove(new C0263a(Z.b.a(keyEvent.getKeyCode())));
        if (iVar2 != null && this.f6016s != null) {
            AbstractC0688v.l(U(), null, 0, new C0559f(this, iVar2, null), 3);
        }
        this.f6021x.c();
        return true;
    }

    public final void i0() {
        s.g gVar = this.f6016s;
        LinkedHashMap linkedHashMap = this.f6011E;
        if (gVar != null) {
            s.i iVar = this.f6009C;
            if (iVar != null) {
                gVar.b(new s.h(iVar));
            }
            C0586d c0586d = this.f6010D;
            if (c0586d != null) {
                gVar.b(new s.e(c0586d));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                gVar.b(new s.h((s.i) it.next()));
            }
        }
        this.f6009C = null;
        this.f6010D = null;
        linkedHashMap.clear();
    }

    @Override // n0.o0
    public final Object j() {
        return this.f6015I;
    }

    public final void j0() {
        H h;
        if (this.f6008B == null && (h = this.f6017t) != null) {
            if (this.f6016s == null) {
                this.f6016s = new s.g();
            }
            this.f6023z.i0(this.f6016s);
            s.g gVar = this.f6016s;
            p2.g.b(gVar);
            InterfaceC0427h a3 = h.a(gVar);
            f0(a3);
            this.f6008B = a3;
        }
    }

    @Override // n0.j0
    public final void y(h0.f fVar, h0.g gVar, long j3) {
        long j4 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        this.f6012F = r2.a.f((int) (j4 >> 32), (int) (j4 & 4294967295L));
        j0();
        if (this.f6020w && gVar == h0.g.f4359e) {
            int i3 = fVar.f4357b;
            if (Z.b.p(i3, 4)) {
                AbstractC0688v.l(U(), null, 0, new C0560g(this, null), 3);
            } else if (Z.b.p(i3, 5)) {
                AbstractC0688v.l(U(), null, 0, new C0561h(this, null), 3);
            }
        }
        if (this.f6007A == null) {
            C0562i c0562i = new C0562i(this, null);
            h0.f fVar2 = h0.o.f4390a;
            h0.r rVar = new h0.r(null, null, null, c0562i);
            f0(rVar);
            this.f6007A = rVar;
        }
        h0.r rVar2 = this.f6007A;
        if (rVar2 != null) {
            rVar2.y(fVar, gVar, j3);
        }
    }

    @Override // U.b
    public final void z(U.p pVar) {
        if (pVar.a()) {
            j0();
        }
        if (this.f6020w) {
            this.f6023z.z(pVar);
        }
    }
}
