package A0;

import A.AbstractC0000a;
import M.i;
import v0.C0612A;
import v0.C0618c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C0618c f202a;

    /* renamed from: b, reason: collision with root package name */
    public final long f203b;

    /* renamed from: c, reason: collision with root package name */
    public final C0612A f204c;

    static {
        int i3 = i.f1523a;
    }

    public e(C0618c c0618c, long j3, C0612A c0612a) {
        C0612A c0612a2;
        this.f202a = c0618c;
        String str = c0618c.f6334d;
        int length = str.length();
        int i3 = C0612A.f6316c;
        int i4 = (int) (j3 >> 32);
        int k3 = Z.b.k(i4, 0, length);
        int i5 = (int) (j3 & 4294967295L);
        int k4 = Z.b.k(i5, 0, length);
        this.f203b = (k3 == i4 && k4 == i5) ? j3 : Z0.d.e(k3, k4);
        if (c0612a != null) {
            int length2 = str.length();
            long j4 = c0612a.f6317a;
            int i6 = (int) (j4 >> 32);
            int k5 = Z.b.k(i6, 0, length2);
            int i7 = (int) (j4 & 4294967295L);
            int k6 = Z.b.k(i7, 0, length2);
            c0612a2 = new C0612A((k5 == i6 && k6 == i7) ? j4 : Z0.d.e(k5, k6));
        } else {
            c0612a2 = null;
        }
        this.f204c = c0612a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j3 = eVar.f203b;
        int i3 = C0612A.f6316c;
        return this.f203b == j3 && p2.g.a(this.f204c, eVar.f204c) && p2.g.a(this.f202a, eVar.f202a);
    }

    public final int hashCode() {
        int hashCode = this.f202a.hashCode() * 31;
        int i3 = C0612A.f6316c;
        int b3 = AbstractC0000a.b(hashCode, 31, this.f203b);
        C0612A c0612a = this.f204c;
        return b3 + (c0612a != null ? Long.hashCode(c0612a.f6317a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f202a) + "', selection=" + ((Object) C0612A.a(this.f203b)) + ", composition=" + this.f204c + ')';
    }
}
