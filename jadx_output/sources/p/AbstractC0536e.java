package p;

import D.C0031c0;
import D.C0032d;
import D.E0;
import g2.InterfaceC0276i;
import o0.C0499p0;

/* renamed from: p.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0536e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0541j f5876a = new C0541j(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C0542k f5877b = new C0542k(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C0543l f5878c = new C0543l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final C0544m f5879d = new C0544m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C0541j f5880e = new C0541j(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final C0542k f5881f = new C0542k(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final C0543l f5882g = new C0543l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C0544m h = new C0544m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C0535d a() {
        return new C0535d(Float.valueOf(0.0f), AbstractC0530I.f5854a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3 A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003a, blocks: (B:13:0x0036, B:16:0x00ce, B:18:0x00e3), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v12, types: [o2.c] */
    /* JADX WARN: Type inference failed for: r0v8, types: [o2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(p.C0540i r23, p.C0527F r24, long r25, p.C0532a r27, i2.c r28) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.AbstractC0536e.b(p.i, p.F, long, p.a, i2.c):java.lang.Object");
    }

    public static final Object c(C0527F c0527f, o2.c cVar, C0523B c0523b) {
        c0527f.f5839a.j();
        N.n nVar = new N.n(1, cVar);
        InterfaceC0276i interfaceC0276i = c0523b.f4461e;
        p2.g.b(interfaceC0276i);
        return C0032d.x(interfaceC0276i).u(nVar, c0523b);
    }

    public static final n d(n nVar) {
        n c3 = nVar.c();
        int b3 = c3.b();
        for (int i3 = 0; i3 < b3; i3++) {
            c3.e(i3, nVar.a(i3));
        }
        return c3;
    }

    public static final void e(C0538g c0538g, long j3, float f3, C0527F c0527f, C0540i c0540i, o2.c cVar) {
        long a3 = f3 == 0.0f ? c0527f.a() : (long) ((j3 - c0538g.f5884a) / f3);
        c0538g.f5888e = j3;
        c0538g.f5886c.setValue(c0527f.b(a3));
        c0538g.f5887d = c0527f.c(a3);
        if (a3 >= c0527f.a()) {
            c0538g.f5889f = c0538g.f5888e;
            c0538g.f5890g.setValue(Boolean.FALSE);
        }
        h(c0538g, c0540i);
        cVar.i(c0538g);
    }

    public static final float f(InterfaceC0276i interfaceC0276i) {
        float f3;
        C0499p0 c0499p0 = (C0499p0) interfaceC0276i.n(P.a.f2077q);
        if (c0499p0 != null) {
            C0031c0 c0031c0 = c0499p0.f5638d;
            f3 = ((E0) N.o.t(c0031c0.f740e, c0031c0)).f689c;
        } else {
            f3 = 1.0f;
        }
        if (f3 >= 0.0f) {
            return f3;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static C0528G g(int i3, r rVar) {
        return new C0528G(i3, 0, rVar);
    }

    public static final void h(C0538g c0538g, C0540i c0540i) {
        c0540i.f5892e.setValue(c0538g.f5886c.getValue());
        n nVar = c0540i.f5893f;
        n nVar2 = c0538g.f5887d;
        int b3 = nVar.b();
        for (int i3 = 0; i3 < b3; i3++) {
            nVar.e(i3, nVar2.a(i3));
        }
        c0540i.h = c0538g.f5889f;
        c0540i.f5894g = c0538g.f5888e;
        c0540i.f5895i = ((Boolean) c0538g.f5890g.getValue()).booleanValue();
    }
}
