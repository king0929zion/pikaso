package N;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public l f1736a;

    /* renamed from: b, reason: collision with root package name */
    public int f1737b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1738c;

    /* renamed from: d, reason: collision with root package name */
    public int f1739d;

    public h(int i3, l lVar) {
        int i4;
        int numberOfTrailingZeros;
        this.f1736a = lVar;
        this.f1737b = i3;
        if (i3 != 0) {
            l e3 = e();
            B0.a aVar = o.f1755a;
            int[] iArr = e3.f1749g;
            if (iArr != null) {
                i3 = iArr[0];
            } else {
                long j3 = e3.f1747e;
                int i5 = e3.f1748f;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = e3.f1746d;
                    if (j4 != 0) {
                        i5 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                i3 = numberOfTrailingZeros + i5;
            }
            synchronized (o.f1756b) {
                i4 = o.f1759e.a(i3);
            }
        } else {
            i4 = -1;
        }
        this.f1739d = i4;
    }

    public static void p(h hVar) {
        o.f1755a.E(hVar);
    }

    public final void a() {
        synchronized (o.f1756b) {
            b();
            o();
        }
    }

    public void b() {
        o.f1757c = o.f1757c.b(d());
    }

    public abstract void c();

    public int d() {
        return this.f1737b;
    }

    public l e() {
        return this.f1736a;
    }

    public abstract o2.c f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract o2.c i();

    public final h j() {
        B0.a aVar = o.f1755a;
        h hVar = (h) aVar.i();
        aVar.E(this);
        return hVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(y yVar);

    public void o() {
        int i3 = this.f1739d;
        if (i3 >= 0) {
            o.u(i3);
            this.f1739d = -1;
        }
    }

    public void q(int i3) {
        this.f1737b = i3;
    }

    public void r(l lVar) {
        this.f1736a = lVar;
    }

    public void s(int i3) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract h t(o2.c cVar);
}
