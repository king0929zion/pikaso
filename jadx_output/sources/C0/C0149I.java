package c0;

import A.AbstractC0000a;
import java.util.List;
import p.AbstractC0537f;

/* renamed from: c0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149I extends AbstractC0147G {

    /* renamed from: d, reason: collision with root package name */
    public final String f3696d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3697e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3698f;

    /* renamed from: g, reason: collision with root package name */
    public final W.D f3699g;
    public final float h;

    /* renamed from: i, reason: collision with root package name */
    public final W.D f3700i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3701j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3702k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3703l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3704m;

    /* renamed from: n, reason: collision with root package name */
    public final float f3705n;

    /* renamed from: o, reason: collision with root package name */
    public final float f3706o;

    /* renamed from: p, reason: collision with root package name */
    public final float f3707p;

    /* renamed from: q, reason: collision with root package name */
    public final float f3708q;

    public C0149I(String str, List list, int i3, W.D d3, float f3, W.D d4, float f4, float f5, int i4, int i5, float f6, float f7, float f8, float f9) {
        this.f3696d = str;
        this.f3697e = list;
        this.f3698f = i3;
        this.f3699g = d3;
        this.h = f3;
        this.f3700i = d4;
        this.f3701j = f4;
        this.f3702k = f5;
        this.f3703l = i4;
        this.f3704m = i5;
        this.f3705n = f6;
        this.f3706o = f7;
        this.f3707p = f8;
        this.f3708q = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0149I.class == obj.getClass()) {
            C0149I c0149i = (C0149I) obj;
            return this.f3696d.equals(c0149i.f3696d) && p2.g.a(this.f3699g, c0149i.f3699g) && this.h == c0149i.h && p2.g.a(this.f3700i, c0149i.f3700i) && this.f3701j == c0149i.f3701j && this.f3702k == c0149i.f3702k && W.D.p(this.f3703l, c0149i.f3703l) && W.D.q(this.f3704m, c0149i.f3704m) && this.f3705n == c0149i.f3705n && this.f3706o == c0149i.f3706o && this.f3707p == c0149i.f3707p && this.f3708q == c0149i.f3708q && this.f3698f == c0149i.f3698f && p2.g.a(this.f3697e, c0149i.f3697e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3697e.hashCode() + (this.f3696d.hashCode() * 31)) * 31;
        W.D d3 = this.f3699g;
        int a3 = AbstractC0537f.a(this.h, (hashCode + (d3 != null ? d3.hashCode() : 0)) * 31, 31);
        W.D d4 = this.f3700i;
        return Integer.hashCode(this.f3698f) + AbstractC0537f.a(this.f3708q, AbstractC0537f.a(this.f3707p, AbstractC0537f.a(this.f3706o, AbstractC0537f.a(this.f3705n, AbstractC0000a.a(this.f3704m, AbstractC0000a.a(this.f3703l, AbstractC0537f.a(this.f3702k, AbstractC0537f.a(this.f3701j, (a3 + (d4 != null ? d4.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
