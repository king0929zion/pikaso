package L0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: f, reason: collision with root package name */
    public j[] f1491f;

    /* renamed from: g, reason: collision with root package name */
    public j[] f1492g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public h f1493i;

    @Override // L0.c
    public final j d(boolean[] zArr) {
        int i3 = -1;
        for (int i4 = 0; i4 < this.h; i4++) {
            j[] jVarArr = this.f1491f;
            j jVar = jVarArr[i4];
            if (!zArr[jVar.f1495b]) {
                h hVar = this.f1493i;
                hVar.f1489d = jVar;
                int i5 = 8;
                if (i3 == -1) {
                    while (i5 >= 0) {
                        float f3 = hVar.f1489d.h[i5];
                        if (f3 <= 0.0f) {
                            if (f3 < 0.0f) {
                                i3 = i4;
                                break;
                            }
                            i5--;
                        }
                    }
                } else {
                    j jVar2 = jVarArr[i3];
                    while (true) {
                        if (i5 >= 0) {
                            float f4 = jVar2.h[i5];
                            float f5 = hVar.f1489d.h[i5];
                            if (f5 == f4) {
                                i5--;
                            } else if (f5 >= f4) {
                            }
                        }
                    }
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        return this.f1491f[i3];
    }

    @Override // L0.c
    public final void h(c cVar, boolean z3) {
        j jVar = cVar.f1465a;
        if (jVar == null) {
            return;
        }
        b bVar = cVar.f1468d;
        int k3 = bVar.k();
        for (int i3 = 0; i3 < k3; i3++) {
            j f3 = bVar.f(i3);
            float a3 = bVar.a(i3);
            h hVar = this.f1493i;
            hVar.f1489d = f3;
            boolean z4 = f3.f1494a;
            float[] fArr = jVar.h;
            if (z4) {
                boolean z5 = true;
                for (int i4 = 0; i4 < 9; i4++) {
                    float[] fArr2 = hVar.f1489d.h;
                    float f4 = (fArr[i4] * a3) + fArr2[i4];
                    fArr2[i4] = f4;
                    if (Math.abs(f4) < 1.0E-4f) {
                        hVar.f1489d.h[i4] = 0.0f;
                    } else {
                        z5 = false;
                    }
                }
                if (z5) {
                    hVar.f1490e.j(hVar.f1489d);
                }
            } else {
                for (int i5 = 0; i5 < 9; i5++) {
                    float f5 = fArr[i5];
                    if (f5 != 0.0f) {
                        float f6 = f5 * a3;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        hVar.f1489d.h[i5] = f6;
                    } else {
                        hVar.f1489d.h[i5] = 0.0f;
                    }
                }
                i(f3);
            }
            this.f1466b = (cVar.f1466b * a3) + this.f1466b;
        }
        j(jVar);
    }

    public final void i(j jVar) {
        int i3;
        int i4 = this.h + 1;
        j[] jVarArr = this.f1491f;
        if (i4 > jVarArr.length) {
            j[] jVarArr2 = (j[]) Arrays.copyOf(jVarArr, jVarArr.length * 2);
            this.f1491f = jVarArr2;
            this.f1492g = (j[]) Arrays.copyOf(jVarArr2, jVarArr2.length * 2);
        }
        j[] jVarArr3 = this.f1491f;
        int i5 = this.h;
        jVarArr3[i5] = jVar;
        int i6 = i5 + 1;
        this.h = i6;
        if (i6 > 1 && jVarArr3[i5].f1495b > jVar.f1495b) {
            int i7 = 0;
            while (true) {
                i3 = this.h;
                if (i7 >= i3) {
                    break;
                }
                this.f1492g[i7] = this.f1491f[i7];
                i7++;
            }
            Arrays.sort(this.f1492g, 0, i3, new g(0));
            for (int i8 = 0; i8 < this.h; i8++) {
                this.f1491f[i8] = this.f1492g[i8];
            }
        }
        jVar.f1494a = true;
        jVar.a(this);
    }

    public final void j(j jVar) {
        int i3 = 0;
        while (i3 < this.h) {
            if (this.f1491f[i3] == jVar) {
                while (true) {
                    int i4 = this.h;
                    if (i3 >= i4 - 1) {
                        this.h = i4 - 1;
                        jVar.f1494a = false;
                        return;
                    } else {
                        j[] jVarArr = this.f1491f;
                        int i5 = i3 + 1;
                        jVarArr[i3] = jVarArr[i5];
                        i3 = i5;
                    }
                }
            } else {
                i3++;
            }
        }
    }

    @Override // L0.c
    public final String toString() {
        String str = " goal -> (" + this.f1466b + ") : ";
        for (int i3 = 0; i3 < this.h; i3++) {
            j jVar = this.f1491f[i3];
            h hVar = this.f1493i;
            hVar.f1489d = jVar;
            str = str + hVar + " ";
        }
        return str;
    }
}
