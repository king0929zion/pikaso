package X;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final c f2618a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2619b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2620c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f2621d;

    public h(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f2618a = cVar;
        this.f2619b = cVar2;
        this.f2620c = cVar3;
        this.f2621d = fArr;
    }

    public long a(long j3) {
        float h = W.r.h(j3);
        float g3 = W.r.g(j3);
        float e3 = W.r.e(j3);
        float d3 = W.r.d(j3);
        c cVar = this.f2619b;
        long d4 = cVar.d(h, g3, e3);
        float intBitsToFloat = Float.intBitsToFloat((int) (d4 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        float e4 = cVar.e(h, g3, e3);
        float[] fArr = this.f2621d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e4 *= fArr[2];
        }
        float f3 = intBitsToFloat;
        float f4 = intBitsToFloat2;
        return this.f2620c.f(f3, f4, e4, d3, this.f2618a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(X.c r12, X.c r13, int r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            long r4 = r12.f2592b
            long r6 = X.b.f2586a
            boolean r4 = X.b.a(r4, r6)
            if (r4 == 0) goto L13
            X.c r4 = X.k.a(r12)
            goto L14
        L13:
            r4 = r12
        L14:
            long r8 = r13.f2592b
            boolean r5 = X.b.a(r8, r6)
            if (r5 == 0) goto L21
            X.c r5 = X.k.a(r13)
            goto L22
        L21:
            r5 = r13
        L22:
            r8 = 0
            if (r14 != r3) goto L69
            long r9 = r12.f2592b
            boolean r14 = X.b.a(r9, r6)
            long r9 = r13.f2592b
            boolean r6 = X.b.a(r9, r6)
            if (r14 == 0) goto L36
            if (r6 == 0) goto L36
            goto L69
        L36:
            if (r14 != 0) goto L3a
            if (r6 == 0) goto L69
        L3a:
            if (r14 == 0) goto L3d
            goto L3e
        L3d:
            r12 = r13
        L3e:
            X.r r12 = (X.r) r12
            float[] r7 = X.k.f2627e
            X.t r12 = r12.f2642d
            if (r14 == 0) goto L4b
            float[] r14 = r12.a()
            goto L4c
        L4b:
            r14 = r7
        L4c:
            if (r6 == 0) goto L52
            float[] r7 = r12.a()
        L52:
            r12 = r14[r2]
            r6 = r7[r2]
            float r12 = r12 / r6
            r6 = r14[r1]
            r8 = r7[r1]
            float r6 = r6 / r8
            r14 = r14[r0]
            r7 = r7[r0]
            float r14 = r14 / r7
            float[] r8 = new float[r3]
            r8[r2] = r12
            r8[r1] = r6
            r8[r0] = r14
        L69:
            r11.<init>(r13, r4, r5, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.h.<init>(X.c, X.c, int):void");
    }
}
