package p;

import D.C0032d;
import D.C0037f0;
import c2.C0174m;
import y2.AbstractC0688v;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535d {

    /* renamed from: a, reason: collision with root package name */
    public final B2.i f5867a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5868b;

    /* renamed from: c, reason: collision with root package name */
    public final C0540i f5869c;

    /* renamed from: d, reason: collision with root package name */
    public final C0037f0 f5870d;

    /* renamed from: e, reason: collision with root package name */
    public final C0037f0 f5871e;

    /* renamed from: f, reason: collision with root package name */
    public final y f5872f;

    /* renamed from: g, reason: collision with root package name */
    public final n f5873g;
    public final n h;

    /* renamed from: i, reason: collision with root package name */
    public final n f5874i;

    /* renamed from: j, reason: collision with root package name */
    public final n f5875j;

    public C0535d(Comparable comparable, B2.i iVar, Float f3, int i3) {
        f3 = (i3 & 4) != 0 ? null : f3;
        this.f5867a = iVar;
        C0540i c0540i = new C0540i(iVar, comparable, null, Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f5869c = c0540i;
        this.f5870d = C0032d.A(Boolean.FALSE);
        this.f5871e = C0032d.A(comparable);
        this.f5872f = new y();
        new C0522A(f3);
        n nVar = c0540i.f5893f;
        boolean z3 = nVar instanceof C0541j;
        n nVar2 = z3 ? AbstractC0536e.f5880e : nVar instanceof C0542k ? AbstractC0536e.f5881f : nVar instanceof C0543l ? AbstractC0536e.f5882g : AbstractC0536e.h;
        this.f5873g = nVar2;
        n nVar3 = z3 ? AbstractC0536e.f5876a : nVar instanceof C0542k ? AbstractC0536e.f5877b : nVar instanceof C0543l ? AbstractC0536e.f5878c : AbstractC0536e.f5879d;
        this.h = nVar3;
        this.f5874i = nVar2;
        this.f5875j = nVar3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r9v3, types: [o2.c, p2.h] */
    public static final Object a(C0535d c0535d, Object obj) {
        n nVar = c0535d.f5873g;
        n nVar2 = c0535d.f5874i;
        boolean a3 = p2.g.a(nVar2, nVar);
        n nVar3 = c0535d.f5875j;
        if (a3 && p2.g.a(nVar3, c0535d.h)) {
            return obj;
        }
        B2.i iVar = c0535d.f5867a;
        n nVar4 = (n) ((p2.h) iVar.f316e).i(obj);
        int b3 = nVar4.b();
        boolean z3 = false;
        for (int i3 = 0; i3 < b3; i3++) {
            if (nVar4.a(i3) < nVar2.a(i3) || nVar4.a(i3) > nVar3.a(i3)) {
                float a4 = nVar4.a(i3);
                float a5 = nVar2.a(i3);
                float a6 = nVar3.a(i3);
                if (a5 > a6) {
                    throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + a6 + " is less than minimum " + a5 + '.');
                }
                if (a4 < a5) {
                    a4 = a5;
                } else if (a4 > a6) {
                    a4 = a6;
                }
                nVar4.e(i3, a4);
                z3 = true;
            }
        }
        return z3 ? ((p2.h) iVar.f317f).i(nVar4) : obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o2.c, p2.h] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o2.c, p2.h] */
    public static Object b(C0535d c0535d, Comparable comparable, C0528G c0528g, i2.j jVar) {
        Object i3 = ((p2.h) c0535d.f5867a.f317f).i(c0535d.f5869c.f5893f);
        Object c3 = c0535d.c();
        B2.i iVar = c0535d.f5867a;
        C0533b c0533b = new C0533b(c0535d, i3, new C0527F(c0528g, iVar, c3, comparable, (n) ((p2.h) iVar.f316e).i(i3)), c0535d.f5869c.f5894g, null, null);
        y yVar = c0535d.f5872f;
        yVar.getClass();
        return AbstractC0688v.b(new x(1, yVar, c0533b, null), jVar);
    }

    public final Object c() {
        return this.f5869c.f5892e.getValue();
    }

    public final Object d(G0.e eVar, i2.j jVar) {
        C0534c c0534c = new C0534c(this, eVar, null);
        y yVar = this.f5872f;
        yVar.getClass();
        Object b3 = AbstractC0688v.b(new x(1, yVar, c0534c, null), jVar);
        return b3 == h2.a.f4407d ? b3 : C0174m.f3840a;
    }
}
