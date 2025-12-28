package D;

import android.os.Trace;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import d2.AbstractC0241l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n.C0374A;
import n.C0375B;
import n.C0397q;
import n.C0403w;
import n0.AbstractC0409C;
import n0.C0421b;
import n0.C0435p;
import n0.C0439u;
import n0.C0444z;
import n0.InterfaceC0437s;
import q.C0553F;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f852a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f853b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f854c;

    /* renamed from: d, reason: collision with root package name */
    public Object f855d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f856e;

    /* renamed from: f, reason: collision with root package name */
    public Object f857f;

    /* renamed from: g, reason: collision with root package name */
    public Object f858g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f859i;

    public C0059s(C0444z c0444z) {
        this.f852a = 1;
        this.f853b = c0444z;
        C0435p c0435p = new C0435p(c0444z);
        this.f854c = c0435p;
        this.f855d = c0435p;
        n0.m0 m0Var = c0435p.f5275K;
        this.f856e = m0Var;
        this.f857f = m0Var;
    }

    public static final void a(C0059s c0059s, P.k kVar, n0.Y y3) {
        c0059s.getClass();
        for (P.k kVar2 = kVar.h; kVar2 != null; kVar2 = kVar2.h) {
            if (kVar2 == n0.U.f5191a) {
                C0444z k3 = ((C0444z) c0059s.f853b).k();
                y3.f5219p = k3 != null ? (C0435p) k3.f5319x.f854c : null;
                c0059s.f855d = y3;
                return;
            } else {
                if ((kVar2.f2090f & 2) != 0) {
                    return;
                }
                kVar2.e0(y3);
            }
        }
    }

    public static P.k b(P.j jVar, P.k kVar) {
        P.k kVar2;
        if (jVar instanceof n0.P) {
            kVar2 = ((n0.P) jVar).d();
            kVar2.f2090f = n0.Z.f(kVar2);
        } else {
            C0421b c0421b = new C0421b();
            C0403w c0403w = n0.Z.f5230a;
            int i3 = jVar instanceof C0553F ? 5 : 1;
            if (jVar instanceof AppendedSemanticsElement) {
                i3 |= 8;
            }
            c0421b.f2090f = i3;
            c0421b.f5231q = jVar;
            new HashSet();
            kVar2 = c0421b;
        }
        if (kVar2.f2099p) {
            Z0.d.S("A ModifierNodeElement cannot return an already attached node from create() ");
            throw null;
        }
        kVar2.f2095l = true;
        P.k kVar3 = kVar.f2092i;
        if (kVar3 != null) {
            kVar3.h = kVar2;
            kVar2.f2092i = kVar3;
        }
        kVar.f2092i = kVar2;
        kVar2.h = kVar;
        return kVar2;
    }

    public static P.k c(P.k kVar) {
        boolean z3 = kVar.f2099p;
        if (z3) {
            C0403w c0403w = n0.Z.f5230a;
            if (!z3) {
                Z0.d.S("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
            n0.Z.b(kVar, -1, 2);
            kVar.c0();
            kVar.X();
        }
        P.k kVar2 = kVar.f2092i;
        P.k kVar3 = kVar.h;
        if (kVar2 != null) {
            kVar2.h = kVar3;
            kVar.f2092i = null;
        }
        if (kVar3 != null) {
            kVar3.f2092i = kVar2;
            kVar.h = null;
        }
        p2.g.b(kVar3);
        return kVar3;
    }

    public static void k(P.j jVar, P.j jVar2, P.k kVar) {
        if ((jVar instanceof n0.P) && (jVar2 instanceof n0.P)) {
            n0.T t3 = n0.U.f5191a;
            p2.g.c(kVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((n0.P) jVar2).e(kVar);
            if (kVar.f2099p) {
                n0.Z.d(kVar);
                return;
            } else {
                kVar.f2096m = true;
                return;
            }
        }
        if (!(kVar instanceof C0421b)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        C0421b c0421b = (C0421b) kVar;
        if (c0421b.f2099p) {
            c0421b.g0();
        }
        c0421b.f5231q = jVar2;
        C0403w c0403w = n0.Z.f5230a;
        int i3 = jVar2 instanceof C0553F ? 5 : 1;
        if (jVar2 instanceof AppendedSemanticsElement) {
            i3 |= 8;
        }
        c0421b.f2090f = i3;
        if (c0421b.f2099p) {
            c0421b.f0(false);
        }
        if (kVar.f2099p) {
            n0.Z.d(kVar);
        } else {
            kVar.f2096m = true;
        }
    }

    public void d() {
        C0374A c0374a = (C0374A) this.f853b;
        if (c0374a.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c0374a.iterator();
            while (((w2.g) ((J.c) it).f1409f).hasNext()) {
                w0 w0Var = (w0) ((w2.g) ((J.c) it).f1409f).next();
                ((J.c) it).remove();
                w0Var.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void e() {
        g(Integer.MIN_VALUE);
        ArrayList arrayList = (ArrayList) this.f855d;
        boolean isEmpty = arrayList.isEmpty();
        C0374A c0374a = (C0374A) this.f853b;
        if (!isEmpty) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C0375B c0375b = (C0375B) this.f858g;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    Object obj = arrayList.get(size);
                    if (obj instanceof w0) {
                        c0374a.remove(obj);
                        ((w0) obj).a();
                    }
                    if (obj instanceof C0444z) {
                        if (c0375b == null || !c0375b.c(obj)) {
                            ((C0444z) obj).z();
                        } else {
                            C0059s c0059s = ((C0444z) obj).f5319x;
                            n0.Y y3 = ((C0435p) c0059s.f854c).f5218o;
                            for (n0.Y y4 = (n0.Y) c0059s.f855d; !p2.g.a(y4, y3) && y4 != null; y4 = y4.f5218o) {
                                y4.f5220q = true;
                                y4.f5214D.c();
                                if (y4.f5216F != null) {
                                    y4.J0(null, false);
                                    y4.f5217n.E(false);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f854c;
        if (arrayList2.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:onRemembered");
        try {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                w0 w0Var = (w0) arrayList2.get(i3);
                c0374a.remove(w0Var);
                w0Var.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public boolean f(int i3) {
        return (i3 & ((P.k) this.f857f).f2091g) != 0;
    }

    public void g(int i3) {
        ArrayList arrayList = (ArrayList) this.f857f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i4 = 0;
        ArrayList arrayList2 = null;
        int i5 = 0;
        C0397q c0397q = null;
        C0397q c0397q2 = null;
        while (true) {
            C0397q c0397q3 = (C0397q) this.f859i;
            if (i5 >= c0397q3.f5015b) {
                break;
            }
            if (i3 <= c0397q3.b(i5)) {
                Object remove = arrayList.remove(i5);
                int c3 = c0397q3.c(i5);
                int c4 = ((C0397q) this.h).c(i5);
                if (arrayList2 == null) {
                    arrayList2 = AbstractC0241l.V(remove);
                    c0397q2 = new C0397q();
                    c0397q2.a(c3);
                    c0397q = new C0397q();
                    c0397q.a(c4);
                } else {
                    p2.g.c(c0397q, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    p2.g.c(c0397q2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayList2.add(remove);
                    c0397q2.a(c3);
                    c0397q.a(c4);
                }
            } else {
                i5++;
            }
        }
        if (arrayList2 != null) {
            p2.g.c(c0397q, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            p2.g.c(c0397q2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayList2.size() - 1;
            while (i4 < size) {
                int i6 = i4 + 1;
                int size2 = arrayList2.size();
                for (int i7 = i6; i7 < size2; i7++) {
                    int b3 = c0397q2.b(i4);
                    int b4 = c0397q2.b(i7);
                    if (b3 < b4 || (b4 == b3 && c0397q.b(i4) < c0397q.b(i7))) {
                        Object obj = arrayList2.get(i4);
                        arrayList2.set(i4, arrayList2.get(i7));
                        arrayList2.set(i7, obj);
                        int b5 = c0397q.b(i4);
                        c0397q.d(i4, c0397q.b(i7));
                        c0397q.d(i7, b5);
                        int b6 = c0397q2.b(i4);
                        c0397q2.d(i4, c0397q2.b(i7));
                        c0397q2.d(i7, b6);
                    }
                }
                i4 = i6;
            }
            ((ArrayList) this.f855d).addAll(arrayList2);
        }
    }

    public void h(Object obj, int i3, int i4, int i5) {
        g(i3);
        if (i5 < 0 || i5 >= i3) {
            ((ArrayList) this.f855d).add(obj);
            return;
        }
        ((ArrayList) this.f857f).add(obj);
        ((C0397q) this.h).a(i4);
        ((C0397q) this.f859i).a(i5);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:D.s A[IMMUTABLE_TYPE, THIS]) D.s.i java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void i(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v13 ??, still in use, count: 1, list:
          (r11v13 ?? I:java.lang.Object) from 0x0020: IPUT (r11v13 ?? I:java.lang.Object), (r29v0 'this' ?? I:D.s A[IMMUTABLE_TYPE, THIS]) D.s.i java.lang.Object
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public void j() {
        C0444z c0444z;
        C0439u c0439u;
        P.k kVar = ((n0.m0) this.f856e).h;
        n0.Y y3 = (C0435p) this.f854c;
        P.k kVar2 = kVar;
        while (true) {
            c0444z = (C0444z) this.f853b;
            if (kVar2 == null) {
                break;
            }
            InterfaceC0437s f3 = AbstractC0409C.f(kVar2);
            if (f3 != null) {
                n0.Y y4 = kVar2.f2094k;
                if (y4 != null) {
                    C0439u c0439u2 = (C0439u) y4;
                    InterfaceC0437s interfaceC0437s = c0439u2.f5287K;
                    c0439u2.M0(f3);
                    c0439u = c0439u2;
                    if (interfaceC0437s != kVar2) {
                        n0.d0 d0Var = c0439u2.f5216F;
                        c0439u = c0439u2;
                        if (d0Var != null) {
                            d0Var.invalidate();
                            c0439u = c0439u2;
                        }
                    }
                } else {
                    C0439u c0439u3 = new C0439u(c0444z, f3);
                    kVar2.e0(c0439u3);
                    c0439u = c0439u3;
                }
                y3.f5219p = c0439u;
                c0439u.f5218o = y3;
                y3 = c0439u;
            } else {
                kVar2.e0(y3);
            }
            kVar2 = kVar2.h;
        }
        C0444z k3 = c0444z.k();
        y3.f5219p = k3 != null ? (C0435p) k3.f5319x.f854c : null;
        this.f855d = y3;
    }

    public String toString() {
        switch (this.f852a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                P.k kVar = (P.k) this.f857f;
                n0.m0 m0Var = (n0.m0) this.f856e;
                if (kVar == m0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (kVar != null && kVar != m0Var) {
                            sb.append(String.valueOf(kVar));
                            if (kVar.f2092i == m0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                kVar = kVar.f2092i;
                            }
                        }
                    }
                }
                String sb2 = sb.toString();
                p2.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0059s(C0374A c0374a) {
        this.f852a = 0;
        this.f853b = c0374a;
        this.f854c = new ArrayList();
        this.f855d = new ArrayList();
        this.f856e = new ArrayList();
        this.f857f = new ArrayList();
        this.h = new C0397q();
        this.f859i = new C0397q();
    }
}
