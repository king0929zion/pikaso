package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f4358d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f4359e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f4360f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g[] f4361g;

    static {
        g gVar = new g("Initial", 0);
        f4358d = gVar;
        g gVar2 = new g("Main", 1);
        f4359e = gVar2;
        g gVar3 = new g("Final", 2);
        f4360f = gVar3;
        f4361g = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f4361g.clone();
    }
}
