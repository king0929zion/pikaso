package y2;

/* loaded from: classes.dex */
public final class F extends G {

    /* renamed from: f, reason: collision with root package name */
    public final C0673f f6754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ I f6755g;

    public F(I i3, long j3, C0673f c0673f) {
        this.f6755g = i3;
        this.f6756d = j3;
        this.f6757e = -1;
        this.f6754f = c0673f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6754f.E(this.f6755g);
    }

    @Override // y2.G
    public final String toString() {
        return super.toString() + this.f6754f;
    }
}
