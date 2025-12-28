package F0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f1178c = new e(17, d.f1176b);

    /* renamed from: a, reason: collision with root package name */
    public final float f1179a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1180b;

    public e(int i3, float f3) {
        this.f1179a = f3;
        this.f1180b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        float f3 = eVar.f1179a;
        float f4 = d.f1175a;
        return Float.compare(this.f1179a, f3) == 0 && this.f1180b == eVar.f1180b;
    }

    public final int hashCode() {
        float f3 = d.f1175a;
        return Integer.hashCode(this.f1180b) + (Float.hashCode(this.f1179a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f3 = this.f1179a;
        if (f3 == 0.0f) {
            float f4 = d.f1175a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f3 == d.f1175a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f3 == d.f1176b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f3 == d.f1177c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i3 = this.f1180b;
        sb.append((Object) (i3 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i3 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i3 == 17 ? "LineHeightStyle.Trim.Both" : i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
