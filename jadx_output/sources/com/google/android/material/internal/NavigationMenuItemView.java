package com.google.android.material.internal;

import N1.e;
import S1.d;
import U0.o;
import W0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import d1.AbstractC0189K;
import j.j;
import j.q;
import java.lang.reflect.Field;
import k.C0305d0;
import k.V0;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements q {

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f3984J = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f3985A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f3986B;

    /* renamed from: C, reason: collision with root package name */
    public final CheckedTextView f3987C;

    /* renamed from: D, reason: collision with root package name */
    public FrameLayout f3988D;

    /* renamed from: E, reason: collision with root package name */
    public j f3989E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f3990F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3991G;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f3992H;

    /* renamed from: I, reason: collision with root package name */
    public final e f3993I;

    /* renamed from: y, reason: collision with root package name */
    public int f3994y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3995z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3986B = true;
        e eVar = new e(this, 2);
        this.f3993I = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.ai.assistance.operit.provider.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.ai.assistance.operit.provider.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.ai.assistance.operit.provider.R.id.design_menu_item_text);
        this.f3987C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0189K.j(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3988D == null) {
                this.f3988D = (FrameLayout) ((ViewStub) findViewById(com.ai.assistance.operit.provider.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f3988D.removeAllViews();
            this.f3988D.addView(view);
        }
    }

    @Override // j.q
    public final void c(j jVar) {
        StateListDrawable stateListDrawable;
        this.f3989E = jVar;
        int i3 = jVar.f4540a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.ai.assistance.operit.provider.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3984J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = AbstractC0189K.f4150a;
            setBackground(stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.f4544e);
        setIcon(jVar.getIcon());
        View view = jVar.f4564z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(jVar.f4555q);
        V0.a(this, jVar.f4556r);
        j jVar2 = this.f3989E;
        CharSequence charSequence = jVar2.f4544e;
        CheckedTextView checkedTextView = this.f3987C;
        if (charSequence == null && jVar2.getIcon() == null) {
            View view2 = this.f3989E.f4564z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.f3988D;
                if (frameLayout != null) {
                    C0305d0 c0305d0 = (C0305d0) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) c0305d0).width = -1;
                    this.f3988D.setLayoutParams(c0305d0);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f3988D;
        if (frameLayout2 != null) {
            C0305d0 c0305d02 = (C0305d0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0305d02).width = -2;
            this.f3988D.setLayoutParams(c0305d02);
        }
    }

    @Override // j.q
    public j getItemData() {
        return this.f3989E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        j jVar = this.f3989E;
        if (jVar != null && jVar.isCheckable() && this.f3989E.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3984J);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f3985A != z3) {
            this.f3985A = z3;
            this.f3993I.h(this.f3987C, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f3987C;
        checkedTextView.setChecked(z3);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z3 && this.f3986B) ? 1 : 0);
    }

    public void setHorizontalPadding(int i3) {
        setPadding(i3, getPaddingTop(), i3, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f3991G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f3990F);
            }
            int i3 = this.f3994y;
            drawable.setBounds(0, 0, i3, i3);
        } else if (this.f3995z) {
            if (this.f3992H == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = o.f2403a;
                Drawable a3 = U0.j.a(resources, com.ai.assistance.operit.provider.R.drawable.navigation_empty_icon, theme);
                this.f3992H = a3;
                if (a3 != null) {
                    int i4 = this.f3994y;
                    a3.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.f3992H;
        }
        this.f3987C.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i3) {
        this.f3987C.setCompoundDrawablePadding(i3);
    }

    public void setIconSize(int i3) {
        this.f3994y = i3;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f3990F = colorStateList;
        this.f3991G = colorStateList != null;
        j jVar = this.f3989E;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i3) {
        this.f3987C.setMaxLines(i3);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f3995z = z3;
    }

    public void setTextAppearance(int i3) {
        this.f3987C.setTextAppearance(i3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3987C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3987C.setText(charSequence);
    }
}
