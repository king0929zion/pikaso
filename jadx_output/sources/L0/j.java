package L0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1494a;

    /* renamed from: e, reason: collision with root package name */
    public float f1498e;

    /* renamed from: l, reason: collision with root package name */
    public int f1504l;

    /* renamed from: b, reason: collision with root package name */
    public int f1495b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f1496c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f1497d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1499f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f1500g = new float[9];
    public final float[] h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public c[] f1501i = new c[16];

    /* renamed from: j, reason: collision with root package name */
    public int f1502j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f1503k = 0;

    public j(int i3) {
        this.f1504l = i3;
    }

    public final void a(c cVar) {
        int i3 = 0;
        while (true) {
            int i4 = this.f1502j;
            if (i3 >= i4) {
                c[] cVarArr = this.f1501i;
                if (i4 >= cVarArr.length) {
                    this.f1501i = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f1501i;
                int i5 = this.f1502j;
                cVarArr2[i5] = cVar;
                this.f1502j = i5 + 1;
                return;
            }
            if (this.f1501i[i3] == cVar) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void b(c cVar) {
        int i3 = this.f1502j;
        int i4 = 0;
        while (i4 < i3) {
            if (this.f1501i[i4] == cVar) {
                while (i4 < i3 - 1) {
                    c[] cVarArr = this.f1501i;
                    int i5 = i4 + 1;
                    cVarArr[i4] = cVarArr[i5];
                    i4 = i5;
                }
                this.f1502j--;
                return;
            }
            i4++;
        }
    }

    public final void c() {
        this.f1504l = 5;
        this.f1497d = 0;
        this.f1495b = -1;
        this.f1496c = -1;
        this.f1498e = 0.0f;
        this.f1499f = false;
        int i3 = this.f1502j;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f1501i[i4] = null;
        }
        this.f1502j = 0;
        this.f1503k = 0;
        this.f1494a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public final void d(c cVar) {
        int i3 = this.f1502j;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f1501i[i4].h(cVar, false);
        }
        this.f1502j = 0;
    }

    public final String toString() {
        return "" + this.f1495b;
    }
}
