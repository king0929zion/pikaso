package a2;

import a.AbstractC0090a;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.ai.assistance.operit.provider.R;

/* renamed from: a2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106e extends AbstractC0118q {

    /* renamed from: e, reason: collision with root package name */
    public final int f2966e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2967f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2968g;
    public final TimeInterpolator h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f2969i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnClickListenerC0102a f2970j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0103b f2971k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2972l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f2973m;

    public C0106e(C0117p c0117p) {
        super(c0117p);
        this.f2970j = new ViewOnClickListenerC0102a(this, 0);
        this.f2971k = new ViewOnFocusChangeListenerC0103b(this, 0);
        this.f2966e = AbstractC0090a.a0(c0117p.getContext(), R.attr.motionDurationShort3, 100);
        this.f2967f = AbstractC0090a.a0(c0117p.getContext(), R.attr.motionDurationShort3, 150);
        this.f2968g = AbstractC0090a.b0(c0117p.getContext(), R.attr.motionEasingLinearInterpolator, I1.a.f1390a);
        this.h = AbstractC0090a.b0(c0117p.getContext(), R.attr.motionEasingEmphasizedInterpolator, I1.a.f1393d);
    }

    @Override // a2.AbstractC0118q
    public final void a() {
        if (this.f3023b.f3015s != null) {
            return;
        }
        t(u());
    }

    @Override // a2.AbstractC0118q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // a2.AbstractC0118q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // a2.AbstractC0118q
    public final View.OnFocusChangeListener e() {
        return this.f2971k;
    }

    @Override // a2.AbstractC0118q
    public final View.OnClickListener f() {
        return this.f2970j;
    }

    @Override // a2.AbstractC0118q
    public final View.OnFocusChangeListener g() {
        return this.f2971k;
    }

    @Override // a2.AbstractC0118q
    public final void m(EditText editText) {
        this.f2969i = editText;
        this.f3022a.setEndIconVisible(u());
    }

    @Override // a2.AbstractC0118q
    public final void p(boolean z3) {
        if (this.f3023b.f3015s == null) {
            return;
        }
        t(z3);
    }

    @Override // a2.AbstractC0118q
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f2967f);
        ofFloat.addUpdateListener(new C0104c(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2968g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f2966e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new C0104c(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2972l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f2972l.addListener(new C0105d(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new C0104c(this, 0));
        this.f2973m = ofFloat3;
        ofFloat3.addListener(new C0105d(this, 1));
    }

    @Override // a2.AbstractC0118q
    public final void s() {
        EditText editText = this.f2969i;
        if (editText != null) {
            editText.post(new R.a(3, this));
        }
    }

    public final void t(boolean z3) {
        boolean z4 = this.f3023b.d() == z3;
        if (z3 && !this.f2972l.isRunning()) {
            this.f2973m.cancel();
            this.f2972l.start();
            if (z4) {
                this.f2972l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f2972l.cancel();
        this.f2973m.start();
        if (z4) {
            this.f2973m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f2969i;
        return editText != null && (editText.hasFocus() || this.f3025d.hasFocus()) && this.f2969i.getText().length() > 0;
    }
}
