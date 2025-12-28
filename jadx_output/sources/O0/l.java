package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2045d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f2046e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2047a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2048b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2049c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2046e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(Barrier barrier, String str) {
        int i3;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < split.length) {
            String trim = split[i4].trim();
            Object obj = null;
            try {
                i3 = o.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i3 = 0;
            }
            if (i3 == 0) {
                i3 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i3 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f3362p;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f3362p.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i3 = ((Integer) obj).intValue();
                }
            }
            iArr[i5] = i3;
            i4++;
            i5++;
        }
        return i5 != split.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    public static g d(Context context, AttributeSet attributeSet) {
        g gVar = new g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f2050a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            j jVar = gVar.f1959b;
            i iVar = gVar.f1960c;
            k kVar = gVar.f1962e;
            h hVar = gVar.f1961d;
            if (index != 1 && 23 != index && 24 != index) {
                iVar.getClass();
                hVar.getClass();
                kVar.getClass();
            }
            SparseIntArray sparseIntArray = f2046e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    hVar.f2012o = f(obtainStyledAttributes, index, hVar.f2012o);
                    break;
                case 2:
                    hVar.f1970F = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1970F);
                    break;
                case 3:
                    hVar.f2011n = f(obtainStyledAttributes, index, hVar.f2011n);
                    break;
                case 4:
                    hVar.f2010m = f(obtainStyledAttributes, index, hVar.f2010m);
                    break;
                case 5:
                    hVar.f2019v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    hVar.f2023z = obtainStyledAttributes.getDimensionPixelOffset(index, hVar.f2023z);
                    break;
                case 7:
                    hVar.f1965A = obtainStyledAttributes.getDimensionPixelOffset(index, hVar.f1965A);
                    break;
                case 8:
                    hVar.f1971G = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1971G);
                    break;
                case 9:
                    hVar.f2016s = f(obtainStyledAttributes, index, hVar.f2016s);
                    break;
                case 10:
                    hVar.f2015r = f(obtainStyledAttributes, index, hVar.f2015r);
                    break;
                case 11:
                    hVar.f1976L = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1976L);
                    break;
                case 12:
                    hVar.f1977M = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1977M);
                    break;
                case 13:
                    hVar.f1973I = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1973I);
                    break;
                case 14:
                    hVar.f1975K = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1975K);
                    break;
                case 15:
                    hVar.f1978N = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1978N);
                    break;
                case 16:
                    hVar.f1974J = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1974J);
                    break;
                case 17:
                    hVar.f1997d = obtainStyledAttributes.getDimensionPixelOffset(index, hVar.f1997d);
                    break;
                case 18:
                    hVar.f1999e = obtainStyledAttributes.getDimensionPixelOffset(index, hVar.f1999e);
                    break;
                case 19:
                    hVar.f2001f = obtainStyledAttributes.getFloat(index, hVar.f2001f);
                    break;
                case 20:
                    hVar.f2017t = obtainStyledAttributes.getFloat(index, hVar.f2017t);
                    break;
                case 21:
                    hVar.f1995c = obtainStyledAttributes.getLayoutDimension(index, hVar.f1995c);
                    break;
                case 22:
                    int i4 = obtainStyledAttributes.getInt(index, jVar.f2029a);
                    jVar.f2029a = i4;
                    jVar.f2029a = f2045d[i4];
                    break;
                case 23:
                    hVar.f1993b = obtainStyledAttributes.getLayoutDimension(index, hVar.f1993b);
                    break;
                case 24:
                    hVar.f1967C = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1967C);
                    break;
                case 25:
                    hVar.f2003g = f(obtainStyledAttributes, index, hVar.f2003g);
                    break;
                case 26:
                    hVar.h = f(obtainStyledAttributes, index, hVar.h);
                    break;
                case 27:
                    hVar.f1966B = obtainStyledAttributes.getInt(index, hVar.f1966B);
                    break;
                case 28:
                    hVar.f1968D = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1968D);
                    break;
                case 29:
                    hVar.f2006i = f(obtainStyledAttributes, index, hVar.f2006i);
                    break;
                case 30:
                    hVar.f2007j = f(obtainStyledAttributes, index, hVar.f2007j);
                    break;
                case 31:
                    hVar.f1972H = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1972H);
                    break;
                case 32:
                    hVar.f2013p = f(obtainStyledAttributes, index, hVar.f2013p);
                    break;
                case 33:
                    hVar.f2014q = f(obtainStyledAttributes, index, hVar.f2014q);
                    break;
                case 34:
                    hVar.f1969E = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1969E);
                    break;
                case 35:
                    hVar.f2009l = f(obtainStyledAttributes, index, hVar.f2009l);
                    break;
                case 36:
                    hVar.f2008k = f(obtainStyledAttributes, index, hVar.f2008k);
                    break;
                case 37:
                    hVar.f2018u = obtainStyledAttributes.getFloat(index, hVar.f2018u);
                    break;
                case 38:
                    gVar.f1958a = obtainStyledAttributes.getResourceId(index, gVar.f1958a);
                    break;
                case 39:
                    hVar.f1980P = obtainStyledAttributes.getFloat(index, hVar.f1980P);
                    break;
                case 40:
                    hVar.f1979O = obtainStyledAttributes.getFloat(index, hVar.f1979O);
                    break;
                case 41:
                    hVar.f1981Q = obtainStyledAttributes.getInt(index, hVar.f1981Q);
                    break;
                case 42:
                    hVar.f1982R = obtainStyledAttributes.getInt(index, hVar.f1982R);
                    break;
                case 43:
                    jVar.f2031c = obtainStyledAttributes.getFloat(index, jVar.f2031c);
                    break;
                case 44:
                    kVar.f2043k = true;
                    kVar.f2044l = obtainStyledAttributes.getDimension(index, kVar.f2044l);
                    break;
                case 45:
                    kVar.f2035b = obtainStyledAttributes.getFloat(index, kVar.f2035b);
                    break;
                case 46:
                    kVar.f2036c = obtainStyledAttributes.getFloat(index, kVar.f2036c);
                    break;
                case 47:
                    kVar.f2037d = obtainStyledAttributes.getFloat(index, kVar.f2037d);
                    break;
                case 48:
                    kVar.f2038e = obtainStyledAttributes.getFloat(index, kVar.f2038e);
                    break;
                case 49:
                    kVar.f2039f = obtainStyledAttributes.getDimension(index, kVar.f2039f);
                    break;
                case 50:
                    kVar.f2040g = obtainStyledAttributes.getDimension(index, kVar.f2040g);
                    break;
                case 51:
                    kVar.h = obtainStyledAttributes.getDimension(index, kVar.h);
                    break;
                case 52:
                    kVar.f2041i = obtainStyledAttributes.getDimension(index, kVar.f2041i);
                    break;
                case 53:
                    kVar.f2042j = obtainStyledAttributes.getDimension(index, kVar.f2042j);
                    break;
                case 54:
                    hVar.f1983S = obtainStyledAttributes.getInt(index, hVar.f1983S);
                    break;
                case 55:
                    hVar.f1984T = obtainStyledAttributes.getInt(index, hVar.f1984T);
                    break;
                case 56:
                    hVar.f1985U = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1985U);
                    break;
                case 57:
                    hVar.f1986V = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1986V);
                    break;
                case 58:
                    hVar.f1987W = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1987W);
                    break;
                case 59:
                    hVar.f1988X = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1988X);
                    break;
                case 60:
                    kVar.f2034a = obtainStyledAttributes.getFloat(index, kVar.f2034a);
                    break;
                case 61:
                    hVar.f2020w = f(obtainStyledAttributes, index, hVar.f2020w);
                    break;
                case 62:
                    hVar.f2021x = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f2021x);
                    break;
                case 63:
                    hVar.f2022y = obtainStyledAttributes.getFloat(index, hVar.f2022y);
                    break;
                case 64:
                    iVar.f2025a = f(obtainStyledAttributes, index, iVar.f2025a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        iVar.getClass();
                        break;
                    } else {
                        String str = K0.a.f1436a[obtainStyledAttributes.getInteger(index, 0)];
                        iVar.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    iVar.getClass();
                    break;
                case 67:
                    iVar.f2028d = obtainStyledAttributes.getFloat(index, iVar.f2028d);
                    break;
                case 68:
                    jVar.f2032d = obtainStyledAttributes.getFloat(index, jVar.f2032d);
                    break;
                case 69:
                    hVar.f1989Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    hVar.f1990Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    hVar.f1992a0 = obtainStyledAttributes.getInt(index, hVar.f1992a0);
                    break;
                case 73:
                    hVar.f1994b0 = obtainStyledAttributes.getDimensionPixelSize(index, hVar.f1994b0);
                    break;
                case 74:
                    hVar.f2000e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    hVar.i0 = obtainStyledAttributes.getBoolean(index, hVar.i0);
                    break;
                case 76:
                    iVar.f2026b = obtainStyledAttributes.getInt(index, iVar.f2026b);
                    break;
                case 77:
                    hVar.f2002f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    jVar.f2030b = obtainStyledAttributes.getInt(index, jVar.f2030b);
                    break;
                case 79:
                    iVar.f2027c = obtainStyledAttributes.getFloat(index, iVar.f2027c);
                    break;
                case 80:
                    hVar.f2004g0 = obtainStyledAttributes.getBoolean(index, hVar.f2004g0);
                    break;
                case 81:
                    hVar.f2005h0 = obtainStyledAttributes.getBoolean(index, hVar.f2005h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return gVar;
    }

    public static int f(TypedArray typedArray, int i3, int i4) {
        int resourceId = typedArray.getResourceId(i3, i4);
        return resourceId == -1 ? typedArray.getInt(i3, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i3;
        Iterator it;
        String str;
        l lVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = lVar.f2049c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (lVar.f2048b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        g gVar = (g) hashMap.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            gVar.f1961d.f1996c0 = 1;
                        }
                        int i5 = gVar.f1961d.f1996c0;
                        if (i5 != -1 && i5 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            h hVar = gVar.f1961d;
                            barrier.setType(hVar.f1992a0);
                            barrier.setMargin(hVar.f1994b0);
                            barrier.setAllowsGoneWidget(hVar.i0);
                            int[] iArr = hVar.f1998d0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str2 = hVar.f2000e0;
                                if (str2 != null) {
                                    int[] c3 = c(barrier, str2);
                                    hVar.f1998d0 = c3;
                                    barrier.setReferencedIds(c3);
                                }
                            }
                        }
                        d dVar = (d) childAt.getLayoutParams();
                        dVar.a();
                        gVar.a(dVar);
                        HashMap hashMap2 = gVar.f1963f;
                        Class<?> cls = childAt.getClass();
                        Iterator it2 = hashMap2.keySet().iterator();
                        while (it2.hasNext()) {
                            String str3 = (String) it2.next();
                            a aVar = (a) hashMap2.get(str3);
                            int i6 = childCount;
                            HashMap hashMap3 = hashMap2;
                            String str4 = "set" + str3;
                            try {
                                switch (AbstractC0537f.b(aVar.f1874a)) {
                                    case 0:
                                        it = it2;
                                        cls.getMethod(str4, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f1875b));
                                        break;
                                    case 1:
                                        it = it2;
                                        cls.getMethod(str4, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f1876c));
                                        break;
                                    case 2:
                                        it = it2;
                                        cls.getMethod(str4, Integer.TYPE).invoke(childAt, Integer.valueOf(aVar.f1879f));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str4, Drawable.class);
                                        it = it2;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(aVar.f1879f);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i6;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        } catch (NoSuchMethodException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str4);
                                            childCount = i6;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        } catch (InvocationTargetException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            childCount = i6;
                                            hashMap2 = hashMap3;
                                            it2 = it;
                                        }
                                    case 4:
                                        cls.getMethod(str4, CharSequence.class).invoke(childAt, aVar.f1877d);
                                        it = it2;
                                        break;
                                    case 5:
                                        cls.getMethod(str4, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar.f1878e));
                                        it = it2;
                                        break;
                                    case 6:
                                        cls.getMethod(str4, Float.TYPE).invoke(childAt, Float.valueOf(aVar.f1876c));
                                        it = it2;
                                        break;
                                    default:
                                        it = it2;
                                        break;
                                }
                            } catch (IllegalAccessException e6) {
                                e = e6;
                                it = it2;
                            } catch (NoSuchMethodException e7) {
                                e = e7;
                                it = it2;
                            } catch (InvocationTargetException e8) {
                                e = e8;
                                it = it2;
                            }
                            childCount = i6;
                            hashMap2 = hashMap3;
                            it2 = it;
                        }
                        i3 = childCount;
                        childAt.setLayoutParams(dVar);
                        j jVar = gVar.f1959b;
                        if (jVar.f2030b == 0) {
                            childAt.setVisibility(jVar.f2029a);
                        }
                        childAt.setAlpha(jVar.f2031c);
                        k kVar = gVar.f1962e;
                        childAt.setRotation(kVar.f2034a);
                        childAt.setRotationX(kVar.f2035b);
                        childAt.setRotationY(kVar.f2036c);
                        childAt.setScaleX(kVar.f2037d);
                        childAt.setScaleY(kVar.f2038e);
                        if (!Float.isNaN(kVar.f2039f)) {
                            childAt.setPivotX(kVar.f2039f);
                        }
                        if (!Float.isNaN(kVar.f2040g)) {
                            childAt.setPivotY(kVar.f2040g);
                        }
                        childAt.setTranslationX(kVar.h);
                        childAt.setTranslationY(kVar.f2041i);
                        childAt.setTranslationZ(kVar.f2042j);
                        if (kVar.f2043k) {
                            childAt.setElevation(kVar.f2044l);
                        }
                    } else {
                        i3 = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i4++;
                    lVar = this;
                    childCount = i3;
                }
            }
            i3 = childCount;
            i4++;
            lVar = this;
            childCount = i3;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Integer num = (Integer) it3.next();
            g gVar2 = (g) hashMap.get(num);
            h hVar2 = gVar2.f1961d;
            int i7 = hVar2.f1996c0;
            if (i7 != -1 && i7 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = hVar2.f1998d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str5 = hVar2.f2000e0;
                    if (str5 != null) {
                        int[] c4 = c(barrier2, str5);
                        hVar2.f1998d0 = c4;
                        barrier2.setReferencedIds(c4);
                    }
                }
                barrier2.setType(hVar2.f1992a0);
                barrier2.setMargin(hVar2.f1994b0);
                d a3 = ConstraintLayout.a();
                barrier2.g();
                gVar2.a(a3);
                constraintLayout.addView(barrier2, a3);
            }
            if (hVar2.f1991a) {
                View nVar = new n(constraintLayout.getContext());
                nVar.setId(num.intValue());
                d a4 = ConstraintLayout.a();
                gVar2.a(a4);
                constraintLayout.addView(nVar, a4);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        l lVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = lVar.f2049c;
        hashMap.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            d dVar = (d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (lVar.f2048b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new g());
            }
            g gVar = (g) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = lVar.f2047a;
            HashMap hashMap3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                a aVar = (a) hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        hashMap3.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                } catch (NoSuchMethodException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
            gVar.f1963f = hashMap3;
            gVar.f1958a = id;
            int i4 = dVar.f1918d;
            h hVar = gVar.f1961d;
            hVar.f2003g = i4;
            hVar.h = dVar.f1920e;
            hVar.f2006i = dVar.f1922f;
            hVar.f2007j = dVar.f1924g;
            hVar.f2008k = dVar.h;
            hVar.f2009l = dVar.f1927i;
            hVar.f2010m = dVar.f1928j;
            hVar.f2011n = dVar.f1930k;
            hVar.f2012o = dVar.f1931l;
            hVar.f2013p = dVar.f1935p;
            hVar.f2014q = dVar.f1936q;
            hVar.f2015r = dVar.f1937r;
            hVar.f2016s = dVar.f1938s;
            hVar.f2017t = dVar.f1945z;
            hVar.f2018u = dVar.f1886A;
            hVar.f2019v = dVar.f1887B;
            hVar.f2020w = dVar.f1932m;
            hVar.f2021x = dVar.f1933n;
            hVar.f2022y = dVar.f1934o;
            hVar.f2023z = dVar.f1901P;
            hVar.f1965A = dVar.f1902Q;
            hVar.f1966B = dVar.f1903R;
            hVar.f2001f = dVar.f1916c;
            hVar.f1997d = dVar.f1912a;
            hVar.f1999e = dVar.f1914b;
            hVar.f1993b = ((ViewGroup.MarginLayoutParams) dVar).width;
            hVar.f1995c = ((ViewGroup.MarginLayoutParams) dVar).height;
            hVar.f1967C = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            hVar.f1968D = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
            hVar.f1969E = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
            hVar.f1970F = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            hVar.f1979O = dVar.f1890E;
            hVar.f1980P = dVar.f1889D;
            hVar.f1982R = dVar.f1892G;
            hVar.f1981Q = dVar.f1891F;
            hVar.f2004g0 = dVar.f1904S;
            hVar.f2005h0 = dVar.f1905T;
            hVar.f1983S = dVar.f1893H;
            hVar.f1984T = dVar.f1894I;
            hVar.f1985U = dVar.f1897L;
            hVar.f1986V = dVar.f1898M;
            hVar.f1987W = dVar.f1895J;
            hVar.f1988X = dVar.f1896K;
            hVar.f1989Y = dVar.f1899N;
            hVar.f1990Z = dVar.f1900O;
            hVar.f2002f0 = dVar.f1906U;
            hVar.f1974J = dVar.f1940u;
            hVar.f1976L = dVar.f1942w;
            hVar.f1973I = dVar.f1939t;
            hVar.f1975K = dVar.f1941v;
            hVar.f1978N = dVar.f1943x;
            hVar.f1977M = dVar.f1944y;
            hVar.f1971G = dVar.getMarginEnd();
            hVar.f1972H = dVar.getMarginStart();
            int visibility = childAt.getVisibility();
            j jVar = gVar.f1959b;
            jVar.f2029a = visibility;
            jVar.f2031c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            k kVar = gVar.f1962e;
            kVar.f2034a = rotation;
            kVar.f2035b = childAt.getRotationX();
            kVar.f2036c = childAt.getRotationY();
            kVar.f2037d = childAt.getScaleX();
            kVar.f2038e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                kVar.f2039f = pivotX;
                kVar.f2040g = pivotY;
            }
            kVar.h = childAt.getTranslationX();
            kVar.f2041i = childAt.getTranslationY();
            kVar.f2042j = childAt.getTranslationZ();
            if (kVar.f2043k) {
                kVar.f2044l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                hVar.i0 = barrier.f3350l.f1525g0;
                hVar.f1998d0 = barrier.getReferencedIds();
                hVar.f1992a0 = barrier.getType();
                hVar.f1994b0 = barrier.getMargin();
            }
            i3++;
            lVar = this;
        }
    }

    public final void e(Context context, int i3) {
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    g d3 = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        d3.f1961d.f1991a = true;
                    }
                    this.f2049c.put(Integer.valueOf(d3.f1958a), d3);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
