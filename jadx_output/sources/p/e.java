package P;

/* loaded from: classes.dex */
public final class e extends p2.h implements o2.e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f2082e = new e(2);

    @Override // o2.e
    public final Object h(Object obj, Object obj2) {
        String str = (String) obj;
        j jVar = (j) obj2;
        if (str.length() == 0) {
            return jVar.toString();
        }
        return str + ", " + jVar;
    }
}
