package c0;

import D.C0032d;
import D.C0037f0;
import W.C0089l;

/* renamed from: c0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144D extends AbstractC0142B {

    /* renamed from: b, reason: collision with root package name */
    public final C0152c f3669b;

    /* renamed from: c, reason: collision with root package name */
    public String f3670c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3671d;

    /* renamed from: e, reason: collision with root package name */
    public final C0150a f3672e;

    /* renamed from: f, reason: collision with root package name */
    public p2.h f3673f;

    /* renamed from: g, reason: collision with root package name */
    public final C0037f0 f3674g;
    public C0089l h;

    /* renamed from: i, reason: collision with root package name */
    public final C0037f0 f3675i;

    /* renamed from: j, reason: collision with root package name */
    public long f3676j;

    /* renamed from: k, reason: collision with root package name */
    public float f3677k;

    /* renamed from: l, reason: collision with root package name */
    public float f3678l;

    /* renamed from: m, reason: collision with root package name */
    public final C0143C f3679m;

    public C0144D(C0152c c0152c) {
        this.f3669b = c0152c;
        c0152c.f3722i = new C0143C(this, 0);
        this.f3670c = "";
        this.f3671d = true;
        this.f3672e = new C0150a();
        this.f3673f = C0155f.f3754g;
        this.f3674g = C0032d.A(null);
        this.f3675i = C0032d.A(new V.f(0L));
        this.f3676j = 9205357640488583168L;
        this.f3677k = 1.0f;
        this.f3678l = 1.0f;
        this.f3679m = new C0143C(this, 1);
    }

    @Override // c0.AbstractC0142B
    public final void a(Y.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (W.D.l(r6, 3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (W.D.l(r6, 3) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0043, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0030, code lost:
    
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Y.d r30, float r31, W.C0089l r32) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0144D.e(Y.d, float, W.l):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f3670c);
        sb.append("\n\tviewportWidth: ");
        C0037f0 c0037f0 = this.f3675i;
        sb.append(V.f.d(((V.f) c0037f0.getValue()).f2457a));
        sb.append("\n\tviewportHeight: ");
        sb.append(V.f.b(((V.f) c0037f0.getValue()).f2457a));
        sb.append("\n");
        String sb2 = sb.toString();
        p2.g.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
