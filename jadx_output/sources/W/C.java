package W;

import android.graphics.Path;
import android.graphics.RectF;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public interface C {
    static void a(C c3, V.e eVar) {
        Path.Direction direction;
        C0086i c0086i = (C0086i) c3;
        if (c0086i.f2546b == null) {
            c0086i.f2546b = new RectF();
        }
        RectF rectF = c0086i.f2546b;
        p2.g.b(rectF);
        float f3 = eVar.f2453d;
        rectF.set(eVar.f2450a, eVar.f2451b, eVar.f2452c, f3);
        if (c0086i.f2547c == null) {
            c0086i.f2547c = new float[8];
        }
        float[] fArr = c0086i.f2547c;
        p2.g.b(fArr);
        long j3 = eVar.f2454e;
        fArr[0] = V.a.b(j3);
        fArr[1] = V.a.c(j3);
        long j4 = eVar.f2455f;
        fArr[2] = V.a.b(j4);
        fArr[3] = V.a.c(j4);
        long j5 = eVar.f2456g;
        fArr[4] = V.a.b(j5);
        fArr[5] = V.a.c(j5);
        long j6 = eVar.h;
        fArr[6] = V.a.b(j6);
        fArr[7] = V.a.c(j6);
        RectF rectF2 = c0086i.f2546b;
        p2.g.b(rectF2);
        float[] fArr2 = c0086i.f2547c;
        p2.g.b(fArr2);
        int b3 = AbstractC0537f.b(1);
        if (b3 == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (b3 != 1) {
                throw new B1.c();
            }
            direction = Path.Direction.CW;
        }
        c0086i.f2545a.addRoundRect(rectF2, fArr2, direction);
    }
}
