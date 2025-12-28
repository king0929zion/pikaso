package X;

import W.D;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: e, reason: collision with root package name */
    public final r f2615e;

    /* renamed from: f, reason: collision with root package name */
    public final r f2616f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f2617g;

    public g(r rVar, r rVar2, int i3) {
        super(rVar2, rVar, rVar2, null);
        float[] h;
        this.f2615e = rVar;
        this.f2616f = rVar2;
        t tVar = rVar2.f2642d;
        t tVar2 = rVar.f2642d;
        boolean d3 = k.d(tVar2, tVar);
        float[] fArr = rVar.f2646i;
        float[] fArr2 = rVar2.f2647j;
        if (d3) {
            h = k.h(fArr2, fArr);
        } else {
            float[] a3 = tVar2.a();
            t tVar3 = rVar2.f2642d;
            float[] a4 = tVar3.a();
            t tVar4 = k.f2624b;
            boolean d4 = k.d(tVar2, tVar4);
            float[] fArr3 = k.f2627e;
            float[] fArr4 = a.f2584b.f2585a;
            if (!d4) {
                float[] copyOf = Arrays.copyOf(fArr3, 3);
                p2.g.d(copyOf, "copyOf(this, size)");
                fArr = k.h(k.c(fArr4, a3, copyOf), fArr);
            }
            if (!k.d(tVar3, tVar4)) {
                float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                p2.g.d(copyOf2, "copyOf(this, size)");
                fArr2 = k.g(k.h(k.c(fArr4, a4, copyOf2), rVar2.f2646i));
            }
            h = k.h(fArr2, i3 == 3 ? k.i(new float[]{a3[0] / a4[0], a3[1] / a4[1], a3[2] / a4[2]}, fArr) : fArr);
        }
        this.f2617g = h;
    }

    @Override // X.h
    public final long a(long j3) {
        float h = W.r.h(j3);
        float g3 = W.r.g(j3);
        float e3 = W.r.e(j3);
        float d3 = W.r.d(j3);
        n nVar = this.f2615e.f2653p;
        float b3 = (float) nVar.b(h);
        float b4 = (float) nVar.b(g3);
        float b5 = (float) nVar.b(e3);
        float[] fArr = this.f2617g;
        float f3 = (fArr[6] * b5) + (fArr[3] * b4) + (fArr[0] * b3);
        float f4 = (fArr[7] * b5) + (fArr[4] * b4) + (fArr[1] * b3);
        float f5 = (fArr[8] * b5) + (fArr[5] * b4) + (fArr[2] * b3);
        r rVar = this.f2616f;
        float b6 = (float) rVar.f2650m.b(f3);
        double d4 = f4;
        n nVar2 = rVar.f2650m;
        return D.a(b6, (float) nVar2.b(d4), (float) nVar2.b(f5), d3, rVar);
    }
}
