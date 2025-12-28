package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import g.AbstractC0262a;
import j.AbstractC0290b;
import j.ViewOnTouchListenerC0289a;
import j.h;
import j.i;
import j.j;
import j.q;
import k.InterfaceC0314i;
import k.J;
import k.V0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends J implements q, View.OnClickListener, InterfaceC0314i {

    /* renamed from: k, reason: collision with root package name */
    public j f3077k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3078l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f3079m;

    /* renamed from: n, reason: collision with root package name */
    public h f3080n;

    /* renamed from: o, reason: collision with root package name */
    public ViewOnTouchListenerC0289a f3081o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0290b f3082p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3083q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3084r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3085s;

    /* renamed from: t, reason: collision with root package name */
    public int f3086t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3087u;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f3083q = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0262a.f4293c, 0, 0);
        this.f3085s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f3087u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3086t = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0314i
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.InterfaceC0314i
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f3077k.getIcon() == null;
    }

    @Override // j.q
    public final void c(j jVar) {
        this.f3077k = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f4540a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f3081o == null) {
            this.f3081o = new ViewOnTouchListenerC0289a(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        return i3 >= 480 || (i3 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // j.q
    public j getItemData() {
        return this.f3077k;
    }

    public final void h() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f3078l);
        if (this.f3079m != null && ((this.f3077k.f4563y & 4) != 4 || (!this.f3083q && !this.f3084r))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f3078l : null);
        CharSequence charSequence = this.f3077k.f4555q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z5 ? null : this.f3077k.f4544e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f3077k.f4556r;
        if (TextUtils.isEmpty(charSequence2)) {
            V0.a(this, z5 ? null : this.f3077k.f4544e);
        } else {
            V0.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f3080n;
        if (hVar != null) {
            hVar.a(this.f3077k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3083q = g();
        h();
    }

    @Override // k.J, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i5 = this.f3086t) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f3085s;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (!isEmpty || this.f3079m == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f3079m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewOnTouchListenerC0289a viewOnTouchListenerC0289a;
        if (this.f3077k.hasSubMenu() && (viewOnTouchListenerC0289a = this.f3081o) != null && viewOnTouchListenerC0289a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f3084r != z3) {
            this.f3084r = z3;
            j jVar = this.f3077k;
            if (jVar != null) {
                i iVar = jVar.f4552n;
                iVar.f4528k = true;
                iVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3079m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f3087u;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(h hVar) {
        this.f3080n = hVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f3086t = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(AbstractC0290b abstractC0290b) {
        this.f3082p = abstractC0290b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3078l = charSequence;
        h();
    }
}
