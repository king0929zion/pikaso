package k;

/* renamed from: k.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4892a;

    /* renamed from: b, reason: collision with root package name */
    public int f4893b;

    /* renamed from: c, reason: collision with root package name */
    public int f4894c;

    /* renamed from: d, reason: collision with root package name */
    public int f4895d;

    /* renamed from: e, reason: collision with root package name */
    public int f4896e;

    /* renamed from: f, reason: collision with root package name */
    public int f4897f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4898g;
    public boolean h;

    public final void a(int i3, int i4) {
        this.f4894c = i3;
        this.f4895d = i4;
        this.h = true;
        if (this.f4898g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f4892a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f4893b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f4892a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f4893b = i4;
        }
    }
}
