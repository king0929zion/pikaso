package j;

import a2.ViewOnAttachStateChangeListenerC0115n;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.AbstractC0327o0;
import k.C0334s0;

/* loaded from: classes.dex */
public final class f extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public ViewTreeObserver f4489A;

    /* renamed from: B, reason: collision with root package name */
    public l f4490B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4491C;

    /* renamed from: e, reason: collision with root package name */
    public final Context f4492e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4493f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4494g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f4495i;

    /* renamed from: q, reason: collision with root package name */
    public View f4503q;

    /* renamed from: r, reason: collision with root package name */
    public View f4504r;

    /* renamed from: s, reason: collision with root package name */
    public int f4505s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4506t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4507u;

    /* renamed from: v, reason: collision with root package name */
    public int f4508v;

    /* renamed from: w, reason: collision with root package name */
    public int f4509w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4511y;

    /* renamed from: z, reason: collision with root package name */
    public o f4512z;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4496j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4497k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0291c f4498l = new ViewTreeObserverOnGlobalLayoutListenerC0291c(this, 0);

    /* renamed from: m, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0115n f4499m = new ViewOnAttachStateChangeListenerC0115n(1, this);

    /* renamed from: n, reason: collision with root package name */
    public final A.t f4500n = new A.t(26, this);

    /* renamed from: o, reason: collision with root package name */
    public int f4501o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4502p = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4510x = false;

    public f(Context context, View view, int i3, boolean z3) {
        this.f4492e = context;
        this.f4503q = view;
        this.f4494g = i3;
        this.h = z3;
        Field field = AbstractC0189K.f4150a;
        this.f4505s = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f4493f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4495i = new Handler();
    }

    @Override // j.p
    public final void a(i iVar, boolean z3) {
        ArrayList arrayList = this.f4497k;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i3)).f4487b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            ((e) arrayList.get(i4)).f4487b.c(false);
        }
        e eVar = (e) arrayList.remove(i3);
        CopyOnWriteArrayList copyOnWriteArrayList = eVar.f4487b.f4535r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z4 = this.f4491C;
        C0334s0 c0334s0 = eVar.f4486a;
        if (z4) {
            AbstractC0327o0.b(c0334s0.f4842y, null);
            c0334s0.f4842y.setAnimationStyle(0);
        }
        c0334s0.e();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4505s = ((e) arrayList.get(size2 - 1)).f4488c;
        } else {
            View view = this.f4503q;
            Field field = AbstractC0189K.f4150a;
            this.f4505s = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((e) arrayList.get(0)).f4487b.c(false);
                return;
            }
            return;
        }
        e();
        o oVar = this.f4512z;
        if (oVar != null) {
            oVar.a(iVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4489A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4489A.removeGlobalOnLayoutListener(this.f4498l);
            }
            this.f4489A = null;
        }
        this.f4504r.removeOnAttachStateChangeListener(this.f4499m);
        this.f4490B.onDismiss();
    }

    @Override // j.r
    public final void b() {
        if (h()) {
            return;
        }
        ArrayList arrayList = this.f4496j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w((i) it.next());
        }
        arrayList.clear();
        View view = this.f4503q;
        this.f4504r = view;
        if (view != null) {
            boolean z3 = this.f4489A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4489A = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4498l);
            }
            this.f4504r.addOnAttachStateChangeListener(this.f4499m);
        }
    }

    @Override // j.p
    public final boolean d() {
        return false;
    }

    @Override // j.r
    public final void e() {
        ArrayList arrayList = this.f4497k;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                e eVar = eVarArr[i3];
                if (eVar.f4486a.f4842y.isShowing()) {
                    eVar.f4486a.e();
                }
            }
        }
    }

    @Override // j.p
    public final void g() {
        Iterator it = this.f4497k.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f4486a.f4824f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final boolean h() {
        ArrayList arrayList = this.f4497k;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f4486a.f4842y.isShowing();
    }

    @Override // j.r
    public final ListView i() {
        ArrayList arrayList = this.f4497k;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f4486a.f4824f;
    }

    @Override // j.p
    public final void k(o oVar) {
        this.f4512z = oVar;
    }

    @Override // j.p
    public final boolean l(t tVar) {
        Iterator it = this.f4497k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (tVar == eVar.f4487b) {
                eVar.f4486a.f4824f.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        m(tVar);
        o oVar = this.f4512z;
        if (oVar != null) {
            oVar.c(tVar);
        }
        return true;
    }

    @Override // j.k
    public final void m(i iVar) {
        iVar.b(this, this.f4492e);
        if (h()) {
            w(iVar);
        } else {
            this.f4496j.add(iVar);
        }
    }

    @Override // j.k
    public final void o(View view) {
        if (this.f4503q != view) {
            this.f4503q = view;
            int i3 = this.f4501o;
            Field field = AbstractC0189K.f4150a;
            this.f4502p = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f4497k;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i3);
            if (!eVar.f4486a.f4842y.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (eVar != null) {
            eVar.f4487b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        e();
        return true;
    }

    @Override // j.k
    public final void p(boolean z3) {
        this.f4510x = z3;
    }

    @Override // j.k
    public final void q(int i3) {
        if (this.f4501o != i3) {
            this.f4501o = i3;
            View view = this.f4503q;
            Field field = AbstractC0189K.f4150a;
            this.f4502p = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // j.k
    public final void r(int i3) {
        this.f4506t = true;
        this.f4508v = i3;
    }

    @Override // j.k
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f4490B = (l) onDismissListener;
    }

    @Override // j.k
    public final void t(boolean z3) {
        this.f4511y = z3;
    }

    @Override // j.k
    public final void u(int i3) {
        this.f4507u = true;
        this.f4509w = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0151, code lost:
    
        if (((r8.getWidth() + r10[0]) + r5) > r11.right) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0153, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0156, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015b, code lost:
    
        if ((r10[0] - r5) < 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(j.i r17) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.w(j.i):void");
    }
}
