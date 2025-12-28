package L0;

import A.AbstractC0000a;
import D1.w;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    public int f1505a = 16;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1506b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f1507c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    public int[] f1508d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public float[] f1509e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f1510f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public int[] f1511g = new int[16];
    public int h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f1512i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final d f1513j;

    /* renamed from: k, reason: collision with root package name */
    public final w f1514k;

    public k(d dVar, w wVar) {
        this.f1513j = dVar;
        this.f1514k = wVar;
        clear();
    }

    @Override // L0.b
    public final float a(int i3) {
        int i4 = this.h;
        int i5 = this.f1512i;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 == i3) {
                return this.f1509e[i5];
            }
            i5 = this.f1511g[i5];
            if (i5 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // L0.b
    public final void b(j jVar, float f3) {
        if (f3 > -0.001f && f3 < 0.001f) {
            c(jVar, true);
            return;
        }
        int i3 = 0;
        if (this.h == 0) {
            m(0, jVar, f3);
            l(jVar, 0);
            this.f1512i = 0;
            return;
        }
        int n2 = n(jVar);
        if (n2 != -1) {
            this.f1509e[n2] = f3;
            return;
        }
        int i4 = this.h + 1;
        int i5 = this.f1505a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f1508d = Arrays.copyOf(this.f1508d, i6);
            this.f1509e = Arrays.copyOf(this.f1509e, i6);
            this.f1510f = Arrays.copyOf(this.f1510f, i6);
            this.f1511g = Arrays.copyOf(this.f1511g, i6);
            this.f1507c = Arrays.copyOf(this.f1507c, i6);
            for (int i7 = this.f1505a; i7 < i6; i7++) {
                this.f1508d[i7] = -1;
                this.f1507c[i7] = -1;
            }
            this.f1505a = i6;
        }
        int i8 = this.h;
        int i9 = this.f1512i;
        int i10 = -1;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = this.f1508d[i9];
            int i13 = jVar.f1495b;
            if (i12 == i13) {
                this.f1509e[i9] = f3;
                return;
            }
            if (i12 < i13) {
                i10 = i9;
            }
            i9 = this.f1511g[i9];
            if (i9 == -1) {
                break;
            }
        }
        while (true) {
            if (i3 >= this.f1505a) {
                i3 = -1;
                break;
            } else if (this.f1508d[i3] == -1) {
                break;
            } else {
                i3++;
            }
        }
        m(i3, jVar, f3);
        if (i10 != -1) {
            this.f1510f[i3] = i10;
            int[] iArr = this.f1511g;
            iArr[i3] = iArr[i10];
            iArr[i10] = i3;
        } else {
            this.f1510f[i3] = -1;
            if (this.h > 0) {
                this.f1511g[i3] = this.f1512i;
                this.f1512i = i3;
            } else {
                this.f1511g[i3] = -1;
            }
        }
        int i14 = this.f1511g[i3];
        if (i14 != -1) {
            this.f1510f[i14] = i3;
        }
        l(jVar, i3);
    }

    @Override // L0.b
    public final float c(j jVar, boolean z3) {
        int[] iArr;
        int i3;
        int n2 = n(jVar);
        if (n2 == -1) {
            return 0.0f;
        }
        int i4 = jVar.f1495b;
        int i5 = i4 % 16;
        int[] iArr2 = this.f1506b;
        int i6 = iArr2[i5];
        if (i6 != -1) {
            if (this.f1508d[i6] == i4) {
                int[] iArr3 = this.f1507c;
                iArr2[i5] = iArr3[i6];
                iArr3[i6] = -1;
            } else {
                while (true) {
                    iArr = this.f1507c;
                    i3 = iArr[i6];
                    if (i3 == -1 || this.f1508d[i3] == i4) {
                        break;
                    }
                    i6 = i3;
                }
                if (i3 != -1 && this.f1508d[i3] == i4) {
                    iArr[i6] = iArr[i3];
                    iArr[i3] = -1;
                }
            }
        }
        float f3 = this.f1509e[n2];
        if (this.f1512i == n2) {
            this.f1512i = this.f1511g[n2];
        }
        this.f1508d[n2] = -1;
        int[] iArr4 = this.f1510f;
        int i7 = iArr4[n2];
        if (i7 != -1) {
            int[] iArr5 = this.f1511g;
            iArr5[i7] = iArr5[n2];
        }
        int i8 = this.f1511g[n2];
        if (i8 != -1) {
            iArr4[i8] = iArr4[n2];
        }
        this.h--;
        jVar.f1503k--;
        if (z3) {
            jVar.b(this.f1513j);
        }
        return f3;
    }

    @Override // L0.b
    public final void clear() {
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            j f3 = f(i4);
            if (f3 != null) {
                f3.b(this.f1513j);
            }
        }
        for (int i5 = 0; i5 < this.f1505a; i5++) {
            this.f1508d[i5] = -1;
            this.f1507c[i5] = -1;
        }
        for (int i6 = 0; i6 < 16; i6++) {
            this.f1506b[i6] = -1;
        }
        this.h = 0;
        this.f1512i = -1;
    }

    @Override // L0.b
    public final float d(j jVar) {
        int n2 = n(jVar);
        if (n2 != -1) {
            return this.f1509e[n2];
        }
        return 0.0f;
    }

    @Override // L0.b
    public final void e(j jVar, float f3, boolean z3) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int n2 = n(jVar);
            if (n2 == -1) {
                b(jVar, f3);
                return;
            }
            float[] fArr = this.f1509e;
            float f4 = fArr[n2] + f3;
            fArr[n2] = f4;
            if (f4 <= -0.001f || f4 >= 0.001f) {
                return;
            }
            fArr[n2] = 0.0f;
            c(jVar, z3);
        }
    }

    @Override // L0.b
    public final j f(int i3) {
        int i4 = this.h;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f1512i;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 == i3 && i5 != -1) {
                return ((j[]) this.f1514k.f1034d)[this.f1508d[i5]];
            }
            i5 = this.f1511g[i5];
            if (i5 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // L0.b
    public final boolean g(j jVar) {
        return n(jVar) != -1;
    }

    @Override // L0.b
    public final float h(c cVar, boolean z3) {
        float d3 = d(cVar.f1465a);
        c(cVar.f1465a, z3);
        k kVar = (k) cVar.f1468d;
        int i3 = kVar.h;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = kVar.f1508d[i5];
            if (i6 != -1) {
                e(((j[]) this.f1514k.f1034d)[i6], kVar.f1509e[i5] * d3, z3);
                i4++;
            }
            i5++;
        }
        return d3;
    }

    @Override // L0.b
    public final void i(float f3) {
        int i3 = this.h;
        int i4 = this.f1512i;
        for (int i5 = 0; i5 < i3; i5++) {
            float[] fArr = this.f1509e;
            fArr[i4] = fArr[i4] / f3;
            i4 = this.f1511g[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // L0.b
    public final void j() {
        int i3 = this.h;
        int i4 = this.f1512i;
        for (int i5 = 0; i5 < i3; i5++) {
            float[] fArr = this.f1509e;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f1511g[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // L0.b
    public final int k() {
        return this.h;
    }

    public final void l(j jVar, int i3) {
        int[] iArr;
        int i4 = jVar.f1495b % 16;
        int[] iArr2 = this.f1506b;
        int i5 = iArr2[i4];
        if (i5 == -1) {
            iArr2[i4] = i3;
        } else {
            while (true) {
                iArr = this.f1507c;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    break;
                } else {
                    i5 = i6;
                }
            }
            iArr[i5] = i3;
        }
        this.f1507c[i3] = -1;
    }

    public final void m(int i3, j jVar, float f3) {
        this.f1508d[i3] = jVar.f1495b;
        this.f1509e[i3] = f3;
        this.f1510f[i3] = -1;
        this.f1511g[i3] = -1;
        jVar.a(this.f1513j);
        jVar.f1503k++;
        this.h++;
    }

    public final int n(j jVar) {
        if (this.h == 0) {
            return -1;
        }
        int i3 = jVar.f1495b;
        int i4 = this.f1506b[i3 % 16];
        if (i4 == -1) {
            return -1;
        }
        if (this.f1508d[i4] == i3) {
            return i4;
        }
        do {
            i4 = this.f1507c[i4];
            if (i4 == -1) {
                break;
            }
        } while (this.f1508d[i4] != i3);
        if (i4 != -1 && this.f1508d[i4] == i3) {
            return i4;
        }
        return -1;
    }

    public final String toString() {
        String str = hashCode() + " { ";
        int i3 = this.h;
        for (int i4 = 0; i4 < i3; i4++) {
            j f3 = f(i4);
            if (f3 != null) {
                String str2 = str + f3 + " = " + a(i4) + " ";
                int n2 = n(f3);
                String e3 = AbstractC0000a.e(str2, "[p: ");
                int i5 = this.f1510f[n2];
                w wVar = this.f1514k;
                String e4 = AbstractC0000a.e(i5 != -1 ? e3 + ((j[]) wVar.f1034d)[this.f1508d[this.f1510f[n2]]] : AbstractC0000a.e(e3, "none"), ", n: ");
                str = AbstractC0000a.e(this.f1511g[n2] != -1 ? e4 + ((j[]) wVar.f1034d)[this.f1508d[this.f1511g[n2]]] : AbstractC0000a.e(e4, "none"), "]");
            }
        }
        return AbstractC0000a.e(str, " }");
    }
}
