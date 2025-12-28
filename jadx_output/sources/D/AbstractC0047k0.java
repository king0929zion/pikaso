package D;

/* renamed from: D.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0047k0 {

    /* renamed from: a, reason: collision with root package name */
    public final T f780a;

    public AbstractC0047k0(o2.a aVar) {
        this.f780a = new T(aVar);
    }

    public abstract C0049l0 a(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final O0 b(C0049l0 c0049l0, O0 o02) {
        O0 n02;
        I i3 = null;
        if (o02 instanceof I) {
            if (c0049l0.f785d) {
                i3 = (I) o02;
                i3.f693a.setValue(c0049l0.a());
            }
        } else if ((o02 instanceof N0) && ((c0049l0.f783b || c0049l0.f786e != null) && !c0049l0.f785d)) {
            N0 n03 = (N0) o02;
            if (p2.g.a(c0049l0.a(), n03.f713a)) {
                i3 = n03;
            }
        }
        if (i3 != null) {
            return i3;
        }
        if (c0049l0.f785d) {
            H0 h02 = c0049l0.f784c;
            if (h02 == null) {
                h02 = U.f731i;
            }
            int i4 = AbstractC0028b.f737b;
            n02 = new I(new C0037f0(c0049l0.f786e, h02));
        } else {
            n02 = new N0(c0049l0.a());
        }
        return n02;
    }
}
