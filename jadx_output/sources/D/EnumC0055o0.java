package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0055o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0055o0 f839d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0055o0 f840e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0055o0 f841f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0055o0 f842g;
    public static final EnumC0055o0 h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0055o0 f843i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0055o0[] f844j;

    static {
        EnumC0055o0 enumC0055o0 = new EnumC0055o0("ShutDown", 0);
        f839d = enumC0055o0;
        EnumC0055o0 enumC0055o02 = new EnumC0055o0("ShuttingDown", 1);
        f840e = enumC0055o02;
        EnumC0055o0 enumC0055o03 = new EnumC0055o0("Inactive", 2);
        f841f = enumC0055o03;
        EnumC0055o0 enumC0055o04 = new EnumC0055o0("InactivePendingWork", 3);
        f842g = enumC0055o04;
        EnumC0055o0 enumC0055o05 = new EnumC0055o0("Idle", 4);
        h = enumC0055o05;
        EnumC0055o0 enumC0055o06 = new EnumC0055o0("PendingWork", 5);
        f843i = enumC0055o06;
        f844j = new EnumC0055o0[]{enumC0055o0, enumC0055o02, enumC0055o03, enumC0055o04, enumC0055o05, enumC0055o06};
    }

    public static EnumC0055o0 valueOf(String str) {
        return (EnumC0055o0) Enum.valueOf(EnumC0055o0.class, str);
    }

    public static EnumC0055o0[] values() {
        return (EnumC0055o0[]) f844j.clone();
    }
}
