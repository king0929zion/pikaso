package n0;

import D.C0065y;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import l0.AbstractC0353c;
import l0.C0356f;

/* renamed from: n0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407A {

    /* renamed from: a, reason: collision with root package name */
    public final l0.o f5069a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5071c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5072d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5073e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0420a f5074f;
    public final /* synthetic */ int h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5070b = true;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f5075g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C0407A(InterfaceC0420a interfaceC0420a, int i3) {
        this.h = i3;
        this.f5069a = (l0.o) interfaceC0420a;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [o2.e, p2.f] */
    /* JADX WARN: Type inference failed for: r8v5, types: [l0.o, n0.a] */
    public static final void a(C0407A c0407a, C0356f c0356f, int i3, Y y3) {
        c0407a.getClass();
        float f3 = i3;
        long f4 = r2.a.f(f3, f3);
        while (true) {
            switch (c0407a.h) {
                case 0:
                    W.F f5 = Y.f5207G;
                    f4 = y3.I0(f4, true);
                    break;
                default:
                    AbstractC0419M o02 = y3.o0();
                    p2.g.b(o02);
                    long j3 = o02.f5169o;
                    f4 = V.c.f(r2.a.f((int) (j3 >> 32), (int) (j3 & 4294967295L)), f4);
                    break;
            }
            y3 = y3.f5219p;
            p2.g.b(y3);
            if (y3.equals(c0407a.f5069a.A())) {
                int round = Math.round(c0356f instanceof C0356f ? V.c.c(f4) : V.c.b(f4));
                HashMap hashMap = c0407a.f5075g;
                if (hashMap.containsKey(c0356f)) {
                    p2.g.e(hashMap, "<this>");
                    Object obj = hashMap.get(c0356f);
                    if (obj == null && !hashMap.containsKey(c0356f)) {
                        throw new NoSuchElementException("Key " + c0356f + " is missing in the map.");
                    }
                    int intValue = ((Number) obj).intValue();
                    C0356f c0356f2 = AbstractC0353c.f4917a;
                    round = ((Number) c0356f.f4921a.h(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                }
                hashMap.put(c0356f, Integer.valueOf(round));
                return;
            }
            if (c0407a.b(y3).containsKey(c0356f)) {
                float c3 = c0407a.c(y3, c0356f);
                f4 = r2.a.f(c3, c3);
            }
        }
    }

    public final Map b(Y y3) {
        switch (this.h) {
            case 0:
                return y3.X().b();
            default:
                AbstractC0419M o02 = y3.o0();
                p2.g.b(o02);
                return o02.X().b();
        }
    }

    public final int c(Y y3, C0356f c0356f) {
        switch (this.h) {
            case 0:
                return y3.Q(c0356f);
            default:
                AbstractC0419M o02 = y3.o0();
                p2.g.b(o02);
                return o02.Q(c0356f);
        }
    }

    public final boolean d() {
        return this.f5071c || this.f5072d || this.f5073e;
    }

    public final boolean e() {
        h();
        return this.f5074f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l0.o, n0.a] */
    public final void f() {
        this.f5070b = true;
        ?? r02 = this.f5069a;
        InterfaceC0420a c3 = r02.c();
        if (c3 == null) {
            return;
        }
        if (this.f5071c) {
            c3.requestLayout();
        }
        if (this.f5072d) {
            r02.B();
        }
        if (this.f5073e) {
            r02.requestLayout();
        }
        c3.y().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l0.o, n0.a] */
    public final void g() {
        HashMap hashMap = this.f5075g;
        hashMap.clear();
        C0065y c0065y = new C0065y(14, this);
        ?? r22 = this.f5069a;
        r22.C(c0065y);
        hashMap.putAll(b(r22.A()));
        this.f5070b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [l0.o, n0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            l0.o r1 = r2.f5069a
            if (r0 == 0) goto L9
            goto L51
        L9:
            n0.a r0 = r1.c()
            if (r0 != 0) goto L10
            return
        L10:
            n0.A r0 = r0.y()
            n0.a r1 = r0.f5074f
            if (r1 == 0) goto L23
            n0.A r0 = r1.y()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            n0.a r0 = r2.f5074f
            if (r0 == 0) goto L53
            n0.A r1 = r0.y()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            n0.a r1 = r0.c()
            if (r1 == 0) goto L41
            n0.A r1 = r1.y()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            n0.a r0 = r0.c()
            if (r0 == 0) goto L50
            n0.A r0 = r0.y()
            if (r0 == 0) goto L50
            n0.a r1 = r0.f5074f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f5074f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0407A.h():void");
    }
}
