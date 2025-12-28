package androidx.appcompat.view.menu;

import B0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import g.AbstractC0262a;
import j.j;
import j.q;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d, reason: collision with root package name */
    public j f3089d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView f3090e;

    /* renamed from: f, reason: collision with root package name */
    public RadioButton f3091f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f3092g;
    public CheckBox h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f3093i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f3094j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f3095k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f3096l;

    /* renamed from: m, reason: collision with root package name */
    public final Drawable f3097m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3098n;

    /* renamed from: o, reason: collision with root package name */
    public final Context f3099o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3100p;

    /* renamed from: q, reason: collision with root package name */
    public final Drawable f3101q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3102r;

    /* renamed from: s, reason: collision with root package name */
    public LayoutInflater f3103s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3104t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a y3 = a.y(getContext(), attributeSet, AbstractC0262a.f4304o, R.attr.listMenuViewStyle);
        this.f3097m = y3.m(5);
        TypedArray typedArray = (TypedArray) y3.f272c;
        this.f3098n = typedArray.getResourceId(1, -1);
        this.f3100p = typedArray.getBoolean(7, false);
        this.f3099o = context;
        this.f3101q = y3.m(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3102r = obtainStyledAttributes.hasValue(0);
        y3.C();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3103s == null) {
            this.f3103s = LayoutInflater.from(getContext());
        }
        return this.f3103s;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f3094j;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3095k;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3095k.getLayoutParams();
        rect.top = this.f3095k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // j.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(j.j r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(j.j):void");
    }

    @Override // j.q
    public j getItemData() {
        return this.f3089d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = AbstractC0189K.f4150a;
        setBackground(this.f3097m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3092g = textView;
        int i3 = this.f3098n;
        if (i3 != -1) {
            textView.setTextAppearance(this.f3099o, i3);
        }
        this.f3093i = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3094j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3101q);
        }
        this.f3095k = (ImageView) findViewById(R.id.group_divider);
        this.f3096l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.f3090e != null && this.f3100p) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3090e.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f3091f == null && this.h == null) {
            return;
        }
        if ((this.f3089d.f4562x & 4) != 0) {
            if (this.f3091f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3091f = radioButton;
                LinearLayout linearLayout = this.f3096l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3091f;
            view = this.h;
        } else {
            if (this.h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.h = checkBox;
                LinearLayout linearLayout2 = this.f3096l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.h;
            view = this.f3091f;
        }
        if (z3) {
            compoundButton.setChecked(this.f3089d.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.h;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3091f;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f3089d.f4562x & 4) != 0) {
            if (this.f3091f == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3091f = radioButton;
                LinearLayout linearLayout = this.f3096l;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3091f;
        } else {
            if (this.h == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.h = checkBox;
                LinearLayout linearLayout2 = this.f3096l;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.h;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f3104t = z3;
        this.f3100p = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f3095k;
        if (imageView != null) {
            imageView.setVisibility((this.f3102r || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3089d.f4552n.getClass();
        boolean z3 = this.f3104t;
        if (z3 || this.f3100p) {
            ImageView imageView = this.f3090e;
            if (imageView == null && drawable == null && !this.f3100p) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3090e = imageView2;
                LinearLayout linearLayout = this.f3096l;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3100p) {
                this.f3090e.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3090e;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3090e.getVisibility() != 0) {
                this.f3090e.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3092g.getVisibility() != 8) {
                this.f3092g.setVisibility(8);
            }
        } else {
            this.f3092g.setText(charSequence);
            if (this.f3092g.getVisibility() != 0) {
                this.f3092g.setVisibility(0);
            }
        }
    }
}
