package o1;

import java.util.HashMap;
import java.util.LinkedHashSet;
import p1.C0545a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5784a;

    /* renamed from: b, reason: collision with root package name */
    public int f5785b;

    /* renamed from: c, reason: collision with root package name */
    public int f5786c;

    /* renamed from: d, reason: collision with root package name */
    public int f5787d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5788e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5789f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5790g;

    public p() {
        this.f5784a = 1;
        this.f5788e = new X1.e(1);
        this.f5789f = new HashMap(0, 0.75f);
        this.f5790g = new LinkedHashSet();
    }

    public Object a(Object obj) {
        synchronized (((X1.e) this.f5788e)) {
            Object obj2 = ((HashMap) this.f5789f).get(obj);
            if (obj2 == null) {
                this.f5787d++;
                return null;
            }
            ((LinkedHashSet) this.f5790g).remove(obj);
            ((LinkedHashSet) this.f5790g).add(obj);
            this.f5786c++;
            return obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0104, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.p.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public void c() {
        this.f5785b = 1;
        this.f5789f = (s) this.f5788e;
        this.f5787d = 0;
    }

    public boolean d() {
        C0545a c3 = ((s) this.f5789f).f5803b.c();
        int a3 = c3.a(6);
        return !(a3 == 0 || c3.f5940b.get(a3 + c3.f5939a) == 0) || this.f5786c == 65039;
    }

    public int e() {
        int i3;
        synchronized (((X1.e) this.f5788e)) {
            i3 = this.f5785b;
        }
        return i3;
    }

    public String toString() {
        String str;
        switch (this.f5784a) {
            case 1:
                synchronized (((X1.e) this.f5788e)) {
                    try {
                        int i3 = this.f5786c;
                        int i4 = this.f5787d + i3;
                        str = "LruCache[maxSize=16,hits=" + this.f5786c + ",misses=" + this.f5787d + ",hitRate=" + (i4 != 0 ? (i3 * 100) / i4 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public p(s sVar) {
        this.f5784a = 0;
        this.f5785b = 1;
        this.f5788e = sVar;
        this.f5789f = sVar;
    }
}
