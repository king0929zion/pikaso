package V0;

import a.AbstractC0090a;
import a1.C0100h;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends AbstractC0090a {

    /* renamed from: n, reason: collision with root package name */
    public static Class f2469n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Constructor f2470o = null;

    /* renamed from: p, reason: collision with root package name */
    public static Method f2471p = null;

    /* renamed from: q, reason: collision with root package name */
    public static Method f2472q = null;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f2473r = false;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2474g;
    public final Constructor h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f2475i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f2476j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f2477k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f2478l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f2479m;

    public h() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = s0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = t0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2474g = cls;
        this.h = constructor;
        this.f2475i = method2;
        this.f2476j = method3;
        this.f2477k = method4;
        this.f2478l = method5;
        this.f2479m = method;
    }

    public static boolean m0(Object obj, String str, int i3, boolean z3) {
        p0();
        try {
            return ((Boolean) f2471p.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void p0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2473r) {
            return;
        }
        f2473r = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f2470o = constructor;
        f2469n = cls;
        f2471p = method2;
        f2472q = method;
    }

    public static Method s0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void k0(Object obj) {
        try {
            this.f2478l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean l0(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2475i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface n0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f2474g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2479m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean o0(Object obj) {
        try {
            return ((Boolean) this.f2477k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean q0() {
        Method method = this.f2475i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // a.AbstractC0090a
    public final Typeface r(Context context, U0.f fVar, Resources resources, int i3) {
        if (q0()) {
            Object r02 = r0();
            if (r02 == null) {
                return null;
            }
            for (U0.g gVar : fVar.f2382a) {
                if (!l0(context, r02, gVar.f2383a, gVar.f2387e, gVar.f2384b, gVar.f2385c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f2386d))) {
                    k0(r02);
                    return null;
                }
            }
            if (o0(r02)) {
                return n0(r02);
            }
            return null;
        }
        p0();
        try {
            Object newInstance = f2470o.newInstance(null);
            for (U0.g gVar2 : fVar.f2382a) {
                File G3 = r2.a.G(context);
                if (G3 == null) {
                    return null;
                }
                try {
                    if (r2.a.p(G3, resources, gVar2.f2388f) && m0(newInstance, G3.getPath(), gVar2.f2384b, gVar2.f2385c)) {
                        G3.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    G3.delete();
                    throw th;
                }
                G3.delete();
                return null;
            }
            p0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f2469n, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2472q.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final Object r0() {
        try {
            return this.h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.AbstractC0090a
    public final Typeface s(Context context, C0100h[] c0100hArr, int i3) {
        Typeface n02;
        boolean z3;
        if (c0100hArr.length < 1) {
            return null;
        }
        if (!q0()) {
            C0100h B3 = B(i3, c0100hArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(B3.f2944a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(B3.f2946c).setItalic(B3.f2947d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C0100h c0100h : c0100hArr) {
            if (c0100h.f2948e == 0) {
                Uri uri = c0100h.f2944a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, r2.a.O(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object r02 = r0();
        if (r02 == null) {
            return null;
        }
        int length = c0100hArr.length;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < length) {
            C0100h c0100h2 = c0100hArr[i4];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0100h2.f2944a);
            if (byteBuffer != null) {
                try {
                    z3 = ((Boolean) this.f2476j.invoke(r02, byteBuffer, Integer.valueOf(c0100h2.f2945b), null, Integer.valueOf(c0100h2.f2946c), Integer.valueOf(c0100h2.f2947d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z3 = false;
                }
                if (!z3) {
                    k0(r02);
                    return null;
                }
                z4 = true;
            }
            i4++;
            z4 = z4;
        }
        if (!z4) {
            k0(r02);
            return null;
        }
        if (o0(r02) && (n02 = n0(r02)) != null) {
            return Typeface.create(n02, i3);
        }
        return null;
    }

    @Override // a.AbstractC0090a
    public final Typeface t(Context context, Resources resources, int i3, String str, int i4) {
        if (!q0()) {
            return super.t(context, resources, i3, str, i4);
        }
        Object r02 = r0();
        if (r02 == null) {
            return null;
        }
        if (!l0(context, r02, str, 0, -1, -1, null)) {
            k0(r02);
            return null;
        }
        if (o0(r02)) {
            return n0(r02);
        }
        return null;
    }

    public Method t0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
