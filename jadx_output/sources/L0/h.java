package L0;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public j f1489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f1490e;

    public h(i iVar) {
        this.f1490e = iVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1489d.f1495b - ((j) obj).f1495b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f1489d != null) {
            for (int i3 = 0; i3 < 9; i3++) {
                str = str + this.f1489d.h[i3] + " ";
            }
        }
        return str + "] " + this.f1489d;
    }
}
