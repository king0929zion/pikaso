package D1;

import A.AbstractC0000a;
import a.AbstractC0090a;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import d1.AbstractC0189K;
import d1.AbstractC0229z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n.C0386f;
import n.C0393m;

/* loaded from: classes.dex */
public abstract class o implements Cloneable {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f997w = {2, 1, 3, 4};

    /* renamed from: x, reason: collision with root package name */
    public static final X1.e f998x = new X1.e(2);

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadLocal f999y = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1009n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1010o;

    /* renamed from: d, reason: collision with root package name */
    public final String f1000d = getClass().getName();

    /* renamed from: e, reason: collision with root package name */
    public long f1001e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f1002f = -1;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f1003g = null;
    public final ArrayList h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1004i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public w f1005j = new w(0);

    /* renamed from: k, reason: collision with root package name */
    public w f1006k = new w(0);

    /* renamed from: l, reason: collision with root package name */
    public C0067a f1007l = null;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f1008m = f997w;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1011p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public int f1012q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1013r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1014s = false;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f1015t = null;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f1016u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public X1.e f1017v = f998x;

    public static void b(w wVar, View view, v vVar) {
        ((C0386f) wVar.f1031a).put(view, vVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) wVar.f1033c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = AbstractC0189K.f4150a;
        String k3 = AbstractC0229z.k(view);
        if (k3 != null) {
            C0386f c0386f = (C0386f) wVar.f1032b;
            if (c0386f.containsKey(k3)) {
                c0386f.put(k3, null);
            } else {
                c0386f.put(k3, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0393m c0393m = (C0393m) wVar.f1034d;
                if (c0393m.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0393m.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0393m.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0393m.e(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C0386f n() {
        ThreadLocal threadLocal = f999y;
        C0386f c0386f = (C0386f) threadLocal.get();
        if (c0386f != null) {
            return c0386f;
        }
        C0386f c0386f2 = new C0386f(0);
        threadLocal.set(c0386f2);
        return c0386f2;
    }

    public static boolean s(v vVar, v vVar2, String str) {
        Object obj = vVar.f1028a.get(str);
        Object obj2 = vVar2.f1028a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(X1.e eVar) {
        if (eVar == null) {
            this.f1017v = f998x;
        } else {
            this.f1017v = eVar;
        }
    }

    public void B() {
    }

    public void C(long j3) {
        this.f1001e = j3;
    }

    public final void D() {
        if (this.f1012q == 0) {
            ArrayList arrayList = this.f1015t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1015t.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((n) arrayList2.get(i3)).b();
                }
            }
            this.f1014s = false;
        }
        this.f1012q++;
    }

    public String E(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f1002f != -1) {
            str2 = str2 + "dur(" + this.f1002f + ") ";
        }
        if (this.f1001e != -1) {
            str2 = str2 + "dly(" + this.f1001e + ") ";
        }
        if (this.f1003g != null) {
            str2 = str2 + "interp(" + this.f1003g + ") ";
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1004i;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String e3 = AbstractC0000a.e(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 > 0) {
                    e3 = AbstractC0000a.e(e3, ", ");
                }
                e3 = e3 + arrayList.get(i3);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (i4 > 0) {
                    e3 = AbstractC0000a.e(e3, ", ");
                }
                e3 = e3 + arrayList2.get(i4);
            }
        }
        return AbstractC0000a.e(e3, ")");
    }

    public void a(n nVar) {
        if (this.f1015t == null) {
            this.f1015t = new ArrayList();
        }
        this.f1015t.add(nVar);
    }

    public abstract void c(v vVar);

    public final void d(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            v vVar = new v(view);
            if (z3) {
                f(vVar);
            } else {
                c(vVar);
            }
            vVar.f1030c.add(this);
            e(vVar);
            if (z3) {
                b(this.f1005j, view, vVar);
            } else {
                b(this.f1006k, view, vVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                d(viewGroup.getChildAt(i3), z3);
            }
        }
    }

    public void e(v vVar) {
    }

    public abstract void f(v vVar);

    public final void g(ViewGroup viewGroup, boolean z3) {
        h(z3);
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1004i;
        if (size <= 0 && arrayList2.size() <= 0) {
            d(viewGroup, z3);
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i3)).intValue());
            if (findViewById != null) {
                v vVar = new v(findViewById);
                if (z3) {
                    f(vVar);
                } else {
                    c(vVar);
                }
                vVar.f1030c.add(this);
                e(vVar);
                if (z3) {
                    b(this.f1005j, findViewById, vVar);
                } else {
                    b(this.f1006k, findViewById, vVar);
                }
            }
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            View view = (View) arrayList2.get(i4);
            v vVar2 = new v(view);
            if (z3) {
                f(vVar2);
            } else {
                c(vVar2);
            }
            vVar2.f1030c.add(this);
            e(vVar2);
            if (z3) {
                b(this.f1005j, view, vVar2);
            } else {
                b(this.f1006k, view, vVar2);
            }
        }
    }

    public final void h(boolean z3) {
        if (z3) {
            ((C0386f) this.f1005j.f1031a).clear();
            ((SparseArray) this.f1005j.f1033c).clear();
            ((C0393m) this.f1005j.f1034d).a();
        } else {
            ((C0386f) this.f1006k.f1031a).clear();
            ((SparseArray) this.f1006k.f1033c).clear();
            ((C0393m) this.f1006k.f1034d).a();
        }
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o clone() {
        try {
            o oVar = (o) super.clone();
            oVar.f1016u = new ArrayList();
            oVar.f1005j = new w(0);
            oVar.f1006k = new w(0);
            oVar.f1009n = null;
            oVar.f1010o = null;
            return oVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator j(ViewGroup viewGroup, v vVar, v vVar2) {
        return null;
    }

    public void k(ViewGroup viewGroup, w wVar, w wVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator j3;
        int i3;
        View view;
        v vVar;
        Animator animator;
        v vVar2;
        C0386f n2 = n();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            v vVar3 = (v) arrayList.get(i4);
            v vVar4 = (v) arrayList2.get(i4);
            if (vVar3 != null && !vVar3.f1030c.contains(this)) {
                vVar3 = null;
            }
            if (vVar4 != null && !vVar4.f1030c.contains(this)) {
                vVar4 = null;
            }
            if (!(vVar3 == null && vVar4 == null) && ((vVar3 == null || vVar4 == null || q(vVar3, vVar4)) && (j3 = j(viewGroup, vVar3, vVar4)) != null)) {
                String str = this.f1000d;
                if (vVar4 != null) {
                    String[] o3 = o();
                    view = vVar4.f1029b;
                    if (o3 != null && o3.length > 0) {
                        vVar2 = new v(view);
                        v vVar5 = (v) ((C0386f) wVar2.f1031a).get(view);
                        i3 = size;
                        if (vVar5 != null) {
                            int i5 = 0;
                            while (i5 < o3.length) {
                                HashMap hashMap = vVar2.f1028a;
                                String str2 = o3[i5];
                                hashMap.put(str2, vVar5.f1028a.get(str2));
                                i5++;
                                o3 = o3;
                            }
                        }
                        int i6 = n2.f4970f;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                animator = j3;
                                break;
                            }
                            m mVar = (m) n2.get((Animator) n2.f(i7));
                            if (mVar.f994c != null && mVar.f992a == view && mVar.f993b.equals(str) && mVar.f994c.equals(vVar2)) {
                                animator = null;
                                break;
                            }
                            i7++;
                        }
                    } else {
                        i3 = size;
                        animator = j3;
                        vVar2 = null;
                    }
                    j3 = animator;
                    vVar = vVar2;
                } else {
                    i3 = size;
                    view = vVar3.f1029b;
                    vVar = null;
                }
                if (j3 != null) {
                    y yVar = x.f1035a;
                    D d3 = new D(viewGroup);
                    m mVar2 = new m();
                    mVar2.f992a = view;
                    mVar2.f993b = str;
                    mVar2.f994c = vVar;
                    mVar2.f995d = d3;
                    mVar2.f996e = this;
                    n2.put(j3, mVar2);
                    this.f1016u.add(j3);
                }
            } else {
                i3 = size;
            }
            i4++;
            size = i3;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator2 = (Animator) this.f1016u.get(sparseIntArray.keyAt(i8));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(i8) - Long.MAX_VALUE));
            }
        }
    }

    public final void l() {
        int i3 = this.f1012q - 1;
        this.f1012q = i3;
        if (i3 == 0) {
            ArrayList arrayList = this.f1015t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f1015t.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((n) arrayList2.get(i4)).d(this);
                }
            }
            for (int i5 = 0; i5 < ((C0393m) this.f1005j.f1034d).g(); i5++) {
                View view = (View) ((C0393m) this.f1005j.f1034d).h(i5);
                if (view != null) {
                    Field field = AbstractC0189K.f4150a;
                    view.setHasTransientState(false);
                }
            }
            for (int i6 = 0; i6 < ((C0393m) this.f1006k.f1034d).g(); i6++) {
                View view2 = (View) ((C0393m) this.f1006k.f1034d).h(i6);
                if (view2 != null) {
                    Field field2 = AbstractC0189K.f4150a;
                    view2.setHasTransientState(false);
                }
            }
            this.f1014s = true;
        }
    }

    public final v m(View view, boolean z3) {
        C0067a c0067a = this.f1007l;
        if (c0067a != null) {
            return c0067a.m(view, z3);
        }
        ArrayList arrayList = z3 ? this.f1009n : this.f1010o;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            }
            v vVar = (v) arrayList.get(i3);
            if (vVar == null) {
                return null;
            }
            if (vVar.f1029b == view) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return (v) (z3 ? this.f1010o : this.f1009n).get(i3);
        }
        return null;
    }

    public String[] o() {
        return null;
    }

    public final v p(View view, boolean z3) {
        C0067a c0067a = this.f1007l;
        if (c0067a != null) {
            return c0067a.p(view, z3);
        }
        return (v) ((C0386f) (z3 ? this.f1005j : this.f1006k).f1031a).get(view);
    }

    public boolean q(v vVar, v vVar2) {
        if (vVar == null || vVar2 == null) {
            return false;
        }
        String[] o3 = o();
        if (o3 == null) {
            Iterator it = vVar.f1028a.keySet().iterator();
            while (it.hasNext()) {
                if (s(vVar, vVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : o3) {
            if (!s(vVar, vVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean r(View view) {
        int id = view.getId();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1004i;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void t(ViewGroup viewGroup) {
        D d3;
        if (this.f1014s) {
            return;
        }
        C0386f n2 = n();
        int i3 = n2.f4970f;
        y yVar = x.f1035a;
        WindowId windowId = viewGroup.getWindowId();
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            m mVar = (m) n2.i(i4);
            if (mVar.f992a != null && (d3 = mVar.f995d) != null && d3.f957a.equals(windowId)) {
                ((Animator) n2.f(i4)).pause();
            }
        }
        ArrayList arrayList = this.f1015t;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f1015t.clone();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((n) arrayList2.get(i5)).c();
            }
        }
        this.f1013r = true;
    }

    public final String toString() {
        return E("");
    }

    public void u(n nVar) {
        ArrayList arrayList = this.f1015t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(nVar);
        if (this.f1015t.size() == 0) {
            this.f1015t = null;
        }
    }

    public void v(View view) {
        D d3;
        if (this.f1013r) {
            if (!this.f1014s) {
                C0386f n2 = n();
                int i3 = n2.f4970f;
                y yVar = x.f1035a;
                WindowId windowId = view.getWindowId();
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    m mVar = (m) n2.i(i4);
                    if (mVar.f992a != null && (d3 = mVar.f995d) != null && d3.f957a.equals(windowId)) {
                        ((Animator) n2.f(i4)).resume();
                    }
                }
                ArrayList arrayList = this.f1015t;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f1015t.clone();
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((n) arrayList2.get(i5)).e();
                    }
                }
            }
            this.f1013r = false;
        }
    }

    public void w() {
        D();
        C0386f n2 = n();
        Iterator it = this.f1016u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (n2.containsKey(animator)) {
                D();
                if (animator != null) {
                    animator.addListener(new k(this, n2));
                    long j3 = this.f1002f;
                    if (j3 >= 0) {
                        animator.setDuration(j3);
                    }
                    long j4 = this.f1001e;
                    if (j4 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j4);
                    }
                    TimeInterpolator timeInterpolator = this.f1003g;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new l(0, this));
                    animator.start();
                }
            }
        }
        this.f1016u.clear();
        l();
    }

    public void x(long j3) {
        this.f1002f = j3;
    }

    public void y(AbstractC0090a abstractC0090a) {
    }

    public void z(TimeInterpolator timeInterpolator) {
        this.f1003g = timeInterpolator;
    }
}
