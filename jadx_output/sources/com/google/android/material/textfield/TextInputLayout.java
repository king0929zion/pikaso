package com.google.android.material.textfield;

import D1.j;
import I1.a;
import M1.c;
import S1.b;
import X.d;
import X1.e;
import X1.f;
import X1.g;
import X1.i;
import X1.k;
import a.AbstractC0090a;
import a2.C0101A;
import a2.C0108g;
import a2.C0109h;
import a2.C0112k;
import a2.C0114m;
import a2.C0117p;
import a2.s;
import a2.t;
import a2.v;
import a2.w;
import a2.x;
import a2.y;
import a2.z;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b1.C0137b;
import b2.AbstractC0139a;
import com.google.android.material.internal.CheckableImageButton;
import d1.AbstractC0180B;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import k.J;
import k.U;
import k.r;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: D0, reason: collision with root package name */
    public static final int[][] f4023D0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public j f4024A;

    /* renamed from: A0, reason: collision with root package name */
    public ValueAnimator f4025A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f4026B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f4027B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f4028C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f4029C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f4030D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f4031E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4032F;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f4033G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4034H;

    /* renamed from: I, reason: collision with root package name */
    public g f4035I;

    /* renamed from: J, reason: collision with root package name */
    public g f4036J;

    /* renamed from: K, reason: collision with root package name */
    public StateListDrawable f4037K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4038L;

    /* renamed from: M, reason: collision with root package name */
    public g f4039M;

    /* renamed from: N, reason: collision with root package name */
    public g f4040N;

    /* renamed from: O, reason: collision with root package name */
    public k f4041O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4042P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f4043Q;

    /* renamed from: R, reason: collision with root package name */
    public int f4044R;

    /* renamed from: S, reason: collision with root package name */
    public int f4045S;

    /* renamed from: T, reason: collision with root package name */
    public int f4046T;

    /* renamed from: U, reason: collision with root package name */
    public int f4047U;

    /* renamed from: V, reason: collision with root package name */
    public int f4048V;

    /* renamed from: W, reason: collision with root package name */
    public int f4049W;

    /* renamed from: a0, reason: collision with root package name */
    public int f4050a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Rect f4051b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Rect f4052c0;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f4053d;

    /* renamed from: d0, reason: collision with root package name */
    public final RectF f4054d0;

    /* renamed from: e, reason: collision with root package name */
    public final v f4055e;

    /* renamed from: e0, reason: collision with root package name */
    public Typeface f4056e0;

    /* renamed from: f, reason: collision with root package name */
    public final C0117p f4057f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f4058f0;

    /* renamed from: g, reason: collision with root package name */
    public EditText f4059g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4060g0;
    public CharSequence h;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f4061h0;

    /* renamed from: i, reason: collision with root package name */
    public int f4062i;
    public ColorDrawable i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4063j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4064j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4065k;
    public Drawable k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4066l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f4067l0;

    /* renamed from: m, reason: collision with root package name */
    public final t f4068m;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f4069m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4070n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4071n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4072o;

    /* renamed from: o0, reason: collision with root package name */
    public int f4073o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4074p;
    public int p0;

    /* renamed from: q, reason: collision with root package name */
    public z f4075q;

    /* renamed from: q0, reason: collision with root package name */
    public ColorStateList f4076q0;

    /* renamed from: r, reason: collision with root package name */
    public J f4077r;

    /* renamed from: r0, reason: collision with root package name */
    public int f4078r0;

    /* renamed from: s, reason: collision with root package name */
    public int f4079s;

    /* renamed from: s0, reason: collision with root package name */
    public int f4080s0;

    /* renamed from: t, reason: collision with root package name */
    public int f4081t;

    /* renamed from: t0, reason: collision with root package name */
    public int f4082t0;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4083u;

    /* renamed from: u0, reason: collision with root package name */
    public int f4084u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4085v;

    /* renamed from: v0, reason: collision with root package name */
    public int f4086v0;

    /* renamed from: w, reason: collision with root package name */
    public J f4087w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f4088w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f4089x;

    /* renamed from: x0, reason: collision with root package name */
    public final b f4090x0;

    /* renamed from: y, reason: collision with root package name */
    public int f4091y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4092y0;

    /* renamed from: z, reason: collision with root package name */
    public j f4093z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f4094z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0139a.a(context, attributeSet, com.ai.assistance.operit.provider.R.attr.textInputStyle, com.ai.assistance.operit.provider.R.style.Widget_Design_TextInputLayout), attributeSet, com.ai.assistance.operit.provider.R.attr.textInputStyle);
        this.f4062i = -1;
        this.f4063j = -1;
        this.f4065k = -1;
        this.f4066l = -1;
        this.f4068m = new t(this);
        this.f4075q = new d(3);
        this.f4051b0 = new Rect();
        this.f4052c0 = new Rect();
        this.f4054d0 = new RectF();
        this.f4061h0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f4090x0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f4053d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = a.f1390a;
        bVar.f2252Q = linearInterpolator;
        bVar.h(false);
        bVar.f2251P = linearInterpolator;
        bVar.h(false);
        if (bVar.f2274g != 8388659) {
            bVar.f2274g = 8388659;
            bVar.h(false);
        }
        int[] iArr = H1.a.f1354t;
        S1.k.a(context2, attributeSet, com.ai.assistance.operit.provider.R.attr.textInputStyle, com.ai.assistance.operit.provider.R.style.Widget_Design_TextInputLayout);
        S1.k.b(context2, attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.textInputStyle, com.ai.assistance.operit.provider.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.textInputStyle, com.ai.assistance.operit.provider.R.style.Widget_Design_TextInputLayout);
        B0.a aVar = new B0.a(context2, obtainStyledAttributes);
        v vVar = new v(this, aVar);
        this.f4055e = vVar;
        this.f4032F = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f4094z0 = obtainStyledAttributes.getBoolean(47, true);
        this.f4092y0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f4041O = k.a(context2, attributeSet, com.ai.assistance.operit.provider.R.attr.textInputStyle, com.ai.assistance.operit.provider.R.style.Widget_Design_TextInputLayout).a();
        this.f4043Q = context2.getResources().getDimensionPixelOffset(com.ai.assistance.operit.provider.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f4045S = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f4047U = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f4048V = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f4046T = this.f4047U;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        X1.j d3 = this.f4041O.d();
        if (dimension >= 0.0f) {
            d3.f2711e = new X1.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            d3.f2712f = new X1.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            d3.f2713g = new X1.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            d3.h = new X1.a(dimension4);
        }
        this.f4041O = d3.a();
        ColorStateList E2 = AbstractC0090a.E(context2, aVar, 7);
        if (E2 != null) {
            int defaultColor = E2.getDefaultColor();
            this.f4078r0 = defaultColor;
            this.f4050a0 = defaultColor;
            if (E2.isStateful()) {
                this.f4080s0 = E2.getColorForState(new int[]{-16842910}, -1);
                this.f4082t0 = E2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f4084u0 = E2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f4082t0 = this.f4078r0;
                ColorStateList y3 = r2.a.y(context2, com.ai.assistance.operit.provider.R.color.mtrl_filled_background_color);
                this.f4080s0 = y3.getColorForState(new int[]{-16842910}, -1);
                this.f4084u0 = y3.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f4050a0 = 0;
            this.f4078r0 = 0;
            this.f4080s0 = 0;
            this.f4082t0 = 0;
            this.f4084u0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList k3 = aVar.k(1);
            this.f4069m0 = k3;
            this.f4067l0 = k3;
        }
        ColorStateList E3 = AbstractC0090a.E(context2, aVar, 14);
        this.p0 = obtainStyledAttributes.getColor(14, 0);
        this.f4071n0 = T0.b.a(context2, com.ai.assistance.operit.provider.R.color.mtrl_textinput_default_box_stroke_color);
        this.f4086v0 = T0.b.a(context2, com.ai.assistance.operit.provider.R.color.mtrl_textinput_disabled_color);
        this.f4073o0 = T0.b.a(context2, com.ai.assistance.operit.provider.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (E3 != null) {
            setBoxStrokeColorStateList(E3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0090a.E(context2, aVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f4030D = aVar.k(24);
        this.f4031E = aVar.k(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i3 = obtainStyledAttributes.getInt(34, 1);
        boolean z3 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z4 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z5 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f4081t = obtainStyledAttributes.getResourceId(22, 0);
        this.f4079s = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i3);
        setCounterOverflowTextAppearance(this.f4079s);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f4081t);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(aVar.k(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(aVar.k(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(aVar.k(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(aVar.k(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(aVar.k(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(aVar.k(58));
        }
        C0117p c0117p = new C0117p(this, aVar);
        this.f4057f = c0117p;
        boolean z6 = obtainStyledAttributes.getBoolean(0, true);
        aVar.C();
        setImportantForAccessibility(2);
        AbstractC0180B.m(this, 1);
        frameLayout.addView(vVar);
        frameLayout.addView(c0117p);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f4059g;
        if (!(editText instanceof AutoCompleteTextView) || Z.b.A(editText)) {
            return this.f4035I;
        }
        int x3 = r2.a.x(this.f4059g, com.ai.assistance.operit.provider.R.attr.colorControlHighlight);
        int i3 = this.f4044R;
        int[][] iArr = f4023D0;
        if (i3 != 2) {
            if (i3 != 1) {
                return null;
            }
            g gVar = this.f4035I;
            int i4 = this.f4050a0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{r2.a.N(0.1f, x3, i4), i4}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f4035I;
        TypedValue T2 = r2.a.T(context, com.ai.assistance.operit.provider.R.attr.colorSurface, "TextInputLayout");
        int i5 = T2.resourceId;
        int a3 = i5 != 0 ? T0.b.a(context, i5) : T2.data;
        g gVar3 = new g(gVar2.f2685d.f2669a);
        int N2 = r2.a.N(0.1f, x3, a3);
        gVar3.j(new ColorStateList(iArr, new int[]{N2, 0}));
        gVar3.setTint(a3);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{N2, a3});
        g gVar4 = new g(gVar2.f2685d.f2669a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f4037K == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f4037K = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f4037K.addState(new int[0], f(false));
        }
        return this.f4037K;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f4036J == null) {
            this.f4036J = f(true);
        }
        return this.f4036J;
    }

    public static void k(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z3);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f4059g != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f4059g = editText;
        int i3 = this.f4062i;
        if (i3 != -1) {
            setMinEms(i3);
        } else {
            setMinWidth(this.f4065k);
        }
        int i4 = this.f4063j;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f4066l);
        }
        this.f4038L = false;
        i();
        setTextInputAccessibilityDelegate(new y(this));
        Typeface typeface = this.f4059g.getTypeface();
        b bVar = this.f4090x0;
        bVar.m(typeface);
        float textSize = this.f4059g.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        int i5 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f4059g.getLetterSpacing();
        if (bVar.f2258W != letterSpacing) {
            bVar.f2258W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f4059g.getGravity();
        int i6 = (gravity & (-113)) | 48;
        if (bVar.f2274g != i6) {
            bVar.f2274g = i6;
            bVar.h(false);
        }
        if (bVar.f2272f != gravity) {
            bVar.f2272f = gravity;
            bVar.h(false);
        }
        this.f4059g.addTextChangedListener(new w(this, 0));
        if (this.f4067l0 == null) {
            this.f4067l0 = this.f4059g.getHintTextColors();
        }
        if (this.f4032F) {
            if (TextUtils.isEmpty(this.f4033G)) {
                CharSequence hint = this.f4059g.getHint();
                this.h = hint;
                setHint(hint);
                this.f4059g.setHint((CharSequence) null);
            }
            this.f4034H = true;
        }
        if (i5 >= 29) {
            p();
        }
        if (this.f4077r != null) {
            n(this.f4059g.getText());
        }
        r();
        this.f4068m.b();
        this.f4055e.bringToFront();
        C0117p c0117p = this.f4057f;
        c0117p.bringToFront();
        Iterator it = this.f4061h0.iterator();
        while (it.hasNext()) {
            ((C0114m) it.next()).a(this);
        }
        c0117p.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f4033G)) {
            return;
        }
        this.f4033G = charSequence;
        b bVar = this.f4090x0;
        if (charSequence == null || !TextUtils.equals(bVar.f2236A, charSequence)) {
            bVar.f2236A = charSequence;
            bVar.f2237B = null;
            Bitmap bitmap = bVar.f2240E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f2240E = null;
            }
            bVar.h(false);
        }
        if (this.f4088w0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f4085v == z3) {
            return;
        }
        if (z3) {
            J j3 = this.f4087w;
            if (j3 != null) {
                this.f4053d.addView(j3);
                this.f4087w.setVisibility(0);
            }
        } else {
            J j4 = this.f4087w;
            if (j4 != null) {
                j4.setVisibility(8);
            }
            this.f4087w = null;
        }
        this.f4085v = z3;
    }

    public final void a(float f3) {
        int i3 = 1;
        b bVar = this.f4090x0;
        if (bVar.f2264b == f3) {
            return;
        }
        if (this.f4025A0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f4025A0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0090a.b0(getContext(), com.ai.assistance.operit.provider.R.attr.motionEasingEmphasizedInterpolator, a.f1391b));
            this.f4025A0.setDuration(AbstractC0090a.a0(getContext(), com.ai.assistance.operit.provider.R.attr.motionDurationMedium4, 167));
            this.f4025A0.addUpdateListener(new c(i3, this));
        }
        this.f4025A0.setFloatValues(bVar.f2264b, f3);
        this.f4025A0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i3, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f4053d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i3;
        int i4;
        int i5;
        g gVar = this.f4035I;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f2685d.f2669a;
        k kVar2 = this.f4041O;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f4044R == 2 && (i4 = this.f4046T) > -1 && (i5 = this.f4049W) != 0) {
            g gVar2 = this.f4035I;
            gVar2.f2685d.f2677j = i4;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i5);
            f fVar = gVar2.f2685d;
            if (fVar.f2672d != valueOf) {
                fVar.f2672d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i6 = this.f4050a0;
        if (this.f4044R == 1) {
            Context context = getContext();
            TypedValue S2 = r2.a.S(context, com.ai.assistance.operit.provider.R.attr.colorSurface);
            if (S2 != null) {
                int i7 = S2.resourceId;
                i3 = i7 != 0 ? T0.b.a(context, i7) : S2.data;
            } else {
                i3 = 0;
            }
            i6 = V0.a.b(this.f4050a0, i3);
        }
        this.f4050a0 = i6;
        this.f4035I.j(ColorStateList.valueOf(i6));
        g gVar3 = this.f4039M;
        if (gVar3 != null && this.f4040N != null) {
            if (this.f4046T > -1 && this.f4049W != 0) {
                gVar3.j(this.f4059g.isFocused() ? ColorStateList.valueOf(this.f4071n0) : ColorStateList.valueOf(this.f4049W));
                this.f4040N.j(ColorStateList.valueOf(this.f4049W));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d3;
        if (!this.f4032F) {
            return 0;
        }
        int i3 = this.f4044R;
        b bVar = this.f4090x0;
        if (i3 == 0) {
            d3 = bVar.d();
        } else {
            if (i3 != 2) {
                return 0;
            }
            d3 = bVar.d() / 2.0f;
        }
        return (int) d3;
    }

    public final j d() {
        j jVar = new j();
        jVar.f1002f = AbstractC0090a.a0(getContext(), com.ai.assistance.operit.provider.R.attr.motionDurationShort2, 87);
        jVar.f1003g = AbstractC0090a.b0(getContext(), com.ai.assistance.operit.provider.R.attr.motionEasingLinearInterpolator, a.f1390a);
        return jVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i3) {
        EditText editText = this.f4059g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i3);
            return;
        }
        if (this.h != null) {
            boolean z3 = this.f4034H;
            this.f4034H = false;
            CharSequence hint = editText.getHint();
            this.f4059g.setHint(this.h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i3);
                return;
            } finally {
                this.f4059g.setHint(hint);
                this.f4034H = z3;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i3);
        onProvideAutofillVirtualStructure(viewStructure, i3);
        FrameLayout frameLayout = this.f4053d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i3);
            if (childAt == this.f4059g) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f4029C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f4029C0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i3;
        super.draw(canvas);
        boolean z3 = this.f4032F;
        b bVar = this.f4090x0;
        if (z3) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f2237B != null) {
                RectF rectF = bVar.f2270e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f2249N;
                    textPaint.setTextSize(bVar.f2242G);
                    float f3 = bVar.f2282p;
                    float f4 = bVar.f2283q;
                    float f5 = bVar.f2241F;
                    if (f5 != 1.0f) {
                        canvas.scale(f5, f5, f3, f4);
                    }
                    if (bVar.f2269d0 <= 1 || bVar.f2238C) {
                        canvas.translate(f3, f4);
                        bVar.f2260Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f2282p - bVar.f2260Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f4);
                        float f6 = alpha;
                        textPaint.setAlpha((int) (bVar.f2265b0 * f6));
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 31) {
                            float f7 = bVar.f2243H;
                            float f8 = bVar.f2244I;
                            float f9 = bVar.f2245J;
                            int i5 = bVar.f2246K;
                            textPaint.setShadowLayer(f7, f8, f9, V0.a.d(i5, (textPaint.getAlpha() * Color.alpha(i5)) / 255));
                        }
                        bVar.f2260Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f2263a0 * f6));
                        if (i4 >= 31) {
                            float f10 = bVar.f2243H;
                            float f11 = bVar.f2244I;
                            float f12 = bVar.f2245J;
                            int i6 = bVar.f2246K;
                            textPaint.setShadowLayer(f10, f11, f12, V0.a.d(i6, (Color.alpha(i6) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f2260Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f2267c0;
                        float f13 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, textPaint);
                        if (i4 >= 31) {
                            textPaint.setShadowLayer(bVar.f2243H, bVar.f2244I, bVar.f2245J, bVar.f2246K);
                        }
                        String trim = bVar.f2267c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i3 = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i3 = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f2260Y.getLineEnd(i3), str.length()), 0.0f, f13, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f4040N == null || (gVar = this.f4039M) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f4059g.isFocused()) {
            Rect bounds = this.f4040N.getBounds();
            Rect bounds2 = this.f4039M.getBounds();
            float f14 = bVar.f2264b;
            int centerX = bounds2.centerX();
            bounds.left = a.c(f14, centerX, bounds2.left);
            bounds.right = a.c(f14, centerX, bounds2.right);
            this.f4040N.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f4027B0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f4027B0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            S1.b r3 = r4.f4090x0
            if (r3 == 0) goto L2f
            r3.f2247L = r1
            android.content.res.ColorStateList r1 = r3.f2277k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f2276j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f4059g
            if (r3 == 0) goto L47
            java.lang.reflect.Field r3 = d1.AbstractC0189K.f4150a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f4027B0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.f4032F && !TextUtils.isEmpty(this.f4033G) && (this.f4035I instanceof C0109h);
    }

    public final g f(boolean z3) {
        int i3 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.ai.assistance.operit.provider.R.dimen.mtrl_shape_corner_size_small_component);
        float f3 = z3 ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.ai.assistance.operit.provider.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.ai.assistance.operit.provider.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i3);
        e eVar2 = new e(i3);
        e eVar3 = new e(i3);
        e eVar4 = new e(i3);
        X1.a aVar = new X1.a(f3);
        X1.a aVar2 = new X1.a(f3);
        X1.a aVar3 = new X1.a(dimensionPixelOffset);
        X1.a aVar4 = new X1.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f2718a = iVar;
        kVar.f2719b = iVar2;
        kVar.f2720c = iVar3;
        kVar.f2721d = iVar4;
        kVar.f2722e = aVar;
        kVar.f2723f = aVar2;
        kVar.f2724g = aVar4;
        kVar.h = aVar3;
        kVar.f2725i = eVar;
        kVar.f2726j = eVar2;
        kVar.f2727k = eVar3;
        kVar.f2728l = eVar4;
        Context context = getContext();
        Paint paint = g.f2684z;
        TypedValue T2 = r2.a.T(context, com.ai.assistance.operit.provider.R.attr.colorSurface, g.class.getSimpleName());
        int i4 = T2.resourceId;
        ColorStateList valueOf = ColorStateList.valueOf(i4 != 0 ? T0.b.a(context, i4) : T2.data);
        g gVar = new g();
        gVar.h(context);
        gVar.j(valueOf);
        gVar.i(dimensionPixelOffset2);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f2685d;
        if (fVar.f2675g == null) {
            fVar.f2675g = new Rect();
        }
        gVar.f2685d.f2675g.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i3, boolean z3) {
        return ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f4059g.getCompoundPaddingLeft() : this.f4057f.c() : this.f4055e.a()) + i3;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f4059g;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i3 = this.f4044R;
        if (i3 == 1 || i3 == 2) {
            return this.f4035I;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f4050a0;
    }

    public int getBoxBackgroundMode() {
        return this.f4044R;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f4045S;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e3 = S1.k.e(this);
        RectF rectF = this.f4054d0;
        return e3 ? this.f4041O.h.a(rectF) : this.f4041O.f2724g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e3 = S1.k.e(this);
        RectF rectF = this.f4054d0;
        return e3 ? this.f4041O.f2724g.a(rectF) : this.f4041O.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e3 = S1.k.e(this);
        RectF rectF = this.f4054d0;
        return e3 ? this.f4041O.f2722e.a(rectF) : this.f4041O.f2723f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e3 = S1.k.e(this);
        RectF rectF = this.f4054d0;
        return e3 ? this.f4041O.f2723f.a(rectF) : this.f4041O.f2722e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.p0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f4076q0;
    }

    public int getBoxStrokeWidth() {
        return this.f4047U;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f4048V;
    }

    public int getCounterMaxLength() {
        return this.f4072o;
    }

    public CharSequence getCounterOverflowDescription() {
        J j3;
        if (this.f4070n && this.f4074p && (j3 = this.f4077r) != null) {
            return j3.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f4028C;
    }

    public ColorStateList getCounterTextColor() {
        return this.f4026B;
    }

    public ColorStateList getCursorColor() {
        return this.f4030D;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f4031E;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f4067l0;
    }

    public EditText getEditText() {
        return this.f4059g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f4057f.f3006j.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f4057f.f3006j.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f4057f.f3012p;
    }

    public int getEndIconMode() {
        return this.f4057f.f3008l;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f4057f.f3013q;
    }

    public CheckableImageButton getEndIconView() {
        return this.f4057f.f3006j;
    }

    public CharSequence getError() {
        t tVar = this.f4068m;
        if (tVar.f3050q) {
            return tVar.f3049p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f4068m.f3053t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f4068m.f3052s;
    }

    public int getErrorCurrentTextColors() {
        J j3 = this.f4068m.f3051r;
        if (j3 != null) {
            return j3.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f4057f.f3003f.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f4068m;
        if (tVar.f3057x) {
            return tVar.f3056w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        J j3 = this.f4068m.f3058y;
        if (j3 != null) {
            return j3.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f4032F) {
            return this.f4033G;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f4090x0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f4090x0;
        return bVar.e(bVar.f2277k);
    }

    public ColorStateList getHintTextColor() {
        return this.f4069m0;
    }

    public z getLengthCounter() {
        return this.f4075q;
    }

    public int getMaxEms() {
        return this.f4063j;
    }

    public int getMaxWidth() {
        return this.f4066l;
    }

    public int getMinEms() {
        return this.f4062i;
    }

    public int getMinWidth() {
        return this.f4065k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f4057f.f3006j.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f4057f.f3006j.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f4085v) {
            return this.f4083u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f4091y;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f4089x;
    }

    public CharSequence getPrefixText() {
        return this.f4055e.f3065f;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f4055e.f3064e.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f4055e.f3064e;
    }

    public k getShapeAppearanceModel() {
        return this.f4041O;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f4055e.f3066g.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f4055e.f3066g.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f4055e.f3068j;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f4055e.f3069k;
    }

    public CharSequence getSuffixText() {
        return this.f4057f.f3015s;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f4057f.f3016t.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f4057f.f3016t;
    }

    public Typeface getTypeface() {
        return this.f4056e0;
    }

    public final int h(int i3, boolean z3) {
        return i3 - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f4059g.getCompoundPaddingRight() : this.f4055e.a() : this.f4057f.c());
    }

    public final void i() {
        int i3 = this.f4044R;
        if (i3 == 0) {
            this.f4035I = null;
            this.f4039M = null;
            this.f4040N = null;
        } else if (i3 == 1) {
            this.f4035I = new g(this.f4041O);
            this.f4039M = new g();
            this.f4040N = new g();
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException(this.f4044R + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f4032F || (this.f4035I instanceof C0109h)) {
                this.f4035I = new g(this.f4041O);
            } else {
                k kVar = this.f4041O;
                int i4 = C0109h.f2976B;
                if (kVar == null) {
                    kVar = new k();
                }
                C0108g c0108g = new C0108g(kVar, new RectF());
                C0109h c0109h = new C0109h(c0108g);
                c0109h.f2977A = c0108g;
                this.f4035I = c0109h;
            }
            this.f4039M = null;
            this.f4040N = null;
        }
        s();
        x();
        if (this.f4044R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f4045S = getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0090a.Q(getContext())) {
                this.f4045S = getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f4059g != null && this.f4044R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f4059g;
                Field field = AbstractC0189K.f4150a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f4059g.getPaddingEnd(), getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0090a.Q(getContext())) {
                EditText editText2 = this.f4059g;
                Field field2 = AbstractC0189K.f4150a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f4059g.getPaddingEnd(), getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f4044R != 0) {
            t();
        }
        EditText editText3 = this.f4059g;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i5 = this.f4044R;
                if (i5 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i5 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f3;
        float f4;
        float f5;
        RectF rectF;
        float f6;
        int i3;
        int i4;
        if (e()) {
            int width = this.f4059g.getWidth();
            int gravity = this.f4059g.getGravity();
            b bVar = this.f4090x0;
            boolean b3 = bVar.b(bVar.f2236A);
            bVar.f2238C = b3;
            Rect rect = bVar.f2268d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b3) {
                        i4 = rect.left;
                        f5 = i4;
                    } else {
                        f3 = rect.right;
                        f4 = bVar.f2261Z;
                    }
                } else if (b3) {
                    f3 = rect.right;
                    f4 = bVar.f2261Z;
                } else {
                    i4 = rect.left;
                    f5 = i4;
                }
                float max = Math.max(f5, rect.left);
                rectF = this.f4054d0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f6 = (width / 2.0f) + (bVar.f2261Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f2238C) {
                        f6 = max + bVar.f2261Z;
                    } else {
                        i3 = rect.right;
                        f6 = i3;
                    }
                } else if (bVar.f2238C) {
                    i3 = rect.right;
                    f6 = i3;
                } else {
                    f6 = bVar.f2261Z + max;
                }
                rectF.right = Math.min(f6, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f7 = rectF.left;
                float f8 = this.f4043Q;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f4046T);
                C0109h c0109h = (C0109h) this.f4035I;
                c0109h.getClass();
                c0109h.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f3 = width / 2.0f;
            f4 = bVar.f2261Z / 2.0f;
            f5 = f3 - f4;
            float max2 = Math.max(f5, rect.left);
            rectF = this.f4054d0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f6 = (width / 2.0f) + (bVar.f2261Z / 2.0f);
            rectF.right = Math.min(f6, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(J j3, int i3) {
        try {
            j3.setTextAppearance(i3);
            if (j3.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        j3.setTextAppearance(com.ai.assistance.operit.provider.R.style.TextAppearance_AppCompat_Caption);
        j3.setTextColor(T0.b.a(getContext(), com.ai.assistance.operit.provider.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f4068m;
        return (tVar.f3048o != 1 || tVar.f3051r == null || TextUtils.isEmpty(tVar.f3049p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((d) this.f4075q).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z3 = this.f4074p;
        int i3 = this.f4072o;
        String str = null;
        if (i3 == -1) {
            this.f4077r.setText(String.valueOf(length));
            this.f4077r.setContentDescription(null);
            this.f4074p = false;
        } else {
            this.f4074p = length > i3;
            Context context = getContext();
            this.f4077r.setContentDescription(context.getString(this.f4074p ? com.ai.assistance.operit.provider.R.string.character_counter_overflowed_content_description : com.ai.assistance.operit.provider.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f4072o)));
            if (z3 != this.f4074p) {
                o();
            }
            String str2 = C0137b.f3647b;
            C0137b c0137b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0137b.f3650e : C0137b.f3649d;
            J j3 = this.f4077r;
            String string = getContext().getString(com.ai.assistance.operit.provider.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f4072o));
            if (string == null) {
                c0137b.getClass();
            } else {
                c0137b.getClass();
                M1.d dVar = b1.f.f3657a;
                str = c0137b.c(string).toString();
            }
            j3.setText(str);
        }
        if (this.f4059g == null || z3 == this.f4074p) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        J j3 = this.f4077r;
        if (j3 != null) {
            l(j3, this.f4074p ? this.f4079s : this.f4081t);
            if (!this.f4074p && (colorStateList2 = this.f4026B) != null) {
                this.f4077r.setTextColor(colorStateList2);
            }
            if (!this.f4074p || (colorStateList = this.f4028C) == null) {
                return;
            }
            this.f4077r.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4090x0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        EditText editText = this.f4059g;
        if (editText != null) {
            ThreadLocal threadLocal = S1.c.f2293a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f4051b0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = S1.c.f2293a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            S1.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = S1.c.f2294b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f4039M;
            if (gVar != null) {
                int i7 = rect.bottom;
                gVar.setBounds(rect.left, i7 - this.f4047U, rect.right, i7);
            }
            g gVar2 = this.f4040N;
            if (gVar2 != null) {
                int i8 = rect.bottom;
                gVar2.setBounds(rect.left, i8 - this.f4048V, rect.right, i8);
            }
            if (this.f4032F) {
                float textSize = this.f4059g.getTextSize();
                b bVar = this.f4090x0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f4059g.getGravity();
                int i9 = (gravity & (-113)) | 48;
                if (bVar.f2274g != i9) {
                    bVar.f2274g = i9;
                    bVar.h(false);
                }
                if (bVar.f2272f != gravity) {
                    bVar.f2272f = gravity;
                    bVar.h(false);
                }
                if (this.f4059g == null) {
                    throw new IllegalStateException();
                }
                boolean e3 = S1.k.e(this);
                int i10 = rect.bottom;
                Rect rect2 = this.f4052c0;
                rect2.bottom = i10;
                int i11 = this.f4044R;
                if (i11 == 1) {
                    rect2.left = g(rect.left, e3);
                    rect2.top = rect.top + this.f4045S;
                    rect2.right = h(rect.right, e3);
                } else if (i11 != 2) {
                    rect2.left = g(rect.left, e3);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e3);
                } else {
                    rect2.left = this.f4059g.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f4059g.getPaddingRight();
                }
                int i12 = rect2.left;
                int i13 = rect2.top;
                int i14 = rect2.right;
                int i15 = rect2.bottom;
                Rect rect3 = bVar.f2268d;
                if (rect3.left != i12 || rect3.top != i13 || rect3.right != i14 || rect3.bottom != i15) {
                    rect3.set(i12, i13, i14, i15);
                    bVar.f2248M = true;
                }
                if (this.f4059g == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f2250O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.f2287u);
                textPaint.setLetterSpacing(bVar.f2258W);
                float f3 = -textPaint.ascent();
                rect2.left = this.f4059g.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f4044R != 1 || this.f4059g.getMinLines() > 1) ? rect.top + this.f4059g.getCompoundPaddingTop() : (int) (rect.centerY() - (f3 / 2.0f));
                rect2.right = rect.right - this.f4059g.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f4044R != 1 || this.f4059g.getMinLines() > 1) ? rect.bottom - this.f4059g.getCompoundPaddingBottom() : (int) (rect2.top + f3);
                rect2.bottom = compoundPaddingBottom;
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                Rect rect4 = bVar.f2266c;
                if (rect4.left != i16 || rect4.top != i17 || rect4.right != i18 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i16, i17, i18, compoundPaddingBottom);
                    bVar.f2248M = true;
                }
                bVar.h(false);
                if (!e() || this.f4088w0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        EditText editText;
        int max;
        super.onMeasure(i3, i4);
        EditText editText2 = this.f4059g;
        C0117p c0117p = this.f4057f;
        boolean z3 = false;
        if (editText2 != null && this.f4059g.getMeasuredHeight() < (max = Math.max(c0117p.getMeasuredHeight(), this.f4055e.getMeasuredHeight()))) {
            this.f4059g.setMinimumHeight(max);
            z3 = true;
        }
        boolean q3 = q();
        if (z3 || q3) {
            this.f4059g.post(new x(this, 1));
        }
        if (this.f4087w != null && (editText = this.f4059g) != null) {
            this.f4087w.setGravity(editText.getGravity());
            this.f4087w.setPadding(this.f4059g.getCompoundPaddingLeft(), this.f4059g.getCompoundPaddingTop(), this.f4059g.getCompoundPaddingRight(), this.f4059g.getCompoundPaddingBottom());
        }
        c0117p.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0101A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0101A c0101a = (C0101A) parcelable;
        super.onRestoreInstanceState(c0101a.f4957d);
        setError(c0101a.f2956f);
        if (c0101a.f2957g) {
            post(new x(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        boolean z3 = i3 == 1;
        if (z3 != this.f4042P) {
            X1.c cVar = this.f4041O.f2722e;
            RectF rectF = this.f4054d0;
            float a3 = cVar.a(rectF);
            float a4 = this.f4041O.f2723f.a(rectF);
            float a5 = this.f4041O.h.a(rectF);
            float a6 = this.f4041O.f2724g.a(rectF);
            k kVar = this.f4041O;
            AbstractC0090a abstractC0090a = kVar.f2718a;
            AbstractC0090a abstractC0090a2 = kVar.f2719b;
            AbstractC0090a abstractC0090a3 = kVar.f2721d;
            AbstractC0090a abstractC0090a4 = kVar.f2720c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            X1.j.b(abstractC0090a2);
            X1.j.b(abstractC0090a);
            X1.j.b(abstractC0090a4);
            X1.j.b(abstractC0090a3);
            X1.a aVar = new X1.a(a4);
            X1.a aVar2 = new X1.a(a3);
            X1.a aVar3 = new X1.a(a6);
            X1.a aVar4 = new X1.a(a5);
            k kVar2 = new k();
            kVar2.f2718a = abstractC0090a2;
            kVar2.f2719b = abstractC0090a;
            kVar2.f2720c = abstractC0090a3;
            kVar2.f2721d = abstractC0090a4;
            kVar2.f2722e = aVar;
            kVar2.f2723f = aVar2;
            kVar2.f2724g = aVar4;
            kVar2.h = aVar3;
            kVar2.f2725i = eVar;
            kVar2.f2726j = eVar2;
            kVar2.f2727k = eVar3;
            kVar2.f2728l = eVar4;
            this.f4042P = z3;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0101A c0101a = new C0101A(super.onSaveInstanceState());
        if (m()) {
            c0101a.f2956f = getError();
        }
        C0117p c0117p = this.f4057f;
        c0101a.f2957g = c0117p.f3008l != 0 && c0117p.f3006j.f3982g;
        return c0101a;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f4030D;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue S2 = r2.a.S(context, com.ai.assistance.operit.provider.R.attr.colorControlActivated);
            if (S2 != null) {
                int i3 = S2.resourceId;
                if (i3 != 0) {
                    colorStateList2 = r2.a.y(context, i3);
                } else {
                    int i4 = S2.data;
                    if (i4 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i4);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f4059g;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f4059g.getTextCursorDrawable();
            if ((m() || (this.f4077r != null && this.f4074p)) && (colorStateList = this.f4031E) != null) {
                colorStateList2 = colorStateList;
            }
            W0.a.h(textCursorDrawable2, colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        J j3;
        EditText editText = this.f4059g;
        if (editText == null || this.f4044R != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = U.f4718a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(r.b(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f4074p && (j3 = this.f4077r) != null) {
            mutate.setColorFilter(r.b(j3.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f4059g.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f4059g;
        if (editText == null || this.f4035I == null) {
            return;
        }
        if ((this.f4038L || editText.getBackground() == null) && this.f4044R != 0) {
            EditText editText2 = this.f4059g;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            Field field = AbstractC0189K.f4150a;
            editText2.setBackground(editTextBoxBackground);
            this.f4038L = true;
        }
    }

    public void setBoxBackgroundColor(int i3) {
        if (this.f4050a0 != i3) {
            this.f4050a0 = i3;
            this.f4078r0 = i3;
            this.f4082t0 = i3;
            this.f4084u0 = i3;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i3) {
        setBoxBackgroundColor(T0.b.a(getContext(), i3));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f4078r0 = defaultColor;
        this.f4050a0 = defaultColor;
        this.f4080s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f4082t0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f4084u0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i3) {
        if (i3 == this.f4044R) {
            return;
        }
        this.f4044R = i3;
        if (this.f4059g != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i3) {
        this.f4045S = i3;
    }

    public void setBoxCornerFamily(int i3) {
        X1.j d3 = this.f4041O.d();
        X1.c cVar = this.f4041O.f2722e;
        AbstractC0090a r3 = r2.a.r(i3);
        d3.f2707a = r3;
        X1.j.b(r3);
        d3.f2711e = cVar;
        X1.c cVar2 = this.f4041O.f2723f;
        AbstractC0090a r4 = r2.a.r(i3);
        d3.f2708b = r4;
        X1.j.b(r4);
        d3.f2712f = cVar2;
        X1.c cVar3 = this.f4041O.h;
        AbstractC0090a r5 = r2.a.r(i3);
        d3.f2710d = r5;
        X1.j.b(r5);
        d3.h = cVar3;
        X1.c cVar4 = this.f4041O.f2724g;
        AbstractC0090a r6 = r2.a.r(i3);
        d3.f2709c = r6;
        X1.j.b(r6);
        d3.f2713g = cVar4;
        this.f4041O = d3.a();
        b();
    }

    public void setBoxStrokeColor(int i3) {
        if (this.p0 != i3) {
            this.p0 = i3;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f4071n0 = colorStateList.getDefaultColor();
            this.f4086v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f4073o0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.p0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.p0 != colorStateList.getDefaultColor()) {
            this.p0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f4076q0 != colorStateList) {
            this.f4076q0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i3) {
        this.f4047U = i3;
        x();
    }

    public void setBoxStrokeWidthFocused(int i3) {
        this.f4048V = i3;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i3) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i3));
    }

    public void setBoxStrokeWidthResource(int i3) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i3));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f4070n != z3) {
            t tVar = this.f4068m;
            if (z3) {
                J j3 = new J(getContext(), null);
                this.f4077r = j3;
                j3.setId(com.ai.assistance.operit.provider.R.id.textinput_counter);
                Typeface typeface = this.f4056e0;
                if (typeface != null) {
                    this.f4077r.setTypeface(typeface);
                }
                this.f4077r.setMaxLines(1);
                tVar.a(this.f4077r, 2);
                ((ViewGroup.MarginLayoutParams) this.f4077r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.ai.assistance.operit.provider.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f4077r != null) {
                    EditText editText = this.f4059g;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f4077r, 2);
                this.f4077r = null;
            }
            this.f4070n = z3;
        }
    }

    public void setCounterMaxLength(int i3) {
        if (this.f4072o != i3) {
            if (i3 > 0) {
                this.f4072o = i3;
            } else {
                this.f4072o = -1;
            }
            if (!this.f4070n || this.f4077r == null) {
                return;
            }
            EditText editText = this.f4059g;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i3) {
        if (this.f4079s != i3) {
            this.f4079s = i3;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f4028C != colorStateList) {
            this.f4028C = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i3) {
        if (this.f4081t != i3) {
            this.f4081t = i3;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f4026B != colorStateList) {
            this.f4026B = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f4030D != colorStateList) {
            this.f4030D = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f4031E != colorStateList) {
            this.f4031E = colorStateList;
            if (m() || (this.f4077r != null && this.f4074p)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f4067l0 = colorStateList;
        this.f4069m0 = colorStateList;
        if (this.f4059g != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        k(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f4057f.f3006j.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f4057f.f3006j.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i3) {
        C0117p c0117p = this.f4057f;
        CharSequence text = i3 != 0 ? c0117p.getResources().getText(i3) : null;
        CheckableImageButton checkableImageButton = c0117p.f3006j;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i3) {
        C0117p c0117p = this.f4057f;
        Drawable r3 = i3 != 0 ? Z.b.r(c0117p.getContext(), i3) : null;
        CheckableImageButton checkableImageButton = c0117p.f3006j;
        checkableImageButton.setImageDrawable(r3);
        if (r3 != null) {
            ColorStateList colorStateList = c0117p.f3010n;
            PorterDuff.Mode mode = c0117p.f3011o;
            TextInputLayout textInputLayout = c0117p.f3001d;
            Z0.d.g(textInputLayout, checkableImageButton, colorStateList, mode);
            Z0.d.M(textInputLayout, checkableImageButton, c0117p.f3010n);
        }
    }

    public void setEndIconMinSize(int i3) {
        C0117p c0117p = this.f4057f;
        if (i3 < 0) {
            c0117p.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i3 != c0117p.f3012p) {
            c0117p.f3012p = i3;
            CheckableImageButton checkableImageButton = c0117p.f3006j;
            checkableImageButton.setMinimumWidth(i3);
            checkableImageButton.setMinimumHeight(i3);
            CheckableImageButton checkableImageButton2 = c0117p.f3003f;
            checkableImageButton2.setMinimumWidth(i3);
            checkableImageButton2.setMinimumHeight(i3);
        }
    }

    public void setEndIconMode(int i3) {
        this.f4057f.g(i3);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0117p c0117p = this.f4057f;
        View.OnLongClickListener onLongClickListener = c0117p.f3014r;
        CheckableImageButton checkableImageButton = c0117p.f3006j;
        checkableImageButton.setOnClickListener(onClickListener);
        Z0.d.O(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0117p c0117p = this.f4057f;
        c0117p.f3014r = onLongClickListener;
        CheckableImageButton checkableImageButton = c0117p.f3006j;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Z0.d.O(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0117p c0117p = this.f4057f;
        c0117p.f3013q = scaleType;
        c0117p.f3006j.setScaleType(scaleType);
        c0117p.f3003f.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0117p c0117p = this.f4057f;
        if (c0117p.f3010n != colorStateList) {
            c0117p.f3010n = colorStateList;
            Z0.d.g(c0117p.f3001d, c0117p.f3006j, colorStateList, c0117p.f3011o);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0117p c0117p = this.f4057f;
        if (c0117p.f3011o != mode) {
            c0117p.f3011o = mode;
            Z0.d.g(c0117p.f3001d, c0117p.f3006j, c0117p.f3010n, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.f4057f.h(z3);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f4068m;
        if (!tVar.f3050q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.f3049p = charSequence;
        tVar.f3051r.setText(charSequence);
        int i3 = tVar.f3047n;
        if (i3 != 1) {
            tVar.f3048o = 1;
        }
        tVar.i(i3, tVar.f3048o, tVar.h(tVar.f3051r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i3) {
        t tVar = this.f4068m;
        tVar.f3053t = i3;
        J j3 = tVar.f3051r;
        if (j3 != null) {
            Field field = AbstractC0189K.f4150a;
            j3.setAccessibilityLiveRegion(i3);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f4068m;
        tVar.f3052s = charSequence;
        J j3 = tVar.f3051r;
        if (j3 != null) {
            j3.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        t tVar = this.f4068m;
        if (tVar.f3050q == z3) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.h;
        if (z3) {
            J j3 = new J(tVar.f3041g, null);
            tVar.f3051r = j3;
            j3.setId(com.ai.assistance.operit.provider.R.id.textinput_error);
            tVar.f3051r.setTextAlignment(5);
            Typeface typeface = tVar.f3034B;
            if (typeface != null) {
                tVar.f3051r.setTypeface(typeface);
            }
            int i3 = tVar.f3054u;
            tVar.f3054u = i3;
            J j4 = tVar.f3051r;
            if (j4 != null) {
                textInputLayout.l(j4, i3);
            }
            ColorStateList colorStateList = tVar.f3055v;
            tVar.f3055v = colorStateList;
            J j5 = tVar.f3051r;
            if (j5 != null && colorStateList != null) {
                j5.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f3052s;
            tVar.f3052s = charSequence;
            J j6 = tVar.f3051r;
            if (j6 != null) {
                j6.setContentDescription(charSequence);
            }
            int i4 = tVar.f3053t;
            tVar.f3053t = i4;
            J j7 = tVar.f3051r;
            if (j7 != null) {
                Field field = AbstractC0189K.f4150a;
                j7.setAccessibilityLiveRegion(i4);
            }
            tVar.f3051r.setVisibility(4);
            tVar.a(tVar.f3051r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f3051r, 0);
            tVar.f3051r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f3050q = z3;
    }

    public void setErrorIconDrawable(int i3) {
        C0117p c0117p = this.f4057f;
        c0117p.i(i3 != 0 ? Z.b.r(c0117p.getContext(), i3) : null);
        Z0.d.M(c0117p.f3001d, c0117p.f3003f, c0117p.f3004g);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0117p c0117p = this.f4057f;
        CheckableImageButton checkableImageButton = c0117p.f3003f;
        View.OnLongClickListener onLongClickListener = c0117p.f3005i;
        checkableImageButton.setOnClickListener(onClickListener);
        Z0.d.O(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0117p c0117p = this.f4057f;
        c0117p.f3005i = onLongClickListener;
        CheckableImageButton checkableImageButton = c0117p.f3003f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Z0.d.O(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0117p c0117p = this.f4057f;
        if (c0117p.f3004g != colorStateList) {
            c0117p.f3004g = colorStateList;
            Z0.d.g(c0117p.f3001d, c0117p.f3003f, colorStateList, c0117p.h);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0117p c0117p = this.f4057f;
        if (c0117p.h != mode) {
            c0117p.h = mode;
            Z0.d.g(c0117p.f3001d, c0117p.f3003f, c0117p.f3004g, mode);
        }
    }

    public void setErrorTextAppearance(int i3) {
        t tVar = this.f4068m;
        tVar.f3054u = i3;
        J j3 = tVar.f3051r;
        if (j3 != null) {
            tVar.h.l(j3, i3);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f4068m;
        tVar.f3055v = colorStateList;
        J j3 = tVar.f3051r;
        if (j3 == null || colorStateList == null) {
            return;
        }
        j3.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f4092y0 != z3) {
            this.f4092y0 = z3;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f4068m;
        if (isEmpty) {
            if (tVar.f3057x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f3057x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f3056w = charSequence;
        tVar.f3058y.setText(charSequence);
        int i3 = tVar.f3047n;
        if (i3 != 2) {
            tVar.f3048o = 2;
        }
        tVar.i(i3, tVar.f3048o, tVar.h(tVar.f3058y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f4068m;
        tVar.f3033A = colorStateList;
        J j3 = tVar.f3058y;
        if (j3 == null || colorStateList == null) {
            return;
        }
        j3.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        t tVar = this.f4068m;
        if (tVar.f3057x == z3) {
            return;
        }
        tVar.c();
        if (z3) {
            J j3 = new J(tVar.f3041g, null);
            tVar.f3058y = j3;
            j3.setId(com.ai.assistance.operit.provider.R.id.textinput_helper_text);
            tVar.f3058y.setTextAlignment(5);
            Typeface typeface = tVar.f3034B;
            if (typeface != null) {
                tVar.f3058y.setTypeface(typeface);
            }
            tVar.f3058y.setVisibility(4);
            tVar.f3058y.setAccessibilityLiveRegion(1);
            int i3 = tVar.f3059z;
            tVar.f3059z = i3;
            J j4 = tVar.f3058y;
            if (j4 != null) {
                j4.setTextAppearance(i3);
            }
            ColorStateList colorStateList = tVar.f3033A;
            tVar.f3033A = colorStateList;
            J j5 = tVar.f3058y;
            if (j5 != null && colorStateList != null) {
                j5.setTextColor(colorStateList);
            }
            tVar.a(tVar.f3058y, 1);
            tVar.f3058y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i4 = tVar.f3047n;
            if (i4 == 2) {
                tVar.f3048o = 0;
            }
            tVar.i(i4, tVar.f3048o, tVar.h(tVar.f3058y, ""));
            tVar.g(tVar.f3058y, 1);
            tVar.f3058y = null;
            TextInputLayout textInputLayout = tVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f3057x = z3;
    }

    public void setHelperTextTextAppearance(int i3) {
        t tVar = this.f4068m;
        tVar.f3059z = i3;
        J j3 = tVar.f3058y;
        if (j3 != null) {
            j3.setTextAppearance(i3);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f4032F) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f4094z0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.f4032F) {
            this.f4032F = z3;
            if (z3) {
                CharSequence hint = this.f4059g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f4033G)) {
                        setHint(hint);
                    }
                    this.f4059g.setHint((CharSequence) null);
                }
                this.f4034H = true;
            } else {
                this.f4034H = false;
                if (!TextUtils.isEmpty(this.f4033G) && TextUtils.isEmpty(this.f4059g.getHint())) {
                    this.f4059g.setHint(this.f4033G);
                }
                setHintInternal(null);
            }
            if (this.f4059g != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i3) {
        b bVar = this.f4090x0;
        TextInputLayout textInputLayout = bVar.f2262a;
        U1.d dVar = new U1.d(textInputLayout.getContext(), i3);
        ColorStateList colorStateList = dVar.f2433j;
        if (colorStateList != null) {
            bVar.f2277k = colorStateList;
        }
        float f3 = dVar.f2434k;
        if (f3 != 0.0f) {
            bVar.f2275i = f3;
        }
        ColorStateList colorStateList2 = dVar.f2425a;
        if (colorStateList2 != null) {
            bVar.f2256U = colorStateList2;
        }
        bVar.f2254S = dVar.f2429e;
        bVar.f2255T = dVar.f2430f;
        bVar.f2253R = dVar.f2431g;
        bVar.f2257V = dVar.f2432i;
        U1.a aVar = bVar.f2291y;
        if (aVar != null) {
            aVar.f2418d = true;
        }
        A.t tVar = new A.t(12, bVar);
        dVar.a();
        bVar.f2291y = new U1.a(tVar, dVar.f2437n);
        dVar.c(textInputLayout.getContext(), bVar.f2291y);
        bVar.h(false);
        this.f4069m0 = bVar.f2277k;
        if (this.f4059g != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f4069m0 != colorStateList) {
            if (this.f4067l0 == null) {
                b bVar = this.f4090x0;
                if (bVar.f2277k != colorStateList) {
                    bVar.f2277k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f4069m0 = colorStateList;
            if (this.f4059g != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(z zVar) {
        this.f4075q = zVar;
    }

    public void setMaxEms(int i3) {
        this.f4063j = i3;
        EditText editText = this.f4059g;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMaxEms(i3);
    }

    public void setMaxWidth(int i3) {
        this.f4066l = i3;
        EditText editText = this.f4059g;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMaxWidth(i3);
    }

    public void setMaxWidthResource(int i3) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    public void setMinEms(int i3) {
        this.f4062i = i3;
        EditText editText = this.f4059g;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMinEms(i3);
    }

    public void setMinWidth(int i3) {
        this.f4065k = i3;
        EditText editText = this.f4059g;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMinWidth(i3);
    }

    public void setMinWidthResource(int i3) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i3) {
        C0117p c0117p = this.f4057f;
        c0117p.f3006j.setContentDescription(i3 != 0 ? c0117p.getResources().getText(i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i3) {
        C0117p c0117p = this.f4057f;
        c0117p.f3006j.setImageDrawable(i3 != 0 ? Z.b.r(c0117p.getContext(), i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        C0117p c0117p = this.f4057f;
        if (z3 && c0117p.f3008l != 1) {
            c0117p.g(1);
        } else if (z3) {
            c0117p.getClass();
        } else {
            c0117p.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0117p c0117p = this.f4057f;
        c0117p.f3010n = colorStateList;
        Z0.d.g(c0117p.f3001d, c0117p.f3006j, colorStateList, c0117p.f3011o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0117p c0117p = this.f4057f;
        c0117p.f3011o = mode;
        Z0.d.g(c0117p.f3001d, c0117p.f3006j, c0117p.f3010n, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f4087w == null) {
            J j3 = new J(getContext(), null);
            this.f4087w = j3;
            j3.setId(com.ai.assistance.operit.provider.R.id.textinput_placeholder);
            this.f4087w.setImportantForAccessibility(2);
            j d3 = d();
            this.f4093z = d3;
            d3.f1001e = 67L;
            this.f4024A = d();
            setPlaceholderTextAppearance(this.f4091y);
            setPlaceholderTextColor(this.f4089x);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f4085v) {
                setPlaceholderTextEnabled(true);
            }
            this.f4083u = charSequence;
        }
        EditText editText = this.f4059g;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i3) {
        this.f4091y = i3;
        J j3 = this.f4087w;
        if (j3 != null) {
            j3.setTextAppearance(i3);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f4089x != colorStateList) {
            this.f4089x = colorStateList;
            J j3 = this.f4087w;
            if (j3 == null || colorStateList == null) {
                return;
            }
            j3.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v vVar = this.f4055e;
        vVar.getClass();
        vVar.f3065f = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vVar.f3064e.setText(charSequence);
        vVar.e();
    }

    public void setPrefixTextAppearance(int i3) {
        this.f4055e.f3064e.setTextAppearance(i3);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f4055e.f3064e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f4035I;
        if (gVar == null || gVar.f2685d.f2669a == kVar) {
            return;
        }
        this.f4041O = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z3) {
        this.f4055e.f3066g.setCheckable(z3);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f4055e.f3066g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i3) {
        setStartIconDrawable(i3 != 0 ? Z.b.r(getContext(), i3) : null);
    }

    public void setStartIconMinSize(int i3) {
        v vVar = this.f4055e;
        if (i3 < 0) {
            vVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i3 != vVar.f3068j) {
            vVar.f3068j = i3;
            CheckableImageButton checkableImageButton = vVar.f3066g;
            checkableImageButton.setMinimumWidth(i3);
            checkableImageButton.setMinimumHeight(i3);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f4055e;
        View.OnLongClickListener onLongClickListener = vVar.f3070l;
        CheckableImageButton checkableImageButton = vVar.f3066g;
        checkableImageButton.setOnClickListener(onClickListener);
        Z0.d.O(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f4055e;
        vVar.f3070l = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f3066g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Z0.d.O(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.f4055e;
        vVar.f3069k = scaleType;
        vVar.f3066g.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f4055e;
        if (vVar.h != colorStateList) {
            vVar.h = colorStateList;
            Z0.d.g(vVar.f3063d, vVar.f3066g, colorStateList, vVar.f3067i);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f4055e;
        if (vVar.f3067i != mode) {
            vVar.f3067i = mode;
            Z0.d.g(vVar.f3063d, vVar.f3066g, vVar.h, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.f4055e.c(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0117p c0117p = this.f4057f;
        c0117p.getClass();
        c0117p.f3015s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0117p.f3016t.setText(charSequence);
        c0117p.n();
    }

    public void setSuffixTextAppearance(int i3) {
        this.f4057f.f3016t.setTextAppearance(i3);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f4057f.f3016t.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(y yVar) {
        EditText editText = this.f4059g;
        if (editText != null) {
            AbstractC0189K.j(editText, yVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f4056e0) {
            this.f4056e0 = typeface;
            this.f4090x0.m(typeface);
            t tVar = this.f4068m;
            if (typeface != tVar.f3034B) {
                tVar.f3034B = typeface;
                J j3 = tVar.f3051r;
                if (j3 != null) {
                    j3.setTypeface(typeface);
                }
                J j4 = tVar.f3058y;
                if (j4 != null) {
                    j4.setTypeface(typeface);
                }
            }
            J j5 = this.f4077r;
            if (j5 != null) {
                j5.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f4044R != 1) {
            FrameLayout frameLayout = this.f4053d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c3 = c();
            if (c3 != layoutParams.topMargin) {
                layoutParams.topMargin = c3;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z3, boolean z4) {
        ColorStateList colorStateList;
        J j3;
        boolean isEnabled = isEnabled();
        EditText editText = this.f4059g;
        boolean z5 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f4059g;
        boolean z6 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f4067l0;
        b bVar = this.f4090x0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f4067l0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f4086v0) : this.f4086v0));
        } else if (m()) {
            J j4 = this.f4068m.f3051r;
            bVar.i(j4 != null ? j4.getTextColors() : null);
        } else if (this.f4074p && (j3 = this.f4077r) != null) {
            bVar.i(j3.getTextColors());
        } else if (z6 && (colorStateList = this.f4069m0) != null && bVar.f2277k != colorStateList) {
            bVar.f2277k = colorStateList;
            bVar.h(false);
        }
        C0117p c0117p = this.f4057f;
        v vVar = this.f4055e;
        if (z5 || !this.f4092y0 || (isEnabled() && z6)) {
            if (z4 || this.f4088w0) {
                ValueAnimator valueAnimator = this.f4025A0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f4025A0.cancel();
                }
                if (z3 && this.f4094z0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f4088w0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f4059g;
                v(editText3 != null ? editText3.getText() : null);
                vVar.f3071m = false;
                vVar.e();
                c0117p.f3017u = false;
                c0117p.n();
                return;
            }
            return;
        }
        if (z4 || !this.f4088w0) {
            ValueAnimator valueAnimator2 = this.f4025A0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f4025A0.cancel();
            }
            if (z3 && this.f4094z0) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && !((C0109h) this.f4035I).f2977A.f2975q.isEmpty() && e()) {
                ((C0109h) this.f4035I).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f4088w0 = true;
            J j5 = this.f4087w;
            if (j5 != null && this.f4085v) {
                j5.setText((CharSequence) null);
                D1.s.a(this.f4053d, this.f4024A);
                this.f4087w.setVisibility(4);
            }
            vVar.f3071m = true;
            vVar.e();
            c0117p.f3017u = true;
            c0117p.n();
        }
    }

    public final void v(Editable editable) {
        ((d) this.f4075q).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f4053d;
        if (length != 0 || this.f4088w0) {
            J j3 = this.f4087w;
            if (j3 == null || !this.f4085v) {
                return;
            }
            j3.setText((CharSequence) null);
            D1.s.a(frameLayout, this.f4024A);
            this.f4087w.setVisibility(4);
            return;
        }
        if (this.f4087w == null || !this.f4085v || TextUtils.isEmpty(this.f4083u)) {
            return;
        }
        this.f4087w.setText(this.f4083u);
        D1.s.a(frameLayout, this.f4093z);
        this.f4087w.setVisibility(0);
        this.f4087w.bringToFront();
        announceForAccessibility(this.f4083u);
    }

    public final void w(boolean z3, boolean z4) {
        int defaultColor = this.f4076q0.getDefaultColor();
        int colorForState = this.f4076q0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f4076q0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.f4049W = colorForState2;
        } else if (z4) {
            this.f4049W = colorForState;
        } else {
            this.f4049W = defaultColor;
        }
    }

    public final void x() {
        J j3;
        EditText editText;
        EditText editText2;
        if (this.f4035I == null || this.f4044R == 0) {
            return;
        }
        boolean z3 = false;
        boolean z4 = isFocused() || ((editText2 = this.f4059g) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f4059g) != null && editText.isHovered())) {
            z3 = true;
        }
        if (!isEnabled()) {
            this.f4049W = this.f4086v0;
        } else if (m()) {
            if (this.f4076q0 != null) {
                w(z4, z3);
            } else {
                this.f4049W = getErrorCurrentTextColors();
            }
        } else if (!this.f4074p || (j3 = this.f4077r) == null) {
            if (z4) {
                this.f4049W = this.p0;
            } else if (z3) {
                this.f4049W = this.f4073o0;
            } else {
                this.f4049W = this.f4071n0;
            }
        } else if (this.f4076q0 != null) {
            w(z4, z3);
        } else {
            this.f4049W = j3.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        C0117p c0117p = this.f4057f;
        c0117p.l();
        CheckableImageButton checkableImageButton = c0117p.f3003f;
        ColorStateList colorStateList = c0117p.f3004g;
        TextInputLayout textInputLayout = c0117p.f3001d;
        Z0.d.M(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0117p.f3010n;
        CheckableImageButton checkableImageButton2 = c0117p.f3006j;
        Z0.d.M(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0117p.b() instanceof C0112k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                Z0.d.g(textInputLayout, checkableImageButton2, c0117p.f3010n, c0117p.f3011o);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                W0.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        v vVar = this.f4055e;
        Z0.d.M(vVar.f3063d, vVar.f3066g, vVar.h);
        if (this.f4044R == 2) {
            int i3 = this.f4046T;
            if (z4 && isEnabled()) {
                this.f4046T = this.f4048V;
            } else {
                this.f4046T = this.f4047U;
            }
            if (this.f4046T != i3 && e() && !this.f4088w0) {
                if (e()) {
                    ((C0109h) this.f4035I).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f4044R == 1) {
            if (!isEnabled()) {
                this.f4050a0 = this.f4080s0;
            } else if (z3 && !z4) {
                this.f4050a0 = this.f4084u0;
            } else if (z4) {
                this.f4050a0 = this.f4082t0;
            } else {
                this.f4050a0 = this.f4078r0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f4055e.b(drawable);
    }

    public void setHint(int i3) {
        setHint(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setStartIconContentDescription(int i3) {
        setStartIconContentDescription(i3 != 0 ? getResources().getText(i3) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f4057f.f3006j.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f4057f.f3006j.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f4057f.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f4057f.f3006j;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0117p c0117p = this.f4057f;
        CheckableImageButton checkableImageButton = c0117p.f3006j;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0117p.f3010n;
            PorterDuff.Mode mode = c0117p.f3011o;
            TextInputLayout textInputLayout = c0117p.f3001d;
            Z0.d.g(textInputLayout, checkableImageButton, colorStateList, mode);
            Z0.d.M(textInputLayout, checkableImageButton, c0117p.f3010n);
        }
    }
}
