package L;

import D.AbstractC0047k0;
import D.InterfaceC0045j0;
import D.O0;
import I.n;

/* loaded from: classes.dex */
public final class e extends I.c implements InterfaceC0045j0 {

    /* renamed from: g, reason: collision with root package name */
    public static final e f1452g = new e(n.f1380e, 0);

    @Override // I.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0047k0) {
            return super.containsKey((AbstractC0047k0) obj);
        }
        return false;
    }

    @Override // d2.AbstractC0234e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof O0) {
            return super.containsValue((O0) obj);
        }
        return false;
    }

    @Override // I.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0047k0) {
            return (O0) super.get((AbstractC0047k0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0047k0) ? obj2 : (O0) super.getOrDefault((AbstractC0047k0) obj, (O0) obj2);
    }
}
