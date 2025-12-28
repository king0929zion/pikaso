package X1;

import a.AbstractC0090a;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f2730a = new u[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f2731b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f2732c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f2733d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f2734e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f2735f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final u f2736g = new u();
    public final float[] h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f2737i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f2738j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f2739k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2740l = true;

    public m() {
        for (int i3 = 0; i3 < 4; i3++) {
            this.f2730a[i3] = new u();
            this.f2731b[i3] = new Matrix();
            this.f2732c[i3] = new Matrix();
        }
    }

    public final void a(k kVar, float f3, RectF rectF, A.t tVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i3;
        float[] fArr;
        int i4;
        m mVar = this;
        path.rewind();
        Path path2 = mVar.f2734e;
        path2.rewind();
        Path path3 = mVar.f2735f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            matrixArr = mVar.f2732c;
            matrixArr2 = mVar.f2731b;
            uVarArr = mVar.f2730a;
            i3 = 4;
            fArr = mVar.h;
            if (i5 >= 4) {
                break;
            }
            c cVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f2723f : kVar.f2722e : kVar.h : kVar.f2724g;
            AbstractC0090a abstractC0090a = i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f2719b : kVar.f2718a : kVar.f2721d : kVar.f2720c;
            u uVar = uVarArr[i5];
            abstractC0090a.getClass();
            abstractC0090a.G(uVar, f3, cVar.a(rectF));
            int i6 = i5 + 1;
            float f4 = (i6 % 4) * 90;
            matrixArr2[i5].reset();
            PointF pointF = mVar.f2733d;
            if (i5 == 1) {
                i4 = i6;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i5 == 2) {
                i4 = i6;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i5 != 3) {
                i4 = i6;
                pointF.set(rectF.right, rectF.top);
            } else {
                i4 = i6;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i5].setTranslate(pointF.x, pointF.y);
            matrixArr2[i5].preRotate(f4);
            u uVar2 = uVarArr[i5];
            fArr[0] = uVar2.f2759b;
            fArr[1] = uVar2.f2760c;
            matrixArr2[i5].mapPoints(fArr);
            matrixArr[i5].reset();
            matrixArr[i5].setTranslate(fArr[0], fArr[1]);
            matrixArr[i5].preRotate(f4);
            i5 = i4;
        }
        int i7 = 0;
        while (i7 < i3) {
            u uVar3 = uVarArr[i7];
            uVar3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = uVar3.f2758a;
            matrixArr2[i7].mapPoints(fArr);
            if (i7 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            uVarArr[i7].b(matrixArr2[i7], path);
            if (tVar != null) {
                u uVar4 = uVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                g gVar = (g) tVar.f175e;
                BitSet bitSet = gVar.f2688g;
                uVar4.getClass();
                bitSet.set(i7, false);
                uVar4.a(uVar4.f2762e);
                gVar.f2686e[i7] = new n(new ArrayList(uVar4.f2764g), new Matrix(matrix));
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            u uVar5 = uVarArr[i7];
            fArr[0] = uVar5.f2759b;
            fArr[1] = uVar5.f2760c;
            matrixArr2[i7].mapPoints(fArr);
            u uVar6 = uVarArr[i9];
            uVar6.getClass();
            float[] fArr2 = mVar.f2737i;
            fArr2[0] = 0.0f;
            fArr2[1] = uVar6.f2758a;
            matrixArr2[i9].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i7];
            fArr[0] = uVar7.f2759b;
            fArr[1] = uVar7.f2760c;
            matrixArr2[i7].mapPoints(fArr);
            if (i7 == 1 || i7 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = mVar.f2736g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            (i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.f2726j : kVar.f2725i : kVar.f2728l : kVar.f2727k).getClass();
            uVar8.c(max, 0.0f);
            Path path4 = mVar.f2738j;
            path4.reset();
            uVar8.b(matrixArr[i7], path4);
            if (mVar.f2740l && (mVar.b(path4, i7) || mVar.b(path4, i9))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f2758a;
                matrixArr[i7].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i7], path2);
            } else {
                uVar8.b(matrixArr[i7], path);
            }
            if (tVar != null) {
                Matrix matrix2 = matrixArr[i7];
                g gVar2 = (g) tVar.f175e;
                gVar2.f2688g.set(i7 + 4, false);
                uVar8.a(uVar8.f2762e);
                gVar2.f2687f[i7] = new n(new ArrayList(uVar8.f2764g), new Matrix(matrix2));
            }
            i3 = 4;
            mVar = this;
            i7 = i8;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i3) {
        Path path2 = this.f2739k;
        path2.reset();
        this.f2730a[i3].b(this.f2731b[i3], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
