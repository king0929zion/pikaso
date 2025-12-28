package N0;

import A.AbstractC0000a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1808k;

    /* renamed from: l, reason: collision with root package name */
    public int f1809l;

    public c(M0.d dVar, int i3) {
        super(dVar);
        M0.d dVar2;
        this.f1808k = new ArrayList();
        this.f1839f = i3;
        M0.d dVar3 = this.f1835b;
        M0.d k3 = dVar3.k(i3);
        while (true) {
            M0.d dVar4 = k3;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                k3 = dVar3.k(this.f1839f);
            }
        }
        this.f1835b = dVar2;
        int i4 = this.f1839f;
        m mVar = i4 == 0 ? dVar2.f1582d : i4 == 1 ? dVar2.f1583e : null;
        ArrayList arrayList = this.f1808k;
        arrayList.add(mVar);
        M0.d j3 = dVar2.j(this.f1839f);
        while (j3 != null) {
            int i5 = this.f1839f;
            arrayList.add(i5 == 0 ? j3.f1582d : i5 == 1 ? j3.f1583e : null);
            j3 = j3.j(this.f1839f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar2 = (m) it.next();
            int i6 = this.f1839f;
            if (i6 == 0) {
                mVar2.f1835b.f1578b = this;
            } else if (i6 == 1) {
                mVar2.f1835b.f1580c = this;
            }
        }
        if (this.f1839f == 0 && ((M0.e) this.f1835b.f1558I).f1608h0 && arrayList.size() > 1) {
            this.f1835b = ((m) arrayList.get(arrayList.size() - 1)).f1835b;
        }
        this.f1809l = this.f1839f == 0 ? this.f1835b.f1573X : this.f1835b.f1574Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a0, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c5, code lost:
    
        r1.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c2, code lost:
    
        r13 = r13 + 1;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c0, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03c8, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    @Override // N0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(N0.d r27) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.c.a(N0.d):void");
    }

    @Override // N0.m
    public final void d() {
        ArrayList arrayList = this.f1808k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        M0.d dVar = ((m) arrayList.get(0)).f1835b;
        M0.d dVar2 = ((m) arrayList.get(size - 1)).f1835b;
        int i3 = this.f1839f;
        f fVar = this.f1841i;
        f fVar2 = this.h;
        if (i3 == 0) {
            M0.c cVar = dVar.f1601x;
            M0.c cVar2 = dVar2.f1603z;
            f i4 = m.i(cVar, 0);
            int c3 = cVar.c();
            M0.d m2 = m();
            if (m2 != null) {
                c3 = m2.f1601x.c();
            }
            if (i4 != null) {
                m.b(fVar2, i4, c3);
            }
            f i5 = m.i(cVar2, 0);
            int c4 = cVar2.c();
            M0.d n2 = n();
            if (n2 != null) {
                c4 = n2.f1603z.c();
            }
            if (i5 != null) {
                m.b(fVar, i5, -c4);
            }
        } else {
            M0.c cVar3 = dVar.f1602y;
            M0.c cVar4 = dVar2.f1550A;
            f i6 = m.i(cVar3, 1);
            int c5 = cVar3.c();
            M0.d m3 = m();
            if (m3 != null) {
                c5 = m3.f1602y.c();
            }
            if (i6 != null) {
                m.b(fVar2, i6, c5);
            }
            f i7 = m.i(cVar4, 1);
            int c6 = cVar4.c();
            M0.d n3 = n();
            if (n3 != null) {
                c6 = n3.f1550A.c();
            }
            if (i7 != null) {
                m.b(fVar, i7, -c6);
            }
        }
        fVar2.f1817a = this;
        fVar.f1817a = this;
    }

    @Override // N0.m
    public final void e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1808k;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i3)).e();
            i3++;
        }
    }

    @Override // N0.m
    public final void f() {
        this.f1836c = null;
        Iterator it = this.f1808k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // N0.m
    public final long j() {
        ArrayList arrayList = this.f1808k;
        int size = arrayList.size();
        long j3 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j3 = r5.f1841i.f1822f + ((m) arrayList.get(i3)).j() + j3 + r5.h.f1822f;
        }
        return j3;
    }

    @Override // N0.m
    public final boolean k() {
        ArrayList arrayList = this.f1808k;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!((m) arrayList.get(i3)).k()) {
                return false;
            }
        }
        return true;
    }

    public final M0.d m() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1808k;
            if (i3 >= arrayList.size()) {
                return null;
            }
            M0.d dVar = ((m) arrayList.get(i3)).f1835b;
            if (dVar.f1571V != 8) {
                return dVar;
            }
            i3++;
        }
    }

    public final M0.d n() {
        ArrayList arrayList = this.f1808k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            M0.d dVar = ((m) arrayList.get(size)).f1835b;
            if (dVar.f1571V != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String concat = "ChainRun ".concat(this.f1839f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f1808k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            concat = AbstractC0000a.e(AbstractC0000a.e(concat, "<") + mVar, "> ");
        }
        return concat;
    }
}
