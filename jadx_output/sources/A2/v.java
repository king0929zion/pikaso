package a2;

import a.AbstractC0090a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import k.J;

/* loaded from: classes.dex */
public final class v extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3063d;

    /* renamed from: e, reason: collision with root package name */
    public final J f3064e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f3065f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f3066g;
    public ColorStateList h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f3067i;

    /* renamed from: j, reason: collision with root package name */
    public int f3068j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView.ScaleType f3069k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnLongClickListener f3070l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3071m;

    public v(TextInputLayout textInputLayout, B0.a aVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f3063d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3066g = checkableImageButton;
        J j3 = new J(getContext(), null);
        this.f3064e = j3;
        if (AbstractC0090a.Q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3070l;
        checkableImageButton.setOnClickListener(null);
        Z0.d.O(checkableImageButton, onLongClickListener);
        this.f3070l = null;
        checkableImageButton.setOnLongClickListener(null);
        Z0.d.O(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) aVar.f272c;
        if (typedArray.hasValue(69)) {
            this.h = AbstractC0090a.E(getContext(), aVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f3067i = S1.k.f(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(aVar.m(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3068j) {
            this.f3068j = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType o3 = Z0.d.o(typedArray.getInt(68, -1));
            this.f3069k = o3;
            checkableImageButton.setScaleType(o3);
        }
        j3.setVisibility(8);
        j3.setId(R.id.textinput_prefix_text);
        j3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Field field = AbstractC0189K.f4150a;
        j3.setAccessibilityLiveRegion(1);
        j3.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            j3.setTextColor(aVar.k(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f3065f = TextUtils.isEmpty(text2) ? null : text2;
        j3.setText(text2);
        e();
        addView(checkableImageButton);
        addView(j3);
    }

    public final int a() {
        int i3;
        CheckableImageButton checkableImageButton = this.f3066g;
        if (checkableImageButton.getVisibility() == 0) {
            i3 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        Field field = AbstractC0189K.f4150a;
        return this.f3064e.getPaddingStart() + getPaddingStart() + i3;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3066g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.h;
            PorterDuff.Mode mode = this.f3067i;
            TextInputLayout textInputLayout = this.f3063d;
            Z0.d.g(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            Z0.d.M(textInputLayout, checkableImageButton, this.h);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f3070l;
        checkableImageButton.setOnClickListener(null);
        Z0.d.O(checkableImageButton, onLongClickListener);
        this.f3070l = null;
        checkableImageButton.setOnLongClickListener(null);
        Z0.d.O(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z3) {
        CheckableImageButton checkableImageButton = this.f3066g;
        if ((checkableImageButton.getVisibility() == 0) != z3) {
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f3063d.f4059g;
        if (editText == null) {
            return;
        }
        if (this.f3066g.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            Field field = AbstractC0189K.f4150a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        Field field2 = AbstractC0189K.f4150a;
        this.f3064e.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i3 = (this.f3065f == null || this.f3071m) ? 8 : 0;
        setVisibility((this.f3066g.getVisibility() == 0 || i3 == 0) ? 0 : 8);
        this.f3064e.setVisibility(i3);
        this.f3063d.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        d();
    }
}
