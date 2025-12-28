package androidx.compose.ui.focus;

import A1.f;
import P.l;
import U.c;
import U.d;
import U.e;
import U.g;
import U.k;
import U.q;
import n.C0401u;
import n0.P;
import o0.C0494n;
import o0.C0496o;
import o0.C0498p;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C0496o f3316a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3317b;

    /* renamed from: c, reason: collision with root package name */
    public final C0498p f3318c;

    /* renamed from: e, reason: collision with root package name */
    public final e f3320e;
    public C0401u h;

    /* renamed from: d, reason: collision with root package name */
    public final q f3319d = new q();

    /* renamed from: f, reason: collision with root package name */
    public final f f3321f = new f();

    /* renamed from: g, reason: collision with root package name */
    public final l f3322g = new FocusPropertiesElement(new k()).c(new P() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // n0.P
        public final P.k d() {
            return a.this.f3319d;
        }

        @Override // n0.P
        public final /* bridge */ /* synthetic */ void e(P.k kVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return a.this.f3319d.hashCode();
        }
    });

    public a(C0494n c0494n, C0496o c0496o, d dVar, C0498p c0498p) {
        this.f3316a = c0496o;
        this.f3317b = dVar;
        this.f3318c = c0498p;
        this.f3320e = new e(c0494n, new d(0, this, a.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 1));
    }

    public final boolean a(int i3, boolean z3, boolean z4) {
        boolean e3;
        int b3;
        f fVar = this.f3321f;
        U.f fVar2 = U.f.f2341g;
        try {
            if (fVar.f215a) {
                f.a(fVar);
            }
            fVar.f215a = true;
            ((F.d) fVar.f217c).b(fVar2);
            q qVar = this.f3319d;
            if (!z3 && ((b3 = AbstractC0537f.b(c.u(qVar, i3))) == 1 || b3 == 2 || b3 == 3)) {
                e3 = false;
                if (e3 && z4) {
                    this.f3317b.c();
                }
                return e3;
            }
            e3 = c.e(qVar, z3, true);
            if (e3) {
                this.f3317b.c();
            }
            return e3;
        } finally {
            f.b(fVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:367:0x00a2, code lost:
    
        r14 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x00ab, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x023b, code lost:
    
        if (r8 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x00ad, code lost:
    
        r4 = r14.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00b3, code lost:
    
        if (r14.f5037e != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00c8, code lost:
    
        if (((r14.f5033a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00cb, code lost:
    
        r4 = r14.f5035c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x00cf, code lost:
    
        if (r4 <= 8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00df, code lost:
    
        if (java.lang.Long.compareUnsigned(r14.f5036d * 32, r4 * 25) > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00e1, code lost:
    
        r14.d(n.AbstractC0377D.b(r14.f5035c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00f4, code lost:
    
        r4 = r14.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x00eb, code lost:
    
        r14.d(n.AbstractC0377D.b(r14.f5035c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x00f8, code lost:
    
        r30 = r4;
        r14.f5036d++;
        r4 = r14.f5037e;
        r5 = r14.f5033a;
        r7 = r30 >> 3;
        r8 = r5[r7];
        r10 = (r30 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0116, code lost:
    
        if (((r8 >> r10) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0118, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x011b, code lost:
    
        r14.f5037e = r4 - r11;
        r5[r7] = ((~(255 << r10)) & r8) | (r12 << r10);
        r4 = r14.f5035c;
        r6 = ((r30 - 7) & r4) + (r4 & 7);
        r4 = r6 >> 3;
        r6 = (r6 & 7) << 3;
        r5[r4] = (r5[r4] & (~(255 << r6))) | (r12 << r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x011a, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01bb, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01bd, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04eb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0368  */
    /* JADX WARN: Type inference failed for: r2v15, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v16, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v40, types: [P.k] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r3v24, types: [P.k] */
    /* JADX WARN: Type inference failed for: r3v25, types: [P.k] */
    /* JADX WARN: Type inference failed for: r3v31, types: [P.k] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [P.k] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [P.k] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [P.k] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.KeyEvent r36, o2.a r37) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.b(android.view.KeyEvent, o2.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00fe, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean c(int r20, V.d r21, o2.c r22) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.a.c(int, V.d, o2.c):java.lang.Boolean");
    }
}
