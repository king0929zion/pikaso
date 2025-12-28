package H0;

import n.C0380G;
import o.AbstractC0450a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f1331a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0380G f1332b = new C0380G(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f1333c;

    static {
        Object[] objArr = new Object[0];
        f1333c = objArr;
        synchronized (objArr) {
            f1332b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f1332b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f1332b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f1332b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f1332b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f1332b.f4971d[0] / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static a a(float f3) {
        float f4;
        a aVar;
        if (f3 < 1.03f) {
            return null;
        }
        int i3 = (int) (f3 * 100.0f);
        a aVar2 = (a) f1332b.c(i3);
        if (aVar2 != null) {
            return aVar2;
        }
        C0380G c0380g = f1332b;
        int a3 = AbstractC0450a.a(c0380g.f4973f, i3, c0380g.f4971d);
        if (a3 >= 0) {
            return (a) f1332b.f4972e[a3];
        }
        int i4 = -(a3 + 1);
        int i5 = i4 - 1;
        if (i4 >= f1332b.f4973f) {
            c cVar = new c(new float[]{1.0f}, new float[]{f3});
            b(f3, cVar);
            return cVar;
        }
        float[] fArr = f1331a;
        if (i5 < 0) {
            aVar = new c(fArr, fArr);
            f4 = 1.0f;
        } else {
            f4 = f1332b.f4971d[i5] / 100.0f;
            aVar = (a) f1332b.f4972e[i5];
        }
        float f5 = f1332b.f4971d[i4] / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, f4 == f5 ? 0.0f : (f3 - f4) / (f5 - f4))) * 1.0f) + 0.0f;
        a aVar3 = (a) f1332b.f4972e[i4];
        float[] fArr2 = new float[9];
        for (int i6 = 0; i6 < 9; i6++) {
            float f6 = fArr[i6];
            float b3 = aVar.b(f6);
            fArr2[i6] = ((aVar3.b(f6) - b3) * max) + b3;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f3, cVar2);
        return cVar2;
    }

    public static void b(float f3, c cVar) {
        synchronized (f1333c) {
            C0380G clone = f1332b.clone();
            clone.d((int) (f3 * 100.0f), cVar);
            f1332b = clone;
        }
    }
}
