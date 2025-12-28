package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.ai.assistance.operit.provider.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312h implements j.p {

    /* renamed from: d, reason: collision with root package name */
    public final Context f4777d;

    /* renamed from: e, reason: collision with root package name */
    public Context f4778e;

    /* renamed from: f, reason: collision with root package name */
    public j.i f4779f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f4780g;
    public j.o h;

    /* renamed from: j, reason: collision with root package name */
    public ActionMenuView f4782j;

    /* renamed from: k, reason: collision with root package name */
    public C0310g f4783k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4784l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4785m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4786n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4787o;

    /* renamed from: p, reason: collision with root package name */
    public int f4788p;

    /* renamed from: q, reason: collision with root package name */
    public int f4789q;

    /* renamed from: r, reason: collision with root package name */
    public int f4790r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4791s;

    /* renamed from: u, reason: collision with root package name */
    public C0306e f4793u;

    /* renamed from: v, reason: collision with root package name */
    public C0306e f4794v;

    /* renamed from: w, reason: collision with root package name */
    public D2.h f4795w;

    /* renamed from: x, reason: collision with root package name */
    public C0308f f4796x;

    /* renamed from: i, reason: collision with root package name */
    public final int f4781i = R.layout.abc_action_menu_item_layout;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f4792t = new SparseBooleanArray();

    /* renamed from: y, reason: collision with root package name */
    public final A.t f4797y = new A.t(28, this);

    public C0312h(Context context) {
        this.f4777d = context;
        this.f4780g = LayoutInflater.from(context);
    }

    @Override // j.p
    public final void a(j.i iVar, boolean z3) {
        e();
        C0306e c0306e = this.f4794v;
        if (c0306e != null && c0306e.b()) {
            c0306e.f4574i.e();
        }
        j.o oVar = this.h;
        if (oVar != null) {
            oVar.a(iVar, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j.q] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(j.j jVar, View view, ActionMenuView actionMenuView) {
        View view2 = jVar.f4564z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || jVar.c()) {
            ActionMenuItemView actionMenuItemView = view instanceof j.q ? (j.q) view : (j.q) this.f4780g.inflate(this.f4781i, (ViewGroup) actionMenuView, false);
            actionMenuItemView.c(jVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f4782j);
            if (this.f4796x == null) {
                this.f4796x = new C0308f(this);
            }
            actionMenuItemView2.setPopupCallback(this.f4796x);
            view2 = actionMenuItemView;
        }
        view2.setVisibility(jVar.f4539B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0316j)) {
            view2.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view2;
    }

    @Override // j.p
    public final void c(Context context, j.i iVar) {
        this.f4778e = context;
        LayoutInflater.from(context);
        this.f4779f = iVar;
        Resources resources = context.getResources();
        if (!this.f4787o) {
            this.f4786n = true;
        }
        int i3 = 2;
        this.f4788p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i3 = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.f4790r = i3;
        int i6 = this.f4788p;
        if (this.f4786n) {
            if (this.f4783k == null) {
                C0310g c0310g = new C0310g(this, this.f4777d);
                this.f4783k = c0310g;
                if (this.f4785m) {
                    c0310g.setImageDrawable(this.f4784l);
                    this.f4784l = null;
                    this.f4785m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4783k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f4783k.getMeasuredWidth();
        } else {
            this.f4783k = null;
        }
        this.f4789q = i6;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // j.p
    public final boolean d() {
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z3;
        j.i iVar = this.f4779f;
        if (iVar != null) {
            arrayList = iVar.k();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i5 = this.f4790r;
        int i6 = this.f4789q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f4782j;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i7 >= i3) {
                break;
            }
            j.j jVar = (j.j) arrayList.get(i7);
            int i10 = jVar.f4563y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z4 = true;
            }
            if (this.f4791s && jVar.f4539B) {
                i5 = 0;
            }
            i7++;
        }
        if (this.f4786n && (z4 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = this.f4792t;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            j.j jVar2 = (j.j) arrayList.get(i12);
            int i14 = jVar2.f4563y;
            boolean z5 = (i14 & 2) == i4 ? z3 : false;
            int i15 = jVar2.f4541b;
            if (z5) {
                View b3 = b(jVar2, null, actionMenuView);
                b3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b3.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z3);
                }
                jVar2.f(z3);
            } else if ((i14 & 1) == z3) {
                boolean z6 = sparseBooleanArray.get(i15);
                boolean z7 = ((i11 > 0 || z6) && i6 > 0) ? z3 : false;
                if (z7) {
                    View b4 = b(jVar2, null, actionMenuView);
                    b4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z7 &= i6 + i13 > 0;
                }
                if (z7 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z6) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        j.j jVar3 = (j.j) arrayList.get(i16);
                        if (jVar3.f4541b == i15) {
                            if (jVar3.d()) {
                                i11++;
                            }
                            jVar3.f(false);
                        }
                    }
                }
                if (z7) {
                    i11--;
                }
                jVar2.f(z7);
            } else {
                jVar2.f(false);
                i12++;
                i4 = 2;
                z3 = true;
            }
            i12++;
            i4 = 2;
            z3 = true;
        }
        return z3;
    }

    public final boolean e() {
        ActionMenuView actionMenuView;
        D2.h hVar = this.f4795w;
        if (hVar != null && (actionMenuView = this.f4782j) != null) {
            actionMenuView.removeCallbacks(hVar);
            this.f4795w = null;
            return true;
        }
        C0306e c0306e = this.f4793u;
        if (c0306e == null) {
            return false;
        }
        if (c0306e.b()) {
            c0306e.f4574i.e();
        }
        return true;
    }

    @Override // j.p
    public final boolean f(j.j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.p
    public final void g() {
        int i3;
        ActionMenuView actionMenuView = this.f4782j;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (actionMenuView != null) {
            j.i iVar = this.f4779f;
            if (iVar != null) {
                iVar.i();
                ArrayList k3 = this.f4779f.k();
                int size = k3.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    j.j jVar = (j.j) k3.get(i4);
                    if (jVar.d()) {
                        View childAt = actionMenuView.getChildAt(i3);
                        j.j itemData = childAt instanceof j.q ? ((j.q) childAt).getItemData() : null;
                        View b3 = b(jVar, childAt, actionMenuView);
                        if (jVar != itemData) {
                            b3.setPressed(false);
                            b3.jumpDrawablesToCurrentState();
                        }
                        if (b3 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) b3.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b3);
                            }
                            this.f4782j.addView(b3, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i3) == this.f4783k) {
                    i3++;
                } else {
                    actionMenuView.removeViewAt(i3);
                }
            }
        }
        this.f4782j.requestLayout();
        j.i iVar2 = this.f4779f;
        if (iVar2 != null) {
            iVar2.i();
            ArrayList arrayList2 = iVar2.f4526i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((j.j) arrayList2.get(i5)).getClass();
            }
        }
        j.i iVar3 = this.f4779f;
        if (iVar3 != null) {
            iVar3.i();
            arrayList = iVar3.f4527j;
        }
        if (this.f4786n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((j.j) arrayList.get(0)).f4539B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f4783k == null) {
                this.f4783k = new C0310g(this, this.f4777d);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f4783k.getParent();
            if (viewGroup2 != this.f4782j) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f4783k);
                }
                ActionMenuView actionMenuView2 = this.f4782j;
                C0310g c0310g = this.f4783k;
                actionMenuView2.getClass();
                C0316j i6 = ActionMenuView.i();
                i6.f4800a = true;
                actionMenuView2.addView(c0310g, i6);
            }
        } else {
            C0310g c0310g2 = this.f4783k;
            if (c0310g2 != null) {
                ViewParent parent = c0310g2.getParent();
                ActionMenuView actionMenuView3 = this.f4782j;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f4783k);
                }
            }
        }
        this.f4782j.setOverflowReserved(this.f4786n);
    }

    public final boolean h() {
        j.i iVar;
        if (!this.f4786n) {
            return false;
        }
        C0306e c0306e = this.f4793u;
        if ((c0306e != null && c0306e.b()) || (iVar = this.f4779f) == null || this.f4782j == null || this.f4795w != null) {
            return false;
        }
        iVar.i();
        if (iVar.f4527j.isEmpty()) {
            return false;
        }
        D2.h hVar = new D2.h(this, 4, new C0306e(this, this.f4778e, this.f4779f, this.f4783k));
        this.f4795w = hVar;
        this.f4782j.post(hVar);
        return true;
    }

    @Override // j.p
    public final boolean j(j.j jVar) {
        return false;
    }

    @Override // j.p
    public final void k(j.o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.p
    public final boolean l(j.t tVar) {
        boolean z3;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        j.t tVar2 = tVar;
        while (true) {
            j.i iVar = tVar2.f4595v;
            if (iVar == this.f4779f) {
                break;
            }
            tVar2 = (j.t) iVar;
        }
        ActionMenuView actionMenuView = this.f4782j;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i3);
                if ((childAt instanceof j.q) && ((j.q) childAt).getItemData() == tVar2.f4596w) {
                    view = childAt;
                    break;
                }
                i3++;
            }
        }
        if (view == null) {
            return false;
        }
        tVar.f4596w.getClass();
        int size = tVar.f4524f.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = false;
                break;
            }
            MenuItem item = tVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i4++;
        }
        C0306e c0306e = new C0306e(this, this.f4778e, tVar, view);
        this.f4794v = c0306e;
        c0306e.f4573g = z3;
        j.k kVar = c0306e.f4574i;
        if (kVar != null) {
            kVar.p(z3);
        }
        C0306e c0306e2 = this.f4794v;
        if (!c0306e2.b()) {
            if (c0306e2.f4571e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0306e2.d(0, 0, false, false);
        }
        j.o oVar = this.h;
        if (oVar != null) {
            oVar.c(tVar);
        }
        return true;
    }
}
