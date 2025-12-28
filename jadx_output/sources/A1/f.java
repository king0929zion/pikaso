package A1;

import U.p;
import U.q;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import b.C0133c;
import b.j;
import java.util.ArrayList;
import m.C0368f;
import n.AbstractC0377D;
import n.C0405y;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f215a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f216b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f217c;

    public f(g gVar) {
        this.f216b = gVar;
        e eVar = new e();
        eVar.f213c = new C0368f();
        this.f217c = eVar;
    }

    public static final void a(f fVar) {
        ((C0405y) fVar.f216b).a();
        int i3 = 0;
        fVar.f215a = false;
        F.d dVar = (F.d) fVar.f217c;
        int i4 = dVar.f1160f;
        if (i4 > 0) {
            Object[] objArr = dVar.f1158d;
            do {
                ((o2.a) objArr[i3]).c();
                i3++;
            } while (i3 < i4);
        }
        dVar.g();
    }

    public static final void b(f fVar) {
        C0405y c0405y = (C0405y) fVar.f216b;
        Object[] objArr = c0405y.f5053b;
        long[] jArr = c0405y.f5052a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            q qVar = (q) objArr[(i3 << 3) + i5];
                            qVar.getClass();
                            p pVar = (p) ((C0405y) U.c.E(qVar).f216b).e(qVar);
                            if (pVar == null) {
                                Z0.d.T("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                            qVar.f2367s = pVar;
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        c0405y.a();
        fVar.f215a = false;
        ((F.d) fVar.f217c).g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.r, java.lang.Object] */
    public void c() {
        ?? r02 = this.f216b;
        t c3 = r02.c();
        if (c3.f3484c != m.f3475e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        c3.a(new a(0, r02));
        final e eVar = (e) this.f217c;
        eVar.getClass();
        if (eVar.f211a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        c3.a(new androidx.lifecycle.p() { // from class: A1.b
            @Override // androidx.lifecycle.p
            public final void b(r rVar, l lVar) {
                p2.g.e(e.this, "this$0");
            }
        });
        eVar.f211a = true;
        this.f215a = true;
    }

    public f() {
        long[] jArr = AbstractC0377D.f4966a;
        this.f216b = new C0405y();
        this.f217c = new F.d(new o2.a[16]);
    }

    public f(j jVar, C0133c c0133c) {
        this.f216b = new Object();
        this.f217c = new ArrayList();
    }
}
