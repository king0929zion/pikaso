package v0;

import A.AbstractC0000a;
import p.AbstractC0537f;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C0616a f6359a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6360b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6361c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6362d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6363e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6364f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6365g;

    public k(C0616a c0616a, int i3, int i4, int i5, int i6, float f3, float f4) {
        this.f6359a = c0616a;
        this.f6360b = i3;
        this.f6361c = i4;
        this.f6362d = i5;
        this.f6363e = i6;
        this.f6364f = f3;
        this.f6365g = f4;
    }

    public final int a(int i3) {
        int i4 = this.f6361c;
        int i5 = this.f6360b;
        return Z.b.k(i3, i5, i4) - i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f6359a.equals(kVar.f6359a) && this.f6360b == kVar.f6360b && this.f6361c == kVar.f6361c && this.f6362d == kVar.f6362d && this.f6363e == kVar.f6363e && Float.compare(this.f6364f, kVar.f6364f) == 0 && Float.compare(this.f6365g, kVar.f6365g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6365g) + AbstractC0537f.a(this.f6364f, AbstractC0000a.a(this.f6363e, AbstractC0000a.a(this.f6362d, AbstractC0000a.a(this.f6361c, AbstractC0000a.a(this.f6360b, this.f6359a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f6359a);
        sb.append(", startIndex=");
        sb.append(this.f6360b);
        sb.append(", endIndex=");
        sb.append(this.f6361c);
        sb.append(", startLineIndex=");
        sb.append(this.f6362d);
        sb.append(", endLineIndex=");
        sb.append(this.f6363e);
        sb.append(", top=");
        sb.append(this.f6364f);
        sb.append(", bottom=");
        return AbstractC0000a.f(sb, this.f6365g, ')');
    }
}
