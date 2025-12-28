package y2;

import g2.InterfaceC0274g;
import g2.InterfaceC0276i;

/* renamed from: y2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682o extends p2.h implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0682o f6809f = new C0682o(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0682o f6810g = new C0682o(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0682o(int i3, int i4) {
        super(i3);
        this.f6811e = i4;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        switch (this.f6811e) {
            case 0:
                return ((InterfaceC0276i) obj).i((InterfaceC0274g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC0276i) obj).i((InterfaceC0274g) obj2);
        }
    }
}
