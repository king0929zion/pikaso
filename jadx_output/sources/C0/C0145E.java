package c0;

import java.util.Iterator;
import java.util.List;
import p.AbstractC0537f;

/* renamed from: c0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145E extends AbstractC0147G implements Iterable, q2.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f3680d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3681e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3682f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3683g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3684i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3685j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3686k;

    /* renamed from: l, reason: collision with root package name */
    public final List f3687l;

    /* renamed from: m, reason: collision with root package name */
    public final List f3688m;

    public C0145E(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, List list2) {
        this.f3680d = str;
        this.f3681e = f3;
        this.f3682f = f4;
        this.f3683g = f5;
        this.h = f6;
        this.f3684i = f7;
        this.f3685j = f8;
        this.f3686k = f9;
        this.f3687l = list;
        this.f3688m = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0145E)) {
            C0145E c0145e = (C0145E) obj;
            return p2.g.a(this.f3680d, c0145e.f3680d) && this.f3681e == c0145e.f3681e && this.f3682f == c0145e.f3682f && this.f3683g == c0145e.f3683g && this.h == c0145e.h && this.f3684i == c0145e.f3684i && this.f3685j == c0145e.f3685j && this.f3686k == c0145e.f3686k && p2.g.a(this.f3687l, c0145e.f3687l) && p2.g.a(this.f3688m, c0145e.f3688m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3688m.hashCode() + ((this.f3687l.hashCode() + AbstractC0537f.a(this.f3686k, AbstractC0537f.a(this.f3685j, AbstractC0537f.a(this.f3684i, AbstractC0537f.a(this.h, AbstractC0537f.a(this.f3683g, AbstractC0537f.a(this.f3682f, AbstractC0537f.a(this.f3681e, this.f3680d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new I.g(this);
    }
}
