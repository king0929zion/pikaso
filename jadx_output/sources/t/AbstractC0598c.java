package t;

import s1.C0589c;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0598c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0589c f6149a = new C0589c(4, false);

    /* renamed from: b, reason: collision with root package name */
    public static final C0589c f6150b = new C0589c(5, false);

    /* renamed from: c, reason: collision with root package name */
    public static final C0596a f6151c = new C0596a(0);

    static {
        new C0596a(3);
        new C0596a(2);
        new C0596a(1);
    }

    public static void a(int i3, int[] iArr, int[] iArr2, boolean z3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        float f3 = (i3 - i5) / 2;
        if (!z3) {
            int length = iArr.length;
            int i7 = 0;
            while (i4 < length) {
                int i8 = iArr[i4];
                iArr2[i7] = Math.round(f3);
                f3 += i8;
                i4++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = Math.round(f3);
            f3 += i9;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z3) {
        int i3 = 0;
        if (!z3) {
            int length = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int i6 = iArr[i3];
                iArr2[i4] = i5;
                i5 += i6;
                i3++;
                i4++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = i3;
            i3 += i7;
        }
    }

    public static void c(int i3, int[] iArr, int[] iArr2, boolean z3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        int i7 = i3 - i5;
        if (!z3) {
            int length = iArr.length;
            int i8 = 0;
            while (i4 < length) {
                int i9 = iArr[i4];
                iArr2[i8] = i7;
                i7 += i9;
                i4++;
                i8++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i10 = iArr[length2];
            iArr2[length2] = i7;
            i7 += i10;
        }
    }

    public static void d(int i3, int[] iArr, int[] iArr2, boolean z3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        float length = iArr.length == 0 ? 0.0f : (i3 - i5) / iArr.length;
        float f3 = length / 2;
        if (!z3) {
            int length2 = iArr.length;
            int i7 = 0;
            while (i4 < length2) {
                int i8 = iArr[i4];
                iArr2[i7] = Math.round(f3);
                f3 += i8 + length;
                i4++;
                i7++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i9 = iArr[length3];
            iArr2[length3] = Math.round(f3);
            f3 += i9 + length;
        }
    }

    public static void e(int i3, int[] iArr, int[] iArr2, boolean z3) {
        if (iArr.length == 0) {
            return;
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        float max = (i3 - i5) / Math.max(iArr.length - 1, 1);
        float f3 = (z3 && iArr.length == 1) ? max : 0.0f;
        if (z3) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i7 = iArr[length];
                iArr2[length] = Math.round(f3);
                f3 += i7 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i8 = 0;
        while (i4 < length2) {
            int i9 = iArr[i4];
            iArr2[i8] = Math.round(f3);
            f3 += i9 + max;
            i4++;
            i8++;
        }
    }

    public static void f(int i3, int[] iArr, int[] iArr2, boolean z3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        float length = (i3 - i5) / (iArr.length + 1);
        if (z3) {
            float f3 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f3);
                f3 += i7 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f4 = length;
        int i8 = 0;
        while (i4 < length3) {
            int i9 = iArr[i4];
            iArr2[i8] = Math.round(f4);
            f4 += i9 + length;
            i4++;
            i8++;
        }
    }
}
