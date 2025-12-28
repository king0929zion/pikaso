package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0163b {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0163b f3830d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0163b[] f3831e;

    static {
        EnumC0163b enumC0163b = new EnumC0163b("WARNING", 0);
        f3830d = enumC0163b;
        f3831e = new EnumC0163b[]{enumC0163b, new EnumC0163b("ERROR", 1), new EnumC0163b("HIDDEN", 2)};
    }

    public static EnumC0163b valueOf(String str) {
        return (EnumC0163b) Enum.valueOf(EnumC0163b.class, str);
    }

    public static EnumC0163b[] values() {
        return (EnumC0163b[]) f3831e.clone();
    }
}
