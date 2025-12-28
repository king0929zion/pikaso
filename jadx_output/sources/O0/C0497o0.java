package o0;

import android.graphics.Matrix;

/* renamed from: o0.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497o0 {

    /* renamed from: a, reason: collision with root package name */
    public final p2.h f5631a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f5632b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f5633c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f5634d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f5635e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5636f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5637g = true;
    public boolean h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C0497o0(o2.e eVar) {
        this.f5631a = (p2.h) eVar;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f5635e;
        if (fArr == null) {
            fArr = W.D.j();
            this.f5635e = fArr;
        }
        if (this.f5637g) {
            this.h = AbstractC0461K.g(b(obj), fArr);
            this.f5637g = false;
        }
        if (this.h) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o2.e, p2.h] */
    public final float[] b(Object obj) {
        float[] fArr = this.f5634d;
        if (fArr == null) {
            fArr = W.D.j();
            this.f5634d = fArr;
        }
        if (!this.f5636f) {
            return fArr;
        }
        Matrix matrix = this.f5632b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f5632b = matrix;
        }
        this.f5631a.h(obj, matrix);
        Matrix matrix2 = this.f5633c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            W.D.y(fArr, matrix);
            this.f5632b = matrix2;
            this.f5633c = matrix;
        }
        this.f5636f = false;
        return fArr;
    }

    public final void c() {
        this.f5636f = true;
        this.f5637g = true;
    }
}
