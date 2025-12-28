package U0;

import a1.C0095c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f2377a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f2378b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f2379c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f2380d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static I.m b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i3) {
        I.m mVar;
        if (c(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i3, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new I.m((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                mVar = I.m.c(typedArray.getResources(), typedArray.getResourceId(i3, 0), theme);
            } catch (Exception e3) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e3);
                mVar = null;
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new I.m((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int d(float f3) {
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f4 = (f3 + 16.0f) / 116.0f;
        float f5 = f3 > 8.0f ? f4 * f4 * f4 : f3 / 903.2963f;
        float f6 = f4 * f4 * f4;
        boolean z3 = f6 > 0.008856452f;
        float f7 = z3 ? f6 : ((f4 * 116.0f) - 16.0f) / 903.2963f;
        if (!z3) {
            f6 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f2379c;
        return V0.a.a(f7 * fArr[0], f5 * fArr[1], f6 * fArr[2]);
    }

    public static float e(int i3) {
        float f3 = i3 / 255.0f;
        return (f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static e i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R0.a.f2223b);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(4);
            String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    k(xmlResourceParser);
                }
                return new h(new C0095c(string, string2, string3, j(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R0.a.f2224c);
                        int i3 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z3 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i4 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i5 = obtainAttributes2.getInt(i4, 0);
                        int i6 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                        String string6 = obtainAttributes2.getString(i6);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            k(xmlResourceParser);
                        }
                        arrayList.add(new g(i3, i5, resourceId2, string6, string5, z3));
                    } else {
                        k(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new f((g[]) arrayList.toArray(new g[0]));
            }
        } else {
            k(xmlResourceParser);
        }
        return null;
    }

    public static List j(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (d.a(obtainTypedArray, 0) == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i3);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlResourceParser xmlResourceParser) {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i3) {
        new Handler(Looper.getMainLooper()).post(new n(i3, 0, this));
    }

    public abstract void g(int i3);

    public abstract void h(Typeface typeface);
}
