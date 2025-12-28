package a;

import D.C0032d;
import D2.AbstractC0071a;
import E.A;
import G0.h;
import G0.i;
import J0.g;
import V.c;
import V.d;
import V.f;
import X1.u;
import Z.b;
import a1.C0100h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import c2.C0174m;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import n0.AbstractC0409C;
import n0.C0435p;
import o2.e;
import y2.AbstractC0668a;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0090a {

    /* renamed from: a, reason: collision with root package name */
    public static long f2915a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2916b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Field f2917c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2918d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2919e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2920f = 66305;

    public AbstractC0090a() {
        new ConcurrentHashMap();
    }

    public static String A(List list, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final String C(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final long D(long j3) {
        if (j3 != 9205357640488583168L) {
            return r2.a.f(Float.intBitsToFloat((int) (j3 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static ColorStateList E(Context context, B0.a aVar, int i3) {
        int resourceId;
        ColorStateList y3;
        TypedArray typedArray = (TypedArray) aVar.f272c;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (y3 = r2.a.y(context, resourceId)) == null) ? aVar.k(i3) : y3;
    }

    public static ColorStateList F(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        ColorStateList y3;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (y3 = r2.a.y(context, resourceId)) == null) ? typedArray.getColorStateList(i3) : y3;
    }

    public static Drawable H(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        Drawable r3;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (r3 = b.r(context, resourceId)) == null) ? typedArray.getDrawable(i3) : r3;
    }

    public static final int I(long j3) {
        return (int) (j3 & 4294967295L);
    }

    public static float J(String[] strArr, int i3) {
        float parseFloat = Float.parseFloat(strArr[i3]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final long K(double d3) {
        return W(4294967296L, (float) d3);
    }

    public static final long L(int i3) {
        return W(4294967296L, i3);
    }

    public static final int N(long j3) {
        return (int) (j3 >> 32);
    }

    public static final int O(int i3, int i4) {
        return (i3 >> i4) & 31;
    }

    public static boolean P() {
        boolean isEnabled;
        try {
            if (f2916b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2916b == null) {
                f2915a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2916b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2916b.invoke(null, Long.valueOf(f2915a))).booleanValue();
        } catch (Exception e3) {
            if (!(e3 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e3);
                return false;
            }
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean Q(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean R(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final boolean S(long j3) {
        i[] iVarArr = h.f1262b;
        return (j3 & 1095216660480L) == 0;
    }

    public static Typeface T(Configuration configuration, Typeface typeface) {
        int i3;
        int i4;
        int weight;
        int i5;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == Integer.MAX_VALUE) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i5 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, m(i5 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static final long U(long j3, long j4) {
        return ((((int) (j3 >> 32)) - ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) - ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static final long V(int i3, int i4, long j3) {
        int j4 = G0.a.j(j3) + i3;
        if (j4 < 0) {
            j4 = 0;
        }
        int h = G0.a.h(j3);
        if (h != Integer.MAX_VALUE && (h = h + i3) < 0) {
            h = 0;
        }
        int i5 = G0.a.i(j3) + i4;
        if (i5 < 0) {
            i5 = 0;
        }
        int g3 = G0.a.g(j3);
        if (g3 != Integer.MAX_VALUE) {
            int i6 = g3 + i4;
            g3 = i6 >= 0 ? i6 : 0;
        }
        return a(j4, h, i5, g3);
    }

    public static final long W(long j3, float f3) {
        long floatToIntBits = j3 | (Float.floatToIntBits(f3) & 4294967295L);
        i[] iVarArr = h.f1262b;
        return floatToIntBits;
    }

    public static final long X(long j3, long j4) {
        return ((((int) (j3 >> 32)) + ((int) (j4 >> 32))) << 32) | ((((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L))) & 4294967295L);
    }

    public static final long a(int i3, int i4, int i5, int i6) {
        boolean z3 = false;
        if (!(i4 >= i3)) {
            r2.a.b0("maxWidth(" + i4 + ") must be >= than minWidth(" + i3 + ')');
            throw null;
        }
        if (!(i6 >= i5)) {
            r2.a.b0("maxHeight(" + i6 + ") must be >= than minHeight(" + i5 + ')');
            throw null;
        }
        if (i3 >= 0 && i5 >= 0) {
            z3 = true;
        }
        if (z3) {
            return q(i3, i4, i5, i6);
        }
        r2.a.b0("minWidth(" + i3 + ") and minHeight(" + i5 + ") must be >= 0");
        throw null;
    }

    public static int a0(Context context, int i3, int i4) {
        TypedValue S2 = r2.a.S(context, i3);
        return (S2 == null || S2.type != 16) ? i4 : S2.data;
    }

    public static /* synthetic */ long b(int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(0, i3, 0, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c A[Catch: NumberFormatException -> 0x0140, LOOP:3: B:47:0x00fc->B:57:0x012c, LOOP_END, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:44:0x00e7, B:47:0x00fc, B:49:0x0102, B:53:0x010e, B:57:0x012c, B:61:0x0132, B:66:0x0147, B:79:0x014c, B:81:0x014f, B:86:0x015b, B:87:0x0160, B:89:0x0161, B:90:0x0166), top: B:43:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132 A[Catch: NumberFormatException -> 0x0140, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:44:0x00e7, B:47:0x00fc, B:49:0x0102, B:53:0x010e, B:57:0x012c, B:61:0x0132, B:66:0x0147, B:79:0x014c, B:81:0x014f, B:86:0x015b, B:87:0x0160, B:89:0x0161, B:90:0x0166), top: B:43:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147 A[Catch: NumberFormatException -> 0x0140, TryCatch #1 {NumberFormatException -> 0x0140, blocks: (B:44:0x00e7, B:47:0x00fc, B:49:0x0102, B:53:0x010e, B:57:0x012c, B:61:0x0132, B:66:0x0147, B:79:0x014c, B:81:0x014f, B:86:0x015b, B:87:0x0160, B:89:0x0161, B:90:0x0166), top: B:43:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.TimeInterpolator b0(android.content.Context r18, int r19, android.view.animation.Interpolator r20) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0090a.b0(android.content.Context, int, android.view.animation.Interpolator):android.animation.TimeInterpolator");
    }

    public static final d c(long j3, long j4) {
        return new d(c.b(j3), c.c(j3), f.d(j4) + c.b(j3), f.b(j4) + c.c(j3));
    }

    public static final void c0(A a3, int i3, int i4) {
        int i5 = 1 << i3;
        int i6 = a3.h;
        if ((i6 & i5) == 0) {
            a3.h = i5 | i6;
            a3.f1097d[(a3.f1098e - a3.k0().f1141a) + i3] = i4;
        } else {
            C0032d.I("Already pushed argument " + a3.k0().b(i3));
            throw null;
        }
    }

    public static final long d(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void d0(A a3, int i3, Object obj) {
        int i4 = 1 << i3;
        int i5 = a3.f1101i;
        if ((i5 & i4) == 0) {
            a3.f1101i = i4 | i5;
            a3.f1099f[(a3.f1100g - a3.k0().f1142b) + i3] = obj;
        } else {
            C0032d.I("Already pushed argument " + a3.k0().c(i3));
            throw null;
        }
    }

    public static final void e(int i3, List list) {
        int size = list.size();
        if (i3 < 0 || i3 >= size) {
            throw new IndexOutOfBoundsException("Index " + i3 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void f(List list, int i3, int i4) {
        int size = list.size();
        if (i3 > i4) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i3 + ") is less than 0.");
        }
        if (i4 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is more than than the list size (" + size + ')');
    }

    public static final boolean g(S.d dVar, long j3) {
        if (!dVar.f2088d.f2099p) {
            return false;
        }
        C0435p c0435p = (C0435p) AbstractC0409C.q(dVar).f5319x.f854c;
        if (!c0435p.f5275K.f2099p) {
            return false;
        }
        long j4 = c0435p.f4929f;
        long z02 = c0435p.z0(0L);
        float b3 = c.b(z02);
        float c3 = c.c(z02);
        float f3 = ((int) (j4 >> 32)) + b3;
        float f4 = ((int) (j4 & 4294967295L)) + c3;
        float b4 = c.b(j3);
        if (b3 > b4 || b4 > f3) {
            return false;
        }
        float c4 = c.c(j3);
        return c3 <= c4 && c4 <= f4;
    }

    public static void g0(e eVar, AbstractC0668a abstractC0668a, AbstractC0668a abstractC0668a2) {
        try {
            AbstractC0071a.h(b.z(b.n(abstractC0668a, abstractC0668a2, eVar)), C0174m.f3840a, null);
        } catch (Throwable th) {
            abstractC0668a2.t(Z0.d.q(th));
            throw th;
        }
    }

    public static final int h(int i3) {
        if (i3 < 8191) {
            return 262142;
        }
        if (i3 < 32767) {
            return 65534;
        }
        if (i3 < 65535) {
            return 32766;
        }
        if (i3 < 262143) {
            return 8190;
        }
        throw new IllegalArgumentException("Can't represent a size of " + i3 + " in Constraints");
    }

    public static String h0(int i3) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i4 = i3 & 255;
        String str = "Invalid";
        sb.append((Object) (y(i4, 1) ? "Strategy.Simple" : y(i4, 2) ? "Strategy.HighQuality" : y(i4, 3) ? "Strategy.Balanced" : y(i4, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i5 = (i3 >> 8) & 255;
        sb.append((Object) (r2.a.v(i5, 1) ? "Strictness.None" : r2.a.v(i5, 2) ? "Strictness.Loose" : r2.a.v(i5, 3) ? "Strictness.Normal" : r2.a.v(i5, 4) ? "Strictness.Strict" : r2.a.v(i5, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i6 = (i3 >> 16) & 255;
        if (i6 == 1) {
            str = "WordBreak.None";
        } else if (i6 == 2) {
            str = "WordBreak.Phrase";
        } else if (i6 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public static final int i(int i3) {
        if (i3 < 8191) {
            return 13;
        }
        if (i3 < 32767) {
            return 15;
        }
        if (i3 < 65535) {
            return 16;
        }
        return i3 < 262143 ? 18 : 255;
    }

    public static String i0(long j3) {
        return ((int) (j3 >> 32)) + " x " + ((int) (j3 & 4294967295L));
    }

    public static final String j0(float f3) {
        if (Float.isNaN(f3)) {
            return "NaN";
        }
        if (Float.isInfinite(f3)) {
            return f3 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f4 = f3 * pow;
        int i3 = (int) f4;
        if (f4 - i3 >= 0.5f) {
            i3++;
        }
        float f5 = i3 / pow;
        return max > 0 ? String.valueOf(f5) : String.valueOf((int) f5);
    }

    public static int m(int i3, int i4, int i5) {
        return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
    }

    public static final long n(long j3, long j4) {
        return r2.a.d(b.k((int) (j4 >> 32), G0.a.j(j3), G0.a.h(j3)), b.k((int) (j4 & 4294967295L), G0.a.i(j3), G0.a.g(j3)));
    }

    public static final int o(long j3, int i3) {
        return b.k(i3, G0.a.i(j3), G0.a.g(j3));
    }

    public static final int p(long j3, int i3) {
        return b.k(i3, G0.a.j(j3), G0.a.h(j3));
    }

    public static final long q(int i3, int i4, int i5, int i6) {
        int i7 = i6 == Integer.MAX_VALUE ? i5 : i6;
        int i8 = i(i7);
        int i9 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i10 = i(i9);
        if (i8 + i10 > 31) {
            throw new IllegalArgumentException("Can't represent a width of " + i9 + " and height of " + i7 + " in Constraints");
        }
        int i11 = i4 + 1;
        int i12 = i11 & (~(i11 >> 31));
        int i13 = i6 + 1;
        int i14 = i13 & (~(i13 >> 31));
        int i15 = 0;
        if (i10 != 13) {
            if (i10 == 18) {
                i15 = 3;
            } else if (i10 == 15) {
                i15 = 1;
            } else if (i10 == 16) {
                i15 = 2;
            }
        }
        int i16 = (((i15 & 2) >> 1) * 3) + ((i15 & 1) << 1);
        return (i12 << 33) | i15 | (i3 << 2) | (i5 << (i16 + 15)) | (i14 << (i16 + 46));
    }

    public static final boolean u(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean v(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean w(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean x(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean y(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean z(int i3, int i4) {
        return i3 == i4;
    }

    public C0100h B(int i3, C0100h[] c0100hArr) {
        new X1.e(8);
        int i4 = (i3 & 1) == 0 ? 400 : 700;
        boolean z3 = (i3 & 2) != 0;
        C0100h c0100h = null;
        int i5 = Integer.MAX_VALUE;
        for (C0100h c0100h2 : c0100hArr) {
            int abs = (Math.abs(c0100h2.f2946c - i4) * 2) + (c0100h2.f2947d == z3 ? 0 : 1);
            if (c0100h == null || i5 > abs) {
                c0100h = c0100h2;
                i5 = abs;
            }
        }
        return c0100h;
    }

    public abstract void G(u uVar, float f3, float f4);

    public float M(View view) {
        float transitionAlpha;
        if (f2919e) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f2919e = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void Y(J0.f fVar, J0.f fVar2);

    public abstract void Z(J0.f fVar, Thread thread);

    public void e0(View view, float f3) {
        if (f2919e) {
            try {
                view.setTransitionAlpha(f3);
                return;
            } catch (NoSuchMethodError unused) {
                f2919e = false;
            }
        }
        view.setAlpha(f3);
    }

    public void f0(View view, int i3) {
        if (!f2918d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2917c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f2918d = true;
        }
        Field field = f2917c;
        if (field != null) {
            try {
                f2917c.setInt(view, i3 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean j(g gVar, J0.c cVar);

    public abstract boolean k(g gVar, Object obj, Object obj2);

    public abstract boolean l(g gVar, J0.f fVar, J0.f fVar2);

    public abstract Typeface r(Context context, U0.f fVar, Resources resources, int i3);

    public abstract Typeface s(Context context, C0100h[] c0100hArr, int i3);

    public Typeface t(Context context, Resources resources, int i3, String str, int i4) {
        File G3 = r2.a.G(context);
        if (G3 == null) {
            return null;
        }
        try {
            if (r2.a.p(G3, resources, i3)) {
                return Typeface.createFromFile(G3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            G3.delete();
        }
    }
}
