package z1;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d1.AbstractC0189K;
import d1.C0205b;
import java.util.ArrayList;
import java.util.Collections;
import n.AbstractC0394n;
import n.C0379F;
import n.C0393m;

/* renamed from: z1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724C {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6948a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f6949b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6950c;

    /* renamed from: d, reason: collision with root package name */
    public int f6951d;

    /* renamed from: e, reason: collision with root package name */
    public int f6952e;

    /* renamed from: f, reason: collision with root package name */
    public C0723B f6953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f6954g;

    public C0724C(RecyclerView recyclerView) {
        this.f6954g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f6948a = arrayList;
        this.f6949b = null;
        this.f6950c = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f6951d = 2;
        this.f6952e = 2;
    }

    public final void a(I i3, boolean z3) {
        RecyclerView.d(i3);
        RecyclerView recyclerView = this.f6954g;
        K k3 = recyclerView.f3540f0;
        if (k3 != null) {
            J j3 = k3.f6981e;
            i3.getClass();
            AbstractC0189K.j(null, j3 != null ? (C0205b) j3.f6979e.remove(null) : null);
        }
        if (z3 && recyclerView.f3533b0 != null) {
            B2.i iVar = recyclerView.h;
            C0393m c0393m = (C0393m) iVar.f317f;
            int g3 = c0393m.g() - 1;
            while (true) {
                if (g3 < 0) {
                    break;
                }
                if (i3 == c0393m.h(g3)) {
                    Object[] objArr = c0393m.f4997f;
                    Object obj = objArr[g3];
                    Object obj2 = AbstractC0394n.f4999a;
                    if (obj != obj2) {
                        objArr[g3] = obj2;
                        c0393m.f4995d = true;
                    }
                } else {
                    g3--;
                }
            }
            Q q3 = (Q) ((C0379F) iVar.f316e).remove(i3);
            if (q3 != null) {
                q3.f7006a = 0;
                Q.f7005b.c(q3);
            }
        }
        i3.f6977g = null;
        C0723B b3 = b();
        b3.getClass();
        ArrayList arrayList = b3.a(0).f6943a;
        if (((C0722A) b3.f6946a.get(0)).f6944b <= arrayList.size()) {
            return;
        }
        i3.m();
        arrayList.add(i3);
    }

    public final C0723B b() {
        if (this.f6953f == null) {
            C0723B c0723b = new C0723B();
            c0723b.f6946a = new SparseArray();
            c0723b.f6947b = 0;
            this.f6953f = c0723b;
        }
        return this.f6953f;
    }

    public final void c() {
        ArrayList arrayList = this.f6950c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f3506m0;
        S1.m mVar = this.f6954g.f3532a0;
        mVar.getClass();
        mVar.f2322c = 0;
    }

    public final void d(int i3) {
        ArrayList arrayList = this.f6950c;
        a((I) arrayList.get(i3), true);
        arrayList.remove(i3);
    }

    public final void e(View view) {
        I r3 = RecyclerView.r(view);
        boolean k3 = r3.k();
        RecyclerView recyclerView = this.f6954g;
        if (k3) {
            recyclerView.removeDetachedView(view, false);
        }
        if (r3.j()) {
            r3.f6973c.h(r3);
        } else if (r3.p()) {
            r3.f6972b &= -33;
        }
        f(r3);
        if (recyclerView.f3516H == null || r3.h()) {
            return;
        }
        recyclerView.f3516H.b(r3);
    }

    public final void f(I i3) {
        if (!i3.j()) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(i3.j());
        sb.append(" isAttached:");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z1.I g(long r10, int r12) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C0724C.g(long, int):z1.I");
    }

    public final void h(I i3) {
        if (i3.f6974d) {
            this.f6949b.remove(i3);
        } else {
            this.f6948a.remove(i3);
        }
        i3.f6973c = null;
        i3.f6974d = false;
        i3.f6972b &= -33;
    }

    public final void i() {
        w wVar = this.f6954g.f3548l;
        this.f6952e = this.f6951d + 0;
        ArrayList arrayList = this.f6950c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f6952e; size--) {
            d(size);
        }
    }
}
