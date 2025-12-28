package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: k.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0323m0 implements j.r {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f4820A;

    /* renamed from: z, reason: collision with root package name */
    public static final Method f4821z;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4822d;

    /* renamed from: e, reason: collision with root package name */
    public ListAdapter f4823e;

    /* renamed from: f, reason: collision with root package name */
    public C0332r0 f4824f;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f4826i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4827j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4828k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4829l;

    /* renamed from: n, reason: collision with root package name */
    public C0317j0 f4831n;

    /* renamed from: o, reason: collision with root package name */
    public View f4832o;

    /* renamed from: p, reason: collision with root package name */
    public j.k f4833p;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f4838u;

    /* renamed from: w, reason: collision with root package name */
    public Rect f4840w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4841x;

    /* renamed from: y, reason: collision with root package name */
    public final C0343x f4842y;

    /* renamed from: g, reason: collision with root package name */
    public int f4825g = -2;

    /* renamed from: m, reason: collision with root package name */
    public int f4830m = 0;

    /* renamed from: q, reason: collision with root package name */
    public final RunnableC0315i0 f4834q = new RunnableC0315i0(this, 1);

    /* renamed from: r, reason: collision with root package name */
    public final ViewOnTouchListenerC0321l0 f4835r = new ViewOnTouchListenerC0321l0(this);

    /* renamed from: s, reason: collision with root package name */
    public final C0319k0 f4836s = new C0319k0(this);

    /* renamed from: t, reason: collision with root package name */
    public final RunnableC0315i0 f4837t = new RunnableC0315i0(this, 0);

    /* renamed from: v, reason: collision with root package name */
    public final Rect f4839v = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4821z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f4820A = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC0323m0(Context context, int i3) {
        int resourceId;
        this.f4822d = context;
        this.f4838u = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0262a.f4301l, i3, 0);
        this.h = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4826i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4827j = true;
        }
        obtainStyledAttributes.recycle();
        C0343x c0343x = new C0343x(context, null, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0262a.f4305p, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            j1.k.c(c0343x, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0343x.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : Z.b.r(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f4842y = c0343x;
        c0343x.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        C0317j0 c0317j0 = this.f4831n;
        if (c0317j0 == null) {
            this.f4831n = new C0317j0(0, this);
        } else {
            ListAdapter listAdapter2 = this.f4823e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0317j0);
            }
        }
        this.f4823e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4831n);
        }
        C0332r0 c0332r0 = this.f4824f;
        if (c0332r0 != null) {
            c0332r0.setAdapter(this.f4823e);
        }
    }

    @Override // j.r
    public final void b() {
        int i3;
        C0332r0 c0332r0;
        C0332r0 c0332r02 = this.f4824f;
        C0343x c0343x = this.f4842y;
        Context context = this.f4822d;
        if (c0332r02 == null) {
            C0332r0 c0332r03 = new C0332r0(context, !this.f4841x);
            c0332r03.setHoverListener((C0334s0) this);
            this.f4824f = c0332r03;
            c0332r03.setAdapter(this.f4823e);
            this.f4824f.setOnItemClickListener(this.f4833p);
            this.f4824f.setFocusable(true);
            this.f4824f.setFocusableInTouchMode(true);
            this.f4824f.setOnItemSelectedListener(new C0309f0(r0, this));
            this.f4824f.setOnScrollListener(this.f4836s);
            c0343x.setContentView(this.f4824f);
        }
        Drawable background = c0343x.getBackground();
        Rect rect = this.f4839v;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i3 = rect.bottom + i4;
            if (!this.f4827j) {
                this.f4826i = -i4;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int a3 = AbstractC0311g0.a(c0343x, this.f4832o, this.f4826i, c0343x.getInputMethodMode() == 2);
        int i5 = this.f4825g;
        int a4 = this.f4824f.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a3);
        int paddingBottom = a4 + (a4 > 0 ? this.f4824f.getPaddingBottom() + this.f4824f.getPaddingTop() + i3 : 0);
        this.f4842y.getInputMethodMode();
        j1.k.d(c0343x, 1002);
        if (c0343x.isShowing()) {
            View view = this.f4832o;
            Field field = AbstractC0189K.f4150a;
            if (view.isAttachedToWindow()) {
                int i6 = this.f4825g;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.f4832o.getWidth();
                }
                c0343x.setOutsideTouchable(true);
                c0343x.update(this.f4832o, this.h, this.f4826i, i6 < 0 ? -1 : i6, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i7 = this.f4825g;
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = this.f4832o.getWidth();
        }
        c0343x.setWidth(i7);
        c0343x.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f4821z;
            if (method != null) {
                try {
                    method.invoke(c0343x, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0313h0.b(c0343x, true);
        }
        c0343x.setOutsideTouchable(true);
        c0343x.setTouchInterceptor(this.f4835r);
        if (this.f4829l) {
            j1.k.c(c0343x, this.f4828k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f4820A;
            if (method2 != null) {
                try {
                    method2.invoke(c0343x, this.f4840w);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            AbstractC0313h0.a(c0343x, this.f4840w);
        }
        c0343x.showAsDropDown(this.f4832o, this.h, this.f4826i, this.f4830m);
        this.f4824f.setSelection(-1);
        if ((!this.f4841x || this.f4824f.isInTouchMode()) && (c0332r0 = this.f4824f) != null) {
            c0332r0.setListSelectionHidden(true);
            c0332r0.requestLayout();
        }
        if (this.f4841x) {
            return;
        }
        this.f4838u.post(this.f4837t);
    }

    @Override // j.r
    public final void e() {
        C0343x c0343x = this.f4842y;
        c0343x.dismiss();
        c0343x.setContentView(null);
        this.f4824f = null;
        this.f4838u.removeCallbacks(this.f4834q);
    }

    @Override // j.r
    public final boolean h() {
        return this.f4842y.isShowing();
    }

    @Override // j.r
    public final ListView i() {
        return this.f4824f;
    }
}
