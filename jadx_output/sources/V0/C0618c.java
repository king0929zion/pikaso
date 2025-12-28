package v0;

import d2.AbstractC0240k;
import java.util.Arrays;
import java.util.List;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618c implements CharSequence {

    /* renamed from: d, reason: collision with root package name */
    public final String f6334d;

    /* renamed from: e, reason: collision with root package name */
    public final List f6335e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6336f;

    /* renamed from: g, reason: collision with root package name */
    public final List f6337g;

    static {
        B2.i iVar = u.f6426a;
    }

    public C0618c(String str, List list, List list2, List list3) {
        List asList;
        this.f6334d = str;
        this.f6335e = list;
        this.f6336f = list2;
        this.f6337g = list3;
        if (list2 != null) {
            L0.g gVar = new L0.g(3);
            int i3 = 0;
            if (list2.size() <= 1) {
                asList = AbstractC0240k.i0(list2);
            } else {
                Object[] array = list2.toArray(new Object[0]);
                p2.g.e(array, "<this>");
                if (array.length > 1) {
                    Arrays.sort(array, gVar);
                }
                asList = Arrays.asList(array);
                p2.g.d(asList, "asList(...)");
            }
            int size = asList.size();
            int i4 = -1;
            while (i3 < size) {
                C0617b c0617b = (C0617b) asList.get(i3);
                if (c0617b.f6331b < i4) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                int length = this.f6334d.length();
                int i5 = c0617b.f6332c;
                if (i5 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c0617b.f6331b + ", " + i5 + ") is out of boundary").toString());
                }
                i3++;
                i4 = i5;
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f6334d.charAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0618c)) {
            return false;
        }
        C0618c c0618c = (C0618c) obj;
        return p2.g.a(this.f6334d, c0618c.f6334d) && p2.g.a(this.f6335e, c0618c.f6335e) && p2.g.a(this.f6336f, c0618c.f6336f) && p2.g.a(this.f6337g, c0618c.f6337g);
    }

    public final int hashCode() {
        int hashCode = this.f6334d.hashCode() * 31;
        List list = this.f6335e;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f6336f;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f6337g;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6334d.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException(("start (" + i3 + ") should be less or equal to end (" + i4 + ')').toString());
        }
        String str = this.f6334d;
        if (i3 == 0 && i4 == str.length()) {
            return this;
        }
        String substring = str.substring(i3, i4);
        p2.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C0618c(substring, AbstractC0619d.a(this.f6335e, i3, i4), AbstractC0619d.a(this.f6336f, i3, i4), AbstractC0619d.a(this.f6337g, i3, i4));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6334d;
    }
}
