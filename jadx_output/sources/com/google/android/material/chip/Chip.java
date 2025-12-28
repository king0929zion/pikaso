package com.google.android.material.chip;

import H1.a;
import P1.b;
import P1.c;
import P1.d;
import P1.e;
import P1.f;
import S1.i;
import S1.k;
import X1.v;
import a.AbstractC0090a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import b1.C0137b;
import b2.AbstractC0139a;
import com.google.android.material.chip.Chip;
import d1.AbstractC0189K;
import d1.AbstractC0229z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Locale;
import k.AbstractC0326o;

/* loaded from: classes.dex */
public class Chip extends AbstractC0326o implements e, v, Checkable {
    public f h;

    /* renamed from: i, reason: collision with root package name */
    public InsetDrawable f3959i;

    /* renamed from: j, reason: collision with root package name */
    public RippleDrawable f3960j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f3961k;

    /* renamed from: l, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f3962l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3963m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3964n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3965o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3966p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3967q;

    /* renamed from: r, reason: collision with root package name */
    public int f3968r;

    /* renamed from: s, reason: collision with root package name */
    public int f3969s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f3970t;

    /* renamed from: u, reason: collision with root package name */
    public final d f3971u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3972v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3973w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f3974x;

    /* renamed from: y, reason: collision with root package name */
    public final b f3975y;

    /* renamed from: z, reason: collision with root package name */
    public static final Rect f3958z = new Rect();

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f3956A = {R.attr.state_selected};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f3957B = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet) {
        super(AbstractC0139a.a(context, attributeSet, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action), attributeSet);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f3973w = new Rect();
        this.f3974x = new RectF();
        this.f3975y = new b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = a.f1337b;
        Context context3 = fVar.f2150h0;
        k.a(context3, attributeSet, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context3, attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action);
        fVar.f2124H0 = obtainStyledAttributes.hasValue(37);
        ColorStateList F3 = AbstractC0090a.F(context3, obtainStyledAttributes, 24);
        if (fVar.f2109A != F3) {
            fVar.f2109A = F3;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList F4 = AbstractC0090a.F(context3, obtainStyledAttributes, 11);
        if (fVar.f2111B != F4) {
            fVar.f2111B = F4;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = obtainStyledAttributes.getDimension(19, 0.0f);
        if (fVar.f2113C != dimension) {
            fVar.f2113C = dimension;
            fVar.invalidateSelf();
            fVar.u();
        }
        if (obtainStyledAttributes.hasValue(12)) {
            fVar.A(obtainStyledAttributes.getDimension(12, 0.0f));
        }
        fVar.F(AbstractC0090a.F(context3, obtainStyledAttributes, 22));
        fVar.G(obtainStyledAttributes.getDimension(23, 0.0f));
        fVar.P(AbstractC0090a.F(context3, obtainStyledAttributes, 36));
        String text = obtainStyledAttributes.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f2123H, text)) {
            fVar.f2123H = text;
            fVar.f2154n0.f2314d = true;
            fVar.invalidateSelf();
            fVar.u();
        }
        U1.d dVar = (!obtainStyledAttributes.hasValue(0) || (resourceId3 = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? null : new U1.d(context3, resourceId3);
        dVar.f2434k = obtainStyledAttributes.getDimension(1, dVar.f2434k);
        fVar.Q(dVar);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        if (i3 == 1) {
            fVar.f2118E0 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            fVar.f2118E0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            fVar.f2118E0 = TextUtils.TruncateAt.END;
        }
        fVar.E(obtainStyledAttributes.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.E(obtainStyledAttributes.getBoolean(15, false));
        }
        fVar.B(AbstractC0090a.H(context3, obtainStyledAttributes, 14));
        if (obtainStyledAttributes.hasValue(17)) {
            fVar.D(AbstractC0090a.F(context3, obtainStyledAttributes, 17));
        }
        fVar.C(obtainStyledAttributes.getDimension(16, -1.0f));
        fVar.M(obtainStyledAttributes.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.M(obtainStyledAttributes.getBoolean(26, false));
        }
        fVar.H(AbstractC0090a.H(context3, obtainStyledAttributes, 25));
        fVar.L(AbstractC0090a.F(context3, obtainStyledAttributes, 30));
        fVar.J(obtainStyledAttributes.getDimension(28, 0.0f));
        fVar.w(obtainStyledAttributes.getBoolean(6, false));
        fVar.z(obtainStyledAttributes.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.z(obtainStyledAttributes.getBoolean(8, false));
        }
        fVar.x(AbstractC0090a.H(context3, obtainStyledAttributes, 7));
        if (obtainStyledAttributes.hasValue(9)) {
            fVar.y(AbstractC0090a.F(context3, obtainStyledAttributes, 9));
        }
        fVar.f2140X = (!obtainStyledAttributes.hasValue(39) || (resourceId2 = obtainStyledAttributes.getResourceId(39, 0)) == 0) ? null : I1.b.a(context3, resourceId2);
        fVar.f2141Y = (!obtainStyledAttributes.hasValue(33) || (resourceId = obtainStyledAttributes.getResourceId(33, 0)) == 0) ? null : I1.b.a(context3, resourceId);
        float dimension2 = obtainStyledAttributes.getDimension(21, 0.0f);
        if (fVar.f2142Z != dimension2) {
            fVar.f2142Z = dimension2;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.O(obtainStyledAttributes.getDimension(35, 0.0f));
        fVar.N(obtainStyledAttributes.getDimension(34, 0.0f));
        float dimension3 = obtainStyledAttributes.getDimension(41, 0.0f);
        if (fVar.f2145c0 != dimension3) {
            fVar.f2145c0 = dimension3;
            fVar.invalidateSelf();
            fVar.u();
        }
        float dimension4 = obtainStyledAttributes.getDimension(40, 0.0f);
        if (fVar.f2146d0 != dimension4) {
            fVar.f2146d0 = dimension4;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.K(obtainStyledAttributes.getDimension(29, 0.0f));
        fVar.I(obtainStyledAttributes.getDimension(27, 0.0f));
        float dimension5 = obtainStyledAttributes.getDimension(13, 0.0f);
        if (fVar.f2149g0 != dimension5) {
            fVar.f2149g0 = dimension5;
            fVar.invalidateSelf();
            fVar.u();
        }
        fVar.f2122G0 = obtainStyledAttributes.getDimensionPixelSize(4, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
        k.a(context2, attributeSet, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action);
        this.f3967q = obtainStyledAttributes2.getBoolean(32, false);
        this.f3969s = (int) Math.ceil(obtainStyledAttributes2.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes2.recycle();
        setChipDrawable(fVar);
        fVar.i(AbstractC0229z.i(this));
        k.a(context2, attributeSet, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action);
        k.b(context2, attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, com.ai.assistance.operit.provider.R.attr.chipStyle, com.ai.assistance.operit.provider.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes3.hasValue(37);
        obtainStyledAttributes3.recycle();
        this.f3971u = new d(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f3963m);
        setText(fVar.f2123H);
        setEllipsize(fVar.f2118E0);
        h();
        if (!this.h.f2120F0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f3967q) {
            setMinHeight(this.f3969s);
        }
        this.f3968r = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: P1.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f3962l;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f3974x;
        rectF.setEmpty();
        if (c() && this.f3961k != null) {
            f fVar = this.h;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f3 = fVar.f2149g0 + fVar.f2148f0 + fVar.f2134R + fVar.f2147e0 + fVar.f2146d0;
                if (W0.b.a(fVar) == 0) {
                    float f4 = bounds.right;
                    rectF.right = f4;
                    rectF.left = f4 - f3;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i3 = (int) closeIconTouchBounds.left;
        int i4 = (int) closeIconTouchBounds.top;
        int i5 = (int) closeIconTouchBounds.right;
        int i6 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f3973w;
        rect.set(i3, i4, i5, i6);
        return rect;
    }

    private U1.d getTextAppearance() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2154n0.f2316f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f3965o != z3) {
            this.f3965o = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f3964n != z3) {
            this.f3964n = z3;
            refreshDrawableState();
        }
    }

    public final void b(int i3) {
        this.f3969s = i3;
        if (!this.f3967q) {
            InsetDrawable insetDrawable = this.f3959i;
            if (insetDrawable == null) {
                int[] iArr = V1.a.f2480a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f3959i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = V1.a.f2480a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i3 - ((int) this.h.f2113C));
        int max2 = Math.max(0, i3 - this.h.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f3959i;
            if (insetDrawable2 == null) {
                int[] iArr3 = V1.a.f2480a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f3959i = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = V1.a.f2480a;
                    f();
                    return;
                }
                return;
            }
        }
        int i4 = max2 > 0 ? max2 / 2 : 0;
        int i5 = max > 0 ? max / 2 : 0;
        if (this.f3959i != null) {
            Rect rect = new Rect();
            this.f3959i.getPadding(rect);
            if (rect.top == i5 && rect.bottom == i5 && rect.left == i4 && rect.right == i4) {
                int[] iArr5 = V1.a.f2480a;
                f();
                return;
            }
        }
        if (getMinHeight() != i3) {
            setMinHeight(i3);
        }
        if (getMinWidth() != i3) {
            setMinWidth(i3);
        }
        this.f3959i = new InsetDrawable((Drawable) this.h, i4, i5, i4, i5);
        int[] iArr6 = V1.a.f2480a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r2 = this;
            P1.f r0 = r2.h
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.f2131O
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof W0.d
            if (r1 == 0) goto Lf
            W0.d r0 = (W0.d) r0
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.c():boolean");
    }

    public final boolean d() {
        f fVar = this.h;
        return fVar != null && fVar.f2136T;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i3;
        if (!this.f3972v) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f3971u;
        AccessibilityManager accessibilityManager = dVar.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                Chip chip = dVar.f2107q;
                int i4 = (chip.c() && chip.getCloseIconTouchBounds().contains(x3, y3)) ? 1 : 0;
                int i5 = dVar.f5335m;
                if (i5 != i4) {
                    dVar.f5335m = i4;
                    dVar.q(i4, 128);
                    dVar.q(i5, 256);
                }
                if (i4 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i3 = dVar.f5335m) != Integer.MIN_VALUE) {
                if (i3 == Integer.MIN_VALUE) {
                    return true;
                }
                dVar.f5335m = Integer.MIN_VALUE;
                dVar.q(i3, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3972v) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f3971u;
        dVar.getClass();
        boolean z3 = false;
        int i3 = 0;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        z3 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i4 = 33;
                                } else if (keyCode == 21) {
                                    i4 = 17;
                                } else if (keyCode != 22) {
                                    i4 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z4 = false;
                                while (i3 < repeatCount && dVar.m(i4, null)) {
                                    i3++;
                                    z4 = true;
                                }
                                z3 = z4;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = dVar.f5334l;
                    if (i5 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f2107q;
                        if (i5 == 0) {
                            chip.performClick();
                        } else if (i5 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f3961k;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f3972v) {
                                chip.f3971u.q(1, 1);
                            }
                        }
                    }
                    z3 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z3 = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z3 = dVar.m(1, null);
            }
        }
        if (!z3 || dVar.f5334l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // k.AbstractC0326o, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i3;
        super.drawableStateChanged();
        f fVar = this.h;
        boolean z3 = false;
        if (fVar != null && f.t(fVar.f2131O)) {
            f fVar2 = this.h;
            ?? isEnabled = isEnabled();
            int i4 = isEnabled;
            if (this.f3966p) {
                i4 = isEnabled + 1;
            }
            int i5 = i4;
            if (this.f3965o) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (this.f3964n) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (isChecked()) {
                i7 = i6 + 1;
            }
            int[] iArr = new int[i7];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (this.f3966p) {
                iArr[i3] = 16842908;
                i3++;
            }
            if (this.f3965o) {
                iArr[i3] = 16843623;
                i3++;
            }
            if (this.f3964n) {
                iArr[i3] = 16842919;
                i3++;
            }
            if (isChecked()) {
                iArr[i3] = 16842913;
            }
            if (!Arrays.equals(fVar2.f2112B0, iArr)) {
                fVar2.f2112B0 = iArr;
                if (fVar2.T()) {
                    z3 = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (z3) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (!c() || (fVar = this.h) == null || !fVar.f2130N || this.f3961k == null) {
            AbstractC0189K.j(this, null);
            this.f3972v = false;
        } else {
            AbstractC0189K.j(this, this.f3971u);
            this.f3972v = true;
        }
    }

    public final void f() {
        this.f3960j = new RippleDrawable(V1.a.a(this.h.f2121G), getBackgroundDrawable(), null);
        this.h.getClass();
        RippleDrawable rippleDrawable = this.f3960j;
        Field field = AbstractC0189K.f4150a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.h) == null) {
            return;
        }
        int q3 = (int) (fVar.q() + fVar.f2149g0 + fVar.f2146d0);
        f fVar2 = this.h;
        int p3 = (int) (fVar2.p() + fVar2.f2142Z + fVar2.f2145c0);
        if (this.f3959i != null) {
            Rect rect = new Rect();
            this.f3959i.getPadding(rect);
            p3 += rect.left;
            q3 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        Field field = AbstractC0189K.f4150a;
        setPaddingRelative(p3, paddingTop, q3, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f3970t)) {
            return this.f3970t;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3959i;
        return insetDrawable == null ? this.h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2138V;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2139W;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2111B;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.h;
        if (fVar != null) {
            return Math.max(0.0f, fVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.h;
    }

    public float getChipEndPadding() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2149g0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.h;
        if (fVar == null || (drawable = fVar.f2126J) == 0) {
            return null;
        }
        boolean z3 = drawable instanceof W0.d;
        Drawable drawable2 = drawable;
        if (z3) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2128L;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2127K;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2113C;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2142Z;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2117E;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2119F;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.h;
        if (fVar == null || (drawable = fVar.f2131O) == 0) {
            return null;
        }
        boolean z3 = drawable instanceof W0.d;
        Drawable drawable2 = drawable;
        if (z3) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2135S;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2148f0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2134R;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2147e0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2133Q;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2118E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f3972v) {
            d dVar = this.f3971u;
            if (dVar.f5334l == 1 || dVar.f5333k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public I1.b getHideMotionSpec() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2141Y;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2144b0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2143a0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2121G;
        }
        return null;
    }

    public X1.k getShapeAppearanceModel() {
        return this.h.f2685d.f2669a;
    }

    public I1.b getShowMotionSpec() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2140X;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2146d0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.h;
        if (fVar != null) {
            return fVar.f2145c0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.h;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        U1.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f3975y);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r2.a.X(this, this.h);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3956A);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f3957B);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        super.onFocusChanged(z3, i3, rect);
        if (this.f3972v) {
            d dVar = this.f3971u;
            int i4 = dVar.f5334l;
            if (i4 != Integer.MIN_VALUE) {
                dVar.j(i4);
            }
            if (z3) {
                dVar.m(i3, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i3) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i3);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        if (this.f3968r != i3) {
            this.f3968r = i3;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f3964n
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f3964n
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f3961k
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f3972v
            if (r0 == 0) goto L43
            P1.d r0 = r5.f3971u
            r0.q(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3970t = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3960j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // k.AbstractC0326o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3960j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // k.AbstractC0326o, android.view.View
    public void setBackgroundResource(int i3) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.w(z3);
        }
    }

    public void setCheckableResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.w(fVar.f2150h0.getResources().getBoolean(i3));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        f fVar = this.h;
        if (fVar == null) {
            this.f3963m = z3;
        } else if (fVar.f2136T) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i3) {
        setCheckedIconVisible(i3);
    }

    public void setCheckedIconResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.x(Z.b.r(fVar.f2150h0, i3));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.y(r2.a.y(fVar.f2150h0, i3));
        }
    }

    public void setCheckedIconVisible(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.z(fVar.f2150h0.getResources().getBoolean(i3));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.h;
        if (fVar == null || fVar.f2111B == colorStateList) {
            return;
        }
        fVar.f2111B = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i3) {
        ColorStateList y3;
        f fVar = this.h;
        if (fVar == null || fVar.f2111B == (y3 = r2.a.y(fVar.f2150h0, i3))) {
            return;
        }
        fVar.f2111B = y3;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.A(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.A(fVar.f2150h0.getResources().getDimension(i3));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.h;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f2116D0 = new WeakReference(null);
            }
            this.h = fVar;
            fVar.f2120F0 = false;
            fVar.f2116D0 = new WeakReference(this);
            b(this.f3969s);
        }
    }

    public void setChipEndPadding(float f3) {
        f fVar = this.h;
        if (fVar == null || fVar.f2149g0 == f3) {
            return;
        }
        fVar.f2149g0 = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipEndPaddingResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            float dimension = fVar.f2150h0.getResources().getDimension(i3);
            if (fVar.f2149g0 != dimension) {
                fVar.f2149g0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i3) {
        setChipIconVisible(i3);
    }

    public void setChipIconResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.B(Z.b.r(fVar.f2150h0, i3));
        }
    }

    public void setChipIconSize(float f3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.C(f3);
        }
    }

    public void setChipIconSizeResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.C(fVar.f2150h0.getResources().getDimension(i3));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.D(r2.a.y(fVar.f2150h0, i3));
        }
    }

    public void setChipIconVisible(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.E(fVar.f2150h0.getResources().getBoolean(i3));
        }
    }

    public void setChipMinHeight(float f3) {
        f fVar = this.h;
        if (fVar == null || fVar.f2113C == f3) {
            return;
        }
        fVar.f2113C = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipMinHeightResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            float dimension = fVar.f2150h0.getResources().getDimension(i3);
            if (fVar.f2113C != dimension) {
                fVar.f2113C = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f3) {
        f fVar = this.h;
        if (fVar == null || fVar.f2142Z == f3) {
            return;
        }
        fVar.f2142Z = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setChipStartPaddingResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            float dimension = fVar.f2150h0.getResources().getDimension(i3);
            if (fVar.f2142Z != dimension) {
                fVar.f2142Z = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.F(r2.a.y(fVar.f2150h0, i3));
        }
    }

    public void setChipStrokeWidth(float f3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.G(f3);
        }
    }

    public void setChipStrokeWidthResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.G(fVar.f2150h0.getResources().getDimension(i3));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i3) {
        setText(getResources().getString(i3));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.h;
        if (fVar == null || fVar.f2135S == charSequence) {
            return;
        }
        String str = C0137b.f3647b;
        C0137b c0137b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0137b.f3650e : C0137b.f3649d;
        c0137b.getClass();
        M1.d dVar = b1.f.f3657a;
        fVar.f2135S = c0137b.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i3) {
        setCloseIconVisible(i3);
    }

    public void setCloseIconEndPadding(float f3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.I(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.I(fVar.f2150h0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.H(Z.b.r(fVar.f2150h0, i3));
        }
        e();
    }

    public void setCloseIconSize(float f3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.J(f3);
        }
    }

    public void setCloseIconSizeResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.J(fVar.f2150h0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconStartPadding(float f3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.K(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.K(fVar.f2150h0.getResources().getDimension(i3));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.L(r2.a.y(fVar.f2150h0, i3));
        }
    }

    public void setCloseIconVisible(int i3) {
        setCloseIconVisible(getResources().getBoolean(i3));
    }

    @Override // k.AbstractC0326o, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // k.AbstractC0326o, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, i4, i5, i6);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        f fVar = this.h;
        if (fVar != null) {
            fVar.i(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.h == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.h;
        if (fVar != null) {
            fVar.f2118E0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f3967q = z3;
        b(this.f3969s);
    }

    @Override // android.widget.TextView
    public void setGravity(int i3) {
        if (i3 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i3);
        }
    }

    public void setHideMotionSpec(I1.b bVar) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.f2141Y = bVar;
        }
    }

    public void setHideMotionSpecResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.f2141Y = I1.b.a(fVar.f2150h0, i3);
        }
    }

    public void setIconEndPadding(float f3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.N(f3);
        }
    }

    public void setIconEndPaddingResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.N(fVar.f2150h0.getResources().getDimension(i3));
        }
    }

    public void setIconStartPadding(float f3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.O(f3);
        }
    }

    public void setIconStartPaddingResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.O(fVar.f2150h0.getResources().getDimension(i3));
        }
    }

    public void setInternalOnCheckedChangeListener(S1.e eVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i3) {
        if (this.h == null) {
            return;
        }
        super.setLayoutDirection(i3);
    }

    @Override // android.widget.TextView
    public void setLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i3) {
        super.setMaxWidth(i3);
        f fVar = this.h;
        if (fVar != null) {
            fVar.f2122G0 = i3;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i3);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3962l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3961k = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        this.h.getClass();
        f();
    }

    public void setRippleColorResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.P(r2.a.y(fVar.f2150h0, i3));
            this.h.getClass();
            f();
        }
    }

    @Override // X1.v
    public void setShapeAppearanceModel(X1.k kVar) {
        this.h.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(I1.b bVar) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.f2140X = bVar;
        }
    }

    public void setShowMotionSpecResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.f2140X = I1.b.a(fVar.f2150h0, i3);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z3) {
        if (!z3) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z3);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.h;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f2120F0 ? null : charSequence, bufferType);
        f fVar2 = this.h;
        if (fVar2 == null || TextUtils.equals(fVar2.f2123H, charSequence)) {
            return;
        }
        fVar2.f2123H = charSequence;
        fVar2.f2154n0.f2314d = true;
        fVar2.invalidateSelf();
        fVar2.u();
    }

    public void setTextAppearance(U1.d dVar) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i3) {
        setTextAppearance(getContext(), i3);
    }

    public void setTextEndPadding(float f3) {
        f fVar = this.h;
        if (fVar == null || fVar.f2146d0 == f3) {
            return;
        }
        fVar.f2146d0 = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextEndPaddingResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            float dimension = fVar.f2150h0.getResources().getDimension(i3);
            if (fVar.f2146d0 != dimension) {
                fVar.f2146d0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        super.setTextSize(i3, f3);
        f fVar = this.h;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i3, f3, getResources().getDisplayMetrics());
            i iVar = fVar.f2154n0;
            U1.d dVar = iVar.f2316f;
            if (dVar != null) {
                dVar.f2434k = applyDimension;
                iVar.f2311a.setTextSize(applyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f3) {
        f fVar = this.h;
        if (fVar == null || fVar.f2145c0 == f3) {
            return;
        }
        fVar.f2145c0 = f3;
        fVar.invalidateSelf();
        fVar.u();
    }

    public void setTextStartPaddingResource(int i3) {
        f fVar = this.h;
        if (fVar != null) {
            float dimension = fVar.f2150h0.getResources().getDimension(i3);
            if (fVar.f2145c0 != dimension) {
                fVar.f2145c0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.M(z3);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.z(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        f fVar = this.h;
        if (fVar != null) {
            fVar.E(z3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        f fVar = this.h;
        if (fVar != null) {
            fVar.Q(new U1.d(fVar.f2150h0, i3));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i3) {
        super.setTextAppearance(i3);
        f fVar = this.h;
        if (fVar != null) {
            fVar.Q(new U1.d(fVar.f2150h0, i3));
        }
        h();
    }
}
