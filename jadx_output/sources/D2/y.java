package D2;

import g2.InterfaceC0274g;
import y2.j0;

/* loaded from: classes.dex */
public final class y extends p2.h implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final y f1090f = new y(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final y f1091g = new y(2, 1);
    public static final y h = new y(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i3, int i4) {
        super(i3);
        this.f1092e = i4;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        switch (this.f1092e) {
            case 0:
                InterfaceC0274g interfaceC0274g = (InterfaceC0274g) obj2;
                if (!(interfaceC0274g instanceof j0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC0274g : Integer.valueOf(intValue + 1);
            case 1:
                j0 j0Var = (j0) obj;
                InterfaceC0274g interfaceC0274g2 = (InterfaceC0274g) obj2;
                if (j0Var != null) {
                    return j0Var;
                }
                if (interfaceC0274g2 instanceof j0) {
                    return (j0) interfaceC0274g2;
                }
                return null;
            default:
                return (A) obj;
        }
    }
}
