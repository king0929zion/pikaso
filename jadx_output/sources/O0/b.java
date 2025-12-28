package O0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: d, reason: collision with root package name */
    public int[] f1880d;

    /* renamed from: e, reason: collision with root package name */
    public int f1881e;

    /* renamed from: f, reason: collision with root package name */
    public Context f1882f;

    /* renamed from: g, reason: collision with root package name */
    public M0.i f1883g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f1884i;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1880d = new int[32];
        this.f1884i = new HashMap();
        this.f1882f = context;
        e(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La5
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La5
        La:
            android.content.Context r0 = r5.f1882f
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L59
            if (r1 == 0) goto L59
            if (r6 == 0) goto L4d
            java.util.HashMap r3 = r1.f3362p
            if (r3 == 0) goto L4d
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4d
            java.util.HashMap r3 = r1.f3362p
            java.lang.Object r3 = r3.get(r6)
            goto L4e
        L4d:
            r3 = r2
        L4e:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L59
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5a
        L59:
            r3 = 0
        L5a:
            if (r3 != 0) goto L62
            if (r1 == 0) goto L62
            int r3 = r5.d(r1, r6)
        L62:
            if (r3 != 0) goto L6e
            java.lang.Class<O0.o> r1 = O0.o.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L6e
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6e
        L6e:
            if (r3 != 0) goto L7e
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L7e:
            if (r3 == 0) goto L8d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f1884i
            r1.put(r0, r6)
            r5.b(r3)
            goto La5
        L8d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.b.a(java.lang.String):void");
    }

    public final void b(int i3) {
        if (i3 == getId()) {
            return;
        }
        int i4 = this.f1881e + 1;
        int[] iArr = this.f1880d;
        if (i4 > iArr.length) {
            this.f1880d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1880d;
        int i5 = this.f1881e;
        iArr2[i5] = i3;
        this.f1881e = i5 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i3 = 0; i3 < this.f1881e; i3++) {
            View view = (View) constraintLayout.f3351d.get(this.f1880d[i3]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1882f.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f2051b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.h = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(M0.d dVar, boolean z3);

    public final void g() {
        if (this.f1883g == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof d) {
            ((d) layoutParams).k0 = this.f1883g;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1880d, this.f1881e);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.h;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.h = str;
        if (str == null) {
            return;
        }
        int i3 = 0;
        this.f1881e = 0;
        while (true) {
            int indexOf = str.indexOf(44, i3);
            if (indexOf == -1) {
                a(str.substring(i3));
                return;
            } else {
                a(str.substring(i3, indexOf));
                i3 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.h = null;
        this.f1881e = 0;
        for (int i3 : iArr) {
            b(i3);
        }
    }
}
