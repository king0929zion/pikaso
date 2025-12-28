package a2;

import A.AbstractC0000a;
import a.AbstractC0090a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.J;

/* renamed from: a2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117p extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3001d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f3002e;

    /* renamed from: f, reason: collision with root package name */
    public final CheckableImageButton f3003f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3004g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f3005i;

    /* renamed from: j, reason: collision with root package name */
    public final CheckableImageButton f3006j;

    /* renamed from: k, reason: collision with root package name */
    public final C0116o f3007k;

    /* renamed from: l, reason: collision with root package name */
    public int f3008l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f3009m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f3010n;

    /* renamed from: o, reason: collision with root package name */
    public PorterDuff.Mode f3011o;

    /* renamed from: p, reason: collision with root package name */
    public int f3012p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView.ScaleType f3013q;

    /* renamed from: r, reason: collision with root package name */
    public View.OnLongClickListener f3014r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f3015s;

    /* renamed from: t, reason: collision with root package name */
    public final J f3016t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3017u;

    /* renamed from: v, reason: collision with root package name */
    public EditText f3018v;

    /* renamed from: w, reason: collision with root package name */
    public final AccessibilityManager f3019w;

    /* renamed from: x, reason: collision with root package name */
    public N.g f3020x;

    /* renamed from: y, reason: collision with root package name */
    public final C0113l f3021y;

    public C0117p(TextInputLayout textInputLayout, B0.a aVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i3 = 0;
        this.f3008l = 0;
        this.f3009m = new LinkedHashSet();
        this.f3021y = new C0113l(this);
        C0114m c0114m = new C0114m(this);
        this.f3019w = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3001d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3002e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a3 = a(this, from, R.id.text_input_error_icon);
        this.f3003f = a3;
        CheckableImageButton a4 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f3006j = a4;
        this.f3007k = new C0116o(this, aVar);
        J j3 = new J(getContext(), null);
        this.f3016t = j3;
        TypedArray typedArray = (TypedArray) aVar.f272c;
        if (typedArray.hasValue(38)) {
            this.f3004g = AbstractC0090a.E(getContext(), aVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.h = S1.k.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(aVar.m(37));
        }
        a3.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        Field field = AbstractC0189K.f4150a;
        a3.setImportantForAccessibility(2);
        a3.setClickable(false);
        a3.setPressable(false);
        a3.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f3010n = AbstractC0090a.E(getContext(), aVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f3011o = S1.k.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a4.getContentDescription() != (text = typedArray.getText(27))) {
                a4.setContentDescription(text);
            }
            a4.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f3010n = AbstractC0090a.E(getContext(), aVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f3011o = S1.k.f(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a4.getContentDescription() != text2) {
                a4.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3012p) {
            this.f3012p = dimensionPixelSize;
            a4.setMinimumWidth(dimensionPixelSize);
            a4.setMinimumHeight(dimensionPixelSize);
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType o3 = Z0.d.o(typedArray.getInt(31, -1));
            this.f3013q = o3;
            a4.setScaleType(o3);
            a3.setScaleType(o3);
        }
        j3.setVisibility(8);
        j3.setId(R.id.textinput_suffix_text);
        j3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        j3.setAccessibilityLiveRegion(1);
        j3.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            j3.setTextColor(aVar.k(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f3015s = TextUtils.isEmpty(text3) ? null : text3;
        j3.setText(text3);
        n();
        frameLayout.addView(a4);
        addView(j3);
        addView(frameLayout);
        addView(a3);
        textInputLayout.f4061h0.add(c0114m);
        if (textInputLayout.f4059g != null) {
            c0114m.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0115n(i3, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i3) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i3);
        if (AbstractC0090a.Q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final AbstractC0118q b() {
        AbstractC0118q c0107f;
        int i3 = this.f3008l;
        C0116o c0116o = this.f3007k;
        SparseArray sparseArray = c0116o.f2997a;
        AbstractC0118q abstractC0118q = (AbstractC0118q) sparseArray.get(i3);
        if (abstractC0118q == null) {
            C0117p c0117p = c0116o.f2998b;
            if (i3 == -1) {
                c0107f = new C0107f(c0117p, 0);
            } else if (i3 == 0) {
                c0107f = new C0107f(c0117p, 1);
            } else if (i3 == 1) {
                abstractC0118q = new u(c0117p, c0116o.f3000d);
                sparseArray.append(i3, abstractC0118q);
            } else if (i3 == 2) {
                c0107f = new C0106e(c0117p);
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException(AbstractC0000a.c("Invalid end icon mode: ", i3));
                }
                c0107f = new C0112k(c0117p);
            }
            abstractC0118q = c0107f;
            sparseArray.append(i3, abstractC0118q);
        }
        return abstractC0118q;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f3006j;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        Field field = AbstractC0189K.f4150a;
        return this.f3016t.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f3002e.getVisibility() == 0 && this.f3006j.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f3003f.getVisibility() == 0;
    }

    public final void f(boolean z3) {
        boolean z4;
        boolean isActivated;
        boolean z5;
        AbstractC0118q b3 = b();
        boolean k3 = b3.k();
        CheckableImageButton checkableImageButton = this.f3006j;
        boolean z6 = true;
        if (!k3 || (z5 = checkableImageButton.f3982g) == b3.l()) {
            z4 = false;
        } else {
            checkableImageButton.setChecked(!z5);
            z4 = true;
        }
        if (!(b3 instanceof C0112k) || (isActivated = checkableImageButton.isActivated()) == b3.j()) {
            z6 = z4;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z3 || z6) {
            Z0.d.M(this.f3001d, checkableImageButton, this.f3010n);
        }
    }

    public final void g(int i3) {
        if (this.f3008l == i3) {
            return;
        }
        AbstractC0118q b3 = b();
        N.g gVar = this.f3020x;
        AccessibilityManager accessibilityManager = this.f3019w;
        if (gVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new e1.b(gVar));
        }
        this.f3020x = null;
        b3.s();
        this.f3008l = i3;
        Iterator it = this.f3009m.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i3 != 0);
        AbstractC0118q b4 = b();
        int i4 = this.f3007k.f2999c;
        if (i4 == 0) {
            i4 = b4.d();
        }
        Drawable r3 = i4 != 0 ? Z.b.r(getContext(), i4) : null;
        CheckableImageButton checkableImageButton = this.f3006j;
        checkableImageButton.setImageDrawable(r3);
        TextInputLayout textInputLayout = this.f3001d;
        if (r3 != null) {
            Z0.d.g(textInputLayout, checkableImageButton, this.f3010n, this.f3011o);
            Z0.d.M(textInputLayout, checkableImageButton, this.f3010n);
        }
        int c3 = b4.c();
        CharSequence text = c3 != 0 ? getResources().getText(c3) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b4.k());
        if (!b4.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i3);
        }
        b4.r();
        N.g h = b4.h();
        this.f3020x = h;
        if (h != null && accessibilityManager != null) {
            Field field = AbstractC0189K.f4150a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new e1.b(this.f3020x));
            }
        }
        View.OnClickListener f3 = b4.f();
        View.OnLongClickListener onLongClickListener = this.f3014r;
        checkableImageButton.setOnClickListener(f3);
        Z0.d.O(checkableImageButton, onLongClickListener);
        EditText editText = this.f3018v;
        if (editText != null) {
            b4.m(editText);
            j(b4);
        }
        Z0.d.g(textInputLayout, checkableImageButton, this.f3010n, this.f3011o);
        f(true);
    }

    public final void h(boolean z3) {
        if (d() != z3) {
            this.f3006j.setVisibility(z3 ? 0 : 8);
            k();
            m();
            this.f3001d.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3003f;
        checkableImageButton.setImageDrawable(drawable);
        l();
        Z0.d.g(this.f3001d, checkableImageButton, this.f3004g, this.h);
    }

    public final void j(AbstractC0118q abstractC0118q) {
        if (this.f3018v == null) {
            return;
        }
        if (abstractC0118q.e() != null) {
            this.f3018v.setOnFocusChangeListener(abstractC0118q.e());
        }
        if (abstractC0118q.g() != null) {
            this.f3006j.setOnFocusChangeListener(abstractC0118q.g());
        }
    }

    public final void k() {
        this.f3002e.setVisibility((this.f3006j.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f3015s == null || this.f3017u) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f3003f;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f3001d;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f4068m.f3050q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f3008l != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i3;
        TextInputLayout textInputLayout = this.f3001d;
        if (textInputLayout.f4059g == null) {
            return;
        }
        if (d() || e()) {
            i3 = 0;
        } else {
            EditText editText = textInputLayout.f4059g;
            Field field = AbstractC0189K.f4150a;
            i3 = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f4059g.getPaddingTop();
        int paddingBottom = textInputLayout.f4059g.getPaddingBottom();
        Field field2 = AbstractC0189K.f4150a;
        this.f3016t.setPaddingRelative(dimensionPixelSize, paddingTop, i3, paddingBottom);
    }

    public final void n() {
        J j3 = this.f3016t;
        int visibility = j3.getVisibility();
        int i3 = (this.f3015s == null || this.f3017u) ? 8 : 0;
        if (visibility != i3) {
            b().p(i3 == 0);
        }
        k();
        j3.setVisibility(i3);
        this.f3001d.q();
    }
}
