package L0;

import A.AbstractC0000a;
import D1.w;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f1457b;

    /* renamed from: c, reason: collision with root package name */
    public final w f1458c;

    /* renamed from: a, reason: collision with root package name */
    public int f1456a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1459d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1460e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f1461f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f1462g = new float[8];
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f1463i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1464j = false;

    public a(c cVar, w wVar) {
        this.f1457b = cVar;
        this.f1458c = wVar;
    }

    @Override // L0.b
    public final float a(int i3) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f1456a; i5++) {
            if (i5 == i3) {
                return this.f1462g[i4];
            }
            i4 = this.f1461f[i4];
        }
        return 0.0f;
    }

    @Override // L0.b
    public final void b(j jVar, float f3) {
        if (f3 == 0.0f) {
            c(jVar, true);
            return;
        }
        int i3 = this.h;
        c cVar = this.f1457b;
        if (i3 == -1) {
            this.h = 0;
            this.f1462g[0] = f3;
            this.f1460e[0] = jVar.f1495b;
            this.f1461f[0] = -1;
            jVar.f1503k++;
            jVar.a(cVar);
            this.f1456a++;
            if (this.f1464j) {
                return;
            }
            int i4 = this.f1463i + 1;
            this.f1463i = i4;
            int[] iArr = this.f1460e;
            if (i4 >= iArr.length) {
                this.f1464j = true;
                this.f1463i = iArr.length - 1;
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i6 = 0; i3 != -1 && i6 < this.f1456a; i6++) {
            int i7 = this.f1460e[i3];
            int i8 = jVar.f1495b;
            if (i7 == i8) {
                this.f1462g[i3] = f3;
                return;
            }
            if (i7 < i8) {
                i5 = i3;
            }
            i3 = this.f1461f[i3];
        }
        int i9 = this.f1463i;
        int i10 = i9 + 1;
        if (this.f1464j) {
            int[] iArr2 = this.f1460e;
            if (iArr2[i9] != -1) {
                i9 = iArr2.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr3 = this.f1460e;
        if (i9 >= iArr3.length && this.f1456a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f1460e;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    i9 = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f1460e;
        if (i9 >= iArr5.length) {
            i9 = iArr5.length;
            int i12 = this.f1459d * 2;
            this.f1459d = i12;
            this.f1464j = false;
            this.f1463i = i9 - 1;
            this.f1462g = Arrays.copyOf(this.f1462g, i12);
            this.f1460e = Arrays.copyOf(this.f1460e, this.f1459d);
            this.f1461f = Arrays.copyOf(this.f1461f, this.f1459d);
        }
        this.f1460e[i9] = jVar.f1495b;
        this.f1462g[i9] = f3;
        if (i5 != -1) {
            int[] iArr6 = this.f1461f;
            iArr6[i9] = iArr6[i5];
            iArr6[i5] = i9;
        } else {
            this.f1461f[i9] = this.h;
            this.h = i9;
        }
        jVar.f1503k++;
        jVar.a(cVar);
        int i13 = this.f1456a + 1;
        this.f1456a = i13;
        if (!this.f1464j) {
            this.f1463i++;
        }
        int[] iArr7 = this.f1460e;
        if (i13 >= iArr7.length) {
            this.f1464j = true;
        }
        if (this.f1463i >= iArr7.length) {
            this.f1464j = true;
            this.f1463i = iArr7.length - 1;
        }
    }

    @Override // L0.b
    public final float c(j jVar, boolean z3) {
        int i3 = this.h;
        if (i3 == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i5 = -1;
        while (i3 != -1 && i4 < this.f1456a) {
            if (this.f1460e[i3] == jVar.f1495b) {
                if (i3 == this.h) {
                    this.h = this.f1461f[i3];
                } else {
                    int[] iArr = this.f1461f;
                    iArr[i5] = iArr[i3];
                }
                if (z3) {
                    jVar.b(this.f1457b);
                }
                jVar.f1503k--;
                this.f1456a--;
                this.f1460e[i3] = -1;
                if (this.f1464j) {
                    this.f1463i = i3;
                }
                return this.f1462g[i3];
            }
            i4++;
            i5 = i3;
            i3 = this.f1461f[i3];
        }
        return 0.0f;
    }

    @Override // L0.b
    public final void clear() {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f1456a; i4++) {
            j jVar = ((j[]) this.f1458c.f1034d)[this.f1460e[i3]];
            if (jVar != null) {
                jVar.b(this.f1457b);
            }
            i3 = this.f1461f[i3];
        }
        this.h = -1;
        this.f1463i = -1;
        this.f1464j = false;
        this.f1456a = 0;
    }

    @Override // L0.b
    public final float d(j jVar) {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f1456a; i4++) {
            if (this.f1460e[i3] == jVar.f1495b) {
                return this.f1462g[i3];
            }
            i3 = this.f1461f[i3];
        }
        return 0.0f;
    }

    @Override // L0.b
    public final void e(j jVar, float f3, boolean z3) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i3 = this.h;
            c cVar = this.f1457b;
            if (i3 == -1) {
                this.h = 0;
                this.f1462g[0] = f3;
                this.f1460e[0] = jVar.f1495b;
                this.f1461f[0] = -1;
                jVar.f1503k++;
                jVar.a(cVar);
                this.f1456a++;
                if (this.f1464j) {
                    return;
                }
                int i4 = this.f1463i + 1;
                this.f1463i = i4;
                int[] iArr = this.f1460e;
                if (i4 >= iArr.length) {
                    this.f1464j = true;
                    this.f1463i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i6 = 0; i3 != -1 && i6 < this.f1456a; i6++) {
                int i7 = this.f1460e[i3];
                int i8 = jVar.f1495b;
                if (i7 == i8) {
                    float[] fArr = this.f1462g;
                    float f4 = fArr[i3] + f3;
                    if (f4 > -0.001f && f4 < 0.001f) {
                        f4 = 0.0f;
                    }
                    fArr[i3] = f4;
                    if (f4 == 0.0f) {
                        if (i3 == this.h) {
                            this.h = this.f1461f[i3];
                        } else {
                            int[] iArr2 = this.f1461f;
                            iArr2[i5] = iArr2[i3];
                        }
                        if (z3) {
                            jVar.b(cVar);
                        }
                        if (this.f1464j) {
                            this.f1463i = i3;
                        }
                        jVar.f1503k--;
                        this.f1456a--;
                        return;
                    }
                    return;
                }
                if (i7 < i8) {
                    i5 = i3;
                }
                i3 = this.f1461f[i3];
            }
            int i9 = this.f1463i;
            int i10 = i9 + 1;
            if (this.f1464j) {
                int[] iArr3 = this.f1460e;
                if (iArr3[i9] != -1) {
                    i9 = iArr3.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr4 = this.f1460e;
            if (i9 >= iArr4.length && this.f1456a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f1460e;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        i9 = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f1460e;
            if (i9 >= iArr6.length) {
                i9 = iArr6.length;
                int i12 = this.f1459d * 2;
                this.f1459d = i12;
                this.f1464j = false;
                this.f1463i = i9 - 1;
                this.f1462g = Arrays.copyOf(this.f1462g, i12);
                this.f1460e = Arrays.copyOf(this.f1460e, this.f1459d);
                this.f1461f = Arrays.copyOf(this.f1461f, this.f1459d);
            }
            this.f1460e[i9] = jVar.f1495b;
            this.f1462g[i9] = f3;
            if (i5 != -1) {
                int[] iArr7 = this.f1461f;
                iArr7[i9] = iArr7[i5];
                iArr7[i5] = i9;
            } else {
                this.f1461f[i9] = this.h;
                this.h = i9;
            }
            jVar.f1503k++;
            jVar.a(cVar);
            this.f1456a++;
            if (!this.f1464j) {
                this.f1463i++;
            }
            int i13 = this.f1463i;
            int[] iArr8 = this.f1460e;
            if (i13 >= iArr8.length) {
                this.f1464j = true;
                this.f1463i = iArr8.length - 1;
            }
        }
    }

    @Override // L0.b
    public final j f(int i3) {
        int i4 = this.h;
        for (int i5 = 0; i4 != -1 && i5 < this.f1456a; i5++) {
            if (i5 == i3) {
                return ((j[]) this.f1458c.f1034d)[this.f1460e[i4]];
            }
            i4 = this.f1461f[i4];
        }
        return null;
    }

    @Override // L0.b
    public final boolean g(j jVar) {
        int i3 = this.h;
        if (i3 == -1) {
            return false;
        }
        for (int i4 = 0; i3 != -1 && i4 < this.f1456a; i4++) {
            if (this.f1460e[i3] == jVar.f1495b) {
                return true;
            }
            i3 = this.f1461f[i3];
        }
        return false;
    }

    @Override // L0.b
    public final float h(c cVar, boolean z3) {
        float d3 = d(cVar.f1465a);
        c(cVar.f1465a, z3);
        b bVar = cVar.f1468d;
        int k3 = bVar.k();
        for (int i3 = 0; i3 < k3; i3++) {
            j f3 = bVar.f(i3);
            e(f3, bVar.d(f3) * d3, z3);
        }
        return d3;
    }

    @Override // L0.b
    public final void i(float f3) {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f1456a; i4++) {
            float[] fArr = this.f1462g;
            fArr[i3] = fArr[i3] / f3;
            i3 = this.f1461f[i3];
        }
    }

    @Override // L0.b
    public final void j() {
        int i3 = this.h;
        for (int i4 = 0; i3 != -1 && i4 < this.f1456a; i4++) {
            float[] fArr = this.f1462g;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f1461f[i3];
        }
    }

    @Override // L0.b
    public final int k() {
        return this.f1456a;
    }

    public final String toString() {
        int i3 = this.h;
        String str = "";
        for (int i4 = 0; i3 != -1 && i4 < this.f1456a; i4++) {
            str = (AbstractC0000a.e(str, " -> ") + this.f1462g[i3] + " : ") + ((j[]) this.f1458c.f1034d)[this.f1460e[i3]];
            i3 = this.f1461f[i3];
        }
        return str;
    }
}
