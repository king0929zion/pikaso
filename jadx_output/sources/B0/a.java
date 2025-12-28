package B0;

import A.t;
import D.AbstractC0028b;
import D.C0032d;
import L0.f;
import M0.e;
import W.AbstractC0082e;
import W.w;
import Z.i;
import Z.k;
import a0.AbstractC0091a;
import a0.C0092b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.recyclerview.widget.RecyclerView;
import com.ai.assistance.operit.provider.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k.C0296A;
import n.AbstractC0377D;
import n.AbstractC0392l;
import n.C0393m;
import n.C0400t;
import n0.C0435p;
import n0.C0444z;
import o.AbstractC0450a;
import o0.C0507u;
import o1.o;
import o1.p;
import o1.s;
import o1.v;
import p1.C0545a;
import p2.g;
import s1.C0589c;
import z1.AbstractC0727a;
import z1.C0728b;
import z1.C0742p;

/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f269e = true;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270a;

    /* renamed from: b, reason: collision with root package name */
    public Object f271b;

    /* renamed from: c, reason: collision with root package name */
    public Object f272c;

    /* renamed from: d, reason: collision with root package name */
    public Object f273d;

    public a(I i3, H h, v1.b bVar) {
        this.f270a = 11;
        g.e(i3, "store");
        g.e(bVar, "extras");
        this.f271b = i3;
        this.f272c = h;
        this.f273d = bVar;
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z3) {
        o1.w[] wVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (o1.w[]) editable.getSpans(selectionStart, selectionEnd, o1.w.class)) != null && wVarArr.length > 0) {
            for (o1.w wVar : wVarArr) {
                int spanStart = editable.getSpanStart(wVar);
                int spanEnd = editable.getSpanEnd(wVar);
                if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static a y(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new a(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public void A() {
        C0507u c0507u = ((C0444z) this.f271b).f5307l;
        if (c0507u != null) {
            c0507u.u();
        }
    }

    public Object B(CharSequence charSequence, int i3, int i4, int i5, boolean z3, o oVar) {
        int i6;
        char c3;
        p pVar = new p((s) ((D1.w) this.f272c).f1033c);
        int codePointAt = Character.codePointAt(charSequence, i3);
        boolean z4 = true;
        int i7 = 0;
        int i8 = i3;
        loop0: while (true) {
            i6 = i8;
            while (i8 < i4 && i7 < i5 && z4) {
                SparseArray sparseArray = ((s) pVar.f5789f).f5802a;
                s sVar = sparseArray == null ? null : (s) sparseArray.get(codePointAt);
                if (pVar.f5785b == 2) {
                    if (sVar != null) {
                        pVar.f5789f = sVar;
                        pVar.f5787d++;
                    } else {
                        if (codePointAt == 65038) {
                            pVar.c();
                        } else if (codePointAt != 65039) {
                            s sVar2 = (s) pVar.f5789f;
                            if (sVar2.f5803b != null) {
                                if (pVar.f5787d != 1) {
                                    pVar.f5790g = sVar2;
                                    pVar.c();
                                } else if (pVar.d()) {
                                    pVar.f5790g = (s) pVar.f5789f;
                                    pVar.c();
                                } else {
                                    pVar.c();
                                }
                                c3 = 3;
                            } else {
                                pVar.c();
                            }
                        }
                        c3 = 1;
                    }
                    c3 = 2;
                } else if (sVar == null) {
                    pVar.c();
                    c3 = 1;
                } else {
                    pVar.f5785b = 2;
                    pVar.f5789f = sVar;
                    pVar.f5787d = 1;
                    c3 = 2;
                }
                pVar.f5786c = codePointAt;
                if (c3 == 1) {
                    i8 = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                    if (i8 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (c3 == 2) {
                    int charCount = Character.charCount(codePointAt) + i8;
                    if (charCount < i4) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i8 = charCount;
                } else if (c3 == 3) {
                    if (z3 || !u(charSequence, i6, i8, ((s) pVar.f5790g).f5803b)) {
                        z4 = oVar.d(charSequence, i6, i8, ((s) pVar.f5790g).f5803b);
                        i7++;
                    }
                }
            }
        }
        if (pVar.f5785b == 2 && ((s) pVar.f5789f).f5803b != null && ((pVar.f5787d > 1 || pVar.d()) && i7 < i5 && z4 && (z3 || !u(charSequence, i6, i8, ((s) pVar.f5789f).f5803b)))) {
            oVar.d(charSequence, i6, i8, ((s) pVar.f5789f).f5803b);
        }
        return oVar.a();
    }

    public void C() {
        ((TypedArray) this.f272c).recycle();
    }

    public void D(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0727a abstractC0727a = (AbstractC0727a) arrayList.get(i3);
            abstractC0727a.getClass();
            ((f) this.f271b).c(abstractC0727a);
        }
        arrayList.clear();
    }

    public void E(Object obj) {
        boolean z3;
        long id = Thread.currentThread().getId();
        if (id == AbstractC0028b.f736a) {
            this.f273d = obj;
            return;
        }
        synchronized (this.f272c) {
            L.f fVar = (L.f) ((AtomicReference) this.f271b).get();
            int a3 = fVar.a(id);
            if (a3 < 0) {
                z3 = false;
            } else {
                fVar.f1455c[a3] = obj;
                z3 = true;
            }
            if (z3) {
                return;
            }
            ((AtomicReference) this.f271b).set(fVar.b(id, obj));
        }
    }

    public void F(W.o oVar) {
        ((Y.b) this.f273d).f2769d.f2767c = oVar;
    }

    public void G(G0.b bVar) {
        ((Y.b) this.f273d).f2769d.f2765a = bVar;
    }

    public void H(Z.d dVar) {
        this.f272c = dVar;
    }

    public void I(G0.f fVar) {
        ((Y.b) this.f273d).f2769d.f2766b = fVar;
    }

    public void J(long j3) {
        ((Y.b) this.f273d).f2769d.f2768d = j3;
    }

    public void K(e eVar, int i3, int i4) {
        int i5 = eVar.f1566Q;
        int i6 = eVar.f1567R;
        eVar.f1566Q = 0;
        eVar.f1567R = 0;
        eVar.y(i3);
        eVar.v(i4);
        if (i5 < 0) {
            eVar.f1566Q = 0;
        } else {
            eVar.f1566Q = i5;
        }
        if (i6 < 0) {
            eVar.f1567R = 0;
        } else {
            eVar.f1567R = i6;
        }
        ((e) this.f273d).E();
    }

    public void L(View view) {
        if (((ArrayList) this.f273d).remove(view)) {
            RecyclerView.r(view);
        }
    }

    public void M() {
        ArrayList arrayList = (ArrayList) this.f272c;
        if (arrayList.isEmpty()) {
            C0032d.I("empty stack");
            throw null;
        }
        this.f273d = arrayList.remove(arrayList.size() - 1);
    }

    @Override // W.w
    public void a(Z.d dVar) {
        synchronized (this.f272c) {
            if (!dVar.f2807q) {
                dVar.f2807q = true;
                dVar.b();
            }
        }
    }

    @Override // W.w
    public Z.d b() {
        Z.f kVar;
        Z.d dVar;
        synchronized (this.f272c) {
            try {
                C0507u c0507u = (C0507u) this.f271b;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    AbstractC0082e.a(c0507u);
                }
                if (i3 >= 29) {
                    kVar = new i();
                } else if (f269e) {
                    try {
                        kVar = new Z.g((C0507u) this.f271b, new W.p(), new Y.b());
                    } catch (Throwable unused) {
                        f269e = false;
                        kVar = new k(z((C0507u) this.f271b));
                    }
                } else {
                    kVar = new k(z((C0507u) this.f271b));
                }
                dVar = new Z.d(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r21, java.util.List r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.a.c(long, java.util.List, boolean):void");
    }

    public void d() {
        ((ArrayList) this.f272c).clear();
        this.f273d = (C0444z) this.f271b;
        C0444z c0444z = (C0444z) this.f271b;
        B2.i iVar = c0444z.h;
        int i3 = ((F.d) iVar.f316e).f1160f;
        while (true) {
            i3--;
            F.d dVar = (F.d) iVar.f316e;
            if (-1 >= i3) {
                dVar.g();
                ((A0.c) iVar.f317f).c();
                return;
            }
            c0444z.y((C0444z) dVar.f1158d[i3]);
        }
    }

    public boolean f(B2.i iVar, boolean z3) {
        boolean z4;
        boolean z5;
        t tVar = (t) this.f272c;
        if (!tVar.t((C0393m) iVar.f316e, (C0435p) this.f271b, iVar, z3)) {
            return false;
        }
        F.d dVar = (F.d) tVar.f175e;
        int i3 = dVar.f1160f;
        if (i3 > 0) {
            Object[] objArr = dVar.f1158d;
            int i4 = 0;
            z4 = false;
            do {
                z4 = ((h0.e) objArr[i4]).L(iVar, z3) || z4;
                i4++;
            } while (i4 < i3);
        } else {
            z4 = false;
        }
        int i5 = dVar.f1160f;
        if (i5 > 0) {
            Object[] objArr2 = dVar.f1158d;
            int i6 = 0;
            z5 = false;
            do {
                z5 = ((h0.e) objArr2[i6]).K(iVar) || z5;
                i6++;
            } while (i6 < i5);
        } else {
            z5 = false;
        }
        tVar.u(iVar);
        return z5 || z4;
    }

    public void g(Object obj) {
        ((ArrayList) this.f272c).add(this.f273d);
        this.f273d = obj;
    }

    public int h(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.f273d;
        int size = arrayList.size();
        while (i4 < size) {
            ((AbstractC0727a) arrayList.get(i4)).getClass();
            i4++;
        }
        return i3;
    }

    public Object i() {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0028b.f736a) {
            return this.f273d;
        }
        L.f fVar = (L.f) ((AtomicReference) this.f271b).get();
        int a3 = fVar.a(id);
        if (a3 >= 0) {
            return fVar.f1455c[a3];
        }
        return null;
    }

    public W.o j() {
        return ((Y.b) this.f273d).f2769d.f2767c;
    }

    public ColorStateList k(int i3) {
        int resourceId;
        ColorStateList y3;
        TypedArray typedArray = (TypedArray) this.f272c;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (y3 = r2.a.y((Context) this.f271b, resourceId)) == null) ? typedArray.getColorStateList(i3) : y3;
    }

    public G0.b l() {
        return ((Y.b) this.f273d).f2769d.f2765a;
    }

    public Drawable m(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f272c;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : Z.b.r((Context) this.f271b, resourceId);
    }

    public Typeface n(int i3, int i4, C0296A c0296a) {
        int resourceId = ((TypedArray) this.f272c).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f273d) == null) {
            this.f273d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f273d;
        ThreadLocal threadLocal = U0.o.f2403a;
        Context context = (Context) this.f271b;
        if (context.isRestricted()) {
            return null;
        }
        return U0.o.b(context, resourceId, typedValue, i4, c0296a, true, false);
    }

    public Z.d o() {
        return (Z.d) this.f272c;
    }

    public G0.f p() {
        return ((Y.b) this.f273d).f2769d.f2766b;
    }

    public int q(int i3) {
        if (i3 < 0) {
            return -1;
        }
        int childCount = ((C0742p) this.f271b).f7072a.getChildCount();
        int i4 = i3;
        while (i4 < childCount) {
            C0728b c0728b = (C0728b) this.f272c;
            int b3 = i3 - (i4 - c0728b.b(i4));
            if (b3 == 0) {
                while (c0728b.d(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += b3;
        }
        return -1;
    }

    public long r() {
        return ((Y.b) this.f273d).f2769d.f2768d;
    }

    public View s(int i3) {
        return ((C0742p) this.f271b).f7072a.getChildAt(i3);
    }

    public int t() {
        return ((C0742p) this.f271b).f7072a.getChildCount();
    }

    public String toString() {
        switch (this.f270a) {
            case 13:
                return ((C0728b) this.f272c).toString() + ", hidden list:" + ((ArrayList) this.f273d).size();
            default:
                return super.toString();
        }
    }

    public boolean u(CharSequence charSequence, int i3, int i4, v vVar) {
        if ((vVar.f5811c & 3) == 0) {
            o1.d dVar = (o1.d) this.f273d;
            C0545a c3 = vVar.c();
            int a3 = c3.a(8);
            if (a3 != 0) {
                c3.f5940b.getShort(a3 + c3.f5939a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = o1.d.f5761b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i3 < i4) {
                sb.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = dVar.f5762a;
            String sb2 = sb.toString();
            int i5 = V0.e.f2464a;
            boolean a4 = V0.d.a(textPaint, sb2);
            int i6 = vVar.f5811c & 4;
            vVar.f5811c = a4 ? i6 | 2 : i6 | 1;
        }
        return (vVar.f5811c & 3) == 2;
    }

    public boolean v() {
        return ((ArrayList) this.f272c).size() > 0;
    }

    public boolean w() {
        a aVar;
        return ((z0.t) this.f271b).f6941d != this.f273d || ((aVar = (a) this.f272c) != null && aVar.w());
    }

    public boolean x(O0.e eVar, M0.d dVar, boolean z3) {
        int[] iArr = dVar.f1581c0;
        int i3 = iArr[0];
        N0.b bVar = (N0.b) this.f272c;
        bVar.f1799a = i3;
        bVar.f1800b = iArr[1];
        bVar.f1801c = dVar.l();
        bVar.f1802d = dVar.i();
        bVar.f1806i = false;
        bVar.f1807j = z3;
        boolean z4 = bVar.f1799a == 3;
        boolean z5 = bVar.f1800b == 3;
        boolean z6 = z4 && dVar.f1561L > 0.0f;
        boolean z7 = z5 && dVar.f1561L > 0.0f;
        int[] iArr2 = dVar.f1589l;
        if (z6 && iArr2[0] == 4) {
            bVar.f1799a = 1;
        }
        if (z7 && iArr2[1] == 4) {
            bVar.f1800b = 1;
        }
        eVar.a(dVar, bVar);
        dVar.y(bVar.f1803e);
        dVar.v(bVar.f1804f);
        dVar.f1600w = bVar.h;
        int i4 = bVar.f1805g;
        dVar.f1565P = i4;
        dVar.f1600w = i4 > 0;
        bVar.f1807j = false;
        return bVar.f1806i;
    }

    public AbstractC0091a z(C0507u c0507u) {
        C0092b c0092b = (C0092b) this.f273d;
        if (c0092b != null) {
            return c0092b;
        }
        C0092b c0092b2 = new C0092b(c0507u.getContext());
        c0092b2.setClipChildren(false);
        c0092b2.setClipToPadding(false);
        c0092b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        c0507u.addView(c0092b2, -1);
        this.f273d = c0092b2;
        return c0092b2;
    }

    public a(C0435p c0435p) {
        this.f270a = 7;
        this.f271b = c0435p;
        this.f272c = new t(22);
        C0400t c0400t = new C0400t();
        c0400t.f5027a = AbstractC0377D.f4966a;
        c0400t.f5028b = AbstractC0392l.f4994a;
        c0400t.f5029c = AbstractC0450a.f5364c;
        c0400t.c(AbstractC0377D.d(10));
        this.f273d = c0400t;
    }

    public a(C0507u c0507u) {
        this.f270a = 5;
        this.f271b = c0507u;
        this.f272c = new Object();
    }

    public a(C0742p c0742p) {
        this.f270a = 13;
        this.f271b = c0742p;
        this.f272c = new C0728b();
        this.f273d = new ArrayList();
    }

    public a(int i3) {
        this.f270a = i3;
        switch (i3) {
            case 2:
                this.f271b = new WeakHashMap();
                this.f272c = new WeakHashMap();
                this.f273d = new WeakHashMap();
                break;
            case 3:
                this.f271b = new AtomicReference(L.b.f1445b);
                this.f272c = new Object();
                break;
            default:
                this.f273d = new X1.e(1);
                break;
        }
    }

    public a(Y.b bVar) {
        this.f270a = 6;
        this.f273d = bVar;
        this.f271b = new t(15, this);
    }

    public a(Context context, TypedArray typedArray) {
        this.f270a = 8;
        this.f271b = context;
        this.f272c = typedArray;
    }

    public a(e eVar) {
        this.f270a = 4;
        this.f271b = new ArrayList();
        this.f272c = new N0.b();
        this.f273d = eVar;
    }

    public a(C0589c c0589c) {
        this.f270a = 12;
        this.f271b = new f(30);
        this.f272c = new ArrayList();
        this.f273d = new ArrayList();
        new C0589c(17, this);
    }

    public a(D1.w wVar, X1.e eVar, o1.d dVar, Set set) {
        this.f270a = 10;
        this.f271b = eVar;
        this.f272c = wVar;
        this.f273d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            B(str, 0, str.length(), 1, true, new D2.w(str, 1));
        }
    }

    public a(z0.t tVar, a aVar) {
        this.f270a = 1;
        this.f271b = tVar;
        this.f272c = aVar;
        this.f273d = tVar.f6941d;
    }

    public a(C0444z c0444z) {
        this.f270a = 9;
        this.f271b = c0444z;
        this.f272c = new ArrayList();
        this.f273d = c0444z;
    }
}
