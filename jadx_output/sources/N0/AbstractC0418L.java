package n0;

import java.util.Map;
import l0.C0356f;
import l0.C0358h;
import l0.InterfaceC0357g;
import n.C0402v;

/* renamed from: n0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0418L extends l0.o implements Q, G0.b {

    /* renamed from: i, reason: collision with root package name */
    public boolean f5163i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5164j;

    /* renamed from: k, reason: collision with root package name */
    public final C0358h f5165k = new C0358h(0, this);

    /* renamed from: l, reason: collision with root package name */
    public C0402v f5166l;

    /* renamed from: m, reason: collision with root package name */
    public C0402v f5167m;

    public static void a0(Y y3) {
        C0407A c0407a;
        Y y4 = y3.f5218o;
        C0444z c0444z = y4 != null ? y4.f5217n : null;
        C0444z c0444z2 = y3.f5217n;
        if (!p2.g.a(c0444z, c0444z2)) {
            c0444z2.f5320y.f5146q.f5124v.f();
            return;
        }
        InterfaceC0420a c3 = c0444z2.f5320y.f5146q.c();
        if (c3 == null || (c0407a = ((C0413G) c3).f5124v) == null) {
            return;
        }
        c0407a.f();
    }

    public abstract int M(C0356f c0356f);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        r4 = r2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
    
        if (r2.f5043f != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
    
        if (((r2.f5038a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        r4 = r2.f5041d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011d, code lost:
    
        if (r4 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        if (java.lang.Long.compareUnsigned(r2.f5042e * 32, r4 * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0130, code lost:
    
        r2.e(n.AbstractC0377D.b(r2.f5041d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0143, code lost:
    
        r4 = r2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        r2.e(n.AbstractC0377D.b(r2.f5041d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0147, code lost:
    
        r2.f5042e++;
        r6 = r2.f5043f;
        r7 = r2.f5038a;
        r8 = r4 >> 3;
        r14 = r7[r8];
        r22 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0163, code lost:
    
        if (((r14 >> r22) & 255) != 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        r30 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
    
        r2.f5043f = r6 - r30;
        r7[r8] = ((~(255 << r22)) & r14) | (r0 << r22);
        r5 = r2.f5041d;
        r6 = ((r4 - 7) & r5) + (r5 & 7);
        r5 = r6 >> 3;
        r6 = (r6 & 7) << 3;
        r22 = r9;
        r7[r5] = (r0 << r6) | ((~(255 << r6)) & r7[r5]);
        r0 = ~r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(n0.i0 r38) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.AbstractC0418L.N(n0.i0):void");
    }

    public final int Q(C0356f c0356f) {
        int M2;
        if (V() && (M2 = M(c0356f)) != Integer.MIN_VALUE) {
            return M2 + ((int) (this.h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract AbstractC0418L R();

    public abstract InterfaceC0357g U();

    public abstract boolean V();

    public abstract C0444z W();

    public abstract M1.j X();

    public abstract AbstractC0418L Y();

    public abstract long Z();

    public M1.j b0(int i3, int i4, Map map, o2.c cVar) {
        return c0(i3, i4, map, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final M1.j c0(int i3, int i4, Map map, o2.c cVar) {
        if ((i3 & (-16777216)) == 0 && ((-16777216) & i4) == 0) {
            M1.j jVar = new M1.j();
            jVar.f1695a = i3;
            jVar.f1697c = i4;
            jVar.f1698d = map;
            jVar.f1699e = (p2.h) cVar;
            jVar.f1696b = this;
            return jVar;
        }
        Z0.d.S("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    public abstract void d0();

    public abstract G0.f getLayoutDirection();

    @Override // n0.Q
    public final void z() {
    }
}
