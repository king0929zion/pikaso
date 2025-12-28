package v0;

import A.AbstractC0000a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C0.d f6366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6367b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6368c;

    public l(C0.d dVar, int i3, int i4) {
        this.f6366a = dVar;
        this.f6367b = i3;
        this.f6368c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f6366a.equals(lVar.f6366a) && this.f6367b == lVar.f6367b && this.f6368c == lVar.f6368c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6368c) + AbstractC0000a.a(this.f6367b, this.f6366a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f6366a + ", startIndex=" + this.f6367b + ", endIndex=" + this.f6368c + ')';
    }
}
