package P;

/* loaded from: classes.dex */
public interface l {
    boolean a(o2.c cVar);

    Object b(Object obj, o2.e eVar);

    default l c(l lVar) {
        return lVar == i.f2087a ? this : new f(this, lVar);
    }
}
