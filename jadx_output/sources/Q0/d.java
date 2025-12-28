package Q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a f2174a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2175b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2176c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2177d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2178e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2179f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2180g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2181i;

    /* renamed from: j, reason: collision with root package name */
    public int f2182j;

    /* renamed from: k, reason: collision with root package name */
    public View f2183k;

    /* renamed from: l, reason: collision with root package name */
    public View f2184l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2185m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2186n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f2187o;

    public d() {
        super(-2, -2);
        this.f2175b = false;
        this.f2176c = 0;
        this.f2177d = 0;
        this.f2178e = -1;
        this.f2179f = -1;
        this.f2180g = 0;
        this.h = 0;
        this.f2187o = new Rect();
    }

    public final boolean a(int i3) {
        if (i3 == 0) {
            return this.f2185m;
        }
        if (i3 != 1) {
            return false;
        }
        return this.f2186n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        this.f2175b = false;
        this.f2176c = 0;
        this.f2177d = 0;
        this.f2178e = -1;
        this.f2179f = -1;
        this.f2180g = 0;
        this.h = 0;
        this.f2187o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P0.a.f2102b);
        this.f2176c = obtainStyledAttributes.getInteger(0, 0);
        this.f2179f = obtainStyledAttributes.getResourceId(1, -1);
        this.f2177d = obtainStyledAttributes.getInteger(2, 0);
        this.f2178e = obtainStyledAttributes.getInteger(6, -1);
        this.f2180g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f2175b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f3366w;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f3366w;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f3368y;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f3367x);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e3) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e3);
                }
            }
            this.f2174a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.f2174a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f2175b = false;
        this.f2176c = 0;
        this.f2177d = 0;
        this.f2178e = -1;
        this.f2179f = -1;
        this.f2180g = 0;
        this.h = 0;
        this.f2187o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2175b = false;
        this.f2176c = 0;
        this.f2177d = 0;
        this.f2178e = -1;
        this.f2179f = -1;
        this.f2180g = 0;
        this.h = 0;
        this.f2187o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2175b = false;
        this.f2176c = 0;
        this.f2177d = 0;
        this.f2178e = -1;
        this.f2179f = -1;
        this.f2180g = 0;
        this.h = 0;
        this.f2187o = new Rect();
    }
}
