package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0604a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0604a f6295d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0604a f6296e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0604a[] f6297f;

    static {
        EnumC0604a enumC0604a = new EnumC0604a("On", 0);
        f6295d = enumC0604a;
        EnumC0604a enumC0604a2 = new EnumC0604a("Off", 1);
        f6296e = enumC0604a2;
        f6297f = new EnumC0604a[]{enumC0604a, enumC0604a2, new EnumC0604a("Indeterminate", 2)};
    }

    public static EnumC0604a valueOf(String str) {
        return (EnumC0604a) Enum.valueOf(EnumC0604a.class, str);
    }

    public static EnumC0604a[] values() {
        return (EnumC0604a[]) f6297f.clone();
    }
}
