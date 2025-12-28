package U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final p f2361d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f2362e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f2363f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ p[] f2364g;

    static {
        p pVar = new p("Active", 0);
        f2361d = pVar;
        p pVar2 = new p("ActiveParent", 1);
        f2362e = pVar2;
        p pVar3 = new p("Captured", 2);
        p pVar4 = new p("Inactive", 3);
        f2363f = pVar4;
        f2364g = new p[]{pVar, pVar2, pVar3, pVar4};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f2364g.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                throw new B1.c();
            }
        }
        return false;
    }
}
