package L0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1488a;

    public /* synthetic */ g(int i3) {
        this.f1488a = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if (r3 != false) goto L15;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            int r3 = r6.f1488a
            switch(r3) {
                case 0: goto L79;
                case 1: goto L5e;
                case 2: goto L50;
                case 3: goto L3b;
                default: goto L8;
            }
        L8:
            z1.j r7 = (z1.C0736j) r7
            z1.j r8 = (z1.C0736j) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.f7054d
            if (r3 != 0) goto L12
            r4 = r1
            goto L13
        L12:
            r4 = r2
        L13:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f7054d
            if (r5 != 0) goto L19
            r5 = r1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r4 == r5) goto L21
            if (r3 != 0) goto L1f
        L1e:
            r0 = r1
        L1f:
            r2 = r0
            goto L3a
        L21:
            boolean r3 = r7.f7051a
            boolean r4 = r8.f7051a
            if (r3 == r4) goto L2a
            if (r3 == 0) goto L1e
            goto L1f
        L2a:
            int r0 = r8.f7052b
            int r1 = r7.f7052b
            int r0 = r0 - r1
            if (r0 == 0) goto L32
            goto L1f
        L32:
            int r7 = r7.f7053c
            int r8 = r8.f7053c
            int r7 = r7 - r8
            if (r7 == 0) goto L3a
            r2 = r7
        L3a:
            return r2
        L3b:
            v0.b r7 = (v0.C0617b) r7
            int r7 = r7.f6331b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            v0.b r8 = (v0.C0617b) r8
            int r8 = r8.f6331b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r7 = Z.b.l(r7, r8)
            return r7
        L50:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
            int r7 = r7 - r8
            return r7
        L5e:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.lang.reflect.Field r3 = d1.AbstractC0189K.f4150a
            float r7 = d1.AbstractC0229z.m(r7)
            float r8 = d1.AbstractC0229z.m(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L71
            goto L78
        L71:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L77
            r0 = r1
            goto L78
        L77:
            r0 = r2
        L78:
            return r0
        L79:
            L0.j r7 = (L0.j) r7
            L0.j r8 = (L0.j) r8
            int r7 = r7.f1495b
            int r8 = r8.f1495b
            int r7 = r7 - r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.g.compare(java.lang.Object, java.lang.Object):int");
    }
}
