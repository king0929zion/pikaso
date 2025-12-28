package a2;

import a.AbstractC0090a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.textfield.TextInputLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.J;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f3033A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f3034B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3035a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3036b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3037c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f3038d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f3039e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3040f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f3041g;
    public final TextInputLayout h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f3042i;

    /* renamed from: j, reason: collision with root package name */
    public int f3043j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f3044k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f3045l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3046m;

    /* renamed from: n, reason: collision with root package name */
    public int f3047n;

    /* renamed from: o, reason: collision with root package name */
    public int f3048o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f3049p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3050q;

    /* renamed from: r, reason: collision with root package name */
    public J f3051r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f3052s;

    /* renamed from: t, reason: collision with root package name */
    public int f3053t;

    /* renamed from: u, reason: collision with root package name */
    public int f3054u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f3055v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f3056w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3057x;

    /* renamed from: y, reason: collision with root package name */
    public J f3058y;

    /* renamed from: z, reason: collision with root package name */
    public int f3059z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3041g = context;
        this.h = textInputLayout;
        this.f3046m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f3035a = AbstractC0090a.a0(context, R.attr.motionDurationShort4, 217);
        this.f3036b = AbstractC0090a.a0(context, R.attr.motionDurationMedium4, 167);
        this.f3037c = AbstractC0090a.a0(context, R.attr.motionDurationShort4, 167);
        this.f3038d = AbstractC0090a.b0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, I1.a.f1393d);
        LinearInterpolator linearInterpolator = I1.a.f1390a;
        this.f3039e = AbstractC0090a.b0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f3040f = AbstractC0090a.b0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(J j3, int i3) {
        if (this.f3042i == null && this.f3044k == null) {
            Context context = this.f3041g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3042i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3042i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3044k = new FrameLayout(context);
            this.f3042i.addView(this.f3044k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i3 == 0 || i3 == 1) {
            this.f3044k.setVisibility(0);
            this.f3044k.addView(j3);
        } else {
            this.f3042i.addView(j3, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3042i.setVisibility(0);
        this.f3043j++;
    }

    public final void b() {
        if (this.f3042i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f3041g;
                boolean Q2 = AbstractC0090a.Q(context);
                LinearLayout linearLayout = this.f3042i;
                Field field = AbstractC0189K.f4150a;
                int paddingStart = editText.getPaddingStart();
                if (Q2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (Q2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (Q2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f3045l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, J j3, int i3, int i4, int i5) {
        if (j3 == null || !z3) {
            return;
        }
        if (i3 == i5 || i3 == i4) {
            boolean z4 = i5 == i3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j3, (Property<J, Float>) View.ALPHA, z4 ? 1.0f : 0.0f);
            int i6 = this.f3037c;
            ofFloat.setDuration(z4 ? this.f3036b : i6);
            ofFloat.setInterpolator(z4 ? this.f3039e : this.f3040f);
            if (i3 == i5 && i4 != 0) {
                ofFloat.setStartDelay(i6);
            }
            arrayList.add(ofFloat);
            if (i5 != i3 || i4 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(j3, (Property<J, Float>) View.TRANSLATION_Y, -this.f3046m, 0.0f);
            ofFloat2.setDuration(this.f3035a);
            ofFloat2.setInterpolator(this.f3038d);
            ofFloat2.setStartDelay(i6);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i3) {
        if (i3 == 1) {
            return this.f3051r;
        }
        if (i3 != 2) {
            return null;
        }
        return this.f3058y;
    }

    public final void f() {
        this.f3049p = null;
        c();
        if (this.f3047n == 1) {
            if (!this.f3057x || TextUtils.isEmpty(this.f3056w)) {
                this.f3048o = 0;
            } else {
                this.f3048o = 2;
            }
        }
        i(this.f3047n, this.f3048o, h(this.f3051r, ""));
    }

    public final void g(J j3, int i3) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f3042i;
        if (linearLayout == null) {
            return;
        }
        if ((i3 == 0 || i3 == 1) && (frameLayout = this.f3044k) != null) {
            frameLayout.removeView(j3);
        } else {
            linearLayout.removeView(j3);
        }
        int i4 = this.f3043j - 1;
        this.f3043j = i4;
        LinearLayout linearLayout2 = this.f3042i;
        if (i4 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(J j3, CharSequence charSequence) {
        Field field = AbstractC0189K.f4150a;
        TextInputLayout textInputLayout = this.h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f3048o == this.f3047n && j3 != null && TextUtils.equals(j3.getText(), charSequence));
    }

    public final void i(int i3, int i4, boolean z3) {
        TextView e3;
        TextView e4;
        if (i3 == i4) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3045l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3057x, this.f3058y, 2, i3, i4);
            d(arrayList, this.f3050q, this.f3051r, 1, i3, i4);
            int size = arrayList.size();
            long j3 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Animator animator = (Animator) arrayList.get(i5);
                j3 = Math.max(j3, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j3);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new C0119r(this, i4, e(i3), i3, e(i4)));
            animatorSet.start();
        } else if (i3 != i4) {
            if (i4 != 0 && (e4 = e(i4)) != null) {
                e4.setVisibility(0);
                e4.setAlpha(1.0f);
            }
            if (i3 != 0 && (e3 = e(i3)) != null) {
                e3.setVisibility(4);
                if (i3 == 1) {
                    e3.setText((CharSequence) null);
                }
            }
            this.f3047n = i4;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z3, false);
        textInputLayout.x();
    }
}
