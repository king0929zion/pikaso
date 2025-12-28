package A;

import B2.InterfaceC0021e;
import D.C0032d;
import D.C0037f0;
import D.L0;
import a.AbstractC0090a;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d1.AbstractC0189K;
import d1.C0209f;
import d1.InterfaceC0206c;
import d1.InterfaceC0208e;
import d1.InterfaceC0218o;
import d1.j0;
import d1.l0;
import d2.AbstractC0240k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0312h;
import k.InterfaceC0325n0;
import n.AbstractC0377D;
import n.C0375B;
import n.C0393m;
import n.C0405y;
import n0.AbstractC0409C;
import n0.C0435p;
import o0.C0507u;

/* loaded from: classes.dex */
public class t implements InterfaceC0021e, e1.s, N1.a, InterfaceC0218o, InterfaceC0206c, InterfaceC0208e, InterfaceC0325n0, j.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f174d;

    /* renamed from: e, reason: collision with root package name */
    public Object f175e;

    public /* synthetic */ t(int i3, Object obj) {
        this.f174d = i3;
        this.f175e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x015b, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A(A.t r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.t.A(A.t, java.lang.String):java.util.ArrayList");
    }

    public boolean B(int i3, int i4, Bundle bundle) {
        return false;
    }

    public B2.i C(B2.i iVar, C0507u c0507u) {
        boolean z3;
        long j3;
        long j4;
        ArrayList arrayList;
        int i3;
        int i4;
        ArrayList arrayList2 = (ArrayList) iVar.f316e;
        C0393m c0393m = new C0393m(arrayList2.size());
        int size = arrayList2.size();
        int i5 = 0;
        while (i5 < size) {
            h0.m mVar = (h0.m) arrayList2.get(i5);
            long j5 = mVar.f4379a;
            C0393m c0393m2 = (C0393m) this.f175e;
            h0.l lVar = (h0.l) c0393m2.b(j5);
            if (lVar == null) {
                j4 = mVar.f4380b;
                j3 = mVar.f4382d;
                z3 = false;
            } else {
                long D3 = c0507u.D(lVar.f4377b);
                long j6 = lVar.f4376a;
                z3 = lVar.f4378c;
                j3 = D3;
                j4 = j6;
            }
            ArrayList arrayList3 = mVar.f4386i;
            long j7 = mVar.f4387j;
            long j8 = mVar.f4388k;
            long j9 = mVar.f4379a;
            c0393m.e(j9, new h0.k(j9, mVar.f4380b, mVar.f4382d, mVar.f4383e, mVar.f4384f, j4, j3, z3, mVar.f4385g, arrayList3, j7, j8));
            long j10 = mVar.f4379a;
            boolean z4 = mVar.f4383e;
            if (z4) {
                i4 = i5;
                arrayList = arrayList2;
                i3 = size;
                c0393m2.e(j10, new h0.l(mVar.f4380b, mVar.f4381c, z4));
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                c0393m2.f(j10);
            }
            i5 = i4 + 1;
            arrayList2 = arrayList;
            size = i3;
        }
        return new B2.i(c0393m, 7, iVar);
    }

    public boolean D(Object obj, Object obj2) {
        C0405y c0405y = (C0405y) this.f175e;
        Object e3 = c0405y.e(obj);
        if (e3 == null) {
            return false;
        }
        if (!(e3 instanceof C0375B)) {
            if (!e3.equals(obj2)) {
                return false;
            }
            c0405y.g(obj);
            return true;
        }
        C0375B c0375b = (C0375B) e3;
        boolean j3 = c0375b.j(obj2);
        if (j3 && c0375b.g()) {
            c0405y.g(obj);
        }
        return j3;
    }

    public void E() {
        int i3 = 0;
        while (true) {
            F.d dVar = (F.d) this.f175e;
            if (i3 >= dVar.f1160f) {
                return;
            }
            h0.e eVar = (h0.e) dVar.f1158d[i3];
            if (eVar.f4349f.f2099p) {
                i3++;
                eVar.E();
            } else {
                eVar.J();
                dVar.m(i3);
            }
        }
    }

    public void F(Object obj) {
        boolean z3;
        C0405y c0405y = (C0405y) this.f175e;
        long[] jArr = c0405y.f5052a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j3) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj2 = c0405y.f5053b[i6];
                        Object obj3 = c0405y.f5054c[i6];
                        if (obj3 instanceof C0375B) {
                            p2.g.c(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C0375B c0375b = (C0375B) obj3;
                            c0375b.j(obj);
                            z3 = c0375b.g();
                        } else {
                            z3 = obj3 == obj;
                        }
                        if (z3) {
                            c0405y.h(i6);
                        }
                    }
                    j3 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    public void G(float f3, float f4, long j3) {
        W.o j4 = ((B0.a) this.f175e).j();
        j4.o(V.c.b(j3), V.c.c(j3));
        j4.c(f3, f4);
        j4.o(-V.c.b(j3), -V.c.c(j3));
    }

    public int H() {
        int intValue;
        List list = (List) this.f175e;
        if (!(list.size() > 0)) {
            C0032d.r("Set is empty");
            throw null;
        }
        int intValue2 = ((Number) list.get(0)).intValue();
        while (!list.isEmpty() && ((Number) list.get(0)).intValue() == intValue2) {
            list.set(0, AbstractC0240k.e0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i3 = 0;
            while (i3 < size2) {
                int intValue3 = ((Number) list.get(i3)).intValue();
                int i4 = (i3 + 1) * 2;
                int i5 = i4 - 1;
                int intValue4 = ((Number) list.get(i5)).intValue();
                if (i4 >= size || (intValue = ((Number) list.get(i4)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        list.set(i3, Integer.valueOf(intValue4));
                        list.set(i5, Integer.valueOf(intValue3));
                        i3 = i5;
                    }
                } else if (intValue > intValue3) {
                    list.set(i3, Integer.valueOf(intValue));
                    list.set(i4, Integer.valueOf(intValue3));
                    i3 = i4;
                }
            }
        }
        return intValue2;
    }

    public void I(float f3, float f4) {
        ((B0.a) this.f175e).j().o(f3, f4);
    }

    @Override // j.o
    public void a(j.i iVar, boolean z3) {
        if (iVar instanceof j.t) {
            ((j.t) iVar).f4595v.j().c(false);
        }
        j.o oVar = ((C0312h) this.f175e).h;
        if (oVar != null) {
            oVar.a(iVar, z3);
        }
    }

    @Override // d1.InterfaceC0218o
    public l0 b(View view, l0 l0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f175e;
        if (!Objects.equals(coordinatorLayout.f3382q, l0Var)) {
            coordinatorLayout.f3382q = l0Var;
            boolean z3 = l0Var.a() > 0;
            coordinatorLayout.f3383r = z3;
            coordinatorLayout.setWillNotDraw(!z3 && coordinatorLayout.getBackground() == null);
            j0 j0Var = l0Var.f4228a;
            if (!j0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    Field field = AbstractC0189K.f4150a;
                    if (childAt.getFitsSystemWindows() && ((Q0.d) childAt.getLayoutParams()).f2174a != null && j0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return l0Var;
    }

    @Override // j.o
    public boolean c(j.i iVar) {
        C0312h c0312h = (C0312h) this.f175e;
        if (iVar == c0312h.f4779f) {
            return false;
        }
        ((j.t) iVar).f4596w.getClass();
        c0312h.getClass();
        j.o oVar = c0312h.h;
        if (oVar != null) {
            return oVar.c(iVar);
        }
        return false;
    }

    @Override // k.InterfaceC0325n0
    public void d(j.i iVar, j.j jVar) {
        j.f fVar = (j.f) this.f175e;
        fVar.f4495i.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f4497k;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (iVar == ((j.e) arrayList.get(i3)).f4487b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        fVar.f4495i.postAtTime(new j.d(this, i4 < arrayList.size() ? (j.e) arrayList.get(i4) : null, jVar, iVar), iVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // d1.InterfaceC0208e
    public ClipData e() {
        ClipData clip;
        clip = ((ContentInfo) this.f175e).getClip();
        return clip;
    }

    @Override // e1.s
    public boolean f(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f175e;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        Field field = AbstractC0189K.f4150a;
        boolean z3 = view.getLayoutDirection() == 1;
        int i3 = swipeDismissBehavior.f3872d;
        view.offsetLeftAndRight((!(i3 == 0 && z3) && (i3 != 1 || z3)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // d1.InterfaceC0206c
    public C0209f g() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f175e).build();
        return new C0209f(new t(build));
    }

    @Override // d1.InterfaceC0208e
    public int h() {
        int flags;
        flags = ((ContentInfo) this.f175e).getFlags();
        return flags;
    }

    @Override // d1.InterfaceC0208e
    public ContentInfo i() {
        return (ContentInfo) this.f175e;
    }

    @Override // d1.InterfaceC0206c
    public void j(Bundle bundle) {
        ((ContentInfo.Builder) this.f175e).setExtras(bundle);
    }

    @Override // d1.InterfaceC0206c
    public void k(Uri uri) {
        ((ContentInfo.Builder) this.f175e).setLinkUri(uri);
    }

    @Override // d1.InterfaceC0208e
    public int l() {
        int source;
        source = ((ContentInfo) this.f175e).getSource();
        return source;
    }

    @Override // k.InterfaceC0325n0
    public void n(j.i iVar, j.j jVar) {
        ((j.f) this.f175e).f4495i.removeCallbacksAndMessages(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [i2.j, o2.e] */
    @Override // B2.InterfaceC0021e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(B2.InterfaceC0022f r7, g2.InterfaceC0271d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof B2.C0017a
            if (r0 == 0) goto L13
            r0 = r8
            B2.a r0 = (B2.C0017a) r0
            int r1 = r0.f301j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f301j = r1
            goto L18
        L13:
            B2.a r0 = new B2.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.h
            h2.a r1 = h2.a.f4407d
            int r2 = r0.f301j
            c2.m r3 = c2.C0174m.f3840a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            C2.u r7 = r0.f299g
            Z0.d.U(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r8 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            Z0.d.U(r8)
            C2.u r8 = new C2.u
            g2.i r2 = r0.f4461e
            p2.g.b(r2)
            r8.<init>(r7, r2)
            r0.f299g = r8     // Catch: java.lang.Throwable -> L5e
            r0.f301j = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r6.f175e     // Catch: java.lang.Throwable -> L5e
            i2.j r7 = (i2.j) r7     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.h(r8, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r8
        L56:
            r7.m()
            return r3
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L5e:
            r7 = move-exception
            goto L5a
        L60:
            r7.m()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A.t.o(B2.f, g2.d):java.lang.Object");
    }

    @Override // d1.InterfaceC0206c
    public void p(int i3) {
        ((ContentInfo.Builder) this.f175e).setFlags(i3);
    }

    public void q(int i3) {
        List list = (List) this.f175e;
        if (list.isEmpty() || !(((Number) list.get(0)).intValue() == i3 || ((Number) list.get(list.size() - 1)).intValue() == i3)) {
            int size = list.size();
            list.add(Integer.valueOf(i3));
            while (size > 0) {
                int i4 = ((size + 1) >>> 1) - 1;
                int intValue = ((Number) list.get(i4)).intValue();
                if (i3 <= intValue) {
                    break;
                }
                list.set(size, Integer.valueOf(intValue));
                size = i4;
            }
            list.set(size, Integer.valueOf(i3));
        }
    }

    public void r(Object obj, Object obj2) {
        C0405y c0405y = (C0405y) this.f175e;
        int d3 = c0405y.d(obj);
        boolean z3 = d3 < 0;
        Object obj3 = z3 ? null : c0405y.f5054c[d3];
        if (obj3 != null) {
            if (obj3 instanceof C0375B) {
                ((C0375B) obj3).a(obj2);
            } else if (obj3 != obj2) {
                C0375B c0375b = new C0375B();
                c0375b.a(obj3);
                c0375b.a(obj2);
                obj2 = c0375b;
            }
            obj2 = obj3;
        }
        if (!z3) {
            c0405y.f5054c[d3] = obj2;
            return;
        }
        int i3 = ~d3;
        c0405y.f5053b[i3] = obj;
        c0405y.f5054c[i3] = obj2;
    }

    public void s(int i3, e1.j jVar, String str, Bundle bundle) {
    }

    public boolean t(C0393m c0393m, C0435p c0435p, B2.i iVar, boolean z3) {
        F.d dVar = (F.d) this.f175e;
        int i3 = dVar.f1160f;
        if (i3 <= 0) {
            return false;
        }
        Object[] objArr = dVar.f1158d;
        int i4 = 0;
        boolean z4 = false;
        do {
            z4 = ((h0.e) objArr[i4]).t(c0393m, c0435p, iVar, z3) || z4;
            i4++;
        } while (i4 < i3);
        return z4;
    }

    public String toString() {
        switch (this.f174d) {
            case 19:
                return "ContentInfoCompat{" + ((ContentInfo) this.f175e) + "}";
            default:
                return super.toString();
        }
    }

    public void u(B2.i iVar) {
        F.d dVar = (F.d) this.f175e;
        int i3 = dVar.f1160f;
        while (true) {
            i3--;
            if (-1 >= i3) {
                return;
            }
            if (((h0.e) dVar.f1158d[i3]).f4350g.f1378e == 0) {
                dVar.m(i3);
            }
        }
    }

    public e1.j v(int i3) {
        return null;
    }

    public e1.j w(int i3) {
        return null;
    }

    public L0 x() {
        o1.i a3 = o1.i.a();
        if (a3.b() == 1) {
            return new C0.k(true);
        }
        C0037f0 A3 = C0032d.A(Boolean.FALSE);
        a3.g(new C0.g(A3, this));
        return A3;
    }

    public void y(float f3, float f4, float f5, float f6) {
        B0.a aVar = (B0.a) this.f175e;
        W.o j3 = aVar.j();
        long d3 = AbstractC0090a.d(V.f.d(aVar.r()) - (f5 + f3), V.f.b(aVar.r()) - (f6 + f4));
        if (V.f.d(d3) < 0.0f || V.f.b(d3) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        aVar.J(d3);
        j3.o(f3, f4);
    }

    public long z() {
        switch (this.f174d) {
            case 0:
                v vVar = (v) this.f175e;
                long j3 = ((E) vVar.f181v.f175e).f8c;
                if (j3 != 16) {
                    return j3;
                }
                B b3 = (B) AbstractC0409C.h(vVar, D.f4b);
                if (b3 != null) {
                    long j4 = b3.f0a;
                    if (j4 != 16) {
                        return j4;
                    }
                }
                return ((W.r) AbstractC0409C.h(vVar, s.f173a)).f2564a;
            default:
                return ((E) this.f175e).f8c;
        }
    }

    public /* synthetic */ t(int i3, boolean z3) {
        this.f174d = i3;
    }

    public t(Runnable runnable) {
        this.f174d = 20;
        this.f175e = new CopyOnWriteArrayList();
        new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(o2.e eVar) {
        this.f174d = 2;
        this.f175e = (i2.j) eVar;
    }

    public t(ContentInfo contentInfo) {
        this.f174d = 19;
        contentInfo.getClass();
        this.f175e = M1.a.g(contentInfo);
    }

    public t(ClipData clipData, int i3) {
        this.f174d = 18;
        this.f175e = M1.a.e(clipData, i3);
    }

    public t(int i3) {
        this.f174d = i3;
        switch (i3) {
            case 6:
                this.f175e = new SparseArray(10);
                break;
            case 7:
                long[] jArr = AbstractC0377D.f4966a;
                this.f175e = new C0405y();
                break;
            case 21:
                this.f175e = new e1.k(this);
                break;
            case 22:
                this.f175e = new F.d(new h0.e[16]);
                break;
            case 23:
                this.f175e = new C0393m((Object) null);
                break;
            default:
                this.f175e = new ArrayList();
                break;
        }
    }
}
