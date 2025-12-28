package p2;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final q f5961a;

    static {
        q qVar = null;
        try {
            qVar = (q) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (qVar == null) {
            qVar = new q();
        }
        f5961a = qVar;
    }

    public static d a(Class cls) {
        f5961a.getClass();
        return new d(cls);
    }
}
