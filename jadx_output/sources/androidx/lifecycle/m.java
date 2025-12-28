package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final m f3474d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f3475e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f3476f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f3477g;
    public static final m h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ m[] f3478i;

    static {
        m mVar = new m("DESTROYED", 0);
        f3474d = mVar;
        m mVar2 = new m("INITIALIZED", 1);
        f3475e = mVar2;
        m mVar3 = new m("CREATED", 2);
        f3476f = mVar3;
        m mVar4 = new m("STARTED", 3);
        f3477g = mVar4;
        m mVar5 = new m("RESUMED", 4);
        h = mVar5;
        f3478i = new m[]{mVar, mVar2, mVar3, mVar4, mVar5};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f3478i.clone();
    }
}
