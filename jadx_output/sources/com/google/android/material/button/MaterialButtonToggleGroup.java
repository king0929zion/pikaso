package com.google.android.material.button;

import A.t;
import H1.a;
import N1.d;
import N1.e;
import N1.f;
import S1.k;
import X1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import b2.AbstractC0139a;
import com.ai.assistance.operit.provider.R;
import d1.AbstractC0189K;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3946n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3947d;

    /* renamed from: e, reason: collision with root package name */
    public final t f3948e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f3949f;

    /* renamed from: g, reason: collision with root package name */
    public final d f3950g;
    public Integer[] h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3951i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3952j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3953k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3954l;

    /* renamed from: m, reason: collision with root package name */
    public HashSet f3955m;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0139a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f3947d = new ArrayList();
        this.f3948e = new t(9, this);
        this.f3949f = new LinkedHashSet();
        this.f3950g = new d(0, this);
        this.f3951i = false;
        this.f3955m = new HashSet();
        Context context2 = getContext();
        int[] iArr = a.f1343i;
        k.a(context2, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup);
        k.b(context2, attributeSet, iArr, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup);
        setSingleSelection(obtainStyledAttributes.getBoolean(3, false));
        this.f3954l = obtainStyledAttributes.getResourceId(1, -1);
        this.f3953k = obtainStyledAttributes.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        Field field = AbstractC0189K.f4150a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (c(i3)) {
                return i3;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && c(i4)) {
                i3++;
            }
        }
        return i3;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = AbstractC0189K.f4150a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3948e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i3 = firstVisibleChildIndex + 1; i3 < getChildCount(); i3++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i3);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i3 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i3, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f3943r);
        X1.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3947d.add(new f(shapeAppearanceModel.f2722e, shapeAppearanceModel.h, shapeAppearanceModel.f2723f, shapeAppearanceModel.f2724g));
        materialButton.setEnabled(isEnabled());
        AbstractC0189K.j(materialButton, new e(this, 0));
    }

    public final void b(int i3, boolean z3) {
        if (i3 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i3);
            return;
        }
        HashSet hashSet = new HashSet(this.f3955m);
        if (z3 && !hashSet.contains(Integer.valueOf(i3))) {
            if (this.f3952j && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i3));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i3))) {
                return;
            }
            if (!this.f3953k || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i3));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i3) {
        return getChildAt(i3).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f3955m;
        this.f3955m = new HashSet(set);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = ((MaterialButton) getChildAt(i3)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f3951i = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f3951i = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f3949f.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3950g);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            treeMap.put((MaterialButton) getChildAt(i3), Integer.valueOf(i3));
        }
        this.h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        f fVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i3 = 0; i3 < childCount; i3++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i3);
            if (materialButton.getVisibility() != 8) {
                j d3 = materialButton.getShapeAppearanceModel().d();
                f fVar2 = (f) this.f3947d.get(i3);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z3 = getOrientation() == 0;
                    X1.a aVar = f.f1867e;
                    if (i3 == firstVisibleChildIndex) {
                        fVar = z3 ? k.e(this) ? new f(aVar, aVar, fVar2.f1869b, fVar2.f1870c) : new f(fVar2.f1868a, fVar2.f1871d, aVar, aVar) : new f(fVar2.f1868a, aVar, fVar2.f1869b, aVar);
                    } else if (i3 == lastVisibleChildIndex) {
                        fVar = z3 ? k.e(this) ? new f(fVar2.f1868a, fVar2.f1871d, aVar, aVar) : new f(aVar, aVar, fVar2.f1869b, fVar2.f1870c) : new f(aVar, fVar2.f1871d, aVar, fVar2.f1870c);
                    } else {
                        fVar2 = null;
                    }
                    fVar2 = fVar;
                }
                if (fVar2 == null) {
                    d3.f2711e = new X1.a(0.0f);
                    d3.f2712f = new X1.a(0.0f);
                    d3.f2713g = new X1.a(0.0f);
                    d3.h = new X1.a(0.0f);
                } else {
                    d3.f2711e = fVar2.f1868a;
                    d3.h = fVar2.f1871d;
                    d3.f2712f = fVar2.f1869b;
                    d3.f2713g = fVar2.f1870c;
                }
                materialButton.setShapeAppearanceModel(d3.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f3952j || this.f3955m.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3955m.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = ((MaterialButton) getChildAt(i3)).getId();
            if (this.f3955m.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        Integer[] numArr = this.h;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i4;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i3 = this.f3954l;
        if (i3 != -1) {
            d(Collections.singleton(Integer.valueOf(i3)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f3952j ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        e();
        a();
        super.onMeasure(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3947d.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            ((MaterialButton) getChildAt(i3)).setEnabled(z3);
        }
    }

    public void setSelectionRequired(boolean z3) {
        this.f3953k = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f3952j != z3) {
            this.f3952j = z3;
            d(new HashSet());
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            ((MaterialButton) getChildAt(i3)).setA11yClassName((this.f3952j ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i3) {
        setSingleSelection(getResources().getBoolean(i3));
    }
}
