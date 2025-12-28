package I;

import d2.AbstractC0234e;

/* loaded from: classes.dex */
public class c extends AbstractC0234e {

    /* renamed from: f, reason: collision with root package name */
    public static final c f1360f = new c(n.f1380e, 0);

    /* renamed from: d, reason: collision with root package name */
    public final n f1361d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1362e;

    public c(n nVar, int i3) {
        this.f1361d = nVar;
        this.f1362e = i3;
    }

    public final c a(Object obj, J.a aVar) {
        m u3 = this.f1361d.u(obj != null ? obj.hashCode() : 0, obj, aVar, 0);
        return u3 == null ? this : new c((n) u3.f1379f, this.f1362e + u3.f1378e);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f1361d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f1361d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
