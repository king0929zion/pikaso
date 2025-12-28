package z;

import D.C0032d;
import D.C0037f0;
import D.Z;
import D.w0;
import W.AbstractC0081d;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import n0.C0408B;
import q.InterfaceC0551D;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698a implements w0, InterfaceC0716s, InterfaceC0551D {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6842d;

    /* renamed from: e, reason: collision with root package name */
    public final Z.a f6843e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6844f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6845g;
    public final Z h;

    /* renamed from: i, reason: collision with root package name */
    public final Z f6846i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewGroup f6847j;

    /* renamed from: k, reason: collision with root package name */
    public C0715r f6848k;

    /* renamed from: l, reason: collision with root package name */
    public final C0037f0 f6849l = C0032d.A(null);

    /* renamed from: m, reason: collision with root package name */
    public final C0037f0 f6850m = C0032d.A(Boolean.TRUE);

    /* renamed from: n, reason: collision with root package name */
    public long f6851n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f6852o = -1;

    /* renamed from: p, reason: collision with root package name */
    public final A0.c f6853p = new A0.c(21, this);

    public C0698a(boolean z3, float f3, Z z4, Z z5, ViewGroup viewGroup) {
        this.f6842d = z3;
        this.f6843e = new Z.a(z3, new A0.c(23, z5));
        this.f6844f = z3;
        this.f6845g = f3;
        this.h = z4;
        this.f6846i = z5;
        this.f6847j = viewGroup;
    }

    @Override // z.InterfaceC0716s
    public final void F() {
        this.f6849l.setValue(null);
    }

    @Override // D.w0
    public final void a() {
        C0715r c0715r = this.f6848k;
        if (c0715r != null) {
            F();
            M.c cVar = c0715r.f6894g;
            t tVar = (t) cVar.f1517a.get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = cVar.f1517a;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                c0715r.f6893f.add(tVar);
            }
        }
    }

    @Override // D.w0
    public final void b() {
    }

    @Override // D.w0
    public final void c() {
        C0715r c0715r = this.f6848k;
        if (c0715r != null) {
            F();
            M.c cVar = c0715r.f6894g;
            t tVar = (t) cVar.f1517a.get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = cVar.f1517a;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                c0715r.f6893f.add(tVar);
            }
        }
    }

    @Override // q.InterfaceC0551D
    public final void d(C0408B c0408b) {
        int b3;
        float u3;
        Y.b bVar = c0408b.f5076d;
        this.f6851n = bVar.L();
        float f3 = this.f6845g;
        if (Float.isNaN(f3)) {
            b3 = r2.a.U(AbstractC0714q.a(c0408b, this.f6844f, bVar.L()));
        } else {
            b3 = bVar.b(f3);
        }
        this.f6852o = b3;
        long j3 = ((W.r) this.h.getValue()).f2564a;
        float f4 = ((C0705h) this.f6846i.getValue()).f6870d;
        c0408b.a();
        if (Float.isNaN(f3)) {
            u3 = AbstractC0714q.a(c0408b, this.f6842d, bVar.L());
        } else {
            u3 = c0408b.u(f3);
        }
        this.f6843e.a(c0408b, u3, j3);
        W.o j4 = bVar.f2770e.j();
        ((Boolean) this.f6850m.getValue()).booleanValue();
        t tVar = (t) this.f6849l.getValue();
        if (tVar != null) {
            tVar.e(bVar.L(), j3, f4);
            tVar.draw(AbstractC0081d.a(j4));
        }
    }
}
