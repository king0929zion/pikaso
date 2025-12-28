package D;

import g2.InterfaceC0275h;

/* loaded from: classes.dex */
public final class U implements InterfaceC0275h, H0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ U f728e = new U(0);

    /* renamed from: f, reason: collision with root package name */
    public static final U f729f = new U(1);

    /* renamed from: g, reason: collision with root package name */
    public static final U f730g = new U(2);
    public static final U h = new U(3);

    /* renamed from: i, reason: collision with root package name */
    public static final U f731i = new U(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f732d;

    public /* synthetic */ U(int i3) {
        this.f732d = i3;
    }

    public static final void b(U u3) {
        B2.G g3;
        Object obj;
        J.b bVar;
        B2.G g4 = v0.f905v;
        do {
            g3 = v0.f905v;
            obj = (G.b) g3.getValue();
            bVar = (J.b) obj;
            I.c cVar = bVar.f1406f;
            J.a aVar = (J.a) cVar.get(u3);
            if (aVar != null) {
                int hashCode = u3 != null ? u3.hashCode() : 0;
                I.n nVar = cVar.f1361d;
                I.n v3 = nVar.v(hashCode, u3, 0);
                if (nVar != v3) {
                    cVar = v3 == null ? I.c.f1360f : new I.c(v3, cVar.f1362e - 1);
                }
                K.b bVar2 = K.b.f1435a;
                Object obj2 = aVar.f1401a;
                boolean z3 = obj2 != bVar2;
                Object obj3 = aVar.f1402b;
                if (z3) {
                    Object obj4 = cVar.get(obj2);
                    p2.g.b(obj4);
                    cVar = cVar.a(obj2, new J.a(((J.a) obj4).f1401a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = cVar.get(obj3);
                    p2.g.b(obj5);
                    cVar = cVar.a(obj3, new J.a(obj2, ((J.a) obj5).f1402b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f1404d : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f1405e;
                }
                bVar = new J.b(obj6, obj2, cVar);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = C2.c.f586b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!g3.g(obj, bVar));
    }

    @Override // D.H0
    public boolean a(Object obj, Object obj2) {
        switch (this.f732d) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return p2.g.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f732d) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
