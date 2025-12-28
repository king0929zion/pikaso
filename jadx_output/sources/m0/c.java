package M0;

import A.AbstractC0000a;
import java.util.HashSet;
import java.util.Iterator;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final d f1544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1545c;

    /* renamed from: d, reason: collision with root package name */
    public c f1546d;

    /* renamed from: g, reason: collision with root package name */
    public L0.j f1549g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f1543a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1547e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f1548f = -1;

    public c(d dVar, int i3) {
        this.f1544b = dVar;
        this.f1545c = i3;
    }

    public final void a(c cVar, int i3) {
        b(cVar, i3, -1, false);
    }

    public final boolean b(c cVar, int i3, int i4, boolean z3) {
        if (cVar == null) {
            h();
            return true;
        }
        if (!z3 && !g(cVar)) {
            return false;
        }
        this.f1546d = cVar;
        if (cVar.f1543a == null) {
            cVar.f1543a = new HashSet();
        }
        this.f1546d.f1543a.add(this);
        if (i3 > 0) {
            this.f1547e = i3;
        } else {
            this.f1547e = 0;
        }
        this.f1548f = i4;
        return true;
    }

    public final int c() {
        c cVar;
        if (this.f1544b.f1571V == 8) {
            return 0;
        }
        int i3 = this.f1548f;
        return (i3 <= -1 || (cVar = this.f1546d) == null || cVar.f1544b.f1571V != 8) ? this.f1547e : i3;
    }

    public final c d() {
        int i3 = this.f1545c;
        int b3 = AbstractC0537f.b(i3);
        d dVar = this.f1544b;
        switch (b3) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.f1603z;
            case 2:
                return dVar.f1550A;
            case 3:
                return dVar.f1601x;
            case 4:
                return dVar.f1602y;
            default:
                throw new AssertionError(AbstractC0000a.m(i3));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f1543a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f1546d != null;
    }

    public final boolean g(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i3 = this.f1545c;
        d dVar = cVar.f1544b;
        int i4 = cVar.f1545c;
        if (i4 == i3) {
            return i3 != 6 || (dVar.f1600w && this.f1544b.f1600w);
        }
        switch (AbstractC0537f.b(i3)) {
            case 0:
            case 5:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z3 = i4 == 2 || i4 == 4;
                if (dVar instanceof h) {
                    return z3 || i4 == 8;
                }
                return z3;
            case 2:
            case 4:
                boolean z4 = i4 == 3 || i4 == 5;
                if (dVar instanceof h) {
                    return z4 || i4 == 9;
                }
                return z4;
            case 6:
                return (i4 == 6 || i4 == 8 || i4 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC0000a.m(i3));
        }
    }

    public final void h() {
        HashSet hashSet;
        c cVar = this.f1546d;
        if (cVar != null && (hashSet = cVar.f1543a) != null) {
            hashSet.remove(this);
        }
        this.f1546d = null;
        this.f1547e = 0;
        this.f1548f = -1;
    }

    public final void i() {
        L0.j jVar = this.f1549g;
        if (jVar == null) {
            this.f1549g = new L0.j(1);
        } else {
            jVar.c();
        }
    }

    public final String toString() {
        return this.f1544b.f1572W + ":" + AbstractC0000a.m(this.f1545c);
    }
}
