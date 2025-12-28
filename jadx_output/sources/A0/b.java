package A0;

import A.AbstractC0000a;
import a.AbstractC0090a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f191g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f193b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f194c;

    /* renamed from: d, reason: collision with root package name */
    public final int f195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f196e;

    /* renamed from: f, reason: collision with root package name */
    public final B0.c f197f;

    static {
        new b();
    }

    public b() {
        B0.c cVar = B0.c.f275f;
        this.f192a = false;
        this.f193b = 0;
        this.f194c = true;
        this.f195d = 1;
        this.f196e = 1;
        this.f197f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f192a == bVar.f192a && AbstractC0090a.u(this.f193b, bVar.f193b) && this.f194c == bVar.f194c && r2.a.s(this.f195d, bVar.f195d) && a.a(this.f196e, bVar.f196e) && p2.g.a(null, null) && p2.g.a(this.f197f, bVar.f197f);
    }

    public final int hashCode() {
        return this.f197f.f276d.hashCode() + AbstractC0000a.a(this.f196e, AbstractC0000a.a(this.f195d, (Boolean.hashCode(this.f194c) + AbstractC0000a.a(this.f193b, Boolean.hashCode(this.f192a) * 31, 31)) * 31, 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f192a);
        sb.append(", capitalization=");
        int i3 = this.f193b;
        String str = "None";
        sb.append((Object) (AbstractC0090a.u(i3, -1) ? "Unspecified" : AbstractC0090a.u(i3, 0) ? "None" : AbstractC0090a.u(i3, 1) ? "Characters" : AbstractC0090a.u(i3, 2) ? "Words" : AbstractC0090a.u(i3, 3) ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f194c);
        sb.append(", keyboardType=");
        int i4 = this.f195d;
        sb.append((Object) (r2.a.s(i4, 0) ? "Unspecified" : r2.a.s(i4, 1) ? "Text" : r2.a.s(i4, 2) ? "Ascii" : r2.a.s(i4, 3) ? "Number" : r2.a.s(i4, 4) ? "Phone" : r2.a.s(i4, 5) ? "Uri" : r2.a.s(i4, 6) ? "Email" : r2.a.s(i4, 7) ? "Password" : r2.a.s(i4, 8) ? "NumberPassword" : r2.a.s(i4, 9) ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i5 = this.f196e;
        if (a.a(i5, -1)) {
            str = "Unspecified";
        } else if (!a.a(i5, 0)) {
            str = a.a(i5, 1) ? "Default" : a.a(i5, 2) ? "Go" : a.a(i5, 3) ? "Search" : a.a(i5, 4) ? "Send" : a.a(i5, 5) ? "Previous" : a.a(i5, 6) ? "Next" : a.a(i5, 7) ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f197f);
        sb.append(')');
        return sb.toString();
    }
}
