package o0;

import W.C0086i;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import c2.InterfaceC0164c;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0.InterfaceC0357g;
import n.AbstractC0390j;
import n.C0398r;
import n0.AbstractC0409C;
import n0.C0444z;
import p.AbstractC0537f;
import t0.C0599a;

/* renamed from: o0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0461K implements E0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f5445a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: b, reason: collision with root package name */
    public static final V.d f5446b = new V.d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean a(t0.k kVar) {
        t0.g i3 = kVar.i();
        return !i3.f6230d.containsKey(t0.n.f6265i);
    }

    public static final boolean b(Object obj) {
        if (obj instanceof N.p) {
            N.p pVar = (N.p) obj;
            if (pVar.d() != D.U.f729f && pVar.d() != D.U.f731i && pVar.d() != D.U.f730g) {
                return false;
            }
            Object value = pVar.getValue();
            if (value == null) {
                return true;
            }
            return b(value);
        }
        if ((obj instanceof InterfaceC0164c) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f5445a;
        for (int i3 = 0; i3 < 7; i3++) {
            if (clsArr[i3].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    public static final float c(float[] fArr, int i3, float[] fArr2, int i4) {
        int i5 = i3 * 4;
        return (fArr[i5 + 3] * fArr2[12 + i4]) + (fArr[i5 + 2] * fArr2[8 + i4]) + (fArr[i5 + 1] * fArr2[4 + i4]) + (fArr[i5] * fArr2[i4]);
    }

    public static final C0398r d(t0.l lVar) {
        t0.k a3 = lVar.a();
        C0398r c0398r = AbstractC0390j.f4992a;
        C0398r c0398r2 = new C0398r();
        C0444z c0444z = a3.f6238c;
        if (c0444z.v() && c0444z.u()) {
            V.d e3 = a3.e();
            e(new Region(Math.round(e3.f2446a), Math.round(e3.f2447b), Math.round(e3.f2448c), Math.round(e3.f2449d)), a3, c0398r2, a3, new Region());
        }
        return c0398r2;
    }

    public static final void e(Region region, t0.k kVar, C0398r c0398r, t0.k kVar2, Region region2) {
        C0444z c0444z;
        Object y3;
        boolean v3 = kVar2.f6238c.v();
        C0444z c0444z2 = kVar2.f6238c;
        boolean z3 = (v3 && c0444z2.u()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i3 = kVar.f6242g;
        int i4 = kVar2.f6242g;
        if (!isEmpty || i4 == i3) {
            if (!z3 || kVar2.f6240e) {
                t0.g gVar = kVar2.f6239d;
                boolean z4 = gVar.f6231e;
                Object obj = kVar2.f6236a;
                if (z4 && (y3 = Z0.d.y(c0444z2)) != null) {
                    obj = y3;
                }
                P.k kVar3 = ((P.k) obj).f2088d;
                Object obj2 = gVar.f6230d.get(t0.f.f6207b);
                if (obj2 == null) {
                    obj2 = null;
                }
                boolean z5 = obj2 != null;
                boolean z6 = kVar3.f2088d.f2099p;
                V.d dVar = V.d.f2445e;
                if (z6) {
                    if (z5) {
                        n0.Y p3 = AbstractC0409C.p(kVar3, 8);
                        if (p3.q0().f2099p) {
                            InterfaceC0357g v4 = Z0.d.v(p3);
                            V.b bVar = p3.f5211A;
                            if (bVar == null) {
                                bVar = new V.b();
                                bVar.f2440a = 0.0f;
                                bVar.f2441b = 0.0f;
                                bVar.f2442c = 0.0f;
                                bVar.f2443d = 0.0f;
                                p3.f5211A = bVar;
                            }
                            long g02 = p3.g0(p3.p0());
                            bVar.f2440a = -V.f.d(g02);
                            bVar.f2441b = -V.f.b(g02);
                            bVar.f2442c = V.f.d(g02) + p3.D();
                            bVar.f2443d = V.f.b(g02) + ((int) (p3.f4929f & 4294967295L));
                            while (true) {
                                if (p3 == v4) {
                                    dVar = new V.d(bVar.f2440a, bVar.f2441b, bVar.f2442c, bVar.f2443d);
                                    break;
                                }
                                p3.F0(bVar, false, true);
                                if (bVar.b()) {
                                    break;
                                }
                                p3 = p3.f5219p;
                                p2.g.b(p3);
                            }
                        }
                    } else {
                        n0.Y p4 = AbstractC0409C.p(kVar3, 8);
                        dVar = Z0.d.v(p4).h(p4, true);
                    }
                }
                int round = Math.round(dVar.f2446a);
                int round2 = Math.round(dVar.f2447b);
                int round3 = Math.round(dVar.f2448c);
                int round4 = Math.round(dVar.f2449d);
                region2.set(round, round2, round3, round4);
                if (i4 == i3) {
                    i4 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (kVar2.f6240e) {
                        t0.k j3 = kVar2.j();
                        V.d e3 = (j3 == null || (c0444z = j3.f6238c) == null || !c0444z.v()) ? f5446b : j3.e();
                        c0398r.i(i4, new B0(kVar2, new Rect(Math.round(e3.f2446a), Math.round(e3.f2447b), Math.round(e3.f2448c), Math.round(e3.f2449d))));
                        return;
                    } else {
                        if (i4 == -1) {
                            c0398r.i(i4, new B0(kVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c0398r.i(i4, new B0(kVar2, region2.getBounds()));
                List h = t0.k.h(kVar2, true, 4);
                for (int size = h.size() - 1; -1 < size; size--) {
                    e(region, kVar, c0398r, (t0.k) h.get(size), region2);
                }
                if (i(kVar2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final v0.y f(t0.g gVar) {
        o2.c cVar;
        ArrayList arrayList = new ArrayList();
        Object obj = gVar.f6230d.get(t0.f.f6206a);
        if (obj == null) {
            obj = null;
        }
        C0599a c0599a = (C0599a) obj;
        if (c0599a == null || (cVar = (o2.c) c0599a.f6199b) == null || !((Boolean) cVar.i(arrayList)).booleanValue()) {
            return null;
        }
        return (v0.y) arrayList.get(0);
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        float f12 = fArr[9];
        float f13 = fArr[10];
        float f14 = fArr[11];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[14];
        float f18 = fArr[15];
        float f19 = (f3 * f8) - (f4 * f7);
        float f20 = (f3 * f9) - (f5 * f7);
        float f21 = (f3 * f10) - (f6 * f7);
        float f22 = (f4 * f9) - (f5 * f8);
        float f23 = (f4 * f10) - (f6 * f8);
        float f24 = (f5 * f10) - (f6 * f9);
        float f25 = (f11 * f16) - (f12 * f15);
        float f26 = (f11 * f17) - (f13 * f15);
        float f27 = (f11 * f18) - (f14 * f15);
        float f28 = (f12 * f17) - (f13 * f16);
        float f29 = (f12 * f18) - (f14 * f16);
        float f30 = (f13 * f18) - (f14 * f17);
        float f31 = (f24 * f25) + (((f22 * f27) + ((f21 * f28) + ((f19 * f30) - (f20 * f29)))) - (f23 * f26));
        if (f31 == 0.0f) {
            return false;
        }
        float f32 = 1.0f / f31;
        fArr2[0] = ((f10 * f28) + ((f8 * f30) - (f9 * f29))) * f32;
        fArr2[1] = (((f5 * f29) + ((-f4) * f30)) - (f6 * f28)) * f32;
        fArr2[2] = ((f18 * f22) + ((f16 * f24) - (f17 * f23))) * f32;
        fArr2[3] = (((f13 * f23) + ((-f12) * f24)) - (f14 * f22)) * f32;
        float f33 = -f7;
        fArr2[4] = (((f9 * f27) + (f33 * f30)) - (f10 * f26)) * f32;
        fArr2[5] = ((f6 * f26) + ((f30 * f3) - (f5 * f27))) * f32;
        float f34 = -f15;
        fArr2[6] = (((f17 * f21) + (f34 * f24)) - (f18 * f20)) * f32;
        fArr2[7] = ((f14 * f20) + ((f24 * f11) - (f13 * f21))) * f32;
        fArr2[8] = ((f10 * f25) + ((f7 * f29) - (f8 * f27))) * f32;
        fArr2[9] = (((f27 * f4) + ((-f3) * f29)) - (f6 * f25)) * f32;
        fArr2[10] = ((f18 * f19) + ((f15 * f23) - (f16 * f21))) * f32;
        fArr2[11] = (((f21 * f12) + ((-f11) * f23)) - (f14 * f19)) * f32;
        fArr2[12] = (((f8 * f26) + (f33 * f28)) - (f9 * f25)) * f32;
        fArr2[13] = ((f5 * f25) + ((f3 * f28) - (f4 * f26))) * f32;
        fArr2[14] = (((f16 * f20) + (f34 * f22)) - (f17 * f19)) * f32;
        fArr2[15] = ((f13 * f19) + ((f11 * f22) - (f12 * f20))) * f32;
        return true;
    }

    public static final boolean h(C0444z c0444z, C0444z c0444z2) {
        C0444z k3 = c0444z2.k();
        if (k3 == null) {
            return false;
        }
        return k3.equals(c0444z) || h(c0444z, k3);
    }

    public static final boolean i(t0.k kVar) {
        t0.g gVar = kVar.f6239d;
        if (!gVar.f6231e) {
            Set keySet = gVar.f6230d.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (((t0.q) it.next()).f6287c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean j(W.B b3, float f3, float f4, W.C c3, W.C c4) {
        boolean l3;
        if (!(b3 instanceof W.z)) {
            if (!(b3 instanceof W.A)) {
                if (b3 instanceof W.y) {
                    return k(((W.y) b3).f2571a, f3, f4, c3, c4);
                }
                throw new B1.c();
            }
            V.e eVar = ((W.A) b3).f2482a;
            float f5 = eVar.f2450a;
            if (f3 < f5) {
                return false;
            }
            float f6 = eVar.f2452c;
            if (f3 >= f6) {
                return false;
            }
            float f7 = eVar.f2451b;
            if (f4 < f7) {
                return false;
            }
            float f8 = eVar.f2453d;
            if (f4 >= f8) {
                return false;
            }
            long j3 = eVar.f2454e;
            float b4 = V.a.b(j3);
            long j4 = eVar.f2455f;
            if (V.a.b(j4) + b4 <= eVar.b()) {
                long j5 = eVar.h;
                float b5 = V.a.b(j5);
                long j6 = eVar.f2456g;
                if (V.a.b(j6) + b5 <= eVar.b()) {
                    if (V.a.c(j5) + V.a.c(j3) <= eVar.a()) {
                        if (V.a.c(j6) + V.a.c(j4) <= eVar.a()) {
                            float b6 = V.a.b(j3) + f5;
                            float c5 = V.a.c(j3) + f7;
                            float b7 = f6 - V.a.b(j4);
                            float c6 = f7 + V.a.c(j4);
                            float b8 = f6 - V.a.b(j6);
                            float c7 = f8 - V.a.c(j6);
                            float c8 = f8 - V.a.c(j5);
                            float b9 = V.a.b(j5) + f5;
                            if (f3 < b6 && f4 < c5) {
                                l3 = l(f3, f4, eVar.f2454e, b6, c5);
                            } else if (f3 < b9 && f4 > c8) {
                                l3 = l(f3, f4, eVar.h, b9, c8);
                            } else if (f3 > b7 && f4 < c6) {
                                l3 = l(f3, f4, eVar.f2455f, b7, c6);
                            } else if (f3 > b8 && f4 > c7) {
                                l3 = l(f3, f4, eVar.f2456g, b8, c7);
                            }
                            return l3;
                        }
                    }
                }
            }
            W.C f9 = c4 == null ? W.D.f() : c4;
            W.C.a(f9, eVar);
            return k(f9, f3, f4, c3, c4);
        }
        V.d dVar = ((W.z) b3).f2572a;
        if (dVar.f2446a > f3 || f3 >= dVar.f2448c || dVar.f2447b > f4 || f4 >= dVar.f2449d) {
            return false;
        }
        return true;
    }

    public static final boolean k(W.C c3, float f3, float f4, W.C c4, W.C c5) {
        Path.Direction direction;
        V.d dVar = new V.d(f3 - 0.005f, f4 - 0.005f, f3 + 0.005f, f4 + 0.005f);
        if (c4 == null) {
            c4 = W.D.f();
        }
        C0086i c0086i = (C0086i) c4;
        float f5 = dVar.f2446a;
        if (!Float.isNaN(f5)) {
            float f6 = dVar.f2447b;
            if (!Float.isNaN(f6)) {
                float f7 = dVar.f2448c;
                if (!Float.isNaN(f7)) {
                    float f8 = dVar.f2449d;
                    if (!Float.isNaN(f8)) {
                        if (c0086i.f2546b == null) {
                            c0086i.f2546b = new RectF();
                        }
                        RectF rectF = c0086i.f2546b;
                        p2.g.b(rectF);
                        rectF.set(f5, f6, f7, f8);
                        RectF rectF2 = c0086i.f2546b;
                        p2.g.b(rectF2);
                        int b3 = AbstractC0537f.b(1);
                        if (b3 == 0) {
                            direction = Path.Direction.CCW;
                        } else {
                            if (b3 != 1) {
                                throw new B1.c();
                            }
                            direction = Path.Direction.CW;
                        }
                        c0086i.f2545a.addRect(rectF2, direction);
                        if (c5 == null) {
                            c5 = W.D.f();
                        }
                        C0086i c0086i2 = (C0086i) c5;
                        c0086i2.getClass();
                        Path.Op op = Path.Op.INTERSECT;
                        if (!(c3 instanceof C0086i)) {
                            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                        }
                        Path path = ((C0086i) c3).f2545a;
                        if (!(c4 instanceof C0086i)) {
                            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                        }
                        c0086i2.f2545a.op(path, ((C0086i) c4).f2545a, op);
                        boolean isEmpty = c0086i2.f2545a.isEmpty();
                        c0086i2.b();
                        ((C0086i) c4).b();
                        return !isEmpty;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    public static final boolean l(float f3, float f4, long j3, float f5, float f6) {
        float f7 = f3 - f5;
        float f8 = f4 - f6;
        float b3 = V.a.b(j3);
        float c3 = V.a.c(j3);
        return ((f8 * f8) / (c3 * c3)) + ((f7 * f7) / (b3 * b3)) <= 1.0f;
    }

    public static final void m(float[] fArr, float[] fArr2) {
        float c3 = c(fArr2, 0, fArr, 0);
        float c4 = c(fArr2, 0, fArr, 1);
        float c5 = c(fArr2, 0, fArr, 2);
        float c6 = c(fArr2, 0, fArr, 3);
        float c7 = c(fArr2, 1, fArr, 0);
        float c8 = c(fArr2, 1, fArr, 1);
        float c9 = c(fArr2, 1, fArr, 2);
        float c10 = c(fArr2, 1, fArr, 3);
        float c11 = c(fArr2, 2, fArr, 0);
        float c12 = c(fArr2, 2, fArr, 1);
        float c13 = c(fArr2, 2, fArr, 2);
        float c14 = c(fArr2, 2, fArr, 3);
        float c15 = c(fArr2, 3, fArr, 0);
        float c16 = c(fArr2, 3, fArr, 1);
        float c17 = c(fArr2, 3, fArr, 2);
        float c18 = c(fArr2, 3, fArr, 3);
        fArr[0] = c3;
        fArr[1] = c4;
        fArr[2] = c5;
        fArr[3] = c6;
        fArr[4] = c7;
        fArr[5] = c8;
        fArr[6] = c9;
        fArr[7] = c10;
        fArr[8] = c11;
        fArr[9] = c12;
        fArr[10] = c13;
        fArr[11] = c14;
        fArr[12] = c15;
        fArr[13] = c16;
        fArr[14] = c17;
        fArr[15] = c18;
    }

    public static final void n(Z z3, int i3) {
        Object obj;
        Iterator<T> it = z3.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((C0444z) ((Map.Entry) obj).getKey()).f5301e == i3) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && entry.getValue() != null) {
            throw new ClassCastException();
        }
    }

    public static final String o(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String p(int i3) {
        if (t0.e.a(i3, 0)) {
            return "android.widget.Button";
        }
        if (t0.e.a(i3, 1)) {
            return "android.widget.CheckBox";
        }
        if (t0.e.a(i3, 3)) {
            return "android.widget.RadioButton";
        }
        if (t0.e.a(i3, 5)) {
            return "android.widget.ImageView";
        }
        if (t0.e.a(i3, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static void q(View view) {
        try {
            if (!H0.f5426v) {
                H0.f5426v = true;
                if (Build.VERSION.SDK_INT < 28) {
                    H0.f5424t = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    H0.f5425u = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    H0.f5424t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    H0.f5425u = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = H0.f5424t;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = H0.f5425u;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = H0.f5425u;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = H0.f5424t;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            H0.f5427w = true;
        }
    }
}
