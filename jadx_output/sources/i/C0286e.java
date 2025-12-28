package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import g.AbstractC0262a;
import j.i;
import java.io.IOException;
import k.U;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286e extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f4452e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f4453f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f4454a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4455b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4456c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4457d;

    static {
        Class[] clsArr = {Context.class};
        f4452e = clsArr;
        f4453f = clsArr;
    }

    public C0286e(Context context) {
        super(context);
        this.f4456c = context;
        Object[] objArr = {context};
        this.f4454a = objArr;
        this.f4455b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i3;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        C0285d c0285d = new C0285d(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i3 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i3) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z5 && name2.equals(str)) {
                        z3 = r4;
                        z5 = false;
                        str = null;
                        eventType = xmlResourceParser.next();
                        r4 = z3;
                        i3 = 2;
                        z5 = z5;
                    } else if (name2.equals("group")) {
                        c0285d.f4428b = 0;
                        c0285d.f4429c = 0;
                        c0285d.f4430d = 0;
                        c0285d.f4431e = 0;
                        c0285d.f4432f = r4;
                        c0285d.f4433g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0285d.h) {
                            c0285d.h = r4;
                            c0285d.b(c0285d.f4427a.add(c0285d.f4428b, c0285d.f4434i, c0285d.f4435j, c0285d.f4436k));
                        }
                    } else if (name2.equals("menu")) {
                        z3 = r4;
                        z4 = z3;
                    }
                }
                z3 = r4;
            } else {
                if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0286e c0286e = c0285d.f4426D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0286e.f4456c.obtainStyledAttributes(attributeSet, AbstractC0262a.f4302m);
                        c0285d.f4428b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0285d.f4429c = obtainStyledAttributes.getInt(3, 0);
                        c0285d.f4430d = obtainStyledAttributes.getInt(4, 0);
                        c0285d.f4431e = obtainStyledAttributes.getInt(5, 0);
                        c0285d.f4432f = obtainStyledAttributes.getBoolean(2, r4);
                        c0285d.f4433g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0286e.f4456c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0262a.f4303n);
                            c0285d.f4434i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0285d.f4435j = (obtainStyledAttributes2.getInt(5, c0285d.f4429c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0285d.f4430d) & 65535);
                            c0285d.f4436k = obtainStyledAttributes2.getText(7);
                            c0285d.f4437l = obtainStyledAttributes2.getText(8);
                            c0285d.f4438m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0285d.f4439n = string == null ? (char) 0 : string.charAt(0);
                            c0285d.f4440o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0285d.f4441p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0285d.f4442q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0285d.f4443r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0285d.f4443r = c0285d.f4431e;
                            }
                            c0285d.f4444s = obtainStyledAttributes2.getBoolean(3, false);
                            c0285d.f4445t = obtainStyledAttributes2.getBoolean(4, c0285d.f4432f);
                            c0285d.f4446u = obtainStyledAttributes2.getBoolean(1, c0285d.f4433g);
                            c0285d.f4447v = obtainStyledAttributes2.getInt(21, -1);
                            c0285d.f4450y = obtainStyledAttributes2.getString(12);
                            c0285d.f4448w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0285d.f4449x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z6 = string3 != null;
                            if (z6 && c0285d.f4448w == 0 && c0285d.f4449x == null) {
                                if (c0285d.a(string3, f4453f, c0286e.f4455b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z6) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            c0285d.f4451z = obtainStyledAttributes2.getText(17);
                            c0285d.f4423A = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0285d.f4425C = U.b(obtainStyledAttributes2.getInt(19, -1), c0285d.f4425C);
                            } else {
                                c0285d.f4425C = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = r2.a.y(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c0285d.f4424B = colorStateList;
                            } else {
                                c0285d.f4424B = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0285d.h = false;
                            z3 = true;
                        } else if (name3.equals("menu")) {
                            z3 = true;
                            c0285d.h = true;
                            SubMenu addSubMenu = c0285d.f4427a.addSubMenu(c0285d.f4428b, c0285d.f4434i, c0285d.f4435j, c0285d.f4436k);
                            c0285d.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            z3 = true;
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = z3;
                        i3 = 2;
                        z5 = z5;
                    }
                }
                z3 = r4;
            }
            eventType = xmlResourceParser.next();
            r4 = z3;
            i3 = 2;
            z5 = z5;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i3, Menu menu) {
        if (!(menu instanceof i)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f4456c.getResources().getLayout(i3);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (XmlPullParserException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
