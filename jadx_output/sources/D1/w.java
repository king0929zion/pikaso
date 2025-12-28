package D1;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k.H;
import n.C0379F;
import n.C0386f;
import n.C0393m;
import p.InterfaceC0531J;
import p1.C0545a;
import p1.C0546b;

/* loaded from: classes.dex */
public final class w implements InterfaceC0531J {

    /* renamed from: a, reason: collision with root package name */
    public Object f1031a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1032b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1033c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1034d;

    public w(int i3) {
        switch (i3) {
            case 2:
                this.f1031a = new L0.f(10);
                this.f1032b = new C0379F(0);
                this.f1033c = new ArrayList();
                this.f1034d = new HashSet();
                break;
            default:
                this.f1031a = new C0386f(0);
                this.f1033c = new SparseArray();
                this.f1034d = new C0393m((Object) null);
                this.f1032b = new C0386f(0);
                break;
        }
    }

    @Override // p.InterfaceC0531J
    public p.n a(p.n nVar, p.n nVar2, p.n nVar3) {
        if (((p.n) this.f1034d) == null) {
            this.f1034d = nVar3.c();
        }
        p.n nVar4 = (p.n) this.f1034d;
        if (nVar4 == null) {
            p2.g.h("endVelocityVector");
            throw null;
        }
        int b3 = nVar4.b();
        for (int i3 = 0; i3 < b3; i3++) {
            p.n nVar5 = (p.n) this.f1034d;
            if (nVar5 == null) {
                p2.g.h("endVelocityVector");
                throw null;
            }
            nVar5.e(i3, ((p.o) this.f1031a).get(i3).e(nVar.a(i3), nVar2.a(i3), nVar3.a(i3)));
        }
        p.n nVar6 = (p.n) this.f1034d;
        if (nVar6 != null) {
            return nVar6;
        }
        p2.g.h("endVelocityVector");
        throw null;
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0379F) this.f1032b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                b(arrayList2.get(i3), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // p.InterfaceC0531J
    public long c(p.n nVar, p.n nVar2, p.n nVar3) {
        Iterator it = Z.b.R(0, nVar.b()).iterator();
        long j3 = 0;
        while (((u2.c) it).f6305f) {
            int a3 = ((u2.c) it).a();
            j3 = Math.max(j3, ((p.o) this.f1031a).get(a3).d(nVar.a(a3), nVar2.a(a3), nVar3.a(a3)));
        }
        return j3;
    }

    @Override // p.InterfaceC0531J
    public p.n e(long j3, p.n nVar, p.n nVar2, p.n nVar3) {
        if (((p.n) this.f1033c) == null) {
            this.f1033c = nVar3.c();
        }
        p.n nVar4 = (p.n) this.f1033c;
        if (nVar4 == null) {
            p2.g.h("velocityVector");
            throw null;
        }
        int b3 = nVar4.b();
        for (int i3 = 0; i3 < b3; i3++) {
            p.n nVar5 = (p.n) this.f1033c;
            if (nVar5 == null) {
                p2.g.h("velocityVector");
                throw null;
            }
            nVar5.e(i3, ((p.o) this.f1031a).get(i3).c(j3, nVar.a(i3), nVar2.a(i3), nVar3.a(i3)));
        }
        p.n nVar6 = (p.n) this.f1033c;
        if (nVar6 != null) {
            return nVar6;
        }
        p2.g.h("velocityVector");
        throw null;
    }

    @Override // p.InterfaceC0531J
    public p.n f(long j3, p.n nVar, p.n nVar2, p.n nVar3) {
        if (((p.n) this.f1032b) == null) {
            this.f1032b = nVar.c();
        }
        p.n nVar4 = (p.n) this.f1032b;
        if (nVar4 == null) {
            p2.g.h("valueVector");
            throw null;
        }
        int b3 = nVar4.b();
        for (int i3 = 0; i3 < b3; i3++) {
            p.n nVar5 = (p.n) this.f1032b;
            if (nVar5 == null) {
                p2.g.h("valueVector");
                throw null;
            }
            nVar5.e(i3, ((p.o) this.f1031a).get(i3).b(j3, nVar.a(i3), nVar2.a(i3), nVar3.a(i3)));
        }
        p.n nVar6 = (p.n) this.f1032b;
        if (nVar6 != null) {
            return nVar6;
        }
        p2.g.h("valueVector");
        throw null;
    }

    public w(Typeface typeface, C0546b c0546b) {
        int i3;
        int i4;
        this.f1034d = typeface;
        this.f1031a = c0546b;
        this.f1033c = new o1.s(1024);
        int a3 = c0546b.a(6);
        if (a3 != 0) {
            int i5 = a3 + c0546b.f5939a;
            i3 = c0546b.f5940b.getInt(c0546b.f5940b.getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        this.f1032b = new char[i3 * 2];
        int a4 = c0546b.a(6);
        if (a4 != 0) {
            int i6 = a4 + c0546b.f5939a;
            i4 = c0546b.f5940b.getInt(c0546b.f5940b.getInt(i6) + i6);
        } else {
            i4 = 0;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            o1.v vVar = new o1.v(this, i7);
            C0545a c3 = vVar.c();
            int a5 = c3.a(4);
            Character.toChars(a5 != 0 ? c3.f5940b.getInt(a5 + c3.f5939a) : 0, (char[]) this.f1032b, i7 * 2);
            Z.b.e(vVar.b() > 0, "invalid metadata codepoint length");
            ((o1.s) this.f1033c).a(vVar, 0, vVar.b() - 1);
        }
    }

    public w(p.o oVar) {
        this.f1031a = oVar;
    }

    public w(p.t tVar) {
        this(new H(3, tVar));
    }
}
