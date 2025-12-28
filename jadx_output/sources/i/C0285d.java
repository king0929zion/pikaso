package i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import d1.AbstractC0213j;
import j.j;
import java.lang.reflect.Constructor;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f4423A;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C0286e f4426D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f4427a;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f4434i;

    /* renamed from: j, reason: collision with root package name */
    public int f4435j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4436k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4437l;

    /* renamed from: m, reason: collision with root package name */
    public int f4438m;

    /* renamed from: n, reason: collision with root package name */
    public char f4439n;

    /* renamed from: o, reason: collision with root package name */
    public int f4440o;

    /* renamed from: p, reason: collision with root package name */
    public char f4441p;

    /* renamed from: q, reason: collision with root package name */
    public int f4442q;

    /* renamed from: r, reason: collision with root package name */
    public int f4443r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4444s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4445t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4446u;

    /* renamed from: v, reason: collision with root package name */
    public int f4447v;

    /* renamed from: w, reason: collision with root package name */
    public int f4448w;

    /* renamed from: x, reason: collision with root package name */
    public String f4449x;

    /* renamed from: y, reason: collision with root package name */
    public String f4450y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f4451z;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f4424B = null;

    /* renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f4425C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f4428b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f4429c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f4430d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f4431e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4432f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4433g = true;

    public C0285d(C0286e c0286e, Menu menu) {
        this.f4426D = c0286e;
        this.f4427a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f4426D.f4456c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e3) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f4444s).setVisible(this.f4445t).setEnabled(this.f4446u).setCheckable(this.f4443r >= 1).setTitleCondensed(this.f4437l).setIcon(this.f4438m);
        int i3 = this.f4447v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f4450y;
        C0286e c0286e = this.f4426D;
        if (str != null) {
            if (c0286e.f4456c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c0286e.f4457d == null) {
                c0286e.f4457d = C0286e.a(c0286e.f4456c);
            }
            Object obj = c0286e.f4457d;
            String str2 = this.f4450y;
            MenuItemOnMenuItemClickListenerC0284c menuItemOnMenuItemClickListenerC0284c = new MenuItemOnMenuItemClickListenerC0284c();
            menuItemOnMenuItemClickListenerC0284c.f4421a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC0284c.f4422b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC0284c.f4420c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC0284c);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }
        if (this.f4443r >= 2 && (menuItem instanceof j)) {
            j jVar = (j) menuItem;
            jVar.f4562x = (jVar.f4562x & (-5)) | 4;
        }
        String str3 = this.f4449x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0286e.f4452e, c0286e.f4454a));
            z3 = true;
        }
        int i4 = this.f4448w;
        if (i4 > 0) {
            if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        CharSequence charSequence = this.f4451z;
        boolean z4 = menuItem instanceof j;
        if (z4) {
            ((j) menuItem).e(charSequence);
        } else {
            AbstractC0213j.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f4423A;
        if (z4) {
            ((j) menuItem).g(charSequence2);
        } else {
            AbstractC0213j.m(menuItem, charSequence2);
        }
        char c3 = this.f4439n;
        int i5 = this.f4440o;
        if (z4) {
            ((j) menuItem).setAlphabeticShortcut(c3, i5);
        } else {
            AbstractC0213j.g(menuItem, c3, i5);
        }
        char c4 = this.f4441p;
        int i6 = this.f4442q;
        if (z4) {
            ((j) menuItem).setNumericShortcut(c4, i6);
        } else {
            AbstractC0213j.k(menuItem, c4, i6);
        }
        PorterDuff.Mode mode = this.f4425C;
        if (mode != null) {
            if (z4) {
                ((j) menuItem).setIconTintMode(mode);
            } else {
                AbstractC0213j.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f4424B;
        if (colorStateList != null) {
            if (z4) {
                ((j) menuItem).setIconTintList(colorStateList);
            } else {
                AbstractC0213j.i(menuItem, colorStateList);
            }
        }
    }
}
