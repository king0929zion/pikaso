package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f1258d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f1259e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f1260f;

    static {
        f fVar = new f("Ltr", 0);
        f1258d = fVar;
        f fVar2 = new f("Rtl", 1);
        f1259e = fVar2;
        f1260f = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f1260f.clone();
    }
}
