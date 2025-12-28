package j;

import a2.ViewOnAttachStateChangeListenerC0115n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import k.C0332r0;
import k.C0334s0;

/* loaded from: classes.dex */
public final class s extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: e, reason: collision with root package name */
    public final Context f4577e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4578f;

    /* renamed from: g, reason: collision with root package name */
    public final g f4579g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4580i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4581j;

    /* renamed from: k, reason: collision with root package name */
    public final C0334s0 f4582k;

    /* renamed from: n, reason: collision with root package name */
    public l f4585n;

    /* renamed from: o, reason: collision with root package name */
    public View f4586o;

    /* renamed from: p, reason: collision with root package name */
    public View f4587p;

    /* renamed from: q, reason: collision with root package name */
    public o f4588q;

    /* renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f4589r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4590s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4591t;

    /* renamed from: u, reason: collision with root package name */
    public int f4592u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4594w;

    /* renamed from: l, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0291c f4583l = new ViewTreeObserverOnGlobalLayoutListenerC0291c(this, 1);

    /* renamed from: m, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0115n f4584m = new ViewOnAttachStateChangeListenerC0115n(2, this);

    /* renamed from: v, reason: collision with root package name */
    public int f4593v = 0;

    public s(int i3, Context context, View view, i iVar, boolean z3) {
        this.f4577e = context;
        this.f4578f = iVar;
        this.h = z3;
        this.f4579g = new g(iVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f4581j = i3;
        Resources resources = context.getResources();
        this.f4580i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4586o = view;
        this.f4582k = new C0334s0(context, i3);
        iVar.b(this, context);
    }

    @Override // j.p
    public final void a(i iVar, boolean z3) {
        if (iVar != this.f4578f) {
            return;
        }
        e();
        o oVar = this.f4588q;
        if (oVar != null) {
            oVar.a(iVar, z3);
        }
    }

    @Override // j.r
    public final void b() {
        View view;
        if (h()) {
            return;
        }
        if (this.f4590s || (view = this.f4586o) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4587p = view;
        C0334s0 c0334s0 = this.f4582k;
        c0334s0.f4842y.setOnDismissListener(this);
        c0334s0.f4833p = this;
        c0334s0.f4841x = true;
        c0334s0.f4842y.setFocusable(true);
        View view2 = this.f4587p;
        boolean z3 = this.f4589r == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4589r = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4583l);
        }
        view2.addOnAttachStateChangeListener(this.f4584m);
        c0334s0.f4832o = view2;
        c0334s0.f4830m = this.f4593v;
        boolean z4 = this.f4591t;
        Context context = this.f4577e;
        g gVar = this.f4579g;
        if (!z4) {
            this.f4592u = k.n(gVar, context, this.f4580i);
            this.f4591t = true;
        }
        int i3 = this.f4592u;
        Drawable background = c0334s0.f4842y.getBackground();
        if (background != null) {
            Rect rect = c0334s0.f4839v;
            background.getPadding(rect);
            c0334s0.f4825g = rect.left + rect.right + i3;
        } else {
            c0334s0.f4825g = i3;
        }
        c0334s0.f4842y.setInputMethodMode(2);
        Rect rect2 = this.f4565d;
        c0334s0.f4840w = rect2 != null ? new Rect(rect2) : null;
        c0334s0.b();
        C0332r0 c0332r0 = c0334s0.f4824f;
        c0332r0.setOnKeyListener(this);
        if (this.f4594w) {
            i iVar = this.f4578f;
            if (iVar.f4529l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0332r0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(iVar.f4529l);
                }
                frameLayout.setEnabled(false);
                c0332r0.addHeaderView(frameLayout, null, false);
            }
        }
        c0334s0.a(gVar);
        c0334s0.b();
    }

    @Override // j.p
    public final boolean d() {
        return false;
    }

    @Override // j.r
    public final void e() {
        if (h()) {
            this.f4582k.e();
        }
    }

    @Override // j.p
    public final void g() {
        this.f4591t = false;
        g gVar = this.f4579g;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final boolean h() {
        return !this.f4590s && this.f4582k.f4842y.isShowing();
    }

    @Override // j.r
    public final ListView i() {
        return this.f4582k.f4824f;
    }

    @Override // j.p
    public final void k(o oVar) {
        this.f4588q = oVar;
    }

    @Override // j.p
    public final boolean l(t tVar) {
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f4581j, this.f4577e, this.f4587p, tVar, this.h);
            o oVar = this.f4588q;
            nVar.h = oVar;
            k kVar = nVar.f4574i;
            if (kVar != null) {
                kVar.k(oVar);
            }
            boolean v3 = k.v(tVar);
            nVar.f4573g = v3;
            k kVar2 = nVar.f4574i;
            if (kVar2 != null) {
                kVar2.p(v3);
            }
            nVar.f4575j = this.f4585n;
            this.f4585n = null;
            this.f4578f.c(false);
            C0334s0 c0334s0 = this.f4582k;
            int i3 = c0334s0.h;
            int i4 = !c0334s0.f4827j ? 0 : c0334s0.f4826i;
            int i5 = this.f4593v;
            View view = this.f4586o;
            Field field = AbstractC0189K.f4150a;
            if ((Gravity.getAbsoluteGravity(i5, view.getLayoutDirection()) & 7) == 5) {
                i3 += this.f4586o.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f4571e != null) {
                    nVar.d(i3, i4, true, true);
                }
            }
            o oVar2 = this.f4588q;
            if (oVar2 != null) {
                oVar2.c(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // j.k
    public final void m(i iVar) {
    }

    @Override // j.k
    public final void o(View view) {
        this.f4586o = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4590s = true;
        this.f4578f.c(true);
        ViewTreeObserver viewTreeObserver = this.f4589r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4589r = this.f4587p.getViewTreeObserver();
            }
            this.f4589r.removeGlobalOnLayoutListener(this.f4583l);
            this.f4589r = null;
        }
        this.f4587p.removeOnAttachStateChangeListener(this.f4584m);
        l lVar = this.f4585n;
        if (lVar != null) {
            lVar.onDismiss();
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
        this.f4579g.f4515f = z3;
    }

    @Override // j.k
    public final void q(int i3) {
        this.f4593v = i3;
    }

    @Override // j.k
    public final void r(int i3) {
        this.f4582k.h = i3;
    }

    @Override // j.k
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.f4585n = (l) onDismissListener;
    }

    @Override // j.k
    public final void t(boolean z3) {
        this.f4594w = z3;
    }

    @Override // j.k
    public final void u(int i3) {
        C0334s0 c0334s0 = this.f4582k;
        c0334s0.f4826i = i3;
        c0334s0.f4827j = true;
    }
}
