package z1;

/* renamed from: z1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7063a;

    /* renamed from: b, reason: collision with root package name */
    public int f7064b;

    /* renamed from: c, reason: collision with root package name */
    public int f7065c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7066d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7067e;

    public C0739m(int i3) {
        this.f7063a = i3;
        switch (i3) {
            case 1:
                break;
            default:
                this.f7064b = -1;
                this.f7065c = Integer.MIN_VALUE;
                this.f7066d = false;
                this.f7067e = false;
                break;
        }
    }

    public String toString() {
        switch (this.f7063a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f7064b + ", mCoordinate=" + this.f7065c + ", mLayoutFromEnd=" + this.f7066d + ", mValid=" + this.f7067e + '}';
            default:
                return super.toString();
        }
    }
}
