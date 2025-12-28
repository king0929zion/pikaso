package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1874a;

    /* renamed from: b, reason: collision with root package name */
    public int f1875b;

    /* renamed from: c, reason: collision with root package name */
    public float f1876c;

    /* renamed from: d, reason: collision with root package name */
    public String f1877d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1878e;

    /* renamed from: f, reason: collision with root package name */
    public int f1879f;

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f1874a = aVar.f1874a;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f2052c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i3 = 0;
        Object obj = null;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i3 = 6;
            } else {
                int i5 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i5 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i5 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i3 = 2;
                            } else if (index == 6) {
                                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i3 = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                            }
                        }
                        i3 = 7;
                    }
                }
                i3 = i5;
            }
        }
        if (str != null && obj != null) {
            a aVar = new a();
            aVar.f1874a = i3;
            aVar.b(obj);
            hashMap.put(str, aVar);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC0537f.b(this.f1874a)) {
            case 0:
                this.f1875b = ((Integer) obj).intValue();
                break;
            case 1:
                this.f1876c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f1879f = ((Integer) obj).intValue();
                break;
            case 4:
                this.f1877d = (String) obj;
                break;
            case 5:
                this.f1878e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f1876c = ((Float) obj).floatValue();
                break;
        }
    }
}
