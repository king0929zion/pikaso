package F0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f1193c = new m(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final m f1194d = new m(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f1195a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1196b;

    public m(int i3, boolean z3) {
        this.f1195a = i3;
        this.f1196b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1195a == mVar.f1195a && this.f1196b == mVar.f1196b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1196b) + (Integer.hashCode(this.f1195a) * 31);
    }

    public final String toString() {
        return equals(f1193c) ? "TextMotion.Static" : equals(f1194d) ? "TextMotion.Animated" : "Invalid";
    }
}
