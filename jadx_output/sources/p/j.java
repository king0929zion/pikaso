package P;

/* loaded from: classes.dex */
public interface j extends l {
    @Override // P.l
    default boolean a(o2.c cVar) {
        return ((Boolean) cVar.i(this)).booleanValue();
    }

    @Override // P.l
    default Object b(Object obj, o2.e eVar) {
        return eVar.h(obj, this);
    }
}
