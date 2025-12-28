package g2;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269b extends p2.h implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0269b f4328f = new C0269b(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0269b f4329g = new C0269b(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4330e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0269b(int i3, int i4) {
        super(i3);
        this.f4330e = i4;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        C0270c c0270c;
        switch (this.f4330e) {
            case 0:
                String str = (String) obj;
                InterfaceC0274g interfaceC0274g = (InterfaceC0274g) obj2;
                p2.g.e(str, "acc");
                p2.g.e(interfaceC0274g, "element");
                if (str.length() == 0) {
                    return interfaceC0274g.toString();
                }
                return str + ", " + interfaceC0274g;
            default:
                InterfaceC0276i interfaceC0276i = (InterfaceC0276i) obj;
                InterfaceC0274g interfaceC0274g2 = (InterfaceC0274g) obj2;
                p2.g.e(interfaceC0276i, "acc");
                p2.g.e(interfaceC0274g2, "element");
                InterfaceC0276i e3 = interfaceC0276i.e(interfaceC0274g2.getKey());
                C0277j c0277j = C0277j.f4334d;
                if (e3 == c0277j) {
                    return interfaceC0274g2;
                }
                C0272e c0272e = C0272e.f4333d;
                InterfaceC0273f interfaceC0273f = (InterfaceC0273f) e3.n(c0272e);
                if (interfaceC0273f == null) {
                    c0270c = new C0270c(interfaceC0274g2, e3);
                } else {
                    InterfaceC0276i e4 = e3.e(c0272e);
                    if (e4 == c0277j) {
                        return new C0270c(interfaceC0273f, interfaceC0274g2);
                    }
                    c0270c = new C0270c(interfaceC0273f, new C0270c(interfaceC0274g2, e4));
                }
                return c0270c;
        }
    }
}
