package L;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f1453a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f1454b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1455c;

    public f(int i3, long[] jArr, Object[] objArr) {
        this.f1453a = i3;
        this.f1454b = jArr;
        this.f1455c = objArr;
    }

    public final int a(long j3) {
        int i3 = this.f1453a - 1;
        if (i3 == -1) {
            return -1;
        }
        long[] jArr = this.f1454b;
        int i4 = 0;
        if (i3 == 0) {
            long j4 = jArr[0];
            if (j4 == j3) {
                return 0;
            }
            return j4 > j3 ? -2 : -1;
        }
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j5 = jArr[i5] - j3;
            if (j5 < 0) {
                i4 = i5 + 1;
            } else {
                if (j5 <= 0) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public final f b(long j3, Object obj) {
        long[] jArr;
        int i3;
        Object[] objArr = this.f1455c;
        int i4 = 0;
        int i5 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i5++;
            }
        }
        int i6 = i5 + 1;
        long[] jArr2 = new long[i6];
        Object[] objArr2 = new Object[i6];
        if (i6 > 1) {
            int i7 = 0;
            while (true) {
                jArr = this.f1454b;
                i3 = this.f1453a;
                if (i4 >= i6 || i7 >= i3) {
                    break;
                }
                long j4 = jArr[i7];
                Object obj3 = objArr[i7];
                if (j4 > j3) {
                    jArr2[i4] = j3;
                    objArr2[i4] = obj;
                    i4++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i4] = j4;
                    objArr2[i4] = obj3;
                    i4++;
                }
                i7++;
            }
            if (i7 == i3) {
                jArr2[i5] = j3;
                objArr2[i5] = obj;
            } else {
                while (i4 < i6) {
                    long j5 = jArr[i7];
                    Object obj4 = objArr[i7];
                    if (obj4 != null) {
                        jArr2[i4] = j5;
                        objArr2[i4] = obj4;
                        i4++;
                    }
                    i7++;
                }
            }
        } else {
            jArr2[0] = j3;
            objArr2[0] = obj;
        }
        return new f(i6, jArr2, objArr2);
    }
}
