package t0;

import c2.C0174m;
import c2.InterfaceC0164c;
import d2.AbstractC0240k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends p2.h implements o2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final m f6245f = new m(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final m f6246g = new m(2, 1);
    public static final m h = new m(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final m f6247i = new m(2, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final m f6248j = new m(2, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final m f6249k = new m(2, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final m f6250l = new m(2, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final m f6251m = new m(2, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final m f6252n = new m(2, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final m f6253o = new m(2, 9);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i3, int i4) {
        super(i3);
        this.f6254e = i4;
    }

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        String str;
        InterfaceC0164c interfaceC0164c;
        switch (this.f6254e) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList j02 = AbstractC0240k.j0(list);
                j02.addAll(list2);
                return j02;
            case 1:
                return (C0174m) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 3:
                e eVar = (e) obj;
                int i3 = ((e) obj2).f6205a;
                return eVar;
            case 4:
                return (String) obj;
            case 5:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList j03 = AbstractC0240k.j0(list3);
                j03.addAll(list4);
                return j03;
            case 6:
                Float f3 = (Float) obj;
                ((Number) obj2).floatValue();
                return f3;
            case 7:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 8:
                C0599a c0599a = (C0599a) obj;
                C0599a c0599a2 = (C0599a) obj2;
                if (c0599a == null || (str = c0599a.f6198a) == null) {
                    str = c0599a2.f6198a;
                }
                if (c0599a == null || (interfaceC0164c = c0599a.f6199b) == null) {
                    interfaceC0164c = c0599a2.f6199b;
                }
                return new C0599a(str, interfaceC0164c);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
