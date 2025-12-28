package E;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f1143a;

    /* renamed from: b, reason: collision with root package name */
    public int f1144b;

    /* renamed from: c, reason: collision with root package name */
    public int f1145c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1146d;

    public z(A a3) {
        this.f1146d = a3;
    }

    public int a(int i3) {
        return ((A) this.f1146d).f1097d[this.f1144b + i3];
    }

    public Object b(int i3) {
        return ((A) this.f1146d).f1099f[this.f1145c + i3];
    }

    public z(int i3, Class cls, int i4, int i5) {
        this.f1143a = i3;
        this.f1146d = cls;
        this.f1145c = i4;
        this.f1144b = i5;
    }
}
