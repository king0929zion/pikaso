package p;

/* loaded from: classes.dex */
public final class v implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f5916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5917b;

    /* renamed from: c, reason: collision with root package name */
    public final r f5918c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5919d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5920e;

    public v(int i3, int i4, r rVar) {
        this.f5916a = i3;
        this.f5917b = i4;
        this.f5918c = rVar;
        this.f5919d = i3 * 1000000;
        this.f5920e = i4 * 1000000;
    }

    @Override // p.t
    public final float b(long j3, float f3, float f4, float f5) {
        long j4 = j3 - this.f5920e;
        long j5 = this.f5919d;
        if (0 > j5) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j5 + " is less than minimum 0.");
        }
        if (j4 < 0) {
            j4 = 0;
        } else if (j4 > j5) {
            j4 = j5;
        }
        float f6 = this.f5916a == 0 ? 1.0f : j4 / j5;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float a3 = this.f5918c.a(f6 <= 1.0f ? f6 : 1.0f);
        B2.i iVar = AbstractC0530I.f5854a;
        return (f4 * a3) + ((1 - a3) * f3);
    }

    @Override // p.t
    public final float c(long j3, float f3, float f4, float f5) {
        long j4 = j3 - this.f5920e;
        long j5 = this.f5919d;
        if (0 > j5) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j5 + " is less than minimum 0.");
        }
        long j6 = j4 < 0 ? 0L : j4 > j5 ? j5 : j4;
        if (j6 < 0) {
            return 0.0f;
        }
        if (j6 == 0) {
            return f5;
        }
        return (b(j6, f3, f4, f5) - b(j6 - 1000000, f3, f4, f5)) * 1000.0f;
    }

    @Override // p.t
    public final long d(float f3, float f4, float f5) {
        return (this.f5917b + this.f5916a) * 1000000;
    }
}
