package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f5270d;

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f5271e;

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f5272f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n0[] f5273g;

    static {
        n0 n0Var = new n0("ContinueTraversal", 0);
        f5270d = n0Var;
        n0 n0Var2 = new n0("SkipSubtreeAndContinueTraversal", 1);
        f5271e = n0Var2;
        n0 n0Var3 = new n0("CancelTraversal", 2);
        f5272f = n0Var3;
        f5273g = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f5273g.clone();
    }
}
