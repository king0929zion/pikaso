package I;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import p2.r;

/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: g, reason: collision with root package name */
    public final L.d f1366g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1367i;

    /* renamed from: j, reason: collision with root package name */
    public int f1368j;

    public e(L.d dVar, o[] oVarArr) {
        super(dVar.f1448e, oVarArr);
        this.f1366g = dVar;
        this.f1368j = dVar.f1450g;
    }

    public final void c(int i3, n nVar, Object obj, int i4) {
        int i5 = i4 * 5;
        o[] oVarArr = this.f1363d;
        if (i5 <= 30) {
            int H2 = 1 << r2.a.H(i3, i5);
            if (nVar.h(H2)) {
                oVarArr[i4].a(nVar.f1384d, Integer.bitCount(nVar.f1381a) * 2, nVar.f(H2));
                this.f1364e = i4;
                return;
            } else {
                int t3 = nVar.t(H2);
                n s3 = nVar.s(t3);
                oVarArr[i4].a(nVar.f1384d, Integer.bitCount(nVar.f1381a) * 2, t3);
                c(i3, s3, obj, i4 + 1);
                return;
            }
        }
        o oVar = oVarArr[i4];
        Object[] objArr = nVar.f1384d;
        oVar.a(objArr, objArr.length, 0);
        while (true) {
            o oVar2 = oVarArr[i4];
            if (p2.g.a(oVar2.f1385d[oVar2.f1387f], obj)) {
                this.f1364e = i4;
                return;
            } else {
                oVarArr[i4].f1387f += 2;
            }
        }
    }

    @Override // I.d, java.util.Iterator
    public final Object next() {
        if (this.f1366g.f1450g != this.f1368j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f1365f) {
            throw new NoSuchElementException();
        }
        o oVar = this.f1363d[this.f1364e];
        this.h = oVar.f1385d[oVar.f1387f];
        this.f1367i = true;
        return super.next();
    }

    @Override // I.d, java.util.Iterator
    public final void remove() {
        if (!this.f1367i) {
            throw new IllegalStateException();
        }
        boolean z3 = this.f1365f;
        L.d dVar = this.f1366g;
        if (!z3) {
            r.b(dVar).remove(this.h);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            o oVar = this.f1363d[this.f1364e];
            Object obj = oVar.f1385d[oVar.f1387f];
            r.b(dVar).remove(this.h);
            c(obj != null ? obj.hashCode() : 0, dVar.f1448e, obj, 0);
        }
        this.h = null;
        this.f1367i = false;
        this.f1368j = dVar.f1450g;
    }
}
