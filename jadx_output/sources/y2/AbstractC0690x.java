package y2;

/* renamed from: y2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0690x {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0691y f6830a;

    static {
        String str;
        z2.c cVar;
        int i3 = D2.x.f1089a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            F2.d dVar = B.f6749a;
            z2.c cVar2 = D2.o.f1078a;
            z2.c cVar3 = cVar2.f7092i;
            cVar = !(cVar2 instanceof InterfaceC0691y) ? RunnableC0689w.f6828m : cVar2;
        } else {
            cVar = RunnableC0689w.f6828m;
        }
        f6830a = cVar;
    }
}
