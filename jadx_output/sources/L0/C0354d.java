package l0;

/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4919a = 0;

    public final long a(long j3, long j4) {
        switch (this.f4919a) {
            case 0:
                float min = Math.min(V.f.d(j4) / V.f.d(j3), V.f.b(j4) / V.f.b(j3));
                return Z0.d.c(min, min);
            default:
                if (V.f.d(j3) <= V.f.d(j4) && V.f.b(j3) <= V.f.b(j4)) {
                    return Z0.d.c(1.0f, 1.0f);
                }
                float min2 = Math.min(V.f.d(j4) / V.f.d(j3), V.f.b(j4) / V.f.b(j3));
                return Z0.d.c(min2, min2);
        }
    }
}
