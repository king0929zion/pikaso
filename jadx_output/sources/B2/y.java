package B2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final y f368d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f369e;

    /* renamed from: f, reason: collision with root package name */
    public static final y f370f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y[] f371g;

    static {
        y yVar = new y("START", 0);
        f368d = yVar;
        y yVar2 = new y("STOP", 1);
        f369e = yVar2;
        y yVar3 = new y("STOP_AND_RESET_REPLAY_CACHE", 2);
        f370f = yVar3;
        f371g = new y[]{yVar, yVar2, yVar3};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f371g.clone();
    }
}
