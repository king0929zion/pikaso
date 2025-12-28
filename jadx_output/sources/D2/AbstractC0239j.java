package d2;

import java.util.Arrays;

/* renamed from: d2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0239j extends Z0.d {
    public static void X(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        p2.g.e(iArr, "<this>");
        p2.g.e(iArr2, "destination");
        System.arraycopy(iArr, i4, iArr2, i3, i5 - i4);
    }

    public static void Y(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        p2.g.e(objArr, "<this>");
        p2.g.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static /* synthetic */ void Z(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = iArr.length;
        }
        X(i3, 0, i4, iArr, iArr2);
    }

    public static /* synthetic */ void a0(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        Y(objArr, objArr2, 0, i3, i4);
    }

    public static Object[] b0(Object[] objArr, int i3, int i4) {
        p2.g.e(objArr, "<this>");
        int length = objArr.length;
        if (i4 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i3, i4);
            p2.g.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + length + ").");
    }

    public static void c0(Object[] objArr, int i3, int i4) {
        p2.g.e(objArr, "<this>");
        Arrays.fill(objArr, i3, i4, (Object) null);
    }

    public static void d0(long[] jArr) {
        int length = jArr.length;
        p2.g.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static int e0(Object[] objArr, Object obj) {
        p2.g.e(objArr, "<this>");
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (obj.equals(objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }
}
