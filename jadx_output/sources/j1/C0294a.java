package j1;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294a {

    /* renamed from: a, reason: collision with root package name */
    public int f4598a;

    /* renamed from: b, reason: collision with root package name */
    public int f4599b;

    /* renamed from: c, reason: collision with root package name */
    public float f4600c;

    /* renamed from: d, reason: collision with root package name */
    public float f4601d;

    /* renamed from: e, reason: collision with root package name */
    public long f4602e;

    /* renamed from: f, reason: collision with root package name */
    public long f4603f;

    /* renamed from: g, reason: collision with root package name */
    public long f4604g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public int f4605i;

    public final float a(long j3) {
        if (j3 < this.f4602e) {
            return 0.0f;
        }
        long j4 = this.f4604g;
        if (j4 < 0 || j3 < j4) {
            return g.b((j3 - r0) / this.f4598a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.h;
        return (g.b((j3 - j4) / this.f4605i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
