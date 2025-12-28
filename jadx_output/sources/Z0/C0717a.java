package z0;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final int f6918a;

    public C0717a(int i3) {
        this.f6918a = i3;
    }

    @Override // z0.q
    public final l a(l lVar) {
        int i3 = this.f6918a;
        return (i3 == 0 || i3 == Integer.MAX_VALUE) ? lVar : new l(Z.b.k(lVar.f6931d + i3, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0717a) && this.f6918a == ((C0717a) obj).f6918a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6918a);
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f6918a + ')';
    }
}
