package D1;

import a.AbstractC0090a;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: D1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067a extends o {

    /* renamed from: A, reason: collision with root package name */
    public boolean f958A;

    /* renamed from: B, reason: collision with root package name */
    public int f959B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f960C;

    /* renamed from: D, reason: collision with root package name */
    public int f961D;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f962z;

    @Override // D1.o
    public final void A(X1.e eVar) {
        super.A(eVar);
        this.f961D |= 4;
        if (this.f962z != null) {
            for (int i3 = 0; i3 < this.f962z.size(); i3++) {
                ((o) this.f962z.get(i3)).A(eVar);
            }
        }
    }

    @Override // D1.o
    public final void B() {
        this.f961D |= 2;
        int size = this.f962z.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f962z.get(i3)).B();
        }
    }

    @Override // D1.o
    public final void C(long j3) {
        this.f1001e = j3;
    }

    @Override // D1.o
    public final String E(String str) {
        String E2 = super.E(str);
        for (int i3 = 0; i3 < this.f962z.size(); i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append(E2);
            sb.append("\n");
            sb.append(((o) this.f962z.get(i3)).E(str + "  "));
            E2 = sb.toString();
        }
        return E2;
    }

    public final void F(o oVar) {
        this.f962z.add(oVar);
        oVar.f1007l = this;
        long j3 = this.f1002f;
        if (j3 >= 0) {
            oVar.x(j3);
        }
        if ((this.f961D & 1) != 0) {
            oVar.z(this.f1003g);
        }
        if ((this.f961D & 2) != 0) {
            oVar.B();
        }
        if ((this.f961D & 4) != 0) {
            oVar.A(this.f1017v);
        }
        if ((this.f961D & 8) != 0) {
            oVar.y(null);
        }
    }

    @Override // D1.o
    public final void c(v vVar) {
        if (r(vVar.f1029b)) {
            Iterator it = this.f962z.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.r(vVar.f1029b)) {
                    oVar.c(vVar);
                    vVar.f1030c.add(oVar);
                }
            }
        }
    }

    @Override // D1.o
    public final void e(v vVar) {
        int size = this.f962z.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f962z.get(i3)).e(vVar);
        }
    }

    @Override // D1.o
    public final void f(v vVar) {
        if (r(vVar.f1029b)) {
            Iterator it = this.f962z.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                if (oVar.r(vVar.f1029b)) {
                    oVar.f(vVar);
                    vVar.f1030c.add(oVar);
                }
            }
        }
    }

    @Override // D1.o
    /* renamed from: i */
    public final o clone() {
        C0067a c0067a = (C0067a) super.clone();
        c0067a.f962z = new ArrayList();
        int size = this.f962z.size();
        for (int i3 = 0; i3 < size; i3++) {
            o clone = ((o) this.f962z.get(i3)).clone();
            c0067a.f962z.add(clone);
            clone.f1007l = c0067a;
        }
        return c0067a;
    }

    @Override // D1.o
    public final void k(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j3 = this.f1001e;
        int size = this.f962z.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = (o) this.f962z.get(i3);
            if (j3 > 0 && (this.f958A || i3 == 0)) {
                long j4 = oVar.f1001e;
                if (j4 > 0) {
                    oVar.C(j4 + j3);
                } else {
                    oVar.C(j3);
                }
            }
            oVar.k(viewGroup, wVar, wVar2, arrayList, arrayList2);
        }
    }

    @Override // D1.o
    public final void t(ViewGroup viewGroup) {
        super.t(viewGroup);
        int size = this.f962z.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f962z.get(i3)).t(viewGroup);
        }
    }

    @Override // D1.o
    public final void v(View view) {
        super.v(view);
        int size = this.f962z.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f962z.get(i3)).v(view);
        }
    }

    @Override // D1.o
    public final void w() {
        if (this.f962z.isEmpty()) {
            D();
            l();
            return;
        }
        h hVar = new h();
        hVar.f981b = this;
        Iterator it = this.f962z.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(hVar);
        }
        this.f959B = this.f962z.size();
        if (this.f958A) {
            Iterator it2 = this.f962z.iterator();
            while (it2.hasNext()) {
                ((o) it2.next()).w();
            }
            return;
        }
        for (int i3 = 1; i3 < this.f962z.size(); i3++) {
            ((o) this.f962z.get(i3 - 1)).a(new h(1, (o) this.f962z.get(i3)));
        }
        o oVar = (o) this.f962z.get(0);
        if (oVar != null) {
            oVar.w();
        }
    }

    @Override // D1.o
    public final void x(long j3) {
        ArrayList arrayList;
        this.f1002f = j3;
        if (j3 < 0 || (arrayList = this.f962z) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f962z.get(i3)).x(j3);
        }
    }

    @Override // D1.o
    public final void y(AbstractC0090a abstractC0090a) {
        this.f961D |= 8;
        int size = this.f962z.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) this.f962z.get(i3)).y(abstractC0090a);
        }
    }

    @Override // D1.o
    public final void z(TimeInterpolator timeInterpolator) {
        this.f961D |= 1;
        ArrayList arrayList = this.f962z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((o) this.f962z.get(i3)).z(timeInterpolator);
            }
        }
        this.f1003g = timeInterpolator;
    }
}
