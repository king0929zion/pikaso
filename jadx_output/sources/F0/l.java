package F0;

import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f1190c = new l(AbstractC0090a.L(0), AbstractC0090a.L(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f1191a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1192b;

    public l(long j3, long j4) {
        this.f1191a = j3;
        this.f1192b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return G0.h.a(this.f1191a, lVar.f1191a) && G0.h.a(this.f1192b, lVar.f1192b);
    }

    public final int hashCode() {
        G0.i[] iVarArr = G0.h.f1262b;
        return Long.hashCode(this.f1192b) + (Long.hashCode(this.f1191a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) G0.h.d(this.f1191a)) + ", restLine=" + ((Object) G0.h.d(this.f1192b)) + ')';
    }
}
