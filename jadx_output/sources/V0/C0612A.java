package v0;

/* renamed from: v0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612A {

    /* renamed from: b, reason: collision with root package name */
    public static final long f6315b = Z0.d.e(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6316c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f6317a;

    public static String a(long j3) {
        return "TextRange(" + ((int) (j3 >> 32)) + ", " + ((int) (j3 & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0612A) {
            return this.f6317a == ((C0612A) obj).f6317a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6317a);
    }

    public final String toString() {
        return a(this.f6317a);
    }
}
