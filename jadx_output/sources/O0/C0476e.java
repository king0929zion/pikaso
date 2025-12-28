package o0;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476e extends AbstractC0470b {

    /* renamed from: c, reason: collision with root package name */
    public static C0476e f5566c;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        return null;
     */
    @Override // o0.AbstractC0470b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] a(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r5 < r0) goto Lf
            return r1
        Lf:
            if (r5 >= 0) goto L12
            r5 = 0
        L12:
            if (r5 >= r0) goto L29
            java.lang.String r2 = r4.c()
            char r2 = r2.charAt(r5)
            r3 = 10
            if (r2 != r3) goto L29
            boolean r2 = r4.f(r5)
            if (r2 != 0) goto L29
            int r5 = r5 + 1
            goto L12
        L29:
            if (r5 < r0) goto L2c
            return r1
        L2c:
            int r1 = r5 + 1
        L2e:
            if (r1 >= r0) goto L39
            boolean r2 = r4.e(r1)
            if (r2 != 0) goto L39
            int r1 = r1 + 1
            goto L2e
        L39:
            int[] r5 = r4.b(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0476e.a(int):int[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        return null;
     */
    @Override // o0.AbstractC0470b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] d(int r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.c()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r4 > 0) goto Lf
            return r1
        Lf:
            if (r4 <= r0) goto L12
            r4 = r0
        L12:
            if (r4 <= 0) goto L2b
            java.lang.String r0 = r3.c()
            int r2 = r4 + (-1)
            char r0 = r0.charAt(r2)
            r2 = 10
            if (r0 != r2) goto L2b
            boolean r0 = r3.e(r4)
            if (r0 != 0) goto L2b
            int r4 = r4 + (-1)
            goto L12
        L2b:
            if (r4 > 0) goto L2e
            return r1
        L2e:
            int r0 = r4 + (-1)
        L30:
            if (r0 <= 0) goto L3b
            boolean r1 = r3.f(r0)
            if (r1 != 0) goto L3b
            int r0 = r0 + (-1)
            goto L30
        L3b:
            int[] r4 = r3.b(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0476e.d(int):int[]");
    }

    public final boolean e(int i3) {
        return i3 > 0 && c().charAt(i3 + (-1)) != '\n' && (i3 == c().length() || c().charAt(i3) == '\n');
    }

    public final boolean f(int i3) {
        return c().charAt(i3) != '\n' && (i3 == 0 || c().charAt(i3 - 1) == '\n');
    }
}
