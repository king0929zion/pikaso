package r2;

import A.AbstractC0000a;
import A.C;
import A.C0012m;
import D.C0032d;
import D.C0048l;
import D.C0052n;
import D.C0053n0;
import D.InterfaceC0045j0;
import D.Z;
import D2.t;
import G0.b;
import G0.d;
import G0.h;
import G0.i;
import P.l;
import P.m;
import V.e;
import W.D;
import W.r;
import X1.f;
import X1.g;
import a.AbstractC0090a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c2.C0174m;
import d1.AbstractC0189K;
import d1.AbstractC0229z;
import d2.AbstractC0239j;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import l0.InterfaceC0361k;
import n0.C0424e;
import n0.C0429j;
import n0.InterfaceC0425f;
import o0.S;
import p2.o;
import v.AbstractC0611e;
import v.C0610d;
import y2.AbstractC0688v;
import y2.C0680m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6113a = true;

    public static File G(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i3 = 0; i3 < 100; i3++) {
            File file = new File(cacheDir, str + i3);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final int H(int i3, int i4) {
        return (i3 >> i4) & 31;
    }

    public static final boolean K(e eVar) {
        float b3 = V.a.b(eVar.f2454e);
        long j3 = eVar.f2454e;
        if (b3 == V.a.c(j3)) {
            float b4 = V.a.b(j3);
            long j4 = eVar.f2455f;
            if (b4 == V.a.b(j4) && V.a.b(j3) == V.a.c(j4)) {
                float b5 = V.a.b(j3);
                long j5 = eVar.f2456g;
                if (b5 == V.a.b(j5) && V.a.b(j3) == V.a.c(j5)) {
                    float b6 = V.a.b(j3);
                    long j6 = eVar.h;
                    if (b6 == V.a.b(j6) && V.a.b(j3) == V.a.c(j6)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean M(long j3) {
        return (j3 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static int N(float f3, int i3, int i4) {
        return V0.a.b(V0.a.d(i4, Math.round(Color.alpha(i4) * f3)), i3);
    }

    public static MappedByteBuffer O(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final long P(long j3, float f3) {
        return (Float.isNaN(f3) || f3 >= 1.0f) ? j3 : r.b(j3, r.d(j3) * f3);
    }

    public static TypedValue S(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue T(Context context, int i3, String str) {
        TypedValue S2 = S(context, i3);
        if (S2 != null) {
            return S2;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i3)));
    }

    public static int U(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    public static final void V(Spannable spannable, long j3, int i3, int i4) {
        if (j3 != 16) {
            spannable.setSpan(new ForegroundColorSpan(D.C(j3)), i3, i4, 33);
        }
    }

    public static final void W(Spannable spannable, long j3, b bVar, int i3, int i4) {
        long b3 = h.b(j3);
        if (i.a(b3, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(U(bVar.v(j3)), false), i3, i4, 33);
        } else if (i.a(b3, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(h.c(j3)), i3, i4, 33);
        }
    }

    public static void X(View view, g gVar) {
        R1.a aVar = gVar.f2685d.f2670b;
        if (aVar == null || !aVar.f2228a) {
            return;
        }
        float f3 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            Field field = AbstractC0189K.f4150a;
            f3 += AbstractC0229z.i((View) parent);
        }
        f fVar = gVar.f2685d;
        if (fVar.f2679l != f3) {
            fVar.f2679l = f3;
            gVar.m();
        }
    }

    public static final Object Z(t tVar, t tVar2, o2.e eVar) {
        Object c0680m;
        Object R2;
        try {
            p2.r.c(2, eVar);
            c0680m = eVar.h(tVar2, tVar);
        } catch (Throwable th) {
            c0680m = new C0680m(th, false);
        }
        h2.a aVar = h2.a.f4407d;
        if (c0680m == aVar || (R2 = tVar.R(c0680m)) == AbstractC0688v.f6823e) {
            return aVar;
        }
        if (R2 instanceof C0680m) {
            throw ((C0680m) R2).f6805a;
        }
        return AbstractC0688v.q(R2);
    }

    public static final long a(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i3 = V.a.f2439b;
        return floatToRawIntBits;
    }

    public static void a0(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z3);
        } else if (f6113a) {
            try {
                viewGroup.suppressLayout(z3);
            } catch (NoSuchMethodError unused) {
                f6113a = false;
            }
        }
    }

    public static final d b(Context context) {
        float f3 = context.getResources().getConfiguration().fontScale;
        float f4 = context.getResources().getDisplayMetrics().density;
        H0.a a3 = H0.b.a(f3);
        if (a3 == null) {
            a3 = new G0.g(f3);
        }
        return new d(f4, f3, a3);
    }

    public static final void b0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final long c(int i3, int i4) {
        return (i4 & 4294967295L) | (i3 << 32);
    }

    public static final long c0(long j3) {
        return AbstractC0090a.d((int) (j3 >> 32), (int) (j3 & 4294967295L));
    }

    public static final long d(int i3, int i4) {
        return (i4 & 4294967295L) | (i3 << 32);
    }

    public static String d0(int i3) {
        return u(i3, 1) ? "Hyphens.None" : u(i3, 2) ? "Hyphens.Auto" : u(i3, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public static final void e(int i3, C0052n c0052n) {
        L.a aVar;
        c0052n.O(1286578438);
        if (i3 == 0 && c0052n.y()) {
            c0052n.K();
        } else {
            c0052n.L(1659546282, null, 0, null);
            Object H2 = c0052n.H();
            Object obj = C0048l.f781a;
            if (H2 == obj) {
                H2 = C0032d.A(Boolean.FALSE);
                c0052n.V(H2);
            }
            Z z3 = (Z) H2;
            c0052n.q(false);
            o oVar = new o();
            oVar.f5960d = c0052n.k(S.f5494b);
            C0174m c0174m = C0174m.f3840a;
            c0052n.L(1659546398, null, 0, null);
            Object H3 = c0052n.H();
            if (H3 == obj) {
                H3 = new G1.f(z3, null);
                c0052n.V(H3);
            }
            c0052n.q(false);
            C0032d.d(c0052n, c0174m, (o2.e) H3);
            l a3 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.b.f3291b, D.c(4293981432L), D.f2484a);
            InterfaceC0361k d3 = t.e.d(false);
            int i4 = c0052n.f805M;
            InterfaceC0045j0 m2 = c0052n.m();
            l b3 = m.b(c0052n, a3);
            InterfaceC0425f.f5247c.getClass();
            C0429j c0429j = C0424e.f5242b;
            c0052n.P();
            if (c0052n.f804L) {
                c0052n.l(c0429j);
            } else {
                c0052n.Y();
            }
            C0032d.G(c0052n, d3, C0424e.f5245e);
            C0032d.G(c0052n, m2, C0424e.f5244d);
            o2.e eVar = C0424e.f5246f;
            if (c0052n.f804L || !p2.g.a(c0052n.H(), Integer.valueOf(i4))) {
                c0052n.V(Integer.valueOf(i4));
                c0052n.b(Integer.valueOf(i4), eVar);
            }
            C0032d.G(c0052n, b3, C0424e.f5243c);
            l a4 = androidx.compose.foundation.layout.a.f3289a.a(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.f3290a, 24));
            C0610d a5 = AbstractC0611e.a(16);
            float f3 = 8;
            if ((62 & 1) != 0) {
                f3 = C.d.f419a;
            }
            C0012m c0012m = new C0012m(f3, C.d.h, C.d.f424f, C.d.f425g, C.d.f423e, C.d.f421c);
            D0.b bVar = new D0.b(z3, 1, oVar);
            c0052n.L(Integer.rotateLeft(-1737949698, 1), L.b.f1444a, 0, null);
            Object H4 = c0052n.H();
            if (H4 == obj) {
                aVar = new L.a(-1737949698, true, bVar);
                c0052n.V(aVar);
            } else {
                p2.g.c(H4, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
                aVar = (L.a) H4;
                aVar.f(bVar);
            }
            L.a aVar2 = aVar;
            c0052n.q(false);
            C.b(a4, a5, null, c0012m, aVar2, c0052n, 196608);
            c0052n.q(true);
        }
        C0053n0 s3 = c0052n.s();
        if (s3 != null) {
            s3.f834d = new G1.g(i3);
        }
    }

    public static final long f(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final Object[] g(Object[] objArr, int i3, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC0239j.a0(objArr, objArr2, 0, i3, 6);
        AbstractC0239j.Y(objArr, objArr2, i3 + 2, i3, objArr.length);
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC0239j.a0(objArr, objArr2, 0, i3, 6);
        AbstractC0239j.Y(objArr, objArr2, i3, i3 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i3) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0239j.a0(objArr, objArr2, 0, i3, 6);
        AbstractC0239j.Y(objArr, objArr2, i3, i3 + 1, objArr.length);
        return objArr2;
    }

    public static final void l(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
        }
    }

    public static final void m(int i3, int i4) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(AbstractC0000a.d("index: ", i3, ", size: ", i4));
        }
    }

    public static final void n(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(AbstractC0000a.d("fromIndex: ", i3, " > toIndex: ", i4));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean p(File file, Resources resources, int i3) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i3);
            try {
                boolean q3 = q(file, inputStream);
                o(inputStream);
                return q3;
            } catch (Throwable th) {
                th = th;
                o(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean q(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    o(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            o(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            o(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static AbstractC0090a r(int i3) {
        if (i3 != 0 && i3 == 1) {
            return new X1.d();
        }
        return new X1.i();
    }

    public static final boolean s(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean t(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean u(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean v(int i3, int i4) {
        return i3 == i4;
    }

    public static final float w(float f3) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f3) & 8589934591L) / 3)) + 709952852);
        float f4 = intBitsToFloat - ((intBitsToFloat - (f3 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f4 - ((f4 - (f3 / (f4 * f4))) * 0.33333334f);
    }

    public static int x(View view, int i3) {
        Context context = view.getContext();
        TypedValue T2 = T(view.getContext(), i3, view.getClass().getCanonicalName());
        int i4 = T2.resourceId;
        return i4 != 0 ? T0.b.a(context, i4) : T2.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f2397c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList y(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            U0.m r1 = new U0.m
            r1.<init>(r0, r8)
            java.lang.Object r2 = U0.o.f2405c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = U0.o.f2404b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            U0.l r5 = (U0.l) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f2396b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f2397c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb9
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f2397c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f2395a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            goto Lb8
        L55:
            java.lang.ThreadLocal r2 = U0.o.f2403a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = U0.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb4
            java.lang.Object r2 = U0.o.f2405c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = U0.o.f2404b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb2
        La1:
            U0.l r0 = new U0.l     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f2398a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            r3 = r4
            goto Lb8
        Lb2:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb4:
            android.content.res.ColorStateList r3 = U0.k.b(r0, r9, r8)
        Lb8:
            return r3
        Lb9:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.a.y(android.content.Context, int):android.content.res.ColorStateList");
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract int D(View view);

    public abstract int E(CoordinatorLayout coordinatorLayout);

    public abstract int F();

    public abstract boolean I(float f3);

    public abstract boolean J(View view);

    public abstract boolean L(float f3, float f4);

    public abstract void Q(int i3);

    public abstract void R(Typeface typeface, boolean z3);

    public abstract boolean Y(View view, float f3);

    public abstract void e0(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4);

    public abstract int j(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float k(int i3);

    public abstract int z();
}
