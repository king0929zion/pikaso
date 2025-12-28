package n;

import d2.AbstractC0239j;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0388h {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f4990a;

    static {
        long[] jArr = AbstractC0377D.f4966a;
        int d3 = AbstractC0377D.d(0);
        int max = d3 > 0 ? Math.max(7, AbstractC0377D.c(d3)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            AbstractC0239j.d0(jArr);
        }
        int i3 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j3)) | j3;
        float[] fArr = new float[max];
        f4990a = new float[0];
    }
}
