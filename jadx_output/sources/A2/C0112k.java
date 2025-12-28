package a2;

import a.AbstractC0090a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.textfield.TextInputLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;

/* renamed from: a2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112k extends AbstractC0118q {

    /* renamed from: e, reason: collision with root package name */
    public final int f2980e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2981f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2982g;
    public AutoCompleteTextView h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewOnClickListenerC0102a f2983i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0103b f2984j;

    /* renamed from: k, reason: collision with root package name */
    public final N.g f2985k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2986l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2987m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2988n;

    /* renamed from: o, reason: collision with root package name */
    public long f2989o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2990p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f2991q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f2992r;

    public C0112k(C0117p c0117p) {
        super(c0117p);
        int i3 = 1;
        this.f2983i = new ViewOnClickListenerC0102a(this, i3);
        this.f2984j = new ViewOnFocusChangeListenerC0103b(this, i3);
        this.f2985k = new N.g(this);
        this.f2989o = Long.MAX_VALUE;
        this.f2981f = AbstractC0090a.a0(c0117p.getContext(), R.attr.motionDurationShort3, 67);
        this.f2980e = AbstractC0090a.a0(c0117p.getContext(), R.attr.motionDurationShort3, 50);
        this.f2982g = AbstractC0090a.b0(c0117p.getContext(), R.attr.motionEasingLinearInterpolator, I1.a.f1390a);
    }

    @Override // a2.AbstractC0118q
    public final void a() {
        if (this.f2990p.isTouchExplorationEnabled() && Z.b.A(this.h) && !this.f3025d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new R.a(4, this));
    }

    @Override // a2.AbstractC0118q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // a2.AbstractC0118q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // a2.AbstractC0118q
    public final View.OnFocusChangeListener e() {
        return this.f2984j;
    }

    @Override // a2.AbstractC0118q
    public final View.OnClickListener f() {
        return this.f2983i;
    }

    @Override // a2.AbstractC0118q
    public final N.g h() {
        return this.f2985k;
    }

    @Override // a2.AbstractC0118q
    public final boolean i(int i3) {
        return i3 != 0;
    }

    @Override // a2.AbstractC0118q
    public final boolean j() {
        return this.f2986l;
    }

    @Override // a2.AbstractC0118q
    public final boolean l() {
        return this.f2988n;
    }

    @Override // a2.AbstractC0118q
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: a2.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0112k c0112k = C0112k.this;
                c0112k.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - c0112k.f2989o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        c0112k.f2987m = false;
                    }
                    c0112k.u();
                    c0112k.f2987m = true;
                    c0112k.f2989o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: a2.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0112k c0112k = C0112k.this;
                c0112k.f2987m = true;
                c0112k.f2989o = System.currentTimeMillis();
                c0112k.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f3022a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!Z.b.A(editText) && this.f2990p.isTouchExplorationEnabled()) {
            Field field = AbstractC0189K.f4150a;
            this.f3025d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // a2.AbstractC0118q
    public final void n(e1.j jVar) {
        if (!Z.b.A(this.h)) {
            jVar.h(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f4278a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // a2.AbstractC0118q
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f2990p.isEnabled() || Z.b.A(this.h)) {
            return;
        }
        boolean z3 = accessibilityEvent.getEventType() == 32768 && this.f2988n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z3) {
            u();
            this.f2987m = true;
            this.f2989o = System.currentTimeMillis();
        }
    }

    @Override // a2.AbstractC0118q
    public final void r() {
        int i3 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2982g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f2981f);
        ofFloat.addUpdateListener(new C0104c(this, i3));
        this.f2992r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f2980e);
        ofFloat2.addUpdateListener(new C0104c(this, i3));
        this.f2991q = ofFloat2;
        ofFloat2.addListener(new D1.l(i3, this));
        this.f2990p = (AccessibilityManager) this.f3024c.getSystemService("accessibility");
    }

    @Override // a2.AbstractC0118q
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z3) {
        if (this.f2988n != z3) {
            this.f2988n = z3;
            this.f2992r.cancel();
            this.f2991q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f2989o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f2987m = false;
        }
        if (this.f2987m) {
            this.f2987m = false;
            return;
        }
        t(!this.f2988n);
        if (!this.f2988n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
