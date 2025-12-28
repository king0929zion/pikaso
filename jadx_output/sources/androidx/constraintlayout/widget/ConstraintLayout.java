package androidx.constraintlayout.widget;

import B2.i;
import J1.b;
import M0.e;
import M0.h;
import O0.c;
import O0.d;
import O0.f;
import O0.l;
import O0.m;
import O0.n;
import O0.p;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f3351d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3352e;

    /* renamed from: f, reason: collision with root package name */
    public final e f3353f;

    /* renamed from: g, reason: collision with root package name */
    public int f3354g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f3355i;

    /* renamed from: j, reason: collision with root package name */
    public int f3356j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3357k;

    /* renamed from: l, reason: collision with root package name */
    public int f3358l;

    /* renamed from: m, reason: collision with root package name */
    public l f3359m;

    /* renamed from: n, reason: collision with root package name */
    public i f3360n;

    /* renamed from: o, reason: collision with root package name */
    public int f3361o;

    /* renamed from: p, reason: collision with root package name */
    public HashMap f3362p;

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f3363q;

    /* renamed from: r, reason: collision with root package name */
    public final O0.e f3364r;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3351d = new SparseArray();
        this.f3352e = new ArrayList(4);
        this.f3353f = new e();
        this.f3354g = 0;
        this.h = 0;
        this.f3355i = Integer.MAX_VALUE;
        this.f3356j = Integer.MAX_VALUE;
        this.f3357k = true;
        this.f3358l = 263;
        this.f3359m = null;
        this.f3360n = null;
        this.f3361o = -1;
        this.f3362p = new HashMap();
        this.f3363q = new SparseArray();
        this.f3364r = new O0.e(this);
        c(attributeSet, 0);
    }

    public static d a() {
        d dVar = new d(-2, -2);
        dVar.f1912a = -1;
        dVar.f1914b = -1;
        dVar.f1916c = -1.0f;
        dVar.f1918d = -1;
        dVar.f1920e = -1;
        dVar.f1922f = -1;
        dVar.f1924g = -1;
        dVar.h = -1;
        dVar.f1927i = -1;
        dVar.f1928j = -1;
        dVar.f1930k = -1;
        dVar.f1931l = -1;
        dVar.f1932m = -1;
        dVar.f1933n = 0;
        dVar.f1934o = 0.0f;
        dVar.f1935p = -1;
        dVar.f1936q = -1;
        dVar.f1937r = -1;
        dVar.f1938s = -1;
        dVar.f1939t = -1;
        dVar.f1940u = -1;
        dVar.f1941v = -1;
        dVar.f1942w = -1;
        dVar.f1943x = -1;
        dVar.f1944y = -1;
        dVar.f1945z = 0.5f;
        dVar.f1886A = 0.5f;
        dVar.f1887B = null;
        dVar.f1888C = 1;
        dVar.f1889D = -1.0f;
        dVar.f1890E = -1.0f;
        dVar.f1891F = 0;
        dVar.f1892G = 0;
        dVar.f1893H = 0;
        dVar.f1894I = 0;
        dVar.f1895J = 0;
        dVar.f1896K = 0;
        dVar.f1897L = 0;
        dVar.f1898M = 0;
        dVar.f1899N = 1.0f;
        dVar.f1900O = 1.0f;
        dVar.f1901P = -1;
        dVar.f1902Q = -1;
        dVar.f1903R = -1;
        dVar.f1904S = false;
        dVar.f1905T = false;
        dVar.f1906U = null;
        dVar.f1907V = true;
        dVar.f1908W = true;
        dVar.f1909X = false;
        dVar.f1910Y = false;
        dVar.f1911Z = false;
        dVar.f1913a0 = -1;
        dVar.f1915b0 = -1;
        dVar.f1917c0 = -1;
        dVar.f1919d0 = -1;
        dVar.f1921e0 = -1;
        dVar.f1923f0 = -1;
        dVar.f1925g0 = 0.5f;
        dVar.k0 = new M0.d();
        return dVar;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public final M0.d b(View view) {
        if (view == this) {
            return this.f3353f;
        }
        if (view == null) {
            return null;
        }
        return ((d) view.getLayoutParams()).k0;
    }

    public final void c(AttributeSet attributeSet, int i3) {
        e eVar = this.f3353f;
        eVar.f1570U = this;
        O0.e eVar2 = this.f3364r;
        eVar.f1607g0 = eVar2;
        eVar.f1606f0.f1815f = eVar2;
        this.f3351d.put(getId(), this);
        this.f3359m = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f2051b, i3, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 9) {
                    this.f3354g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3354g);
                } else if (index == 10) {
                    this.h = obtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == 7) {
                    this.f3355i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3355i);
                } else if (index == 8) {
                    this.f3356j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3356j);
                } else if (index == 89) {
                    this.f3358l = obtainStyledAttributes.getInt(index, this.f3358l);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3360n = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        l lVar = new l();
                        this.f3359m = lVar;
                        lVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3359m = null;
                    }
                    this.f3361o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i5 = this.f3358l;
        eVar.p0 = i5;
        L0.e.f1471p = (i5 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(int i3) {
        char c3;
        Context context = getContext();
        i iVar = new i(3, false);
        iVar.f316e = new SparseArray();
        iVar.f317f = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 != 0 && c3 != 1) {
                        if (c3 == 2) {
                            bVar = new b(context, xml);
                            ((SparseArray) iVar.f316e).put(bVar.f1431a, bVar);
                        } else if (c3 == 3) {
                            f fVar = new f(context, xml);
                            if (bVar != null) {
                                ((ArrayList) bVar.f1433c).add(fVar);
                            }
                        } else if (c3 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            iVar.r(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
        this.f3360n = iVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f3352e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                ((O0.b) arrayList.get(i3)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i5 = (int) ((parseInt / 1080.0f) * width);
                        int i6 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i5;
                        float f4 = i6;
                        float f5 = i5 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f3, f4, f5, f4, paint);
                        float parseInt4 = i6 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f5, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f5, f4, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(M0.e r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e(M0.e, int, int, int):void");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f3357k = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i3;
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.f1912a = -1;
        dVar.f1914b = -1;
        dVar.f1916c = -1.0f;
        dVar.f1918d = -1;
        dVar.f1920e = -1;
        dVar.f1922f = -1;
        dVar.f1924g = -1;
        dVar.h = -1;
        dVar.f1927i = -1;
        dVar.f1928j = -1;
        dVar.f1930k = -1;
        dVar.f1931l = -1;
        dVar.f1932m = -1;
        dVar.f1933n = 0;
        dVar.f1934o = 0.0f;
        dVar.f1935p = -1;
        dVar.f1936q = -1;
        dVar.f1937r = -1;
        dVar.f1938s = -1;
        dVar.f1939t = -1;
        dVar.f1940u = -1;
        dVar.f1941v = -1;
        dVar.f1942w = -1;
        dVar.f1943x = -1;
        dVar.f1944y = -1;
        dVar.f1945z = 0.5f;
        dVar.f1886A = 0.5f;
        dVar.f1887B = null;
        dVar.f1888C = 1;
        dVar.f1889D = -1.0f;
        dVar.f1890E = -1.0f;
        dVar.f1891F = 0;
        dVar.f1892G = 0;
        dVar.f1893H = 0;
        dVar.f1894I = 0;
        dVar.f1895J = 0;
        dVar.f1896K = 0;
        dVar.f1897L = 0;
        dVar.f1898M = 0;
        dVar.f1899N = 1.0f;
        dVar.f1900O = 1.0f;
        dVar.f1901P = -1;
        dVar.f1902Q = -1;
        dVar.f1903R = -1;
        dVar.f1904S = false;
        dVar.f1905T = false;
        dVar.f1906U = null;
        dVar.f1907V = true;
        dVar.f1908W = true;
        dVar.f1909X = false;
        dVar.f1910Y = false;
        dVar.f1911Z = false;
        dVar.f1913a0 = -1;
        dVar.f1915b0 = -1;
        dVar.f1917c0 = -1;
        dVar.f1919d0 = -1;
        dVar.f1921e0 = -1;
        dVar.f1923f0 = -1;
        dVar.f1925g0 = 0.5f;
        dVar.k0 = new M0.d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f2051b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i5 = c.f1885a.get(index);
            switch (i5) {
                case 1:
                    dVar.f1903R = obtainStyledAttributes.getInt(index, dVar.f1903R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, dVar.f1932m);
                    dVar.f1932m = resourceId;
                    if (resourceId == -1) {
                        dVar.f1932m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    dVar.f1933n = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1933n);
                    break;
                case 4:
                    float f3 = obtainStyledAttributes.getFloat(index, dVar.f1934o) % 360.0f;
                    dVar.f1934o = f3;
                    if (f3 < 0.0f) {
                        dVar.f1934o = (360.0f - f3) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    dVar.f1912a = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f1912a);
                    break;
                case 6:
                    dVar.f1914b = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f1914b);
                    break;
                case 7:
                    dVar.f1916c = obtainStyledAttributes.getFloat(index, dVar.f1916c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, dVar.f1918d);
                    dVar.f1918d = resourceId2;
                    if (resourceId2 == -1) {
                        dVar.f1918d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, dVar.f1920e);
                    dVar.f1920e = resourceId3;
                    if (resourceId3 == -1) {
                        dVar.f1920e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, dVar.f1922f);
                    dVar.f1922f = resourceId4;
                    if (resourceId4 == -1) {
                        dVar.f1922f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, dVar.f1924g);
                    dVar.f1924g = resourceId5;
                    if (resourceId5 == -1) {
                        dVar.f1924g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, dVar.h);
                    dVar.h = resourceId6;
                    if (resourceId6 == -1) {
                        dVar.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, dVar.f1927i);
                    dVar.f1927i = resourceId7;
                    if (resourceId7 == -1) {
                        dVar.f1927i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, dVar.f1928j);
                    dVar.f1928j = resourceId8;
                    if (resourceId8 == -1) {
                        dVar.f1928j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, dVar.f1930k);
                    dVar.f1930k = resourceId9;
                    if (resourceId9 == -1) {
                        dVar.f1930k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, dVar.f1931l);
                    dVar.f1931l = resourceId10;
                    if (resourceId10 == -1) {
                        dVar.f1931l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, dVar.f1935p);
                    dVar.f1935p = resourceId11;
                    if (resourceId11 == -1) {
                        dVar.f1935p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, dVar.f1936q);
                    dVar.f1936q = resourceId12;
                    if (resourceId12 == -1) {
                        dVar.f1936q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, dVar.f1937r);
                    dVar.f1937r = resourceId13;
                    if (resourceId13 == -1) {
                        dVar.f1937r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, dVar.f1938s);
                    dVar.f1938s = resourceId14;
                    if (resourceId14 == -1) {
                        dVar.f1938s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    dVar.f1939t = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1939t);
                    break;
                case 22:
                    dVar.f1940u = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1940u);
                    break;
                case 23:
                    dVar.f1941v = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1941v);
                    break;
                case 24:
                    dVar.f1942w = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1942w);
                    break;
                case 25:
                    dVar.f1943x = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1943x);
                    break;
                case 26:
                    dVar.f1944y = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1944y);
                    break;
                case 27:
                    dVar.f1904S = obtainStyledAttributes.getBoolean(index, dVar.f1904S);
                    break;
                case 28:
                    dVar.f1905T = obtainStyledAttributes.getBoolean(index, dVar.f1905T);
                    break;
                case 29:
                    dVar.f1945z = obtainStyledAttributes.getFloat(index, dVar.f1945z);
                    break;
                case 30:
                    dVar.f1886A = obtainStyledAttributes.getFloat(index, dVar.f1886A);
                    break;
                case 31:
                    int i6 = obtainStyledAttributes.getInt(index, 0);
                    dVar.f1893H = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i7 = obtainStyledAttributes.getInt(index, 0);
                    dVar.f1894I = i7;
                    if (i7 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        dVar.f1895J = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1895J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, dVar.f1895J) == -2) {
                            dVar.f1895J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        dVar.f1897L = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1897L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, dVar.f1897L) == -2) {
                            dVar.f1897L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    dVar.f1899N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, dVar.f1899N));
                    dVar.f1893H = 2;
                    break;
                case 36:
                    try {
                        dVar.f1896K = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1896K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, dVar.f1896K) == -2) {
                            dVar.f1896K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        dVar.f1898M = obtainStyledAttributes.getDimensionPixelSize(index, dVar.f1898M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, dVar.f1898M) == -2) {
                            dVar.f1898M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    dVar.f1900O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, dVar.f1900O));
                    dVar.f1894I = 2;
                    break;
                default:
                    switch (i5) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            dVar.f1887B = string;
                            dVar.f1888C = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = dVar.f1887B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i3 = 0;
                                } else {
                                    String substring = dVar.f1887B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        dVar.f1888C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        dVar.f1888C = 1;
                                    }
                                    i3 = indexOf + 1;
                                }
                                int indexOf2 = dVar.f1887B.indexOf(58);
                                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                    String substring2 = dVar.f1887B.substring(i3);
                                    if (substring2.length() > 0) {
                                        Float.parseFloat(substring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String substring3 = dVar.f1887B.substring(i3, indexOf2);
                                    String substring4 = dVar.f1887B.substring(indexOf2 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring3);
                                            float parseFloat2 = Float.parseFloat(substring4);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (dVar.f1888C == 1) {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            dVar.f1889D = obtainStyledAttributes.getFloat(index, dVar.f1889D);
                            break;
                        case 46:
                            dVar.f1890E = obtainStyledAttributes.getFloat(index, dVar.f1890E);
                            break;
                        case 47:
                            dVar.f1891F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            dVar.f1892G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            dVar.f1901P = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f1901P);
                            break;
                        case 50:
                            dVar.f1902Q = obtainStyledAttributes.getDimensionPixelOffset(index, dVar.f1902Q);
                            break;
                        case 51:
                            dVar.f1906U = obtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        dVar.a();
        return dVar;
    }

    public int getMaxHeight() {
        return this.f3356j;
    }

    public int getMaxWidth() {
        return this.f3355i;
    }

    public int getMinHeight() {
        return this.h;
    }

    public int getMinWidth() {
        return this.f3354g;
    }

    public int getOptimizationLevel() {
        return this.f3353f.p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            d dVar = (d) childAt.getLayoutParams();
            M0.d dVar2 = dVar.k0;
            if (childAt.getVisibility() != 8 || dVar.f1910Y || dVar.f1911Z || isInEditMode) {
                int m2 = dVar2.m();
                int n2 = dVar2.n();
                childAt.layout(m2, n2, dVar2.l() + m2, dVar2.i() + n2);
            }
        }
        ArrayList arrayList = this.f3352e;
        int size = arrayList.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((O0.b) arrayList.get(i8)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:261:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0175  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        M0.d b3 = b(view);
        if ((view instanceof n) && !(b3 instanceof h)) {
            d dVar = (d) view.getLayoutParams();
            h hVar = new h();
            dVar.k0 = hVar;
            dVar.f1910Y = true;
            hVar.B(dVar.f1903R);
        }
        if (view instanceof O0.b) {
            O0.b bVar = (O0.b) view;
            bVar.g();
            ((d) view.getLayoutParams()).f1911Z = true;
            ArrayList arrayList = this.f3352e;
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        this.f3351d.put(view.getId(), view);
        this.f3357k = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3351d.remove(view.getId());
        M0.d b3 = b(view);
        this.f3353f.f1604d0.remove(b3);
        b3.f1558I = null;
        this.f3352e.remove(view);
        this.f3357k = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3357k = true;
        super.requestLayout();
    }

    public void setConstraintSet(l lVar) {
        this.f3359m = lVar;
    }

    @Override // android.view.View
    public void setId(int i3) {
        int id = getId();
        SparseArray sparseArray = this.f3351d;
        sparseArray.remove(id);
        super.setId(i3);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i3) {
        if (i3 == this.f3356j) {
            return;
        }
        this.f3356j = i3;
        requestLayout();
    }

    public void setMaxWidth(int i3) {
        if (i3 == this.f3355i) {
            return;
        }
        this.f3355i = i3;
        requestLayout();
    }

    public void setMinHeight(int i3) {
        if (i3 == this.h) {
            return;
        }
        this.h = i3;
        requestLayout();
    }

    public void setMinWidth(int i3) {
        if (i3 == this.f3354g) {
            return;
        }
        this.f3354g = i3;
        requestLayout();
    }

    public void setOnConstraintsChanged(m mVar) {
        i iVar = this.f3360n;
        if (iVar != null) {
            iVar.getClass();
        }
    }

    public void setOptimizationLevel(int i3) {
        this.f3358l = i3;
        this.f3353f.p0 = i3;
        L0.e.f1471p = (i3 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3351d = new SparseArray();
        this.f3352e = new ArrayList(4);
        this.f3353f = new e();
        this.f3354g = 0;
        this.h = 0;
        this.f3355i = Integer.MAX_VALUE;
        this.f3356j = Integer.MAX_VALUE;
        this.f3357k = true;
        this.f3358l = 263;
        this.f3359m = null;
        this.f3360n = null;
        this.f3361o = -1;
        this.f3362p = new HashMap();
        this.f3363q = new SparseArray();
        this.f3364r = new O0.e(this);
        c(attributeSet, i3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        d dVar = new d(layoutParams);
        dVar.f1912a = -1;
        dVar.f1914b = -1;
        dVar.f1916c = -1.0f;
        dVar.f1918d = -1;
        dVar.f1920e = -1;
        dVar.f1922f = -1;
        dVar.f1924g = -1;
        dVar.h = -1;
        dVar.f1927i = -1;
        dVar.f1928j = -1;
        dVar.f1930k = -1;
        dVar.f1931l = -1;
        dVar.f1932m = -1;
        dVar.f1933n = 0;
        dVar.f1934o = 0.0f;
        dVar.f1935p = -1;
        dVar.f1936q = -1;
        dVar.f1937r = -1;
        dVar.f1938s = -1;
        dVar.f1939t = -1;
        dVar.f1940u = -1;
        dVar.f1941v = -1;
        dVar.f1942w = -1;
        dVar.f1943x = -1;
        dVar.f1944y = -1;
        dVar.f1945z = 0.5f;
        dVar.f1886A = 0.5f;
        dVar.f1887B = null;
        dVar.f1888C = 1;
        dVar.f1889D = -1.0f;
        dVar.f1890E = -1.0f;
        dVar.f1891F = 0;
        dVar.f1892G = 0;
        dVar.f1893H = 0;
        dVar.f1894I = 0;
        dVar.f1895J = 0;
        dVar.f1896K = 0;
        dVar.f1897L = 0;
        dVar.f1898M = 0;
        dVar.f1899N = 1.0f;
        dVar.f1900O = 1.0f;
        dVar.f1901P = -1;
        dVar.f1902Q = -1;
        dVar.f1903R = -1;
        dVar.f1904S = false;
        dVar.f1905T = false;
        dVar.f1906U = null;
        dVar.f1907V = true;
        dVar.f1908W = true;
        dVar.f1909X = false;
        dVar.f1910Y = false;
        dVar.f1911Z = false;
        dVar.f1913a0 = -1;
        dVar.f1915b0 = -1;
        dVar.f1917c0 = -1;
        dVar.f1919d0 = -1;
        dVar.f1921e0 = -1;
        dVar.f1923f0 = -1;
        dVar.f1925g0 = 0.5f;
        dVar.k0 = new M0.d();
        return dVar;
    }
}
